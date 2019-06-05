package typings
package mendixmodelsdkLib.distGenMicroflowsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows")
@js.native
object microflowsNs extends js.Object {
  /**
    * See: {@link https://docs.mendix.com/refguide7/activities relevant section in reference guide}
    */
  @js.native
  class ActionActivity protected () extends Activity {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var action: MicroflowAction | scala.Null = js.native
    var autoGenerateCaption: scala.Boolean = js.native
    var backgroundColor: ActionActivityColor = js.native
    var caption: java.lang.String = js.native
    var documentation: java.lang.String = js.native
  }
  
  @js.native
  class ActionActivityColor ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  @js.native
  abstract class Activity protected () extends MicroflowObject {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  @js.native
  class AdvancedRequestHandling protected () extends RequestHandling {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * In version 6.7.0: introduced
      */
    var nullValueOption: NullValueOption = js.native
    val parameterMappings: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[WebServiceOperationAdvancedParameterMapping] = js.native
  }
  
  @js.native
  class AggregateFunctionEnum ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/aggregate-list relevant section in reference guide}
    */
  @js.native
  class AggregateListAction protected () extends MicroflowAction {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var aggregateFunction: AggregateFunctionEnum = js.native
    var attribute: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IAttribute | scala.Null = js.native
    val attributeQualifiedName: java.lang.String | scala.Null = js.native
    var inputListVariableName: java.lang.String = js.native
    var outputVariableName: java.lang.String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/annotation relevant section in reference guide}
    */
  @js.native
  class Annotation protected () extends MicroflowObject {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var caption: java.lang.String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/annotation-flow relevant section in reference guide}
    */
  @js.native
  class AnnotationFlow protected () extends Flow {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  @js.native
  class AppServiceCallAction protected () extends MicroflowAction {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var appServiceAction: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.IAppServiceAction | scala.Null = js.native
    val appServiceActionQualifiedName: java.lang.String | scala.Null = js.native
    var outputVariableName: java.lang.String = js.native
    val parameterMappings: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[AppServiceCallParameterMapping] = js.native
    var useVariable: scala.Boolean = js.native
  }
  
  @js.native
  class AppServiceCallParameterMapping protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var argument: java.lang.String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var argumentModel: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.Expression = js.native
    val containerAsAppServiceCallAction: AppServiceCallAction = js.native
    @JSName("model")
    var model_AppServiceCallParameterMapping: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var parameter: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.IAppServiceActionParameter | scala.Null = js.native
    val parameterQualifiedName: java.lang.String | scala.Null = js.native
  }
  
  @js.native
  class AssociationRetrieveSource protected () extends RetrieveSource {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var association: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IAssociationBase | scala.Null = js.native
    val associationQualifiedName: java.lang.String | scala.Null = js.native
    var startVariableName: java.lang.String = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  @js.native
  class BasicCodeActionParameterValue protected () extends CodeActionParameterValue {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var argument: java.lang.String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    var argumentModel: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.Expression = js.native
  }
  
  /**
    * In version 7.21.0: deleted
    * In version 6.7.0: introduced
    */
  @js.native
  class BasicJavaActionParameterValue protected () extends JavaActionParameterValue {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var argument: java.lang.String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var argumentModel: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.Expression = js.native
  }
  
  @js.native
  abstract class BinaryListOperation protected () extends ListOperation {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var secondListOrObjectVariableName: java.lang.String = js.native
  }
  
  /**
    * In version 6.9.0: introduced
    */
  @js.native
  class BinaryRequestHandling protected () extends RequestHandling {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var expression: java.lang.String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var expressionModel: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.Expression = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/break-event relevant section in reference guide}
    */
  @js.native
  class BreakEvent protected () extends MicroflowObject {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  @js.native
  abstract class CaseValue protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsSequenceFlow: SequenceFlow = js.native
    @JSName("model")
    var model_CaseValue: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/cast-object relevant section in reference guide}
    */
  @js.native
  class CastAction protected () extends MicroflowAction {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var outputVariableName: java.lang.String = js.native
  }
  
  @js.native
  class ChangeActionItemType ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/change-list relevant section in reference guide}
    */
  @js.native
  class ChangeListAction protected () extends MicroflowAction {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var changeVariableName: java.lang.String = js.native
    var `type`: ChangeListActionType = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var value: java.lang.String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var valueModel: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.Expression = js.native
  }
  
  @js.native
  class ChangeListActionType ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  @js.native
  abstract class ChangeMembersAction protected () extends MicroflowAction {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var commit: CommitEnum = js.native
    val items: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[MemberChange] = js.native
    var refreshInClient: scala.Boolean = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/change-object relevant section in reference guide}
    */
  @js.native
  class ChangeObjectAction protected () extends ChangeMembersAction {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var changeVariableName: java.lang.String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/change-variable relevant section in reference guide}
    */
  @js.native
  class ChangeVariableAction protected () extends MicroflowAction {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var changeVariableName: java.lang.String = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var value: java.lang.String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var valueModel: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.Expression = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/close-form relevant section in reference guide}
    */
  @js.native
  class CloseFormAction protected () extends MicroflowAction {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * In version 7.21.0: introduced
    */
  @js.native
  abstract class CodeActionParameterValue protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsJavaActionParameterMapping: JavaActionParameterMapping = js.native
    val containerAsJavaScriptActionParameterMapping: JavaScriptActionParameterMapping = js.native
    @JSName("model")
    var model_CodeActionParameterValue: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/committing-objects relevant section in reference guide}
    */
  @js.native
  class CommitAction protected () extends MicroflowAction {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var commitVariableName: java.lang.String = js.native
    var refreshInClient: scala.Boolean = js.native
    var withEvents: scala.Boolean = js.native
  }
  
  @js.native
  class CommitEnum ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  @js.native
  class ConstantRange protected () extends Range {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var singleObject: scala.Boolean = js.native
  }
  
  @js.native
  class Contains protected () extends BinaryListOperation {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  @js.native
  class ContentType ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/continue-event relevant section in reference guide}
    */
  @js.native
  class ContinueEvent protected () extends MicroflowObject {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/create-list relevant section in reference guide}
    */
  @js.native
  class CreateListAction protected () extends MicroflowAction {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var entity: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IEntity | scala.Null = js.native
    val entityQualifiedName: java.lang.String | scala.Null = js.native
    var outputVariableName: java.lang.String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/create-object relevant section in reference guide}
    */
  @js.native
  class CreateObjectAction protected () extends ChangeMembersAction {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var entity: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IEntity | scala.Null = js.native
    val entityQualifiedName: java.lang.String | scala.Null = js.native
    var outputVariableName: java.lang.String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/create-variable relevant section in reference guide}
    */
  @js.native
  class CreateVariableAction protected () extends MicroflowAction {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var initialValue: java.lang.String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var initialValueModel: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.Expression = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 7.9.0: deleted
      */
    var variableDataType: java.lang.String = js.native
    var variableName: java.lang.String = js.native
    /**
      * In version 7.9.0: introduced
      */
    var variableType: mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DataType = js.native
  }
  
  @js.native
  class CustomRange protected () extends Range {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var limitExpression: java.lang.String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var limitExpressionModel: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.Expression = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var offsetExpression: java.lang.String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var offsetExpressionModel: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.Expression = js.native
  }
  
  @js.native
  class CustomRequestHandling protected () extends RequestHandling {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var template: StringTemplate = js.native
  }
  
  @js.native
  class DatabaseRetrieveSource protected () extends RetrieveSource {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var entity: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IEntity | scala.Null = js.native
    val entityQualifiedName: java.lang.String | scala.Null = js.native
    var range: Range = js.native
    var sortItemList: SortItemList = js.native
    /**
      * The value of this property is conceptually of type xPathConstraints.XPathConstraint.
      */
    var xPathConstraint: java.lang.String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/deleting-objects relevant section in reference guide}
    */
  @js.native
  class DeleteAction protected () extends MicroflowAction {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var deleteVariableName: java.lang.String = js.native
    var refreshInClient: scala.Boolean = js.native
  }
  
  @js.native
  class DocumentTemplateParameterMapping protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var argument: java.lang.String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var argumentModel: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.Expression = js.native
    val containerAsGenerateDocumentAction: GenerateDocumentAction = js.native
    @JSName("model")
    var model_DocumentTemplateParameterMapping: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var widgetName: java.lang.String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/download-file relevant section in reference guide}
    */
  @js.native
  class DownloadFileAction protected () extends MicroflowAction {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var fileDocumentVariableName: java.lang.String = js.native
    var showFileInBrowser: scala.Boolean = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/end-event relevant section in reference guide}
    */
  @js.native
  class EndEvent protected () extends MicroflowObject {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var documentation: java.lang.String = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var returnValue: java.lang.String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var returnValueModel: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.Expression = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  @js.native
  class EntityTypeCodeActionParameterValue protected () extends CodeActionParameterValue {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var entity: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IEntity | scala.Null = js.native
    val entityQualifiedName: java.lang.String | scala.Null = js.native
  }
  
  /**
    * In version 7.21.0: deleted
    * In version 6.8.0: introduced
    */
  @js.native
  class EntityTypeJavaActionParameterValue protected () extends JavaActionParameterValue {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var entity: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IEntity | scala.Null = js.native
    val entityQualifiedName: java.lang.String | scala.Null = js.native
  }
  
  @js.native
  class EnumerationCase protected () extends CaseValue {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var value: java.lang.String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/error-event relevant section in reference guide}
    */
  @js.native
  class ErrorEvent protected () extends MicroflowObject {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  @js.native
  class ErrorHandlingType ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  @js.native
  class ErrorResultHandlingType ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/merge relevant section in reference guide}
    */
  @js.native
  class ExclusiveMerge protected () extends MicroflowObject {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/exclusive-split relevant section in reference guide}
    */
  @js.native
  class ExclusiveSplit protected () extends MicroflowObject {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var caption: java.lang.String = js.native
    var documentation: java.lang.String = js.native
    var errorHandlingType: ErrorHandlingType = js.native
    var splitCondition: SplitCondition = js.native
  }
  
  /**
    * In version 7.21.0: deleted
    * In version 7.2.0: introduced
    */
  @js.native
  class ExportMappingJavaActionParameterValue protected () extends JavaActionParameterValue {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var exportMapping: mendixmodelsdkLib.distGenExportmappingsMod.exportmappingsNs.IExportMapping | scala.Null = js.native
    val exportMappingQualifiedName: java.lang.String | scala.Null = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  @js.native
  class ExportMappingParameterValue protected () extends CodeActionParameterValue {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var exportMapping: mendixmodelsdkLib.distGenExportmappingsMod.exportmappingsNs.IExportMapping | scala.Null = js.native
    val exportMappingQualifiedName: java.lang.String | scala.Null = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/export-mapping-action relevant section in reference guide}
    */
  @js.native
  class ExportXmlAction protected () extends MicroflowAction {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var isValidationRequired: scala.Boolean = js.native
    /**
      * In version 7.6.0: deleted
      */
    var mapping: mendixmodelsdkLib.distGenExportmappingsMod.exportmappingsNs.IExportMapping | scala.Null = js.native
    /**
      * In version 7.6.0: deleted
      */
    var mappingArgumentVariableName: java.lang.String = js.native
    val mappingQualifiedName: java.lang.String | scala.Null = js.native
    var outputMethod: OutputMethod = js.native
    /**
      * In version 7.6.0: introduced
      */
    var resultHandling: MappingRequestHandling = js.native
  }
  
  @js.native
  class ExpressionSplitCondition protected () extends SplitCondition {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var expression: java.lang.String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var expressionModel: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.Expression = js.native
  }
  
  @js.native
  class FileDocumentExport protected () extends OutputMethod {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var targetDocumentVariableName: java.lang.String = js.native
  }
  
  @js.native
  class Filter protected () extends InspectAttribute {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  @js.native
  class Find protected () extends InspectAttribute {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  @js.native
  abstract class Flow protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsMicroflowBase: MicroflowBase = js.native
    var destination: MicroflowObject = js.native
    var destinationBezierVector: mendixmodelsdkLib.distCommonMod.commonNs.ISize = js.native
    var destinationConnectionIndex: scala.Double = js.native
    @JSName("model")
    var model_Flow: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var origin: MicroflowObject = js.native
    var originBezierVector: mendixmodelsdkLib.distCommonMod.commonNs.ISize = js.native
    var originConnectionIndex: scala.Double = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/generate-document relevant section in reference guide}
    */
  @js.native
  class GenerateDocumentAction protected () extends MicroflowAction {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var documentTemplate: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.IDocumentTemplate | scala.Null = js.native
    val documentTemplateQualifiedName: java.lang.String | scala.Null = js.native
    var documentType: TargetDocumentType = js.native
    var fileVariableName: java.lang.String = js.native
    var languageSetting: LanguageSettingType = js.native
    var languageVariableName: java.lang.String = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var marginBottomInInch: java.lang.String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var marginBottomInInchModel: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.Expression = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var marginLeftInInch: java.lang.String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var marginLeftInInchModel: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.Expression = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var marginRightInInch: java.lang.String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var marginRightInInchModel: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.Expression = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var marginTopInInch: java.lang.String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var marginTopInInchModel: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.Expression = js.native
    var overrideBottomMargin: scala.Boolean = js.native
    var overrideLeftMargin: scala.Boolean = js.native
    var overrideRightMargin: scala.Boolean = js.native
    var overrideTopMargin: scala.Boolean = js.native
    val parameterMappings: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[DocumentTemplateParameterMapping] = js.native
  }
  
  @js.native
  class Head protected () extends ListOperation {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  @js.native
  class HttpConfiguration protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var authenticationPassword: java.lang.String = js.native
    val containerAsConsumedODataService: mendixmodelsdkLib.distGenRestMod.restNs.ConsumedODataService = js.native
    val containerAsRestCallAction: RestCallAction = js.native
    val containerAsWebServiceCallAction: WebServiceCallAction = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var customLocation: java.lang.String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var customLocationModel: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.Expression = js.native
    /**
      * In version 6.6.0: introduced
      */
    var customLocationTemplate: StringTemplate | scala.Null = js.native
    val headerEntries: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[HttpHeaderEntry] = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var httpAuthenticationUserName: java.lang.String = js.native
    /**
      * In version 7.7.0: deleted
      * In version 6.6.0: introduced
      */
    var httpMethod: HttpMethod = js.native
    @JSName("model")
    var model_HttpConfiguration: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    /**
      * In version 7.7.0: introduced
      */
    var newHttpMethod: mendixmodelsdkLib.distGenServicesMod.servicesNs.HttpMethod = js.native
    var overrideLocation: scala.Boolean = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var password: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.Expression = js.native
    var useAuthentication: scala.Boolean = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var username: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.Expression = js.native
  }
  
  @js.native
  class HttpHeaderEntry protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsHttpConfiguration: HttpConfiguration = js.native
    var key: java.lang.String = js.native
    @JSName("model")
    var model_HttpHeaderEntry: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var value: java.lang.String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var valueModel: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.Expression = js.native
  }
  
  @js.native
  class HttpMethod ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/microflows relevant section in reference guide}
    */
  @js.native
  trait IMicroflow extends IServerSideMicroflow {
    /**
      * In version 7.23.0: added public
      */
    val allowedModuleRoles: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[mendixmodelsdkLib.distGenSecurityMod.securityNs.IModuleRole] = js.native
    val allowedModuleRolesQualifiedNames: js.Array[java.lang.String] = js.native
  }
  
  @js.native
  trait IMicroflowBase
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.IDocument {
    /**
      * This property is required and cannot be set to null.
      *
      * In version 7.9.0: introduced
      */
    val microflowReturnType: mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IDataType = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 7.9.0: deleted
      */
    val returnType: java.lang.String | scala.Null = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/parameter relevant section in reference guide}
    */
  @js.native
  trait IMicroflowParameter extends IMicroflowParameterBase
  
  @js.native
  trait IMicroflowParameterBase
    extends mendixmodelsdkLib.distSdkInternalElementsMod.IElement
       with mendixmodelsdkLib.distSdkInternalElementsMod.IByNameReferrable {
    val containerAsMicroflow: IMicroflow = js.native
    val containerAsRule: IRule = js.native
    @JSName("model")
    val model_IMicroflowParameterBase: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    val name: java.lang.String = js.native
    /**
      * This property is required and cannot be set to null.
      *
      * In version 7.9.0: introduced
      */
    val parameterType: mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IDataType = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 7.9.0: deleted
      */
    val `type`: java.lang.String | scala.Null = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/nanoflows relevant section in reference guide}
    *
    * In version 7.12.0: removed experimental
    * In version 7.10.0: introduced
    */
  @js.native
  trait INanoflow extends IMicroflowBase {
    /**
      * In version 7.23.0: added public
      */
    val allowedModuleRoles: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[mendixmodelsdkLib.distGenSecurityMod.securityNs.IModuleRole] = js.native
    val allowedModuleRolesQualifiedNames: js.Array[java.lang.String] = js.native
  }
  
  /**
    * In version 7.19.0: introduced
    */
  @js.native
  trait INanoflowParameter extends IMicroflowParameterBase
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/rules relevant section in reference guide}
    */
  @js.native
  trait IRule extends IServerSideMicroflow
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/parameter relevant section in reference guide}
    */
  @js.native
  trait IRuleParameter extends IMicroflowParameterBase
  
  @js.native
  trait IServerSideMicroflow extends IMicroflowBase
  
  @js.native
  class ImportMappingCall protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * In version 7.18.0: introduced
      */
    var commit: CommitEnum = js.native
    val containerAsResultHandling: ResultHandling = js.native
    /**
      * In version 7.6.0: introduced
      */
    var contentType: ContentType = js.native
    /**
      * In version 7.8.0: introduced
      */
    var forceSingleOccurrence: scala.Boolean = js.native
    var mapping: mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.IImportMapping | scala.Null = js.native
    var mappingArgumentVariableName: java.lang.String = js.native
    val mappingQualifiedName: java.lang.String | scala.Null = js.native
    @JSName("model")
    var model_ImportMappingCall: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    /**
      * In version 7.17.0: introduced
      */
    var objectHandlingBackup: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ObjectHandlingBackupEnum = js.native
    var range: Range = js.native
  }
  
  /**
    * In version 7.21.0: deleted
    * In version 7.2.0: introduced
    */
  @js.native
  class ImportMappingJavaActionParameterValue protected () extends JavaActionParameterValue {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var importMapping: mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.IImportMapping | scala.Null = js.native
    val importMappingQualifiedName: java.lang.String | scala.Null = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  @js.native
  class ImportMappingParameterValue protected () extends CodeActionParameterValue {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var importMapping: mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.IImportMapping | scala.Null = js.native
    val importMappingQualifiedName: java.lang.String | scala.Null = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/import-mapping-action relevant section in reference guide}
    */
  @js.native
  class ImportXmlAction protected () extends MicroflowAction {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var isValidationRequired: scala.Boolean = js.native
    var resultHandling: ResultHandling = js.native
    var xmlDocumentVariableName: java.lang.String = js.native
  }
  
  @js.native
  class InheritanceCase protected () extends CaseValue {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var value: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IEntity | scala.Null = js.native
    val valueQualifiedName: java.lang.String | scala.Null = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/inheritance-split relevant section in reference guide}
    */
  @js.native
  class InheritanceSplit protected () extends MicroflowObject {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var caption: java.lang.String = js.native
    var documentation: java.lang.String = js.native
    var splitVariableName: java.lang.String = js.native
  }
  
  @js.native
  abstract class InspectAttribute protected () extends ListOperation {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * In version 7.0.0: introduced
      */
    var association: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IAssociationBase | scala.Null = js.native
    val associationQualifiedName: java.lang.String | scala.Null = js.native
    var attribute: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IAttribute | scala.Null = js.native
    val attributeQualifiedName: java.lang.String | scala.Null = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var expression: java.lang.String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var expressionModel: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.Expression = js.native
  }
  
  @js.native
  class Intersect protected () extends BinaryListOperation {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/java-action-call relevant section in reference guide}
    */
  @js.native
  class JavaActionCallAction protected () extends MicroflowAction {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var javaAction: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.IJavaAction | scala.Null = js.native
    val javaActionQualifiedName: java.lang.String | scala.Null = js.native
    var outputVariableName: java.lang.String = js.native
    val parameterMappings: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[JavaActionParameterMapping] = js.native
    /**
      * In version 7.13.0: introduced
      */
    var useReturnVariable: scala.Boolean = js.native
  }
  
  @js.native
  class JavaActionParameterMapping protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      *
      * In version 6.7.0: deleted
      */
    var argument: java.lang.String = js.native
    val containerAsJavaActionCallAction: JavaActionCallAction = js.native
    @JSName("model")
    var model_JavaActionParameterMapping: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var parameter: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.IJavaActionParameter = js.native
    val parameterQualifiedName: java.lang.String = js.native
    /**
      * In version 7.21.0: introduced
      */
    var parameterValue: CodeActionParameterValue = js.native
    /**
      * In version 7.21.0: deleted
      * In version 6.7.0: introduced
      */
    var value: JavaActionParameterValue = js.native
  }
  
  /**
    * In version 7.21.0: deleted
    * In version 6.7.0: introduced
    */
  @js.native
  abstract class JavaActionParameterValue protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsJavaActionParameterMapping: JavaActionParameterMapping = js.native
    @JSName("model")
    var model_JavaActionParameterValue: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.21.0: introduced
    */
  @js.native
  class JavaScriptActionCallAction protected () extends MicroflowAction {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var javaScriptAction: mendixmodelsdkLib.distGenJavascriptactionsMod.javascriptactionsNs.IJavaScriptAction | scala.Null = js.native
    val javaScriptActionQualifiedName: java.lang.String | scala.Null = js.native
    var outputVariableName: java.lang.String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    val parameterMappings: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[JavaScriptActionParameterMapping] = js.native
    var useReturnVariable: scala.Boolean = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.21.0: introduced
    */
  @js.native
  class JavaScriptActionParameterMapping protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsJavaScriptActionCallAction: JavaScriptActionCallAction = js.native
    @JSName("model")
    var model_JavaScriptActionParameterMapping: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var parameter: mendixmodelsdkLib.distGenJavascriptactionsMod.javascriptactionsNs.IJavaScriptActionParameter = js.native
    val parameterQualifiedName: java.lang.String = js.native
    var parameterValue: CodeActionParameterValue = js.native
  }
  
  @js.native
  class LanguageSettingType ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  @js.native
  class ListEquals protected () extends BinaryListOperation {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  @js.native
  abstract class ListOperation protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsListOperationAction: ListOperationAction = js.native
    var listVariableName: java.lang.String = js.native
    @JSName("model")
    var model_ListOperation: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/list-operation relevant section in reference guide}
    */
  @js.native
  class ListOperationAction protected () extends MicroflowAction {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var operation: ListOperation | scala.Null = js.native
    var outputVariableName: java.lang.String = js.native
  }
  
  @js.native
  class LogLevel ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/log-message relevant section in reference guide}
    */
  @js.native
  class LogMessageAction protected () extends MicroflowAction {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var includeLatestStackTrace: scala.Boolean = js.native
    var level: LogLevel = js.native
    var messageTemplate: StringTemplate = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var node: java.lang.String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var nodeModel: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.Expression = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/loop relevant section in reference guide}
    */
  @js.native
  class LoopedActivity protected () extends Activity {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var documentation: java.lang.String = js.native
    var errorHandlingType: ErrorHandlingType = js.native
    var iteratedListVariableName: java.lang.String = js.native
    var loopVariableName: java.lang.String = js.native
    var objectCollection: MicroflowObjectCollection = js.native
  }
  
  @js.native
  class MappingRequestHandling protected () extends RequestHandling {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * In version 7.6.0: introduced
      */
    var contentType: ContentType = js.native
    var mapping: mendixmodelsdkLib.distGenExportmappingsMod.exportmappingsNs.IExportMapping | scala.Null = js.native
    var mappingArgumentVariableName: java.lang.String = js.native
    val mappingQualifiedName: java.lang.String | scala.Null = js.native
  }
  
  @js.native
  class MemberChange protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var association: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IAssociationBase | scala.Null = js.native
    val associationQualifiedName: java.lang.String | scala.Null = js.native
    var attribute: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IAttribute | scala.Null = js.native
    val attributeQualifiedName: java.lang.String | scala.Null = js.native
    val containerAsChangeMembersAction: ChangeMembersAction = js.native
    @JSName("model")
    var model_MemberChange: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var `type`: ChangeActionItemType = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var value: java.lang.String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var valueModel: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.Expression = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/microflows relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IMicroflow because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined allowedModuleRoles, allowedModuleRolesQualifiedNames */ @js.native
  class Microflow protected () extends ServerSideMicroflow {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
    var allowConcurrentExecution: scala.Boolean = js.native
    /**
      * In version 7.23.0: added public
      */
    val allowedModuleRoles: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[mendixmodelsdkLib.distGenSecurityMod.securityNs.IModuleRole] = js.native
    val allowedModuleRolesQualifiedNames: js.Array[java.lang.String] = js.native
    var concurrencyErrorMessage: mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    var concurrencyErrorMicroflow: IMicroflow | scala.Null = js.native
    val concurrencyErrorMicroflowQualifiedName: java.lang.String | scala.Null = js.native
  }
  
  @js.native
  abstract class MicroflowAction protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsActionActivity: ActionActivity = js.native
    var errorHandlingType: ErrorHandlingType = js.native
    @JSName("model")
    var model_MicroflowAction: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IMicroflowBase because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined returnType, microflowReturnType */ @js.native
  abstract class MicroflowBase protected ()
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.Document {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
    val flows: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[Flow] = js.native
    var markAsUsed: scala.Boolean = js.native
    /**
      * In version 7.9.0: introduced
      */
    var microflowReturnType: mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DataType | mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IDataType = js.native
    var objectCollection: MicroflowObjectCollection = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 7.9.0: deleted
      */
    var returnType: scala.Null | java.lang.String = js.native
  }
  
  @js.native
  class MicroflowCall protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsMicroflowCallAction: MicroflowCallAction = js.native
    var microflow: IMicroflow | scala.Null = js.native
    val microflowQualifiedName: java.lang.String | scala.Null = js.native
    @JSName("model")
    var model_MicroflowCall: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    val parameterMappings: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[MicroflowCallParameterMapping] = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/microflow-call relevant section in reference guide}
    */
  @js.native
  class MicroflowCallAction protected () extends MicroflowAction {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var microflowCall: MicroflowCall = js.native
    var outputVariableName: java.lang.String = js.native
    var useReturnVariable: scala.Boolean = js.native
  }
  
  @js.native
  class MicroflowCallParameterMapping protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var argument: java.lang.String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var argumentModel: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.Expression = js.native
    val containerAsMicroflowCall: MicroflowCall = js.native
    @JSName("model")
    var model_MicroflowCallParameterMapping: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var parameter: IMicroflowParameter = js.native
    val parameterQualifiedName: java.lang.String = js.native
  }
  
  /**
    * In version 7.21.0: deleted
    * In version 6.9.0: introduced
    */
  @js.native
  class MicroflowJavaActionParameterValue protected () extends JavaActionParameterValue {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var microflow: IMicroflow | scala.Null = js.native
    val microflowQualifiedName: java.lang.String | scala.Null = js.native
  }
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Microflows`.
    */
  @js.native
  abstract class MicroflowObject protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsMicroflowObjectCollection: MicroflowObjectCollection = js.native
    @JSName("model")
    var model_MicroflowObject: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var relativeMiddlePoint: mendixmodelsdkLib.distCommonMod.commonNs.IPoint = js.native
    var size: mendixmodelsdkLib.distCommonMod.commonNs.ISize = js.native
  }
  
  @js.native
  class MicroflowObjectCollection protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsLoopedActivity: LoopedActivity = js.native
    val containerAsMicroflowBase: MicroflowBase = js.native
    @JSName("model")
    var model_MicroflowObjectCollection: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    val objects: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[MicroflowObject] = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/parameter relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IMicroflowParameter because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class MicroflowParameter protected () extends MicroflowParameterBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    @JSName("containerAsMicroflow")
    val containerAsMicroflow_MicroflowParameter: Microflow = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IMicroflowParameterBase because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsMicroflow, containerAsRule, name, `type`, parameterType */ @js.native
  abstract class MicroflowParameterBase protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsMicroflow: IMicroflow | Microflow = js.native
    val containerAsRule: IRule | Rule = js.native
    @JSName("model")
    var model_MicroflowParameterBase: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var name: java.lang.String = js.native
    /**
      * In version 7.9.0: introduced
      */
    var parameterType: mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DataType | mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IDataType = js.native
    val qualifiedName: java.lang.String | scala.Null = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 7.9.0: deleted
      */
    var `type`: scala.Null | java.lang.String = js.native
  }
  
  @js.native
  class MicroflowParameterObject protected () extends MicroflowObject {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var documentation: java.lang.String = js.native
    var name: java.lang.String = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 7.9.0: deleted
      */
    var `type`: java.lang.String = js.native
    /**
      * In version 7.9.0: introduced
      */
    var variableType: mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DataType = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  @js.native
  class MicroflowParameterValue protected () extends CodeActionParameterValue {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var microflow: IMicroflow | scala.Null = js.native
    val microflowQualifiedName: java.lang.String | scala.Null = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/nanoflows relevant section in reference guide}
    *
    * In version 7.12.0: removed experimental
    * In version 7.10.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.INanoflow because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined allowedModuleRoles, allowedModuleRolesQualifiedNames */ @js.native
  class Nanoflow protected () extends MicroflowBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
    /**
      * In version 7.23.0: added public
      */
    val allowedModuleRoles: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[mendixmodelsdkLib.distGenSecurityMod.securityNs.IModuleRole] = js.native
    val allowedModuleRolesQualifiedNames: js.Array[java.lang.String] = js.native
  }
  
  /**
    * In version 7.19.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.INanoflowParameter because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class NanoflowParameter protected () extends MicroflowParameterBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  @js.native
  class NoCase protected () extends CaseValue {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  @js.native
  class NullValueOption ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  @js.native
  abstract class OutputMethod protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsExportXmlAction: ExportXmlAction = js.native
    @JSName("model")
    var model_OutputMethod: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /**
    * In version 7.15.0: introduced
    */
  @js.native
  class ProxyConfiguration protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsRestCallAction: RestCallAction = js.native
    val containerAsWebServiceCallAction: WebServiceCallAction = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var hostExpression: java.lang.String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    var hostExpressionModel: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.Expression | scala.Null = js.native
    @JSName("model")
    var model_ProxyConfiguration: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var passwordExpression: java.lang.String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    var passwordExpressionModel: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.Expression | scala.Null = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var portExpression: java.lang.String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    var portExpressionModel: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.Expression | scala.Null = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var useConfigurationExpression: java.lang.String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    var useConfigurationExpressionModel: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.Expression | scala.Null = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var usernameExpression: java.lang.String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    var usernameExpressionModel: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.Expression | scala.Null = js.native
  }
  
  @js.native
  abstract class Range protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsDatabaseRetrieveSource: DatabaseRetrieveSource = js.native
    val containerAsImportMappingCall: ImportMappingCall = js.native
    @JSName("model")
    var model_Range: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  @js.native
  abstract class RequestHandling protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsExportXmlAction: ExportXmlAction = js.native
    val containerAsRestCallAction: RestCallAction = js.native
    val containerAsWebServiceCallAction: WebServiceCallAction = js.native
    @JSName("model")
    var model_RequestHandling: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  @js.native
  class RequestHandlingType ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  @js.native
  class RequestProxyType ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/call-rest-action relevant section in reference guide}
    *
    * In version 6.6.0: introduced
    */
  @js.native
  class RestCallAction protected () extends MicroflowAction {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * In version 7.0.2: introduced
      */
    var errorResultHandlingType: ErrorResultHandlingType = js.native
    var httpConfiguration: HttpConfiguration = js.native
    /**
      * In version 7.15.0: introduced
      */
    var proxyConfiguration: ProxyConfiguration | scala.Null = js.native
    var requestHandling: RequestHandling = js.native
    /**
      * In version 6.9.0: introduced
      */
    var requestHandlingType: RequestHandlingType = js.native
    /**
      * In version 7.15.0: introduced
      */
    var requestProxyType: RequestProxyType = js.native
    var resultHandling: ResultHandling = js.native
    /**
      * In version 6.9.0: introduced
      */
    var resultHandlingType: ResultHandlingType = js.native
    /**
      * In version 7.15.0: deleted
      * In version 7.1.0: introduced
      */
    var timeOut: scala.Double = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      *
      * In version 7.15.0: introduced
      */
    var timeOutExpression: java.lang.String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.15.0: introduced
      */
    var timeOutModel: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.Expression = js.native
    /**
      * In version 7.1.0: introduced
      */
    var useRequestTimeOut: scala.Boolean = js.native
  }
  
  @js.native
  class ResultHandling protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsImportXmlAction: ImportXmlAction = js.native
    val containerAsRestCallAction: RestCallAction = js.native
    val containerAsWebServiceCallAction: WebServiceCallAction = js.native
    var importMappingCall: ImportMappingCall | scala.Null = js.native
    @JSName("model")
    var model_ResultHandling: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var outputVariableName: java.lang.String = js.native
    var storeInVariable: scala.Boolean = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 7.9.0: deleted
      * In version 6.10.0: introduced
      */
    var variableDataType: java.lang.String = js.native
    /**
      * In version 7.9.0: introduced
      */
    var variableType: mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DataType = js.native
  }
  
  @js.native
  class ResultHandlingType ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/retrieve relevant section in reference guide}
    */
  @js.native
  class RetrieveAction protected () extends MicroflowAction {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var outputVariableName: java.lang.String = js.native
    var retrieveSource: RetrieveSource = js.native
  }
  
  @js.native
  abstract class RetrieveSource protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsRetrieveAction: RetrieveAction = js.native
    @JSName("model")
    var model_RetrieveSource: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/rollback-object relevant section in reference guide}
    */
  @js.native
  class RollbackAction protected () extends MicroflowAction {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var refreshInClient: scala.Boolean = js.native
    var rollbackVariableName: java.lang.String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/rules relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IRule because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class Rule protected () extends ServerSideMicroflow {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
  }
  
  @js.native
  class RuleCall protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsRuleSplitCondition: RuleSplitCondition = js.native
    @JSName("model")
    var model_RuleCall: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    val parameterMappings: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[RuleCallParameterMapping] = js.native
    var rule: IRule | scala.Null = js.native
    val ruleQualifiedName: java.lang.String | scala.Null = js.native
  }
  
  @js.native
  class RuleCallParameterMapping protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var argument: java.lang.String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var argumentModel: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.Expression = js.native
    val containerAsRuleCall: RuleCall = js.native
    @JSName("model")
    var model_RuleCallParameterMapping: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var parameter: IRuleParameter = js.native
    val parameterQualifiedName: java.lang.String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/parameter relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IRuleParameter because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class RuleParameter protected () extends MicroflowParameterBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    @JSName("containerAsRule")
    val containerAsRule_RuleParameter: Rule = js.native
  }
  
  @js.native
  class RuleSplitCondition protected () extends SplitCondition {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var ruleCall: RuleCall = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/sequence-flow relevant section in reference guide}
    */
  @js.native
  class SequenceFlow protected () extends Flow {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var caseValue: CaseValue = js.native
    var isErrorHandler: scala.Boolean = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IServerSideMicroflow because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  abstract class ServerSideMicroflow protected () extends MicroflowBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
    var applyEntityAccess: scala.Boolean = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/show-home-page relevant section in reference guide}
    */
  @js.native
  class ShowHomePageAction protected () extends MicroflowAction {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/show-message relevant section in reference guide}
    */
  @js.native
  class ShowMessageAction protected () extends MicroflowAction {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var blocking: scala.Boolean = js.native
    var template: TextTemplate = js.native
    var `type`: ShowMessageType = js.native
  }
  
  @js.native
  class ShowMessageType ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/show-page relevant section in reference guide}
    */
  @js.native
  class ShowPageAction protected () extends MicroflowAction {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var pageSettings: mendixmodelsdkLib.distGenPagesMod.pagesNs.PageSettings = js.native
    var passedObjectVariableName: java.lang.String = js.native
  }
  
  @js.native
  class SimpleRequestHandling protected () extends RequestHandling {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * In version 6.7.0: introduced
      */
    var nullValueOption: NullValueOption = js.native
    val parameterMappings: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[WebServiceOperationSimpleParameterMapping] = js.native
  }
  
  @js.native
  class Sort protected () extends ListOperation {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var sortItemList: SortItemList = js.native
  }
  
  @js.native
  class SortItem protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * The value of this property is conceptually of type paths.LegacyAttributePath.
      *
      * In version 7.11.0: deleted
      */
    var attributePath: java.lang.String = js.native
    /**
      * In version 7.11.0: introduced
      */
    var attributeRef: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AttributeRef = js.native
    val containerAsSortItemList: SortItemList = js.native
    @JSName("model")
    var model_SortItem: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var sortOrder: SortOrderEnum = js.native
  }
  
  @js.native
  class SortItemList protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsDatabaseRetrieveSource: DatabaseRetrieveSource = js.native
    val containerAsSort: Sort = js.native
    val items: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[SortItem] = js.native
    @JSName("model")
    var model_SortItemList: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  @js.native
  class SortOrderEnum ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  @js.native
  abstract class SplitCondition protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsExclusiveSplit: ExclusiveSplit = js.native
    @JSName("model")
    var model_SplitCondition: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/start-event relevant section in reference guide}
    */
  @js.native
  class StartEvent protected () extends MicroflowObject {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  @js.native
  class StringTemplate protected () extends Template {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var text: java.lang.String = js.native
  }
  
  @js.native
  class Subtract protected () extends BinaryListOperation {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/synchronize relevant section in reference guide}
    *
    * In version 7.22.0: introduced
    */
  @js.native
  class SynchronizeAction protected () extends MicroflowAction {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  @js.native
  class Tail protected () extends ListOperation {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  @js.native
  class TargetDocumentType ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  @js.native
  abstract class Template protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val arguments: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[TemplateArgument] = js.native
    val containerAsCustomRequestHandling: CustomRequestHandling = js.native
    val containerAsHttpConfiguration: HttpConfiguration = js.native
    val containerAsLogMessageAction: LogMessageAction = js.native
    val containerAsShowMessageAction: ShowMessageAction = js.native
    val containerAsValidationFeedbackAction: ValidationFeedbackAction = js.native
    @JSName("model")
    var model_Template: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  @js.native
  class TemplateArgument protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsTemplate: Template = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var expression: java.lang.String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var expressionModel: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.Expression = js.native
    @JSName("model")
    var model_TemplateArgument: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  @js.native
  class TextTemplate protected () extends Template {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var text: mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
  }
  
  @js.native
  class Union protected () extends BinaryListOperation {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/validation-feedback relevant section in reference guide}
    */
  @js.native
  class ValidationFeedbackAction protected () extends MicroflowAction {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * See: {@link https://docs.mendix.com/refguide7/validation-feedback See 'Member' section in reference guide}
      */
    var association: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IAssociationBase | scala.Null = js.native
    val associationQualifiedName: java.lang.String | scala.Null = js.native
    /**
      * See: {@link https://docs.mendix.com/refguide7/validation-feedback See 'Member' section in reference guide}
      */
    var attribute: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IAttribute | scala.Null = js.native
    val attributeQualifiedName: java.lang.String | scala.Null = js.native
    var feedbackTemplate: TextTemplate = js.native
    var objectVariableName: java.lang.String = js.native
  }
  
  @js.native
  class VariableExport protected () extends OutputMethod {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var outputVariableName: java.lang.String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/call-web-service-action relevant section in reference guide}
    */
  @js.native
  class WebServiceCallAction protected () extends MicroflowAction {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var httpConfiguration: HttpConfiguration = js.native
    var importedWebService: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.IImportedWebService | scala.Null = js.native
    val importedWebServiceQualifiedName: java.lang.String | scala.Null = js.native
    var isValidationRequired: scala.Boolean = js.native
    var operationName: java.lang.String = js.native
    /**
      * In version 7.15.0: introduced
      */
    var proxyConfiguration: ProxyConfiguration | scala.Null = js.native
    var requestBodyHandling: RequestHandling = js.native
    var requestHeaderHandling: RequestHandling = js.native
    /**
      * In version 7.15.0: introduced
      */
    var requestProxyType: RequestProxyType = js.native
    var resultHandling: ResultHandling = js.native
    /**
      * In version 6.7.0: deleted
      */
    var sendNullValueChoice: NullValueOption = js.native
    var serviceName: java.lang.String = js.native
    /**
      * In version 7.15.0: deleted
      */
    var timeOut: scala.Double = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      *
      * In version 7.15.0: introduced
      */
    var timeOutExpression: java.lang.String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.15.0: introduced
      */
    var timeOutModel: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.Expression = js.native
    var useRequestTimeOut: scala.Boolean = js.native
  }
  
  @js.native
  class WebServiceOperationAdvancedParameterMapping protected () extends WebServiceOperationParameterMapping {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var mapping: mendixmodelsdkLib.distGenExportmappingsMod.exportmappingsNs.IExportMapping | scala.Null = js.native
    var mappingArgumentVariableName: java.lang.String = js.native
    val mappingQualifiedName: java.lang.String | scala.Null = js.native
  }
  
  /**
    * In version 6.3.0: introduced
    */
  @js.native
  abstract class WebServiceOperationParameterMapping protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var argument: java.lang.String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var argumentModel: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.Expression = js.native
    val containerAsAdvancedRequestHandling: AdvancedRequestHandling = js.native
    val containerAsSimpleRequestHandling: SimpleRequestHandling = js.native
    var isChecked: scala.Boolean = js.native
    @JSName("model")
    var model_WebServiceOperationParameterMapping: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var parameterName: java.lang.String = js.native
  }
  
  @js.native
  class WebServiceOperationSimpleParameterMapping protected () extends WebServiceOperationParameterMapping {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * The value of this property is conceptually of type mappings.ElementPath.
      */
    var parameterPath: java.lang.String = js.native
  }
  
  /* static members */
  @js.native
  object ActionActivity extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ActionActivity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivity = js.native
    /**
      * Creates and returns a new ActionActivity instance in the SDK and on the server.
      * The new ActionActivity will be automatically stored in the 'objects' property
      * of the parent MicroflowObjectCollection element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowObjectCollection): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivity = js.native
  }
  
  /* static members */
  @js.native
  object ActionActivityColor extends js.Object {
    var Blue: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivityColor = js.native
    var Default: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivityColor = js.native
    var Gray: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivityColor = js.native
    var Green: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivityColor = js.native
    var Orange: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivityColor = js.native
    var Purple: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivityColor = js.native
    var Red: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivityColor = js.native
    var Yellow: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivityColor = js.native
  }
  
  /* static members */
  @js.native
  object Activity extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object AdvancedRequestHandling extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new AdvancedRequestHandling instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.AdvancedRequestHandling = js.native
    /**
      * Creates and returns a new AdvancedRequestHandling instance in the SDK and on the server.
      * The new AdvancedRequestHandling will be automatically stored in the 'requestHandling' property
      * of the parent RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    def createInRestCallActionUnderRequestHandling(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RestCallAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.AdvancedRequestHandling = js.native
    /**
      * Creates and returns a new AdvancedRequestHandling instance in the SDK and on the server.
      * The new AdvancedRequestHandling will be automatically stored in the 'requestBodyHandling' property
      * of the parent WebServiceCallAction element passed as argument.
      */
    def createInWebServiceCallActionUnderRequestBodyHandling(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceCallAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.AdvancedRequestHandling = js.native
    /**
      * Creates and returns a new AdvancedRequestHandling instance in the SDK and on the server.
      * The new AdvancedRequestHandling will be automatically stored in the 'requestHeaderHandling' property
      * of the parent WebServiceCallAction element passed as argument.
      */
    def createInWebServiceCallActionUnderRequestHeaderHandling(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceCallAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.AdvancedRequestHandling = js.native
  }
  
  /* static members */
  @js.native
  object AggregateFunctionEnum extends js.Object {
    var Average: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.AggregateFunctionEnum = js.native
    var Count: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.AggregateFunctionEnum = js.native
    var Maximum: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.AggregateFunctionEnum = js.native
    var Minimum: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.AggregateFunctionEnum = js.native
    var Sum: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.AggregateFunctionEnum = js.native
  }
  
  /* static members */
  @js.native
  object AggregateListAction extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new AggregateListAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.AggregateListAction = js.native
    /**
      * Creates and returns a new AggregateListAction instance in the SDK and on the server.
      * The new AggregateListAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivity): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.AggregateListAction = js.native
  }
  
  /* static members */
  @js.native
  object Annotation extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Annotation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.Annotation = js.native
    /**
      * Creates and returns a new Annotation instance in the SDK and on the server.
      * The new Annotation will be automatically stored in the 'objects' property
      * of the parent MicroflowObjectCollection element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowObjectCollection): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.Annotation = js.native
  }
  
  /* static members */
  @js.native
  object AnnotationFlow extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new AnnotationFlow instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.AnnotationFlow = js.native
    /**
      * Creates and returns a new AnnotationFlow instance in the SDK and on the server.
      * The new AnnotationFlow will be automatically stored in the 'flows' property
      * of the parent MicroflowBase element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowBase): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.AnnotationFlow = js.native
  }
  
  /* static members */
  @js.native
  object AppServiceCallAction extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new AppServiceCallAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.AppServiceCallAction = js.native
    /**
      * Creates and returns a new AppServiceCallAction instance in the SDK and on the server.
      * The new AppServiceCallAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivity): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.AppServiceCallAction = js.native
  }
  
  /* static members */
  @js.native
  object AppServiceCallParameterMapping extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new AppServiceCallParameterMapping instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.AppServiceCallParameterMapping = js.native
    /**
      * Creates and returns a new AppServiceCallParameterMapping instance in the SDK and on the server.
      * The new AppServiceCallParameterMapping will be automatically stored in the 'parameterMappings' property
      * of the parent AppServiceCallAction element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.AppServiceCallAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.AppServiceCallParameterMapping = js.native
  }
  
  /* static members */
  @js.native
  object AssociationRetrieveSource extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new AssociationRetrieveSource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.AssociationRetrieveSource = js.native
    /**
      * Creates and returns a new AssociationRetrieveSource instance in the SDK and on the server.
      * The new AssociationRetrieveSource will be automatically stored in the 'retrieveSource' property
      * of the parent RetrieveAction element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RetrieveAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.AssociationRetrieveSource = js.native
  }
  
  /* static members */
  @js.native
  object BasicCodeActionParameterValue extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new BasicCodeActionParameterValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BasicCodeActionParameterValue = js.native
    /**
      * Creates and returns a new BasicCodeActionParameterValue instance in the SDK and on the server.
      * The new BasicCodeActionParameterValue will be automatically stored in the 'parameterValue' property
      * of the parent JavaActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInJavaActionParameterMappingUnderParameterValue(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.JavaActionParameterMapping): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BasicCodeActionParameterValue = js.native
    /**
      * Creates and returns a new BasicCodeActionParameterValue instance in the SDK and on the server.
      * The new BasicCodeActionParameterValue will be automatically stored in the 'parameterValue' property
      * of the parent JavaScriptActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInJavaScriptActionParameterMappingUnderParameterValue(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.JavaScriptActionParameterMapping): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BasicCodeActionParameterValue = js.native
  }
  
  /* static members */
  @js.native
  object BasicJavaActionParameterValue extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new BasicJavaActionParameterValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BasicJavaActionParameterValue = js.native
    /**
      * Creates and returns a new BasicJavaActionParameterValue instance in the SDK and on the server.
      * The new BasicJavaActionParameterValue will be automatically stored in the 'value' property
      * of the parent JavaActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.20.0
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.JavaActionParameterMapping): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BasicJavaActionParameterValue = js.native
  }
  
  /* static members */
  @js.native
  object BinaryListOperation extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object BinaryRequestHandling extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new BinaryRequestHandling instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BinaryRequestHandling = js.native
    /**
      * Creates and returns a new BinaryRequestHandling instance in the SDK and on the server.
      * The new BinaryRequestHandling will be automatically stored in the 'requestHandling' property
      * of the parent RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.9.0 and higher
      */
    def createInRestCallActionUnderRequestHandling(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RestCallAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BinaryRequestHandling = js.native
    /**
      * Creates and returns a new BinaryRequestHandling instance in the SDK and on the server.
      * The new BinaryRequestHandling will be automatically stored in the 'requestBodyHandling' property
      * of the parent WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.9.0 and higher
      */
    def createInWebServiceCallActionUnderRequestBodyHandling(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceCallAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BinaryRequestHandling = js.native
    /**
      * Creates and returns a new BinaryRequestHandling instance in the SDK and on the server.
      * The new BinaryRequestHandling will be automatically stored in the 'requestHeaderHandling' property
      * of the parent WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.9.0 and higher
      */
    def createInWebServiceCallActionUnderRequestHeaderHandling(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceCallAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BinaryRequestHandling = js.native
  }
  
  /* static members */
  @js.native
  object BreakEvent extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new BreakEvent instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BreakEvent = js.native
    /**
      * Creates and returns a new BreakEvent instance in the SDK and on the server.
      * The new BreakEvent will be automatically stored in the 'objects' property
      * of the parent MicroflowObjectCollection element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowObjectCollection): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BreakEvent = js.native
  }
  
  /* static members */
  @js.native
  object CaseValue extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object CastAction extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new CastAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CastAction = js.native
    /**
      * Creates and returns a new CastAction instance in the SDK and on the server.
      * The new CastAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivity): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CastAction = js.native
  }
  
  /* static members */
  @js.native
  object ChangeActionItemType extends js.Object {
    var Add: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeActionItemType = js.native
    var Remove: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeActionItemType = js.native
    var Set: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeActionItemType = js.native
  }
  
  /* static members */
  @js.native
  object ChangeListAction extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ChangeListAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeListAction = js.native
    /**
      * Creates and returns a new ChangeListAction instance in the SDK and on the server.
      * The new ChangeListAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivity): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeListAction = js.native
  }
  
  /* static members */
  @js.native
  object ChangeListActionType extends js.Object {
    var Add: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeListActionType = js.native
    var Clear: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeListActionType = js.native
    var Remove: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeListActionType = js.native
    var Set: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeListActionType = js.native
  }
  
  /* static members */
  @js.native
  object ChangeMembersAction extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object ChangeObjectAction extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ChangeObjectAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeObjectAction = js.native
    /**
      * Creates and returns a new ChangeObjectAction instance in the SDK and on the server.
      * The new ChangeObjectAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivity): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeObjectAction = js.native
  }
  
  /* static members */
  @js.native
  object ChangeVariableAction extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ChangeVariableAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeVariableAction = js.native
    /**
      * Creates and returns a new ChangeVariableAction instance in the SDK and on the server.
      * The new ChangeVariableAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivity): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeVariableAction = js.native
  }
  
  /* static members */
  @js.native
  object CloseFormAction extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new CloseFormAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CloseFormAction = js.native
    /**
      * Creates and returns a new CloseFormAction instance in the SDK and on the server.
      * The new CloseFormAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivity): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CloseFormAction = js.native
  }
  
  /* static members */
  @js.native
  object CodeActionParameterValue extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object CommitAction extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new CommitAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CommitAction = js.native
    /**
      * Creates and returns a new CommitAction instance in the SDK and on the server.
      * The new CommitAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivity): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CommitAction = js.native
  }
  
  /* static members */
  @js.native
  object CommitEnum extends js.Object {
    var No: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CommitEnum = js.native
    var Yes: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CommitEnum = js.native
    var YesWithoutEvents: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CommitEnum = js.native
  }
  
  /* static members */
  @js.native
  object ConstantRange extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ConstantRange instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ConstantRange = js.native
    /**
      * Creates and returns a new ConstantRange instance in the SDK and on the server.
      * The new ConstantRange will be automatically stored in the 'range' property
      * of the parent DatabaseRetrieveSource element passed as argument.
      */
    def createInDatabaseRetrieveSourceUnderRange(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.DatabaseRetrieveSource): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ConstantRange = js.native
    /**
      * Creates and returns a new ConstantRange instance in the SDK and on the server.
      * The new ConstantRange will be automatically stored in the 'range' property
      * of the parent ImportMappingCall element passed as argument.
      */
    def createInImportMappingCallUnderRange(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ImportMappingCall): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ConstantRange = js.native
  }
  
  /* static members */
  @js.native
  object Contains extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Contains instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.Contains = js.native
    /**
      * Creates and returns a new Contains instance in the SDK and on the server.
      * The new Contains will be automatically stored in the 'operation' property
      * of the parent ListOperationAction element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ListOperationAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.Contains = js.native
  }
  
  /* static members */
  @js.native
  object ContentType extends js.Object {
    var Json: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ContentType = js.native
    var Xml: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ContentType = js.native
  }
  
  /* static members */
  @js.native
  object ContinueEvent extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ContinueEvent instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ContinueEvent = js.native
    /**
      * Creates and returns a new ContinueEvent instance in the SDK and on the server.
      * The new ContinueEvent will be automatically stored in the 'objects' property
      * of the parent MicroflowObjectCollection element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowObjectCollection): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ContinueEvent = js.native
  }
  
  /* static members */
  @js.native
  object CreateListAction extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new CreateListAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CreateListAction = js.native
    /**
      * Creates and returns a new CreateListAction instance in the SDK and on the server.
      * The new CreateListAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivity): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CreateListAction = js.native
  }
  
  /* static members */
  @js.native
  object CreateObjectAction extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new CreateObjectAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CreateObjectAction = js.native
    /**
      * Creates and returns a new CreateObjectAction instance in the SDK and on the server.
      * The new CreateObjectAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivity): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CreateObjectAction = js.native
  }
  
  /* static members */
  @js.native
  object CreateVariableAction extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new CreateVariableAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CreateVariableAction = js.native
    /**
      * Creates and returns a new CreateVariableAction instance in the SDK and on the server.
      * The new CreateVariableAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivity): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CreateVariableAction = js.native
  }
  
  /* static members */
  @js.native
  object CustomRange extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new CustomRange instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRange = js.native
    /**
      * Creates and returns a new CustomRange instance in the SDK and on the server.
      * The new CustomRange will be automatically stored in the 'range' property
      * of the parent DatabaseRetrieveSource element passed as argument.
      */
    def createInDatabaseRetrieveSourceUnderRange(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.DatabaseRetrieveSource): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRange = js.native
    /**
      * Creates and returns a new CustomRange instance in the SDK and on the server.
      * The new CustomRange will be automatically stored in the 'range' property
      * of the parent ImportMappingCall element passed as argument.
      */
    def createInImportMappingCallUnderRange(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ImportMappingCall): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRange = js.native
  }
  
  /* static members */
  @js.native
  object CustomRequestHandling extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new CustomRequestHandling instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRequestHandling = js.native
    /**
      * Creates and returns a new CustomRequestHandling instance in the SDK and on the server.
      * The new CustomRequestHandling will be automatically stored in the 'requestHandling' property
      * of the parent RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    def createInRestCallActionUnderRequestHandling(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RestCallAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRequestHandling = js.native
    /**
      * Creates and returns a new CustomRequestHandling instance in the SDK and on the server.
      * The new CustomRequestHandling will be automatically stored in the 'requestBodyHandling' property
      * of the parent WebServiceCallAction element passed as argument.
      */
    def createInWebServiceCallActionUnderRequestBodyHandling(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceCallAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRequestHandling = js.native
    /**
      * Creates and returns a new CustomRequestHandling instance in the SDK and on the server.
      * The new CustomRequestHandling will be automatically stored in the 'requestHeaderHandling' property
      * of the parent WebServiceCallAction element passed as argument.
      */
    def createInWebServiceCallActionUnderRequestHeaderHandling(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceCallAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRequestHandling = js.native
  }
  
  /* static members */
  @js.native
  object DatabaseRetrieveSource extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new DatabaseRetrieveSource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.DatabaseRetrieveSource = js.native
    /**
      * Creates and returns a new DatabaseRetrieveSource instance in the SDK and on the server.
      * The new DatabaseRetrieveSource will be automatically stored in the 'retrieveSource' property
      * of the parent RetrieveAction element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RetrieveAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.DatabaseRetrieveSource = js.native
  }
  
  /* static members */
  @js.native
  object DeleteAction extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new DeleteAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.DeleteAction = js.native
    /**
      * Creates and returns a new DeleteAction instance in the SDK and on the server.
      * The new DeleteAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivity): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.DeleteAction = js.native
  }
  
  /* static members */
  @js.native
  object DocumentTemplateParameterMapping extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new DocumentTemplateParameterMapping instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.DocumentTemplateParameterMapping = js.native
    /**
      * Creates and returns a new DocumentTemplateParameterMapping instance in the SDK and on the server.
      * The new DocumentTemplateParameterMapping will be automatically stored in the 'parameterMappings' property
      * of the parent GenerateDocumentAction element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.DocumentTemplateParameterMapping = js.native
  }
  
  /* static members */
  @js.native
  object DownloadFileAction extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new DownloadFileAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.DownloadFileAction = js.native
    /**
      * Creates and returns a new DownloadFileAction instance in the SDK and on the server.
      * The new DownloadFileAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivity): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.DownloadFileAction = js.native
  }
  
  /* static members */
  @js.native
  object EndEvent extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new EndEvent instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.EndEvent = js.native
    /**
      * Creates and returns a new EndEvent instance in the SDK and on the server.
      * The new EndEvent will be automatically stored in the 'objects' property
      * of the parent MicroflowObjectCollection element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowObjectCollection): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.EndEvent = js.native
  }
  
  /* static members */
  @js.native
  object EntityTypeCodeActionParameterValue extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new EntityTypeCodeActionParameterValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.EntityTypeCodeActionParameterValue = js.native
    /**
      * Creates and returns a new EntityTypeCodeActionParameterValue instance in the SDK and on the server.
      * The new EntityTypeCodeActionParameterValue will be automatically stored in the 'parameterValue' property
      * of the parent JavaActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInJavaActionParameterMappingUnderParameterValue(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.JavaActionParameterMapping): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.EntityTypeCodeActionParameterValue = js.native
    /**
      * Creates and returns a new EntityTypeCodeActionParameterValue instance in the SDK and on the server.
      * The new EntityTypeCodeActionParameterValue will be automatically stored in the 'parameterValue' property
      * of the parent JavaScriptActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInJavaScriptActionParameterMappingUnderParameterValue(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.JavaScriptActionParameterMapping): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.EntityTypeCodeActionParameterValue = js.native
  }
  
  /* static members */
  @js.native
  object EntityTypeJavaActionParameterValue extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new EntityTypeJavaActionParameterValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.EntityTypeJavaActionParameterValue = js.native
    /**
      * Creates and returns a new EntityTypeJavaActionParameterValue instance in the SDK and on the server.
      * The new EntityTypeJavaActionParameterValue will be automatically stored in the 'value' property
      * of the parent JavaActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.8.0 to 7.20.0
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.JavaActionParameterMapping): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.EntityTypeJavaActionParameterValue = js.native
  }
  
  /* static members */
  @js.native
  object EnumerationCase extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new EnumerationCase instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.EnumerationCase = js.native
    /**
      * Creates and returns a new EnumerationCase instance in the SDK and on the server.
      * The new EnumerationCase will be automatically stored in the 'caseValue' property
      * of the parent SequenceFlow element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.SequenceFlow): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.EnumerationCase = js.native
  }
  
  /* static members */
  @js.native
  object ErrorEvent extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ErrorEvent instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ErrorEvent = js.native
    /**
      * Creates and returns a new ErrorEvent instance in the SDK and on the server.
      * The new ErrorEvent will be automatically stored in the 'objects' property
      * of the parent MicroflowObjectCollection element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowObjectCollection): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ErrorEvent = js.native
  }
  
  /* static members */
  @js.native
  object ErrorHandlingType extends js.Object {
    var Abort: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ErrorHandlingType = js.native
    var Continue: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ErrorHandlingType = js.native
    var Custom: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ErrorHandlingType = js.native
    var CustomWithoutRollBack: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ErrorHandlingType = js.native
    var Rollback: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ErrorHandlingType = js.native
  }
  
  /* static members */
  @js.native
  object ErrorResultHandlingType extends js.Object {
    var HttpResponse: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ErrorResultHandlingType = js.native
    var None: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ErrorResultHandlingType = js.native
  }
  
  /* static members */
  @js.native
  object ExclusiveMerge extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ExclusiveMerge instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ExclusiveMerge = js.native
    /**
      * Creates and returns a new ExclusiveMerge instance in the SDK and on the server.
      * The new ExclusiveMerge will be automatically stored in the 'objects' property
      * of the parent MicroflowObjectCollection element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowObjectCollection): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ExclusiveMerge = js.native
  }
  
  /* static members */
  @js.native
  object ExclusiveSplit extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ExclusiveSplit instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ExclusiveSplit = js.native
    /**
      * Creates and returns a new ExclusiveSplit instance in the SDK and on the server.
      * The new ExclusiveSplit will be automatically stored in the 'objects' property
      * of the parent MicroflowObjectCollection element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowObjectCollection): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ExclusiveSplit = js.native
  }
  
  /* static members */
  @js.native
  object ExportMappingJavaActionParameterValue extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ExportMappingJavaActionParameterValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ExportMappingJavaActionParameterValue = js.native
    /**
      * Creates and returns a new ExportMappingJavaActionParameterValue instance in the SDK and on the server.
      * The new ExportMappingJavaActionParameterValue will be automatically stored in the 'value' property
      * of the parent JavaActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.2.0 to 7.20.0
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.JavaActionParameterMapping): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ExportMappingJavaActionParameterValue = js.native
  }
  
  /* static members */
  @js.native
  object ExportMappingParameterValue extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ExportMappingParameterValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ExportMappingParameterValue = js.native
    /**
      * Creates and returns a new ExportMappingParameterValue instance in the SDK and on the server.
      * The new ExportMappingParameterValue will be automatically stored in the 'parameterValue' property
      * of the parent JavaActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInJavaActionParameterMappingUnderParameterValue(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.JavaActionParameterMapping): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ExportMappingParameterValue = js.native
    /**
      * Creates and returns a new ExportMappingParameterValue instance in the SDK and on the server.
      * The new ExportMappingParameterValue will be automatically stored in the 'parameterValue' property
      * of the parent JavaScriptActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInJavaScriptActionParameterMappingUnderParameterValue(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.JavaScriptActionParameterMapping): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ExportMappingParameterValue = js.native
  }
  
  /* static members */
  @js.native
  object ExportXmlAction extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ExportXmlAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ExportXmlAction = js.native
    /**
      * Creates and returns a new ExportXmlAction instance in the SDK and on the server.
      * The new ExportXmlAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivity): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ExportXmlAction = js.native
  }
  
  /* static members */
  @js.native
  object ExpressionSplitCondition extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ExpressionSplitCondition instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ExpressionSplitCondition = js.native
    /**
      * Creates and returns a new ExpressionSplitCondition instance in the SDK and on the server.
      * The new ExpressionSplitCondition will be automatically stored in the 'splitCondition' property
      * of the parent ExclusiveSplit element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ExclusiveSplit): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ExpressionSplitCondition = js.native
  }
  
  /* static members */
  @js.native
  object FileDocumentExport extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new FileDocumentExport instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.FileDocumentExport = js.native
    /**
      * Creates and returns a new FileDocumentExport instance in the SDK and on the server.
      * The new FileDocumentExport will be automatically stored in the 'outputMethod' property
      * of the parent ExportXmlAction element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ExportXmlAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.FileDocumentExport = js.native
  }
  
  /* static members */
  @js.native
  object Filter extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Filter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.Filter = js.native
    /**
      * Creates and returns a new Filter instance in the SDK and on the server.
      * The new Filter will be automatically stored in the 'operation' property
      * of the parent ListOperationAction element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ListOperationAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.Filter = js.native
  }
  
  /* static members */
  @js.native
  object Find extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Find instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.Find = js.native
    /**
      * Creates and returns a new Find instance in the SDK and on the server.
      * The new Find will be automatically stored in the 'operation' property
      * of the parent ListOperationAction element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ListOperationAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.Find = js.native
  }
  
  /* static members */
  @js.native
  object Flow extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object GenerateDocumentAction extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new GenerateDocumentAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction = js.native
    /**
      * Creates and returns a new GenerateDocumentAction instance in the SDK and on the server.
      * The new GenerateDocumentAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivity): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction = js.native
  }
  
  /* static members */
  @js.native
  object Head extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Head instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.Head = js.native
    /**
      * Creates and returns a new Head instance in the SDK and on the server.
      * The new Head will be automatically stored in the 'operation' property
      * of the parent ListOperationAction element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ListOperationAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.Head = js.native
  }
  
  /* static members */
  @js.native
  object HttpConfiguration extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration = js.native
    /**
      * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
      * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
      * of the parent WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.5.0
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceCallAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration = js.native
    /**
      * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
      * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
      * of the parent rest.ConsumedODataService element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInConsumedODataServiceUnderHttpConfiguration(container: mendixmodelsdkLib.distGenRestMod.restNs.ConsumedODataService): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration = js.native
    /**
      * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
      * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
      * of the parent RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    def createInRestCallActionUnderHttpConfiguration(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RestCallAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration = js.native
    /**
      * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
      * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
      * of the parent WebServiceCallAction element passed as argument.
      */
    def createInWebServiceCallActionUnderHttpConfiguration(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceCallAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration = js.native
  }
  
  /* static members */
  @js.native
  object HttpHeaderEntry extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new HttpHeaderEntry instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpHeaderEntry = js.native
    /**
      * Creates and returns a new HttpHeaderEntry instance in the SDK and on the server.
      * The new HttpHeaderEntry will be automatically stored in the 'headerEntries' property
      * of the parent HttpConfiguration element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpHeaderEntry = js.native
  }
  
  /* static members */
  @js.native
  object HttpMethod extends js.Object {
    var Delete: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpMethod = js.native
    var Get: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpMethod = js.native
    var Patch: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpMethod = js.native
    var Post: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpMethod = js.native
    var Put: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpMethod = js.native
  }
  
  /* static members */
  @js.native
  object ImportMappingCall extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ImportMappingCall instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ImportMappingCall = js.native
    /**
      * Creates and returns a new ImportMappingCall instance in the SDK and on the server.
      * The new ImportMappingCall will be automatically stored in the 'importMappingCall' property
      * of the parent ResultHandling element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ResultHandling): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ImportMappingCall = js.native
  }
  
  /* static members */
  @js.native
  object ImportMappingJavaActionParameterValue extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ImportMappingJavaActionParameterValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ImportMappingJavaActionParameterValue = js.native
    /**
      * Creates and returns a new ImportMappingJavaActionParameterValue instance in the SDK and on the server.
      * The new ImportMappingJavaActionParameterValue will be automatically stored in the 'value' property
      * of the parent JavaActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.2.0 to 7.20.0
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.JavaActionParameterMapping): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ImportMappingJavaActionParameterValue = js.native
  }
  
  /* static members */
  @js.native
  object ImportMappingParameterValue extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ImportMappingParameterValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ImportMappingParameterValue = js.native
    /**
      * Creates and returns a new ImportMappingParameterValue instance in the SDK and on the server.
      * The new ImportMappingParameterValue will be automatically stored in the 'parameterValue' property
      * of the parent JavaActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInJavaActionParameterMappingUnderParameterValue(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.JavaActionParameterMapping): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ImportMappingParameterValue = js.native
    /**
      * Creates and returns a new ImportMappingParameterValue instance in the SDK and on the server.
      * The new ImportMappingParameterValue will be automatically stored in the 'parameterValue' property
      * of the parent JavaScriptActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInJavaScriptActionParameterMappingUnderParameterValue(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.JavaScriptActionParameterMapping): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ImportMappingParameterValue = js.native
  }
  
  /* static members */
  @js.native
  object ImportXmlAction extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ImportXmlAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ImportXmlAction = js.native
    /**
      * Creates and returns a new ImportXmlAction instance in the SDK and on the server.
      * The new ImportXmlAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivity): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ImportXmlAction = js.native
  }
  
  /* static members */
  @js.native
  object InheritanceCase extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new InheritanceCase instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.InheritanceCase = js.native
    /**
      * Creates and returns a new InheritanceCase instance in the SDK and on the server.
      * The new InheritanceCase will be automatically stored in the 'caseValue' property
      * of the parent SequenceFlow element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.SequenceFlow): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.InheritanceCase = js.native
  }
  
  /* static members */
  @js.native
  object InheritanceSplit extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new InheritanceSplit instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.InheritanceSplit = js.native
    /**
      * Creates and returns a new InheritanceSplit instance in the SDK and on the server.
      * The new InheritanceSplit will be automatically stored in the 'objects' property
      * of the parent MicroflowObjectCollection element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowObjectCollection): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.InheritanceSplit = js.native
  }
  
  /* static members */
  @js.native
  object InspectAttribute extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object Intersect extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Intersect instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.Intersect = js.native
    /**
      * Creates and returns a new Intersect instance in the SDK and on the server.
      * The new Intersect will be automatically stored in the 'operation' property
      * of the parent ListOperationAction element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ListOperationAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.Intersect = js.native
  }
  
  /* static members */
  @js.native
  object JavaActionCallAction extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new JavaActionCallAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.JavaActionCallAction = js.native
    /**
      * Creates and returns a new JavaActionCallAction instance in the SDK and on the server.
      * The new JavaActionCallAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivity): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.JavaActionCallAction = js.native
  }
  
  /* static members */
  @js.native
  object JavaActionParameterMapping extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new JavaActionParameterMapping instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.JavaActionParameterMapping = js.native
    /**
      * Creates and returns a new JavaActionParameterMapping instance in the SDK and on the server.
      * The new JavaActionParameterMapping will be automatically stored in the 'parameterMappings' property
      * of the parent JavaActionCallAction element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.JavaActionCallAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.JavaActionParameterMapping = js.native
  }
  
  /* static members */
  @js.native
  object JavaActionParameterValue extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object JavaScriptActionCallAction extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new JavaScriptActionCallAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.JavaScriptActionCallAction = js.native
    /**
      * Creates and returns a new JavaScriptActionCallAction instance in the SDK and on the server.
      * The new JavaScriptActionCallAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivity): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.JavaScriptActionCallAction = js.native
  }
  
  /* static members */
  @js.native
  object JavaScriptActionParameterMapping extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new JavaScriptActionParameterMapping instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.JavaScriptActionParameterMapping = js.native
    /**
      * Creates and returns a new JavaScriptActionParameterMapping instance in the SDK and on the server.
      * The new JavaScriptActionParameterMapping will be automatically stored in the 'parameterMappings' property
      * of the parent JavaScriptActionCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.JavaScriptActionCallAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.JavaScriptActionParameterMapping = js.native
  }
  
  /* static members */
  @js.native
  object LanguageSettingType extends js.Object {
    var CurrentUser: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.LanguageSettingType = js.native
    var ProjectDefault: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.LanguageSettingType = js.native
    var Variable: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.LanguageSettingType = js.native
  }
  
  /* static members */
  @js.native
  object ListEquals extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ListEquals instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ListEquals = js.native
    /**
      * Creates and returns a new ListEquals instance in the SDK and on the server.
      * The new ListEquals will be automatically stored in the 'operation' property
      * of the parent ListOperationAction element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ListOperationAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ListEquals = js.native
  }
  
  /* static members */
  @js.native
  object ListOperation extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object ListOperationAction extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ListOperationAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ListOperationAction = js.native
    /**
      * Creates and returns a new ListOperationAction instance in the SDK and on the server.
      * The new ListOperationAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivity): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ListOperationAction = js.native
  }
  
  /* static members */
  @js.native
  object LogLevel extends js.Object {
    var Critical: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.LogLevel = js.native
    var Debug: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.LogLevel = js.native
    var Error: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.LogLevel = js.native
    var Info: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.LogLevel = js.native
    var Trace: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.LogLevel = js.native
    var Warning: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.LogLevel = js.native
  }
  
  /* static members */
  @js.native
  object LogMessageAction extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new LogMessageAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.LogMessageAction = js.native
    /**
      * Creates and returns a new LogMessageAction instance in the SDK and on the server.
      * The new LogMessageAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivity): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.LogMessageAction = js.native
  }
  
  /* static members */
  @js.native
  object LoopedActivity extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new LoopedActivity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.LoopedActivity = js.native
    /**
      * Creates and returns a new LoopedActivity instance in the SDK and on the server.
      * The new LoopedActivity will be automatically stored in the 'objects' property
      * of the parent MicroflowObjectCollection element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowObjectCollection): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.LoopedActivity = js.native
  }
  
  /* static members */
  @js.native
  object MappingRequestHandling extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MappingRequestHandling instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MappingRequestHandling = js.native
    /**
      * Creates and returns a new MappingRequestHandling instance in the SDK and on the server.
      * The new MappingRequestHandling will be automatically stored in the 'resultHandling' property
      * of the parent ExportXmlAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInExportXmlActionUnderResultHandling(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ExportXmlAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MappingRequestHandling = js.native
    /**
      * Creates and returns a new MappingRequestHandling instance in the SDK and on the server.
      * The new MappingRequestHandling will be automatically stored in the 'requestHandling' property
      * of the parent RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    def createInRestCallActionUnderRequestHandling(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RestCallAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MappingRequestHandling = js.native
    /**
      * Creates and returns a new MappingRequestHandling instance in the SDK and on the server.
      * The new MappingRequestHandling will be automatically stored in the 'requestBodyHandling' property
      * of the parent WebServiceCallAction element passed as argument.
      */
    def createInWebServiceCallActionUnderRequestBodyHandling(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceCallAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MappingRequestHandling = js.native
    /**
      * Creates and returns a new MappingRequestHandling instance in the SDK and on the server.
      * The new MappingRequestHandling will be automatically stored in the 'requestHeaderHandling' property
      * of the parent WebServiceCallAction element passed as argument.
      */
    def createInWebServiceCallActionUnderRequestHeaderHandling(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceCallAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MappingRequestHandling = js.native
  }
  
  /* static members */
  @js.native
  object MemberChange extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MemberChange instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MemberChange = js.native
    /**
      * Creates and returns a new MemberChange instance in the SDK and on the server.
      * The new MemberChange will be automatically stored in the 'items' property
      * of the parent ChangeMembersAction element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeMembersAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MemberChange = js.native
  }
  
  /* static members */
  @js.native
  object Microflow extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates a new Microflow unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.Microflow = js.native
  }
  
  /* static members */
  @js.native
  object MicroflowAction extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object MicroflowBase extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object MicroflowCall extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MicroflowCall instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowCall = js.native
    /**
      * Creates and returns a new MicroflowCall instance in the SDK and on the server.
      * The new MicroflowCall will be automatically stored in the 'microflowCall' property
      * of the parent MicroflowCallAction element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowCallAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowCall = js.native
  }
  
  /* static members */
  @js.native
  object MicroflowCallAction extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MicroflowCallAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowCallAction = js.native
    /**
      * Creates and returns a new MicroflowCallAction instance in the SDK and on the server.
      * The new MicroflowCallAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivity): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowCallAction = js.native
  }
  
  /* static members */
  @js.native
  object MicroflowCallParameterMapping extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MicroflowCallParameterMapping instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowCallParameterMapping = js.native
    /**
      * Creates and returns a new MicroflowCallParameterMapping instance in the SDK and on the server.
      * The new MicroflowCallParameterMapping will be automatically stored in the 'parameterMappings' property
      * of the parent MicroflowCall element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowCall): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowCallParameterMapping = js.native
  }
  
  /* static members */
  @js.native
  object MicroflowJavaActionParameterValue extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MicroflowJavaActionParameterValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowJavaActionParameterValue = js.native
    /**
      * Creates and returns a new MicroflowJavaActionParameterValue instance in the SDK and on the server.
      * The new MicroflowJavaActionParameterValue will be automatically stored in the 'value' property
      * of the parent JavaActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.9.0 to 7.20.0
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.JavaActionParameterMapping): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowJavaActionParameterValue = js.native
  }
  
  /* static members */
  @js.native
  object MicroflowObject extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object MicroflowObjectCollection extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MicroflowObjectCollection instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowObjectCollection = js.native
    /**
      * Creates and returns a new MicroflowObjectCollection instance in the SDK and on the server.
      * The new MicroflowObjectCollection will be automatically stored in the 'objectCollection' property
      * of the parent LoopedActivity element passed as argument.
      */
    def createInLoopedActivityUnderObjectCollection(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.LoopedActivity): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowObjectCollection = js.native
    /**
      * Creates and returns a new MicroflowObjectCollection instance in the SDK and on the server.
      * The new MicroflowObjectCollection will be automatically stored in the 'objectCollection' property
      * of the parent MicroflowBase element passed as argument.
      */
    def createInMicroflowBaseUnderObjectCollection(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowBase): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowObjectCollection = js.native
  }
  
  /* static members */
  @js.native
  object MicroflowParameter extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object MicroflowParameterBase extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object MicroflowParameterObject extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MicroflowParameterObject instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterObject = js.native
    /**
      * Creates and returns a new MicroflowParameterObject instance in the SDK and on the server.
      * The new MicroflowParameterObject will be automatically stored in the 'objects' property
      * of the parent MicroflowObjectCollection element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowObjectCollection): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterObject = js.native
  }
  
  /* static members */
  @js.native
  object MicroflowParameterValue extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MicroflowParameterValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterValue = js.native
    /**
      * Creates and returns a new MicroflowParameterValue instance in the SDK and on the server.
      * The new MicroflowParameterValue will be automatically stored in the 'parameterValue' property
      * of the parent JavaActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInJavaActionParameterMappingUnderParameterValue(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.JavaActionParameterMapping): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterValue = js.native
    /**
      * Creates and returns a new MicroflowParameterValue instance in the SDK and on the server.
      * The new MicroflowParameterValue will be automatically stored in the 'parameterValue' property
      * of the parent JavaScriptActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInJavaScriptActionParameterMappingUnderParameterValue(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.JavaScriptActionParameterMapping): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterValue = js.native
  }
  
  /* static members */
  @js.native
  object Nanoflow extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates a new Nanoflow unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.Nanoflow = js.native
  }
  
  /* static members */
  @js.native
  object NanoflowParameter extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new NanoflowParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.NanoflowParameter = js.native
  }
  
  /* static members */
  @js.native
  object NoCase extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new NoCase instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.NoCase = js.native
    /**
      * Creates and returns a new NoCase instance in the SDK and on the server.
      * The new NoCase will be automatically stored in the 'caseValue' property
      * of the parent SequenceFlow element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.SequenceFlow): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.NoCase = js.native
  }
  
  /* static members */
  @js.native
  object NullValueOption extends js.Object {
    var LeaveOutElement: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.NullValueOption = js.native
    var SendAsNil: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.NullValueOption = js.native
  }
  
  /* static members */
  @js.native
  object OutputMethod extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object ProxyConfiguration extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ProxyConfiguration instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration = js.native
    /**
      * Creates and returns a new ProxyConfiguration instance in the SDK and on the server.
      * The new ProxyConfiguration will be automatically stored in the 'proxyConfiguration' property
      * of the parent RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderProxyConfiguration(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RestCallAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration = js.native
    /**
      * Creates and returns a new ProxyConfiguration instance in the SDK and on the server.
      * The new ProxyConfiguration will be automatically stored in the 'proxyConfiguration' property
      * of the parent WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderProxyConfiguration(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceCallAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration = js.native
  }
  
  /* static members */
  @js.native
  object Range extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object RequestHandling extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object RequestHandlingType extends js.Object {
    var Advanced: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RequestHandlingType = js.native
    var Binary: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RequestHandlingType = js.native
    var Custom: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RequestHandlingType = js.native
    var Mapping: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RequestHandlingType = js.native
    var Simple: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RequestHandlingType = js.native
  }
  
  /* static members */
  @js.native
  object RequestProxyType extends js.Object {
    var DefaultProxy: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RequestProxyType = js.native
    var NoProxy: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RequestProxyType = js.native
    var Override: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RequestProxyType = js.native
  }
  
  /* static members */
  @js.native
  object RestCallAction extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new RestCallAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RestCallAction = js.native
    /**
      * Creates and returns a new RestCallAction instance in the SDK and on the server.
      * The new RestCallAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivity): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RestCallAction = js.native
  }
  
  /* static members */
  @js.native
  object ResultHandling extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ResultHandling instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ResultHandling = js.native
    /**
      * Creates and returns a new ResultHandling instance in the SDK and on the server.
      * The new ResultHandling will be automatically stored in the 'resultHandling' property
      * of the parent ImportXmlAction element passed as argument.
      */
    def createInImportXmlActionUnderResultHandling(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ImportXmlAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ResultHandling = js.native
    /**
      * Creates and returns a new ResultHandling instance in the SDK and on the server.
      * The new ResultHandling will be automatically stored in the 'resultHandling' property
      * of the parent RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    def createInRestCallActionUnderResultHandling(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RestCallAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ResultHandling = js.native
    /**
      * Creates and returns a new ResultHandling instance in the SDK and on the server.
      * The new ResultHandling will be automatically stored in the 'resultHandling' property
      * of the parent WebServiceCallAction element passed as argument.
      */
    def createInWebServiceCallActionUnderResultHandling(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceCallAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ResultHandling = js.native
  }
  
  /* static members */
  @js.native
  object ResultHandlingType extends js.Object {
    var FileDocument: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ResultHandlingType = js.native
    var HttpResponse: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ResultHandlingType = js.native
    var Mapping: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ResultHandlingType = js.native
    var None: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ResultHandlingType = js.native
    var String: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ResultHandlingType = js.native
  }
  
  /* static members */
  @js.native
  object RetrieveAction extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new RetrieveAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RetrieveAction = js.native
    /**
      * Creates and returns a new RetrieveAction instance in the SDK and on the server.
      * The new RetrieveAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivity): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RetrieveAction = js.native
  }
  
  /* static members */
  @js.native
  object RetrieveSource extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object RollbackAction extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new RollbackAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RollbackAction = js.native
    /**
      * Creates and returns a new RollbackAction instance in the SDK and on the server.
      * The new RollbackAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivity): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RollbackAction = js.native
  }
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates a new Rule unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.Rule = js.native
  }
  
  /* static members */
  @js.native
  object RuleCall extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new RuleCall instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RuleCall = js.native
    /**
      * Creates and returns a new RuleCall instance in the SDK and on the server.
      * The new RuleCall will be automatically stored in the 'ruleCall' property
      * of the parent RuleSplitCondition element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RuleSplitCondition): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RuleCall = js.native
  }
  
  /* static members */
  @js.native
  object RuleCallParameterMapping extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new RuleCallParameterMapping instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RuleCallParameterMapping = js.native
    /**
      * Creates and returns a new RuleCallParameterMapping instance in the SDK and on the server.
      * The new RuleCallParameterMapping will be automatically stored in the 'parameterMappings' property
      * of the parent RuleCall element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RuleCall): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RuleCallParameterMapping = js.native
  }
  
  /* static members */
  @js.native
  object RuleParameter extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object RuleSplitCondition extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new RuleSplitCondition instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RuleSplitCondition = js.native
    /**
      * Creates and returns a new RuleSplitCondition instance in the SDK and on the server.
      * The new RuleSplitCondition will be automatically stored in the 'splitCondition' property
      * of the parent ExclusiveSplit element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ExclusiveSplit): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RuleSplitCondition = js.native
  }
  
  /* static members */
  @js.native
  object SequenceFlow extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new SequenceFlow instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.SequenceFlow = js.native
    /**
      * Creates and returns a new SequenceFlow instance in the SDK and on the server.
      * The new SequenceFlow will be automatically stored in the 'flows' property
      * of the parent MicroflowBase element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowBase): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.SequenceFlow = js.native
  }
  
  /* static members */
  @js.native
  object ServerSideMicroflow extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object ShowHomePageAction extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ShowHomePageAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ShowHomePageAction = js.native
    /**
      * Creates and returns a new ShowHomePageAction instance in the SDK and on the server.
      * The new ShowHomePageAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivity): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ShowHomePageAction = js.native
  }
  
  /* static members */
  @js.native
  object ShowMessageAction extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ShowMessageAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ShowMessageAction = js.native
    /**
      * Creates and returns a new ShowMessageAction instance in the SDK and on the server.
      * The new ShowMessageAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivity): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ShowMessageAction = js.native
  }
  
  /* static members */
  @js.native
  object ShowMessageType extends js.Object {
    var Error: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ShowMessageType = js.native
    var Information: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ShowMessageType = js.native
    var Warning: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ShowMessageType = js.native
  }
  
  /* static members */
  @js.native
  object ShowPageAction extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ShowPageAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ShowPageAction = js.native
    /**
      * Creates and returns a new ShowPageAction instance in the SDK and on the server.
      * The new ShowPageAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivity): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ShowPageAction = js.native
  }
  
  /* static members */
  @js.native
  object SimpleRequestHandling extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new SimpleRequestHandling instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.SimpleRequestHandling = js.native
    /**
      * Creates and returns a new SimpleRequestHandling instance in the SDK and on the server.
      * The new SimpleRequestHandling will be automatically stored in the 'requestHandling' property
      * of the parent RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    def createInRestCallActionUnderRequestHandling(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RestCallAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.SimpleRequestHandling = js.native
    /**
      * Creates and returns a new SimpleRequestHandling instance in the SDK and on the server.
      * The new SimpleRequestHandling will be automatically stored in the 'requestBodyHandling' property
      * of the parent WebServiceCallAction element passed as argument.
      */
    def createInWebServiceCallActionUnderRequestBodyHandling(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceCallAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.SimpleRequestHandling = js.native
    /**
      * Creates and returns a new SimpleRequestHandling instance in the SDK and on the server.
      * The new SimpleRequestHandling will be automatically stored in the 'requestHeaderHandling' property
      * of the parent WebServiceCallAction element passed as argument.
      */
    def createInWebServiceCallActionUnderRequestHeaderHandling(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceCallAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.SimpleRequestHandling = js.native
  }
  
  /* static members */
  @js.native
  object Sort extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Sort instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.Sort = js.native
    /**
      * Creates and returns a new Sort instance in the SDK and on the server.
      * The new Sort will be automatically stored in the 'operation' property
      * of the parent ListOperationAction element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ListOperationAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.Sort = js.native
  }
  
  /* static members */
  @js.native
  object SortItem extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new SortItem instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.SortItem = js.native
    /**
      * Creates and returns a new SortItem instance in the SDK and on the server.
      * The new SortItem will be automatically stored in the 'items' property
      * of the parent SortItemList element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.SortItemList): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.SortItem = js.native
  }
  
  /* static members */
  @js.native
  object SortItemList extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new SortItemList instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.SortItemList = js.native
    /**
      * Creates and returns a new SortItemList instance in the SDK and on the server.
      * The new SortItemList will be automatically stored in the 'sortItemList' property
      * of the parent DatabaseRetrieveSource element passed as argument.
      */
    def createInDatabaseRetrieveSourceUnderSortItemList(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.DatabaseRetrieveSource): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.SortItemList = js.native
    /**
      * Creates and returns a new SortItemList instance in the SDK and on the server.
      * The new SortItemList will be automatically stored in the 'sortItemList' property
      * of the parent Sort element passed as argument.
      */
    def createInSortUnderSortItemList(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.Sort): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.SortItemList = js.native
  }
  
  /* static members */
  @js.native
  object SortOrderEnum extends js.Object {
    var Ascending: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.SortOrderEnum = js.native
    var Descending: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.SortOrderEnum = js.native
  }
  
  /* static members */
  @js.native
  object SplitCondition extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object StartEvent extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new StartEvent instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.StartEvent = js.native
    /**
      * Creates and returns a new StartEvent instance in the SDK and on the server.
      * The new StartEvent will be automatically stored in the 'objects' property
      * of the parent MicroflowObjectCollection element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowObjectCollection): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.StartEvent = js.native
  }
  
  /* static members */
  @js.native
  object StringTemplate extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new StringTemplate instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.StringTemplate = js.native
    /**
      * Creates and returns a new StringTemplate instance in the SDK and on the server.
      * The new StringTemplate will be automatically stored in the 'template' property
      * of the parent CustomRequestHandling element passed as argument.
      */
    def createInCustomRequestHandlingUnderTemplate(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRequestHandling): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.StringTemplate = js.native
    /**
      * Creates and returns a new StringTemplate instance in the SDK and on the server.
      * The new StringTemplate will be automatically stored in the 'customLocationTemplate' property
      * of the parent HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationTemplate(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.StringTemplate = js.native
    /**
      * Creates and returns a new StringTemplate instance in the SDK and on the server.
      * The new StringTemplate will be automatically stored in the 'messageTemplate' property
      * of the parent LogMessageAction element passed as argument.
      */
    def createInLogMessageActionUnderMessageTemplate(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.LogMessageAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.StringTemplate = js.native
  }
  
  /* static members */
  @js.native
  object Subtract extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Subtract instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.Subtract = js.native
    /**
      * Creates and returns a new Subtract instance in the SDK and on the server.
      * The new Subtract will be automatically stored in the 'operation' property
      * of the parent ListOperationAction element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ListOperationAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.Subtract = js.native
  }
  
  /* static members */
  @js.native
  object SynchronizeAction extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new SynchronizeAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.SynchronizeAction = js.native
    /**
      * Creates and returns a new SynchronizeAction instance in the SDK and on the server.
      * The new SynchronizeAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 and higher
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivity): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.SynchronizeAction = js.native
  }
  
  /* static members */
  @js.native
  object Tail extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Tail instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.Tail = js.native
    /**
      * Creates and returns a new Tail instance in the SDK and on the server.
      * The new Tail will be automatically stored in the 'operation' property
      * of the parent ListOperationAction element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ListOperationAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.Tail = js.native
  }
  
  /* static members */
  @js.native
  object TargetDocumentType extends js.Object {
    var DOC: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.TargetDocumentType = js.native
    var DOCX: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.TargetDocumentType = js.native
    var HTML: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.TargetDocumentType = js.native
    var ODT: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.TargetDocumentType = js.native
    var PDF: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.TargetDocumentType = js.native
    var RTF: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.TargetDocumentType = js.native
  }
  
  /* static members */
  @js.native
  object Template extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object TemplateArgument extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new TemplateArgument instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.TemplateArgument = js.native
    /**
      * Creates and returns a new TemplateArgument instance in the SDK and on the server.
      * The new TemplateArgument will be automatically stored in the 'arguments' property
      * of the parent Template element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.Template): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.TemplateArgument = js.native
  }
  
  /* static members */
  @js.native
  object TextTemplate extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new TextTemplate instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.TextTemplate = js.native
    /**
      * Creates and returns a new TextTemplate instance in the SDK and on the server.
      * The new TextTemplate will be automatically stored in the 'template' property
      * of the parent ShowMessageAction element passed as argument.
      */
    def createInShowMessageActionUnderTemplate(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ShowMessageAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.TextTemplate = js.native
    /**
      * Creates and returns a new TextTemplate instance in the SDK and on the server.
      * The new TextTemplate will be automatically stored in the 'feedbackTemplate' property
      * of the parent ValidationFeedbackAction element passed as argument.
      */
    def createInValidationFeedbackActionUnderFeedbackTemplate(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ValidationFeedbackAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.TextTemplate = js.native
  }
  
  /* static members */
  @js.native
  object Union extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Union instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.Union = js.native
    /**
      * Creates and returns a new Union instance in the SDK and on the server.
      * The new Union will be automatically stored in the 'operation' property
      * of the parent ListOperationAction element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ListOperationAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.Union = js.native
  }
  
  /* static members */
  @js.native
  object ValidationFeedbackAction extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ValidationFeedbackAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ValidationFeedbackAction = js.native
    /**
      * Creates and returns a new ValidationFeedbackAction instance in the SDK and on the server.
      * The new ValidationFeedbackAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivity): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ValidationFeedbackAction = js.native
  }
  
  /* static members */
  @js.native
  object VariableExport extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new VariableExport instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.VariableExport = js.native
    /**
      * Creates and returns a new VariableExport instance in the SDK and on the server.
      * The new VariableExport will be automatically stored in the 'outputMethod' property
      * of the parent ExportXmlAction element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ExportXmlAction): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.VariableExport = js.native
  }
  
  /* static members */
  @js.native
  object WebServiceCallAction extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new WebServiceCallAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceCallAction = js.native
    /**
      * Creates and returns a new WebServiceCallAction instance in the SDK and on the server.
      * The new WebServiceCallAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ActionActivity): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceCallAction = js.native
  }
  
  /* static members */
  @js.native
  object WebServiceOperationAdvancedParameterMapping extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new WebServiceOperationAdvancedParameterMapping instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceOperationAdvancedParameterMapping = js.native
    /**
      * Creates and returns a new WebServiceOperationAdvancedParameterMapping instance in the SDK and on the server.
      * The new WebServiceOperationAdvancedParameterMapping will be automatically stored in the 'parameterMappings' property
      * of the parent AdvancedRequestHandling element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.AdvancedRequestHandling): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceOperationAdvancedParameterMapping = js.native
  }
  
  /* static members */
  @js.native
  object WebServiceOperationParameterMapping extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object WebServiceOperationSimpleParameterMapping extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMicroflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new WebServiceOperationSimpleParameterMapping instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceOperationSimpleParameterMapping = js.native
    /**
      * Creates and returns a new WebServiceOperationSimpleParameterMapping instance in the SDK and on the server.
      * The new WebServiceOperationSimpleParameterMapping will be automatically stored in the 'parameterMappings' property
      * of the parent SimpleRequestHandling element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.SimpleRequestHandling): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceOperationSimpleParameterMapping = js.native
  }
  
}

