package typings.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cwd extends StObject {
  
  var cwd: js.UndefOr[js.Object] = js.native
  
  var destination: js.UndefOr[js.Any] = js.native
  
  var env: js.UndefOr[js.Object] = js.native
  
  var stdio: js.UndefOr[js.Array[_] | String] = js.native
  
  var waitForClose: js.UndefOr[String] = js.native
}
object Cwd {
  
  @scala.inline
  def apply(): Cwd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cwd]
  }
  
  @scala.inline
  implicit class CwdMutableBuilder[Self <: Cwd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCwd(value: js.Object): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    @scala.inline
    def setDestination(value: js.Any): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    @scala.inline
    def setEnv(value: js.Object): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    @scala.inline
    def setStdio(value: js.Array[_] | String): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
    
    @scala.inline
    def setStdioVarargs(value: js.Any*): Self = StObject.set(x, "stdio", js.Array(value :_*))
    
    @scala.inline
    def setWaitForClose(value: String): Self = StObject.set(x, "waitForClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForCloseUndefined: Self = StObject.set(x, "waitForClose", js.undefined)
  }
}
