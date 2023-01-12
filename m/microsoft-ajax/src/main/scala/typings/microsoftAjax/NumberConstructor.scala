package typings.microsoftAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberConstructor extends StObject {
  
  /**
    * Returns a numeric value from a string representation of a number. This function is static and can be called without creating an instance of the object.
    */
  def parseInvariant(format: java.lang.String): Double
  
  /**
    * Creates a numeric value from a locale-specific string.
    */
  def parseLocale(format: java.lang.String): Double
}
object NumberConstructor {
  
  inline def apply(parseInvariant: java.lang.String => Double, parseLocale: java.lang.String => Double): NumberConstructor = {
    val __obj = js.Dynamic.literal(parseInvariant = js.Any.fromFunction1(parseInvariant), parseLocale = js.Any.fromFunction1(parseLocale))
    __obj.asInstanceOf[NumberConstructor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumberConstructor] (val x: Self) extends AnyVal {
    
    inline def setParseInvariant(value: java.lang.String => Double): Self = StObject.set(x, "parseInvariant", js.Any.fromFunction1(value))
    
    inline def setParseLocale(value: java.lang.String => Double): Self = StObject.set(x, "parseLocale", js.Any.fromFunction1(value))
  }
}
