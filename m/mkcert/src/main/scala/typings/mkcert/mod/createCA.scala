package typings.mkcert.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mkcert", "createCA")
@js.native
object createCA extends js.Object {
  
  def apply(caCerticateInfo: CACertificateInfo): js.Promise[Certificate] = js.native
}
