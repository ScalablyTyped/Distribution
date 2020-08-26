package typings.pixiJs.anon

import typings.std.HTMLAudioElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadElement extends js.Object {
  var loadElement: js.UndefOr[HTMLImageElement | HTMLAudioElement | HTMLVideoElement] = js.native
  var mimeType: js.UndefOr[String | js.Array[String]] = js.native
  var skipSource: js.UndefOr[Boolean] = js.native
}

object LoadElement {
  @scala.inline
  def apply(): LoadElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadElement]
  }
  @scala.inline
  implicit class LoadElementOps[Self <: LoadElement] (val x: Self) extends AnyVal {
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
    def setLoadElement(value: HTMLImageElement | HTMLAudioElement | HTMLVideoElement): Self = this.set("loadElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadElement: Self = this.set("loadElement", js.undefined)
    @scala.inline
    def setMimeTypeVarargs(value: String*): Self = this.set("mimeType", js.Array(value :_*))
    @scala.inline
    def setMimeType(value: String | js.Array[String]): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    @scala.inline
    def setSkipSource(value: Boolean): Self = this.set("skipSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipSource: Self = this.set("skipSource", js.undefined)
  }
  
}

