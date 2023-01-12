package typings.novaEditorNode.anon

import org.scalablytyped.runtime.StringDictionary
import typings.novaEditorNode.novaEditorNodeStrings.ignore
import typings.novaEditorNode.novaEditorNodeStrings.jsonrpc
import typings.novaEditorNode.novaEditorNodeStrings.pipe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cwd extends StObject {
  
  var args: js.UndefOr[js.Array[String]] = js.undefined
  
  var cwd: js.UndefOr[String] = js.undefined
  
  var env: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var matchers: js.UndefOr[js.Array[String]] = js.undefined
  
  var stdio: js.UndefOr[
    (js.Tuple3[pipe | ignore, pipe | ignore, pipe | ignore]) | pipe | ignore | jsonrpc | Double
  ] = js.undefined
}
object Cwd {
  
  inline def apply(): Cwd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cwd]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cwd] (val x: Self) extends AnyVal {
    
    inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    inline def setEnv(value: StringDictionary[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setMatchers(value: js.Array[String]): Self = StObject.set(x, "matchers", value.asInstanceOf[js.Any])
    
    inline def setMatchersUndefined: Self = StObject.set(x, "matchers", js.undefined)
    
    inline def setMatchersVarargs(value: String*): Self = StObject.set(x, "matchers", js.Array(value*))
    
    inline def setStdio(value: (js.Tuple3[pipe | ignore, pipe | ignore, pipe | ignore]) | pipe | ignore | jsonrpc | Double): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
    
    inline def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
  }
}
