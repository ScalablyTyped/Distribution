package typings.mediapipeFaceMesh.mod

import typings.mediapipeFaceMesh.mediapipeFaceMeshInts.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrimitiveType extends StObject {
  
  var TRIANGLE: `0`
}
object PrimitiveType {
  
  inline def apply(): PrimitiveType = {
    val __obj = js.Dynamic.literal(TRIANGLE = 0)
    __obj.asInstanceOf[PrimitiveType]
  }
  
  extension [Self <: PrimitiveType](x: Self) {
    
    inline def setTRIANGLE(value: `0`): Self = StObject.set(x, "TRIANGLE", value.asInstanceOf[js.Any])
  }
}
