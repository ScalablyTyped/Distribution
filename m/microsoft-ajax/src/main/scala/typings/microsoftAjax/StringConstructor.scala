package typings.microsoftAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
* Provides extensions to the base ECMAScript (JavaScript) String object by including static and instance methods.
* String Type Extensions
* @see {@link http://msdn.microsoft.com/en-us/library/bb397472(v=vs.100).aspx}
*/
@js.native
trait StringConstructor extends js.Object {
  
  /**
  * Replaces each format item in a String object with the text equivalent of a corresponding object's value.
  * @returns A copy of the string with the formatting applied.
  */
  def format(format: java.lang.String, args: js.Any*): java.lang.String = js.native
  
  /**
    * Replaces the format items in a String object with the text equivalent of a corresponding object's value. The current culture is used to format dates and numbers.
    * @returns A copy of the string with the formatting applied.
    */
  def localeFormat(format: java.lang.String, args: js.Any*): java.lang.String = js.native
}
object StringConstructor {
  
  @scala.inline
  def apply(
    format: (java.lang.String, /* repeated */ js.Any) => java.lang.String,
    localeFormat: (java.lang.String, /* repeated */ js.Any) => java.lang.String
  ): StringConstructor = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction2(format), localeFormat = js.Any.fromFunction2(localeFormat))
    __obj.asInstanceOf[StringConstructor]
  }
  
  @scala.inline
  implicit class StringConstructorOps[Self <: StringConstructor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFormat(value: (java.lang.String, /* repeated */ js.Any) => java.lang.String): Self = this.set("format", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLocaleFormat(value: (java.lang.String, /* repeated */ js.Any) => java.lang.String): Self = this.set("localeFormat", js.Any.fromFunction2(value))
  }
}
