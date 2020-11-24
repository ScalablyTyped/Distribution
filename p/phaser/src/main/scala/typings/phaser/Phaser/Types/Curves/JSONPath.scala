package typings.phaser.Phaser.Types.Curves

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONPath extends js.Object {
  
  /**
    * The path is auto closed.
    */
  var autoClose: Boolean = js.native
  
  /**
    * The list of the curves
    */
  var curves: js.Array[JSONCurve] = js.native
  
  /**
    * The of the curve.
    */
  var `type`: String = js.native
  
  /**
    * The X coordinate of the curve's starting point.
    */
  var x: Double = js.native
  
  /**
    * The Y coordinate of the path's starting point.
    */
  var y: Double = js.native
}
object JSONPath {
  
  @scala.inline
  def apply(autoClose: Boolean, curves: js.Array[JSONCurve], `type`: String, x: Double, y: Double): JSONPath = {
    val __obj = js.Dynamic.literal(autoClose = autoClose.asInstanceOf[js.Any], curves = curves.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONPath]
  }
  
  @scala.inline
  implicit class JSONPathOps[Self <: JSONPath] (val x: Self) extends AnyVal {
    
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
    def setAutoClose(value: Boolean): Self = this.set("autoClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurvesVarargs(value: JSONCurve*): Self = this.set("curves", js.Array(value :_*))
    
    @scala.inline
    def setCurves(value: js.Array[JSONCurve]): Self = this.set("curves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
