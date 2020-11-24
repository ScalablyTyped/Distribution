package typings.node.http2Mod

import typings.node.tlsMod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecureClientSessionOptions
  extends ConnectionOptions
     with ClientSessionOptions
object SecureClientSessionOptions {
  
  @scala.inline
  def apply(): SecureClientSessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecureClientSessionOptions]
  }
}
