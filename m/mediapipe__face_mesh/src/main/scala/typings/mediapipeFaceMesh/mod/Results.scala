package typings.mediapipeFaceMesh.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Results extends StObject {
  
  var image: GpuBuffer
  
  var multiFaceGeometry: js.Array[FaceGeometry]
  
  var multiFaceLandmarks: NormalizedLandmarkListList
}
object Results {
  
  inline def apply(
    image: GpuBuffer,
    multiFaceGeometry: js.Array[FaceGeometry],
    multiFaceLandmarks: NormalizedLandmarkListList
  ): Results = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], multiFaceGeometry = multiFaceGeometry.asInstanceOf[js.Any], multiFaceLandmarks = multiFaceLandmarks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Results] (val x: Self) extends AnyVal {
    
    inline def setImage(value: GpuBuffer): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setMultiFaceGeometry(value: js.Array[FaceGeometry]): Self = StObject.set(x, "multiFaceGeometry", value.asInstanceOf[js.Any])
    
    inline def setMultiFaceGeometryVarargs(value: FaceGeometry*): Self = StObject.set(x, "multiFaceGeometry", js.Array(value*))
    
    inline def setMultiFaceLandmarks(value: NormalizedLandmarkListList): Self = StObject.set(x, "multiFaceLandmarks", value.asInstanceOf[js.Any])
    
    inline def setMultiFaceLandmarksVarargs(value: NormalizedLandmarkList*): Self = StObject.set(x, "multiFaceLandmarks", js.Array(value*))
  }
}
