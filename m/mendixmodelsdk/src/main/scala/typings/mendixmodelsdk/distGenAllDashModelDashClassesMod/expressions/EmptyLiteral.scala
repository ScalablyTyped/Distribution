package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.expressions

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "expressions.EmptyLiteral")
@js.native
class EmptyLiteral protected ()
  extends typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "expressions.EmptyLiteral")
@js.native
object EmptyLiteral extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenExpressionsMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
    * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
    * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
    * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 7.20.0
    */
  def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'left' property
    * of the parent BinaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInBinaryExpressionUnderLeft(container: typings.mendixmodelsdk.distGenExpressionsMod.expressions.BinaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'right' property
    * of the parent BinaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInBinaryExpressionUnderRight(container: typings.mendixmodelsdk.distGenExpressionsMod.expressions.BinaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'expressionModel' property
    * of the parent microflows.BinaryRequestHandling element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'valueModel' property
    * of the parent microflows.ChangeListAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInChangeListActionUnderValueModel(container: ChangeListAction): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'valueModel' property
    * of the parent microflows.ChangeVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'expressionModel' property
    * of the parent pages.ConditionalSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'timeoutModel' property
    * of the parent rest.ConsumedODataService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  def createInConsumedODataServiceUnderTimeoutModel(container: ConsumedODataService): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'initialValueModel' property
    * of the parent microflows.CreateVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'limitExpressionModel' property
    * of the parent microflows.CustomRange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'offsetExpressionModel' property
    * of the parent microflows.CustomRange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
    * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'returnValueModel' property
    * of the parent microflows.EndEvent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInEndEventUnderReturnValueModel(container: EndEvent): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'expressionModel' property
    * of the parent microflows.ExpressionSplitCondition element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'valueModel' property
    * of the parent microflows.FormDataPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInFormDataPartUnderValueModel(container: FormDataPart): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'arguments' property
    * of the parent FunctionCallExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInFunctionCallExpressionUnderArguments(container: typings.mendixmodelsdk.distGenExpressionsMod.expressions.FunctionCallExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'marginBottomInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'marginLeftInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'marginRightInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'marginTopInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'customLocationModel' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'password' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInHttpConfigurationUnderPassword(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'username' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInHttpConfigurationUnderUsername(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'valueModel' property
    * of the parent microflows.HttpHeaderEntry element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'condition' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInIfExpressionUnderCondition(container: typings.mendixmodelsdk.distGenExpressionsMod.expressions.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'ifFalse' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInIfExpressionUnderIfFalse(container: typings.mendixmodelsdk.distGenExpressionsMod.expressions.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'ifTrue' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInIfExpressionUnderIfTrue(container: typings.mendixmodelsdk.distGenExpressionsMod.expressions.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'expressionModel' property
    * of the parent microflows.InspectAttribute element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'nodeModel' property
    * of the parent microflows.LogMessageAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInLogMessageActionUnderNodeModel(container: LogMessageAction): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'valueModel' property
    * of the parent microflows.MemberChange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInMemberChangeUnderValueModel(container: MemberChange): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
    * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
    * of the parent microflows.NanoflowCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInNanoflowCallParameterMappingUnderArgumentModel(container: NanoflowCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'expression' property
    * of the parent ParenthesisExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInParenthesisExpressionUnderExpression(container: typings.mendixmodelsdk.distGenExpressionsMod.expressions.ParenthesisExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'hostExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'passwordExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'portExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'useConfigurationExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'usernameExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'timeOutModel' property
    * of the parent microflows.RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInRestCallActionUnderTimeOutModel(container: RestCallAction): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
    * of the parent microflows.RuleCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'expressionModel' property
    * of the parent microflows.TemplateArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'expression' property
    * of the parent UnaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInUnaryExpressionUnderExpression(container: typings.mendixmodelsdk.distGenExpressionsMod.expressions.UnaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'timeOutModel' property
    * of the parent microflows.WebServiceCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
    * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
  /**
    * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
    * The new EmptyLiteral will be automatically stored in the 'expressionModel' property
    * of the parent pages.WidgetValidation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): typings.mendixmodelsdk.distGenExpressionsMod.expressions.EmptyLiteral = js.native
}

