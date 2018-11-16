package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFNamedValueType extends js.Object

@JSGlobal("MFiles.MFNamedValueType")
@js.native
object MFNamedValueType extends js.Object {
  @js.native
  sealed trait AdminConfiguration
    extends mfilesLib.MFilesNs.MFNamedValueType
  
  @js.native
  sealed trait ConfigurationValue
    extends mfilesLib.MFilesNs.MFNamedValueType
  
  @js.native
  sealed trait FolderConfiguration
    extends mfilesLib.MFilesNs.MFNamedValueType
  
  @js.native
  sealed trait RegistryValue
    extends mfilesLib.MFilesNs.MFNamedValueType
  
  @js.native
  sealed trait SystemAdminConfiguration
    extends mfilesLib.MFilesNs.MFNamedValueType
  
  @js.native
  sealed trait UserDefinedValue
    extends mfilesLib.MFilesNs.MFNamedValueType
  
  /* 7 */ val AdminConfiguration: AdminConfiguration with scala.Double = js.native
  /* 3 */ val ConfigurationValue: ConfigurationValue with scala.Double = js.native
  /* 6 */ val FolderConfiguration: FolderConfiguration with scala.Double = js.native
  /* 5 */ val RegistryValue: RegistryValue with scala.Double = js.native
  /* 8 */ val SystemAdminConfiguration: SystemAdminConfiguration with scala.Double = js.native
  /* 4 */ val UserDefinedValue: UserDefinedValue with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFNamedValueType with scala.Double] = js.native
}

