package typings.microsoftAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait String extends StObject {
  
  //#region Extensions
  /**
    * Formats a number by using the invariant culture.
    * @returns true if the end of the String object matches suffix; otherwise, false.
    */
  def endsWith(suffix: java.lang.String): Boolean
  
  /**
    * Removes leading and trailing white-space characters from a String object.
    * @returns A copy of the string with all white-space characters removed from the start and end of the string.
    */
  def trim(): java.lang.String
  
  /**
    * Removes trailing white-space characters from a String object.
    * @returns A copy of the string with all white-space characters removed from the end of the string.
    */
  def trimEnd(): java.lang.String
  
  /**
    * Removes leading white-space characters from a String object.
    * @returns A copy of the string with all white-space characters removed from the start of the string.
    */
  def trimStart(): java.lang.String
}
object String {
  
  @scala.inline
  def apply(
    endsWith: java.lang.String => Boolean,
    trim: () => java.lang.String,
    trimEnd: () => java.lang.String,
    trimStart: () => java.lang.String
  ): String = {
    val __obj = js.Dynamic.literal(endsWith = js.Any.fromFunction1(endsWith), trim = js.Any.fromFunction0(trim), trimEnd = js.Any.fromFunction0(trimEnd), trimStart = js.Any.fromFunction0(trimStart))
    __obj.asInstanceOf[String]
  }
  
  @scala.inline
  implicit class StringMutableBuilder[Self <: String] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndsWith(value: java.lang.String => Boolean): Self = StObject.set(x, "endsWith", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTrim(value: () => java.lang.String): Self = StObject.set(x, "trim", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTrimEnd(value: () => java.lang.String): Self = StObject.set(x, "trimEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTrimStart(value: () => java.lang.String): Self = StObject.set(x, "trimStart", js.Any.fromFunction0(value))
  }
}
