package typings
package pdf2imageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofimported_vm extends js.Object {
  var Script: org.scalablytyped.runtime.Instantiable1[/* code */ java.lang.String, nodeLib.vmMod.Script] = js.native
  def compileFunction(
    code: java.lang.String,
    params: js.Array[java.lang.String],
    options: nodeLib.vmMod.CompileFunctionOptions
  ): js.Function = js.native
  def createContext(): nodeLib.vmMod.Context = js.native
  def createContext(sandbox: nodeLib.vmMod.Context): nodeLib.vmMod.Context = js.native
  def isContext(sandbox: nodeLib.vmMod.Context): scala.Boolean = js.native
  def runInContext(code: java.lang.String, contextifiedSandbox: nodeLib.vmMod.Context): js.Any = js.native
  def runInContext(code: java.lang.String, contextifiedSandbox: nodeLib.vmMod.Context, options: java.lang.String): js.Any = js.native
  def runInContext(
    code: java.lang.String,
    contextifiedSandbox: nodeLib.vmMod.Context,
    options: nodeLib.vmMod.RunningScriptOptions
  ): js.Any = js.native
  def runInNewContext(code: java.lang.String): js.Any = js.native
  def runInNewContext(code: java.lang.String, sandbox: nodeLib.vmMod.Context): js.Any = js.native
  def runInNewContext(code: java.lang.String, sandbox: nodeLib.vmMod.Context, options: java.lang.String): js.Any = js.native
  def runInNewContext(
    code: java.lang.String,
    sandbox: nodeLib.vmMod.Context,
    options: nodeLib.vmMod.RunningScriptOptions
  ): js.Any = js.native
  def runInThisContext(code: java.lang.String): js.Any = js.native
  def runInThisContext(code: java.lang.String, options: java.lang.String): js.Any = js.native
  def runInThisContext(code: java.lang.String, options: nodeLib.vmMod.RunningScriptOptions): js.Any = js.native
}

