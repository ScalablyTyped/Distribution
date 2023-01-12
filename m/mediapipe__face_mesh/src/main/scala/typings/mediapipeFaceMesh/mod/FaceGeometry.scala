package typings.mediapipeFaceMesh.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FaceGeometry extends StObject {
  
  def getMesh(): Mesh
  
  def getPoseTransformMatrix(): MatrixData
}
object FaceGeometry {
  
  inline def apply(getMesh: () => Mesh, getPoseTransformMatrix: () => MatrixData): FaceGeometry = {
    val __obj = js.Dynamic.literal(getMesh = js.Any.fromFunction0(getMesh), getPoseTransformMatrix = js.Any.fromFunction0(getPoseTransformMatrix))
    __obj.asInstanceOf[FaceGeometry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FaceGeometry] (val x: Self) extends AnyVal {
    
    inline def setGetMesh(value: () => Mesh): Self = StObject.set(x, "getMesh", js.Any.fromFunction0(value))
    
    inline def setGetPoseTransformMatrix(value: () => MatrixData): Self = StObject.set(x, "getPoseTransformMatrix", js.Any.fromFunction0(value))
  }
}
