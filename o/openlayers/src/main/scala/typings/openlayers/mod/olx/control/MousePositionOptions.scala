package typings.openlayers.mod.olx.control

import typings.openlayers.mod.CoordinateFormatType
import typings.openlayers.mod.Coordinate_
import typings.openlayers.mod.MapEvent
import typings.openlayers.mod.ProjectionLike
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MousePositionOptions extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var coordinateFormat: js.UndefOr[CoordinateFormatType] = js.native
  
  var projection: ProjectionLike = js.native
  
  var render: js.UndefOr[js.Function1[/* event */ MapEvent, _]] = js.native
  
  var target: js.UndefOr[Element] = js.native
  
  var undefinedHTML: js.UndefOr[String] = js.native
}
object MousePositionOptions {
  
  @scala.inline
  def apply(): MousePositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MousePositionOptions]
  }
  
  @scala.inline
  implicit class MousePositionOptionsOps[Self <: MousePositionOptions] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCoordinateFormat(value: /* coords */ js.UndefOr[Coordinate_] => String): Self = this.set("coordinateFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCoordinateFormat: Self = this.set("coordinateFormat", js.undefined)
    
    @scala.inline
    def setProjection(value: ProjectionLike): Self = this.set("projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    
    @scala.inline
    def setRender(value: /* event */ MapEvent => _): Self = this.set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setTarget(value: Element): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setUndefinedHTML(value: String): Self = this.set("undefinedHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUndefinedHTML: Self = this.set("undefinedHTML", js.undefined)
  }
}
