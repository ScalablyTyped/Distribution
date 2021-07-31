package typings.phaser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSkeletonRendererQUADTRIANGLES extends StObject {
  
  /* static member */
  var QUAD_TRIANGLES: js.Array[Double]
}
object TypeofSkeletonRendererQUADTRIANGLES {
  
  @scala.inline
  def apply(QUAD_TRIANGLES: js.Array[Double]): TypeofSkeletonRendererQUADTRIANGLES = {
    val __obj = js.Dynamic.literal(QUAD_TRIANGLES = QUAD_TRIANGLES.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSkeletonRendererQUADTRIANGLES]
  }
  
  @scala.inline
  implicit class TypeofSkeletonRendererQUADTRIANGLESMutableBuilder[Self <: TypeofSkeletonRendererQUADTRIANGLES] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQUAD_TRIANGLES(value: js.Array[Double]): Self = StObject.set(x, "QUAD_TRIANGLES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUAD_TRIANGLESVarargs(value: Double*): Self = StObject.set(x, "QUAD_TRIANGLES", js.Array(value :_*))
  }
}
