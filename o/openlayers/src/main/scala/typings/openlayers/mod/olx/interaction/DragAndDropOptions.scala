package typings.openlayers.mod.olx.interaction

import org.scalablytyped.runtime.Instantiable0
import typings.openlayers.mod.ProjectionLike
import typings.openlayers.mod.format.Feature
import typings.openlayers.mod.source.Vector
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragAndDropOptions extends js.Object {
  var formatConstructors: js.UndefOr[js.Array[Instantiable0[Feature]]] = js.native
  var projection: ProjectionLike = js.native
  var source: js.UndefOr[Vector] = js.native
  var target: js.UndefOr[Element] = js.native
}

object DragAndDropOptions {
  @scala.inline
  def apply(): DragAndDropOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragAndDropOptions]
  }
  @scala.inline
  implicit class DragAndDropOptionsOps[Self <: DragAndDropOptions] (val x: Self) extends AnyVal {
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
    def setFormatConstructorsVarargs(value: Instantiable0[Feature]*): Self = this.set("formatConstructors", js.Array(value :_*))
    @scala.inline
    def setFormatConstructors(value: js.Array[Instantiable0[Feature]]): Self = this.set("formatConstructors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatConstructors: Self = this.set("formatConstructors", js.undefined)
    @scala.inline
    def setProjection(value: ProjectionLike): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    @scala.inline
    def setSource(value: Vector): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setTarget(value: Element): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

