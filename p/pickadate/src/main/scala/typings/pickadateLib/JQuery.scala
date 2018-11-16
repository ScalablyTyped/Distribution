package typings
package pickadateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("pickadate")
  var pickadate_Original: pickadateLib.PickadateNs.Pickadate = js.native
  @JSName("pickatime")
  var pickatime_Original: pickadateLib.PickadateNs.Pickatime = js.native
  /**
           * Initialize a date picker.
           */
  def pickadate(): JQuery = js.native
  /**
           * Invoke API methods after date picker initialization.
           */
  def pickadate(methodName: java.lang.String, arguments: js.Any*): js.Any = js.native
  /**
           * Initialize a date picker.
           */
  def pickadate(options: pickadateLib.PickadateNs.DateOptions): JQuery = js.native
  @JSName("pickadate")
  def pickadate_$node(objectName: pickadateLib.pickadateLibStrings.DOLLARnode): JQuery = js.native
  @JSName("pickadate")
  def pickadate_$root(objectName: pickadateLib.pickadateLibStrings.DOLLARroot): JQuery = js.native
  @JSName("pickadate")
  def pickadate__hidden(objectName: pickadateLib.pickadateLibStrings._hidden): stdLib.HTMLInputElement = js.native
  /**
           * Access the API object on an initialized date picker element.
           */
  @JSName("pickadate")
  def pickadate_picker(keyword: pickadateLib.pickadateLibStrings.picker): pickadateLib.PickadateNs.DatePicker = js.native
  /**
           * Initialize a time picker.
           */
  def pickatime(): JQuery = js.native
  /**
           * Invoke API methods after time picker initialization.
           */
  def pickatime(methodName: java.lang.String, arguments: js.Any*): js.Any = js.native
  /**
           * Initialize a time picker.
           */
  def pickatime(options: pickadateLib.PickadateNs.TimeOptions): JQuery = js.native
  @JSName("pickatime")
  def pickatime_$node(objectName: pickadateLib.pickadateLibStrings.DOLLARnode): JQuery = js.native
  @JSName("pickatime")
  def pickatime_$root(objectName: pickadateLib.pickadateLibStrings.DOLLARroot): JQuery = js.native
  @JSName("pickatime")
  def pickatime__hidden(objectName: pickadateLib.pickadateLibStrings._hidden): stdLib.HTMLInputElement = js.native
  /**
           * Access the API object on an initialized time picker element.
           */
  @JSName("pickatime")
  def pickatime_picker(keyword: pickadateLib.pickadateLibStrings.picker): pickadateLib.PickadateNs.TimePicker = js.native
}

