package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NegativeKeyword extends StObject {
  
  /**
    * Required. Immutable. The negatively targeted keyword, for example `car insurance`. Must be UTF-8 encoded with a maximum size of 255 bytes. Maximum number of characters is 80.
    * Maximum number of words is 10. Valid characters are restricted to ASCII characters only. The only URL-escaping permitted is for representing whitespace between words. Leading or
    * trailing whitespace is ignored.
    */
  var keywordValue: js.UndefOr[String] = js.undefined
  
  /** Output only. The resource name of the negative keyword. */
  var name: js.UndefOr[String] = js.undefined
}
object NegativeKeyword {
  
  @scala.inline
  def apply(): NegativeKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NegativeKeyword]
  }
  
  @scala.inline
  implicit class NegativeKeywordMutableBuilder[Self <: NegativeKeyword] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeywordValue(value: String): Self = StObject.set(x, "keywordValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordValueUndefined: Self = StObject.set(x, "keywordValue", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
