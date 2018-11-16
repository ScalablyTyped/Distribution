package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFImportContentFlag extends js.Object

@JSGlobal("MFiles.MFImportContentFlag")
@js.native
object MFImportContentFlag extends js.Object {
  @js.native
  sealed trait DeleteContentPackage
    extends mfilesLib.MFilesNs.MFImportContentFlag
  
  @js.native
  sealed trait DoNotImportObjectDestructions
    extends mfilesLib.MFilesNs.MFImportContentFlag
  
  @js.native
  sealed trait ForceNoStructureIdUpdate
    extends mfilesLib.MFilesNs.MFImportContentFlag
  
  @js.native
  sealed trait ImportCheckoutStates
    extends mfilesLib.MFilesNs.MFImportContentFlag
  
  @js.native
  sealed trait None
    extends mfilesLib.MFilesNs.MFImportContentFlag
  
  @js.native
  sealed trait OmitDoneFile
    extends mfilesLib.MFilesNs.MFImportContentFlag
  
  @js.native
  sealed trait ResetExportTimestamps
    extends mfilesLib.MFilesNs.MFImportContentFlag
  
  @js.native
  sealed trait UseMultipleContentPackages
    extends mfilesLib.MFilesNs.MFImportContentFlag
  
  @js.native
  sealed trait UseNamesAsAliases
    extends mfilesLib.MFilesNs.MFImportContentFlag
  
  /* 4 */ val DeleteContentPackage: DeleteContentPackage with scala.Double = js.native
  /* 64 */ val DoNotImportObjectDestructions: DoNotImportObjectDestructions with scala.Double = js.native
  /* 16384 */ val ForceNoStructureIdUpdate: ForceNoStructureIdUpdate with scala.Double = js.native
  /* 16 */ val ImportCheckoutStates: ImportCheckoutStates with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 32768 */ val OmitDoneFile: OmitDoneFile with scala.Double = js.native
  /* 32 */ val ResetExportTimestamps: ResetExportTimestamps with scala.Double = js.native
  /* 1 */ val UseMultipleContentPackages: UseMultipleContentPackages with scala.Double = js.native
  /* 128 */ val UseNamesAsAliases: UseNamesAsAliases with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFImportContentFlag with scala.Double] = js.native
}

