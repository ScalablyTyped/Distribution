package typings.mendixmodelsdk.distGenExpressionsMod.expressions

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
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
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `Expressions`.
  */
/**
  * See: {@link https://docs.mendix.com/refguide7/microflow-expressions relevant section in reference guide}
  *
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 7.9.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.Expression")
@js.native
abstract class Expression protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  val containerAsAppServiceCallParameterMapping: AppServiceCallParameterMapping = js.native
  val containerAsBasicCodeActionParameterValue: BasicCodeActionParameterValue = js.native
  val containerAsBasicJavaActionParameterValue: BasicJavaActionParameterValue = js.native
  val containerAsBinaryExpression: BinaryExpression = js.native
  val containerAsBinaryRequestHandling: BinaryRequestHandling = js.native
  val containerAsChangeListAction: ChangeListAction = js.native
  val containerAsChangeVariableAction: ChangeVariableAction = js.native
  val containerAsConditionalSettings: ConditionalSettings = js.native
  val containerAsCreateVariableAction: CreateVariableAction = js.native
  val containerAsCustomRange: CustomRange = js.native
  val containerAsDocumentTemplateParameterMapping: DocumentTemplateParameterMapping = js.native
  val containerAsEndEvent: EndEvent = js.native
  val containerAsExpressionSplitCondition: ExpressionSplitCondition = js.native
  val containerAsFormDataPart: FormDataPart = js.native
  val containerAsFunctionCallExpression: FunctionCallExpression = js.native
  val containerAsGenerateDocumentAction: GenerateDocumentAction = js.native
  val containerAsHttpConfiguration: HttpConfiguration = js.native
  val containerAsHttpHeaderEntry: HttpHeaderEntry = js.native
  val containerAsIfExpression: IfExpression = js.native
  val containerAsInspectAttribute: InspectAttribute = js.native
  val containerAsLogMessageAction: LogMessageAction = js.native
  val containerAsMemberChange: MemberChange = js.native
  val containerAsMicroflowCallParameterMapping: MicroflowCallParameterMapping = js.native
  val containerAsNanoflowCallParameterMapping: NanoflowCallParameterMapping = js.native
  val containerAsParenthesisExpression: ParenthesisExpression = js.native
  val containerAsProxyConfiguration: ProxyConfiguration = js.native
  val containerAsRestCallAction: RestCallAction = js.native
  val containerAsRuleCallParameterMapping: RuleCallParameterMapping = js.native
  val containerAsTemplateArgument: TemplateArgument = js.native
  val containerAsUnaryExpression: UnaryExpression = js.native
  val containerAsWebServiceCallAction: WebServiceCallAction = js.native
  val containerAsWebServiceOperationParameterMapping: WebServiceOperationParameterMapping = js.native
  val containerAsWidgetValidation: WidgetValidation = js.native
  @JSName("model")
  var model_Expression: IModel = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.Expression")
@js.native
object Expression extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

