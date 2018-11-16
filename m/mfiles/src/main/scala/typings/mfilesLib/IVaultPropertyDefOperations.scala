package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultPropertyDefOperations extends js.Object {
  def AddPropertyDefAdmin(PropertyDefAdmin: IPropertyDefAdmin, ResetLastUsedValue: ITypedValue): IPropertyDefAdmin = js.native
  def GetBuiltInPropertyDef(PropertyDefType: mfilesLib.MFilesNs.MFBuiltInPropertyDef): IPropertyDef = js.native
  def GetPropertyDef(PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef): IPropertyDef = js.native
  def GetPropertyDef(PropertyDef: scala.Double): IPropertyDef = js.native
  def GetPropertyDefAdmin(PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef): IPropertyDefAdmin = js.native
  def GetPropertyDefAdmin(PropertyDef: scala.Double): IPropertyDefAdmin = js.native
  def GetPropertyDefIDByAlias(Alias: java.lang.String): scala.Double = js.native
  def GetPropertyDefIDByGUID(PropertyDefGUID: java.lang.String): scala.Double = js.native
  def GetPropertyDefs(): IPropertyDefs = js.native
  def GetPropertyDefsAdmin(): IPropertyDefsAdmin = js.native
  def Recalculate(
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef,
    RecalculateCurrentlyEmptyValuesOnly: scala.Boolean
  ): scala.Unit = js.native
  def Recalculate(PropertyDef: scala.Double, RecalculateCurrentlyEmptyValuesOnly: scala.Boolean): scala.Unit = js.native
  def RemovePropertyDefAdmin(
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef,
    CopyToAnotherPropertyDef: scala.Boolean,
    TargetPropertyDef: scala.Double,
    Append: scala.Boolean,
    DeleteFromClassesIfNecessary: scala.Boolean
  ): scala.Unit = js.native
  def RemovePropertyDefAdmin(
    PropertyDef: scala.Double,
    CopyToAnotherPropertyDef: scala.Boolean,
    TargetPropertyDef: scala.Double,
    Append: scala.Boolean,
    DeleteFromClassesIfNecessary: scala.Boolean
  ): scala.Unit = js.native
  def UpdatePropertyDefAdmin(PropertyDefAdmin: IPropertyDefAdmin, ResetLastUsedValue: ITypedValue): scala.Unit = js.native
  def UpdatePropertyDefWithAutomaticPermissionsAdmin(
    PropertyDefAdmin: IPropertyDefAdmin,
    ResetLastUsedValue: ITypedValue,
    AutomaticPermissionsForcedActive: scala.Boolean
  ): scala.Unit = js.native
}

