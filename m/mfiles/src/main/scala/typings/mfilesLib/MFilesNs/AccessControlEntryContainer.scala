package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.AccessControlEntryContainer")
@js.native
class AccessControlEntryContainer ()
  extends mfilesLib.IAccessControlEntryContainer {
  /* CompleteClass */
  override val IsEmpty: scala.Boolean = js.native
  /* CompleteClass */
  override def Add(
    AccessControlEntryKey: mfilesLib.IAccessControlEntryKey,
    AccessControlEntryData: mfilesLib.IAccessControlEntryData
  ): scala.Unit = js.native
  /* CompleteClass */
  override def At(AccessControlEntryKey: mfilesLib.IAccessControlEntryKey): mfilesLib.IAccessControlEntryData = js.native
  /* CompleteClass */
  override def Clear(): scala.Unit = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IAccessControlEntryContainer = js.native
  /* CompleteClass */
  override def GetKeys(): mfilesLib.IAccessControlEntryKeys = js.native
  /* CompleteClass */
  override def GetKeysWithPseudoUserDefinitions(): mfilesLib.IAccessControlEntryKeys = js.native
  /* CompleteClass */
  override def HasKey(AccessControlEntryKey: mfilesLib.IAccessControlEntryKey): scala.Boolean = js.native
  /* CompleteClass */
  override def Remove(AccessControlEntryKey: mfilesLib.IAccessControlEntryKey): scala.Unit = js.native
}

@JSGlobal("MFiles.AccessControlEntryContainer")
@js.native
object AccessControlEntryContainer
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IAccessControlEntryContainer]

