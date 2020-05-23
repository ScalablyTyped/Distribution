package typings.photonui.photonui

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//Widgets
trait FileManager extends Base {
  var acceptedExts: js.Array[String]
  var acceptedMimes: js.Array[String]
  var dropZone: HTMLElement
  var multiselect: Boolean
  def open(): Unit
}

object FileManager {
  @scala.inline
  def apply(
    acceptedExts: js.Array[String],
    acceptedMimes: js.Array[String],
    destroy: () => Unit,
    dropZone: HTMLElement,
    multiselect: Boolean,
    open: () => Unit,
    registerCallback: (String, String, js.Function, js.Any) => Unit,
    removeCallback: String => Unit
  ): FileManager = {
    val __obj = js.Dynamic.literal(acceptedExts = acceptedExts.asInstanceOf[js.Any], acceptedMimes = acceptedMimes.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), dropZone = dropZone.asInstanceOf[js.Any], multiselect = multiselect.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), registerCallback = js.Any.fromFunction4(registerCallback), removeCallback = js.Any.fromFunction1(removeCallback))
    __obj.asInstanceOf[FileManager]
  }
}

