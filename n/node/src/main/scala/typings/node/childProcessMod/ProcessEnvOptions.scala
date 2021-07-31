package typings.node.childProcessMod

import typings.node.processMod.global.NodeJS.ProcessEnv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessEnvOptions extends StObject {
  
  var cwd: js.UndefOr[String] = js.undefined
  
  var env: js.UndefOr[ProcessEnv] = js.undefined
  
  var gid: js.UndefOr[Double] = js.undefined
  
  var uid: js.UndefOr[Double] = js.undefined
}
object ProcessEnvOptions {
  
  @scala.inline
  def apply(): ProcessEnvOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessEnvOptions]
  }
  
  @scala.inline
  implicit class ProcessEnvOptionsMutableBuilder[Self <: ProcessEnvOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    @scala.inline
    def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    @scala.inline
    def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
    
    @scala.inline
    def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
  }
}
