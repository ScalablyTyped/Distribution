package typings.maximMazurokGapiClientPoly.gapi.client.poly

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Quaternion extends StObject {
  
  /** The scalar component. */
  var w: js.UndefOr[Double] = js.undefined
  
  /** The x component. */
  var x: js.UndefOr[Double] = js.undefined
  
  /** The y component. */
  var y: js.UndefOr[Double] = js.undefined
  
  /** The z component. */
  var z: js.UndefOr[Double] = js.undefined
}
object Quaternion {
  
  @scala.inline
  def apply(): Quaternion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Quaternion]
  }
  
  @scala.inline
  implicit class QuaternionMutableBuilder[Self <: Quaternion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}
