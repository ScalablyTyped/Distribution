package typings.pnpapi.mod

import typings.pnpapi.anon.ConsiderBuiltinsExtensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pnpapi", "resolveRequest")
@js.native
object resolveRequest extends js.Object {
  def apply(request: String): String | Null = js.native
  def apply(request: String, issuer: String): String | Null = js.native
  def apply(request: String, issuer: String, opts: ConsiderBuiltinsExtensions): String | Null = js.native
  def apply(request: String, issuer: Null, opts: ConsiderBuiltinsExtensions): String | Null = js.native
}

