package typings
package pickadateLib.PickadateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pickatime extends js.Object {
  var defaults: TimeOptions = js.native
  /**
           * Initialize a time picker.
           */
  def apply(): pickadateLib.JQuery = js.native
  /**
           * Access the API object on an initialized time picker element.
           */
  def apply(keyword: pickadateLib.pickadateLibStrings.picker): TimePicker = js.native
  /**
           * Invoke API methods after time picker initialization.
           */
  def apply(methodName: java.lang.String, arguments: js.Any*): js.Any = js.native
  def apply(objectName: pickadateLib.pickadateLibStrings.DOLLARnode): pickadateLib.JQuery = js.native
  def apply(objectName: pickadateLib.pickadateLibStrings.DOLLARroot): pickadateLib.JQuery = js.native
  def apply(objectName: pickadateLib.pickadateLibStrings._hidden): stdLib.HTMLInputElement = js.native
  /**
           * Initialize a time picker.
           */
  def apply(options: TimeOptions): pickadateLib.JQuery = js.native
}

