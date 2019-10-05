package typings.pickadate.Pickadate

import typings.pickadate.JQuery
import typings.pickadate.pickadateStrings.DOLLARnode
import typings.pickadate.pickadateStrings.DOLLARroot
import typings.pickadate.pickadateStrings._hidden
import typings.pickadate.pickadateStrings.picker
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pickadate extends js.Object {
  var defaults: DateOptions = js.native
  /**
    * Initialize a date picker.
    */
  def apply(): JQuery = js.native
  /**
    * Access the API object on an initialized date picker element.
    */
  def apply(keyword: picker): DatePicker = js.native
  /**
    * Invoke API methods after date picker initialization.
    */
  def apply(methodName: String, arguments: js.Any*): js.Any = js.native
  def apply(objectName: DOLLARnode): JQuery = js.native
  def apply(objectName: DOLLARroot): JQuery = js.native
  def apply(objectName: _hidden): HTMLInputElement = js.native
  def apply(options: DateOptions): JQuery = js.native
}

