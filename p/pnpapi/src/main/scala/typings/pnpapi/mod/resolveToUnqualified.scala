package typings.pnpapi.mod

import typings.pnpapi.anon.ConsiderBuiltins
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pnpapi", "resolveToUnqualified")
@js.native
object resolveToUnqualified extends js.Object {
  def apply(request: String): String | Null = js.native
  def apply(request: String, issuer: String): String | Null = js.native
  def apply(request: String, issuer: String, opts: ConsiderBuiltins): String | Null = js.native
  def apply(request: String, issuer: Null, opts: ConsiderBuiltins): String | Null = js.native
}

