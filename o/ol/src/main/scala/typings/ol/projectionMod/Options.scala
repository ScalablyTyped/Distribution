package typings.ol.projectionMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.unitsMod.Units
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var axisOrientation: js.UndefOr[String] = js.native
  
  var code: String = js.native
  
  var extent: js.UndefOr[Extent] = js.native
  
  var getPointResolution: js.UndefOr[js.Function2[/* p0 */ Double, /* p1 */ Coordinate, Double]] = js.native
  
  var global: js.UndefOr[Boolean] = js.native
  
  var metersPerUnit: js.UndefOr[Double] = js.native
  
  var units: js.UndefOr[Units | String] = js.native
  
  var worldExtent: js.UndefOr[Extent] = js.native
}
object Options {
  
  @scala.inline
  def apply(code: String): Options = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisOrientation(value: String): Self = this.set("axisOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisOrientation: Self = this.set("axisOrientation", js.undefined)
    
    @scala.inline
    def setExtent(value: Extent): Self = this.set("extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtent: Self = this.set("extent", js.undefined)
    
    @scala.inline
    def setGetPointResolution(value: (/* p0 */ Double, /* p1 */ Coordinate) => Double): Self = this.set("getPointResolution", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetPointResolution: Self = this.set("getPointResolution", js.undefined)
    
    @scala.inline
    def setGlobal(value: Boolean): Self = this.set("global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobal: Self = this.set("global", js.undefined)
    
    @scala.inline
    def setMetersPerUnit(value: Double): Self = this.set("metersPerUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetersPerUnit: Self = this.set("metersPerUnit", js.undefined)
    
    @scala.inline
    def setUnits(value: Units | String): Self = this.set("units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnits: Self = this.set("units", js.undefined)
    
    @scala.inline
    def setWorldExtent(value: Extent): Self = this.set("worldExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorldExtent: Self = this.set("worldExtent", js.undefined)
  }
}
