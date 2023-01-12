package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contains extends StObject {
  
  /**
    * An infix that must be contained in any valid value
    */
  var contains: js.UndefOr[String] = js.undefined
  
  /**
    * A suffix that any valid value must end with
    */
  var endsWith: js.UndefOr[String] = js.undefined
  
  /**
    * A suffix that any valid value must end with, ignoring case
    */
  var endsWithIgnoreCase: js.UndefOr[String] = js.undefined
  
  /**
    * The only value that is allowed
    */
  @JSName("equals")
  var equals_FContains: js.UndefOr[String] = js.undefined
  
  /**
    * The maximal allowed length of the string; unlimited if not defined
    */
  var maxLength: js.UndefOr[int] = js.undefined
  
  /**
    * The minimal allowed length of the string
    */
  var minLength: js.UndefOr[int] = js.undefined
  
  /**
    * A regular expression, or a string defining a regular expression, that the value must match
    */
  var search: js.UndefOr[js.RegExp | String] = js.undefined
  
  /**
    * A prefix that any valid value must start with
    */
  var startsWith: js.UndefOr[String] = js.undefined
  
  /**
    * A prefix that any valid value must start with, ignoring case
    */
  var startsWithIgnoreCase: js.UndefOr[String] = js.undefined
}
object Contains {
  
  inline def apply(): Contains = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contains]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Contains] (val x: Self) extends AnyVal {
    
    inline def setContains(value: String): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    
    inline def setEndsWith(value: String): Self = StObject.set(x, "endsWith", value.asInstanceOf[js.Any])
    
    inline def setEndsWithIgnoreCase(value: String): Self = StObject.set(x, "endsWithIgnoreCase", value.asInstanceOf[js.Any])
    
    inline def setEndsWithIgnoreCaseUndefined: Self = StObject.set(x, "endsWithIgnoreCase", js.undefined)
    
    inline def setEndsWithUndefined: Self = StObject.set(x, "endsWith", js.undefined)
    
    inline def setEquals_(value: String): Self = StObject.set(x, "equals", value.asInstanceOf[js.Any])
    
    inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
    
    inline def setMaxLength(value: int): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMinLength(value: int): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    inline def setSearch(value: js.RegExp | String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    inline def setStartsWith(value: String): Self = StObject.set(x, "startsWith", value.asInstanceOf[js.Any])
    
    inline def setStartsWithIgnoreCase(value: String): Self = StObject.set(x, "startsWithIgnoreCase", value.asInstanceOf[js.Any])
    
    inline def setStartsWithIgnoreCaseUndefined: Self = StObject.set(x, "startsWithIgnoreCase", js.undefined)
    
    inline def setStartsWithUndefined: Self = StObject.set(x, "startsWith", js.undefined)
  }
}
