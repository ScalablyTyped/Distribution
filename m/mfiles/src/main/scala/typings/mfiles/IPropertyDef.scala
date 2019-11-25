package typings.mfiles

import typings.mfiles.MFiles.MFAutomaticValueType
import typings.mfiles.MFiles.MFBuiltInObjectType
import typings.mfiles.MFiles.MFBuiltInValueList
import typings.mfiles.MFiles.MFContentType
import typings.mfiles.MFiles.MFDataType
import typings.mfiles.MFiles.MFDependencyRelation
import typings.mfiles.MFiles.MFFormattingType
import typings.mfiles.MFiles.MFUpdateType
import typings.mfiles.MFiles.MFValidationType
import typings.mfiles.MFiles.MFValueListSortingType
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
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList.asInstanceOf[js.Any], AllObjectTypes = AllObjectTypes.asInstanceOf[js.Any], AllowedAsGroupingLevel = AllowedAsGroupingLevel.asInstanceOf[js.Any], AutomaticValueDefinition = AutomaticValueDefinition.asInstanceOf[js.Any], AutomaticValueType = AutomaticValueType.asInstanceOf[js.Any], BasedOnValueList = BasedOnValueList.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), ContentType = ContentType.asInstanceOf[js.Any], DataType = DataType.asInstanceOf[js.Any], DependencyPD = DependencyPD.asInstanceOf[js.Any], DependencyRelation = DependencyRelation.asInstanceOf[js.Any], FormattingType = FormattingType.asInstanceOf[js.Any], GUID = GUID.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ObjectType = ObjectType.asInstanceOf[js.Any], OwnerPropertyDef = OwnerPropertyDef.asInstanceOf[js.Any], Predefined = Predefined.asInstanceOf[js.Any], SortAscending = SortAscending.asInstanceOf[js.Any], StaticFilter = StaticFilter.asInstanceOf[js.Any], ThisIsConflictPD = ThisIsConflictPD.asInstanceOf[js.Any], ThisIsDefaultPD = ThisIsDefaultPD.asInstanceOf[js.Any], ThisIsOwnerPD = ThisIsOwnerPD.asInstanceOf[js.Any], UpdateType = UpdateType.asInstanceOf[js.Any], ValidationType = ValidationType.asInstanceOf[js.Any], ValueList = ValueList.asInstanceOf[js.Any], ValueListSortingType = ValueListSortingType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPropertyDef]
  }
}

