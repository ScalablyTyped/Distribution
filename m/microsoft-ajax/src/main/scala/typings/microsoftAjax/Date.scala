package typings.microsoftAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
* Provides extensions to the base ECMAScript (JavaScript) Date object.
* Date Type Extensions
* @see {@link http://msdn.microsoft.com/en-us/library/bb310850(v=vs.100).aspx}
*/
@js.native
trait Date extends StObject {
  
  /**
    * Formats a date by using the invariant (culture-independent) culture.
    */
  def format(format: java.lang.String): java.lang.String = js.native
  
  /**
    * Formats a date by using the current culture. This function is static and can be invoked without creating an instance of the object.
    */
  def localeFormat(format: java.lang.String): java.lang.String = js.native
}
object Date {
  
  @scala.inline
  def apply(format: java.lang.String => java.lang.String, localeFormat: java.lang.String => java.lang.String): Date = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), localeFormat = js.Any.fromFunction1(localeFormat))
    __obj.asInstanceOf[Date]
  }
  
  @scala.inline
  implicit class DateMutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: java.lang.String => java.lang.String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocaleFormat(value: java.lang.String => java.lang.String): Self = StObject.set(x, "localeFormat", js.Any.fromFunction1(value))
  }
}
