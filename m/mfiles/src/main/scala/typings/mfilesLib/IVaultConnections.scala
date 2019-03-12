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
    Add: (scala.Double, IVaultConnection) => scala.Unit,
    Count: scala.Double,
    GetVaultConnectionByName: java.lang.String => IVaultConnection,
    GetVaultConnectionIndexByName: java.lang.String => scala.Double,
    Item: scala.Double => IVaultConnection,
    Remove: scala.Double => scala.Unit
  ): IVaultConnections = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Count = Count, GetVaultConnectionByName = js.Any.fromFunction1(GetVaultConnectionByName), GetVaultConnectionIndexByName = js.Any.fromFunction1(GetVaultConnectionIndexByName), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IVaultConnections]
  }
}

