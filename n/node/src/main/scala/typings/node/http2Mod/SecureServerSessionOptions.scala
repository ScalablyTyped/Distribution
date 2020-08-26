package typings.node.http2Mod

import typings.node.tlsMod.TlsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecureServerSessionOptions
  extends TlsOptions
     with ServerSessionOptions

object SecureServerSessionOptions {
  @scala.inline
  def apply(): SecureServerSessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecureServerSessionOptions]
  }
}

