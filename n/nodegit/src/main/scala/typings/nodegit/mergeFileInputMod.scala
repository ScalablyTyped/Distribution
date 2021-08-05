package typings.nodegit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeFileInputMod {
  
  trait MergeFileInput extends StObject {
    
    var mode: Double
    
    var path: String
    
    var ptr: String
    
    var size: Double
    
    var version: Double
  }
  object MergeFileInput {
    
    inline def apply(mode: Double, path: String, ptr: String, size: Double, version: Double): MergeFileInput = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], ptr = ptr.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[MergeFileInput]
    }
    
    extension [Self <: MergeFileInput](x: Self) {
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPtr(value: String): Self = StObject.set(x, "ptr", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
