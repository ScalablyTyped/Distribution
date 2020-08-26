package typings.mendixmodelsdk.transportInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProblemLocation extends js.Object {
  var document: js.UndefOr[String] = js.native
  var element: js.UndefOr[String] = js.native
  var elementId: js.UndefOr[String] = js.native
  var module: js.UndefOr[String] = js.native
  var unitId: js.UndefOr[String] = js.native
}

object IProblemLocation {
  @scala.inline
  def apply(): IProblemLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProblemLocation]
  }
  @scala.inline
  implicit class IProblemLocationOps[Self <: IProblemLocation] (val x: Self) extends AnyVal {
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
    def setDocument(value: String): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocument: Self = this.set("document", js.undefined)
    @scala.inline
    def setElement(value: String): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setElementId(value: String): Self = this.set("elementId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElementId: Self = this.set("elementId", js.undefined)
    @scala.inline
    def setModule(value: String): Self = this.set("module", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModule: Self = this.set("module", js.undefined)
    @scala.inline
    def setUnitId(value: String): Self = this.set("unitId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnitId: Self = this.set("unitId", js.undefined)
  }
  
}

