package typings.ol.mousePositionMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.coordinateMod.CoordinateFormat
import typings.ol.projMod.ProjectionLike
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var coordinateFormat: js.UndefOr[CoordinateFormat] = js.native
  
  var projection: js.UndefOr[ProjectionLike] = js.native
  
  var render: js.UndefOr[js.Function1[/* p0 */ typings.ol.mapEventMod.default, Unit]] = js.native
  
  var target: js.UndefOr[HTMLElement | String] = js.native
  
  var undefinedHTML: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setCoordinateFormat(value: /* p0 */ js.UndefOr[Coordinate] => String): Self = this.set("coordinateFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCoordinateFormat: Self = this.set("coordinateFormat", js.undefined)
    
    @scala.inline
    def setProjection(value: ProjectionLike): Self = this.set("projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    
    @scala.inline
    def setRender(value: /* p0 */ typings.ol.mapEventMod.default => Unit): Self = this.set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setTarget(value: HTMLElement | String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setUndefinedHTML(value: String): Self = this.set("undefinedHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUndefinedHTML: Self = this.set("undefinedHTML", js.undefined)
  }
}
