package typings.ol.triangulationMod

import typings.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Triangle extends js.Object {
  
  var source: js.Array[Coordinate] = js.native
  
  var target: js.Array[Coordinate] = js.native
}
object Triangle {
  
  @scala.inline
  def apply(source: js.Array[Coordinate], target: js.Array[Coordinate]): Triangle = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Triangle]
  }
  
  @scala.inline
  implicit class TriangleOps[Self <: Triangle] (val x: Self) extends AnyVal {
    
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
    def setSourceVarargs(value: Coordinate*): Self = this.set("source", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: js.Array[Coordinate]): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetVarargs(value: Coordinate*): Self = this.set("target", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: js.Array[Coordinate]): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}
