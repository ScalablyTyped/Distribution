package typings.node.vmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vm", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compileFunction(code: java.lang.String, params: js.Array[java.lang.String], options: CompileFunctionOptions): js.Function = js.native
  def createContext(): Context = js.native
  def createContext(sandbox: Context): Context = js.native
  def createContext(sandbox: Context, options: CreateContextOptions): Context = js.native
  def isContext(sandbox: Context): Boolean = js.native
  def runInContext(code: java.lang.String, contextifiedSandbox: Context): js.Any = js.native
  def runInContext(code: java.lang.String, contextifiedSandbox: Context, options: java.lang.String): js.Any = js.native
  def runInContext(code: java.lang.String, contextifiedSandbox: Context, options: RunningScriptOptions): js.Any = js.native
  def runInNewContext(code: java.lang.String): js.Any = js.native
  def runInNewContext(code: java.lang.String, sandbox: Context): js.Any = js.native
  def runInNewContext(code: java.lang.String, sandbox: Context, options: java.lang.String): js.Any = js.native
  def runInNewContext(code: java.lang.String, sandbox: Context, options: RunningScriptOptions): js.Any = js.native
  def runInThisContext(code: java.lang.String): js.Any = js.native
  def runInThisContext(code: java.lang.String, options: java.lang.String): js.Any = js.native
  def runInThisContext(code: java.lang.String, options: RunningScriptOptions): js.Any = js.native
}

