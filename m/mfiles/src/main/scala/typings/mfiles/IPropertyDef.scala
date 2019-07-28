package typings.mfiles

import typings.mfiles.MFilesNs.MFAutomaticValueType
import typings.mfiles.MFilesNs.MFBuiltInObjectType
import typings.mfiles.MFilesNs.MFBuiltInValueList
import typings.mfiles.MFilesNs.MFContentType
import typings.mfiles.MFilesNs.MFDataType
import typings.mfiles.MFilesNs.MFDependencyRelation
import typings.mfiles.MFilesNs.MFFormattingType
import typings.mfiles.MFilesNs.MFUpdateType
import typings.mfiles.MFilesNs.MFValidationType
import typings.mfiles.MFilesNs.MFValueListSortingType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyDef extends js.Object {
  var AccessControlList: IAccessControlList
  var AllObjectTypes: Boolean
  var AllowedAsGroupingLevel: Boolean
  var AutomaticValueDefinition: ITypedValue
  var AutomaticValueType: MFAutomaticValueType
  var BasedOnValueList: Boolean
  var ContentType: MFContentType
  var DataType: MFDataType
  var DependencyPD: Double
  var DependencyRelation: MFDependencyRelation
  var FormattingType: MFFormattingType
  val GUID: String
  var ID: Double
  var Name: String
  var ObjectType: MFBuiltInObjectType | Double
  var OwnerPropertyDef: IOwnerPropertyDef
  var Predefined: Boolean
  var SortAscending: Boolean
  var StaticFilter: ISearchConditions
  val ThisIsConflictPD: Boolean
  val ThisIsDefaultPD: Boolean
  val ThisIsOwnerPD: Boolean
  var UpdateType: MFUpdateType
  var ValidationType: MFValidationType
  var ValueList: MFBuiltInValueList | Double
  var ValueListSortingType: MFValueListSortingType
  def Clone(): IPropertyDef
}

object IPropertyDef {
  @scala.inline
  def apply(
    AccessControlList: IAccessControlList,
    AllObjectTypes: Boolean,
    AllowedAsGroupingLevel: Boolean,
    AutomaticValueDefinition: ITypedValue,
    AutomaticValueType: MFAutomaticValueType,
    BasedOnValueList: Boolean,
    Clone: () => IPropertyDef,
    ContentType: MFContentType,
    DataType: MFDataType,
    DependencyPD: Double,
    DependencyRelation: MFDependencyRelation,
    FormattingType: MFFormattingType,
    GUID: String,
    ID: Double,
    Name: String,
    ObjectType: MFBuiltInObjectType | Double,
    OwnerPropertyDef: IOwnerPropertyDef,
    Predefined: Boolean,
    SortAscending: Boolean,
    StaticFilter: ISearchConditions,
    ThisIsConflictPD: Boolean,
    ThisIsDefaultPD: Boolean,
    ThisIsOwnerPD: Boolean,
    UpdateType: MFUpdateType,
    ValidationType: MFValidationType,
    ValueList: MFBuiltInValueList | Double,
    ValueListSortingType: MFValueListSortingType
  ): IPropertyDef = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList, AllObjectTypes = AllObjectTypes, AllowedAsGroupingLevel = AllowedAsGroupingLevel, AutomaticValueDefinition = AutomaticValueDefinition, AutomaticValueType = AutomaticValueType, BasedOnValueList = BasedOnValueList, Clone = js.Any.fromFunction0(Clone), ContentType = ContentType, DataType = DataType, DependencyPD = DependencyPD, DependencyRelation = DependencyRelation, FormattingType = FormattingType, GUID = GUID, ID = ID, Name = Name, ObjectType = ObjectType.asInstanceOf[js.Any], OwnerPropertyDef = OwnerPropertyDef, Predefined = Predefined, SortAscending = SortAscending, StaticFilter = StaticFilter, ThisIsConflictPD = ThisIsConflictPD, ThisIsDefaultPD = ThisIsDefaultPD, ThisIsOwnerPD = ThisIsOwnerPD, UpdateType = UpdateType, ValidationType = ValidationType, ValueList = ValueList.asInstanceOf[js.Any], ValueListSortingType = ValueListSortingType)
  
    __obj.asInstanceOf[IPropertyDef]
  }
}

