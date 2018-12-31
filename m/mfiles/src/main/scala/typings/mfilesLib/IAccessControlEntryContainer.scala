package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccessControlEntryContainer extends js.Object {
  val IsEmpty: scala.Boolean
  def Add(AccessControlEntryKey: IAccessControlEntryKey, AccessControlEntryData: IAccessControlEntryData): scala.Unit
  def At(AccessControlEntryKey: IAccessControlEntryKey): IAccessControlEntryData
  def Clear(): scala.Unit
  def Clone(): IAccessControlEntryContainer
  def GetKeys(): IAccessControlEntryKeys
  def GetKeysWithPseudoUserDefinitions(): IAccessControlEntryKeys
  def HasKey(AccessControlEntryKey: IAccessControlEntryKey): scala.Boolean
  def Remove(AccessControlEntryKey: IAccessControlEntryKey): scala.Unit
}

