package typings.novaEditorNode.anon

import org.scalablytyped.runtime.StringDictionary
import typings.novaEditorNode.novaEditorNodeBooleans.`true`
import typings.novaEditorNode.novaEditorNodeStrings.ignore
import typings.novaEditorNode.novaEditorNodeStrings.jsonrpc
import typings.novaEditorNode.novaEditorNodeStrings.pipe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cwd extends js.Object {
  
  var args: js.UndefOr[js.Array[String]] = js.native
  
  var cwd: js.UndefOr[String] = js.native
  
  var env: js.UndefOr[StringDictionary[String]] = js.native
  
  var shell: js.UndefOr[`true` | String] = js.native
  
  var stdio: js.UndefOr[
    (js.Tuple3[pipe | ignore, pipe | ignore, pipe | ignore]) | pipe | ignore | jsonrpc | Double
  ] = js.native
}
object Cwd {
  
  @scala.inline
  def apply(): Cwd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cwd]
  }
  
  @scala.inline
  implicit class CwdOps[Self <: Cwd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    
    @scala.inline
    def setEnv(value: StringDictionary[String]): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setShell(value: `true` | String): Self = this.set("shell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShell: Self = this.set("shell", js.undefined)
    
    @scala.inline
    def setStdio(value: (js.Tuple3[pipe | ignore, pipe | ignore, pipe | ignore]) | pipe | ignore | jsonrpc | Double): Self = this.set("stdio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStdio: Self = this.set("stdio", js.undefined)
  }
}
