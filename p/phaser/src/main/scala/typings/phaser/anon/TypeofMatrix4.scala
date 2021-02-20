package typings.phaser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofMatrix4 extends StObject {
  
  /* static member */
  def initTemps(): Unit = js.native
  
  /* static member */
  var tmpMatrix: js.Any = js.native
  
  /* static member */
  var xAxis: js.Any = js.native
  
  /* static member */
  var yAxis: js.Any = js.native
  
  /* static member */
  var zAxis: js.Any = js.native
}
object TypeofMatrix4 {
  
  @scala.inline
  def apply(initTemps: () => Unit, tmpMatrix: js.Any, xAxis: js.Any, yAxis: js.Any, zAxis: js.Any): TypeofMatrix4 = {
    val __obj = js.Dynamic.literal(initTemps = js.Any.fromFunction0(initTemps), tmpMatrix = tmpMatrix.asInstanceOf[js.Any], xAxis = xAxis.asInstanceOf[js.Any], yAxis = yAxis.asInstanceOf[js.Any], zAxis = zAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofMatrix4]
  }
  
  @scala.inline
  implicit class TypeofMatrix4MutableBuilder[Self <: TypeofMatrix4] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitTemps(value: () => Unit): Self = StObject.set(x, "initTemps", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTmpMatrix(value: js.Any): Self = StObject.set(x, "tmpMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxis(value: js.Any): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxis(value: js.Any): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZAxis(value: js.Any): Self = StObject.set(x, "zAxis", value.asInstanceOf[js.Any])
  }
}
