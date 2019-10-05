package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInPropertyDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultPropertyDefOperations extends js.Object {
  def AddPropertyDefAdmin(PropertyDefAdmin: IPropertyDefAdmin, ResetLastUsedValue: ITypedValue): IPropertyDefAdmin = js.native
  def GetBuiltInPropertyDef(PropertyDefType: MFBuiltInPropertyDef): IPropertyDef = js.native
  def GetPropertyDef(PropertyDef: Double): IPropertyDef = js.native
  def GetPropertyDef(PropertyDef: MFBuiltInPropertyDef): IPropertyDef = js.native
  def GetPropertyDefAdmin(PropertyDef: Double): IPropertyDefAdmin = js.native
  def GetPropertyDefAdmin(PropertyDef: MFBuiltInPropertyDef): IPropertyDefAdmin = js.native
  def GetPropertyDefIDByAlias(Alias: String): Double = js.native
  def GetPropertyDefIDByGUID(PropertyDefGUID: String): Double = js.native
  def GetPropertyDefs(): IPropertyDefs = js.native
  def GetPropertyDefsAdmin(): IPropertyDefsAdmin = js.native
  def Recalculate(PropertyDef: Double, RecalculateCurrentlyEmptyValuesOnly: Boolean): Unit = js.native
  def Recalculate(PropertyDef: MFBuiltInPropertyDef, RecalculateCurrentlyEmptyValuesOnly: Boolean): Unit = js.native
  def RemovePropertyDefAdmin(
    PropertyDef: Double,
    CopyToAnotherPropertyDef: Boolean,
    TargetPropertyDef: Double,
    Append: Boolean,
    DeleteFromClassesIfNecessary: Boolean
  ): Unit = js.native
  def RemovePropertyDefAdmin(
    PropertyDef: MFBuiltInPropertyDef,
    CopyToAnotherPropertyDef: Boolean,
    TargetPropertyDef: Double,
    Append: Boolean,
    DeleteFromClassesIfNecessary: Boolean
  ): Unit = js.native
  def UpdatePropertyDefAdmin(PropertyDefAdmin: IPropertyDefAdmin, ResetLastUsedValue: ITypedValue): Unit = js.native
  def UpdatePropertyDefWithAutomaticPermissionsAdmin(
    PropertyDefAdmin: IPropertyDefAdmin,
    ResetLastUsedValue: ITypedValue,
    AutomaticPermissionsForcedActive: Boolean
  ): Unit = js.native
}

