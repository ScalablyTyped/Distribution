package typings.node.childProcessMod

import typings.node.nodeUrlMod.URL
import typings.node.processMod.global.NodeJS.ProcessEnv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessEnvOptions extends StObject {
  
  var cwd: js.UndefOr[String | URL] = js.undefined
  
  var env: js.UndefOr[ProcessEnv] = js.undefined
  
  var gid: js.UndefOr[Double] = js.undefined
  
  var uid: js.UndefOr[Double] = js.undefined
}
object ProcessEnvOptions {
  
  inline def apply(): ProcessEnvOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessEnvOptions]
  }
  
  extension [Self <: ProcessEnvOptions](x: Self) {
    
    inline def setCwd(value: String | URL): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
    
    inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
    
    inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
  }
}
