package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFMetadataStructureSelectorFlags extends js.Object

@JSGlobal("MFiles.MFMetadataStructureSelectorFlags")
@js.native
object MFMetadataStructureSelectorFlags extends js.Object {
  @js.native
  sealed trait IncludeExistingDependencies
    extends mfilesLib.MFilesNs.MFMetadataStructureSelectorFlags
  
  @js.native
  sealed trait IncludeNewDependencies
    extends mfilesLib.MFilesNs.MFMetadataStructureSelectorFlags
  
  @js.native
  sealed trait None
    extends mfilesLib.MFilesNs.MFMetadataStructureSelectorFlags
  
  @js.native
  sealed trait SelectExisting
    extends mfilesLib.MFilesNs.MFMetadataStructureSelectorFlags
  
  @js.native
  sealed trait SelectNew
    extends mfilesLib.MFilesNs.MFMetadataStructureSelectorFlags
  
  /* 8 */ val IncludeExistingDependencies: IncludeExistingDependencies with scala.Double = js.native
  /* 4 */ val IncludeNewDependencies: IncludeNewDependencies with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 2 */ val SelectExisting: SelectExisting with scala.Double = js.native
  /* 1 */ val SelectNew: SelectNew with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFMetadataStructureSelectorFlags with scala.Double] = js.native
}

