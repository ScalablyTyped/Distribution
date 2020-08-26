package typings.photonui.photonui

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//Widgets
@js.native
trait FileManager extends Base {
  var acceptedExts: js.Array[String] = js.native
  var acceptedMimes: js.Array[String] = js.native
  var dropZone: HTMLElement = js.native
  var multiselect: Boolean = js.native
  def open(): Unit = js.native
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
  @scala.inline
  implicit class FileManagerOps[Self <: FileManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAcceptedExtsVarargs(value: String*): Self = this.set("acceptedExts", js.Array(value :_*))
    @scala.inline
    def setAcceptedExts(value: js.Array[String]): Self = this.set("acceptedExts", value.asInstanceOf[js.Any])
    @scala.inline
    def setAcceptedMimesVarargs(value: String*): Self = this.set("acceptedMimes", js.Array(value :_*))
    @scala.inline
    def setAcceptedMimes(value: js.Array[String]): Self = this.set("acceptedMimes", value.asInstanceOf[js.Any])
    @scala.inline
    def setDropZone(value: HTMLElement): Self = this.set("dropZone", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiselect(value: Boolean): Self = this.set("multiselect", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpen(value: () => Unit): Self = this.set("open", js.Any.fromFunction0(value))
  }
  
}

