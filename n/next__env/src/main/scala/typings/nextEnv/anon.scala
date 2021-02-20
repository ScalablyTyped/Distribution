package typings.nextEnv

import typings.nextEnv.mod.Env
import typings.nextEnv.mod.LoadedEnvFiles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CombinedEnv extends StObject {
    
    var combinedEnv: Env = js.native
    
    var loadedEnvFiles: LoadedEnvFiles = js.native
  }
  object CombinedEnv {
    
    @scala.inline
    def apply(combinedEnv: Env, loadedEnvFiles: LoadedEnvFiles): CombinedEnv = {
      val __obj = js.Dynamic.literal(combinedEnv = combinedEnv.asInstanceOf[js.Any], loadedEnvFiles = loadedEnvFiles.asInstanceOf[js.Any])
      __obj.asInstanceOf[CombinedEnv]
    }
    
    @scala.inline
    implicit class CombinedEnvMutableBuilder[Self <: CombinedEnv] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCombinedEnv(value: Env): Self = StObject.set(x, "combinedEnv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedEnvFiles(value: LoadedEnvFiles): Self = StObject.set(x, "loadedEnvFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedEnvFilesVarargs(value: Contents*): Self = StObject.set(x, "loadedEnvFiles", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Contents extends StObject {
    
    var contents: String = js.native
    
    var path: String = js.native
  }
  object Contents {
    
    @scala.inline
    def apply(contents: String, path: String): Contents = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Contents]
    }
    
    @scala.inline
    implicit class ContentsMutableBuilder[Self <: Contents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
