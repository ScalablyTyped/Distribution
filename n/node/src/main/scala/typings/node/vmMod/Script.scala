package typings.node.vmMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vm", "Script")
@js.native
class Script protected () extends js.Object {
  def this(code: java.lang.String) = this()
  def this(code: java.lang.String, options: ScriptOptions) = this()
  def createCachedData(): Buffer = js.native
  def runInContext(contextifiedSandbox: Context): js.Any = js.native
  def runInContext(contextifiedSandbox: Context, options: RunningScriptOptions): js.Any = js.native
  def runInNewContext(): js.Any = js.native
  def runInNewContext(sandbox: Context): js.Any = js.native
  def runInNewContext(sandbox: Context, options: RunningScriptOptions): js.Any = js.native
  def runInThisContext(): js.Any = js.native
  def runInThisContext(options: RunningScriptOptions): js.Any = js.native
}

