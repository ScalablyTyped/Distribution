package typings.nextEnv

import typings.nextEnv.mod.Env
import typings.nextEnv.mod.LoadedEnvFiles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CombinedEnv extends StObject {
    
    var combinedEnv: Env
    
    var loadedEnvFiles: LoadedEnvFiles
  }
  object CombinedEnv {
    
    inline def apply(combinedEnv: Env, loadedEnvFiles: LoadedEnvFiles): CombinedEnv = {
      val __obj = js.Dynamic.literal(combinedEnv = combinedEnv.asInstanceOf[js.Any], loadedEnvFiles = loadedEnvFiles.asInstanceOf[js.Any])
      __obj.asInstanceOf[CombinedEnv]
    }
    
    extension [Self <: CombinedEnv](x: Self) {
      
      inline def setCombinedEnv(value: Env): Self = StObject.set(x, "combinedEnv", value.asInstanceOf[js.Any])
      
      inline def setLoadedEnvFiles(value: LoadedEnvFiles): Self = StObject.set(x, "loadedEnvFiles", value.asInstanceOf[js.Any])
      
      inline def setLoadedEnvFilesVarargs(value: Contents*): Self = StObject.set(x, "loadedEnvFiles", js.Array(value*))
    }
  }
  
  trait Contents extends StObject {
    
    var contents: String
    
    var path: String
  }
  object Contents {
    
    inline def apply(contents: String, path: String): Contents = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Contents]
    }
    
    extension [Self <: Contents](x: Self) {
      
      inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
