package typings.mfiles

import typings.mfiles.MFilesNs.MFServerConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAuthenticationResultServerFinal extends js.Object {
  val ServerConnection: MFServerConnection
}

object IAuthenticationResultServerFinal {
  @scala.inline
  def apply(ServerConnection: MFServerConnection): IAuthenticationResultServerFinal = {
    val __obj = js.Dynamic.literal(ServerConnection = ServerConnection)
  
    __obj.asInstanceOf[IAuthenticationResultServerFinal]
  }
}

