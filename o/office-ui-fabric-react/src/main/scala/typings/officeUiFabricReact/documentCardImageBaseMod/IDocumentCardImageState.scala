package typings.officeUiFabricReact.documentCardImageBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDocumentCardImageState extends js.Object {
  val imageHasLoaded: Boolean = js.native
}

object IDocumentCardImageState {
  @scala.inline
  def apply(imageHasLoaded: Boolean): IDocumentCardImageState = {
    val __obj = js.Dynamic.literal(imageHasLoaded = imageHasLoaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardImageState]
  }
  @scala.inline
  implicit class IDocumentCardImageStateOps[Self <: IDocumentCardImageState] (val x: Self) extends AnyVal {
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
    def setImageHasLoaded(value: Boolean): Self = this.set("imageHasLoaded", value.asInstanceOf[js.Any])
  }
  
}

