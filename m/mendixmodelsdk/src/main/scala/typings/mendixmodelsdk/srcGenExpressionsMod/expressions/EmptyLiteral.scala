package typings.mendixmodelsdk.srcGenExpressionsMod.expressions

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenExpressionsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.AppServiceCallParameterMapping
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.BasicCodeActionParameterValue
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.BasicJavaActionParameterValue
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.BinaryRequestHandling
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.ChangeListAction
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.ChangeVariableAction
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.CreateVariableAction
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.CustomRange
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.DocumentTemplateParameterMapping
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.EndEvent
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.ExpressionListOperation
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.ExpressionSplitCondition
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.FormDataPart
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.GenerateDocumentAction
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.HttpConfiguration
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.HttpHeaderEntry
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.InspectAttribute
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.LogMessageAction
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.MemberChange
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.MicroflowCallParameterMapping
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.NanoflowCallParameterMapping
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.ProxyConfiguration
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.RestCallAction
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.RuleCallParameterMapping
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.TemplateArgument
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.WebServiceCallAction
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.WebServiceOperationParameterMapping
import typings.mendixmodelsdk.srcGenPagesMod.pages.ConditionalSettings
import typings.mendixmodelsdk.srcGenPagesMod.pages.WidgetValidation
import typings.mendixmodelsdk.srcGenRestMod.rest.ConsumedODataService
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
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
@JSImport("mendixmodelsdk/src/gen/expressions", "expressions.EmptyLiteral")
@js.native
open class EmptyLiteral protected () extends LiteralExpression {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object EmptyLiteral {
  
  @JSImport("mendixmodelsdk/src/gen/expressions", "expressions.EmptyLiteral")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
    * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.0.1
    */
  /* static member */
  inline def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceCallParameterMappingUnderArgumentModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
    * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 9.7.0
    */
  /* static member */
  inline def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBasicCodeActionParameterValueUnderArgumentModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
    * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 7.20.0
    */
  /* static member */
  inline def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBasicJavaActionParameterValueUnderArgumentModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'left' property
    * of the parent BinaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInBinaryExpressionUnderLeft(container: BinaryExpression): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBinaryExpressionUnderLeft")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'right' property
    * of the parent BinaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInBinaryExpressionUnderRight(container: BinaryExpression): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBinaryExpressionUnderRight")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'expressionModel' property
    * of the parent microflows.BinaryRequestHandling element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBinaryRequestHandlingUnderExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'valueModel' property
    * of the parent microflows.ChangeListAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInChangeListActionUnderValueModel(container: ChangeListAction): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInChangeListActionUnderValueModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'valueModel' property
    * of the parent microflows.ChangeVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInChangeVariableActionUnderValueModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'expressionModel' property
    * of the parent pages.ConditionalSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConditionalSettingsUnderExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'timeoutModel' property
    * of the parent rest.ConsumedODataService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 to 9.7.0
    */
  /* static member */
  inline def createInConsumedODataServiceUnderTimeoutModel(container: ConsumedODataService): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConsumedODataServiceUnderTimeoutModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'initialValueModel' property
    * of the parent microflows.CreateVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateVariableActionUnderInitialValueModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'limitExpressionModel' property
    * of the parent microflows.CustomRange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCustomRangeUnderLimitExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'offsetExpressionModel' property
    * of the parent microflows.CustomRange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCustomRangeUnderOffsetExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
    * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateParameterMappingUnderArgumentModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'returnValueModel' property
    * of the parent microflows.EndEvent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInEndEventUnderReturnValueModel(container: EndEvent): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInEndEventUnderReturnValueModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'expressionModel' property
    * of the parent microflows.ExpressionListOperation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.3 to 9.7.0
    */
  /* static member */
  inline def createInExpressionListOperationUnderExpressionModel(container: ExpressionListOperation): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInExpressionListOperationUnderExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'expressionModel' property
    * of the parent microflows.ExpressionSplitCondition element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInExpressionSplitConditionUnderExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'valueModel' property
    * of the parent microflows.FormDataPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 to 9.7.0
    */
  /* static member */
  inline def createInFormDataPartUnderValueModel(container: FormDataPart): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInFormDataPartUnderValueModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'arguments' property
    * of the parent FunctionCallExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInFunctionCallExpressionUnderArguments(container: FunctionCallExpression): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInFunctionCallExpressionUnderArguments")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'marginBottomInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGenerateDocumentActionUnderMarginBottomInInchModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'marginLeftInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGenerateDocumentActionUnderMarginLeftInInchModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'marginRightInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGenerateDocumentActionUnderMarginRightInInchModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'marginTopInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGenerateDocumentActionUnderMarginTopInInchModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'customLocationModel' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHttpConfigurationUnderCustomLocationModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'password' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInHttpConfigurationUnderPassword(container: HttpConfiguration): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHttpConfigurationUnderPassword")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'username' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInHttpConfigurationUnderUsername(container: HttpConfiguration): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHttpConfigurationUnderUsername")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'valueModel' property
    * of the parent microflows.HttpHeaderEntry element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHttpHeaderEntryUnderValueModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'condition' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInIfExpressionUnderCondition(container: IfExpression): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInIfExpressionUnderCondition")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'ifFalse' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInIfExpressionUnderIfFalse(container: IfExpression): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInIfExpressionUnderIfFalse")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'ifTrue' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInIfExpressionUnderIfTrue(container: IfExpression): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInIfExpressionUnderIfTrue")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'expressionModel' property
    * of the parent microflows.InspectAttribute element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInInspectAttributeUnderExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'nodeModel' property
    * of the parent microflows.LogMessageAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInLogMessageActionUnderNodeModel(container: LogMessageAction): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLogMessageActionUnderNodeModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'valueModel' property
    * of the parent microflows.MemberChange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInMemberChangeUnderValueModel(container: MemberChange): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMemberChangeUnderValueModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
    * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowCallParameterMappingUnderArgumentModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
    * of the parent microflows.NanoflowCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 to 9.7.0
    */
  /* static member */
  inline def createInNanoflowCallParameterMappingUnderArgumentModel(container: NanoflowCallParameterMapping): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNanoflowCallParameterMappingUnderArgumentModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'expression' property
    * of the parent ParenthesisExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInParenthesisExpressionUnderExpression(container: ParenthesisExpression): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInParenthesisExpressionUnderExpression")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'hostExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 9.7.0
    */
  /* static member */
  inline def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInProxyConfigurationUnderHostExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'passwordExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 9.7.0
    */
  /* static member */
  inline def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInProxyConfigurationUnderPasswordExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'portExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 9.7.0
    */
  /* static member */
  inline def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInProxyConfigurationUnderPortExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'useConfigurationExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 9.7.0
    */
  /* static member */
  inline def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInProxyConfigurationUnderUseConfigurationExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'usernameExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 9.7.0
    */
  /* static member */
  inline def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInProxyConfigurationUnderUsernameExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'timeOutModel' property
    * of the parent microflows.RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 9.7.0
    */
  /* static member */
  inline def createInRestCallActionUnderTimeOutModel(container: RestCallAction): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestCallActionUnderTimeOutModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
    * of the parent microflows.RuleCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRuleCallParameterMappingUnderArgumentModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'expressionModel' property
    * of the parent microflows.TemplateArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateArgumentUnderExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'expression' property
    * of the parent UnaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInUnaryExpressionUnderExpression(container: UnaryExpression): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInUnaryExpressionUnderExpression")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'timeOutModel' property
    * of the parent microflows.WebServiceCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 9.7.0
    */
  /* static member */
  inline def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebServiceCallActionUnderTimeOutModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
    * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebServiceOperationParameterMappingUnderArgumentModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'expressionModel' property
    * of the parent pages.WidgetValidation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): EmptyLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValidationUnderExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyLiteral]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/expressions", "expressions.EmptyLiteral.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/expressions", "expressions.EmptyLiteral.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
