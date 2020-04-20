package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultConnections extends js.Object {
  val Count: Double
  def Add(Index: Double, VaultConnection: IVaultConnection): Unit
  def GetVaultConnectionByName(VaultConnectionName: String): IVaultConnection
  def GetVaultConnectionIndexByName(VaultConnectionName: String): Double
  def Item(Index: Double): IVaultConnection
  def Remove(Index: Double): Unit
}

object IVaultConnections {
  @scala.inline
  def apply(
    Add: (Double, IVaultConnection) => Unit,
    Count: Double,
    GetVaultConnectionByName: String => IVaultConnection,
    GetVaultConnectionIndexByName: String => Double,
    Item: Double => IVaultConnection,
    Remove: Double => Unit
  ): IVaultConnections = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Count = Count.asInstanceOf[js.Any], GetVaultConnectionByName = js.Any.fromFunction1(GetVaultConnectionByName), GetVaultConnectionIndexByName = js.Any.fromFunction1(GetVaultConnectionIndexByName), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IVaultConnections]
  }
}

