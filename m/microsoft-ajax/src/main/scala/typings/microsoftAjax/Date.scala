package typings.microsoftAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
* Provides extensions to the base ECMAScript (JavaScript) Date object.
* Date Type Extensions
* @see {@link http://msdn.microsoft.com/en-us/library/bb310850(v=vs.100).aspx}
*/
trait Date extends StObject {
  
  /**
    * Formats a date by using the invariant (culture-independent) culture.
    */
  var format: js.UndefOr[js.Function1[/* format */ java.lang.String, java.lang.String]] = js.undefined
  
  /**
    * Formats a date by using the current culture. This function is static and can be invoked without creating an instance of the object.
    */
  var localeFormat: js.UndefOr[js.Function1[/* format */ java.lang.String, java.lang.String]] = js.undefined
}
object Date {
  
  inline def apply(): Date = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Date]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: /* format */ java.lang.String => java.lang.String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setLocaleFormat(value: /* format */ java.lang.String => java.lang.String): Self = StObject.set(x, "localeFormat", js.Any.fromFunction1(value))
    
    inline def setLocaleFormatUndefined: Self = StObject.set(x, "localeFormat", js.undefined)
  }
}
