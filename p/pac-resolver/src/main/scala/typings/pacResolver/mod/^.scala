package typings.pacResolver.mod

import typings.node.Buffer
import typings.pacResolver.anon.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pac-resolver", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Returns an asynchronous `FindProxyForURL()` function
    * from the given JS string (from a PAC file).
    *
    * @param {String} str JS string
    * @param {Object} opts optional "options" object
    * @return {Function} async resolver function
    */
  def apply(_str: String): FnCall = js.native
  def apply(_str: String, _opts: PacResolverOptions): FnCall = js.native
  def apply(_str: Buffer): FnCall = js.native
  def apply(_str: Buffer, _opts: PacResolverOptions): FnCall = js.native
}
