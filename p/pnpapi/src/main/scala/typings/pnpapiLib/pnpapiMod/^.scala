package typings
package pnpapiLib.pnpapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pnpapi", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def findPackageLocator(location: java.lang.String): PackageLocator | scala.Null = js.native
  def getPackageInformation(locator: PackageLocator): PackageInformation = js.native
  def resolveRequest(request: java.lang.String): java.lang.String | scala.Null = js.native
  def resolveRequest(request: java.lang.String, issuer: java.lang.String): java.lang.String | scala.Null = js.native
  def resolveRequest(
    request: java.lang.String,
    issuer: java.lang.String,
    opts: pnpapiLib.Anon_ConsiderBuiltinsExtensions
  ): java.lang.String | scala.Null = js.native
  def resolveRequest(request: java.lang.String, issuer: scala.Null, opts: pnpapiLib.Anon_ConsiderBuiltinsExtensions): java.lang.String | scala.Null = js.native
  def resolveToUnqualified(request: java.lang.String): java.lang.String | scala.Null = js.native
  def resolveToUnqualified(request: java.lang.String, issuer: java.lang.String): java.lang.String | scala.Null = js.native
  def resolveToUnqualified(request: java.lang.String, issuer: java.lang.String, opts: pnpapiLib.Anon_ConsiderBuiltins): java.lang.String | scala.Null = js.native
  def resolveToUnqualified(request: java.lang.String, issuer: scala.Null, opts: pnpapiLib.Anon_ConsiderBuiltins): java.lang.String | scala.Null = js.native
  def resolveUnqualified(unqualified: java.lang.String): java.lang.String = js.native
  def resolveUnqualified(unqualified: java.lang.String, opts: pnpapiLib.Anon_Extensions): java.lang.String = js.native
  def setup(): scala.Unit = js.native
}

