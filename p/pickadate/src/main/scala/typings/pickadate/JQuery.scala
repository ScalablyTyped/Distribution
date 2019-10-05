package typings.pickadate

import typings.pickadate.Pickadate.DateOptions
import typings.pickadate.Pickadate.DatePicker
import typings.pickadate.Pickadate.Pickatime
import typings.pickadate.Pickadate.TimeOptions
import typings.pickadate.Pickadate.TimePicker
import typings.pickadate.pickadateStrings.DOLLARnode
import typings.pickadate.pickadateStrings.DOLLARroot
import typings.pickadate.pickadateStrings._hidden
import typings.pickadate.pickadateStrings.picker
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("pickadate")
  var pickadate_Original: typings.pickadate.Pickadate.Pickadate = js.native
  @JSName("pickatime")
  var pickatime_Original: Pickatime = js.native
  /**
    * Initialize a date picker.
    */
  def pickadate(): JQuery = js.native
  /**
    * Invoke API methods after date picker initialization.
    */
  def pickadate(methodName: String, arguments: js.Any*): js.Any = js.native
  def pickadate(options: DateOptions): JQuery = js.native
  @JSName("pickadate")
  def pickadate_hidden(objectName: _hidden): HTMLInputElement = js.native
  @JSName("pickadate")
  def pickadate_node(objectName: DOLLARnode): JQuery = js.native
  /**
    * Access the API object on an initialized date picker element.
    */
  @JSName("pickadate")
  def pickadate_picker(keyword: picker): DatePicker = js.native
  @JSName("pickadate")
  def pickadate_root(objectName: DOLLARroot): JQuery = js.native
  /**
    * Initialize a time picker.
    */
  def pickatime(): JQuery = js.native
  /**
    * Invoke API methods after time picker initialization.
    */
  def pickatime(methodName: String, arguments: js.Any*): js.Any = js.native
  def pickatime(options: TimeOptions): JQuery = js.native
  @JSName("pickatime")
  def pickatime_hidden(objectName: _hidden): HTMLInputElement = js.native
  @JSName("pickatime")
  def pickatime_node(objectName: DOLLARnode): JQuery = js.native
  /**
    * Access the API object on an initialized time picker element.
    */
  @JSName("pickatime")
  def pickatime_picker(keyword: picker): TimePicker = js.native
  @JSName("pickatime")
  def pickatime_root(objectName: DOLLARroot): JQuery = js.native
}

