package typings.mediapipeFaceMesh.mod

import typings.mediapipeFaceMesh.mediapipeFaceMeshInts.`0`
import typings.mediapipeFaceMesh.mediapipeFaceMeshInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layout extends StObject {
  
  var COLUMN_MAJOR: `0`
  
  var ROW_MAJOR: `1`
}
object Layout {
  
  inline def apply(): Layout = {
    val __obj = js.Dynamic.literal(COLUMN_MAJOR = 0, ROW_MAJOR = 1)
    __obj.asInstanceOf[Layout]
  }
  
  extension [Self <: Layout](x: Self) {
    
    inline def setCOLUMN_MAJOR(value: `0`): Self = StObject.set(x, "COLUMN_MAJOR", value.asInstanceOf[js.Any])
    
    inline def setROW_MAJOR(value: `1`): Self = StObject.set(x, "ROW_MAJOR", value.asInstanceOf[js.Any])
  }
}
