package typings.pdf2image

import org.scalablytyped.runtime.Instantiable1
import typings.node.vmMod.CompileFunctionOptions
import typings.node.vmMod.Context
import typings.node.vmMod.CreateContextOptions
import typings.node.vmMod.RunningScriptOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofimportedVm extends js.Object {
  var Script: Instantiable1[/* code */ String, typings.node.vmMod.Script] = js.native
  def compileFunction(code: String): js.Function = js.native
  def compileFunction(code: String, params: js.Array[String]): js.Function = js.native
  def compileFunction(code: String, params: js.Array[String], options: CompileFunctionOptions): js.Function = js.native
  def createContext(): Context = js.native
  def createContext(sandbox: Context): Context = js.native
  def createContext(sandbox: Context, options: CreateContextOptions): Context = js.native
  def isContext(sandbox: Context): Boolean = js.native
  def runInContext(code: String, contextifiedSandbox: Context): js.Any = js.native
  def runInContext(code: String, contextifiedSandbox: Context, options: String): js.Any = js.native
  def runInContext(code: String, contextifiedSandbox: Context, options: RunningScriptOptions): js.Any = js.native
  def runInNewContext(code: String): js.Any = js.native
  def runInNewContext(code: String, sandbox: Context): js.Any = js.native
  def runInNewContext(code: String, sandbox: Context, options: String): js.Any = js.native
  def runInNewContext(code: String, sandbox: Context, options: RunningScriptOptions): js.Any = js.native
  def runInThisContext(code: String): js.Any = js.native
  def runInThisContext(code: String, options: String): js.Any = js.native
  def runInThisContext(code: String, options: RunningScriptOptions): js.Any = js.native
}

