package typings.npmcliArborist.mod

import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.node.processMod.global.NodeJS.Signals
import typings.npmcliPackageJson.mod.PackageJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptRun extends StObject {
  
  var cmd: String
  
  var code: Double
  
  var env: ProcessEnv
  
  var event: String
  
  var path: String
  
  var pkg: PackageJson
  
  var signal: Signals
  
  var stderr: String
  
  var stdout: String
}
object ScriptRun {
  
  inline def apply(
    cmd: String,
    code: Double,
    env: ProcessEnv,
    event: String,
    path: String,
    pkg: PackageJson,
    signal: Signals,
    stderr: String,
    stdout: String
  ): ScriptRun = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pkg = pkg.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptRun]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScriptRun] (val x: Self) extends AnyVal {
    
    inline def setCmd(value: String): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPkg(value: PackageJson): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
    
    inline def setSignal(value: Signals): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setStderr(value: String): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
    
    inline def setStdout(value: String): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
  }
}
