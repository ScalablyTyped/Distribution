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

