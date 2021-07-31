package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringMatcher extends StObject {
  
  /** The input string must match exactly the string specified here. Examples: * *abc* only matches the value *abc*. */
  var exact: js.UndefOr[String] = js.undefined
  
  /**
    * If true, indicates the exact/prefix/suffix matching should be case insensitive. This has no effect for the safe_regex match. For example, the matcher *data* will match both input
    * string *Data* and *data* if set to true.
    */
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
  
  /** The input string must have the prefix specified here. Note: empty prefix is not allowed, please use regex instead. Examples: * *abc* matches the value *abc.xyz* */
  var prefix: js.UndefOr[String] = js.undefined
  
  /**
    * The input string must match the regular expression specified here. The regex grammar is defined `here `_. Examples: * The regex ``\d{3}`` matches the value *123* * The regex
    * ``\d{3}`` does not match the value *1234* * The regex ``\d{3}`` does not match the value *123.456* .. attention:: This field has been deprecated in favor of `safe_regex` as it is
    * not safe for use with untrusted input in all cases.
    */
  var regex: js.UndefOr[String] = js.undefined
  
  /** The input string must match the regular expression specified here. */
  var safeRegex: js.UndefOr[RegexMatcher] = js.undefined
  
  /** The input string must have the suffix specified here. Note: empty prefix is not allowed, please use regex instead. Examples: * *abc* matches the value *xyz.abc* */
  var suffix: js.UndefOr[String] = js.undefined
}
object StringMatcher {
  
  @scala.inline
  def apply(): StringMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringMatcher]
  }
  
  @scala.inline
  implicit class StringMatcherMutableBuilder[Self <: StringMatcher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExact(value: String): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    @scala.inline
    def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setRegex(value: String): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    
    @scala.inline
    def setSafeRegex(value: RegexMatcher): Self = StObject.set(x, "safeRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafeRegexUndefined: Self = StObject.set(x, "safeRegex", js.undefined)
    
    @scala.inline
    def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
  }
}
