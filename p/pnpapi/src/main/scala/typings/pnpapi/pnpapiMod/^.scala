package typings.pnpapi.pnpapiMod

import typings.pnpapi.Anon_ConsiderBuiltins
import typings.pnpapi.Anon_ConsiderBuiltinsExtensions
import typings.pnpapi.Anon_Extensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pnpapi", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def findPackageLocator(location: String): PackageLocator | Null = js.native
  def getPackageInformation(locator: PackageLocator): PackageInformation = js.native
  def resolveRequest(request: String): String | Null = js.native
  def resolveRequest(request: String, issuer: String): String | Null = js.native
  def resolveRequest(request: String, issuer: String, opts: Anon_ConsiderBuiltinsExtensions): String | Null = js.native
  def resolveRequest(request: String, issuer: Null, opts: Anon_ConsiderBuiltinsExtensions): String | Null = js.native
  def resolveToUnqualified(request: String): String | Null = js.native
  def resolveToUnqualified(request: String, issuer: String): String | Null = js.native
  def resolveToUnqualified(request: String, issuer: String, opts: Anon_ConsiderBuiltins): String | Null = js.native
  def resolveToUnqualified(request: String, issuer: Null, opts: Anon_ConsiderBuiltins): String | Null = js.native
  def resolveUnqualified(unqualified: String): String = js.native
  def resolveUnqualified(unqualified: String, opts: Anon_Extensions): String = js.native
  def setup(): Unit = js.native
}

