package typings.microsoftDashAjax.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a mechanism to concatenate strings.
  * The StringBuilder class represents a mutable string of characters and provides a mechanism to concatenate a sequence of strings.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb310852(v=vs.100).aspx}
  */
@JSGlobal("Sys.StringBuilder")
@js.native
//#region Constructors
/**
  * Creates a new instance of StringBuilder and optionally accepts initial text to concatenate. You can specify a string in the optional initialText parameter to initialize the value of the StringBuilder instance.
  * @param initialText
  *           (Optional) The string that is used to initialize the value of the instance. If the value is null, the new StringBuilder instance will contain an empty string ("").
  */
class StringBuilder () extends js.Object {
  def this(initialText: java.lang.String) = this()
  //#endregion
  //#region Methods
  /**
    * Appends a copy of a specified string to the end of the Sys.StringBuilder instance.
    * Use the append method to append a copy of a specified string to the end of a StringBuilder instance. If text is an empty string, null, or undefined, the StringBuilder instance remains unchanged.
    * @param text
    *             The string to append to the end of the StringBuilder instance.
    */
  def append(text: java.lang.String): Unit = js.native
  /**
    * Appends a string with a line terminator to the end of the Sys.StringBuilder instance.
    * Use the appendLine method to append a specified string and a line terminator to the end of a Stringbuilder instance. The line terminator is a combination of a carriage return and a newline character. If no string is specified in text, only the line terminator is appended.
    * @param text
    *           (Optional) The string to append with a line terminator to the end of the StringBuilder instance.
    */
  def appendLine(text: java.lang.String): Unit = js.native
  /**
    * Clears the contents of the Sys.StringBuilder instance.
    * Use the clear method to clear the StringBuilder instance of its current contents.
    */
  def clear(): Unit = js.native
  /**
    * Determines whether the Sys.StringBuilder object has content.
    * Use the isEmpty method to determine whether a StringBuilder instance has any content. If you append an empty string, null, or an undefined value to an empty StringBuilder instance, the instance remains empty and unchanged.
    * @return true if the StringBuilder instance contains no elements; otherwise, false.
    */
  def isEmpty(): Boolean = js.native
  def toString(separator: java.lang.String): java.lang.String = js.native
}

