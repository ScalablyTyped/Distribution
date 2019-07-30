package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
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
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.NanoflowCallParameterMapping
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ProxyConfiguration
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.RestCallAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.RuleCallParameterMapping
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.TemplateArgument
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.WebServiceCallAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.WebServiceOperationParameterMapping
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.ConditionalSettings
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.WidgetValidation
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "expressions")
@js.native
object expressionsNs extends js.Object {
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  class BinaryExpression protected ()
    extends typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  @js.native
  class BinaryOperator ()
    extends typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryOperator
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  class BooleanLiteral protected ()
    extends typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral {
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
  class ConstantRefExpression protected ()
    extends typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression {
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
  class EmptyLiteral protected ()
    extends typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral {
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
  class EnumerationValueRefExpression protected ()
    extends typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression {
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
  abstract class Expression protected ()
    extends typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.Expression {
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
  class FloatLiteral protected ()
    extends typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral {
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
  class FunctionCallExpression protected ()
    extends typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression {
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
  class GlobalVariableRef protected ()
    extends typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.GlobalVariableRef {
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
  class IfExpression protected ()
    extends typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression {
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
  class IntegerLiteral protected ()
    extends typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral {
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
  abstract class LiteralExpression protected ()
    extends typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.LiteralExpression {
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
  class NoExpression protected ()
    extends typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression {
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
  class NoVariableRef protected ()
    extends typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoVariableRef {
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
  class ParenthesisExpression protected ()
    extends typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression {
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
  class StringLiteral protected ()
    extends typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral {
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
  class UnaryExpression protected ()
    extends typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  @js.native
  class UnaryOperator ()
    extends typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryOperator
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  class UnparsableExpression protected ()
    extends typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression {
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
  abstract class VariableRef protected ()
    extends typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRef {
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
  class VariableRefExpression protected ()
    extends typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression {
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
  @js.native
  object BinaryExpression extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenExpressionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: ChangeListAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: EndEvent): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: FormDataPart): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: LogMessageAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: MemberChange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.NanoflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInNanoflowCallParameterMappingUnderArgumentModel(container: NanoflowCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: RestCallAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
  }
  
  /* static members */
  @js.native
  object BinaryOperator extends js.Object {
    var And: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryOperator = js.native
    var Div: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryOperator = js.native
    var Divide: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryOperator = js.native
    var Equals: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryOperator = js.native
    var GreaterThan: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryOperator = js.native
    var GreaterThanOrEqual: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryOperator = js.native
    var LessThan: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryOperator = js.native
    var LessThanOrEqual: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryOperator = js.native
    var Minus: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryOperator = js.native
    var Mod: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryOperator = js.native
    var Multiply: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryOperator = js.native
    var None: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryOperator = js.native
    var NotEquals: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryOperator = js.native
    var Or: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryOperator = js.native
    var Plus: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryOperator = js.native
  }
  
  /* static members */
  @js.native
  object BooleanLiteral extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenExpressionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: ChangeListAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: EndEvent): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: FormDataPart): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: LogMessageAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: MemberChange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.NanoflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInNanoflowCallParameterMappingUnderArgumentModel(container: NanoflowCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: RestCallAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
  }
  
  /* static members */
  @js.native
  object ConstantRefExpression extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenExpressionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: ChangeListAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: EndEvent): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: FormDataPart): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: LogMessageAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: MemberChange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.NanoflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInNanoflowCallParameterMappingUnderArgumentModel(container: NanoflowCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: RestCallAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
  }
  
  /* static members */
  @js.native
  object EmptyLiteral extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenExpressionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: ChangeListAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: EndEvent): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: FormDataPart): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: LogMessageAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: MemberChange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.NanoflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInNanoflowCallParameterMappingUnderArgumentModel(container: NanoflowCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: RestCallAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
  }
  
  /* static members */
  @js.native
  object EnumerationValueRefExpression extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenExpressionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: ChangeListAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: EndEvent): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: FormDataPart): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: LogMessageAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: MemberChange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.NanoflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInNanoflowCallParameterMappingUnderArgumentModel(container: NanoflowCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: RestCallAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
  }
  
  /* static members */
  @js.native
  object Expression extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenExpressionsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object FloatLiteral extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenExpressionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: ChangeListAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: EndEvent): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: FormDataPart): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: LogMessageAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: MemberChange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.NanoflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInNanoflowCallParameterMappingUnderArgumentModel(container: NanoflowCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: RestCallAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
  }
  
  /* static members */
  @js.native
  object FunctionCallExpression extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenExpressionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: ChangeListAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: EndEvent): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: FormDataPart): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: LogMessageAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: MemberChange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.NanoflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInNanoflowCallParameterMappingUnderArgumentModel(container: NanoflowCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: RestCallAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
  }
  
  /* static members */
  @js.native
  object GlobalVariableRef extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenExpressionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new GlobalVariableRef instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.GlobalVariableRef = js.native
    /**
      * Creates and returns a new GlobalVariableRef instance in the SDK and on the server.
      * The new GlobalVariableRef will be automatically stored in the 'variable' property
      * of the parent VariableRefExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createIn(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.GlobalVariableRef = js.native
  }
  
  /* static members */
  @js.native
  object IfExpression extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenExpressionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: ChangeListAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: EndEvent): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: FormDataPart): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: LogMessageAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: MemberChange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.NanoflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInNanoflowCallParameterMappingUnderArgumentModel(container: NanoflowCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: RestCallAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression = js.native
  }
  
  /* static members */
  @js.native
  object IntegerLiteral extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenExpressionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: ChangeListAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: EndEvent): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: FormDataPart): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: LogMessageAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: MemberChange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.NanoflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInNanoflowCallParameterMappingUnderArgumentModel(container: NanoflowCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: RestCallAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
  }
  
  /* static members */
  @js.native
  object LiteralExpression extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenExpressionsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object NoExpression extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenExpressionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: ChangeListAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: EndEvent): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: FormDataPart): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: LogMessageAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: MemberChange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.NanoflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInNanoflowCallParameterMappingUnderArgumentModel(container: NanoflowCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: RestCallAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoExpression = js.native
  }
  
  /* static members */
  @js.native
  object NoVariableRef extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenExpressionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new NoVariableRef instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoVariableRef = js.native
    /**
      * Creates and returns a new NoVariableRef instance in the SDK and on the server.
      * The new NoVariableRef will be automatically stored in the 'variable' property
      * of the parent VariableRefExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createIn(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.NoVariableRef = js.native
  }
  
  /* static members */
  @js.native
  object ParenthesisExpression extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenExpressionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: ChangeListAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: EndEvent): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: FormDataPart): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: LogMessageAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: MemberChange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.NanoflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInNanoflowCallParameterMappingUnderArgumentModel(container: NanoflowCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: RestCallAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
  }
  
  /* static members */
  @js.native
  object StringLiteral extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenExpressionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: ChangeListAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: EndEvent): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: FormDataPart): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: LogMessageAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: MemberChange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.NanoflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInNanoflowCallParameterMappingUnderArgumentModel(container: NanoflowCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: RestCallAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
  }
  
  /* static members */
  @js.native
  object UnaryExpression extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenExpressionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: ChangeListAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: EndEvent): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: FormDataPart): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: LogMessageAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: MemberChange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.NanoflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInNanoflowCallParameterMappingUnderArgumentModel(container: NanoflowCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: RestCallAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
  }
  
  /* static members */
  @js.native
  object UnaryOperator extends js.Object {
    var None: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryOperator = js.native
    var UnaryMinus: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryOperator = js.native
  }
  
  /* static members */
  @js.native
  object UnparsableExpression extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenExpressionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: ChangeListAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: EndEvent): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: FormDataPart): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: LogMessageAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: MemberChange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.NanoflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInNanoflowCallParameterMappingUnderArgumentModel(container: NanoflowCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: RestCallAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
  }
  
  /* static members */
  @js.native
  object VariableRef extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenExpressionsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object VariableRefExpression extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenExpressionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.BinaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: ChangeListAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: EndEvent): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: FormDataPart): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.FunctionCallExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: HttpConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.IfExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: LogMessageAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: MemberChange): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.NanoflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInNanoflowCallParameterMappingUnderArgumentModel(container: NanoflowCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.ParenthesisExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: RestCallAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.UnaryExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
  }
  
}

