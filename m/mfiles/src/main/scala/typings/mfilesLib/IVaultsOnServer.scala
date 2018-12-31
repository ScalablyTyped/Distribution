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

