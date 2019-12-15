package typings.mendixmodelsdk.distGenExpressionsMod.expressions

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.MemberRef
import typings.mendixmodelsdk.distGenExpressionsMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.AppServiceCallParameterMapping
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.BasicCodeActionParameterValue
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.BasicJavaActionParameterValue
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.BinaryRequestHandling
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.ChangeListAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.ChangeVariableAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.CreateVariableAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.CustomRange
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.DocumentTemplateParameterMapping
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.EndEvent
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.ExpressionSplitCondition
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.FormDataPart
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.GenerateDocumentAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.HttpConfiguration
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.HttpHeaderEntry
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.InspectAttribute
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.LogMessageAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.MemberChange
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.MicroflowCallParameterMapping
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.NanoflowCallParameterMapping
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.ProxyConfiguration
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.RestCallAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.RuleCallParameterMapping
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.TemplateArgument
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.WebServiceCallAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.WebServiceOperationParameterMapping
import typings.mendixmodelsdk.distGenPagesMod.pages.ConditionalSettings
import typings.mendixmodelsdk.distGenPagesMod.pages.WidgetValidation
import typings.mendixmodelsdk.distGenRestMod.rest.ConsumedODataService
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 7.9.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.VariableRefExpression")
@js.native
class VariableRefExpression protected () extends Expression {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FVariableRefExpression: IModel = js.native
  /**
    * In version 7.11.0: introduced
    */
  def member(): MemberRef | Null = js.native
  def member(newValue: MemberRef): js.Any = js.native
  @JSName("member")
  def member_Any(): js.Any = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    */
  def variable(): VariableRef = js.native
  def variable(newValue: VariableRef): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.VariableRefExpression")
@js.native
object VariableRefExpression extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 7.20.0
    */
  def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'left' property
    * of the parent BinaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInBinaryExpressionUnderLeft(container: BinaryExpression): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'right' property
    * of the parent BinaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInBinaryExpressionUnderRight(container: BinaryExpression): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.BinaryRequestHandling element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.ChangeListAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInChangeListActionUnderValueModel(container: ChangeListAction): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.ChangeVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'expressionModel' property
    * of the parent pages.ConditionalSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'timeoutModel' property
    * of the parent rest.ConsumedODataService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  def createInConsumedODataServiceUnderTimeoutModel(container: ConsumedODataService): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'initialValueModel' property
    * of the parent microflows.CreateVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'limitExpressionModel' property
    * of the parent microflows.CustomRange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'offsetExpressionModel' property
    * of the parent microflows.CustomRange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'returnValueModel' property
    * of the parent microflows.EndEvent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInEndEventUnderReturnValueModel(container: EndEvent): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.ExpressionSplitCondition element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.FormDataPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInFormDataPartUnderValueModel(container: FormDataPart): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'arguments' property
    * of the parent FunctionCallExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInFunctionCallExpressionUnderArguments(container: FunctionCallExpression): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'marginBottomInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'marginLeftInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'marginRightInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'marginTopInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'customLocationModel' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'password' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInHttpConfigurationUnderPassword(container: HttpConfiguration): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'username' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInHttpConfigurationUnderUsername(container: HttpConfiguration): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.HttpHeaderEntry element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'condition' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInIfExpressionUnderCondition(container: IfExpression): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'ifFalse' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInIfExpressionUnderIfFalse(container: IfExpression): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'ifTrue' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInIfExpressionUnderIfTrue(container: IfExpression): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.InspectAttribute element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'nodeModel' property
    * of the parent microflows.LogMessageAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInLogMessageActionUnderNodeModel(container: LogMessageAction): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.MemberChange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInMemberChangeUnderValueModel(container: MemberChange): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.NanoflowCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInNanoflowCallParameterMappingUnderArgumentModel(container: NanoflowCallParameterMapping): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'expression' property
    * of the parent ParenthesisExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInParenthesisExpressionUnderExpression(container: ParenthesisExpression): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'hostExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'passwordExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'portExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'useConfigurationExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'usernameExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'timeOutModel' property
    * of the parent microflows.RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInRestCallActionUnderTimeOutModel(container: RestCallAction): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.RuleCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.TemplateArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'expression' property
    * of the parent UnaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInUnaryExpressionUnderExpression(container: UnaryExpression): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'timeOutModel' property
    * of the parent microflows.WebServiceCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): VariableRefExpression = js.native
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'expressionModel' property
    * of the parent pages.WidgetValidation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): VariableRefExpression = js.native
}

