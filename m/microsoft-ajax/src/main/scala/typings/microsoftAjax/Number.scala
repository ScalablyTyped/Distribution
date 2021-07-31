package typings.microsoftAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
* Extends the base ECMAScript (JavaScript) Number functionality with static and instance methods.
* Number Type Extensions
* @see {@link http://msdn.microsoft.com/en-us/library/bb310835(v=vs.100).aspx}
*/
trait Number extends StObject {
  
  /**
    * Formats a number by using the invariant culture.
    */
  def format(format: java.lang.String): java.lang.String
  
  /**
    * Formats a number by using the current culture.
    */
  def localeFormat(format: java.lang.String): java.lang.String
}
object Number {
  
  @scala.inline
  def apply(format: java.lang.String => java.lang.String, localeFormat: java.lang.String => java.lang.String): Number = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), localeFormat = js.Any.fromFunction1(localeFormat))
    __obj.asInstanceOf[Number]
  }
  
  @scala.inline
  implicit class NumberMutableBuilder[Self <: Number] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: java.lang.String => java.lang.String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocaleFormat(value: java.lang.String => java.lang.String): Self = StObject.set(x, "localeFormat", js.Any.fromFunction1(value))
  }
}
