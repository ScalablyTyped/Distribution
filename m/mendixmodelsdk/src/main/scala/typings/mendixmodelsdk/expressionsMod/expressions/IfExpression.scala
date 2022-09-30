package typings.mendixmodelsdk.expressionsMod.expressions

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.expressionsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.microflows.AppServiceCallParameterMapping
import typings.mendixmodelsdk.microflowsMod.microflows.BasicCodeActionParameterValue
import typings.mendixmodelsdk.microflowsMod.microflows.BasicJavaActionParameterValue
import typings.mendixmodelsdk.microflowsMod.microflows.BinaryRequestHandling
import typings.mendixmodelsdk.microflowsMod.microflows.ChangeListAction
import typings.mendixmodelsdk.microflowsMod.microflows.ChangeVariableAction
import typings.mendixmodelsdk.microflowsMod.microflows.CreateVariableAction
import typings.mendixmodelsdk.microflowsMod.microflows.CustomRange
import typings.mendixmodelsdk.microflowsMod.microflows.DocumentTemplateParameterMapping
import typings.mendixmodelsdk.microflowsMod.microflows.EndEvent
import typings.mendixmodelsdk.microflowsMod.microflows.ExpressionListOperation
import typings.mendixmodelsdk.microflowsMod.microflows.ExpressionSplitCondition
import typings.mendixmodelsdk.microflowsMod.microflows.FormDataPart
import typings.mendixmodelsdk.microflowsMod.microflows.GenerateDocumentAction
import typings.mendixmodelsdk.microflowsMod.microflows.HttpConfiguration
import typings.mendixmodelsdk.microflowsMod.microflows.HttpHeaderEntry
import typings.mendixmodelsdk.microflowsMod.microflows.InspectAttribute
import typings.mendixmodelsdk.microflowsMod.microflows.LogMessageAction
import typings.mendixmodelsdk.microflowsMod.microflows.MemberChange
import typings.mendixmodelsdk.microflowsMod.microflows.MicroflowCallParameterMapping
import typings.mendixmodelsdk.microflowsMod.microflows.NanoflowCallParameterMapping
import typings.mendixmodelsdk.microflowsMod.microflows.ProxyConfiguration
import typings.mendixmodelsdk.microflowsMod.microflows.RestCallAction
import typings.mendixmodelsdk.microflowsMod.microflows.RuleCallParameterMapping
import typings.mendixmodelsdk.microflowsMod.microflows.TemplateArgument
import typings.mendixmodelsdk.microflowsMod.microflows.WebServiceCallAction
import typings.mendixmodelsdk.microflowsMod.microflows.WebServiceOperationParameterMapping
import typings.mendixmodelsdk.pagesMod.pages.ConditionalSettings
import typings.mendixmodelsdk.pagesMod.pages.WidgetValidation
import typings.mendixmodelsdk.restMod.rest.ConsumedODataService
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 9.8.0: deleted
  * In version 7.9.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/expressions", "expressions.IfExpression")
@js.native
open class IfExpression protected () extends Expression {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    */
  def condition: Expression = js.native
  def condition_=(newValue: Expression): Unit = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    */
  def ifFalse: Expression = js.native
  def ifFalse_=(newValue: Expression): Unit = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    */
  def ifTrue: Expression = js.native
  def ifTrue_=(newValue: Expression): Unit = js.native
}
object IfExpression {
  
  @JSImport("mendixmodelsdk/src/gen/expressions", "expressions.IfExpression")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.0.1
    */
  /* static member */
  inline def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceCallParameterMappingUnderArgumentModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 9.7.0
    */
  /* static member */
  inline def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBasicCodeActionParameterValueUnderArgumentModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 7.20.0
    */
  /* static member */
  inline def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBasicJavaActionParameterValueUnderArgumentModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'left' property
    * of the parent BinaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInBinaryExpressionUnderLeft(container: BinaryExpression): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBinaryExpressionUnderLeft")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'right' property
    * of the parent BinaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInBinaryExpressionUnderRight(container: BinaryExpression): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBinaryExpressionUnderRight")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.BinaryRequestHandling element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBinaryRequestHandlingUnderExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.ChangeListAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInChangeListActionUnderValueModel(container: ChangeListAction): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInChangeListActionUnderValueModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.ChangeVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInChangeVariableActionUnderValueModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'expressionModel' property
    * of the parent pages.ConditionalSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConditionalSettingsUnderExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'timeoutModel' property
    * of the parent rest.ConsumedODataService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 to 9.7.0
    */
  /* static member */
  inline def createInConsumedODataServiceUnderTimeoutModel(container: ConsumedODataService): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConsumedODataServiceUnderTimeoutModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'initialValueModel' property
    * of the parent microflows.CreateVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateVariableActionUnderInitialValueModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'limitExpressionModel' property
    * of the parent microflows.CustomRange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCustomRangeUnderLimitExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'offsetExpressionModel' property
    * of the parent microflows.CustomRange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCustomRangeUnderOffsetExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateParameterMappingUnderArgumentModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'returnValueModel' property
    * of the parent microflows.EndEvent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInEndEventUnderReturnValueModel(container: EndEvent): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInEndEventUnderReturnValueModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.ExpressionListOperation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.3 to 9.7.0
    */
  /* static member */
  inline def createInExpressionListOperationUnderExpressionModel(container: ExpressionListOperation): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInExpressionListOperationUnderExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.ExpressionSplitCondition element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInExpressionSplitConditionUnderExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.FormDataPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 to 9.7.0
    */
  /* static member */
  inline def createInFormDataPartUnderValueModel(container: FormDataPart): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInFormDataPartUnderValueModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'arguments' property
    * of the parent FunctionCallExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInFunctionCallExpressionUnderArguments(container: FunctionCallExpression): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInFunctionCallExpressionUnderArguments")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'marginBottomInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGenerateDocumentActionUnderMarginBottomInInchModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'marginLeftInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGenerateDocumentActionUnderMarginLeftInInchModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'marginRightInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGenerateDocumentActionUnderMarginRightInInchModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'marginTopInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGenerateDocumentActionUnderMarginTopInInchModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'customLocationModel' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHttpConfigurationUnderCustomLocationModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'password' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInHttpConfigurationUnderPassword(container: HttpConfiguration): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHttpConfigurationUnderPassword")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'username' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInHttpConfigurationUnderUsername(container: HttpConfiguration): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHttpConfigurationUnderUsername")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.HttpHeaderEntry element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHttpHeaderEntryUnderValueModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'condition' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInIfExpressionUnderCondition(container: IfExpression): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInIfExpressionUnderCondition")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'ifFalse' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInIfExpressionUnderIfFalse(container: IfExpression): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInIfExpressionUnderIfFalse")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'ifTrue' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInIfExpressionUnderIfTrue(container: IfExpression): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInIfExpressionUnderIfTrue")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.InspectAttribute element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInInspectAttributeUnderExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'nodeModel' property
    * of the parent microflows.LogMessageAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInLogMessageActionUnderNodeModel(container: LogMessageAction): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLogMessageActionUnderNodeModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.MemberChange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInMemberChangeUnderValueModel(container: MemberChange): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMemberChangeUnderValueModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowCallParameterMappingUnderArgumentModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.NanoflowCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 to 9.7.0
    */
  /* static member */
  inline def createInNanoflowCallParameterMappingUnderArgumentModel(container: NanoflowCallParameterMapping): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNanoflowCallParameterMappingUnderArgumentModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'expression' property
    * of the parent ParenthesisExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInParenthesisExpressionUnderExpression(container: ParenthesisExpression): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInParenthesisExpressionUnderExpression")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'hostExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 9.7.0
    */
  /* static member */
  inline def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInProxyConfigurationUnderHostExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'passwordExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 9.7.0
    */
  /* static member */
  inline def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInProxyConfigurationUnderPasswordExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'portExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 9.7.0
    */
  /* static member */
  inline def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInProxyConfigurationUnderPortExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'useConfigurationExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 9.7.0
    */
  /* static member */
  inline def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInProxyConfigurationUnderUseConfigurationExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'usernameExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 9.7.0
    */
  /* static member */
  inline def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInProxyConfigurationUnderUsernameExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'timeOutModel' property
    * of the parent microflows.RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 9.7.0
    */
  /* static member */
  inline def createInRestCallActionUnderTimeOutModel(container: RestCallAction): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestCallActionUnderTimeOutModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.RuleCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRuleCallParameterMappingUnderArgumentModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.TemplateArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateArgumentUnderExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'expression' property
    * of the parent UnaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInUnaryExpressionUnderExpression(container: UnaryExpression): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInUnaryExpressionUnderExpression")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'timeOutModel' property
    * of the parent microflows.WebServiceCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 9.7.0
    */
  /* static member */
  inline def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebServiceCallActionUnderTimeOutModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebServiceOperationParameterMappingUnderArgumentModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'expressionModel' property
    * of the parent pages.WidgetValidation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): IfExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValidationUnderExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[IfExpression]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/expressions", "expressions.IfExpression.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/expressions", "expressions.IfExpression.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
