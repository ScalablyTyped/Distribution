package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExpression extends js.Object {
  var DataAnyFieldFTSFlags: mfilesLib.MFilesNs.MFFullTextSearchFlags = js.native
  var DataFileValueType: mfilesLib.MFilesNs.MFFileValueType = js.native
  var DataObjectIDSegmentSegmentSize: scala.Double = js.native
  var DataPermissionsType: mfilesLib.MFilesNs.MFPermissionsExpressionType = js.native
  var DataPropertyValueDataFunction: mfilesLib.MFilesNs.MFDataFunction = js.native
  var DataPropertyValueParentChildBehavior: mfilesLib.MFilesNs.MFParentChildBehavior = js.native
  var DataPropertyValuePropertyDef: scala.Double = js.native
  var DataStatusValueDataFunction: mfilesLib.MFilesNs.MFDataFunction = js.native
  var DataStatusValueType: mfilesLib.MFilesNs.MFStatusType = js.native
  var DataTypedValueDataFunction: mfilesLib.MFilesNs.MFDataFunction = js.native
  var DataTypedValueDatatype: mfilesLib.MFilesNs.MFDataType = js.native
  var DataTypedValueParentChildBehavior: mfilesLib.MFilesNs.MFParentChildBehavior = js.native
  var DataTypedValueValueList: scala.Double = js.native
  var IndirectionLevels: IPropertyDefOrObjectTypes = js.native
  val Type: mfilesLib.MFilesNs.MFExpressionType = js.native
  def Clone(): IExpression = js.native
  def GetExpressionAsText(PropertyDefinitions: IPropertyDefs, ObjectTypes: IObjectTypes): java.lang.String = js.native
  def GetWholeExpressionAsIndirectionLevels(): IPropertyDefOrObjectTypes = js.native
  def SetAnyFieldExpression(FullTextSearchFlags: mfilesLib.MFilesNs.MFFullTextSearchFlags): scala.Unit = js.native
  def SetFileValueExpression(FileValueType: mfilesLib.MFilesNs.MFFileValueType): scala.Unit = js.native
  def SetObjectIDSegmentExpression(Segment: scala.Double): scala.Unit = js.native
  def SetPermissionExpression(PermissionsExpressionType: mfilesLib.MFilesNs.MFPermissionsExpressionType): scala.Unit = js.native
  def SetPropertyValueExpression(
    PropertyDef: mfilesLib.MFilesNs.MFBuiltInPropertyDef,
    PCBehavior: mfilesLib.MFilesNs.MFParentChildBehavior,
    DataFunctionCall: IDataFunctionCall
  ): scala.Unit = js.native
  def SetPropertyValueExpression(
    PropertyDef: scala.Double,
    PCBehavior: mfilesLib.MFilesNs.MFParentChildBehavior,
    DataFunctionCall: IDataFunctionCall
  ): scala.Unit = js.native
  def SetStatusValueExpression(StatusType: mfilesLib.MFilesNs.MFStatusType, DataFunctionCall: IDataFunctionCall): scala.Unit = js.native
  def SetTypedValueExpression(
    DataType: mfilesLib.MFilesNs.MFDataType,
    ValueList: mfilesLib.MFilesNs.MFBuiltInValueList,
    PCBehavior: mfilesLib.MFilesNs.MFParentChildBehavior,
    DataFunctionCall: IDataFunctionCall
  ): scala.Unit = js.native
  def SetTypedValueExpression(
    DataType: mfilesLib.MFilesNs.MFDataType,
    ValueList: scala.Double,
    PCBehavior: mfilesLib.MFilesNs.MFParentChildBehavior,
    DataFunctionCall: IDataFunctionCall
  ): scala.Unit = js.native
  def SetValueListItemExpression(
    PseudoPropertyDef: mfilesLib.MFilesNs.MFValueListItemPropertyDef,
    PCBehavior: mfilesLib.MFilesNs.MFParentChildBehavior,
    DataFunctionCall: IDataFunctionCall
  ): scala.Unit = js.native
}

