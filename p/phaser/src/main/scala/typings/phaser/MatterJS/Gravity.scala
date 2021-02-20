package typings.phaser.MatterJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gravity extends Vector {
  
  var scale: Double = js.native
}
object Gravity {
  
  @scala.inline
  def apply(scale: Double, x: Double, y: Double): Gravity = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gravity]
  }
  
  @scala.inline
  implicit class GravityMutableBuilder[Self <: Gravity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
