package typings
package pickadateLib.PickadateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pickadate extends js.Object {
  var defaults: DateOptions = js.native
  /**
    * Initialize a date picker.
    */
  def apply(): pickadateLib.JQuery = js.native
  /**
    * Access the API object on an initialized date picker element.
    */
  def apply(keyword: pickadateLib.pickadateLibStrings.picker): DatePicker = js.native
  /**
    * Invoke API methods after date picker initialization.
    */
  def apply(methodName: java.lang.String, arguments: js.Any*): js.Any = js.native
  def apply(objectName: pickadateLib.pickadateLibStrings.DOLLARnode): pickadateLib.JQuery = js.native
  def apply(objectName: pickadateLib.pickadateLibStrings.DOLLARroot): pickadateLib.JQuery = js.native
  def apply(objectName: pickadateLib.pickadateLibStrings._hidden): stdLib.HTMLInputElement = js.native
  def apply(options: DateOptions): pickadateLib.JQuery = js.native
}

