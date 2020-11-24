package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInPropertyDef
import typings.mfiles.MFiles.MFBuiltInValueList
import typings.mfiles.MFiles.MFDataFunction
import typings.mfiles.MFiles.MFDataType
import typings.mfiles.MFiles.MFExpressionType
import typings.mfiles.MFiles.MFFileValueType
import typings.mfiles.MFiles.MFFullTextSearchFlags
import typings.mfiles.MFiles.MFParentChildBehavior
import typings.mfiles.MFiles.MFPermissionsExpressionType
import typings.mfiles.MFiles.MFStatusType
import typings.mfiles.MFiles.MFValueListItemPropertyDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IExpression extends js.Object {
  
  def Clone(): IExpression = js.native
  
  var DataAnyFieldFTSFlags: MFFullTextSearchFlags = js.native
  
  var DataFileValueType: MFFileValueType = js.native
  
  var DataObjectIDSegmentSegmentSize: Double = js.native
  
  var DataPermissionsType: MFPermissionsExpressionType = js.native
  
  var DataPropertyValueDataFunction: MFDataFunction = js.native
  
  var DataPropertyValueParentChildBehavior: MFParentChildBehavior = js.native
  
  var DataPropertyValuePropertyDef: Double = js.native
  
  var DataStatusValueDataFunction: MFDataFunction = js.native
  
  var DataStatusValueType: MFStatusType = js.native
  
  var DataTypedValueDataFunction: MFDataFunction = js.native
  
  var DataTypedValueDatatype: MFDataType = js.native
  
  var DataTypedValueParentChildBehavior: MFParentChildBehavior = js.native
  
  var DataTypedValueValueList: Double = js.native
  
  def GetExpressionAsText(PropertyDefinitions: IPropertyDefs, ObjectTypes: IObjectTypes): String = js.native
  
  def GetWholeExpressionAsIndirectionLevels(): IPropertyDefOrObjectTypes = js.native
  
  var IndirectionLevels: IPropertyDefOrObjectTypes = js.native
  
  def SetAnyFieldExpression(FullTextSearchFlags: MFFullTextSearchFlags): Unit = js.native
  
  def SetFileValueExpression(FileValueType: MFFileValueType): Unit = js.native
  
  def SetObjectIDSegmentExpression(Segment: Double): Unit = js.native
  
  def SetPermissionExpression(PermissionsExpressionType: MFPermissionsExpressionType): Unit = js.native
  
  def SetPropertyValueExpression(PropertyDef: Double, PCBehavior: MFParentChildBehavior, DataFunctionCall: IDataFunctionCall): Unit = js.native
  def SetPropertyValueExpression(
    PropertyDef: MFBuiltInPropertyDef,
    PCBehavior: MFParentChildBehavior,
    DataFunctionCall: IDataFunctionCall
  ): Unit = js.native
  
  def SetStatusValueExpression(StatusType: MFStatusType, DataFunctionCall: IDataFunctionCall): Unit = js.native
  
  def SetTypedValueExpression(
    DataType: MFDataType,
    ValueList: Double,
    PCBehavior: MFParentChildBehavior,
    DataFunctionCall: IDataFunctionCall
  ): Unit = js.native
  def SetTypedValueExpression(
    DataType: MFDataType,
    ValueList: MFBuiltInValueList,
    PCBehavior: MFParentChildBehavior,
    DataFunctionCall: IDataFunctionCall
  ): Unit = js.native
  
  def SetValueListItemExpression(
    PseudoPropertyDef: MFValueListItemPropertyDef,
    PCBehavior: MFParentChildBehavior,
    DataFunctionCall: IDataFunctionCall
  ): Unit = js.native
  
  val Type: MFExpressionType = js.native
}
