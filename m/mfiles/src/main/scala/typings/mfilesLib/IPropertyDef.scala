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

