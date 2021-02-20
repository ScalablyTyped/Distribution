package typings.phaser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSkeletonRenderer extends StObject {
  
  /* static member */
  var QUAD_TRIANGLES: js.Array[Double] = js.native
  
  /* static member */
  var VERTEX_SIZE: Double = js.native
}
object TypeofSkeletonRenderer {
  
  @scala.inline
  def apply(QUAD_TRIANGLES: js.Array[Double], VERTEX_SIZE: Double): TypeofSkeletonRenderer = {
    val __obj = js.Dynamic.literal(QUAD_TRIANGLES = QUAD_TRIANGLES.asInstanceOf[js.Any], VERTEX_SIZE = VERTEX_SIZE.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSkeletonRenderer]
  }
  
  @scala.inline
  implicit class TypeofSkeletonRendererMutableBuilder[Self <: TypeofSkeletonRenderer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQUAD_TRIANGLES(value: js.Array[Double]): Self = StObject.set(x, "QUAD_TRIANGLES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUAD_TRIANGLESVarargs(value: Double*): Self = StObject.set(x, "QUAD_TRIANGLES", js.Array(value :_*))
    
    @scala.inline
    def setVERTEX_SIZE(value: Double): Self = StObject.set(x, "VERTEX_SIZE", value.asInstanceOf[js.Any])
  }
}
