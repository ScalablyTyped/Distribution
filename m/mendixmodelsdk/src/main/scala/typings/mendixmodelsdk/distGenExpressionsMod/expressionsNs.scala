package typings.mendixmodelsdk.distGenExpressionsMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenConstantsMod.constantsNs.IConstant
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.MemberRef
import typings.mendixmodelsdk.distGenEnumerationsMod.enumerationsNs.IEnumerationValue
import typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression
import typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryOperator
import typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral
import typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression
import typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral
import typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression
import typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.Expression
import typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral
import typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression
import typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.GlobalVariableRef
import typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression
import typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral
import typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.LiteralExpression
import typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression
import typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoVariableRef
import typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression
import typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral
import typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression
import typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryOperator
import typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression
import typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRef
import typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.AppServiceCallParameterMapping
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.BasicCodeActionParameterValue
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.BasicJavaActionParameterValue
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.BinaryRequestHandling
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ChangeListAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ChangeVariableAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.CreateVariableAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.CustomRange
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.DocumentTemplateParameterMapping
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.EndEvent
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ExpressionSplitCondition
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.FormDataPart
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.HttpConfiguration
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.HttpHeaderEntry
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.InspectAttribute
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.LogMessageAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.MemberChange
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.MicroflowCallParameterMapping
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ProxyConfiguration
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.RestCallAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.RuleCallParameterMapping
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.TemplateArgument
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.WebServiceCallAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.WebServiceOperationParameterMapping
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.ConditionalSettings
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.WidgetValidation
import typings.mendixmodelsdk.distGenPluginwidgetsMod.pluginwidgetsNs.ExpressionValue
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/expressions", "expressions")
@js.native
object expressionsNs extends js.Object {
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  class BinaryExpression protected () extends Expression {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    var left: Expression = js.native
    var operator: BinaryOperator = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    var right: Expression = js.native
  }
  
  @js.native
  class BinaryOperator () extends AbstractEnum
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  class BooleanLiteral protected () extends LiteralExpression {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var value: Boolean = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  class ConstantRefExpression protected () extends Expression {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var constant: IConstant = js.native
    val constantQualifiedName: String = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  class EmptyLiteral protected () extends LiteralExpression {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  class EnumerationValueRefExpression protected () extends Expression {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var value: IEnumerationValue = js.native
    val valueQualifiedName: String = js.native
  }
  
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
    val containerAsExpressionValue: ExpressionValue = js.native
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
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
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
    var value: Double = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  class FunctionCallExpression protected () extends Expression {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    val arguments: IList[Expression] = js.native
    var functionName: String = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  class GlobalVariableRef protected () extends VariableRef {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var referredName: String = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  class IfExpression protected () extends Expression {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    var condition: Expression = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    var ifFalse: Expression = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    var ifTrue: Expression = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  class IntegerLiteral protected () extends LiteralExpression {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var value: Double = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  abstract class LiteralExpression protected () extends Expression {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  class NoExpression protected () extends Expression {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  class NoVariableRef protected () extends VariableRef {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  class ParenthesisExpression protected () extends Expression {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    var expression: Expression = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  class StringLiteral protected () extends LiteralExpression {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var value: String = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  class UnaryExpression protected () extends Expression {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    var expression: Expression = js.native
    var operator: UnaryOperator = js.native
  }
  
  @js.native
  class UnaryOperator () extends AbstractEnum
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  class UnparsableExpression protected () extends Expression {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var expression: String = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  abstract class VariableRef protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsVariableRefExpression: VariableRefExpression = js.native
    @JSName("model")
    var model_VariableRef: IModel = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
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
    /**
      * In version 7.11.0: introduced
      */
    var member: MemberRef | Null = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    var variable: VariableRef = js.native
  }
  
  /* static members */
  @js.native
  object BinaryExpression extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: BinaryExpression): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: BinaryExpression): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: ChangeListAction): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: EndEvent): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'valueModel' property
      * of the parent pluginwidgets.ExpressionValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.18.0
      */
    def createInExpressionValueUnderValueModel(container: ExpressionValue): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: FormDataPart): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: FunctionCallExpression): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: HttpConfiguration): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: HttpConfiguration): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: IfExpression): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: IfExpression): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: IfExpression): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: LogMessageAction): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: MemberChange): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: ParenthesisExpression): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: RestCallAction): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: UnaryExpression): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): BinaryExpression = js.native
  }
  
  /* static members */
  @js.native
  object BinaryOperator extends js.Object {
    var And: BinaryOperator = js.native
    var Div: BinaryOperator = js.native
    var Divide: BinaryOperator = js.native
    var Equals: BinaryOperator = js.native
    var GreaterThan: BinaryOperator = js.native
    var GreaterThanOrEqual: BinaryOperator = js.native
    var LessThan: BinaryOperator = js.native
    var LessThanOrEqual: BinaryOperator = js.native
    var Minus: BinaryOperator = js.native
    var Mod: BinaryOperator = js.native
    var Multiply: BinaryOperator = js.native
    var None: BinaryOperator = js.native
    var NotEquals: BinaryOperator = js.native
    var Or: BinaryOperator = js.native
    var Plus: BinaryOperator = js.native
  }
  
  /* static members */
  @js.native
  object BooleanLiteral extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: BinaryExpression): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: BinaryExpression): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: ChangeListAction): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: EndEvent): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'valueModel' property
      * of the parent pluginwidgets.ExpressionValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.18.0
      */
    def createInExpressionValueUnderValueModel(container: ExpressionValue): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: FormDataPart): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: FunctionCallExpression): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: HttpConfiguration): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: HttpConfiguration): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: IfExpression): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: IfExpression): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: IfExpression): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: LogMessageAction): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: MemberChange): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: ParenthesisExpression): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: RestCallAction): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: UnaryExpression): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): BooleanLiteral = js.native
  }
  
  /* static members */
  @js.native
  object ConstantRefExpression extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: BinaryExpression): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: BinaryExpression): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: ChangeListAction): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: EndEvent): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'valueModel' property
      * of the parent pluginwidgets.ExpressionValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.18.0
      */
    def createInExpressionValueUnderValueModel(container: ExpressionValue): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: FormDataPart): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: FunctionCallExpression): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: HttpConfiguration): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: HttpConfiguration): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: IfExpression): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: IfExpression): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: IfExpression): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: LogMessageAction): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: MemberChange): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: ParenthesisExpression): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: RestCallAction): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: UnaryExpression): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): ConstantRefExpression = js.native
  }
  
  /* static members */
  @js.native
  object EmptyLiteral extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: BinaryExpression): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: BinaryExpression): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: ChangeListAction): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: EndEvent): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'valueModel' property
      * of the parent pluginwidgets.ExpressionValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.18.0
      */
    def createInExpressionValueUnderValueModel(container: ExpressionValue): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: FormDataPart): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: FunctionCallExpression): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: HttpConfiguration): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: HttpConfiguration): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: IfExpression): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: IfExpression): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: IfExpression): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: LogMessageAction): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: MemberChange): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: ParenthesisExpression): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: RestCallAction): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: UnaryExpression): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): EmptyLiteral = js.native
  }
  
  /* static members */
  @js.native
  object EnumerationValueRefExpression extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: BinaryExpression): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: BinaryExpression): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: ChangeListAction): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: EndEvent): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'valueModel' property
      * of the parent pluginwidgets.ExpressionValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.18.0
      */
    def createInExpressionValueUnderValueModel(container: ExpressionValue): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: FormDataPart): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: FunctionCallExpression): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: HttpConfiguration): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: HttpConfiguration): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: IfExpression): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: IfExpression): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: IfExpression): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: LogMessageAction): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: MemberChange): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: ParenthesisExpression): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: RestCallAction): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: UnaryExpression): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): EnumerationValueRefExpression = js.native
  }
  
  /* static members */
  @js.native
  object Expression extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
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
      * of the parent pluginwidgets.ExpressionValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.18.0
      */
    def createInExpressionValueUnderValueModel(container: ExpressionValue): FloatLiteral = js.native
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
  
  /* static members */
  @js.native
  object FunctionCallExpression extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: BinaryExpression): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: BinaryExpression): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: ChangeListAction): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: EndEvent): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'valueModel' property
      * of the parent pluginwidgets.ExpressionValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.18.0
      */
    def createInExpressionValueUnderValueModel(container: ExpressionValue): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: FormDataPart): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: FunctionCallExpression): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: HttpConfiguration): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: HttpConfiguration): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: IfExpression): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: IfExpression): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: IfExpression): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: LogMessageAction): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: MemberChange): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: ParenthesisExpression): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: RestCallAction): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: UnaryExpression): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): FunctionCallExpression = js.native
  }
  
  /* static members */
  @js.native
  object GlobalVariableRef extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new GlobalVariableRef instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): GlobalVariableRef = js.native
    /**
      * Creates and returns a new GlobalVariableRef instance in the SDK and on the server.
      * The new GlobalVariableRef will be automatically stored in the 'variable' property
      * of the parent VariableRefExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createIn(container: VariableRefExpression): GlobalVariableRef = js.native
  }
  
  /* static members */
  @js.native
  object IfExpression extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: BinaryExpression): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: BinaryExpression): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: ChangeListAction): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: EndEvent): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'valueModel' property
      * of the parent pluginwidgets.ExpressionValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.18.0
      */
    def createInExpressionValueUnderValueModel(container: ExpressionValue): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: FormDataPart): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: FunctionCallExpression): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: HttpConfiguration): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: HttpConfiguration): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: IfExpression): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: IfExpression): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: IfExpression): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: LogMessageAction): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: MemberChange): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: ParenthesisExpression): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: RestCallAction): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: UnaryExpression): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): IfExpression = js.native
  }
  
  /* static members */
  @js.native
  object IntegerLiteral extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: BinaryExpression): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: BinaryExpression): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: ChangeListAction): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: EndEvent): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'valueModel' property
      * of the parent pluginwidgets.ExpressionValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.18.0
      */
    def createInExpressionValueUnderValueModel(container: ExpressionValue): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: FormDataPart): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: FunctionCallExpression): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: HttpConfiguration): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: HttpConfiguration): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: IfExpression): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: IfExpression): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: IfExpression): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: LogMessageAction): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: MemberChange): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: ParenthesisExpression): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: RestCallAction): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: UnaryExpression): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): IntegerLiteral = js.native
  }
  
  /* static members */
  @js.native
  object LiteralExpression extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object NoExpression extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: BinaryExpression): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: BinaryExpression): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: ChangeListAction): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: EndEvent): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'valueModel' property
      * of the parent pluginwidgets.ExpressionValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.18.0
      */
    def createInExpressionValueUnderValueModel(container: ExpressionValue): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: FormDataPart): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: FunctionCallExpression): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: HttpConfiguration): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: HttpConfiguration): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: IfExpression): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: IfExpression): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: IfExpression): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: LogMessageAction): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: MemberChange): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: ParenthesisExpression): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: RestCallAction): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: UnaryExpression): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): NoExpression = js.native
  }
  
  /* static members */
  @js.native
  object NoVariableRef extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new NoVariableRef instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): NoVariableRef = js.native
    /**
      * Creates and returns a new NoVariableRef instance in the SDK and on the server.
      * The new NoVariableRef will be automatically stored in the 'variable' property
      * of the parent VariableRefExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createIn(container: VariableRefExpression): NoVariableRef = js.native
  }
  
  /* static members */
  @js.native
  object ParenthesisExpression extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: BinaryExpression): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: BinaryExpression): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: ChangeListAction): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: EndEvent): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'valueModel' property
      * of the parent pluginwidgets.ExpressionValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.18.0
      */
    def createInExpressionValueUnderValueModel(container: ExpressionValue): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: FormDataPart): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: FunctionCallExpression): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: HttpConfiguration): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: HttpConfiguration): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: IfExpression): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: IfExpression): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: IfExpression): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: LogMessageAction): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: MemberChange): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: ParenthesisExpression): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: RestCallAction): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: UnaryExpression): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): ParenthesisExpression = js.native
  }
  
  /* static members */
  @js.native
  object StringLiteral extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: BinaryExpression): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: BinaryExpression): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: ChangeListAction): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: EndEvent): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'valueModel' property
      * of the parent pluginwidgets.ExpressionValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.18.0
      */
    def createInExpressionValueUnderValueModel(container: ExpressionValue): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: FormDataPart): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: FunctionCallExpression): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: HttpConfiguration): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: HttpConfiguration): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: IfExpression): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: IfExpression): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: IfExpression): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: LogMessageAction): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: MemberChange): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: ParenthesisExpression): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: RestCallAction): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: UnaryExpression): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): StringLiteral = js.native
  }
  
  /* static members */
  @js.native
  object UnaryExpression extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: BinaryExpression): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: BinaryExpression): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: ChangeListAction): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: EndEvent): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'valueModel' property
      * of the parent pluginwidgets.ExpressionValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.18.0
      */
    def createInExpressionValueUnderValueModel(container: ExpressionValue): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: FormDataPart): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: FunctionCallExpression): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: HttpConfiguration): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: HttpConfiguration): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: IfExpression): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: IfExpression): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: IfExpression): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: LogMessageAction): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: MemberChange): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: ParenthesisExpression): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: RestCallAction): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: UnaryExpression): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): UnaryExpression = js.native
  }
  
  /* static members */
  @js.native
  object UnaryOperator extends js.Object {
    var None: UnaryOperator = js.native
    var UnaryMinus: UnaryOperator = js.native
  }
  
  /* static members */
  @js.native
  object UnparsableExpression extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: BinaryExpression): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: BinaryExpression): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: ChangeListAction): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: EndEvent): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'valueModel' property
      * of the parent pluginwidgets.ExpressionValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.18.0
      */
    def createInExpressionValueUnderValueModel(container: ExpressionValue): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: FormDataPart): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: FunctionCallExpression): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: HttpConfiguration): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: HttpConfiguration): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: IfExpression): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: IfExpression): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: IfExpression): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: LogMessageAction): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: MemberChange): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: ParenthesisExpression): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: RestCallAction): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: UnaryExpression): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): UnparsableExpression = js.native
  }
  
  /* static members */
  @js.native
  object VariableRef extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
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
      * of the parent pluginwidgets.ExpressionValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.18.0
      */
    def createInExpressionValueUnderValueModel(container: ExpressionValue): VariableRefExpression = js.native
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
  
}

