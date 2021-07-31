package typings.mendixmodelsdk

import typings.mendixmodelsdk.iworkingcopyeventMod.BuildResultStatus
import typings.mendixmodelsdk.structuresMod.StructureState
import typings.mendixmodelsdk.transactionManagerMod.TransactionType
import typings.mendixmodelsdk.transportInterfacesMod.CannotFixAppState
import typings.mendixmodelsdk.transportInterfacesMod.IUpdateAppJobStatus
import typings.mendixmodelsdk.transportInterfacesMod.LockType
import typings.mendixmodelsdk.transportInterfacesMod.SuccessAppState
import typings.mendixmodelsdk.transportationMod.RequestMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mendixmodelsdkStrings {
  
  @js.native
  sealed trait ADD extends StObject
  @scala.inline
  def ADD: ADD = "ADD".asInstanceOf[ADD]
  
  @js.native
  sealed trait APP_NOT_FOUND
    extends StObject
       with SuccessAppState
  @scala.inline
  def APP_NOT_FOUND: APP_NOT_FOUND = "APP_NOT_FOUND".asInstanceOf[APP_NOT_FOUND]
  
  @js.native
  sealed trait ATTACH_ELEMENT extends StObject
  @scala.inline
  def ATTACH_ELEMENT: ATTACH_ELEMENT = "ATTACH_ELEMENT".asInstanceOf[ATTACH_ELEMENT]
  
  @js.native
  sealed trait AppServices$AppServiceAction extends StObject
  @scala.inline
  def AppServices$AppServiceAction: AppServices$AppServiceAction = "AppServices$AppServiceAction".asInstanceOf[AppServices$AppServiceAction]
  
  @js.native
  sealed trait AppServices$AppServiceActionParameter extends StObject
  @scala.inline
  def AppServices$AppServiceActionParameter: AppServices$AppServiceActionParameter = "AppServices$AppServiceActionParameter".asInstanceOf[AppServices$AppServiceActionParameter]
  
  @js.native
  sealed trait AppServices$Msd extends StObject
  @scala.inline
  def AppServices$Msd: AppServices$Msd = "AppServices$Msd".asInstanceOf[AppServices$Msd]
  
  @js.native
  sealed trait AppServices$MsdAssociation extends StObject
  @scala.inline
  def AppServices$MsdAssociation: AppServices$MsdAssociation = "AppServices$MsdAssociation".asInstanceOf[AppServices$MsdAssociation]
  
  @js.native
  sealed trait AppServices$MsdAttribute extends StObject
  @scala.inline
  def AppServices$MsdAttribute: AppServices$MsdAttribute = "AppServices$MsdAttribute".asInstanceOf[AppServices$MsdAttribute]
  
  @js.native
  sealed trait AppServices$MsdDomainModel extends StObject
  @scala.inline
  def AppServices$MsdDomainModel: AppServices$MsdDomainModel = "AppServices$MsdDomainModel".asInstanceOf[AppServices$MsdDomainModel]
  
  @js.native
  sealed trait AppServices$MsdEntity extends StObject
  @scala.inline
  def AppServices$MsdEntity: AppServices$MsdEntity = "AppServices$MsdEntity".asInstanceOf[AppServices$MsdEntity]
  
  @js.native
  sealed trait AppServices$MsdEnumeration extends StObject
  @scala.inline
  def AppServices$MsdEnumeration: AppServices$MsdEnumeration = "AppServices$MsdEnumeration".asInstanceOf[AppServices$MsdEnumeration]
  
  @js.native
  sealed trait AppServices$MsdEnumerationContainer extends StObject
  @scala.inline
  def AppServices$MsdEnumerationContainer: AppServices$MsdEnumerationContainer = "AppServices$MsdEnumerationContainer".asInstanceOf[AppServices$MsdEnumerationContainer]
  
  @js.native
  sealed trait AppServices$MsdEnumerationValue extends StObject
  @scala.inline
  def AppServices$MsdEnumerationValue: AppServices$MsdEnumerationValue = "AppServices$MsdEnumerationValue".asInstanceOf[AppServices$MsdEnumerationValue]
  
  @js.native
  sealed trait AppServices$MsdMetadata extends StObject
  @scala.inline
  def AppServices$MsdMetadata: AppServices$MsdMetadata = "AppServices$MsdMetadata".asInstanceOf[AppServices$MsdMetadata]
  
  @js.native
  sealed trait AppServices$MsdMicroflow extends StObject
  @scala.inline
  def AppServices$MsdMicroflow: AppServices$MsdMicroflow = "AppServices$MsdMicroflow".asInstanceOf[AppServices$MsdMicroflow]
  
  @js.native
  sealed trait AppServices$MsdMicroflowParameter extends StObject
  @scala.inline
  def AppServices$MsdMicroflowParameter: AppServices$MsdMicroflowParameter = "AppServices$MsdMicroflowParameter".asInstanceOf[AppServices$MsdMicroflowParameter]
  
  @js.native
  sealed trait AppServices$MsdText extends StObject
  @scala.inline
  def AppServices$MsdText: AppServices$MsdText = "AppServices$MsdText".asInstanceOf[AppServices$MsdText]
  
  @js.native
  sealed trait AppServices$MsdVersion extends StObject
  @scala.inline
  def AppServices$MsdVersion: AppServices$MsdVersion = "AppServices$MsdVersion".asInstanceOf[AppServices$MsdVersion]
  
  @js.native
  sealed trait BUSY_PROVISIONING
    extends StObject
       with CannotFixAppState
  @scala.inline
  def BUSY_PROVISIONING: BUSY_PROVISIONING = "BUSY_PROVISIONING".asInstanceOf[BUSY_PROVISIONING]
  
  @js.native
  sealed trait CHANGE extends StObject
  @scala.inline
  def CHANGE: CHANGE = "CHANGE".asInstanceOf[CHANGE]
  
  @js.native
  sealed trait CREATE_ELEMENT_TREE extends StObject
  @scala.inline
  def CREATE_ELEMENT_TREE: CREATE_ELEMENT_TREE = "CREATE_ELEMENT_TREE".asInstanceOf[CREATE_ELEMENT_TREE]
  
  @js.native
  sealed trait CREATE_UNIT_TREE extends StObject
  @scala.inline
  def CREATE_UNIT_TREE: CREATE_UNIT_TREE = "CREATE_UNIT_TREE".asInstanceOf[CREATE_UNIT_TREE]
  
  @js.native
  sealed trait CodeActions$BasicParameterType extends StObject
  @scala.inline
  def CodeActions$BasicParameterType: CodeActions$BasicParameterType = "CodeActions$BasicParameterType".asInstanceOf[CodeActions$BasicParameterType]
  
  @js.native
  sealed trait CodeActions$BooleanType extends StObject
  @scala.inline
  def CodeActions$BooleanType: CodeActions$BooleanType = "CodeActions$BooleanType".asInstanceOf[CodeActions$BooleanType]
  
  @js.native
  sealed trait CodeActions$ConcreteEntityType extends StObject
  @scala.inline
  def CodeActions$ConcreteEntityType: CodeActions$ConcreteEntityType = "CodeActions$ConcreteEntityType".asInstanceOf[CodeActions$ConcreteEntityType]
  
  @js.native
  sealed trait CodeActions$DateTimeType extends StObject
  @scala.inline
  def CodeActions$DateTimeType: CodeActions$DateTimeType = "CodeActions$DateTimeType".asInstanceOf[CodeActions$DateTimeType]
  
  @js.native
  sealed trait CodeActions$DecimalType extends StObject
  @scala.inline
  def CodeActions$DecimalType: CodeActions$DecimalType = "CodeActions$DecimalType".asInstanceOf[CodeActions$DecimalType]
  
  @js.native
  sealed trait CodeActions$EntityTypeParameterType extends StObject
  @scala.inline
  def CodeActions$EntityTypeParameterType: CodeActions$EntityTypeParameterType = "CodeActions$EntityTypeParameterType".asInstanceOf[CodeActions$EntityTypeParameterType]
  
  @js.native
  sealed trait CodeActions$EnumerationType extends StObject
  @scala.inline
  def CodeActions$EnumerationType: CodeActions$EnumerationType = "CodeActions$EnumerationType".asInstanceOf[CodeActions$EnumerationType]
  
  @js.native
  sealed trait CodeActions$FloatType extends StObject
  @scala.inline
  def CodeActions$FloatType: CodeActions$FloatType = "CodeActions$FloatType".asInstanceOf[CodeActions$FloatType]
  
  @js.native
  sealed trait CodeActions$IntegerType extends StObject
  @scala.inline
  def CodeActions$IntegerType: CodeActions$IntegerType = "CodeActions$IntegerType".asInstanceOf[CodeActions$IntegerType]
  
  @js.native
  sealed trait CodeActions$ListType extends StObject
  @scala.inline
  def CodeActions$ListType: CodeActions$ListType = "CodeActions$ListType".asInstanceOf[CodeActions$ListType]
  
  @js.native
  sealed trait CodeActions$MicroflowActionInfo extends StObject
  @scala.inline
  def CodeActions$MicroflowActionInfo: CodeActions$MicroflowActionInfo = "CodeActions$MicroflowActionInfo".asInstanceOf[CodeActions$MicroflowActionInfo]
  
  @js.native
  sealed trait CodeActions$ParameterizedEntityType extends StObject
  @scala.inline
  def CodeActions$ParameterizedEntityType: CodeActions$ParameterizedEntityType = "CodeActions$ParameterizedEntityType".asInstanceOf[CodeActions$ParameterizedEntityType]
  
  @js.native
  sealed trait CodeActions$StringTemplateParameterType extends StObject
  @scala.inline
  def CodeActions$StringTemplateParameterType: CodeActions$StringTemplateParameterType = "CodeActions$StringTemplateParameterType".asInstanceOf[CodeActions$StringTemplateParameterType]
  
  @js.native
  sealed trait CodeActions$StringType extends StObject
  @scala.inline
  def CodeActions$StringType: CodeActions$StringType = "CodeActions$StringType".asInstanceOf[CodeActions$StringType]
  
  @js.native
  sealed trait CodeActions$TypeParameter extends StObject
  @scala.inline
  def CodeActions$TypeParameter: CodeActions$TypeParameter = "CodeActions$TypeParameter".asInstanceOf[CodeActions$TypeParameter]
  
  @js.native
  sealed trait CodeActions$VoidType extends StObject
  @scala.inline
  def CodeActions$VoidType: CodeActions$VoidType = "CodeActions$VoidType".asInstanceOf[CodeActions$VoidType]
  
  @js.native
  sealed trait CustomWidgets$CustomWidget extends StObject
  @scala.inline
  def CustomWidgets$CustomWidget: CustomWidgets$CustomWidget = "CustomWidgets$CustomWidget".asInstanceOf[CustomWidgets$CustomWidget]
  
  @js.native
  sealed trait CustomWidgets$CustomWidgetDatabaseSource extends StObject
  @scala.inline
  def CustomWidgets$CustomWidgetDatabaseSource: CustomWidgets$CustomWidgetDatabaseSource = "CustomWidgets$CustomWidgetDatabaseSource".asInstanceOf[CustomWidgets$CustomWidgetDatabaseSource]
  
  @js.native
  sealed trait CustomWidgets$CustomWidgetType extends StObject
  @scala.inline
  def CustomWidgets$CustomWidgetType: CustomWidgets$CustomWidgetType = "CustomWidgets$CustomWidgetType".asInstanceOf[CustomWidgets$CustomWidgetType]
  
  @js.native
  sealed trait CustomWidgets$CustomWidgetXPathSource extends StObject
  @scala.inline
  def CustomWidgets$CustomWidgetXPathSource: CustomWidgets$CustomWidgetXPathSource = "CustomWidgets$CustomWidgetXPathSource".asInstanceOf[CustomWidgets$CustomWidgetXPathSource]
  
  @js.native
  sealed trait CustomWidgets$WidgetEnumerationValue extends StObject
  @scala.inline
  def CustomWidgets$WidgetEnumerationValue: CustomWidgets$WidgetEnumerationValue = "CustomWidgets$WidgetEnumerationValue".asInstanceOf[CustomWidgets$WidgetEnumerationValue]
  
  @js.native
  sealed trait CustomWidgets$WidgetObject extends StObject
  @scala.inline
  def CustomWidgets$WidgetObject: CustomWidgets$WidgetObject = "CustomWidgets$WidgetObject".asInstanceOf[CustomWidgets$WidgetObject]
  
  @js.native
  sealed trait CustomWidgets$WidgetObjectType extends StObject
  @scala.inline
  def CustomWidgets$WidgetObjectType: CustomWidgets$WidgetObjectType = "CustomWidgets$WidgetObjectType".asInstanceOf[CustomWidgets$WidgetObjectType]
  
  @js.native
  sealed trait CustomWidgets$WidgetProperty extends StObject
  @scala.inline
  def CustomWidgets$WidgetProperty: CustomWidgets$WidgetProperty = "CustomWidgets$WidgetProperty".asInstanceOf[CustomWidgets$WidgetProperty]
  
  @js.native
  sealed trait CustomWidgets$WidgetPropertyType extends StObject
  @scala.inline
  def CustomWidgets$WidgetPropertyType: CustomWidgets$WidgetPropertyType = "CustomWidgets$WidgetPropertyType".asInstanceOf[CustomWidgets$WidgetPropertyType]
  
  @js.native
  sealed trait CustomWidgets$WidgetReturnType extends StObject
  @scala.inline
  def CustomWidgets$WidgetReturnType: CustomWidgets$WidgetReturnType = "CustomWidgets$WidgetReturnType".asInstanceOf[CustomWidgets$WidgetReturnType]
  
  @js.native
  sealed trait CustomWidgets$WidgetTranslation extends StObject
  @scala.inline
  def CustomWidgets$WidgetTranslation: CustomWidgets$WidgetTranslation = "CustomWidgets$WidgetTranslation".asInstanceOf[CustomWidgets$WidgetTranslation]
  
  @js.native
  sealed trait CustomWidgets$WidgetValue extends StObject
  @scala.inline
  def CustomWidgets$WidgetValue: CustomWidgets$WidgetValue = "CustomWidgets$WidgetValue".asInstanceOf[CustomWidgets$WidgetValue]
  
  @js.native
  sealed trait CustomWidgets$WidgetValueType extends StObject
  @scala.inline
  def CustomWidgets$WidgetValueType: CustomWidgets$WidgetValueType = "CustomWidgets$WidgetValueType".asInstanceOf[CustomWidgets$WidgetValueType]
  
  @js.native
  sealed trait DELETE_ELEMENT extends StObject
  @scala.inline
  def DELETE_ELEMENT: DELETE_ELEMENT = "DELETE_ELEMENT".asInstanceOf[DELETE_ELEMENT]
  
  @js.native
  sealed trait DELETE_UNIT extends StObject
  @scala.inline
  def DELETE_UNIT: DELETE_UNIT = "DELETE_UNIT".asInstanceOf[DELETE_UNIT]
  
  @js.native
  sealed trait DETACH_ELEMENT extends StObject
  @scala.inline
  def DETACH_ELEMENT: DETACH_ELEMENT = "DETACH_ELEMENT".asInstanceOf[DETACH_ELEMENT]
  
  @js.native
  sealed trait DataSets$DataSetAccess extends StObject
  @scala.inline
  def DataSets$DataSetAccess: DataSets$DataSetAccess = "DataSets$DataSetAccess".asInstanceOf[DataSets$DataSetAccess]
  
  @js.native
  sealed trait DataSets$DataSetColumn extends StObject
  @scala.inline
  def DataSets$DataSetColumn: DataSets$DataSetColumn = "DataSets$DataSetColumn".asInstanceOf[DataSets$DataSetColumn]
  
  @js.native
  sealed trait DataSets$DataSetConstraintAccess extends StObject
  @scala.inline
  def DataSets$DataSetConstraintAccess: DataSets$DataSetConstraintAccess = "DataSets$DataSetConstraintAccess".asInstanceOf[DataSets$DataSetConstraintAccess]
  
  @js.native
  sealed trait DataSets$DataSetDateTimeConstraint extends StObject
  @scala.inline
  def DataSets$DataSetDateTimeConstraint: DataSets$DataSetDateTimeConstraint = "DataSets$DataSetDateTimeConstraint".asInstanceOf[DataSets$DataSetDateTimeConstraint]
  
  @js.native
  sealed trait DataSets$DataSetModuleRoleAccess extends StObject
  @scala.inline
  def DataSets$DataSetModuleRoleAccess: DataSets$DataSetModuleRoleAccess = "DataSets$DataSetModuleRoleAccess".asInstanceOf[DataSets$DataSetModuleRoleAccess]
  
  @js.native
  sealed trait DataSets$DataSetNumericConstraint extends StObject
  @scala.inline
  def DataSets$DataSetNumericConstraint: DataSets$DataSetNumericConstraint = "DataSets$DataSetNumericConstraint".asInstanceOf[DataSets$DataSetNumericConstraint]
  
  @js.native
  sealed trait DataSets$DataSetObjectConstraint extends StObject
  @scala.inline
  def DataSets$DataSetObjectConstraint: DataSets$DataSetObjectConstraint = "DataSets$DataSetObjectConstraint".asInstanceOf[DataSets$DataSetObjectConstraint]
  
  @js.native
  sealed trait DataSets$DataSetParameter extends StObject
  @scala.inline
  def DataSets$DataSetParameter: DataSets$DataSetParameter = "DataSets$DataSetParameter".asInstanceOf[DataSets$DataSetParameter]
  
  @js.native
  sealed trait DataSets$DataSetParameterAccess extends StObject
  @scala.inline
  def DataSets$DataSetParameterAccess: DataSets$DataSetParameterAccess = "DataSets$DataSetParameterAccess".asInstanceOf[DataSets$DataSetParameterAccess]
  
  @js.native
  sealed trait DataSets$JavaDataSetSource extends StObject
  @scala.inline
  def DataSets$JavaDataSetSource: DataSets$JavaDataSetSource = "DataSets$JavaDataSetSource".asInstanceOf[DataSets$JavaDataSetSource]
  
  @js.native
  sealed trait DataSets$OqlDataSetSource extends StObject
  @scala.inline
  def DataSets$OqlDataSetSource: DataSets$OqlDataSetSource = "DataSets$OqlDataSetSource".asInstanceOf[DataSets$OqlDataSetSource]
  
  @js.native
  sealed trait DataTypes$BinaryType extends StObject
  @scala.inline
  def DataTypes$BinaryType: DataTypes$BinaryType = "DataTypes$BinaryType".asInstanceOf[DataTypes$BinaryType]
  
  @js.native
  sealed trait DataTypes$BooleanType extends StObject
  @scala.inline
  def DataTypes$BooleanType: DataTypes$BooleanType = "DataTypes$BooleanType".asInstanceOf[DataTypes$BooleanType]
  
  @js.native
  sealed trait DataTypes$DateTimeType extends StObject
  @scala.inline
  def DataTypes$DateTimeType: DataTypes$DateTimeType = "DataTypes$DateTimeType".asInstanceOf[DataTypes$DateTimeType]
  
  @js.native
  sealed trait DataTypes$DecimalType extends StObject
  @scala.inline
  def DataTypes$DecimalType: DataTypes$DecimalType = "DataTypes$DecimalType".asInstanceOf[DataTypes$DecimalType]
  
  @js.native
  sealed trait DataTypes$EmptyType extends StObject
  @scala.inline
  def DataTypes$EmptyType: DataTypes$EmptyType = "DataTypes$EmptyType".asInstanceOf[DataTypes$EmptyType]
  
  @js.native
  sealed trait DataTypes$EnumerationType extends StObject
  @scala.inline
  def DataTypes$EnumerationType: DataTypes$EnumerationType = "DataTypes$EnumerationType".asInstanceOf[DataTypes$EnumerationType]
  
  @js.native
  sealed trait DataTypes$FloatType extends StObject
  @scala.inline
  def DataTypes$FloatType: DataTypes$FloatType = "DataTypes$FloatType".asInstanceOf[DataTypes$FloatType]
  
  @js.native
  sealed trait DataTypes$IntegerType extends StObject
  @scala.inline
  def DataTypes$IntegerType: DataTypes$IntegerType = "DataTypes$IntegerType".asInstanceOf[DataTypes$IntegerType]
  
  @js.native
  sealed trait DataTypes$ListType extends StObject
  @scala.inline
  def DataTypes$ListType: DataTypes$ListType = "DataTypes$ListType".asInstanceOf[DataTypes$ListType]
  
  @js.native
  sealed trait DataTypes$ObjectType extends StObject
  @scala.inline
  def DataTypes$ObjectType: DataTypes$ObjectType = "DataTypes$ObjectType".asInstanceOf[DataTypes$ObjectType]
  
  @js.native
  sealed trait DataTypes$StringType extends StObject
  @scala.inline
  def DataTypes$StringType: DataTypes$StringType = "DataTypes$StringType".asInstanceOf[DataTypes$StringType]
  
  @js.native
  sealed trait DataTypes$UnknownType extends StObject
  @scala.inline
  def DataTypes$UnknownType: DataTypes$UnknownType = "DataTypes$UnknownType".asInstanceOf[DataTypes$UnknownType]
  
  @js.native
  sealed trait DataTypes$VoidType extends StObject
  @scala.inline
  def DataTypes$VoidType: DataTypes$VoidType = "DataTypes$VoidType".asInstanceOf[DataTypes$VoidType]
  
  @js.native
  sealed trait DocumentTemplates$ConditionSettings extends StObject
  @scala.inline
  def DocumentTemplates$ConditionSettings: DocumentTemplates$ConditionSettings = "DocumentTemplates$ConditionSettings".asInstanceOf[DocumentTemplates$ConditionSettings]
  
  @js.native
  sealed trait DocumentTemplates$DataGrid extends StObject
  @scala.inline
  def DocumentTemplates$DataGrid: DocumentTemplates$DataGrid = "DocumentTemplates$DataGrid".asInstanceOf[DocumentTemplates$DataGrid]
  
  @js.native
  sealed trait DocumentTemplates$DataGridCell extends StObject
  @scala.inline
  def DocumentTemplates$DataGridCell: DocumentTemplates$DataGridCell = "DocumentTemplates$DataGridCell".asInstanceOf[DocumentTemplates$DataGridCell]
  
  @js.native
  sealed trait DocumentTemplates$DataGridColumn extends StObject
  @scala.inline
  def DocumentTemplates$DataGridColumn: DocumentTemplates$DataGridColumn = "DocumentTemplates$DataGridColumn".asInstanceOf[DocumentTemplates$DataGridColumn]
  
  @js.native
  sealed trait DocumentTemplates$DataView extends StObject
  @scala.inline
  def DocumentTemplates$DataView: DocumentTemplates$DataView = "DocumentTemplates$DataView".asInstanceOf[DocumentTemplates$DataView]
  
  @js.native
  sealed trait DocumentTemplates$DataViewContents extends StObject
  @scala.inline
  def DocumentTemplates$DataViewContents: DocumentTemplates$DataViewContents = "DocumentTemplates$DataViewContents".asInstanceOf[DocumentTemplates$DataViewContents]
  
  @js.native
  sealed trait DocumentTemplates$DocumentTemplateParameter extends StObject
  @scala.inline
  def DocumentTemplates$DocumentTemplateParameter: DocumentTemplates$DocumentTemplateParameter = "DocumentTemplates$DocumentTemplateParameter".asInstanceOf[DocumentTemplates$DocumentTemplateParameter]
  
  @js.native
  sealed trait DocumentTemplates$DynamicImageViewer extends StObject
  @scala.inline
  def DocumentTemplates$DynamicImageViewer: DocumentTemplates$DynamicImageViewer = "DocumentTemplates$DynamicImageViewer".asInstanceOf[DocumentTemplates$DynamicImageViewer]
  
  @js.native
  sealed trait DocumentTemplates$DynamicLabel extends StObject
  @scala.inline
  def DocumentTemplates$DynamicLabel: DocumentTemplates$DynamicLabel = "DocumentTemplates$DynamicLabel".asInstanceOf[DocumentTemplates$DynamicLabel]
  
  @js.native
  sealed trait DocumentTemplates$Footer extends StObject
  @scala.inline
  def DocumentTemplates$Footer: DocumentTemplates$Footer = "DocumentTemplates$Footer".asInstanceOf[DocumentTemplates$Footer]
  
  @js.native
  sealed trait DocumentTemplates$GridSortBar extends StObject
  @scala.inline
  def DocumentTemplates$GridSortBar: DocumentTemplates$GridSortBar = "DocumentTemplates$GridSortBar".asInstanceOf[DocumentTemplates$GridSortBar]
  
  @js.native
  sealed trait DocumentTemplates$GridSortItem extends StObject
  @scala.inline
  def DocumentTemplates$GridSortItem: DocumentTemplates$GridSortItem = "DocumentTemplates$GridSortItem".asInstanceOf[DocumentTemplates$GridSortItem]
  
  @js.native
  sealed trait DocumentTemplates$Header extends StObject
  @scala.inline
  def DocumentTemplates$Header: DocumentTemplates$Header = "DocumentTemplates$Header".asInstanceOf[DocumentTemplates$Header]
  
  @js.native
  sealed trait DocumentTemplates$LineBreak extends StObject
  @scala.inline
  def DocumentTemplates$LineBreak: DocumentTemplates$LineBreak = "DocumentTemplates$LineBreak".asInstanceOf[DocumentTemplates$LineBreak]
  
  @js.native
  sealed trait DocumentTemplates$PageBreak extends StObject
  @scala.inline
  def DocumentTemplates$PageBreak: DocumentTemplates$PageBreak = "DocumentTemplates$PageBreak".asInstanceOf[DocumentTemplates$PageBreak]
  
  @js.native
  sealed trait DocumentTemplates$StaticImageViewer extends StObject
  @scala.inline
  def DocumentTemplates$StaticImageViewer: DocumentTemplates$StaticImageViewer = "DocumentTemplates$StaticImageViewer".asInstanceOf[DocumentTemplates$StaticImageViewer]
  
  @js.native
  sealed trait DocumentTemplates$StaticLabel extends StObject
  @scala.inline
  def DocumentTemplates$StaticLabel: DocumentTemplates$StaticLabel = "DocumentTemplates$StaticLabel".asInstanceOf[DocumentTemplates$StaticLabel]
  
  @js.native
  sealed trait DocumentTemplates$Style extends StObject
  @scala.inline
  def DocumentTemplates$Style: DocumentTemplates$Style = "DocumentTemplates$Style".asInstanceOf[DocumentTemplates$Style]
  
  @js.native
  sealed trait DocumentTemplates$Table extends StObject
  @scala.inline
  def DocumentTemplates$Table: DocumentTemplates$Table = "DocumentTemplates$Table".asInstanceOf[DocumentTemplates$Table]
  
  @js.native
  sealed trait DocumentTemplates$TableCell extends StObject
  @scala.inline
  def DocumentTemplates$TableCell: DocumentTemplates$TableCell = "DocumentTemplates$TableCell".asInstanceOf[DocumentTemplates$TableCell]
  
  @js.native
  sealed trait DocumentTemplates$TableRow extends StObject
  @scala.inline
  def DocumentTemplates$TableRow: DocumentTemplates$TableRow = "DocumentTemplates$TableRow".asInstanceOf[DocumentTemplates$TableRow]
  
  @js.native
  sealed trait DocumentTemplates$TemplateGrid extends StObject
  @scala.inline
  def DocumentTemplates$TemplateGrid: DocumentTemplates$TemplateGrid = "DocumentTemplates$TemplateGrid".asInstanceOf[DocumentTemplates$TemplateGrid]
  
  @js.native
  sealed trait DocumentTemplates$TemplateGridContents extends StObject
  @scala.inline
  def DocumentTemplates$TemplateGridContents: DocumentTemplates$TemplateGridContents = "DocumentTemplates$TemplateGridContents".asInstanceOf[DocumentTemplates$TemplateGridContents]
  
  @js.native
  sealed trait DocumentTemplates$Title extends StObject
  @scala.inline
  def DocumentTemplates$Title: DocumentTemplates$Title = "DocumentTemplates$Title".asInstanceOf[DocumentTemplates$Title]
  
  @js.native
  sealed trait DomainModels$AccessRule extends StObject
  @scala.inline
  def DomainModels$AccessRule: DomainModels$AccessRule = "DomainModels$AccessRule".asInstanceOf[DomainModels$AccessRule]
  
  @js.native
  sealed trait DomainModels$Annotation extends StObject
  @scala.inline
  def DomainModels$Annotation: DomainModels$Annotation = "DomainModels$Annotation".asInstanceOf[DomainModels$Annotation]
  
  @js.native
  sealed trait DomainModels$Association extends StObject
  @scala.inline
  def DomainModels$Association: DomainModels$Association = "DomainModels$Association".asInstanceOf[DomainModels$Association]
  
  @js.native
  sealed trait DomainModels$AssociationCapabilities extends StObject
  @scala.inline
  def DomainModels$AssociationCapabilities: DomainModels$AssociationCapabilities = "DomainModels$AssociationCapabilities".asInstanceOf[DomainModels$AssociationCapabilities]
  
  @js.native
  sealed trait DomainModels$AssociationDeleteBehavior extends StObject
  @scala.inline
  def DomainModels$AssociationDeleteBehavior: DomainModels$AssociationDeleteBehavior = "DomainModels$AssociationDeleteBehavior".asInstanceOf[DomainModels$AssociationDeleteBehavior]
  
  @js.native
  sealed trait DomainModels$AssociationRef extends StObject
  @scala.inline
  def DomainModels$AssociationRef: DomainModels$AssociationRef = "DomainModels$AssociationRef".asInstanceOf[DomainModels$AssociationRef]
  
  @js.native
  sealed trait DomainModels$Attribute extends StObject
  @scala.inline
  def DomainModels$Attribute: DomainModels$Attribute = "DomainModels$Attribute".asInstanceOf[DomainModels$Attribute]
  
  @js.native
  sealed trait DomainModels$AttributeCapabilities extends StObject
  @scala.inline
  def DomainModels$AttributeCapabilities: DomainModels$AttributeCapabilities = "DomainModels$AttributeCapabilities".asInstanceOf[DomainModels$AttributeCapabilities]
  
  @js.native
  sealed trait DomainModels$AttributeRef extends StObject
  @scala.inline
  def DomainModels$AttributeRef: DomainModels$AttributeRef = "DomainModels$AttributeRef".asInstanceOf[DomainModels$AttributeRef]
  
  @js.native
  sealed trait DomainModels$AutoNumberAttributeType extends StObject
  @scala.inline
  def DomainModels$AutoNumberAttributeType: DomainModels$AutoNumberAttributeType = "DomainModels$AutoNumberAttributeType".asInstanceOf[DomainModels$AutoNumberAttributeType]
  
  @js.native
  sealed trait DomainModels$BinaryAttributeType extends StObject
  @scala.inline
  def DomainModels$BinaryAttributeType: DomainModels$BinaryAttributeType = "DomainModels$BinaryAttributeType".asInstanceOf[DomainModels$BinaryAttributeType]
  
  @js.native
  sealed trait DomainModels$BooleanAttributeType extends StObject
  @scala.inline
  def DomainModels$BooleanAttributeType: DomainModels$BooleanAttributeType = "DomainModels$BooleanAttributeType".asInstanceOf[DomainModels$BooleanAttributeType]
  
  @js.native
  sealed trait DomainModels$CalculatedValue extends StObject
  @scala.inline
  def DomainModels$CalculatedValue: DomainModels$CalculatedValue = "DomainModels$CalculatedValue".asInstanceOf[DomainModels$CalculatedValue]
  
  @js.native
  sealed trait DomainModels$CrossAssociation extends StObject
  @scala.inline
  def DomainModels$CrossAssociation: DomainModels$CrossAssociation = "DomainModels$CrossAssociation".asInstanceOf[DomainModels$CrossAssociation]
  
  @js.native
  sealed trait DomainModels$CurrencyAttributeType extends StObject
  @scala.inline
  def DomainModels$CurrencyAttributeType: DomainModels$CurrencyAttributeType = "DomainModels$CurrencyAttributeType".asInstanceOf[DomainModels$CurrencyAttributeType]
  
  @js.native
  sealed trait DomainModels$DateTimeAttributeType extends StObject
  @scala.inline
  def DomainModels$DateTimeAttributeType: DomainModels$DateTimeAttributeType = "DomainModels$DateTimeAttributeType".asInstanceOf[DomainModels$DateTimeAttributeType]
  
  @js.native
  sealed trait DomainModels$DecimalAttributeType extends StObject
  @scala.inline
  def DomainModels$DecimalAttributeType: DomainModels$DecimalAttributeType = "DomainModels$DecimalAttributeType".asInstanceOf[DomainModels$DecimalAttributeType]
  
  @js.native
  sealed trait DomainModels$DirectEntityRef extends StObject
  @scala.inline
  def DomainModels$DirectEntityRef: DomainModels$DirectEntityRef = "DomainModels$DirectEntityRef".asInstanceOf[DomainModels$DirectEntityRef]
  
  @js.native
  sealed trait DomainModels$Entity extends StObject
  @scala.inline
  def DomainModels$Entity: DomainModels$Entity = "DomainModels$Entity".asInstanceOf[DomainModels$Entity]
  
  @js.native
  sealed trait DomainModels$EntityCapabilities extends StObject
  @scala.inline
  def DomainModels$EntityCapabilities: DomainModels$EntityCapabilities = "DomainModels$EntityCapabilities".asInstanceOf[DomainModels$EntityCapabilities]
  
  @js.native
  sealed trait DomainModels$EntityKey extends StObject
  @scala.inline
  def DomainModels$EntityKey: DomainModels$EntityKey = "DomainModels$EntityKey".asInstanceOf[DomainModels$EntityKey]
  
  @js.native
  sealed trait DomainModels$EntityKeyPart extends StObject
  @scala.inline
  def DomainModels$EntityKeyPart: DomainModels$EntityKeyPart = "DomainModels$EntityKeyPart".asInstanceOf[DomainModels$EntityKeyPart]
  
  @js.native
  sealed trait DomainModels$EntityRefStep extends StObject
  @scala.inline
  def DomainModels$EntityRefStep: DomainModels$EntityRefStep = "DomainModels$EntityRefStep".asInstanceOf[DomainModels$EntityRefStep]
  
  @js.native
  sealed trait DomainModels$EnumerationAttributeType extends StObject
  @scala.inline
  def DomainModels$EnumerationAttributeType: DomainModels$EnumerationAttributeType = "DomainModels$EnumerationAttributeType".asInstanceOf[DomainModels$EnumerationAttributeType]
  
  @js.native
  sealed trait DomainModels$EqualsToRuleInfo extends StObject
  @scala.inline
  def DomainModels$EqualsToRuleInfo: DomainModels$EqualsToRuleInfo = "DomainModels$EqualsToRuleInfo".asInstanceOf[DomainModels$EqualsToRuleInfo]
  
  @js.native
  sealed trait DomainModels$EventHandler extends StObject
  @scala.inline
  def DomainModels$EventHandler: DomainModels$EventHandler = "DomainModels$EventHandler".asInstanceOf[DomainModels$EventHandler]
  
  @js.native
  sealed trait DomainModels$FloatAttributeType extends StObject
  @scala.inline
  def DomainModels$FloatAttributeType: DomainModels$FloatAttributeType = "DomainModels$FloatAttributeType".asInstanceOf[DomainModels$FloatAttributeType]
  
  @js.native
  sealed trait DomainModels$Generalization extends StObject
  @scala.inline
  def DomainModels$Generalization: DomainModels$Generalization = "DomainModels$Generalization".asInstanceOf[DomainModels$Generalization]
  
  @js.native
  sealed trait DomainModels$HashedStringAttributeType extends StObject
  @scala.inline
  def DomainModels$HashedStringAttributeType: DomainModels$HashedStringAttributeType = "DomainModels$HashedStringAttributeType".asInstanceOf[DomainModels$HashedStringAttributeType]
  
  @js.native
  sealed trait DomainModels$Index extends StObject
  @scala.inline
  def DomainModels$Index: DomainModels$Index = "DomainModels$Index".asInstanceOf[DomainModels$Index]
  
  @js.native
  sealed trait DomainModels$IndexedAttribute extends StObject
  @scala.inline
  def DomainModels$IndexedAttribute: DomainModels$IndexedAttribute = "DomainModels$IndexedAttribute".asInstanceOf[DomainModels$IndexedAttribute]
  
  @js.native
  sealed trait DomainModels$IndirectEntityRef extends StObject
  @scala.inline
  def DomainModels$IndirectEntityRef: DomainModels$IndirectEntityRef = "DomainModels$IndirectEntityRef".asInstanceOf[DomainModels$IndirectEntityRef]
  
  @js.native
  sealed trait DomainModels$IntegerAttributeType extends StObject
  @scala.inline
  def DomainModels$IntegerAttributeType: DomainModels$IntegerAttributeType = "DomainModels$IntegerAttributeType".asInstanceOf[DomainModels$IntegerAttributeType]
  
  @js.native
  sealed trait DomainModels$LongAttributeType extends StObject
  @scala.inline
  def DomainModels$LongAttributeType: DomainModels$LongAttributeType = "DomainModels$LongAttributeType".asInstanceOf[DomainModels$LongAttributeType]
  
  @js.native
  sealed trait DomainModels$MaxLengthRuleInfo extends StObject
  @scala.inline
  def DomainModels$MaxLengthRuleInfo: DomainModels$MaxLengthRuleInfo = "DomainModels$MaxLengthRuleInfo".asInstanceOf[DomainModels$MaxLengthRuleInfo]
  
  @js.native
  sealed trait DomainModels$MemberAccess extends StObject
  @scala.inline
  def DomainModels$MemberAccess: DomainModels$MemberAccess = "DomainModels$MemberAccess".asInstanceOf[DomainModels$MemberAccess]
  
  @js.native
  sealed trait DomainModels$NoGeneralization extends StObject
  @scala.inline
  def DomainModels$NoGeneralization: DomainModels$NoGeneralization = "DomainModels$NoGeneralization".asInstanceOf[DomainModels$NoGeneralization]
  
  @js.native
  sealed trait DomainModels$RangeRuleInfo extends StObject
  @scala.inline
  def DomainModels$RangeRuleInfo: DomainModels$RangeRuleInfo = "DomainModels$RangeRuleInfo".asInstanceOf[DomainModels$RangeRuleInfo]
  
  @js.native
  sealed trait DomainModels$RegExRuleInfo extends StObject
  @scala.inline
  def DomainModels$RegExRuleInfo: DomainModels$RegExRuleInfo = "DomainModels$RegExRuleInfo".asInstanceOf[DomainModels$RegExRuleInfo]
  
  @js.native
  sealed trait DomainModels$RequiredRuleInfo extends StObject
  @scala.inline
  def DomainModels$RequiredRuleInfo: DomainModels$RequiredRuleInfo = "DomainModels$RequiredRuleInfo".asInstanceOf[DomainModels$RequiredRuleInfo]
  
  @js.native
  sealed trait DomainModels$StoredValue extends StObject
  @scala.inline
  def DomainModels$StoredValue: DomainModels$StoredValue = "DomainModels$StoredValue".asInstanceOf[DomainModels$StoredValue]
  
  @js.native
  sealed trait DomainModels$StringAttributeType extends StObject
  @scala.inline
  def DomainModels$StringAttributeType: DomainModels$StringAttributeType = "DomainModels$StringAttributeType".asInstanceOf[DomainModels$StringAttributeType]
  
  @js.native
  sealed trait DomainModels$UniqueRuleInfo extends StObject
  @scala.inline
  def DomainModels$UniqueRuleInfo: DomainModels$UniqueRuleInfo = "DomainModels$UniqueRuleInfo".asInstanceOf[DomainModels$UniqueRuleInfo]
  
  @js.native
  sealed trait DomainModels$ValidationRule extends StObject
  @scala.inline
  def DomainModels$ValidationRule: DomainModels$ValidationRule = "DomainModels$ValidationRule".asInstanceOf[DomainModels$ValidationRule]
  
  @js.native
  sealed trait Enumerations$Condition extends StObject
  @scala.inline
  def Enumerations$Condition: Enumerations$Condition = "Enumerations$Condition".asInstanceOf[Enumerations$Condition]
  
  @js.native
  sealed trait Enumerations$EnumerationValue extends StObject
  @scala.inline
  def Enumerations$EnumerationValue: Enumerations$EnumerationValue = "Enumerations$EnumerationValue".asInstanceOf[Enumerations$EnumerationValue]
  
  @js.native
  sealed trait ExportMappings$ExportObjectMappingElement extends StObject
  @scala.inline
  def ExportMappings$ExportObjectMappingElement: ExportMappings$ExportObjectMappingElement = "ExportMappings$ExportObjectMappingElement".asInstanceOf[ExportMappings$ExportObjectMappingElement]
  
  @js.native
  sealed trait ExportMappings$ExportValueMappingElement extends StObject
  @scala.inline
  def ExportMappings$ExportValueMappingElement: ExportMappings$ExportValueMappingElement = "ExportMappings$ExportValueMappingElement".asInstanceOf[ExportMappings$ExportValueMappingElement]
  
  @js.native
  sealed trait Expressions$BinaryExpression extends StObject
  @scala.inline
  def Expressions$BinaryExpression: Expressions$BinaryExpression = "Expressions$BinaryExpression".asInstanceOf[Expressions$BinaryExpression]
  
  @js.native
  sealed trait Expressions$BooleanLiteral extends StObject
  @scala.inline
  def Expressions$BooleanLiteral: Expressions$BooleanLiteral = "Expressions$BooleanLiteral".asInstanceOf[Expressions$BooleanLiteral]
  
  @js.native
  sealed trait Expressions$ConstantRefExpression extends StObject
  @scala.inline
  def Expressions$ConstantRefExpression: Expressions$ConstantRefExpression = "Expressions$ConstantRefExpression".asInstanceOf[Expressions$ConstantRefExpression]
  
  @js.native
  sealed trait Expressions$EmptyLiteral extends StObject
  @scala.inline
  def Expressions$EmptyLiteral: Expressions$EmptyLiteral = "Expressions$EmptyLiteral".asInstanceOf[Expressions$EmptyLiteral]
  
  @js.native
  sealed trait Expressions$EnumerationValueRefExpression extends StObject
  @scala.inline
  def Expressions$EnumerationValueRefExpression: Expressions$EnumerationValueRefExpression = "Expressions$EnumerationValueRefExpression".asInstanceOf[Expressions$EnumerationValueRefExpression]
  
  @js.native
  sealed trait Expressions$FloatLiteral extends StObject
  @scala.inline
  def Expressions$FloatLiteral: Expressions$FloatLiteral = "Expressions$FloatLiteral".asInstanceOf[Expressions$FloatLiteral]
  
  @js.native
  sealed trait Expressions$FunctionCallExpression extends StObject
  @scala.inline
  def Expressions$FunctionCallExpression: Expressions$FunctionCallExpression = "Expressions$FunctionCallExpression".asInstanceOf[Expressions$FunctionCallExpression]
  
  @js.native
  sealed trait Expressions$GlobalVariableRef extends StObject
  @scala.inline
  def Expressions$GlobalVariableRef: Expressions$GlobalVariableRef = "Expressions$GlobalVariableRef".asInstanceOf[Expressions$GlobalVariableRef]
  
  @js.native
  sealed trait Expressions$IfExpression extends StObject
  @scala.inline
  def Expressions$IfExpression: Expressions$IfExpression = "Expressions$IfExpression".asInstanceOf[Expressions$IfExpression]
  
  @js.native
  sealed trait Expressions$IntegerLiteral extends StObject
  @scala.inline
  def Expressions$IntegerLiteral: Expressions$IntegerLiteral = "Expressions$IntegerLiteral".asInstanceOf[Expressions$IntegerLiteral]
  
  @js.native
  sealed trait Expressions$NoExpression extends StObject
  @scala.inline
  def Expressions$NoExpression: Expressions$NoExpression = "Expressions$NoExpression".asInstanceOf[Expressions$NoExpression]
  
  @js.native
  sealed trait Expressions$NoVariableRef extends StObject
  @scala.inline
  def Expressions$NoVariableRef: Expressions$NoVariableRef = "Expressions$NoVariableRef".asInstanceOf[Expressions$NoVariableRef]
  
  @js.native
  sealed trait Expressions$ParenthesisExpression extends StObject
  @scala.inline
  def Expressions$ParenthesisExpression: Expressions$ParenthesisExpression = "Expressions$ParenthesisExpression".asInstanceOf[Expressions$ParenthesisExpression]
  
  @js.native
  sealed trait Expressions$StringLiteral extends StObject
  @scala.inline
  def Expressions$StringLiteral: Expressions$StringLiteral = "Expressions$StringLiteral".asInstanceOf[Expressions$StringLiteral]
  
  @js.native
  sealed trait Expressions$UnaryExpression extends StObject
  @scala.inline
  def Expressions$UnaryExpression: Expressions$UnaryExpression = "Expressions$UnaryExpression".asInstanceOf[Expressions$UnaryExpression]
  
  @js.native
  sealed trait Expressions$UnparsableExpression extends StObject
  @scala.inline
  def Expressions$UnparsableExpression: Expressions$UnparsableExpression = "Expressions$UnparsableExpression".asInstanceOf[Expressions$UnparsableExpression]
  
  @js.native
  sealed trait Expressions$VariableRefExpression extends StObject
  @scala.inline
  def Expressions$VariableRefExpression: Expressions$VariableRefExpression = "Expressions$VariableRefExpression".asInstanceOf[Expressions$VariableRefExpression]
  
  @js.native
  sealed trait FAILED
    extends StObject
       with SuccessAppState
  @scala.inline
  def FAILED: FAILED = "FAILED".asInstanceOf[FAILED]
  
  @js.native
  sealed trait FAILED_STAGING
    extends StObject
       with SuccessAppState
  @scala.inline
  def FAILED_STAGING: FAILED_STAGING = "FAILED_STAGING".asInstanceOf[FAILED_STAGING]
  
  @js.native
  sealed trait Failure
    extends StObject
       with BuildResultStatus
  @scala.inline
  def Failure: Failure = "Failure".asInstanceOf[Failure]
  
  @js.native
  sealed trait INVALID_OPENID
    extends StObject
       with CannotFixAppState
  @scala.inline
  def INVALID_OPENID: INVALID_OPENID = "INVALID_OPENID".asInstanceOf[INVALID_OPENID]
  
  @js.native
  sealed trait INVALID_PROJECTID
    extends StObject
       with CannotFixAppState
  @scala.inline
  def INVALID_PROJECTID: INVALID_PROJECTID = "INVALID_PROJECTID".asInstanceOf[INVALID_PROJECTID]
  
  @js.native
  sealed trait Images$Image extends StObject
  @scala.inline
  def Images$Image: Images$Image = "Images$Image".asInstanceOf[Images$Image]
  
  @js.native
  sealed trait ImportMappings$ImportObjectMappingElement extends StObject
  @scala.inline
  def ImportMappings$ImportObjectMappingElement: ImportMappings$ImportObjectMappingElement = "ImportMappings$ImportObjectMappingElement".asInstanceOf[ImportMappings$ImportObjectMappingElement]
  
  @js.native
  sealed trait ImportMappings$ImportValueMappingElement extends StObject
  @scala.inline
  def ImportMappings$ImportValueMappingElement: ImportMappings$ImportValueMappingElement = "ImportMappings$ImportValueMappingElement".asInstanceOf[ImportMappings$ImportValueMappingElement]
  
  @js.native
  sealed trait JavaActions$BasicParameterType extends StObject
  @scala.inline
  def JavaActions$BasicParameterType: JavaActions$BasicParameterType = "JavaActions$BasicParameterType".asInstanceOf[JavaActions$BasicParameterType]
  
  @js.native
  sealed trait JavaActions$BooleanType extends StObject
  @scala.inline
  def JavaActions$BooleanType: JavaActions$BooleanType = "JavaActions$BooleanType".asInstanceOf[JavaActions$BooleanType]
  
  @js.native
  sealed trait JavaActions$ConcreteEntityType extends StObject
  @scala.inline
  def JavaActions$ConcreteEntityType: JavaActions$ConcreteEntityType = "JavaActions$ConcreteEntityType".asInstanceOf[JavaActions$ConcreteEntityType]
  
  @js.native
  sealed trait JavaActions$DateTimeType extends StObject
  @scala.inline
  def JavaActions$DateTimeType: JavaActions$DateTimeType = "JavaActions$DateTimeType".asInstanceOf[JavaActions$DateTimeType]
  
  @js.native
  sealed trait JavaActions$DecimalType extends StObject
  @scala.inline
  def JavaActions$DecimalType: JavaActions$DecimalType = "JavaActions$DecimalType".asInstanceOf[JavaActions$DecimalType]
  
  @js.native
  sealed trait JavaActions$EntityTypeParameterType extends StObject
  @scala.inline
  def JavaActions$EntityTypeParameterType: JavaActions$EntityTypeParameterType = "JavaActions$EntityTypeParameterType".asInstanceOf[JavaActions$EntityTypeParameterType]
  
  @js.native
  sealed trait JavaActions$EnumerationType extends StObject
  @scala.inline
  def JavaActions$EnumerationType: JavaActions$EnumerationType = "JavaActions$EnumerationType".asInstanceOf[JavaActions$EnumerationType]
  
  @js.native
  sealed trait JavaActions$ExportMappingJavaActionParameterType extends StObject
  @scala.inline
  def JavaActions$ExportMappingJavaActionParameterType: JavaActions$ExportMappingJavaActionParameterType = "JavaActions$ExportMappingJavaActionParameterType".asInstanceOf[JavaActions$ExportMappingJavaActionParameterType]
  
  @js.native
  sealed trait JavaActions$ExportMappingParameterType extends StObject
  @scala.inline
  def JavaActions$ExportMappingParameterType: JavaActions$ExportMappingParameterType = "JavaActions$ExportMappingParameterType".asInstanceOf[JavaActions$ExportMappingParameterType]
  
  @js.native
  sealed trait JavaActions$FloatType extends StObject
  @scala.inline
  def JavaActions$FloatType: JavaActions$FloatType = "JavaActions$FloatType".asInstanceOf[JavaActions$FloatType]
  
  @js.native
  sealed trait JavaActions$ImportMappingJavaActionParameterType extends StObject
  @scala.inline
  def JavaActions$ImportMappingJavaActionParameterType: JavaActions$ImportMappingJavaActionParameterType = "JavaActions$ImportMappingJavaActionParameterType".asInstanceOf[JavaActions$ImportMappingJavaActionParameterType]
  
  @js.native
  sealed trait JavaActions$ImportMappingParameterType extends StObject
  @scala.inline
  def JavaActions$ImportMappingParameterType: JavaActions$ImportMappingParameterType = "JavaActions$ImportMappingParameterType".asInstanceOf[JavaActions$ImportMappingParameterType]
  
  @js.native
  sealed trait JavaActions$IntegerType extends StObject
  @scala.inline
  def JavaActions$IntegerType: JavaActions$IntegerType = "JavaActions$IntegerType".asInstanceOf[JavaActions$IntegerType]
  
  @js.native
  sealed trait JavaActions$JavaActionParameter extends StObject
  @scala.inline
  def JavaActions$JavaActionParameter: JavaActions$JavaActionParameter = "JavaActions$JavaActionParameter".asInstanceOf[JavaActions$JavaActionParameter]
  
  @js.native
  sealed trait JavaActions$ListType extends StObject
  @scala.inline
  def JavaActions$ListType: JavaActions$ListType = "JavaActions$ListType".asInstanceOf[JavaActions$ListType]
  
  @js.native
  sealed trait JavaActions$MicroflowActionInfo extends StObject
  @scala.inline
  def JavaActions$MicroflowActionInfo: JavaActions$MicroflowActionInfo = "JavaActions$MicroflowActionInfo".asInstanceOf[JavaActions$MicroflowActionInfo]
  
  @js.native
  sealed trait JavaActions$MicroflowJavaActionParameterType extends StObject
  @scala.inline
  def JavaActions$MicroflowJavaActionParameterType: JavaActions$MicroflowJavaActionParameterType = "JavaActions$MicroflowJavaActionParameterType".asInstanceOf[JavaActions$MicroflowJavaActionParameterType]
  
  @js.native
  sealed trait JavaActions$MicroflowParameterType extends StObject
  @scala.inline
  def JavaActions$MicroflowParameterType: JavaActions$MicroflowParameterType = "JavaActions$MicroflowParameterType".asInstanceOf[JavaActions$MicroflowParameterType]
  
  @js.native
  sealed trait JavaActions$ParameterizedEntityType extends StObject
  @scala.inline
  def JavaActions$ParameterizedEntityType: JavaActions$ParameterizedEntityType = "JavaActions$ParameterizedEntityType".asInstanceOf[JavaActions$ParameterizedEntityType]
  
  @js.native
  sealed trait JavaActions$StringType extends StObject
  @scala.inline
  def JavaActions$StringType: JavaActions$StringType = "JavaActions$StringType".asInstanceOf[JavaActions$StringType]
  
  @js.native
  sealed trait JavaActions$TypeParameter extends StObject
  @scala.inline
  def JavaActions$TypeParameter: JavaActions$TypeParameter = "JavaActions$TypeParameter".asInstanceOf[JavaActions$TypeParameter]
  
  @js.native
  sealed trait JavaScriptActions$JavaScriptActionParameter extends StObject
  @scala.inline
  def JavaScriptActions$JavaScriptActionParameter: JavaScriptActions$JavaScriptActionParameter = "JavaScriptActions$JavaScriptActionParameter".asInstanceOf[JavaScriptActions$JavaScriptActionParameter]
  
  @js.native
  sealed trait JavaScriptActions$NanoflowJavaScriptActionParameterType extends StObject
  @scala.inline
  def JavaScriptActions$NanoflowJavaScriptActionParameterType: JavaScriptActions$NanoflowJavaScriptActionParameterType = "JavaScriptActions$NanoflowJavaScriptActionParameterType".asInstanceOf[JavaScriptActions$NanoflowJavaScriptActionParameterType]
  
  @js.native
  sealed trait JsonStructures$JsonElement extends StObject
  @scala.inline
  def JsonStructures$JsonElement: JsonStructures$JsonElement = "JsonStructures$JsonElement".asInstanceOf[JsonStructures$JsonElement]
  
  @js.native
  sealed trait Kafka$KafkaMappedValue extends StObject
  @scala.inline
  def Kafka$KafkaMappedValue: Kafka$KafkaMappedValue = "Kafka$KafkaMappedValue".asInstanceOf[Kafka$KafkaMappedValue]
  
  @js.native
  sealed trait Kafka$KafkaRemoteEntitySource extends StObject
  @scala.inline
  def Kafka$KafkaRemoteEntitySource: Kafka$KafkaRemoteEntitySource = "Kafka$KafkaRemoteEntitySource".asInstanceOf[Kafka$KafkaRemoteEntitySource]
  
  @js.native
  sealed trait Kafka$PublishedKafkaResource extends StObject
  @scala.inline
  def Kafka$PublishedKafkaResource: Kafka$PublishedKafkaResource = "Kafka$PublishedKafkaResource".asInstanceOf[Kafka$PublishedKafkaResource]
  
  @js.native
  sealed trait Licensed extends StObject
  @scala.inline
  def Licensed: Licensed = "Licensed".asInstanceOf[Licensed]
  
  @js.native
  sealed trait MXBUILD_STARTED
    extends StObject
       with SuccessAppState
  @scala.inline
  def MXBUILD_STARTED: MXBUILD_STARTED = "MXBUILD_STARTED".asInstanceOf[MXBUILD_STARTED]
  
  @js.native
  sealed trait Mappings$MappingMicroflowCall extends StObject
  @scala.inline
  def Mappings$MappingMicroflowCall: Mappings$MappingMicroflowCall = "Mappings$MappingMicroflowCall".asInstanceOf[Mappings$MappingMicroflowCall]
  
  @js.native
  sealed trait Mappings$MappingMicroflowParameter extends StObject
  @scala.inline
  def Mappings$MappingMicroflowParameter: Mappings$MappingMicroflowParameter = "Mappings$MappingMicroflowParameter".asInstanceOf[Mappings$MappingMicroflowParameter]
  
  @js.native
  sealed trait Menus$MenuItem extends StObject
  @scala.inline
  def Menus$MenuItem: Menus$MenuItem = "Menus$MenuItem".asInstanceOf[Menus$MenuItem]
  
  @js.native
  sealed trait Menus$MenuItemCollection extends StObject
  @scala.inline
  def Menus$MenuItemCollection: Menus$MenuItemCollection = "Menus$MenuItemCollection".asInstanceOf[Menus$MenuItemCollection]
  
  @js.native
  sealed trait MessageDefinitions$AssociationElement extends StObject
  @scala.inline
  def MessageDefinitions$AssociationElement: MessageDefinitions$AssociationElement = "MessageDefinitions$AssociationElement".asInstanceOf[MessageDefinitions$AssociationElement]
  
  @js.native
  sealed trait MessageDefinitions$AttributeElement extends StObject
  @scala.inline
  def MessageDefinitions$AttributeElement: MessageDefinitions$AttributeElement = "MessageDefinitions$AttributeElement".asInstanceOf[MessageDefinitions$AttributeElement]
  
  @js.native
  sealed trait MessageDefinitions$EntityElement extends StObject
  @scala.inline
  def MessageDefinitions$EntityElement: MessageDefinitions$EntityElement = "MessageDefinitions$EntityElement".asInstanceOf[MessageDefinitions$EntityElement]
  
  @js.native
  sealed trait MessageDefinitions$EntityMessageDefinition extends StObject
  @scala.inline
  def MessageDefinitions$EntityMessageDefinition: MessageDefinitions$EntityMessageDefinition = "MessageDefinitions$EntityMessageDefinition".asInstanceOf[MessageDefinitions$EntityMessageDefinition]
  
  @js.native
  sealed trait MessageDefinitions$ExposedAssociation extends StObject
  @scala.inline
  def MessageDefinitions$ExposedAssociation: MessageDefinitions$ExposedAssociation = "MessageDefinitions$ExposedAssociation".asInstanceOf[MessageDefinitions$ExposedAssociation]
  
  @js.native
  sealed trait MessageDefinitions$ExposedAttribute extends StObject
  @scala.inline
  def MessageDefinitions$ExposedAttribute: MessageDefinitions$ExposedAttribute = "MessageDefinitions$ExposedAttribute".asInstanceOf[MessageDefinitions$ExposedAttribute]
  
  @js.native
  sealed trait MessageDefinitions$ExposedEntity extends StObject
  @scala.inline
  def MessageDefinitions$ExposedEntity: MessageDefinitions$ExposedEntity = "MessageDefinitions$ExposedEntity".asInstanceOf[MessageDefinitions$ExposedEntity]
  
  @js.native
  sealed trait Microflows$ActionActivity extends StObject
  @scala.inline
  def Microflows$ActionActivity: Microflows$ActionActivity = "Microflows$ActionActivity".asInstanceOf[Microflows$ActionActivity]
  
  @js.native
  sealed trait Microflows$AdvancedRequestHandling extends StObject
  @scala.inline
  def Microflows$AdvancedRequestHandling: Microflows$AdvancedRequestHandling = "Microflows$AdvancedRequestHandling".asInstanceOf[Microflows$AdvancedRequestHandling]
  
  @js.native
  sealed trait Microflows$AggregateListAction extends StObject
  @scala.inline
  def Microflows$AggregateListAction: Microflows$AggregateListAction = "Microflows$AggregateListAction".asInstanceOf[Microflows$AggregateListAction]
  
  @js.native
  sealed trait Microflows$Annotation extends StObject
  @scala.inline
  def Microflows$Annotation: Microflows$Annotation = "Microflows$Annotation".asInstanceOf[Microflows$Annotation]
  
  @js.native
  sealed trait Microflows$AnnotationFlow extends StObject
  @scala.inline
  def Microflows$AnnotationFlow: Microflows$AnnotationFlow = "Microflows$AnnotationFlow".asInstanceOf[Microflows$AnnotationFlow]
  
  @js.native
  sealed trait Microflows$AppServiceCallAction extends StObject
  @scala.inline
  def Microflows$AppServiceCallAction: Microflows$AppServiceCallAction = "Microflows$AppServiceCallAction".asInstanceOf[Microflows$AppServiceCallAction]
  
  @js.native
  sealed trait Microflows$AppServiceCallParameterMapping extends StObject
  @scala.inline
  def Microflows$AppServiceCallParameterMapping: Microflows$AppServiceCallParameterMapping = "Microflows$AppServiceCallParameterMapping".asInstanceOf[Microflows$AppServiceCallParameterMapping]
  
  @js.native
  sealed trait Microflows$AssociationRetrieveSource extends StObject
  @scala.inline
  def Microflows$AssociationRetrieveSource: Microflows$AssociationRetrieveSource = "Microflows$AssociationRetrieveSource".asInstanceOf[Microflows$AssociationRetrieveSource]
  
  @js.native
  sealed trait Microflows$BasicCodeActionParameterValue extends StObject
  @scala.inline
  def Microflows$BasicCodeActionParameterValue: Microflows$BasicCodeActionParameterValue = "Microflows$BasicCodeActionParameterValue".asInstanceOf[Microflows$BasicCodeActionParameterValue]
  
  @js.native
  sealed trait Microflows$BasicJavaActionParameterValue extends StObject
  @scala.inline
  def Microflows$BasicJavaActionParameterValue: Microflows$BasicJavaActionParameterValue = "Microflows$BasicJavaActionParameterValue".asInstanceOf[Microflows$BasicJavaActionParameterValue]
  
  @js.native
  sealed trait Microflows$BinaryRequestHandling extends StObject
  @scala.inline
  def Microflows$BinaryRequestHandling: Microflows$BinaryRequestHandling = "Microflows$BinaryRequestHandling".asInstanceOf[Microflows$BinaryRequestHandling]
  
  @js.native
  sealed trait Microflows$BreakEvent extends StObject
  @scala.inline
  def Microflows$BreakEvent: Microflows$BreakEvent = "Microflows$BreakEvent".asInstanceOf[Microflows$BreakEvent]
  
  @js.native
  sealed trait Microflows$CastAction extends StObject
  @scala.inline
  def Microflows$CastAction: Microflows$CastAction = "Microflows$CastAction".asInstanceOf[Microflows$CastAction]
  
  @js.native
  sealed trait Microflows$ChangeListAction extends StObject
  @scala.inline
  def Microflows$ChangeListAction: Microflows$ChangeListAction = "Microflows$ChangeListAction".asInstanceOf[Microflows$ChangeListAction]
  
  @js.native
  sealed trait Microflows$ChangeObjectAction extends StObject
  @scala.inline
  def Microflows$ChangeObjectAction: Microflows$ChangeObjectAction = "Microflows$ChangeObjectAction".asInstanceOf[Microflows$ChangeObjectAction]
  
  @js.native
  sealed trait Microflows$ChangeVariableAction extends StObject
  @scala.inline
  def Microflows$ChangeVariableAction: Microflows$ChangeVariableAction = "Microflows$ChangeVariableAction".asInstanceOf[Microflows$ChangeVariableAction]
  
  @js.native
  sealed trait Microflows$CloseFormAction extends StObject
  @scala.inline
  def Microflows$CloseFormAction: Microflows$CloseFormAction = "Microflows$CloseFormAction".asInstanceOf[Microflows$CloseFormAction]
  
  @js.native
  sealed trait Microflows$CommitAction extends StObject
  @scala.inline
  def Microflows$CommitAction: Microflows$CommitAction = "Microflows$CommitAction".asInstanceOf[Microflows$CommitAction]
  
  @js.native
  sealed trait Microflows$ConstantRange extends StObject
  @scala.inline
  def Microflows$ConstantRange: Microflows$ConstantRange = "Microflows$ConstantRange".asInstanceOf[Microflows$ConstantRange]
  
  @js.native
  sealed trait Microflows$Contains extends StObject
  @scala.inline
  def Microflows$Contains: Microflows$Contains = "Microflows$Contains".asInstanceOf[Microflows$Contains]
  
  @js.native
  sealed trait Microflows$ContinueEvent extends StObject
  @scala.inline
  def Microflows$ContinueEvent: Microflows$ContinueEvent = "Microflows$ContinueEvent".asInstanceOf[Microflows$ContinueEvent]
  
  @js.native
  sealed trait Microflows$CreateListAction extends StObject
  @scala.inline
  def Microflows$CreateListAction: Microflows$CreateListAction = "Microflows$CreateListAction".asInstanceOf[Microflows$CreateListAction]
  
  @js.native
  sealed trait Microflows$CreateObjectAction extends StObject
  @scala.inline
  def Microflows$CreateObjectAction: Microflows$CreateObjectAction = "Microflows$CreateObjectAction".asInstanceOf[Microflows$CreateObjectAction]
  
  @js.native
  sealed trait Microflows$CreateVariableAction extends StObject
  @scala.inline
  def Microflows$CreateVariableAction: Microflows$CreateVariableAction = "Microflows$CreateVariableAction".asInstanceOf[Microflows$CreateVariableAction]
  
  @js.native
  sealed trait Microflows$CustomRange extends StObject
  @scala.inline
  def Microflows$CustomRange: Microflows$CustomRange = "Microflows$CustomRange".asInstanceOf[Microflows$CustomRange]
  
  @js.native
  sealed trait Microflows$CustomRequestHandling extends StObject
  @scala.inline
  def Microflows$CustomRequestHandling: Microflows$CustomRequestHandling = "Microflows$CustomRequestHandling".asInstanceOf[Microflows$CustomRequestHandling]
  
  @js.native
  sealed trait Microflows$DatabaseRetrieveSource extends StObject
  @scala.inline
  def Microflows$DatabaseRetrieveSource: Microflows$DatabaseRetrieveSource = "Microflows$DatabaseRetrieveSource".asInstanceOf[Microflows$DatabaseRetrieveSource]
  
  @js.native
  sealed trait Microflows$DeleteAction extends StObject
  @scala.inline
  def Microflows$DeleteAction: Microflows$DeleteAction = "Microflows$DeleteAction".asInstanceOf[Microflows$DeleteAction]
  
  @js.native
  sealed trait Microflows$DocumentTemplateParameterMapping extends StObject
  @scala.inline
  def Microflows$DocumentTemplateParameterMapping: Microflows$DocumentTemplateParameterMapping = "Microflows$DocumentTemplateParameterMapping".asInstanceOf[Microflows$DocumentTemplateParameterMapping]
  
  @js.native
  sealed trait Microflows$DownloadFileAction extends StObject
  @scala.inline
  def Microflows$DownloadFileAction: Microflows$DownloadFileAction = "Microflows$DownloadFileAction".asInstanceOf[Microflows$DownloadFileAction]
  
  @js.native
  sealed trait Microflows$EndEvent extends StObject
  @scala.inline
  def Microflows$EndEvent: Microflows$EndEvent = "Microflows$EndEvent".asInstanceOf[Microflows$EndEvent]
  
  @js.native
  sealed trait Microflows$EntityTypeCodeActionParameterValue extends StObject
  @scala.inline
  def Microflows$EntityTypeCodeActionParameterValue: Microflows$EntityTypeCodeActionParameterValue = "Microflows$EntityTypeCodeActionParameterValue".asInstanceOf[Microflows$EntityTypeCodeActionParameterValue]
  
  @js.native
  sealed trait Microflows$EntityTypeJavaActionParameterValue extends StObject
  @scala.inline
  def Microflows$EntityTypeJavaActionParameterValue: Microflows$EntityTypeJavaActionParameterValue = "Microflows$EntityTypeJavaActionParameterValue".asInstanceOf[Microflows$EntityTypeJavaActionParameterValue]
  
  @js.native
  sealed trait Microflows$EnumerationCase extends StObject
  @scala.inline
  def Microflows$EnumerationCase: Microflows$EnumerationCase = "Microflows$EnumerationCase".asInstanceOf[Microflows$EnumerationCase]
  
  @js.native
  sealed trait Microflows$ErrorEvent extends StObject
  @scala.inline
  def Microflows$ErrorEvent: Microflows$ErrorEvent = "Microflows$ErrorEvent".asInstanceOf[Microflows$ErrorEvent]
  
  @js.native
  sealed trait Microflows$ExclusiveMerge extends StObject
  @scala.inline
  def Microflows$ExclusiveMerge: Microflows$ExclusiveMerge = "Microflows$ExclusiveMerge".asInstanceOf[Microflows$ExclusiveMerge]
  
  @js.native
  sealed trait Microflows$ExclusiveSplit extends StObject
  @scala.inline
  def Microflows$ExclusiveSplit: Microflows$ExclusiveSplit = "Microflows$ExclusiveSplit".asInstanceOf[Microflows$ExclusiveSplit]
  
  @js.native
  sealed trait Microflows$ExportMappingJavaActionParameterValue extends StObject
  @scala.inline
  def Microflows$ExportMappingJavaActionParameterValue: Microflows$ExportMappingJavaActionParameterValue = "Microflows$ExportMappingJavaActionParameterValue".asInstanceOf[Microflows$ExportMappingJavaActionParameterValue]
  
  @js.native
  sealed trait Microflows$ExportMappingParameterValue extends StObject
  @scala.inline
  def Microflows$ExportMappingParameterValue: Microflows$ExportMappingParameterValue = "Microflows$ExportMappingParameterValue".asInstanceOf[Microflows$ExportMappingParameterValue]
  
  @js.native
  sealed trait Microflows$ExportXmlAction extends StObject
  @scala.inline
  def Microflows$ExportXmlAction: Microflows$ExportXmlAction = "Microflows$ExportXmlAction".asInstanceOf[Microflows$ExportXmlAction]
  
  @js.native
  sealed trait Microflows$ExpressionSplitCondition extends StObject
  @scala.inline
  def Microflows$ExpressionSplitCondition: Microflows$ExpressionSplitCondition = "Microflows$ExpressionSplitCondition".asInstanceOf[Microflows$ExpressionSplitCondition]
  
  @js.native
  sealed trait Microflows$FileDocumentExport extends StObject
  @scala.inline
  def Microflows$FileDocumentExport: Microflows$FileDocumentExport = "Microflows$FileDocumentExport".asInstanceOf[Microflows$FileDocumentExport]
  
  @js.native
  sealed trait Microflows$Filter extends StObject
  @scala.inline
  def Microflows$Filter: Microflows$Filter = "Microflows$Filter".asInstanceOf[Microflows$Filter]
  
  @js.native
  sealed trait Microflows$Find extends StObject
  @scala.inline
  def Microflows$Find: Microflows$Find = "Microflows$Find".asInstanceOf[Microflows$Find]
  
  @js.native
  sealed trait Microflows$FormDataPart extends StObject
  @scala.inline
  def Microflows$FormDataPart: Microflows$FormDataPart = "Microflows$FormDataPart".asInstanceOf[Microflows$FormDataPart]
  
  @js.native
  sealed trait Microflows$FormDataRequestHandling extends StObject
  @scala.inline
  def Microflows$FormDataRequestHandling: Microflows$FormDataRequestHandling = "Microflows$FormDataRequestHandling".asInstanceOf[Microflows$FormDataRequestHandling]
  
  @js.native
  sealed trait Microflows$GenerateDocumentAction extends StObject
  @scala.inline
  def Microflows$GenerateDocumentAction: Microflows$GenerateDocumentAction = "Microflows$GenerateDocumentAction".asInstanceOf[Microflows$GenerateDocumentAction]
  
  @js.native
  sealed trait Microflows$Head extends StObject
  @scala.inline
  def Microflows$Head: Microflows$Head = "Microflows$Head".asInstanceOf[Microflows$Head]
  
  @js.native
  sealed trait Microflows$HttpConfiguration extends StObject
  @scala.inline
  def Microflows$HttpConfiguration: Microflows$HttpConfiguration = "Microflows$HttpConfiguration".asInstanceOf[Microflows$HttpConfiguration]
  
  @js.native
  sealed trait Microflows$HttpHeaderEntry extends StObject
  @scala.inline
  def Microflows$HttpHeaderEntry: Microflows$HttpHeaderEntry = "Microflows$HttpHeaderEntry".asInstanceOf[Microflows$HttpHeaderEntry]
  
  @js.native
  sealed trait Microflows$ImportMappingCall extends StObject
  @scala.inline
  def Microflows$ImportMappingCall: Microflows$ImportMappingCall = "Microflows$ImportMappingCall".asInstanceOf[Microflows$ImportMappingCall]
  
  @js.native
  sealed trait Microflows$ImportMappingJavaActionParameterValue extends StObject
  @scala.inline
  def Microflows$ImportMappingJavaActionParameterValue: Microflows$ImportMappingJavaActionParameterValue = "Microflows$ImportMappingJavaActionParameterValue".asInstanceOf[Microflows$ImportMappingJavaActionParameterValue]
  
  @js.native
  sealed trait Microflows$ImportMappingParameterValue extends StObject
  @scala.inline
  def Microflows$ImportMappingParameterValue: Microflows$ImportMappingParameterValue = "Microflows$ImportMappingParameterValue".asInstanceOf[Microflows$ImportMappingParameterValue]
  
  @js.native
  sealed trait Microflows$ImportXmlAction extends StObject
  @scala.inline
  def Microflows$ImportXmlAction: Microflows$ImportXmlAction = "Microflows$ImportXmlAction".asInstanceOf[Microflows$ImportXmlAction]
  
  @js.native
  sealed trait Microflows$InheritanceCase extends StObject
  @scala.inline
  def Microflows$InheritanceCase: Microflows$InheritanceCase = "Microflows$InheritanceCase".asInstanceOf[Microflows$InheritanceCase]
  
  @js.native
  sealed trait Microflows$InheritanceSplit extends StObject
  @scala.inline
  def Microflows$InheritanceSplit: Microflows$InheritanceSplit = "Microflows$InheritanceSplit".asInstanceOf[Microflows$InheritanceSplit]
  
  @js.native
  sealed trait Microflows$Intersect extends StObject
  @scala.inline
  def Microflows$Intersect: Microflows$Intersect = "Microflows$Intersect".asInstanceOf[Microflows$Intersect]
  
  @js.native
  sealed trait Microflows$JavaActionCallAction extends StObject
  @scala.inline
  def Microflows$JavaActionCallAction: Microflows$JavaActionCallAction = "Microflows$JavaActionCallAction".asInstanceOf[Microflows$JavaActionCallAction]
  
  @js.native
  sealed trait Microflows$JavaActionParameterMapping extends StObject
  @scala.inline
  def Microflows$JavaActionParameterMapping: Microflows$JavaActionParameterMapping = "Microflows$JavaActionParameterMapping".asInstanceOf[Microflows$JavaActionParameterMapping]
  
  @js.native
  sealed trait Microflows$JavaScriptActionCallAction extends StObject
  @scala.inline
  def Microflows$JavaScriptActionCallAction: Microflows$JavaScriptActionCallAction = "Microflows$JavaScriptActionCallAction".asInstanceOf[Microflows$JavaScriptActionCallAction]
  
  @js.native
  sealed trait Microflows$JavaScriptActionParameterMapping extends StObject
  @scala.inline
  def Microflows$JavaScriptActionParameterMapping: Microflows$JavaScriptActionParameterMapping = "Microflows$JavaScriptActionParameterMapping".asInstanceOf[Microflows$JavaScriptActionParameterMapping]
  
  @js.native
  sealed trait Microflows$ListEquals extends StObject
  @scala.inline
  def Microflows$ListEquals: Microflows$ListEquals = "Microflows$ListEquals".asInstanceOf[Microflows$ListEquals]
  
  @js.native
  sealed trait Microflows$ListOperationAction extends StObject
  @scala.inline
  def Microflows$ListOperationAction: Microflows$ListOperationAction = "Microflows$ListOperationAction".asInstanceOf[Microflows$ListOperationAction]
  
  @js.native
  sealed trait Microflows$LogMessageAction extends StObject
  @scala.inline
  def Microflows$LogMessageAction: Microflows$LogMessageAction = "Microflows$LogMessageAction".asInstanceOf[Microflows$LogMessageAction]
  
  @js.native
  sealed trait Microflows$LoopedActivity extends StObject
  @scala.inline
  def Microflows$LoopedActivity: Microflows$LoopedActivity = "Microflows$LoopedActivity".asInstanceOf[Microflows$LoopedActivity]
  
  @js.native
  sealed trait Microflows$MappingRequestHandling extends StObject
  @scala.inline
  def Microflows$MappingRequestHandling: Microflows$MappingRequestHandling = "Microflows$MappingRequestHandling".asInstanceOf[Microflows$MappingRequestHandling]
  
  @js.native
  sealed trait Microflows$MemberChange extends StObject
  @scala.inline
  def Microflows$MemberChange: Microflows$MemberChange = "Microflows$MemberChange".asInstanceOf[Microflows$MemberChange]
  
  @js.native
  sealed trait Microflows$MicroflowCall extends StObject
  @scala.inline
  def Microflows$MicroflowCall: Microflows$MicroflowCall = "Microflows$MicroflowCall".asInstanceOf[Microflows$MicroflowCall]
  
  @js.native
  sealed trait Microflows$MicroflowCallAction extends StObject
  @scala.inline
  def Microflows$MicroflowCallAction: Microflows$MicroflowCallAction = "Microflows$MicroflowCallAction".asInstanceOf[Microflows$MicroflowCallAction]
  
  @js.native
  sealed trait Microflows$MicroflowCallParameterMapping extends StObject
  @scala.inline
  def Microflows$MicroflowCallParameterMapping: Microflows$MicroflowCallParameterMapping = "Microflows$MicroflowCallParameterMapping".asInstanceOf[Microflows$MicroflowCallParameterMapping]
  
  @js.native
  sealed trait Microflows$MicroflowJavaActionParameterValue extends StObject
  @scala.inline
  def Microflows$MicroflowJavaActionParameterValue: Microflows$MicroflowJavaActionParameterValue = "Microflows$MicroflowJavaActionParameterValue".asInstanceOf[Microflows$MicroflowJavaActionParameterValue]
  
  @js.native
  sealed trait Microflows$MicroflowObjectCollection extends StObject
  @scala.inline
  def Microflows$MicroflowObjectCollection: Microflows$MicroflowObjectCollection = "Microflows$MicroflowObjectCollection".asInstanceOf[Microflows$MicroflowObjectCollection]
  
  @js.native
  sealed trait Microflows$MicroflowParameter extends StObject
  @scala.inline
  def Microflows$MicroflowParameter: Microflows$MicroflowParameter = "Microflows$MicroflowParameter".asInstanceOf[Microflows$MicroflowParameter]
  
  @js.native
  sealed trait Microflows$MicroflowParameterObject extends StObject
  @scala.inline
  def Microflows$MicroflowParameterObject: Microflows$MicroflowParameterObject = "Microflows$MicroflowParameterObject".asInstanceOf[Microflows$MicroflowParameterObject]
  
  @js.native
  sealed trait Microflows$MicroflowParameterValue extends StObject
  @scala.inline
  def Microflows$MicroflowParameterValue: Microflows$MicroflowParameterValue = "Microflows$MicroflowParameterValue".asInstanceOf[Microflows$MicroflowParameterValue]
  
  @js.native
  sealed trait Microflows$NanoflowCall extends StObject
  @scala.inline
  def Microflows$NanoflowCall: Microflows$NanoflowCall = "Microflows$NanoflowCall".asInstanceOf[Microflows$NanoflowCall]
  
  @js.native
  sealed trait Microflows$NanoflowCallAction extends StObject
  @scala.inline
  def Microflows$NanoflowCallAction: Microflows$NanoflowCallAction = "Microflows$NanoflowCallAction".asInstanceOf[Microflows$NanoflowCallAction]
  
  @js.native
  sealed trait Microflows$NanoflowCallParameterMapping extends StObject
  @scala.inline
  def Microflows$NanoflowCallParameterMapping: Microflows$NanoflowCallParameterMapping = "Microflows$NanoflowCallParameterMapping".asInstanceOf[Microflows$NanoflowCallParameterMapping]
  
  @js.native
  sealed trait Microflows$NanoflowParameter extends StObject
  @scala.inline
  def Microflows$NanoflowParameter: Microflows$NanoflowParameter = "Microflows$NanoflowParameter".asInstanceOf[Microflows$NanoflowParameter]
  
  @js.native
  sealed trait Microflows$NoCase extends StObject
  @scala.inline
  def Microflows$NoCase: Microflows$NoCase = "Microflows$NoCase".asInstanceOf[Microflows$NoCase]
  
  @js.native
  sealed trait Microflows$OpenUserTaskAction extends StObject
  @scala.inline
  def Microflows$OpenUserTaskAction: Microflows$OpenUserTaskAction = "Microflows$OpenUserTaskAction".asInstanceOf[Microflows$OpenUserTaskAction]
  
  @js.native
  sealed trait Microflows$PrimitiveTypedTemplateArgument extends StObject
  @scala.inline
  def Microflows$PrimitiveTypedTemplateArgument: Microflows$PrimitiveTypedTemplateArgument = "Microflows$PrimitiveTypedTemplateArgument".asInstanceOf[Microflows$PrimitiveTypedTemplateArgument]
  
  @js.native
  sealed trait Microflows$ProxyConfiguration extends StObject
  @scala.inline
  def Microflows$ProxyConfiguration: Microflows$ProxyConfiguration = "Microflows$ProxyConfiguration".asInstanceOf[Microflows$ProxyConfiguration]
  
  @js.native
  sealed trait Microflows$PushToClientAction extends StObject
  @scala.inline
  def Microflows$PushToClientAction: Microflows$PushToClientAction = "Microflows$PushToClientAction".asInstanceOf[Microflows$PushToClientAction]
  
  @js.native
  sealed trait Microflows$RestCallAction extends StObject
  @scala.inline
  def Microflows$RestCallAction: Microflows$RestCallAction = "Microflows$RestCallAction".asInstanceOf[Microflows$RestCallAction]
  
  @js.native
  sealed trait Microflows$ResultHandling extends StObject
  @scala.inline
  def Microflows$ResultHandling: Microflows$ResultHandling = "Microflows$ResultHandling".asInstanceOf[Microflows$ResultHandling]
  
  @js.native
  sealed trait Microflows$RetrieveAction extends StObject
  @scala.inline
  def Microflows$RetrieveAction: Microflows$RetrieveAction = "Microflows$RetrieveAction".asInstanceOf[Microflows$RetrieveAction]
  
  @js.native
  sealed trait Microflows$RollbackAction extends StObject
  @scala.inline
  def Microflows$RollbackAction: Microflows$RollbackAction = "Microflows$RollbackAction".asInstanceOf[Microflows$RollbackAction]
  
  @js.native
  sealed trait Microflows$RuleCall extends StObject
  @scala.inline
  def Microflows$RuleCall: Microflows$RuleCall = "Microflows$RuleCall".asInstanceOf[Microflows$RuleCall]
  
  @js.native
  sealed trait Microflows$RuleCallParameterMapping extends StObject
  @scala.inline
  def Microflows$RuleCallParameterMapping: Microflows$RuleCallParameterMapping = "Microflows$RuleCallParameterMapping".asInstanceOf[Microflows$RuleCallParameterMapping]
  
  @js.native
  sealed trait Microflows$RuleParameter extends StObject
  @scala.inline
  def Microflows$RuleParameter: Microflows$RuleParameter = "Microflows$RuleParameter".asInstanceOf[Microflows$RuleParameter]
  
  @js.native
  sealed trait Microflows$RuleSplitCondition extends StObject
  @scala.inline
  def Microflows$RuleSplitCondition: Microflows$RuleSplitCondition = "Microflows$RuleSplitCondition".asInstanceOf[Microflows$RuleSplitCondition]
  
  @js.native
  sealed trait Microflows$SequenceFlow extends StObject
  @scala.inline
  def Microflows$SequenceFlow: Microflows$SequenceFlow = "Microflows$SequenceFlow".asInstanceOf[Microflows$SequenceFlow]
  
  @js.native
  sealed trait Microflows$SetTaskOutcomeAction extends StObject
  @scala.inline
  def Microflows$SetTaskOutcomeAction: Microflows$SetTaskOutcomeAction = "Microflows$SetTaskOutcomeAction".asInstanceOf[Microflows$SetTaskOutcomeAction]
  
  @js.native
  sealed trait Microflows$ShowHomePageAction extends StObject
  @scala.inline
  def Microflows$ShowHomePageAction: Microflows$ShowHomePageAction = "Microflows$ShowHomePageAction".asInstanceOf[Microflows$ShowHomePageAction]
  
  @js.native
  sealed trait Microflows$ShowMessageAction extends StObject
  @scala.inline
  def Microflows$ShowMessageAction: Microflows$ShowMessageAction = "Microflows$ShowMessageAction".asInstanceOf[Microflows$ShowMessageAction]
  
  @js.native
  sealed trait Microflows$ShowPageAction extends StObject
  @scala.inline
  def Microflows$ShowPageAction: Microflows$ShowPageAction = "Microflows$ShowPageAction".asInstanceOf[Microflows$ShowPageAction]
  
  @js.native
  sealed trait Microflows$SimpleRequestHandling extends StObject
  @scala.inline
  def Microflows$SimpleRequestHandling: Microflows$SimpleRequestHandling = "Microflows$SimpleRequestHandling".asInstanceOf[Microflows$SimpleRequestHandling]
  
  @js.native
  sealed trait Microflows$Sort extends StObject
  @scala.inline
  def Microflows$Sort: Microflows$Sort = "Microflows$Sort".asInstanceOf[Microflows$Sort]
  
  @js.native
  sealed trait Microflows$SortItem extends StObject
  @scala.inline
  def Microflows$SortItem: Microflows$SortItem = "Microflows$SortItem".asInstanceOf[Microflows$SortItem]
  
  @js.native
  sealed trait Microflows$SortItemList extends StObject
  @scala.inline
  def Microflows$SortItemList: Microflows$SortItemList = "Microflows$SortItemList".asInstanceOf[Microflows$SortItemList]
  
  @js.native
  sealed trait Microflows$StartEvent extends StObject
  @scala.inline
  def Microflows$StartEvent: Microflows$StartEvent = "Microflows$StartEvent".asInstanceOf[Microflows$StartEvent]
  
  @js.native
  sealed trait Microflows$StringTemplate extends StObject
  @scala.inline
  def Microflows$StringTemplate: Microflows$StringTemplate = "Microflows$StringTemplate".asInstanceOf[Microflows$StringTemplate]
  
  @js.native
  sealed trait Microflows$StringTemplateParameterValue extends StObject
  @scala.inline
  def Microflows$StringTemplateParameterValue: Microflows$StringTemplateParameterValue = "Microflows$StringTemplateParameterValue".asInstanceOf[Microflows$StringTemplateParameterValue]
  
  @js.native
  sealed trait Microflows$Subtract extends StObject
  @scala.inline
  def Microflows$Subtract: Microflows$Subtract = "Microflows$Subtract".asInstanceOf[Microflows$Subtract]
  
  @js.native
  sealed trait Microflows$SynchronizeAction extends StObject
  @scala.inline
  def Microflows$SynchronizeAction: Microflows$SynchronizeAction = "Microflows$SynchronizeAction".asInstanceOf[Microflows$SynchronizeAction]
  
  @js.native
  sealed trait Microflows$Tail extends StObject
  @scala.inline
  def Microflows$Tail: Microflows$Tail = "Microflows$Tail".asInstanceOf[Microflows$Tail]
  
  @js.native
  sealed trait Microflows$TemplateArgument extends StObject
  @scala.inline
  def Microflows$TemplateArgument: Microflows$TemplateArgument = "Microflows$TemplateArgument".asInstanceOf[Microflows$TemplateArgument]
  
  @js.native
  sealed trait Microflows$TextTemplate extends StObject
  @scala.inline
  def Microflows$TextTemplate: Microflows$TextTemplate = "Microflows$TextTemplate".asInstanceOf[Microflows$TextTemplate]
  
  @js.native
  sealed trait Microflows$TypedTemplate extends StObject
  @scala.inline
  def Microflows$TypedTemplate: Microflows$TypedTemplate = "Microflows$TypedTemplate".asInstanceOf[Microflows$TypedTemplate]
  
  @js.native
  sealed trait Microflows$Union extends StObject
  @scala.inline
  def Microflows$Union: Microflows$Union = "Microflows$Union".asInstanceOf[Microflows$Union]
  
  @js.native
  sealed trait Microflows$ValidationFeedbackAction extends StObject
  @scala.inline
  def Microflows$ValidationFeedbackAction: Microflows$ValidationFeedbackAction = "Microflows$ValidationFeedbackAction".asInstanceOf[Microflows$ValidationFeedbackAction]
  
  @js.native
  sealed trait Microflows$VariableExport extends StObject
  @scala.inline
  def Microflows$VariableExport: Microflows$VariableExport = "Microflows$VariableExport".asInstanceOf[Microflows$VariableExport]
  
  @js.native
  sealed trait Microflows$WebServiceCallAction extends StObject
  @scala.inline
  def Microflows$WebServiceCallAction: Microflows$WebServiceCallAction = "Microflows$WebServiceCallAction".asInstanceOf[Microflows$WebServiceCallAction]
  
  @js.native
  sealed trait Microflows$WebServiceOperationAdvancedParameterMapping extends StObject
  @scala.inline
  def Microflows$WebServiceOperationAdvancedParameterMapping: Microflows$WebServiceOperationAdvancedParameterMapping = "Microflows$WebServiceOperationAdvancedParameterMapping".asInstanceOf[Microflows$WebServiceOperationAdvancedParameterMapping]
  
  @js.native
  sealed trait Microflows$WebServiceOperationSimpleParameterMapping extends StObject
  @scala.inline
  def Microflows$WebServiceOperationSimpleParameterMapping: Microflows$WebServiceOperationSimpleParameterMapping = "Microflows$WebServiceOperationSimpleParameterMapping".asInstanceOf[Microflows$WebServiceOperationSimpleParameterMapping]
  
  @js.native
  sealed trait Microflows$WorkflowCallAction extends StObject
  @scala.inline
  def Microflows$WorkflowCallAction: Microflows$WorkflowCallAction = "Microflows$WorkflowCallAction".asInstanceOf[Microflows$WorkflowCallAction]
  
  @js.native
  sealed trait NO_WEBMODELER_TARGET_SELECTED
    extends StObject
       with CannotFixAppState
  @scala.inline
  def NO_WEBMODELER_TARGET_SELECTED: NO_WEBMODELER_TARGET_SELECTED = "NO_WEBMODELER_TARGET_SELECTED".asInstanceOf[NO_WEBMODELER_TARGET_SELECTED]
  
  @js.native
  sealed trait Nanoflows$NanoflowParameterValue extends StObject
  @scala.inline
  def Nanoflows$NanoflowParameterValue: Nanoflows$NanoflowParameterValue = "Nanoflows$NanoflowParameterValue".asInstanceOf[Nanoflows$NanoflowParameterValue]
  
  @js.native
  sealed trait NativePages$BottomBarItem extends StObject
  @scala.inline
  def NativePages$BottomBarItem: NativePages$BottomBarItem = "NativePages$BottomBarItem".asInstanceOf[NativePages$BottomBarItem]
  
  @js.native
  sealed trait NativePages$NativeLayoutCallArgument extends StObject
  @scala.inline
  def NativePages$NativeLayoutCallArgument: NativePages$NativeLayoutCallArgument = "NativePages$NativeLayoutCallArgument".asInstanceOf[NativePages$NativeLayoutCallArgument]
  
  @js.native
  sealed trait NativePages$NativePageClientAction extends StObject
  @scala.inline
  def NativePages$NativePageClientAction: NativePages$NativePageClientAction = "NativePages$NativePageClientAction".asInstanceOf[NativePages$NativePageClientAction]
  
  @js.native
  sealed trait NativePages$NativePlaceholder extends StObject
  @scala.inline
  def NativePages$NativePlaceholder: NativePages$NativePlaceholder = "NativePages$NativePlaceholder".asInstanceOf[NativePages$NativePlaceholder]
  
  @js.native
  sealed trait Navigation$HomePage extends StObject
  @scala.inline
  def Navigation$HomePage: Navigation$HomePage = "Navigation$HomePage".asInstanceOf[Navigation$HomePage]
  
  @js.native
  sealed trait Navigation$NativeNavigationProfile extends StObject
  @scala.inline
  def Navigation$NativeNavigationProfile: Navigation$NativeNavigationProfile = "Navigation$NativeNavigationProfile".asInstanceOf[Navigation$NativeNavigationProfile]
  
  @js.native
  sealed trait Navigation$NavigationProfile extends StObject
  @scala.inline
  def Navigation$NavigationProfile: Navigation$NavigationProfile = "Navigation$NavigationProfile".asInstanceOf[Navigation$NavigationProfile]
  
  @js.native
  sealed trait Navigation$OfflineEntityConfig extends StObject
  @scala.inline
  def Navigation$OfflineEntityConfig: Navigation$OfflineEntityConfig = "Navigation$OfflineEntityConfig".asInstanceOf[Navigation$OfflineEntityConfig]
  
  @js.native
  sealed trait Navigation$RoleBasedHomePage extends StObject
  @scala.inline
  def Navigation$RoleBasedHomePage: Navigation$RoleBasedHomePage = "Navigation$RoleBasedHomePage".asInstanceOf[Navigation$RoleBasedHomePage]
  
  @js.native
  sealed trait Navigation$RoleBasedNativeHomePage extends StObject
  @scala.inline
  def Navigation$RoleBasedNativeHomePage: Navigation$RoleBasedNativeHomePage = "Navigation$RoleBasedNativeHomePage".asInstanceOf[Navigation$RoleBasedNativeHomePage]
  
  @js.native
  sealed trait Pages$ActionButton extends StObject
  @scala.inline
  def Pages$ActionButton: Pages$ActionButton = "Pages$ActionButton".asInstanceOf[Pages$ActionButton]
  
  @js.native
  sealed trait Pages$Appearance extends StObject
  @scala.inline
  def Pages$Appearance: Pages$Appearance = "Pages$Appearance".asInstanceOf[Pages$Appearance]
  
  @js.native
  sealed trait Pages$AssociationSource extends StObject
  @scala.inline
  def Pages$AssociationSource: Pages$AssociationSource = "Pages$AssociationSource".asInstanceOf[Pages$AssociationSource]
  
  @js.native
  sealed trait Pages$BackButton extends StObject
  @scala.inline
  def Pages$BackButton: Pages$BackButton = "Pages$BackButton".asInstanceOf[Pages$BackButton]
  
  @js.native
  sealed trait Pages$CallNanoflowClientAction extends StObject
  @scala.inline
  def Pages$CallNanoflowClientAction: Pages$CallNanoflowClientAction = "Pages$CallNanoflowClientAction".asInstanceOf[Pages$CallNanoflowClientAction]
  
  @js.native
  sealed trait Pages$CallWorkflowClientAction extends StObject
  @scala.inline
  def Pages$CallWorkflowClientAction: Pages$CallWorkflowClientAction = "Pages$CallWorkflowClientAction".asInstanceOf[Pages$CallWorkflowClientAction]
  
  @js.native
  sealed trait Pages$CancelButton extends StObject
  @scala.inline
  def Pages$CancelButton: Pages$CancelButton = "Pages$CancelButton".asInstanceOf[Pages$CancelButton]
  
  @js.native
  sealed trait Pages$CancelChangesClientAction extends StObject
  @scala.inline
  def Pages$CancelChangesClientAction: Pages$CancelChangesClientAction = "Pages$CancelChangesClientAction".asInstanceOf[Pages$CancelChangesClientAction]
  
  @js.native
  sealed trait Pages$CheckBox extends StObject
  @scala.inline
  def Pages$CheckBox: Pages$CheckBox = "Pages$CheckBox".asInstanceOf[Pages$CheckBox]
  
  @js.native
  sealed trait Pages$ClientTemplate extends StObject
  @scala.inline
  def Pages$ClientTemplate: Pages$ClientTemplate = "Pages$ClientTemplate".asInstanceOf[Pages$ClientTemplate]
  
  @js.native
  sealed trait Pages$ClientTemplateParameter extends StObject
  @scala.inline
  def Pages$ClientTemplateParameter: Pages$ClientTemplateParameter = "Pages$ClientTemplateParameter".asInstanceOf[Pages$ClientTemplateParameter]
  
  @js.native
  sealed trait Pages$ClosePageClientAction extends StObject
  @scala.inline
  def Pages$ClosePageClientAction: Pages$ClosePageClientAction = "Pages$ClosePageClientAction".asInstanceOf[Pages$ClosePageClientAction]
  
  @js.native
  sealed trait Pages$ComparisonSearchField extends StObject
  @scala.inline
  def Pages$ComparisonSearchField: Pages$ComparisonSearchField = "Pages$ComparisonSearchField".asInstanceOf[Pages$ComparisonSearchField]
  
  @js.native
  sealed trait Pages$ConditionalEditabilitySettings extends StObject
  @scala.inline
  def Pages$ConditionalEditabilitySettings: Pages$ConditionalEditabilitySettings = "Pages$ConditionalEditabilitySettings".asInstanceOf[Pages$ConditionalEditabilitySettings]
  
  @js.native
  sealed trait Pages$ConditionalVisibilitySettings extends StObject
  @scala.inline
  def Pages$ConditionalVisibilitySettings: Pages$ConditionalVisibilitySettings = "Pages$ConditionalVisibilitySettings".asInstanceOf[Pages$ConditionalVisibilitySettings]
  
  @js.native
  sealed trait Pages$ConfirmationInfo extends StObject
  @scala.inline
  def Pages$ConfirmationInfo: Pages$ConfirmationInfo = "Pages$ConfirmationInfo".asInstanceOf[Pages$ConfirmationInfo]
  
  @js.native
  sealed trait Pages$CreateObjectClientAction extends StObject
  @scala.inline
  def Pages$CreateObjectClientAction: Pages$CreateObjectClientAction = "Pages$CreateObjectClientAction".asInstanceOf[Pages$CreateObjectClientAction]
  
  @js.native
  sealed trait Pages$DataGrid extends StObject
  @scala.inline
  def Pages$DataGrid: Pages$DataGrid = "Pages$DataGrid".asInstanceOf[Pages$DataGrid]
  
  @js.native
  sealed trait Pages$DataGridAddButton extends StObject
  @scala.inline
  def Pages$DataGridAddButton: Pages$DataGridAddButton = "Pages$DataGridAddButton".asInstanceOf[Pages$DataGridAddButton]
  
  @js.native
  sealed trait Pages$DataGridExportToCSVButton extends StObject
  @scala.inline
  def Pages$DataGridExportToCSVButton: Pages$DataGridExportToCSVButton = "Pages$DataGridExportToCSVButton".asInstanceOf[Pages$DataGridExportToCSVButton]
  
  @js.native
  sealed trait Pages$DataGridExportToExcelButton extends StObject
  @scala.inline
  def Pages$DataGridExportToExcelButton: Pages$DataGridExportToExcelButton = "Pages$DataGridExportToExcelButton".asInstanceOf[Pages$DataGridExportToExcelButton]
  
  @js.native
  sealed trait Pages$DataGridRemoveButton extends StObject
  @scala.inline
  def Pages$DataGridRemoveButton: Pages$DataGridRemoveButton = "Pages$DataGridRemoveButton".asInstanceOf[Pages$DataGridRemoveButton]
  
  @js.native
  sealed trait Pages$DataView extends StObject
  @scala.inline
  def Pages$DataView: Pages$DataView = "Pages$DataView".asInstanceOf[Pages$DataView]
  
  @js.native
  sealed trait Pages$DataViewActionButton extends StObject
  @scala.inline
  def Pages$DataViewActionButton: Pages$DataViewActionButton = "Pages$DataViewActionButton".asInstanceOf[Pages$DataViewActionButton]
  
  @js.native
  sealed trait Pages$DataViewCancelButton extends StObject
  @scala.inline
  def Pages$DataViewCancelButton: Pages$DataViewCancelButton = "Pages$DataViewCancelButton".asInstanceOf[Pages$DataViewCancelButton]
  
  @js.native
  sealed trait Pages$DataViewCloseButton extends StObject
  @scala.inline
  def Pages$DataViewCloseButton: Pages$DataViewCloseButton = "Pages$DataViewCloseButton".asInstanceOf[Pages$DataViewCloseButton]
  
  @js.native
  sealed trait Pages$DataViewControlBar extends StObject
  @scala.inline
  def Pages$DataViewControlBar: Pages$DataViewControlBar = "Pages$DataViewControlBar".asInstanceOf[Pages$DataViewControlBar]
  
  @js.native
  sealed trait Pages$DataViewSaveButton extends StObject
  @scala.inline
  def Pages$DataViewSaveButton: Pages$DataViewSaveButton = "Pages$DataViewSaveButton".asInstanceOf[Pages$DataViewSaveButton]
  
  @js.native
  sealed trait Pages$DataViewSource extends StObject
  @scala.inline
  def Pages$DataViewSource: Pages$DataViewSource = "Pages$DataViewSource".asInstanceOf[Pages$DataViewSource]
  
  @js.native
  sealed trait Pages$DatabaseConstraint extends StObject
  @scala.inline
  def Pages$DatabaseConstraint: Pages$DatabaseConstraint = "Pages$DatabaseConstraint".asInstanceOf[Pages$DatabaseConstraint]
  
  @js.native
  sealed trait Pages$DatePicker extends StObject
  @scala.inline
  def Pages$DatePicker: Pages$DatePicker = "Pages$DatePicker".asInstanceOf[Pages$DatePicker]
  
  @js.native
  sealed trait Pages$DeleteClientAction extends StObject
  @scala.inline
  def Pages$DeleteClientAction: Pages$DeleteClientAction = "Pages$DeleteClientAction".asInstanceOf[Pages$DeleteClientAction]
  
  @js.native
  sealed trait Pages$DesignPropertyValue extends StObject
  @scala.inline
  def Pages$DesignPropertyValue: Pages$DesignPropertyValue = "Pages$DesignPropertyValue".asInstanceOf[Pages$DesignPropertyValue]
  
  @js.native
  sealed trait Pages$DivContainer extends StObject
  @scala.inline
  def Pages$DivContainer: Pages$DivContainer = "Pages$DivContainer".asInstanceOf[Pages$DivContainer]
  
  @js.native
  sealed trait Pages$DropDown extends StObject
  @scala.inline
  def Pages$DropDown: Pages$DropDown = "Pages$DropDown".asInstanceOf[Pages$DropDown]
  
  @js.native
  sealed trait Pages$DropDownButton extends StObject
  @scala.inline
  def Pages$DropDownButton: Pages$DropDownButton = "Pages$DropDownButton".asInstanceOf[Pages$DropDownButton]
  
  @js.native
  sealed trait Pages$DropDownButtonItem extends StObject
  @scala.inline
  def Pages$DropDownButtonItem: Pages$DropDownButtonItem = "Pages$DropDownButtonItem".asInstanceOf[Pages$DropDownButtonItem]
  
  @js.native
  sealed trait Pages$DropDownSearchField extends StObject
  @scala.inline
  def Pages$DropDownSearchField: Pages$DropDownSearchField = "Pages$DropDownSearchField".asInstanceOf[Pages$DropDownSearchField]
  
  @js.native
  sealed trait Pages$DynamicImageViewer extends StObject
  @scala.inline
  def Pages$DynamicImageViewer: Pages$DynamicImageViewer = "Pages$DynamicImageViewer".asInstanceOf[Pages$DynamicImageViewer]
  
  @js.native
  sealed trait Pages$DynamicText extends StObject
  @scala.inline
  def Pages$DynamicText: Pages$DynamicText = "Pages$DynamicText".asInstanceOf[Pages$DynamicText]
  
  @js.native
  sealed trait Pages$EditPageTemplateType extends StObject
  @scala.inline
  def Pages$EditPageTemplateType: Pages$EditPageTemplateType = "Pages$EditPageTemplateType".asInstanceOf[Pages$EditPageTemplateType]
  
  @js.native
  sealed trait Pages$FileManager extends StObject
  @scala.inline
  def Pages$FileManager: Pages$FileManager = "Pages$FileManager".asInstanceOf[Pages$FileManager]
  
  @js.native
  sealed trait Pages$FormattingInfo extends StObject
  @scala.inline
  def Pages$FormattingInfo: Pages$FormattingInfo = "Pages$FormattingInfo".asInstanceOf[Pages$FormattingInfo]
  
  @js.native
  sealed trait Pages$GlyphIcon extends StObject
  @scala.inline
  def Pages$GlyphIcon: Pages$GlyphIcon = "Pages$GlyphIcon".asInstanceOf[Pages$GlyphIcon]
  
  @js.native
  sealed trait Pages$GridActionButton extends StObject
  @scala.inline
  def Pages$GridActionButton: Pages$GridActionButton = "Pages$GridActionButton".asInstanceOf[Pages$GridActionButton]
  
  @js.native
  sealed trait Pages$GridColumn extends StObject
  @scala.inline
  def Pages$GridColumn: Pages$GridColumn = "Pages$GridColumn".asInstanceOf[Pages$GridColumn]
  
  @js.native
  sealed trait Pages$GridControlBar extends StObject
  @scala.inline
  def Pages$GridControlBar: Pages$GridControlBar = "Pages$GridControlBar".asInstanceOf[Pages$GridControlBar]
  
  @js.native
  sealed trait Pages$GridDatabaseSource extends StObject
  @scala.inline
  def Pages$GridDatabaseSource: Pages$GridDatabaseSource = "Pages$GridDatabaseSource".asInstanceOf[Pages$GridDatabaseSource]
  
  @js.native
  sealed trait Pages$GridDeleteButton extends StObject
  @scala.inline
  def Pages$GridDeleteButton: Pages$GridDeleteButton = "Pages$GridDeleteButton".asInstanceOf[Pages$GridDeleteButton]
  
  @js.native
  sealed trait Pages$GridDeselectAllButton extends StObject
  @scala.inline
  def Pages$GridDeselectAllButton: Pages$GridDeselectAllButton = "Pages$GridDeselectAllButton".asInstanceOf[Pages$GridDeselectAllButton]
  
  @js.native
  sealed trait Pages$GridEditButton extends StObject
  @scala.inline
  def Pages$GridEditButton: Pages$GridEditButton = "Pages$GridEditButton".asInstanceOf[Pages$GridEditButton]
  
  @js.native
  sealed trait Pages$GridNewButton extends StObject
  @scala.inline
  def Pages$GridNewButton: Pages$GridNewButton = "Pages$GridNewButton".asInstanceOf[Pages$GridNewButton]
  
  @js.native
  sealed trait Pages$GridSearchButton extends StObject
  @scala.inline
  def Pages$GridSearchButton: Pages$GridSearchButton = "Pages$GridSearchButton".asInstanceOf[Pages$GridSearchButton]
  
  @js.native
  sealed trait Pages$GridSelectAllButton extends StObject
  @scala.inline
  def Pages$GridSelectAllButton: Pages$GridSelectAllButton = "Pages$GridSelectAllButton".asInstanceOf[Pages$GridSelectAllButton]
  
  @js.native
  sealed trait Pages$GridSortBar extends StObject
  @scala.inline
  def Pages$GridSortBar: Pages$GridSortBar = "Pages$GridSortBar".asInstanceOf[Pages$GridSortBar]
  
  @js.native
  sealed trait Pages$GridSortItem extends StObject
  @scala.inline
  def Pages$GridSortItem: Pages$GridSortItem = "Pages$GridSortItem".asInstanceOf[Pages$GridSortItem]
  
  @js.native
  sealed trait Pages$GridXPathSource extends StObject
  @scala.inline
  def Pages$GridXPathSource: Pages$GridXPathSource = "Pages$GridXPathSource".asInstanceOf[Pages$GridXPathSource]
  
  @js.native
  sealed trait Pages$GroupBox extends StObject
  @scala.inline
  def Pages$GroupBox: Pages$GroupBox = "Pages$GroupBox".asInstanceOf[Pages$GroupBox]
  
  @js.native
  sealed trait Pages$Header extends StObject
  @scala.inline
  def Pages$Header: Pages$Header = "Pages$Header".asInstanceOf[Pages$Header]
  
  @js.native
  sealed trait Pages$HorizontalSplitPane extends StObject
  @scala.inline
  def Pages$HorizontalSplitPane: Pages$HorizontalSplitPane = "Pages$HorizontalSplitPane".asInstanceOf[Pages$HorizontalSplitPane]
  
  @js.native
  sealed trait Pages$ImageIcon extends StObject
  @scala.inline
  def Pages$ImageIcon: Pages$ImageIcon = "Pages$ImageIcon".asInstanceOf[Pages$ImageIcon]
  
  @js.native
  sealed trait Pages$ImageUploader extends StObject
  @scala.inline
  def Pages$ImageUploader: Pages$ImageUploader = "Pages$ImageUploader".asInstanceOf[Pages$ImageUploader]
  
  @js.native
  sealed trait Pages$ImageViewerSource extends StObject
  @scala.inline
  def Pages$ImageViewerSource: Pages$ImageViewerSource = "Pages$ImageViewerSource".asInstanceOf[Pages$ImageViewerSource]
  
  @js.native
  sealed trait Pages$InputReferenceSetSelector extends StObject
  @scala.inline
  def Pages$InputReferenceSetSelector: Pages$InputReferenceSetSelector = "Pages$InputReferenceSetSelector".asInstanceOf[Pages$InputReferenceSetSelector]
  
  @js.native
  sealed trait Pages$Label extends StObject
  @scala.inline
  def Pages$Label: Pages$Label = "Pages$Label".asInstanceOf[Pages$Label]
  
  @js.native
  sealed trait Pages$LayoutCall extends StObject
  @scala.inline
  def Pages$LayoutCall: Pages$LayoutCall = "Pages$LayoutCall".asInstanceOf[Pages$LayoutCall]
  
  @js.native
  sealed trait Pages$LayoutCallArgument extends StObject
  @scala.inline
  def Pages$LayoutCallArgument: Pages$LayoutCallArgument = "Pages$LayoutCallArgument".asInstanceOf[Pages$LayoutCallArgument]
  
  @js.native
  sealed trait Pages$LayoutGrid extends StObject
  @scala.inline
  def Pages$LayoutGrid: Pages$LayoutGrid = "Pages$LayoutGrid".asInstanceOf[Pages$LayoutGrid]
  
  @js.native
  sealed trait Pages$LayoutGridColumn extends StObject
  @scala.inline
  def Pages$LayoutGridColumn: Pages$LayoutGridColumn = "Pages$LayoutGridColumn".asInstanceOf[Pages$LayoutGridColumn]
  
  @js.native
  sealed trait Pages$LayoutGridRow extends StObject
  @scala.inline
  def Pages$LayoutGridRow: Pages$LayoutGridRow = "Pages$LayoutGridRow".asInstanceOf[Pages$LayoutGridRow]
  
  @js.native
  sealed trait Pages$LayoutParameter extends StObject
  @scala.inline
  def Pages$LayoutParameter: Pages$LayoutParameter = "Pages$LayoutParameter".asInstanceOf[Pages$LayoutParameter]
  
  @js.native
  sealed trait Pages$LinkButton extends StObject
  @scala.inline
  def Pages$LinkButton: Pages$LinkButton = "Pages$LinkButton".asInstanceOf[Pages$LinkButton]
  
  @js.native
  sealed trait Pages$ListView extends StObject
  @scala.inline
  def Pages$ListView: Pages$ListView = "Pages$ListView".asInstanceOf[Pages$ListView]
  
  @js.native
  sealed trait Pages$ListViewDatabaseSource extends StObject
  @scala.inline
  def Pages$ListViewDatabaseSource: Pages$ListViewDatabaseSource = "Pages$ListViewDatabaseSource".asInstanceOf[Pages$ListViewDatabaseSource]
  
  @js.native
  sealed trait Pages$ListViewSearch extends StObject
  @scala.inline
  def Pages$ListViewSearch: Pages$ListViewSearch = "Pages$ListViewSearch".asInstanceOf[Pages$ListViewSearch]
  
  @js.native
  sealed trait Pages$ListViewTemplate extends StObject
  @scala.inline
  def Pages$ListViewTemplate: Pages$ListViewTemplate = "Pages$ListViewTemplate".asInstanceOf[Pages$ListViewTemplate]
  
  @js.native
  sealed trait Pages$ListViewXPathSource extends StObject
  @scala.inline
  def Pages$ListViewXPathSource: Pages$ListViewXPathSource = "Pages$ListViewXPathSource".asInstanceOf[Pages$ListViewXPathSource]
  
  @js.native
  sealed trait Pages$ListenTargetSource extends StObject
  @scala.inline
  def Pages$ListenTargetSource: Pages$ListenTargetSource = "Pages$ListenTargetSource".asInstanceOf[Pages$ListenTargetSource]
  
  @js.native
  sealed trait Pages$LoginButton extends StObject
  @scala.inline
  def Pages$LoginButton: Pages$LoginButton = "Pages$LoginButton".asInstanceOf[Pages$LoginButton]
  
  @js.native
  sealed trait Pages$LoginIdTextBox extends StObject
  @scala.inline
  def Pages$LoginIdTextBox: Pages$LoginIdTextBox = "Pages$LoginIdTextBox".asInstanceOf[Pages$LoginIdTextBox]
  
  @js.native
  sealed trait Pages$LogoutButton extends StObject
  @scala.inline
  def Pages$LogoutButton: Pages$LogoutButton = "Pages$LogoutButton".asInstanceOf[Pages$LogoutButton]
  
  @js.native
  sealed trait Pages$MasterDetail extends StObject
  @scala.inline
  def Pages$MasterDetail: Pages$MasterDetail = "Pages$MasterDetail".asInstanceOf[Pages$MasterDetail]
  
  @js.native
  sealed trait Pages$MasterDetailDetailRegion extends StObject
  @scala.inline
  def Pages$MasterDetailDetailRegion: Pages$MasterDetailDetailRegion = "Pages$MasterDetailDetailRegion".asInstanceOf[Pages$MasterDetailDetailRegion]
  
  @js.native
  sealed trait Pages$MasterDetailMasterRegion extends StObject
  @scala.inline
  def Pages$MasterDetailMasterRegion: Pages$MasterDetailMasterRegion = "Pages$MasterDetailMasterRegion".asInstanceOf[Pages$MasterDetailMasterRegion]
  
  @js.native
  sealed trait Pages$MenuBar extends StObject
  @scala.inline
  def Pages$MenuBar: Pages$MenuBar = "Pages$MenuBar".asInstanceOf[Pages$MenuBar]
  
  @js.native
  sealed trait Pages$MenuDocumentSource extends StObject
  @scala.inline
  def Pages$MenuDocumentSource: Pages$MenuDocumentSource = "Pages$MenuDocumentSource".asInstanceOf[Pages$MenuDocumentSource]
  
  @js.native
  sealed trait Pages$MicroflowClientAction extends StObject
  @scala.inline
  def Pages$MicroflowClientAction: Pages$MicroflowClientAction = "Pages$MicroflowClientAction".asInstanceOf[Pages$MicroflowClientAction]
  
  @js.native
  sealed trait Pages$MicroflowParameterMapping extends StObject
  @scala.inline
  def Pages$MicroflowParameterMapping: Pages$MicroflowParameterMapping = "Pages$MicroflowParameterMapping".asInstanceOf[Pages$MicroflowParameterMapping]
  
  @js.native
  sealed trait Pages$MicroflowSettings extends StObject
  @scala.inline
  def Pages$MicroflowSettings: Pages$MicroflowSettings = "Pages$MicroflowSettings".asInstanceOf[Pages$MicroflowSettings]
  
  @js.native
  sealed trait Pages$MicroflowSource extends StObject
  @scala.inline
  def Pages$MicroflowSource: Pages$MicroflowSource = "Pages$MicroflowSource".asInstanceOf[Pages$MicroflowSource]
  
  @js.native
  sealed trait Pages$NanoflowParameterMapping extends StObject
  @scala.inline
  def Pages$NanoflowParameterMapping: Pages$NanoflowParameterMapping = "Pages$NanoflowParameterMapping".asInstanceOf[Pages$NanoflowParameterMapping]
  
  @js.native
  sealed trait Pages$NanoflowSource extends StObject
  @scala.inline
  def Pages$NanoflowSource: Pages$NanoflowSource = "Pages$NanoflowSource".asInstanceOf[Pages$NanoflowSource]
  
  @js.native
  sealed trait Pages$NativeLayoutContent extends StObject
  @scala.inline
  def Pages$NativeLayoutContent: Pages$NativeLayoutContent = "Pages$NativeLayoutContent".asInstanceOf[Pages$NativeLayoutContent]
  
  @js.native
  sealed trait Pages$NavigationList extends StObject
  @scala.inline
  def Pages$NavigationList: Pages$NavigationList = "Pages$NavigationList".asInstanceOf[Pages$NavigationList]
  
  @js.native
  sealed trait Pages$NavigationListItem extends StObject
  @scala.inline
  def Pages$NavigationListItem: Pages$NavigationListItem = "Pages$NavigationListItem".asInstanceOf[Pages$NavigationListItem]
  
  @js.native
  sealed trait Pages$NavigationSource extends StObject
  @scala.inline
  def Pages$NavigationSource: Pages$NavigationSource = "Pages$NavigationSource".asInstanceOf[Pages$NavigationSource]
  
  @js.native
  sealed trait Pages$NavigationTree extends StObject
  @scala.inline
  def Pages$NavigationTree: Pages$NavigationTree = "Pages$NavigationTree".asInstanceOf[Pages$NavigationTree]
  
  @js.native
  sealed trait Pages$NewButton extends StObject
  @scala.inline
  def Pages$NewButton: Pages$NewButton = "Pages$NewButton".asInstanceOf[Pages$NewButton]
  
  @js.native
  sealed trait Pages$NoClientAction extends StObject
  @scala.inline
  def Pages$NoClientAction: Pages$NoClientAction = "Pages$NoClientAction".asInstanceOf[Pages$NoClientAction]
  
  @js.native
  sealed trait Pages$OfflineSchema extends StObject
  @scala.inline
  def Pages$OfflineSchema: Pages$OfflineSchema = "Pages$OfflineSchema".asInstanceOf[Pages$OfflineSchema]
  
  @js.native
  sealed trait Pages$OfflineSchemaFetchInstruction extends StObject
  @scala.inline
  def Pages$OfflineSchemaFetchInstruction: Pages$OfflineSchemaFetchInstruction = "Pages$OfflineSchemaFetchInstruction".asInstanceOf[Pages$OfflineSchemaFetchInstruction]
  
  @js.native
  sealed trait Pages$OnClickEnlarge extends StObject
  @scala.inline
  def Pages$OnClickEnlarge: Pages$OnClickEnlarge = "Pages$OnClickEnlarge".asInstanceOf[Pages$OnClickEnlarge]
  
  @js.native
  sealed trait Pages$OnClickMicroflow extends StObject
  @scala.inline
  def Pages$OnClickMicroflow: Pages$OnClickMicroflow = "Pages$OnClickMicroflow".asInstanceOf[Pages$OnClickMicroflow]
  
  @js.native
  sealed trait Pages$OnClickNothing extends StObject
  @scala.inline
  def Pages$OnClickNothing: Pages$OnClickNothing = "Pages$OnClickNothing".asInstanceOf[Pages$OnClickNothing]
  
  @js.native
  sealed trait Pages$OpenLinkClientAction extends StObject
  @scala.inline
  def Pages$OpenLinkClientAction: Pages$OpenLinkClientAction = "Pages$OpenLinkClientAction".asInstanceOf[Pages$OpenLinkClientAction]
  
  @js.native
  sealed trait Pages$OpenUserTaskClientAction extends StObject
  @scala.inline
  def Pages$OpenUserTaskClientAction: Pages$OpenUserTaskClientAction = "Pages$OpenUserTaskClientAction".asInstanceOf[Pages$OpenUserTaskClientAction]
  
  @js.native
  sealed trait Pages$OpenWorkflowClientAction extends StObject
  @scala.inline
  def Pages$OpenWorkflowClientAction: Pages$OpenWorkflowClientAction = "Pages$OpenWorkflowClientAction".asInstanceOf[Pages$OpenWorkflowClientAction]
  
  @js.native
  sealed trait Pages$PageClientAction extends StObject
  @scala.inline
  def Pages$PageClientAction: Pages$PageClientAction = "Pages$PageClientAction".asInstanceOf[Pages$PageClientAction]
  
  @js.native
  sealed trait Pages$PageForSpecialization extends StObject
  @scala.inline
  def Pages$PageForSpecialization: Pages$PageForSpecialization = "Pages$PageForSpecialization".asInstanceOf[Pages$PageForSpecialization]
  
  @js.native
  sealed trait Pages$PageSettings extends StObject
  @scala.inline
  def Pages$PageSettings: Pages$PageSettings = "Pages$PageSettings".asInstanceOf[Pages$PageSettings]
  
  @js.native
  sealed trait Pages$PageVariable extends StObject
  @scala.inline
  def Pages$PageVariable: Pages$PageVariable = "Pages$PageVariable".asInstanceOf[Pages$PageVariable]
  
  @js.native
  sealed trait Pages$PasswordTextBox extends StObject
  @scala.inline
  def Pages$PasswordTextBox: Pages$PasswordTextBox = "Pages$PasswordTextBox".asInstanceOf[Pages$PasswordTextBox]
  
  @js.native
  sealed trait Pages$Placeholder extends StObject
  @scala.inline
  def Pages$Placeholder: Pages$Placeholder = "Pages$Placeholder".asInstanceOf[Pages$Placeholder]
  
  @js.native
  sealed trait Pages$RadioButtonGroup extends StObject
  @scala.inline
  def Pages$RadioButtonGroup: Pages$RadioButtonGroup = "Pages$RadioButtonGroup".asInstanceOf[Pages$RadioButtonGroup]
  
  @js.native
  sealed trait Pages$RangeSearchField extends StObject
  @scala.inline
  def Pages$RangeSearchField: Pages$RangeSearchField = "Pages$RangeSearchField".asInstanceOf[Pages$RangeSearchField]
  
  @js.native
  sealed trait Pages$ReferenceSelector extends StObject
  @scala.inline
  def Pages$ReferenceSelector: Pages$ReferenceSelector = "Pages$ReferenceSelector".asInstanceOf[Pages$ReferenceSelector]
  
  @js.native
  sealed trait Pages$ReferenceSetSelector extends StObject
  @scala.inline
  def Pages$ReferenceSetSelector: Pages$ReferenceSetSelector = "Pages$ReferenceSetSelector".asInstanceOf[Pages$ReferenceSetSelector]
  
  @js.native
  sealed trait Pages$ReferenceSetSource extends StObject
  @scala.inline
  def Pages$ReferenceSetSource: Pages$ReferenceSetSource = "Pages$ReferenceSetSource".asInstanceOf[Pages$ReferenceSetSource]
  
  @js.native
  sealed trait Pages$RegularPageTemplateType extends StObject
  @scala.inline
  def Pages$RegularPageTemplateType: Pages$RegularPageTemplateType = "Pages$RegularPageTemplateType".asInstanceOf[Pages$RegularPageTemplateType]
  
  @js.native
  sealed trait Pages$RetrievalQuery extends StObject
  @scala.inline
  def Pages$RetrievalQuery: Pages$RetrievalQuery = "Pages$RetrievalQuery".asInstanceOf[Pages$RetrievalQuery]
  
  @js.native
  sealed trait Pages$RetrievalQueryParameter extends StObject
  @scala.inline
  def Pages$RetrievalQueryParameter: Pages$RetrievalQueryParameter = "Pages$RetrievalQueryParameter".asInstanceOf[Pages$RetrievalQueryParameter]
  
  @js.native
  sealed trait Pages$RetrievalSchema extends StObject
  @scala.inline
  def Pages$RetrievalSchema: Pages$RetrievalSchema = "Pages$RetrievalSchema".asInstanceOf[Pages$RetrievalSchema]
  
  @js.native
  sealed trait Pages$SaveButton extends StObject
  @scala.inline
  def Pages$SaveButton: Pages$SaveButton = "Pages$SaveButton".asInstanceOf[Pages$SaveButton]
  
  @js.native
  sealed trait Pages$SaveChangesClientAction extends StObject
  @scala.inline
  def Pages$SaveChangesClientAction: Pages$SaveChangesClientAction = "Pages$SaveChangesClientAction".asInstanceOf[Pages$SaveChangesClientAction]
  
  @js.native
  sealed trait Pages$ScrollContainer extends StObject
  @scala.inline
  def Pages$ScrollContainer: Pages$ScrollContainer = "Pages$ScrollContainer".asInstanceOf[Pages$ScrollContainer]
  
  @js.native
  sealed trait Pages$ScrollContainerRegion extends StObject
  @scala.inline
  def Pages$ScrollContainerRegion: Pages$ScrollContainerRegion = "Pages$ScrollContainerRegion".asInstanceOf[Pages$ScrollContainerRegion]
  
  @js.native
  sealed trait Pages$SearchBar extends StObject
  @scala.inline
  def Pages$SearchBar: Pages$SearchBar = "Pages$SearchBar".asInstanceOf[Pages$SearchBar]
  
  @js.native
  sealed trait Pages$SelectButton extends StObject
  @scala.inline
  def Pages$SelectButton: Pages$SelectButton = "Pages$SelectButton".asInstanceOf[Pages$SelectButton]
  
  @js.native
  sealed trait Pages$SelectPageTemplateType extends StObject
  @scala.inline
  def Pages$SelectPageTemplateType: Pages$SelectPageTemplateType = "Pages$SelectPageTemplateType".asInstanceOf[Pages$SelectPageTemplateType]
  
  @js.native
  sealed trait Pages$SelectorDatabaseSource extends StObject
  @scala.inline
  def Pages$SelectorDatabaseSource: Pages$SelectorDatabaseSource = "Pages$SelectorDatabaseSource".asInstanceOf[Pages$SelectorDatabaseSource]
  
  @js.native
  sealed trait Pages$SelectorMicroflowSource extends StObject
  @scala.inline
  def Pages$SelectorMicroflowSource: Pages$SelectorMicroflowSource = "Pages$SelectorMicroflowSource".asInstanceOf[Pages$SelectorMicroflowSource]
  
  @js.native
  sealed trait Pages$SelectorXPathSource extends StObject
  @scala.inline
  def Pages$SelectorXPathSource: Pages$SelectorXPathSource = "Pages$SelectorXPathSource".asInstanceOf[Pages$SelectorXPathSource]
  
  @js.native
  sealed trait Pages$SetTaskOutcomeClientAction extends StObject
  @scala.inline
  def Pages$SetTaskOutcomeClientAction: Pages$SetTaskOutcomeClientAction = "Pages$SetTaskOutcomeClientAction".asInstanceOf[Pages$SetTaskOutcomeClientAction]
  
  @js.native
  sealed trait Pages$SidebarToggleButton extends StObject
  @scala.inline
  def Pages$SidebarToggleButton: Pages$SidebarToggleButton = "Pages$SidebarToggleButton".asInstanceOf[Pages$SidebarToggleButton]
  
  @js.native
  sealed trait Pages$SignOutClientAction extends StObject
  @scala.inline
  def Pages$SignOutClientAction: Pages$SignOutClientAction = "Pages$SignOutClientAction".asInstanceOf[Pages$SignOutClientAction]
  
  @js.native
  sealed trait Pages$SimpleMenuBar extends StObject
  @scala.inline
  def Pages$SimpleMenuBar: Pages$SimpleMenuBar = "Pages$SimpleMenuBar".asInstanceOf[Pages$SimpleMenuBar]
  
  @js.native
  sealed trait Pages$SnippetCall extends StObject
  @scala.inline
  def Pages$SnippetCall: Pages$SnippetCall = "Pages$SnippetCall".asInstanceOf[Pages$SnippetCall]
  
  @js.native
  sealed trait Pages$SnippetCallWidget extends StObject
  @scala.inline
  def Pages$SnippetCallWidget: Pages$SnippetCallWidget = "Pages$SnippetCallWidget".asInstanceOf[Pages$SnippetCallWidget]
  
  @js.native
  sealed trait Pages$StaticImageViewer extends StObject
  @scala.inline
  def Pages$StaticImageViewer: Pages$StaticImageViewer = "Pages$StaticImageViewer".asInstanceOf[Pages$StaticImageViewer]
  
  @js.native
  sealed trait Pages$StaticOrDynamicString extends StObject
  @scala.inline
  def Pages$StaticOrDynamicString: Pages$StaticOrDynamicString = "Pages$StaticOrDynamicString".asInstanceOf[Pages$StaticOrDynamicString]
  
  @js.native
  sealed trait Pages$SyncButton extends StObject
  @scala.inline
  def Pages$SyncButton: Pages$SyncButton = "Pages$SyncButton".asInstanceOf[Pages$SyncButton]
  
  @js.native
  sealed trait Pages$SyncClientAction extends StObject
  @scala.inline
  def Pages$SyncClientAction: Pages$SyncClientAction = "Pages$SyncClientAction".asInstanceOf[Pages$SyncClientAction]
  
  @js.native
  sealed trait Pages$TabContainer extends StObject
  @scala.inline
  def Pages$TabContainer: Pages$TabContainer = "Pages$TabContainer".asInstanceOf[Pages$TabContainer]
  
  @js.native
  sealed trait Pages$TabPage extends StObject
  @scala.inline
  def Pages$TabPage: Pages$TabPage = "Pages$TabPage".asInstanceOf[Pages$TabPage]
  
  @js.native
  sealed trait Pages$Table extends StObject
  @scala.inline
  def Pages$Table: Pages$Table = "Pages$Table".asInstanceOf[Pages$Table]
  
  @js.native
  sealed trait Pages$TableCell extends StObject
  @scala.inline
  def Pages$TableCell: Pages$TableCell = "Pages$TableCell".asInstanceOf[Pages$TableCell]
  
  @js.native
  sealed trait Pages$TableColumn extends StObject
  @scala.inline
  def Pages$TableColumn: Pages$TableColumn = "Pages$TableColumn".asInstanceOf[Pages$TableColumn]
  
  @js.native
  sealed trait Pages$TableRow extends StObject
  @scala.inline
  def Pages$TableRow: Pages$TableRow = "Pages$TableRow".asInstanceOf[Pages$TableRow]
  
  @js.native
  sealed trait Pages$TemplateGrid extends StObject
  @scala.inline
  def Pages$TemplateGrid: Pages$TemplateGrid = "Pages$TemplateGrid".asInstanceOf[Pages$TemplateGrid]
  
  @js.native
  sealed trait Pages$TemplateGridContents extends StObject
  @scala.inline
  def Pages$TemplateGridContents: Pages$TemplateGridContents = "Pages$TemplateGridContents".asInstanceOf[Pages$TemplateGridContents]
  
  @js.native
  sealed trait Pages$TemplatePlaceholder extends StObject
  @scala.inline
  def Pages$TemplatePlaceholder: Pages$TemplatePlaceholder = "Pages$TemplatePlaceholder".asInstanceOf[Pages$TemplatePlaceholder]
  
  @js.native
  sealed trait Pages$TextArea extends StObject
  @scala.inline
  def Pages$TextArea: Pages$TextArea = "Pages$TextArea".asInstanceOf[Pages$TextArea]
  
  @js.native
  sealed trait Pages$TextBox extends StObject
  @scala.inline
  def Pages$TextBox: Pages$TextBox = "Pages$TextBox".asInstanceOf[Pages$TextBox]
  
  @js.native
  sealed trait Pages$Title extends StObject
  @scala.inline
  def Pages$Title: Pages$Title = "Pages$Title".asInstanceOf[Pages$Title]
  
  @js.native
  sealed trait Pages$UserTaskTemplateType extends StObject
  @scala.inline
  def Pages$UserTaskTemplateType: Pages$UserTaskTemplateType = "Pages$UserTaskTemplateType".asInstanceOf[Pages$UserTaskTemplateType]
  
  @js.native
  sealed trait Pages$ValidationMessage extends StObject
  @scala.inline
  def Pages$ValidationMessage: Pages$ValidationMessage = "Pages$ValidationMessage".asInstanceOf[Pages$ValidationMessage]
  
  @js.native
  sealed trait Pages$VerticalFlow extends StObject
  @scala.inline
  def Pages$VerticalFlow: Pages$VerticalFlow = "Pages$VerticalFlow".asInstanceOf[Pages$VerticalFlow]
  
  @js.native
  sealed trait Pages$VerticalSplitPane extends StObject
  @scala.inline
  def Pages$VerticalSplitPane: Pages$VerticalSplitPane = "Pages$VerticalSplitPane".asInstanceOf[Pages$VerticalSplitPane]
  
  @js.native
  sealed trait Pages$WebLayoutContent extends StObject
  @scala.inline
  def Pages$WebLayoutContent: Pages$WebLayoutContent = "Pages$WebLayoutContent".asInstanceOf[Pages$WebLayoutContent]
  
  @js.native
  sealed trait Pages$WidgetValidation extends StObject
  @scala.inline
  def Pages$WidgetValidation: Pages$WidgetValidation = "Pages$WidgetValidation".asInstanceOf[Pages$WidgetValidation]
  
  @js.native
  sealed trait Pages$WorkflowOverviewTemplateType extends StObject
  @scala.inline
  def Pages$WorkflowOverviewTemplateType: Pages$WorkflowOverviewTemplateType = "Pages$WorkflowOverviewTemplateType".asInstanceOf[Pages$WorkflowOverviewTemplateType]
  
  @js.native
  sealed trait Projects$OneTimeConversionMarker extends StObject
  @scala.inline
  def Projects$OneTimeConversionMarker: Projects$OneTimeConversionMarker = "Projects$OneTimeConversionMarker".asInstanceOf[Projects$OneTimeConversionMarker]
  
  @js.native
  sealed trait REMOVE extends StObject
  @scala.inline
  def REMOVE: REMOVE = "REMOVE".asInstanceOf[REMOVE]
  
  @js.native
  sealed trait Reports$BasicReport extends StObject
  @scala.inline
  def Reports$BasicReport: Reports$BasicReport = "Reports$BasicReport".asInstanceOf[Reports$BasicReport]
  
  @js.native
  sealed trait Reports$BasicReportAggregate extends StObject
  @scala.inline
  def Reports$BasicReportAggregate: Reports$BasicReportAggregate = "Reports$BasicReportAggregate".asInstanceOf[Reports$BasicReportAggregate]
  
  @js.native
  sealed trait Reports$BasicReportColumn extends StObject
  @scala.inline
  def Reports$BasicReportColumn: Reports$BasicReportColumn = "Reports$BasicReportColumn".asInstanceOf[Reports$BasicReportColumn]
  
  @js.native
  sealed trait Reports$ReportButton extends StObject
  @scala.inline
  def Reports$ReportButton: Reports$ReportButton = "Reports$ReportButton".asInstanceOf[Reports$ReportButton]
  
  @js.native
  sealed trait Reports$ReportChart extends StObject
  @scala.inline
  def Reports$ReportChart: Reports$ReportChart = "Reports$ReportChart".asInstanceOf[Reports$ReportChart]
  
  @js.native
  sealed trait Reports$ReportChartSeries extends StObject
  @scala.inline
  def Reports$ReportChartSeries: Reports$ReportChartSeries = "Reports$ReportChartSeries".asInstanceOf[Reports$ReportChartSeries]
  
  @js.native
  sealed trait Reports$ReportDateRangeField extends StObject
  @scala.inline
  def Reports$ReportDateRangeField: Reports$ReportDateRangeField = "Reports$ReportDateRangeField".asInstanceOf[Reports$ReportDateRangeField]
  
  @js.native
  sealed trait Reports$ReportDateRangeSelector extends StObject
  @scala.inline
  def Reports$ReportDateRangeSelector: Reports$ReportDateRangeSelector = "Reports$ReportDateRangeSelector".asInstanceOf[Reports$ReportDateRangeSelector]
  
  @js.native
  sealed trait Reports$ReportDropDown extends StObject
  @scala.inline
  def Reports$ReportDropDown: Reports$ReportDropDown = "Reports$ReportDropDown".asInstanceOf[Reports$ReportDropDown]
  
  @js.native
  sealed trait Reports$ReportPane extends StObject
  @scala.inline
  def Reports$ReportPane: Reports$ReportPane = "Reports$ReportPane".asInstanceOf[Reports$ReportPane]
  
  @js.native
  sealed trait Reports$ReportZoomInfo extends StObject
  @scala.inline
  def Reports$ReportZoomInfo: Reports$ReportZoomInfo = "Reports$ReportZoomInfo".asInstanceOf[Reports$ReportZoomInfo]
  
  @js.native
  sealed trait Reports$ReportZoomMapping extends StObject
  @scala.inline
  def Reports$ReportZoomMapping: Reports$ReportZoomMapping = "Reports$ReportZoomMapping".asInstanceOf[Reports$ReportZoomMapping]
  
  @js.native
  sealed trait Rest$CorsConfiguration extends StObject
  @scala.inline
  def Rest$CorsConfiguration: Rest$CorsConfiguration = "Rest$CorsConfiguration".asInstanceOf[Rest$CorsConfiguration]
  
  @js.native
  sealed trait Rest$MetadataReference extends StObject
  @scala.inline
  def Rest$MetadataReference: Rest$MetadataReference = "Rest$MetadataReference".asInstanceOf[Rest$MetadataReference]
  
  @js.native
  sealed trait Rest$ODataKey extends StObject
  @scala.inline
  def Rest$ODataKey: Rest$ODataKey = "Rest$ODataKey".asInstanceOf[Rest$ODataKey]
  
  @js.native
  sealed trait Rest$ODataKeyPart extends StObject
  @scala.inline
  def Rest$ODataKeyPart: Rest$ODataKeyPart = "Rest$ODataKeyPart".asInstanceOf[Rest$ODataKeyPart]
  
  @js.native
  sealed trait Rest$ODataMappedValue extends StObject
  @scala.inline
  def Rest$ODataMappedValue: Rest$ODataMappedValue = "Rest$ODataMappedValue".asInstanceOf[Rest$ODataMappedValue]
  
  @js.native
  sealed trait Rest$ODataRemoteAssociationSource extends StObject
  @scala.inline
  def Rest$ODataRemoteAssociationSource: Rest$ODataRemoteAssociationSource = "Rest$ODataRemoteAssociationSource".asInstanceOf[Rest$ODataRemoteAssociationSource]
  
  @js.native
  sealed trait Rest$ODataRemoteEntitySource extends StObject
  @scala.inline
  def Rest$ODataRemoteEntitySource: Rest$ODataRemoteEntitySource = "Rest$ODataRemoteEntitySource".asInstanceOf[Rest$ODataRemoteEntitySource]
  
  @js.native
  sealed trait Rest$PublishedRestResource extends StObject
  @scala.inline
  def Rest$PublishedRestResource: Rest$PublishedRestResource = "Rest$PublishedRestResource".asInstanceOf[Rest$PublishedRestResource]
  
  @js.native
  sealed trait Rest$PublishedRestServiceOperation extends StObject
  @scala.inline
  def Rest$PublishedRestServiceOperation: Rest$PublishedRestServiceOperation = "Rest$PublishedRestServiceOperation".asInstanceOf[Rest$PublishedRestServiceOperation]
  
  @js.native
  sealed trait Rest$PublishedRestServiceResource extends StObject
  @scala.inline
  def Rest$PublishedRestServiceResource: Rest$PublishedRestServiceResource = "Rest$PublishedRestServiceResource".asInstanceOf[Rest$PublishedRestServiceResource]
  
  @js.native
  sealed trait Rest$RestOperationParameter extends StObject
  @scala.inline
  def Rest$RestOperationParameter: Rest$RestOperationParameter = "Rest$RestOperationParameter".asInstanceOf[Rest$RestOperationParameter]
  
  @js.native
  sealed trait STAGING
    extends StObject
       with SuccessAppState
  @scala.inline
  def STAGING: STAGING = "STAGING".asInstanceOf[STAGING]
  
  @js.native
  sealed trait STARTED
    extends StObject
       with SuccessAppState
  @scala.inline
  def STARTED: STARTED = "STARTED".asInstanceOf[STARTED]
  
  @js.native
  sealed trait STARTING
    extends StObject
       with SuccessAppState
  @scala.inline
  def STARTING: STARTING = "STARTING".asInstanceOf[STARTING]
  
  @js.native
  sealed trait STOPPED
    extends StObject
       with SuccessAppState
  @scala.inline
  def STOPPED: STOPPED = "STOPPED".asInstanceOf[STOPPED]
  
  @js.native
  sealed trait Sandbox extends StObject
  @scala.inline
  def Sandbox: Sandbox = "Sandbox".asInstanceOf[Sandbox]
  
  @js.native
  sealed trait Security$DemoUser extends StObject
  @scala.inline
  def Security$DemoUser: Security$DemoUser = "Security$DemoUser".asInstanceOf[Security$DemoUser]
  
  @js.native
  sealed trait Security$FileDocumentAccessRuleContainer extends StObject
  @scala.inline
  def Security$FileDocumentAccessRuleContainer: Security$FileDocumentAccessRuleContainer = "Security$FileDocumentAccessRuleContainer".asInstanceOf[Security$FileDocumentAccessRuleContainer]
  
  @js.native
  sealed trait Security$ImageAccessRuleContainer extends StObject
  @scala.inline
  def Security$ImageAccessRuleContainer: Security$ImageAccessRuleContainer = "Security$ImageAccessRuleContainer".asInstanceOf[Security$ImageAccessRuleContainer]
  
  @js.native
  sealed trait Security$ModuleRole extends StObject
  @scala.inline
  def Security$ModuleRole: Security$ModuleRole = "Security$ModuleRole".asInstanceOf[Security$ModuleRole]
  
  @js.native
  sealed trait Security$PasswordPolicySettings extends StObject
  @scala.inline
  def Security$PasswordPolicySettings: Security$PasswordPolicySettings = "Security$PasswordPolicySettings".asInstanceOf[Security$PasswordPolicySettings]
  
  @js.native
  sealed trait Security$UserRole extends StObject
  @scala.inline
  def Security$UserRole: Security$UserRole = "Security$UserRole".asInstanceOf[Security$UserRole]
  
  @js.native
  sealed trait Settings$ActionActivityDefaultColor extends StObject
  @scala.inline
  def Settings$ActionActivityDefaultColor: Settings$ActionActivityDefaultColor = "Settings$ActionActivityDefaultColor".asInstanceOf[Settings$ActionActivityDefaultColor]
  
  @js.native
  sealed trait Settings$Certificate extends StObject
  @scala.inline
  def Settings$Certificate: Settings$Certificate = "Settings$Certificate".asInstanceOf[Settings$Certificate]
  
  @js.native
  sealed trait Settings$CertificateSettings extends StObject
  @scala.inline
  def Settings$CertificateSettings: Settings$CertificateSettings = "Settings$CertificateSettings".asInstanceOf[Settings$CertificateSettings]
  
  @js.native
  sealed trait Settings$Configuration extends StObject
  @scala.inline
  def Settings$Configuration: Settings$Configuration = "Settings$Configuration".asInstanceOf[Settings$Configuration]
  
  @js.native
  sealed trait Settings$ConfigurationSettings extends StObject
  @scala.inline
  def Settings$ConfigurationSettings: Settings$ConfigurationSettings = "Settings$ConfigurationSettings".asInstanceOf[Settings$ConfigurationSettings]
  
  @js.native
  sealed trait Settings$ConstantValue extends StObject
  @scala.inline
  def Settings$ConstantValue: Settings$ConstantValue = "Settings$ConstantValue".asInstanceOf[Settings$ConstantValue]
  
  @js.native
  sealed trait Settings$CustomSetting extends StObject
  @scala.inline
  def Settings$CustomSetting: Settings$CustomSetting = "Settings$CustomSetting".asInstanceOf[Settings$CustomSetting]
  
  @js.native
  sealed trait Settings$IntegrationProjectSettingsPart extends StObject
  @scala.inline
  def Settings$IntegrationProjectSettingsPart: Settings$IntegrationProjectSettingsPart = "Settings$IntegrationProjectSettingsPart".asInstanceOf[Settings$IntegrationProjectSettingsPart]
  
  @js.native
  sealed trait Settings$JavaActionsSettings extends StObject
  @scala.inline
  def Settings$JavaActionsSettings: Settings$JavaActionsSettings = "Settings$JavaActionsSettings".asInstanceOf[Settings$JavaActionsSettings]
  
  @js.native
  sealed trait Settings$Language extends StObject
  @scala.inline
  def Settings$Language: Settings$Language = "Settings$Language".asInstanceOf[Settings$Language]
  
  @js.native
  sealed trait Settings$LanguageSettings extends StObject
  @scala.inline
  def Settings$LanguageSettings: Settings$LanguageSettings = "Settings$LanguageSettings".asInstanceOf[Settings$LanguageSettings]
  
  @js.native
  sealed trait Settings$ModelerSettings extends StObject
  @scala.inline
  def Settings$ModelerSettings: Settings$ModelerSettings = "Settings$ModelerSettings".asInstanceOf[Settings$ModelerSettings]
  
  @js.native
  sealed trait Settings$RuntimeSettings extends StObject
  @scala.inline
  def Settings$RuntimeSettings: Settings$RuntimeSettings = "Settings$RuntimeSettings".asInstanceOf[Settings$RuntimeSettings]
  
  @js.native
  sealed trait Settings$WebUIProjectSettingsPart extends StObject
  @scala.inline
  def Settings$WebUIProjectSettingsPart: Settings$WebUIProjectSettingsPart = "Settings$WebUIProjectSettingsPart".asInstanceOf[Settings$WebUIProjectSettingsPart]
  
  @js.native
  sealed trait Settings$WorkflowsProjectSettingsPart extends StObject
  @scala.inline
  def Settings$WorkflowsProjectSettingsPart: Settings$WorkflowsProjectSettingsPart = "Settings$WorkflowsProjectSettingsPart".asInstanceOf[Settings$WorkflowsProjectSettingsPart]
  
  @js.native
  sealed trait Success
    extends StObject
       with BuildResultStatus
  @scala.inline
  def Success: Success = "Success".asInstanceOf[Success]
  
  @js.native
  sealed trait Texts$SystemText extends StObject
  @scala.inline
  def Texts$SystemText: Texts$SystemText = "Texts$SystemText".asInstanceOf[Texts$SystemText]
  
  @js.native
  sealed trait Texts$Text extends StObject
  @scala.inline
  def Texts$Text: Texts$Text = "Texts$Text".asInstanceOf[Texts$Text]
  
  @js.native
  sealed trait Texts$Translation extends StObject
  @scala.inline
  def Texts$Translation: Texts$Translation = "Texts$Translation".asInstanceOf[Texts$Translation]
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with CannotFixAppState
  @scala.inline
  def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  
  @js.native
  sealed trait UNKNOWN_ACCOUNT
    extends StObject
       with CannotFixAppState
  @scala.inline
  def UNKNOWN_ACCOUNT: UNKNOWN_ACCOUNT = "UNKNOWN_ACCOUNT".asInstanceOf[UNKNOWN_ACCOUNT]
  
  @js.native
  sealed trait UNKNOWN_DEPLOYER
    extends StObject
       with CannotFixAppState
  @scala.inline
  def UNKNOWN_DEPLOYER: UNKNOWN_DEPLOYER = "UNKNOWN_DEPLOYER".asInstanceOf[UNKNOWN_DEPLOYER]
  
  @js.native
  sealed trait UNKNOWN_PROJECT
    extends StObject
       with CannotFixAppState
  @scala.inline
  def UNKNOWN_PROJECT: UNKNOWN_PROJECT = "UNKNOWN_PROJECT".asInstanceOf[UNKNOWN_PROJECT]
  
  @js.native
  sealed trait UNLINKED
    extends StObject
       with CannotFixAppState
  @scala.inline
  def UNLINKED: UNLINKED = "UNLINKED".asInstanceOf[UNLINKED]
  
  @js.native
  sealed trait UPDATE_PROPERTY_VALUE extends StObject
  @scala.inline
  def UPDATE_PROPERTY_VALUE: UPDATE_PROPERTY_VALUE = "UPDATE_PROPERTY_VALUE".asInstanceOf[UPDATE_PROPERTY_VALUE]
  
  @js.native
  sealed trait UPDATING
    extends StObject
       with SuccessAppState
  @scala.inline
  def UPDATING: UPDATING = "UPDATING".asInstanceOf[UPDATING]
  
  @js.native
  sealed trait Unlicensed extends StObject
  @scala.inline
  def Unlicensed: Unlicensed = "Unlicensed".asInstanceOf[Unlicensed]
  
  @js.native
  sealed trait WebServices$DataAssociation extends StObject
  @scala.inline
  def WebServices$DataAssociation: WebServices$DataAssociation = "WebServices$DataAssociation".asInstanceOf[WebServices$DataAssociation]
  
  @js.native
  sealed trait WebServices$DataAttribute extends StObject
  @scala.inline
  def WebServices$DataAttribute: WebServices$DataAttribute = "WebServices$DataAttribute".asInstanceOf[WebServices$DataAttribute]
  
  @js.native
  sealed trait WebServices$DataEntity extends StObject
  @scala.inline
  def WebServices$DataEntity: WebServices$DataEntity = "WebServices$DataEntity".asInstanceOf[WebServices$DataEntity]
  
  @js.native
  sealed trait WebServices$OperationInfo extends StObject
  @scala.inline
  def WebServices$OperationInfo: WebServices$OperationInfo = "WebServices$OperationInfo".asInstanceOf[WebServices$OperationInfo]
  
  @js.native
  sealed trait WebServices$PartEncoding extends StObject
  @scala.inline
  def WebServices$PartEncoding: WebServices$PartEncoding = "WebServices$PartEncoding".asInstanceOf[WebServices$PartEncoding]
  
  @js.native
  sealed trait WebServices$PublishedOperation extends StObject
  @scala.inline
  def WebServices$PublishedOperation: WebServices$PublishedOperation = "WebServices$PublishedOperation".asInstanceOf[WebServices$PublishedOperation]
  
  @js.native
  sealed trait WebServices$PublishedParameter extends StObject
  @scala.inline
  def WebServices$PublishedParameter: WebServices$PublishedParameter = "WebServices$PublishedParameter".asInstanceOf[WebServices$PublishedParameter]
  
  @js.native
  sealed trait WebServices$RpcMessagePartElement extends StObject
  @scala.inline
  def WebServices$RpcMessagePartElement: WebServices$RpcMessagePartElement = "WebServices$RpcMessagePartElement".asInstanceOf[WebServices$RpcMessagePartElement]
  
  @js.native
  sealed trait WebServices$RpcOperationElement extends StObject
  @scala.inline
  def WebServices$RpcOperationElement: WebServices$RpcOperationElement = "WebServices$RpcOperationElement".asInstanceOf[WebServices$RpcOperationElement]
  
  @js.native
  sealed trait WebServices$ServiceInfo extends StObject
  @scala.inline
  def WebServices$ServiceInfo: WebServices$ServiceInfo = "WebServices$ServiceInfo".asInstanceOf[WebServices$ServiceInfo]
  
  @js.native
  sealed trait WebServices$SystemIdDataAttribute extends StObject
  @scala.inline
  def WebServices$SystemIdDataAttribute: WebServices$SystemIdDataAttribute = "WebServices$SystemIdDataAttribute".asInstanceOf[WebServices$SystemIdDataAttribute]
  
  @js.native
  sealed trait WebServices$VersionedService extends StObject
  @scala.inline
  def WebServices$VersionedService: WebServices$VersionedService = "WebServices$VersionedService".asInstanceOf[WebServices$VersionedService]
  
  @js.native
  sealed trait WebServices$WsdlDescription extends StObject
  @scala.inline
  def WebServices$WsdlDescription: WebServices$WsdlDescription = "WebServices$WsdlDescription".asInstanceOf[WebServices$WsdlDescription]
  
  @js.native
  sealed trait WebServices$WsdlEntry extends StObject
  @scala.inline
  def WebServices$WsdlEntry: WebServices$WsdlEntry = "WebServices$WsdlEntry".asInstanceOf[WebServices$WsdlEntry]
  
  @js.native
  sealed trait Workflows$BooleanSplitOutcome extends StObject
  @scala.inline
  def Workflows$BooleanSplitOutcome: Workflows$BooleanSplitOutcome = "Workflows$BooleanSplitOutcome".asInstanceOf[Workflows$BooleanSplitOutcome]
  
  @js.native
  sealed trait Workflows$CallMicroflowTask extends StObject
  @scala.inline
  def Workflows$CallMicroflowTask: Workflows$CallMicroflowTask = "Workflows$CallMicroflowTask".asInstanceOf[Workflows$CallMicroflowTask]
  
  @js.native
  sealed trait Workflows$CallWorkflowActivity extends StObject
  @scala.inline
  def Workflows$CallWorkflowActivity: Workflows$CallWorkflowActivity = "Workflows$CallWorkflowActivity".asInstanceOf[Workflows$CallWorkflowActivity]
  
  @js.native
  sealed trait Workflows$EndWorkflowActivity extends StObject
  @scala.inline
  def Workflows$EndWorkflowActivity: Workflows$EndWorkflowActivity = "Workflows$EndWorkflowActivity".asInstanceOf[Workflows$EndWorkflowActivity]
  
  @js.native
  sealed trait Workflows$EnumerationValueSplitOutcome extends StObject
  @scala.inline
  def Workflows$EnumerationValueSplitOutcome: Workflows$EnumerationValueSplitOutcome = "Workflows$EnumerationValueSplitOutcome".asInstanceOf[Workflows$EnumerationValueSplitOutcome]
  
  @js.native
  sealed trait Workflows$ExclusiveSplitActivity extends StObject
  @scala.inline
  def Workflows$ExclusiveSplitActivity: Workflows$ExclusiveSplitActivity = "Workflows$ExclusiveSplitActivity".asInstanceOf[Workflows$ExclusiveSplitActivity]
  
  @js.native
  sealed trait Workflows$Flow extends StObject
  @scala.inline
  def Workflows$Flow: Workflows$Flow = "Workflows$Flow".asInstanceOf[Workflows$Flow]
  
  @js.native
  sealed trait Workflows$ParallelSplitActivity extends StObject
  @scala.inline
  def Workflows$ParallelSplitActivity: Workflows$ParallelSplitActivity = "Workflows$ParallelSplitActivity".asInstanceOf[Workflows$ParallelSplitActivity]
  
  @js.native
  sealed trait Workflows$ParallelSplitOutcome extends StObject
  @scala.inline
  def Workflows$ParallelSplitOutcome: Workflows$ParallelSplitOutcome = "Workflows$ParallelSplitOutcome".asInstanceOf[Workflows$ParallelSplitOutcome]
  
  @js.native
  sealed trait Workflows$UserTask extends StObject
  @scala.inline
  def Workflows$UserTask: Workflows$UserTask = "Workflows$UserTask".asInstanceOf[Workflows$UserTask]
  
  @js.native
  sealed trait Workflows$WorkflowTaskOutcome extends StObject
  @scala.inline
  def Workflows$WorkflowTaskOutcome: Workflows$WorkflowTaskOutcome = "Workflows$WorkflowTaskOutcome".asInstanceOf[Workflows$WorkflowTaskOutcome]
  
  @js.native
  sealed trait Workflows$XPathBasedUserSource extends StObject
  @scala.inline
  def Workflows$XPathBasedUserSource: Workflows$XPathBasedUserSource = "Workflows$XPathBasedUserSource".asInstanceOf[Workflows$XPathBasedUserSource]
  
  @js.native
  sealed trait XmlSchemas$XmlElement extends StObject
  @scala.inline
  def XmlSchemas$XmlElement: XmlSchemas$XmlElement = "XmlSchemas$XmlElement".asInstanceOf[XmlSchemas$XmlElement]
  
  @js.native
  sealed trait XmlSchemas$XmlSchemaEntry extends StObject
  @scala.inline
  def XmlSchemas$XmlSchemaEntry: XmlSchemas$XmlSchemaEntry = "XmlSchemas$XmlSchemaEntry".asInstanceOf[XmlSchemas$XmlSchemaEntry]
  
  @js.native
  sealed trait attached
    extends StObject
       with StructureState
  @scala.inline
  def attached: attached = "attached".asInstanceOf[attached]
  
  @js.native
  sealed trait bidi
    extends StObject
       with LockType
  @scala.inline
  def bidi: bidi = "bidi".asInstanceOf[bidi]
  
  @js.native
  sealed trait buildResult extends StObject
  @scala.inline
  def buildResult: buildResult = "buildResult".asInstanceOf[buildResult]
  
  @js.native
  sealed trait commit
    extends StObject
       with LockType
  @scala.inline
  def commit: commit = "commit".asInstanceOf[commit]
  
  @js.native
  sealed trait `commit-wc`
    extends StObject
       with LockType
  @scala.inline
  def `commit-wc`: `commit-wc` = "commit-wc".asInstanceOf[`commit-wc`]
  
  @js.native
  sealed trait consistencyerrors
    extends StObject
       with IUpdateAppJobStatus
  @scala.inline
  def consistencyerrors: consistencyerrors = "consistencyerrors".asInstanceOf[consistencyerrors]
  
  @js.native
  sealed trait conversion
    extends StObject
       with LockType
  @scala.inline
  def conversion: conversion = "conversion".asInstanceOf[conversion]
  
  @js.native
  sealed trait delete
    extends StObject
       with RequestMethod
  @scala.inline
  def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait deleted
    extends StObject
       with StructureState
  @scala.inline
  def deleted: deleted = "deleted".asInstanceOf[deleted]
  
  @js.native
  sealed trait deltas extends StObject
  @scala.inline
  def deltas: deltas = "deltas".asInstanceOf[deltas]
  
  @js.native
  sealed trait detached
    extends StObject
       with StructureState
  @scala.inline
  def detached: detached = "detached".asInstanceOf[detached]
  
  @js.native
  sealed trait edit
    extends StObject
       with LockType
  @scala.inline
  def edit: edit = "edit".asInstanceOf[edit]
  
  @js.native
  sealed trait explicit
    extends StObject
       with TransactionType
  @scala.inline
  def explicit: explicit = "explicit".asInstanceOf[explicit]
  
  @js.native
  sealed trait fail extends StObject
  @scala.inline
  def fail: fail = "fail".asInstanceOf[fail]
  
  @js.native
  sealed trait failed_
    extends StObject
       with IUpdateAppJobStatus
  @scala.inline
  def failed_ : failed_ = "failed".asInstanceOf[failed_]
  
  @js.native
  sealed trait fast extends StObject
  @scala.inline
  def fast: fast = "fast".asInstanceOf[fast]
  
  @js.native
  sealed trait fileChanges extends StObject
  @scala.inline
  def fileChanges: fileChanges = "fileChanges".asInstanceOf[fileChanges]
  
  @js.native
  sealed trait full extends StObject
  @scala.inline
  def full: full = "full".asInstanceOf[full]
  
  @js.native
  sealed trait get
    extends StObject
       with RequestMethod
  @scala.inline
  def get: get = "get".asInstanceOf[get]
  
  @js.native
  sealed trait git extends StObject
  @scala.inline
  def git: git = "git".asInstanceOf[git]
  
  @js.native
  sealed trait `implicit`
    extends StObject
       with TransactionType
  @scala.inline
  def `implicit`: `implicit` = "implicit".asInstanceOf[`implicit`]
  
  @js.native
  sealed trait json extends StObject
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait `new`
    extends StObject
       with StructureState
  @scala.inline
  def `new`: `new` = "new".asInstanceOf[`new`]
  
  @js.native
  sealed trait post
    extends StObject
       with RequestMethod
  @scala.inline
  def post: post = "post".asInstanceOf[post]
  
  @js.native
  sealed trait provisioning
    extends StObject
       with IUpdateAppJobStatus
  @scala.inline
  def provisioning: provisioning = "provisioning".asInstanceOf[provisioning]
  
  @js.native
  sealed trait put
    extends StObject
       with RequestMethod
  @scala.inline
  def put: put = "put".asInstanceOf[put]
  
  @js.native
  sealed trait resuming
    extends StObject
       with IUpdateAppJobStatus
  @scala.inline
  def resuming: resuming = "resuming".asInstanceOf[resuming]
  
  @js.native
  sealed trait started_
    extends StObject
       with IUpdateAppJobStatus
  @scala.inline
  def started_ : started_ = "started".asInstanceOf[started_]
  
  @js.native
  sealed trait success_ extends StObject
  @scala.inline
  def success_ : success_ = "success".asInstanceOf[success_]
  
  @js.native
  sealed trait svn extends StObject
  @scala.inline
  def svn: svn = "svn".asInstanceOf[svn]
  
  @js.native
  sealed trait switch
    extends StObject
       with LockType
  @scala.inline
  def switch: switch = "switch".asInstanceOf[switch]
  
  @js.native
  sealed trait update
    extends StObject
       with LockType
  @scala.inline
  def update: update = "update".asInstanceOf[update]
  
  @js.native
  sealed trait updating_
    extends StObject
       with IUpdateAppJobStatus
  @scala.inline
  def updating_ : updating_ = "updating".asInstanceOf[updating_]
  
  @js.native
  sealed trait workingCopyData extends StObject
  @scala.inline
  def workingCopyData: workingCopyData = "workingCopyData".asInstanceOf[workingCopyData]
  
  @js.native
  sealed trait zip extends StObject
  @scala.inline
  def zip: zip = "zip".asInstanceOf[zip]
}
