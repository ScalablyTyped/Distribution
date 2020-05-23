package typings.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IObjID
import typings.mfiles.IObjVer
import typings.mfiles.IObjectFiles
import typings.mfiles.IObjectVersion
import typings.mfiles.MFiles.MFBuiltInDocumentClass
import typings.mfiles.MFiles.MFBuiltInObjectClass
import typings.mfiles.MFiles.MFObjectVersionFlag
import typings.mfiles.MFiles.MFSpecialObjectFlag
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ObjectVersion")
@js.native
class ObjectVersion () extends IObjectVersion {
  /* CompleteClass */
  override val AccessedByMeUtc: Date = js.native
  /* CompleteClass */
  override val CheckedOutAtUtc: Date = js.native
  /* CompleteClass */
  override val CheckedOutTo: Double = js.native
  /* CompleteClass */
  override val CheckedOutToHostName: String = js.native
  /* CompleteClass */
  override val CheckedOutToUserName: String = js.native
  /* CompleteClass */
  override val CheckedOutVersion: Double = js.native
  /* CompleteClass */
  override val Class: MFBuiltInDocumentClass | MFBuiltInObjectClass | Double = js.native
  /* CompleteClass */
  override val CreatedUtc: Date = js.native
  /* CompleteClass */
  override val Deleted: Boolean = js.native
  /* CompleteClass */
  override val DisplayID: String = js.native
  /* CompleteClass */
  override val DisplayIDAvailable: Boolean = js.native
  /* CompleteClass */
  override val Files: IObjectFiles = js.native
  /* CompleteClass */
  override val FilesCount: Double = js.native
  /* CompleteClass */
  override val HasAssignments: Boolean = js.native
  /* CompleteClass */
  override val HasSharedFiles: Boolean = js.native
  /* CompleteClass */
  override val IsAccessedByMeValid: Boolean = js.native
  /* CompleteClass */
  override val IsObjectConflict: Boolean = js.native
  /* CompleteClass */
  override val IsObjectShortcut: Boolean = js.native
  /* CompleteClass */
  override val LastModifiedUtc: Date = js.native
  /* CompleteClass */
  override val LatestCheckedInVersion: Double = js.native
  /* CompleteClass */
  override val LatestCheckedInVersionOrCheckedOutVersion: Boolean = js.native
  /* CompleteClass */
  override val ObjVer: IObjVer = js.native
  /* CompleteClass */
  override val ObjectCheckedOut: Boolean = js.native
  /* CompleteClass */
  override val ObjectCheckedOutToThisUserOnAnyComputer: Boolean = js.native
  /* CompleteClass */
  override val ObjectCheckedOutToThisUserOnThisComputer: Boolean = js.native
  /* CompleteClass */
  override val ObjectFlags: MFSpecialObjectFlag = js.native
  /* CompleteClass */
  override val ObjectGUID: String = js.native
  /* CompleteClass */
  override val ObjectVersionFlags: MFObjectVersionFlag = js.native
  /* CompleteClass */
  override val OriginalObjID: IObjID = js.native
  /* CompleteClass */
  override val OriginalVaultGUID: String = js.native
  /* CompleteClass */
  override val SingleFile: Boolean = js.native
  /* CompleteClass */
  override val ThisVersionCheckedOut: Boolean = js.native
  /* CompleteClass */
  override val ThisVersionLatestToThisUser: Boolean = js.native
  /* CompleteClass */
  override val Title: String = js.native
  /* CompleteClass */
  override val VersionGUID: String = js.native
  /* CompleteClass */
  override val VisibleAfterOperation: Boolean = js.native
  /* CompleteClass */
  override def Clone(): IObjectVersion = js.native
  /* CompleteClass */
  override def GetNameForFileSystem(IncludeID: Boolean): String = js.native
  /* CompleteClass */
  override def GetNameForFileSystemEx(IncludeID: Boolean, UseOriginalID: Boolean): String = js.native
}

@JSGlobal("MFiles.ObjectVersion")
@js.native
object ObjectVersion extends Instantiable0[IObjectVersion]

