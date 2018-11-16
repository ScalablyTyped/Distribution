package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFPredefinedSearchFilterType extends js.Object

@JSGlobal("MFiles.MFPredefinedSearchFilterType")
@js.native
object MFPredefinedSearchFilterType extends js.Object {
  @js.native
  sealed trait DocumentsAccessedByMeLastMonth
    extends mfilesLib.MFilesNs.MFPredefinedSearchFilterType
  
  @js.native
  sealed trait DocumentsAccessedByMeLastWeek
    extends mfilesLib.MFilesNs.MFPredefinedSearchFilterType
  
  @js.native
  sealed trait DocumentsAccessedByMeLastYear
    extends mfilesLib.MFilesNs.MFPredefinedSearchFilterType
  
  @js.native
  sealed trait DocumentsAccessedByMeToday
    extends mfilesLib.MFilesNs.MFPredefinedSearchFilterType
  
  @js.native
  sealed trait DocumentsModifiedLastMonth
    extends mfilesLib.MFilesNs.MFPredefinedSearchFilterType
  
  @js.native
  sealed trait DocumentsModifiedLastWeek
    extends mfilesLib.MFilesNs.MFPredefinedSearchFilterType
  
  @js.native
  sealed trait DocumentsModifiedLastYear
    extends mfilesLib.MFilesNs.MFPredefinedSearchFilterType
  
  @js.native
  sealed trait DocumentsModifiedToday
    extends mfilesLib.MFilesNs.MFPredefinedSearchFilterType
  
  @js.native
  sealed trait ObjectType
    extends mfilesLib.MFilesNs.MFPredefinedSearchFilterType
  
  @js.native
  sealed trait Unspecified
    extends mfilesLib.MFilesNs.MFPredefinedSearchFilterType
  
  /* 30006 */ val DocumentsAccessedByMeLastMonth: DocumentsAccessedByMeLastMonth with scala.Double = js.native
  /* 30005 */ val DocumentsAccessedByMeLastWeek: DocumentsAccessedByMeLastWeek with scala.Double = js.native
  /* 30007 */ val DocumentsAccessedByMeLastYear: DocumentsAccessedByMeLastYear with scala.Double = js.native
  /* 30004 */ val DocumentsAccessedByMeToday: DocumentsAccessedByMeToday with scala.Double = js.native
  /* 30002 */ val DocumentsModifiedLastMonth: DocumentsModifiedLastMonth with scala.Double = js.native
  /* 30001 */ val DocumentsModifiedLastWeek: DocumentsModifiedLastWeek with scala.Double = js.native
  /* 30003 */ val DocumentsModifiedLastYear: DocumentsModifiedLastYear with scala.Double = js.native
  /* 30000 */ val DocumentsModifiedToday: DocumentsModifiedToday with scala.Double = js.native
  /* 1 */ val ObjectType: ObjectType with scala.Double = js.native
  /* 0 */ val Unspecified: Unspecified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFPredefinedSearchFilterType with scala.Double] = js.native
}

