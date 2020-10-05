package typings.node.vmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vm", "createContext")
@js.native
object createContext extends js.Object {
  def apply(): Context = js.native
  def apply(sandbox: js.UndefOr[scala.Nothing], options: CreateContextOptions): Context = js.native
  def apply(sandbox: Context): Context = js.native
  def apply(sandbox: Context, options: CreateContextOptions): Context = js.native
}

