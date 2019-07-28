package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultsOnServer extends js.Object {
  val Count: Double
  def GetVaultByGUID(GUID: String): IVaultOnServer
  def GetVaultByName(Name: String): IVaultOnServer
  def GetVaultIndexByGUID(GUID: String): Double
  def GetVaultIndexByName(Name: String): Double
  def Item(Index: Double): IVaultOnServer
}

object IVaultsOnServer {
  @scala.inline
  def apply(
    Count: Double,
    GetVaultByGUID: String => IVaultOnServer,
    GetVaultByName: String => IVaultOnServer,
    GetVaultIndexByGUID: String => Double,
    GetVaultIndexByName: String => Double,
    Item: Double => IVaultOnServer
  ): IVaultsOnServer = {
    val __obj = js.Dynamic.literal(Count = Count, GetVaultByGUID = js.Any.fromFunction1(GetVaultByGUID), GetVaultByName = js.Any.fromFunction1(GetVaultByName), GetVaultIndexByGUID = js.Any.fromFunction1(GetVaultIndexByGUID), GetVaultIndexByName = js.Any.fromFunction1(GetVaultIndexByName), Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[IVaultsOnServer]
  }
}

