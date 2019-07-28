package typings.mfiles.MFilesNs

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IAccessControlEntryContainer
import typings.mfiles.IAccessControlEntryData
import typings.mfiles.IAccessControlEntryKey
import typings.mfiles.IAccessControlEntryKeys
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.AccessControlEntryContainer")
@js.native
class AccessControlEntryContainer () extends IAccessControlEntryContainer {
  /* CompleteClass */
  override val IsEmpty: Boolean = js.native
  /* CompleteClass */
  override def Add(AccessControlEntryKey: IAccessControlEntryKey, AccessControlEntryData: IAccessControlEntryData): Unit = js.native
  /* CompleteClass */
  override def At(AccessControlEntryKey: IAccessControlEntryKey): IAccessControlEntryData = js.native
  /* CompleteClass */
  override def Clear(): Unit = js.native
  /* CompleteClass */
  override def Clone(): IAccessControlEntryContainer = js.native
  /* CompleteClass */
  override def GetKeys(): IAccessControlEntryKeys = js.native
  /* CompleteClass */
  override def GetKeysWithPseudoUserDefinitions(): IAccessControlEntryKeys = js.native
  /* CompleteClass */
  override def HasKey(AccessControlEntryKey: IAccessControlEntryKey): Boolean = js.native
  /* CompleteClass */
  override def Remove(AccessControlEntryKey: IAccessControlEntryKey): Unit = js.native
}

@JSGlobal("MFiles.AccessControlEntryContainer")
@js.native
object AccessControlEntryContainer extends Instantiable0[IAccessControlEntryContainer]

