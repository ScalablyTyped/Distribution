package typings.next

import typings.next.anon.EvaluateInContext
import typings.next.anon.PickEdgeFunctionDefinitio
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerWebSandboxContextMod {
  
  @JSImport("next/dist/server/web/sandbox/context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearModuleContext(path: String, content: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clearModuleContext")(path.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def clearModuleContext(path: String, content: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clearModuleContext")(path.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getModuleContext(options: ModuleContextOptions): js.Promise[EvaluateInContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("getModuleContext")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[EvaluateInContext]]
  
  trait ModuleContextOptions extends StObject {
    
    var distDir: String
    
    var edgeFunctionEntry: PickEdgeFunctionDefinitio
    
    var env: js.Array[String]
    
    var moduleName: String
    
    def onWarning(warn: js.Error): Unit
    
    var useCache: Boolean
  }
  object ModuleContextOptions {
    
    inline def apply(
      distDir: String,
      edgeFunctionEntry: PickEdgeFunctionDefinitio,
      env: js.Array[String],
      moduleName: String,
      onWarning: js.Error => Unit,
      useCache: Boolean
    ): ModuleContextOptions = {
      val __obj = js.Dynamic.literal(distDir = distDir.asInstanceOf[js.Any], edgeFunctionEntry = edgeFunctionEntry.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], moduleName = moduleName.asInstanceOf[js.Any], onWarning = js.Any.fromFunction1(onWarning), useCache = useCache.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleContextOptions]
    }
    
    extension [Self <: ModuleContextOptions](x: Self) {
      
      inline def setDistDir(value: String): Self = StObject.set(x, "distDir", value.asInstanceOf[js.Any])
      
      inline def setEdgeFunctionEntry(value: PickEdgeFunctionDefinitio): Self = StObject.set(x, "edgeFunctionEntry", value.asInstanceOf[js.Any])
      
      inline def setEnv(value: js.Array[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvVarargs(value: String*): Self = StObject.set(x, "env", js.Array(value*))
      
      inline def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
      
      inline def setOnWarning(value: js.Error => Unit): Self = StObject.set(x, "onWarning", js.Any.fromFunction1(value))
      
      inline def setUseCache(value: Boolean): Self = StObject.set(x, "useCache", value.asInstanceOf[js.Any])
    }
  }
}
