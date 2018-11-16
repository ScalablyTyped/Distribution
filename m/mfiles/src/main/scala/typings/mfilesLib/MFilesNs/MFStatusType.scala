package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFStatusType extends js.Object

@JSGlobal("MFiles.MFStatusType")
@js.native
object MFStatusType extends js.Object {
  @js.native
  sealed trait CheckedOut
    extends mfilesLib.MFilesNs.MFStatusType
  
  @js.native
  sealed trait CheckedOutAt
    extends mfilesLib.MFilesNs.MFStatusType
  
  @js.native
  sealed trait CheckedOutTo
    extends mfilesLib.MFilesNs.MFStatusType
  
  @js.native
  sealed trait Deleted
    extends mfilesLib.MFilesNs.MFStatusType
  
  @js.native
  sealed trait ExtID
    extends mfilesLib.MFilesNs.MFStatusType
  
  @js.native
  sealed trait IsLatestCheckedInVersion
    extends mfilesLib.MFilesNs.MFStatusType
  
  @js.native
  sealed trait LatestOrSpecific
    extends mfilesLib.MFilesNs.MFStatusType
  
  @js.native
  sealed trait ObjectFlags
    extends mfilesLib.MFilesNs.MFStatusType
  
  @js.native
  sealed trait ObjectID
    extends mfilesLib.MFilesNs.MFStatusType
  
  @js.native
  sealed trait ObjectTypeAndID
    extends mfilesLib.MFilesNs.MFStatusType
  
  @js.native
  sealed trait ObjectTypeID
    extends mfilesLib.MFilesNs.MFStatusType
  
  @js.native
  sealed trait ObjectVersionID
    extends mfilesLib.MFilesNs.MFStatusType
  
  @js.native
  sealed trait OriginalObjectID
    extends mfilesLib.MFilesNs.MFStatusType
  
  @js.native
  sealed trait OriginalObjectIDSegment
    extends mfilesLib.MFilesNs.MFStatusType
  
  @js.native
  sealed trait OriginalObjectType
    extends mfilesLib.MFilesNs.MFStatusType
  
  @js.native
  sealed trait OriginalVaultGUID
    extends mfilesLib.MFilesNs.MFStatusType
  
  /* 0 */ val CheckedOut: CheckedOut with scala.Double = js.native
  /* 2 */ val CheckedOutAt: CheckedOutAt with scala.Double = js.native
  /* 1 */ val CheckedOutTo: CheckedOutTo with scala.Double = js.native
  /* 5 */ val Deleted: Deleted with scala.Double = js.native
  /* 8 */ val ExtID: ExtID with scala.Double = js.native
  /* 7 */ val IsLatestCheckedInVersion: IsLatestCheckedInVersion with scala.Double = js.native
  /* 9 */ val LatestOrSpecific: LatestOrSpecific with scala.Double = js.native
  /* 11 */ val ObjectFlags: ObjectFlags with scala.Double = js.native
  /* 3 */ val ObjectID: ObjectID with scala.Double = js.native
  /* 10 */ val ObjectTypeAndID: ObjectTypeAndID with scala.Double = js.native
  /* 6 */ val ObjectTypeID: ObjectTypeID with scala.Double = js.native
  /* 4 */ val ObjectVersionID: ObjectVersionID with scala.Double = js.native
  /* 14 */ val OriginalObjectID: OriginalObjectID with scala.Double = js.native
  /* 15 */ val OriginalObjectIDSegment: OriginalObjectIDSegment with scala.Double = js.native
  /* 13 */ val OriginalObjectType: OriginalObjectType with scala.Double = js.native
  /* 12 */ val OriginalVaultGUID: OriginalVaultGUID with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFStatusType with scala.Double] = js.native
}

