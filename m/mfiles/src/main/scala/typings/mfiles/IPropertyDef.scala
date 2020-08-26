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

@js.native
trait IPropertyDef extends js.Object {
  var AccessControlList: IAccessControlList = js.native
  var AllObjectTypes: Boolean = js.native
  var AllowedAsGroupingLevel: Boolean = js.native
  var AutomaticValueDefinition: ITypedValue = js.native
  var AutomaticValueType: MFAutomaticValueType = js.native
  var BasedOnValueList: Boolean = js.native
  var ContentType: MFContentType = js.native
  var DataType: MFDataType = js.native
  var DependencyPD: Double = js.native
  var DependencyRelation: MFDependencyRelation = js.native
  var FormattingType: MFFormattingType = js.native
  val GUID: String = js.native
  var ID: Double = js.native
  var Name: String = js.native
  var ObjectType: MFBuiltInObjectType | Double = js.native
  var OwnerPropertyDef: IOwnerPropertyDef = js.native
  var Predefined: Boolean = js.native
  var SortAscending: Boolean = js.native
  var StaticFilter: ISearchConditions = js.native
  val ThisIsConflictPD: Boolean = js.native
  val ThisIsDefaultPD: Boolean = js.native
  val ThisIsOwnerPD: Boolean = js.native
  var UpdateType: MFUpdateType = js.native
  var ValidationType: MFValidationType = js.native
  var ValueList: MFBuiltInValueList | Double = js.native
  var ValueListSortingType: MFValueListSortingType = js.native
  def Clone(): IPropertyDef = js.native
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
  @scala.inline
  implicit class IPropertyDefOps[Self <: IPropertyDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessControlList(value: IAccessControlList): Self = this.set("AccessControlList", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllObjectTypes(value: Boolean): Self = this.set("AllObjectTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowedAsGroupingLevel(value: Boolean): Self = this.set("AllowedAsGroupingLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutomaticValueDefinition(value: ITypedValue): Self = this.set("AutomaticValueDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutomaticValueType(value: MFAutomaticValueType): Self = this.set("AutomaticValueType", value.asInstanceOf[js.Any])
    @scala.inline
    def setBasedOnValueList(value: Boolean): Self = this.set("BasedOnValueList", value.asInstanceOf[js.Any])
    @scala.inline
    def setClone(value: () => IPropertyDef): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setContentType(value: MFContentType): Self = this.set("ContentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataType(value: MFDataType): Self = this.set("DataType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDependencyPD(value: Double): Self = this.set("DependencyPD", value.asInstanceOf[js.Any])
    @scala.inline
    def setDependencyRelation(value: MFDependencyRelation): Self = this.set("DependencyRelation", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormattingType(value: MFFormattingType): Self = this.set("FormattingType", value.asInstanceOf[js.Any])
    @scala.inline
    def setGUID(value: String): Self = this.set("GUID", value.asInstanceOf[js.Any])
    @scala.inline
    def setID(value: Double): Self = this.set("ID", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectType(value: MFBuiltInObjectType | Double): Self = this.set("ObjectType", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerPropertyDef(value: IOwnerPropertyDef): Self = this.set("OwnerPropertyDef", value.asInstanceOf[js.Any])
    @scala.inline
    def setPredefined(value: Boolean): Self = this.set("Predefined", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortAscending(value: Boolean): Self = this.set("SortAscending", value.asInstanceOf[js.Any])
    @scala.inline
    def setStaticFilter(value: ISearchConditions): Self = this.set("StaticFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def setThisIsConflictPD(value: Boolean): Self = this.set("ThisIsConflictPD", value.asInstanceOf[js.Any])
    @scala.inline
    def setThisIsDefaultPD(value: Boolean): Self = this.set("ThisIsDefaultPD", value.asInstanceOf[js.Any])
    @scala.inline
    def setThisIsOwnerPD(value: Boolean): Self = this.set("ThisIsOwnerPD", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateType(value: MFUpdateType): Self = this.set("UpdateType", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidationType(value: MFValidationType): Self = this.set("ValidationType", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueList(value: MFBuiltInValueList | Double): Self = this.set("ValueList", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueListSortingType(value: MFValueListSortingType): Self = this.set("ValueListSortingType", value.asInstanceOf[js.Any])
  }
  
}

