package typings.microsoftAjax.global.Sys

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
class StringBuilder ()
  extends typings.microsoftAjax.Sys.StringBuilder {
  def this(initialText: String) = this()
}

