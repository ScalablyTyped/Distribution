package typings.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IAccessControlList
import typings.mfiles.IOwnerPropertyDef
import typings.mfiles.IPropertyDef
import typings.mfiles.ISearchConditions
import typings.mfiles.ITypedValue
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

@JSGlobal("MFiles.PropertyDef")
@js.native
class PropertyDef () extends IPropertyDef {
  /* CompleteClass */
  override var AccessControlList: IAccessControlList = js.native
  /* CompleteClass */
  override var AllObjectTypes: Boolean = js.native
  /* CompleteClass */
  override var AllowedAsGroupingLevel: Boolean = js.native
  /* CompleteClass */
  override var AutomaticValueDefinition: ITypedValue = js.native
  /* CompleteClass */
  override var AutomaticValueType: MFAutomaticValueType = js.native
  /* CompleteClass */
  override var BasedOnValueList: Boolean = js.native
  /* CompleteClass */
  override var ContentType: MFContentType = js.native
  /* CompleteClass */
  override var DataType: MFDataType = js.native
  /* CompleteClass */
  override var DependencyPD: Double = js.native
  /* CompleteClass */
  override var DependencyRelation: MFDependencyRelation = js.native
  /* CompleteClass */
  override var FormattingType: MFFormattingType = js.native
  /* CompleteClass */
  override val GUID: String = js.native
  /* CompleteClass */
  override var ID: Double = js.native
  /* CompleteClass */
  override var Name: String = js.native
  /* CompleteClass */
  override var ObjectType: MFBuiltInObjectType | Double = js.native
  /* CompleteClass */
  override var OwnerPropertyDef: IOwnerPropertyDef = js.native
  /* CompleteClass */
  override var Predefined: Boolean = js.native
  /* CompleteClass */
  override var SortAscending: Boolean = js.native
  /* CompleteClass */
  override var StaticFilter: ISearchConditions = js.native
  /* CompleteClass */
  override val ThisIsConflictPD: Boolean = js.native
  /* CompleteClass */
  override val ThisIsDefaultPD: Boolean = js.native
  /* CompleteClass */
  override val ThisIsOwnerPD: Boolean = js.native
  /* CompleteClass */
  override var UpdateType: MFUpdateType = js.native
  /* CompleteClass */
  override var ValidationType: MFValidationType = js.native
  /* CompleteClass */
  override var ValueList: MFBuiltInValueList | Double = js.native
  /* CompleteClass */
  override var ValueListSortingType: MFValueListSortingType = js.native
  /* CompleteClass */
  override def Clone(): IPropertyDef = js.native
}

@JSGlobal("MFiles.PropertyDef")
@js.native
object PropertyDef extends Instantiable0[IPropertyDef]

