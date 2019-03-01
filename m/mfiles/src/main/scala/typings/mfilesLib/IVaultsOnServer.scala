package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultsOnServer extends js.Object {
  val Count: scala.Double
  def GetVaultByGUID(GUID: java.lang.String): IVaultOnServer
  def GetVaultByName(Name: java.lang.String): IVaultOnServer
  def GetVaultIndexByGUID(GUID: java.lang.String): scala.Double
  def GetVaultIndexByName(Name: java.lang.String): scala.Double
  def Item(Index: scala.Double): IVaultOnServer
}

object IVaultsOnServer {
  @scala.inline
  def apply(
    Count: scala.Double,
    GetVaultByGUID: js.Function1[java.lang.String, IVaultOnServer],
    GetVaultByName: js.Function1[java.lang.String, IVaultOnServer],
    GetVaultIndexByGUID: js.Function1[java.lang.String, scala.Double],
    GetVaultIndexByName: js.Function1[java.lang.String, scala.Double],
    Item: js.Function1[scala.Double, IVaultOnServer]
  ): IVaultsOnServer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("GetVaultByGUID")(GetVaultByGUID)
    __obj.updateDynamic("GetVaultByName")(GetVaultByName)
    __obj.updateDynamic("GetVaultIndexByGUID")(GetVaultIndexByGUID)
    __obj.updateDynamic("GetVaultIndexByName")(GetVaultIndexByName)
    __obj.updateDynamic("Item")(Item)
    __obj.asInstanceOf[IVaultsOnServer]
  }
}

