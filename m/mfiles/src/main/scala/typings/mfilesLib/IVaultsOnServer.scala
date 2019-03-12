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
    GetVaultByGUID: java.lang.String => IVaultOnServer,
    GetVaultByName: java.lang.String => IVaultOnServer,
    GetVaultIndexByGUID: java.lang.String => scala.Double,
    GetVaultIndexByName: java.lang.String => scala.Double,
    Item: scala.Double => IVaultOnServer
  ): IVaultsOnServer = {
    val __obj = js.Dynamic.literal(Count = Count, GetVaultByGUID = js.Any.fromFunction1(GetVaultByGUID), GetVaultByName = js.Any.fromFunction1(GetVaultByName), GetVaultIndexByGUID = js.Any.fromFunction1(GetVaultIndexByGUID), GetVaultIndexByName = js.Any.fromFunction1(GetVaultIndexByName), Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[IVaultsOnServer]
  }
}

