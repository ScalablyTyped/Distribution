package typings.mendixmodelsdk.allModelClassesMod.expressions

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
  * In version 7.9.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "expressions.FunctionCallExpression")
@js.native
class FunctionCallExpression protected ()
  extends typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object FunctionCallExpression {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "expressions.FunctionCallExpression")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceCallParameterMappingUnderArgumentModel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  @scala.inline
  def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBasicCodeActionParameterValueUnderArgumentModel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 7.20.0
    */
  /* static member */
  @scala.inline
  def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBasicJavaActionParameterValueUnderArgumentModel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'left' property
    * of the parent BinaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInBinaryExpressionUnderLeft(container: typings.mendixmodelsdk.expressionsMod.expressions.BinaryExpression): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBinaryExpressionUnderLeft")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'right' property
    * of the parent BinaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInBinaryExpressionUnderRight(container: typings.mendixmodelsdk.expressionsMod.expressions.BinaryExpression): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBinaryExpressionUnderRight")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.BinaryRequestHandling element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBinaryRequestHandlingUnderExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.ChangeListAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInChangeListActionUnderValueModel(container: ChangeListAction): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInChangeListActionUnderValueModel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.ChangeVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInChangeVariableActionUnderValueModel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'expressionModel' property
    * of the parent pages.ConditionalSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConditionalSettingsUnderExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'timeoutModel' property
    * of the parent rest.ConsumedODataService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  /* static member */
  @scala.inline
  def createInConsumedODataServiceUnderTimeoutModel(container: ConsumedODataService): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConsumedODataServiceUnderTimeoutModel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'initialValueModel' property
    * of the parent microflows.CreateVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateVariableActionUnderInitialValueModel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'limitExpressionModel' property
    * of the parent microflows.CustomRange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCustomRangeUnderLimitExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'offsetExpressionModel' property
    * of the parent microflows.CustomRange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCustomRangeUnderOffsetExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateParameterMappingUnderArgumentModel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'returnValueModel' property
    * of the parent microflows.EndEvent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInEndEventUnderReturnValueModel(container: EndEvent): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInEndEventUnderReturnValueModel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.ExpressionSplitCondition element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInExpressionSplitConditionUnderExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.FormDataPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @scala.inline
  def createInFormDataPartUnderValueModel(container: FormDataPart): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInFormDataPartUnderValueModel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'arguments' property
    * of the parent FunctionCallExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInFunctionCallExpressionUnderArguments(container: typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInFunctionCallExpressionUnderArguments")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'marginBottomInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGenerateDocumentActionUnderMarginBottomInInchModel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'marginLeftInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGenerateDocumentActionUnderMarginLeftInInchModel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'marginRightInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGenerateDocumentActionUnderMarginRightInInchModel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'marginTopInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGenerateDocumentActionUnderMarginTopInInchModel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'customLocationModel' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHttpConfigurationUnderCustomLocationModel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'password' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInHttpConfigurationUnderPassword(container: HttpConfiguration): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHttpConfigurationUnderPassword")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'username' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInHttpConfigurationUnderUsername(container: HttpConfiguration): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHttpConfigurationUnderUsername")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.HttpHeaderEntry element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHttpHeaderEntryUnderValueModel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'condition' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInIfExpressionUnderCondition(container: typings.mendixmodelsdk.expressionsMod.expressions.IfExpression): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInIfExpressionUnderCondition")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'ifFalse' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInIfExpressionUnderIfFalse(container: typings.mendixmodelsdk.expressionsMod.expressions.IfExpression): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInIfExpressionUnderIfFalse")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'ifTrue' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInIfExpressionUnderIfTrue(container: typings.mendixmodelsdk.expressionsMod.expressions.IfExpression): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInIfExpressionUnderIfTrue")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.InspectAttribute element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInInspectAttributeUnderExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'nodeModel' property
    * of the parent microflows.LogMessageAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInLogMessageActionUnderNodeModel(container: LogMessageAction): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLogMessageActionUnderNodeModel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.MemberChange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInMemberChangeUnderValueModel(container: MemberChange): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMemberChangeUnderValueModel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowCallParameterMappingUnderArgumentModel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.NanoflowCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @scala.inline
  def createInNanoflowCallParameterMappingUnderArgumentModel(container: NanoflowCallParameterMapping): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNanoflowCallParameterMappingUnderArgumentModel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'expression' property
    * of the parent ParenthesisExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInParenthesisExpressionUnderExpression(container: typings.mendixmodelsdk.expressionsMod.expressions.ParenthesisExpression): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInParenthesisExpressionUnderExpression")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'hostExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInProxyConfigurationUnderHostExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'passwordExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInProxyConfigurationUnderPasswordExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'portExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInProxyConfigurationUnderPortExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'useConfigurationExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInProxyConfigurationUnderUseConfigurationExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'usernameExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInProxyConfigurationUnderUsernameExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'timeOutModel' property
    * of the parent microflows.RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInRestCallActionUnderTimeOutModel(container: RestCallAction): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestCallActionUnderTimeOutModel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.RuleCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRuleCallParameterMappingUnderArgumentModel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.TemplateArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateArgumentUnderExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'expression' property
    * of the parent UnaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInUnaryExpressionUnderExpression(container: typings.mendixmodelsdk.expressionsMod.expressions.UnaryExpression): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInUnaryExpressionUnderExpression")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'timeOutModel' property
    * of the parent microflows.WebServiceCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebServiceCallActionUnderTimeOutModel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebServiceOperationParameterMappingUnderArgumentModel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /**
    * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
    * The new FunctionCallExpression will be automatically stored in the 'expressionModel' property
    * of the parent pages.WidgetValidation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValidationUnderExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "expressions.FunctionCallExpression.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "expressions.FunctionCallExpression.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
