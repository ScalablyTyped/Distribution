package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFExportContentFlag extends js.Object

@JSGlobal("MFiles.MFExportContentFlag")
@js.native
object MFExportContentFlag extends js.Object {
  @js.native
  sealed trait ClearArchivalMarker
    extends mfilesLib.MFilesNs.MFExportContentFlag
  
  @js.native
  sealed trait DestroyAfterExport
    extends mfilesLib.MFilesNs.MFExportContentFlag
  
  @js.native
  sealed trait ExportInformationOnDestroyedData
    extends mfilesLib.MFilesNs.MFExportContentFlag
  
  @js.native
  sealed trait IndicateDropouts
    extends mfilesLib.MFilesNs.MFExportContentFlag
  
  @js.native
  sealed trait LatestVersionsOnly
    extends mfilesLib.MFilesNs.MFExportContentFlag
  
  @js.native
  sealed trait None
    extends mfilesLib.MFilesNs.MFExportContentFlag
  
  @js.native
  sealed trait SaveFilesAlsoAsPDFA
    extends mfilesLib.MFilesNs.MFExportContentFlag
  
  @js.native
  sealed trait UseMultipleContentPackages
    extends mfilesLib.MFilesNs.MFExportContentFlag
  
  /* 8 */ val ClearArchivalMarker: ClearArchivalMarker with scala.Double = js.native
  /* 4 */ val DestroyAfterExport: DestroyAfterExport with scala.Double = js.native
  /* 64 */ val ExportInformationOnDestroyedData: ExportInformationOnDestroyedData with scala.Double = js.native
  /* 1024 */ val IndicateDropouts: IndicateDropouts with scala.Double = js.native
  /* 2 */ val LatestVersionsOnly: LatestVersionsOnly with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 32 */ val SaveFilesAlsoAsPDFA: SaveFilesAlsoAsPDFA with scala.Double = js.native
  /* 128 */ val UseMultipleContentPackages: UseMultipleContentPackages with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFExportContentFlag with scala.Double] = js.native
}

