package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAuthenticationResultServerFinal extends js.Object {
  val ServerConnection: mfilesLib.MFilesNs.MFServerConnection
}

object IAuthenticationResultServerFinal {
  @scala.inline
  def apply(ServerConnection: mfilesLib.MFilesNs.MFServerConnection): IAuthenticationResultServerFinal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ServerConnection")(ServerConnection)
    __obj.asInstanceOf[IAuthenticationResultServerFinal]
  }
}

