package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyDef extends js.Object {
  var AccessControlList: IAccessControlList
  var AllObjectTypes: scala.Boolean
  var AllowedAsGroupingLevel: scala.Boolean
  var AutomaticValueDefinition: ITypedValue
  var AutomaticValueType: mfilesLib.MFilesNs.MFAutomaticValueType
  var BasedOnValueList: scala.Boolean
  var ContentType: mfilesLib.MFilesNs.MFContentType
  var DataType: mfilesLib.MFilesNs.MFDataType
  var DependencyPD: scala.Double
  var DependencyRelation: mfilesLib.MFilesNs.MFDependencyRelation
  var FormattingType: mfilesLib.MFilesNs.MFFormattingType
  val GUID: java.lang.String
  var ID: scala.Double
  var Name: java.lang.String
  var ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType | scala.Double
  var OwnerPropertyDef: IOwnerPropertyDef
  var Predefined: scala.Boolean
  var SortAscending: scala.Boolean
  var StaticFilter: ISearchConditions
  val ThisIsConflictPD: scala.Boolean
  val ThisIsDefaultPD: scala.Boolean
  val ThisIsOwnerPD: scala.Boolean
  var UpdateType: mfilesLib.MFilesNs.MFUpdateType
  var ValidationType: mfilesLib.MFilesNs.MFValidationType
  var ValueList: mfilesLib.MFilesNs.MFBuiltInValueList | scala.Double
  var ValueListSortingType: mfilesLib.MFilesNs.MFValueListSortingType
  def Clone(): IPropertyDef
}

object IPropertyDef {
  @scala.inline
  def apply(
    AccessControlList: IAccessControlList,
    AllObjectTypes: scala.Boolean,
    AllowedAsGroupingLevel: scala.Boolean,
    AutomaticValueDefinition: ITypedValue,
    AutomaticValueType: mfilesLib.MFilesNs.MFAutomaticValueType,
    BasedOnValueList: scala.Boolean,
    Clone: () => IPropertyDef,
    ContentType: mfilesLib.MFilesNs.MFContentType,
    DataType: mfilesLib.MFilesNs.MFDataType,
    DependencyPD: scala.Double,
    DependencyRelation: mfilesLib.MFilesNs.MFDependencyRelation,
    FormattingType: mfilesLib.MFilesNs.MFFormattingType,
    GUID: java.lang.String,
    ID: scala.Double,
    Name: java.lang.String,
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType | scala.Double,
    OwnerPropertyDef: IOwnerPropertyDef,
    Predefined: scala.Boolean,
    SortAscending: scala.Boolean,
    StaticFilter: ISearchConditions,
    ThisIsConflictPD: scala.Boolean,
    ThisIsDefaultPD: scala.Boolean,
    ThisIsOwnerPD: scala.Boolean,
    UpdateType: mfilesLib.MFilesNs.MFUpdateType,
    ValidationType: mfilesLib.MFilesNs.MFValidationType,
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList | scala.Double,
    ValueListSortingType: mfilesLib.MFilesNs.MFValueListSortingType
  ): IPropertyDef = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList, AllObjectTypes = AllObjectTypes, AllowedAsGroupingLevel = AllowedAsGroupingLevel, AutomaticValueDefinition = AutomaticValueDefinition, AutomaticValueType = AutomaticValueType, BasedOnValueList = BasedOnValueList, Clone = js.Any.fromFunction0(Clone), ContentType = ContentType, DataType = DataType, DependencyPD = DependencyPD, DependencyRelation = DependencyRelation, FormattingType = FormattingType, GUID = GUID, ID = ID, Name = Name, ObjectType = ObjectType.asInstanceOf[js.Any], OwnerPropertyDef = OwnerPropertyDef, Predefined = Predefined, SortAscending = SortAscending, StaticFilter = StaticFilter, ThisIsConflictPD = ThisIsConflictPD, ThisIsDefaultPD = ThisIsDefaultPD, ThisIsOwnerPD = ThisIsOwnerPD, UpdateType = UpdateType, ValidationType = ValidationType, ValueList = ValueList.asInstanceOf[js.Any], ValueListSortingType = ValueListSortingType)
  
    __obj.asInstanceOf[IPropertyDef]
  }
}

