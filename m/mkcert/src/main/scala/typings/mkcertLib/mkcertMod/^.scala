package typings
package mkcertLib.mkcertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mkcert", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createCA(caCerticateInfo: CACertificateInfo): js.Promise[Certificate] = js.native
  def createCert(certicateInfo: CertificateInfo): js.Promise[Certificate] = js.native
}

