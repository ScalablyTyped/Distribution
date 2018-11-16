package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFDataType extends js.Object

@JSGlobal("MFiles.MFDataType")
@js.native
object MFDataType extends js.Object {
  @js.native
  sealed trait ACL
    extends mfilesLib.MFilesNs.MFDataType
  
  @js.native
  sealed trait Boolean
    extends mfilesLib.MFilesNs.MFDataType
  
  @js.native
  sealed trait Date
    extends mfilesLib.MFilesNs.MFDataType
  
  @js.native
  sealed trait FILETIME
    extends mfilesLib.MFilesNs.MFDataType
  
  @js.native
  sealed trait Floating
    extends mfilesLib.MFilesNs.MFDataType
  
  @js.native
  sealed trait Integer
    extends mfilesLib.MFilesNs.MFDataType
  
  @js.native
  sealed trait Integer64
    extends mfilesLib.MFilesNs.MFDataType
  
  @js.native
  sealed trait Lookup
    extends mfilesLib.MFilesNs.MFDataType
  
  @js.native
  sealed trait MultiLineText
    extends mfilesLib.MFilesNs.MFDataType
  
  @js.native
  sealed trait MultiSelectLookup
    extends mfilesLib.MFilesNs.MFDataType
  
  @js.native
  sealed trait Text
    extends mfilesLib.MFilesNs.MFDataType
  
  @js.native
  sealed trait Time
    extends mfilesLib.MFilesNs.MFDataType
  
  @js.native
  sealed trait Timestamp
    extends mfilesLib.MFilesNs.MFDataType
  
  @js.native
  sealed trait Uninitialized
    extends mfilesLib.MFilesNs.MFDataType
  
  /* 14 */ val ACL: ACL with scala.Double = js.native
  /* 8 */ val Boolean: Boolean with scala.Double = js.native
  /* 5 */ val Date: Date with scala.Double = js.native
  /* 12 */ val FILETIME: FILETIME with scala.Double = js.native
  /* 3 */ val Floating: Floating with scala.Double = js.native
  /* 2 */ val Integer: Integer with scala.Double = js.native
  /* 11 */ val Integer64: Integer64 with scala.Double = js.native
  /* 9 */ val Lookup: Lookup with scala.Double = js.native
  /* 13 */ val MultiLineText: MultiLineText with scala.Double = js.native
  /* 10 */ val MultiSelectLookup: MultiSelectLookup with scala.Double = js.native
  /* 1 */ val Text: Text with scala.Double = js.native
  /* 6 */ val Time: Time with scala.Double = js.native
  /* 7 */ val Timestamp: Timestamp with scala.Double = js.native
  /* 0 */ val Uninitialized: Uninitialized with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFDataType with scala.Double] = js.native
}

