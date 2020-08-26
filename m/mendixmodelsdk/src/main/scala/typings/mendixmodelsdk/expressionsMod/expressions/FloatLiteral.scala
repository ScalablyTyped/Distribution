package typings.mendixmodelsdk.expressionsMod.expressions

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 7.9.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.FloatLiteral")
@js.native
class FloatLiteral protected () extends LiteralExpression {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FFloatLiteral: IModel = js.native
  def value: Double = js.native
  def value_=(newValue: Double): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.FloatLiteral")
@js.native
object FloatLiteral extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'argumentModel' property
    * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'argumentModel' property
    * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'argumentModel' property
    * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 7.20.0
    */
  def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'left' property
    * of the parent BinaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInBinaryExpressionUnderLeft(container: BinaryExpression): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'right' property
    * of the parent BinaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInBinaryExpressionUnderRight(container: BinaryExpression): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'expressionModel' property
    * of the parent microflows.BinaryRequestHandling element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'valueModel' property
    * of the parent microflows.ChangeListAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInChangeListActionUnderValueModel(container: ChangeListAction): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'valueModel' property
    * of the parent microflows.ChangeVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'expressionModel' property
    * of the parent pages.ConditionalSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'timeoutModel' property
    * of the parent rest.ConsumedODataService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  def createInConsumedODataServiceUnderTimeoutModel(container: ConsumedODataService): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'initialValueModel' property
    * of the parent microflows.CreateVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'limitExpressionModel' property
    * of the parent microflows.CustomRange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'offsetExpressionModel' property
    * of the parent microflows.CustomRange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'argumentModel' property
    * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'returnValueModel' property
    * of the parent microflows.EndEvent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInEndEventUnderReturnValueModel(container: EndEvent): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'expressionModel' property
    * of the parent microflows.ExpressionSplitCondition element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'valueModel' property
    * of the parent microflows.FormDataPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInFormDataPartUnderValueModel(container: FormDataPart): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'arguments' property
    * of the parent FunctionCallExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInFunctionCallExpressionUnderArguments(container: FunctionCallExpression): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'marginBottomInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'marginLeftInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'marginRightInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'marginTopInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'customLocationModel' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'password' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInHttpConfigurationUnderPassword(container: HttpConfiguration): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'username' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInHttpConfigurationUnderUsername(container: HttpConfiguration): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'valueModel' property
    * of the parent microflows.HttpHeaderEntry element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'condition' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInIfExpressionUnderCondition(container: IfExpression): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'ifFalse' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInIfExpressionUnderIfFalse(container: IfExpression): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'ifTrue' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInIfExpressionUnderIfTrue(container: IfExpression): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'expressionModel' property
    * of the parent microflows.InspectAttribute element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'nodeModel' property
    * of the parent microflows.LogMessageAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInLogMessageActionUnderNodeModel(container: LogMessageAction): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'valueModel' property
    * of the parent microflows.MemberChange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInMemberChangeUnderValueModel(container: MemberChange): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'argumentModel' property
    * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'argumentModel' property
    * of the parent microflows.NanoflowCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInNanoflowCallParameterMappingUnderArgumentModel(container: NanoflowCallParameterMapping): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'expression' property
    * of the parent ParenthesisExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInParenthesisExpressionUnderExpression(container: ParenthesisExpression): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'hostExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'passwordExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'portExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'useConfigurationExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'usernameExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'timeOutModel' property
    * of the parent microflows.RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInRestCallActionUnderTimeOutModel(container: RestCallAction): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'argumentModel' property
    * of the parent microflows.RuleCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'expressionModel' property
    * of the parent microflows.TemplateArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'expression' property
    * of the parent UnaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInUnaryExpressionUnderExpression(container: UnaryExpression): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'timeOutModel' property
    * of the parent microflows.WebServiceCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'argumentModel' property
    * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): FloatLiteral = js.native
  /**
    * Creates and returns a new FloatLiteral instance in the SDK and on the server.
    * The new FloatLiteral will be automatically stored in the 'expressionModel' property
    * of the parent pages.WidgetValidation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): FloatLiteral = js.native
}

