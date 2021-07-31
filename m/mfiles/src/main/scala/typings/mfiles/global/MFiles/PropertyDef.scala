package typings.mfiles.global.MFiles

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.PropertyDef")
@js.native
class PropertyDef ()
  extends StObject
     with IPropertyDef {
  
  /* CompleteClass */
  var AccessControlList: IAccessControlList = js.native
  
  /* CompleteClass */
  var AllObjectTypes: Boolean = js.native
  
  /* CompleteClass */
  var AllowedAsGroupingLevel: Boolean = js.native
  
  /* CompleteClass */
  var AutomaticValueDefinition: ITypedValue = js.native
  
  /* CompleteClass */
  var AutomaticValueType: MFAutomaticValueType = js.native
  
  /* CompleteClass */
  var BasedOnValueList: Boolean = js.native
  
  /* CompleteClass */
  override def Clone(): IPropertyDef = js.native
  
  /* CompleteClass */
  var ContentType: MFContentType = js.native
  
  /* CompleteClass */
  var DataType: MFDataType = js.native
  
  /* CompleteClass */
  var DependencyPD: Double = js.native
  
  /* CompleteClass */
  var DependencyRelation: MFDependencyRelation = js.native
  
  /* CompleteClass */
  var FormattingType: MFFormattingType = js.native
  
  /* CompleteClass */
  override val GUID: String = js.native
  
  /* CompleteClass */
  var ID: Double = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  var ObjectType: MFBuiltInObjectType | Double = js.native
  
  /* CompleteClass */
  var OwnerPropertyDef: IOwnerPropertyDef = js.native
  
  /* CompleteClass */
  var Predefined: Boolean = js.native
  
  /* CompleteClass */
  var SortAscending: Boolean = js.native
  
  /* CompleteClass */
  var StaticFilter: ISearchConditions = js.native
  
  /* CompleteClass */
  override val ThisIsConflictPD: Boolean = js.native
  
  /* CompleteClass */
  override val ThisIsDefaultPD: Boolean = js.native
  
  /* CompleteClass */
  override val ThisIsOwnerPD: Boolean = js.native
  
  /* CompleteClass */
  var UpdateType: MFUpdateType = js.native
  
  /* CompleteClass */
  var ValidationType: MFValidationType = js.native
  
  /* CompleteClass */
  var ValueList: MFBuiltInValueList | Double = js.native
  
  /* CompleteClass */
  var ValueListSortingType: MFValueListSortingType = js.native
}
