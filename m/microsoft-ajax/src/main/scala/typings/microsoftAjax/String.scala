package typings.microsoftAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait String extends js.Object {
  //#region Extensions
  /**
    * Formats a number by using the invariant culture.
    * @returns true if the end of the String object matches suffix; otherwise, false.
    */
  def endsWith(suffix: java.lang.String): Boolean = js.native
  /**
    * Removes leading and trailing white-space characters from a String object.
    * @returns A copy of the string with all white-space characters removed from the start and end of the string.
    */
  def trim(): java.lang.String = js.native
  /**
    * Removes trailing white-space characters from a String object.
    * @returns A copy of the string with all white-space characters removed from the end of the string.
    */
  def trimEnd(): java.lang.String = js.native
  /**
    * Removes leading white-space characters from a String object.
    * @returns A copy of the string with all white-space characters removed from the start of the string.
    */
  def trimStart(): java.lang.String = js.native
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
  implicit class StringOps[Self <: String] (val x: Self) extends AnyVal {
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
    def setEndsWith(value: java.lang.String => Boolean): Self = this.set("endsWith", js.Any.fromFunction1(value))
    @scala.inline
    def setTrim(value: () => java.lang.String): Self = this.set("trim", js.Any.fromFunction0(value))
    @scala.inline
    def setTrimEnd(value: () => java.lang.String): Self = this.set("trimEnd", js.Any.fromFunction0(value))
    @scala.inline
    def setTrimStart(value: () => java.lang.String): Self = this.set("trimStart", js.Any.fromFunction0(value))
  }
  
}

