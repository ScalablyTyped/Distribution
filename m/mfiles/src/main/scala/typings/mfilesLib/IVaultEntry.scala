package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IVaultEntry extends js.Object {
  val Events: IVaultEntryEvents
  val Vault: IVault
  val VaultCore: IVaultCore
  val VaultUI: IVaultUI
  def NotifyVaultEntry(ID: java.lang.String, data1: js.Any, data2: js.Any): js.Any
}

