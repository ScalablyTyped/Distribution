package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultConnections extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, VaultConnection: IVaultConnection): scala.Unit
  def GetVaultConnectionByName(VaultConnectionName: java.lang.String): IVaultConnection
  def GetVaultConnectionIndexByName(VaultConnectionName: java.lang.String): scala.Double
  def Item(Index: scala.Double): IVaultConnection
  def Remove(Index: scala.Double): scala.Unit
}

object IVaultConnections {
  @scala.inline
  def apply(
    Add: js.Function2[scala.Double, IVaultConnection, scala.Unit],
    Count: scala.Double,
    GetVaultConnectionByName: js.Function1[java.lang.String, IVaultConnection],
    GetVaultConnectionIndexByName: js.Function1[java.lang.String, scala.Double],
    Item: js.Function1[scala.Double, IVaultConnection],
    Remove: js.Function1[scala.Double, scala.Unit]
  ): IVaultConnections = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Add")(Add)
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("GetVaultConnectionByName")(GetVaultConnectionByName)
    __obj.updateDynamic("GetVaultConnectionIndexByName")(GetVaultConnectionIndexByName)
    __obj.updateDynamic("Item")(Item)
    __obj.updateDynamic("Remove")(Remove)
    __obj.asInstanceOf[IVaultConnections]
  }
}

