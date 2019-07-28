package typings.mendixmodelsdk.distGenMicroflowsMod

import typings.mendixmodelsdk.distCommonMod.commonNs.IPoint
import typings.mendixmodelsdk.distCommonMod.commonNs.ISize
import typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.IAppServiceAction
import typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.IAppServiceActionParameter
import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.IMicroflowActionInfo
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.MicroflowActionInfo
import typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.DataType
import typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.IDataType
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.IDocumentTemplate
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AttributeRef
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IAssociationBase
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IAttribute
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IEntity
import typings.mendixmodelsdk.distGenExportmappingsMod.exportmappingsNs.IExportMapping
import typings.mendixmodelsdk.distGenExpressionsMod.expressionsNs.Expression
import typings.mendixmodelsdk.distGenImportmappingsMod.importmappingsNs.IImportMapping
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IJavaAction
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IJavaActionParameter
import typings.mendixmodelsdk.distGenJavascriptactionsMod.javascriptactionsNs.IJavaScriptAction
import typings.mendixmodelsdk.distGenJavascriptactionsMod.javascriptactionsNs.IJavaScriptActionParameter
import typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.ObjectHandlingBackupEnum
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ActionActivity
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ActionActivityColor
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.Activity
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.AdvancedRequestHandling
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.AggregateFunctionEnum
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.AggregateListAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.Annotation
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.AnnotationFlow
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.AppServiceCallAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.AppServiceCallParameterMapping
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.AssociationRetrieveSource
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.BasicCodeActionParameterValue
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.BasicJavaActionParameterValue
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.BinaryListOperation
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.BinaryRequestHandling
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.BreakEvent
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.CaseValue
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.CastAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ChangeActionItemType
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ChangeListAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ChangeListActionType
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ChangeMembersAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ChangeObjectAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ChangeVariableAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.CloseFormAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.CodeActionParameterValue
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.CommitAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.CommitEnum
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ConstantRange
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.Contains
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ContentType
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ContinueEvent
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.CreateListAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.CreateObjectAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.CreateVariableAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.CustomRange
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.CustomRequestHandling
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.DatabaseRetrieveSource
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.DeleteAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.DocumentTemplateParameterMapping
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.DownloadFileAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.EndEvent
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.EntityTypeCodeActionParameterValue
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.EntityTypeJavaActionParameterValue
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.EnumerationCase
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ErrorEvent
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ErrorHandlingType
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ErrorResultHandlingType
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ExclusiveMerge
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ExclusiveSplit
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ExportMappingJavaActionParameterValue
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ExportMappingParameterValue
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ExportXmlAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ExpressionSplitCondition
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.FileDocumentExport
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.Filter
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.Find
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.Flow
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.FormDataPart
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.FormDataRequestHandling
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.Head
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.HttpConfiguration
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.HttpHeaderEntry
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.HttpMethod
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.IMicroflow
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.IMicroflowBase
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.IMicroflowParameter
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.IMicroflowParameterBase
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.IRule
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.IRuleParameter
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.IServerSideMicroflow
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ImportMappingCall
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ImportMappingJavaActionParameterValue
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ImportMappingParameterValue
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ImportXmlAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.InheritanceCase
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.InheritanceSplit
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.InspectAttribute
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.Intersect
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.JavaActionCallAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.JavaActionParameterMapping
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.JavaActionParameterValue
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.JavaScriptActionCallAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.JavaScriptActionParameterMapping
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.LanguageSettingType
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ListEquals
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ListOperation
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ListOperationAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.LogLevel
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.LogMessageAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.LoopedActivity
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.MappingRequestHandling
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.MemberChange
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.Microflow
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.MicroflowAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.MicroflowBase
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.MicroflowCall
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.MicroflowCallAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.MicroflowCallParameterMapping
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.MicroflowJavaActionParameterValue
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.MicroflowObject
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.MicroflowObjectCollection
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.MicroflowParameterBase
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.MicroflowParameterObject
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.MicroflowParameterValue
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.Nanoflow
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.NanoflowParameter
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.NoCase
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.NullValueOption
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.OutputMethod
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ProxyConfiguration
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.Range
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.RequestHandling
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.RequestHandlingType
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.RequestProxyType
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.RestCallAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ResultHandling
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ResultHandlingType
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.RetrieveAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.RetrieveSource
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.RollbackAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.Rule
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.RuleCall
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.RuleCallParameterMapping
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.RuleSplitCondition
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.SequenceFlow
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ServerSideMicroflow
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ShowHomePageAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ShowMessageAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ShowMessageType
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ShowPageAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.SimpleRequestHandling
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.Sort
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.SortItem
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.SortItemList
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.SortOrderEnum
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.SplitCondition
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.StartEvent
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.StringTemplate
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.Subtract
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.SynchronizeAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.Tail
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.TargetDocumentType
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.Template
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.TemplateArgument
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.TextTemplate
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.Union
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ValidationFeedbackAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.VariableExport
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.WebServiceCallAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.WebServiceOperationAdvancedParameterMapping
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.WebServiceOperationParameterMapping
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.WebServiceOperationSimpleParameterMapping
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.PageSettings
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.Document
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IDocument
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IFolderBase
import typings.mendixmodelsdk.distGenRestMod.restNs.ConsumedODataService
import typings.mendixmodelsdk.distGenSecurityMod.securityNs.IModuleRole
import typings.mendixmodelsdk.distGenTextsMod.textsNs.Text
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.IImportedWebService
import typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.distSdkInternalElementsMod.IElement
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
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
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var action: MicroflowAction | Null = js.native
    var autoGenerateCaption: Boolean = js.native
    var backgroundColor: ActionActivityColor = js.native
    var caption: String = js.native
    var documentation: String = js.native
  }
  
  @js.native
  class ActionActivityColor () extends AbstractEnum
  
  @js.native
  abstract class Activity protected () extends MicroflowObject {
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
  class AdvancedRequestHandling protected () extends RequestHandling {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * In version 6.7.0: introduced
      */
    var nullValueOption: NullValueOption = js.native
    val parameterMappings: IList[WebServiceOperationAdvancedParameterMapping] = js.native
  }
  
  @js.native
  class AggregateFunctionEnum () extends AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/aggregate-list relevant section in reference guide}
    */
  @js.native
  class AggregateListAction protected () extends MicroflowAction {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var aggregateFunction: AggregateFunctionEnum = js.native
    var attribute: IAttribute | Null = js.native
    val attributeQualifiedName: String | Null = js.native
    var inputListVariableName: String = js.native
    var outputVariableName: String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/annotation relevant section in reference guide}
    */
  @js.native
  class Annotation protected () extends MicroflowObject {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var caption: String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/annotation-flow relevant section in reference guide}
    */
  @js.native
  class AnnotationFlow protected () extends Flow {
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
  class AppServiceCallAction protected () extends MicroflowAction {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var appServiceAction: IAppServiceAction | Null = js.native
    val appServiceActionQualifiedName: String | Null = js.native
    var outputVariableName: String = js.native
    val parameterMappings: IList[AppServiceCallParameterMapping] = js.native
    var useVariable: Boolean = js.native
  }
  
  @js.native
  class AppServiceCallParameterMapping protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var argument: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var argumentModel: Expression = js.native
    val containerAsAppServiceCallAction: AppServiceCallAction = js.native
    @JSName("model")
    var model_AppServiceCallParameterMapping: IModel = js.native
    var parameter: IAppServiceActionParameter | Null = js.native
    val parameterQualifiedName: String | Null = js.native
  }
  
  @js.native
  class AssociationRetrieveSource protected () extends RetrieveSource {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var association: IAssociationBase | Null = js.native
    val associationQualifiedName: String | Null = js.native
    var startVariableName: String = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  @js.native
  class BasicCodeActionParameterValue protected () extends CodeActionParameterValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var argument: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    var argumentModel: Expression = js.native
  }
  
  /**
    * In version 7.21.0: deleted
    * In version 6.7.0: introduced
    */
  @js.native
  class BasicJavaActionParameterValue protected () extends JavaActionParameterValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var argument: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var argumentModel: Expression = js.native
  }
  
  @js.native
  abstract class BinaryListOperation protected () extends ListOperation {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var secondListOrObjectVariableName: String = js.native
  }
  
  /**
    * In version 6.9.0: introduced
    */
  @js.native
  class BinaryRequestHandling protected () extends RequestHandling {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var expression: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var expressionModel: Expression = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/break-event relevant section in reference guide}
    */
  @js.native
  class BreakEvent protected () extends MicroflowObject {
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
  abstract class CaseValue protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsSequenceFlow: SequenceFlow = js.native
    @JSName("model")
    var model_CaseValue: IModel = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/cast-object relevant section in reference guide}
    */
  @js.native
  class CastAction protected () extends MicroflowAction {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var outputVariableName: String = js.native
  }
  
  @js.native
  class ChangeActionItemType () extends AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/change-list relevant section in reference guide}
    */
  @js.native
  class ChangeListAction protected () extends MicroflowAction {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var changeVariableName: String = js.native
    var `type`: ChangeListActionType = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var value: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var valueModel: Expression = js.native
  }
  
  @js.native
  class ChangeListActionType () extends AbstractEnum
  
  @js.native
  abstract class ChangeMembersAction protected () extends MicroflowAction {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var commit: CommitEnum = js.native
    val items: IList[MemberChange] = js.native
    var refreshInClient: Boolean = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/change-object relevant section in reference guide}
    */
  @js.native
  class ChangeObjectAction protected () extends ChangeMembersAction {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var changeVariableName: String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/change-variable relevant section in reference guide}
    */
  @js.native
  class ChangeVariableAction protected () extends MicroflowAction {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var changeVariableName: String = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var value: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var valueModel: Expression = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/close-form relevant section in reference guide}
    */
  @js.native
  class CloseFormAction protected () extends MicroflowAction {
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
    * In version 7.21.0: introduced
    */
  @js.native
  abstract class CodeActionParameterValue protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsJavaActionParameterMapping: JavaActionParameterMapping = js.native
    val containerAsJavaScriptActionParameterMapping: JavaScriptActionParameterMapping = js.native
    @JSName("model")
    var model_CodeActionParameterValue: IModel = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/committing-objects relevant section in reference guide}
    */
  @js.native
  class CommitAction protected () extends MicroflowAction {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var commitVariableName: String = js.native
    var refreshInClient: Boolean = js.native
    var withEvents: Boolean = js.native
  }
  
  @js.native
  class CommitEnum () extends AbstractEnum
  
  @js.native
  class ConstantRange protected () extends Range {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var singleObject: Boolean = js.native
  }
  
  @js.native
  class Contains protected () extends BinaryListOperation {
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
  class ContentType () extends AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/continue-event relevant section in reference guide}
    */
  @js.native
  class ContinueEvent protected () extends MicroflowObject {
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
    * See: {@link https://docs.mendix.com/refguide7/create-list relevant section in reference guide}
    */
  @js.native
  class CreateListAction protected () extends MicroflowAction {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var entity: IEntity | Null = js.native
    val entityQualifiedName: String | Null = js.native
    var outputVariableName: String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/create-object relevant section in reference guide}
    */
  @js.native
  class CreateObjectAction protected () extends ChangeMembersAction {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var entity: IEntity | Null = js.native
    val entityQualifiedName: String | Null = js.native
    var outputVariableName: String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/create-variable relevant section in reference guide}
    */
  @js.native
  class CreateVariableAction protected () extends MicroflowAction {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var initialValue: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var initialValueModel: Expression = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 7.9.0: deleted
      */
    var variableDataType: String = js.native
    var variableName: String = js.native
    /**
      * In version 7.9.0: introduced
      */
    var variableType: DataType = js.native
  }
  
  @js.native
  class CustomRange protected () extends Range {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var limitExpression: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var limitExpressionModel: Expression = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var offsetExpression: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var offsetExpressionModel: Expression = js.native
  }
  
  @js.native
  class CustomRequestHandling protected () extends RequestHandling {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var template: StringTemplate = js.native
  }
  
  @js.native
  class DatabaseRetrieveSource protected () extends RetrieveSource {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var entity: IEntity | Null = js.native
    val entityQualifiedName: String | Null = js.native
    var range: Range = js.native
    var sortItemList: SortItemList = js.native
    /**
      * The value of this property is conceptually of type xPathConstraints.XPathConstraint.
      */
    var xPathConstraint: String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/deleting-objects relevant section in reference guide}
    */
  @js.native
  class DeleteAction protected () extends MicroflowAction {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var deleteVariableName: String = js.native
    var refreshInClient: Boolean = js.native
  }
  
  @js.native
  class DocumentTemplateParameterMapping protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var argument: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var argumentModel: Expression = js.native
    val containerAsGenerateDocumentAction: GenerateDocumentAction = js.native
    @JSName("model")
    var model_DocumentTemplateParameterMapping: IModel = js.native
    var widgetName: String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/download-file relevant section in reference guide}
    */
  @js.native
  class DownloadFileAction protected () extends MicroflowAction {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var fileDocumentVariableName: String = js.native
    var showFileInBrowser: Boolean = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/end-event relevant section in reference guide}
    */
  @js.native
  class EndEvent protected () extends MicroflowObject {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var documentation: String = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var returnValue: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var returnValueModel: Expression = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  @js.native
  class EntityTypeCodeActionParameterValue protected () extends CodeActionParameterValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var entity: IEntity | Null = js.native
    val entityQualifiedName: String | Null = js.native
  }
  
  /**
    * In version 7.21.0: deleted
    * In version 6.8.0: introduced
    */
  @js.native
  class EntityTypeJavaActionParameterValue protected () extends JavaActionParameterValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var entity: IEntity | Null = js.native
    val entityQualifiedName: String | Null = js.native
  }
  
  @js.native
  class EnumerationCase protected () extends CaseValue {
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
    * See: {@link https://docs.mendix.com/refguide7/error-event relevant section in reference guide}
    */
  @js.native
  class ErrorEvent protected () extends MicroflowObject {
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
  class ErrorHandlingType () extends AbstractEnum
  
  @js.native
  class ErrorResultHandlingType () extends AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/merge relevant section in reference guide}
    */
  @js.native
  class ExclusiveMerge protected () extends MicroflowObject {
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
    * See: {@link https://docs.mendix.com/refguide7/exclusive-split relevant section in reference guide}
    */
  @js.native
  class ExclusiveSplit protected () extends MicroflowObject {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var caption: String = js.native
    var documentation: String = js.native
    var errorHandlingType: ErrorHandlingType = js.native
    var splitCondition: SplitCondition = js.native
  }
  
  /**
    * In version 7.21.0: deleted
    * In version 7.2.0: introduced
    */
  @js.native
  class ExportMappingJavaActionParameterValue protected () extends JavaActionParameterValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var exportMapping: IExportMapping | Null = js.native
    val exportMappingQualifiedName: String | Null = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  @js.native
  class ExportMappingParameterValue protected () extends CodeActionParameterValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var exportMapping: IExportMapping | Null = js.native
    val exportMappingQualifiedName: String | Null = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/export-mapping-action relevant section in reference guide}
    */
  @js.native
  class ExportXmlAction protected () extends MicroflowAction {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var isValidationRequired: Boolean = js.native
    /**
      * In version 7.6.0: deleted
      */
    var mapping: IExportMapping | Null = js.native
    /**
      * In version 7.6.0: deleted
      */
    var mappingArgumentVariableName: String = js.native
    val mappingQualifiedName: String | Null = js.native
    var outputMethod: OutputMethod = js.native
    /**
      * In version 7.6.0: introduced
      */
    var resultHandling: MappingRequestHandling = js.native
  }
  
  @js.native
  class ExpressionSplitCondition protected () extends SplitCondition {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var expression: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var expressionModel: Expression = js.native
  }
  
  @js.native
  class FileDocumentExport protected () extends OutputMethod {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var targetDocumentVariableName: String = js.native
  }
  
  @js.native
  class Filter protected () extends InspectAttribute {
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
  class Find protected () extends InspectAttribute {
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
  abstract class Flow protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsMicroflowBase: MicroflowBase = js.native
    var destination: MicroflowObject = js.native
    var destinationBezierVector: ISize = js.native
    var destinationConnectionIndex: Double = js.native
    @JSName("model")
    var model_Flow: IModel = js.native
    var origin: MicroflowObject = js.native
    var originBezierVector: ISize = js.native
    var originConnectionIndex: Double = js.native
  }
  
  /**
    * In version 8.0.0: introduced
    */
  @js.native
  class FormDataPart protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsFormDataRequestHandling: FormDataRequestHandling = js.native
    var key: String = js.native
    @JSName("model")
    var model_FormDataPart: IModel = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var value: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    var valueModel: Expression = js.native
  }
  
  /**
    * In version 8.0.0: introduced
    */
  @js.native
  class FormDataRequestHandling protected () extends RequestHandling {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val parts: IList[FormDataPart] = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/generate-document relevant section in reference guide}
    */
  @js.native
  class GenerateDocumentAction protected () extends MicroflowAction {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var documentTemplate: IDocumentTemplate | Null = js.native
    val documentTemplateQualifiedName: String | Null = js.native
    var documentType: TargetDocumentType = js.native
    var fileVariableName: String = js.native
    var languageSetting: LanguageSettingType = js.native
    var languageVariableName: String = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var marginBottomInInch: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var marginBottomInInchModel: Expression = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var marginLeftInInch: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var marginLeftInInchModel: Expression = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var marginRightInInch: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var marginRightInInchModel: Expression = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var marginTopInInch: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var marginTopInInchModel: Expression = js.native
    var overrideBottomMargin: Boolean = js.native
    var overrideLeftMargin: Boolean = js.native
    var overrideRightMargin: Boolean = js.native
    var overrideTopMargin: Boolean = js.native
    val parameterMappings: IList[DocumentTemplateParameterMapping] = js.native
  }
  
  @js.native
  class Head protected () extends ListOperation {
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
  class HttpConfiguration protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var authenticationPassword: String = js.native
    val containerAsConsumedODataService: ConsumedODataService = js.native
    val containerAsRestCallAction: RestCallAction = js.native
    val containerAsWebServiceCallAction: WebServiceCallAction = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var customLocation: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var customLocationModel: Expression = js.native
    /**
      * In version 6.6.0: introduced
      */
    var customLocationTemplate: StringTemplate | Null = js.native
    val headerEntries: IList[HttpHeaderEntry] = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var httpAuthenticationUserName: String = js.native
    /**
      * In version 7.7.0: deleted
      * In version 6.6.0: introduced
      */
    var httpMethod: HttpMethod = js.native
    @JSName("model")
    var model_HttpConfiguration: IModel = js.native
    /**
      * In version 7.7.0: introduced
      */
    var newHttpMethod: typings.mendixmodelsdk.distGenServicesMod.servicesNs.HttpMethod = js.native
    var overrideLocation: Boolean = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var password: Expression = js.native
    var useAuthentication: Boolean = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var username: Expression = js.native
  }
  
  @js.native
  class HttpHeaderEntry protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsHttpConfiguration: HttpConfiguration = js.native
    var key: String = js.native
    @JSName("model")
    var model_HttpHeaderEntry: IModel = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var value: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var valueModel: Expression = js.native
  }
  
  @js.native
  class HttpMethod () extends AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/microflows relevant section in reference guide}
    */
  @js.native
  trait IMicroflow extends IServerSideMicroflow {
    /**
      * In version 7.23.0: added public
      */
    val allowedModuleRoles: IList[IModuleRole] = js.native
    val allowedModuleRolesQualifiedNames: js.Array[String] = js.native
    /**
      * In version 8.0.0: introduced
      */
    val microflowActionInfo: IMicroflowActionInfo | Null = js.native
  }
  
  @js.native
  trait IMicroflowBase extends IDocument {
    /**
      * This property is required and cannot be set to null.
      *
      * In version 7.9.0: introduced
      */
    val microflowReturnType: IDataType = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 7.9.0: deleted
      */
    val returnType: String | Null = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/parameter relevant section in reference guide}
    */
  @js.native
  trait IMicroflowParameter extends IMicroflowParameterBase
  
  @js.native
  trait IMicroflowParameterBase
    extends IElement
       with IByNameReferrable {
    val containerAsMicroflow: IMicroflow = js.native
    val containerAsRule: IRule = js.native
    @JSName("model")
    val model_IMicroflowParameterBase: IModel = js.native
    val name: String = js.native
    /**
      * This property is required and cannot be set to null.
      *
      * In version 7.9.0: introduced
      */
    val parameterType: IDataType = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 7.9.0: deleted
      */
    val `type`: String | Null = js.native
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
    val allowedModuleRoles: IList[IModuleRole] = js.native
    val allowedModuleRolesQualifiedNames: js.Array[String] = js.native
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
  class ImportMappingCall protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
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
    var forceSingleOccurrence: Boolean = js.native
    var mapping: IImportMapping | Null = js.native
    var mappingArgumentVariableName: String = js.native
    val mappingQualifiedName: String | Null = js.native
    @JSName("model")
    var model_ImportMappingCall: IModel = js.native
    /**
      * In version 7.17.0: introduced
      */
    var objectHandlingBackup: ObjectHandlingBackupEnum = js.native
    var range: Range = js.native
  }
  
  /**
    * In version 7.21.0: deleted
    * In version 7.2.0: introduced
    */
  @js.native
  class ImportMappingJavaActionParameterValue protected () extends JavaActionParameterValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var importMapping: IImportMapping | Null = js.native
    val importMappingQualifiedName: String | Null = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  @js.native
  class ImportMappingParameterValue protected () extends CodeActionParameterValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var importMapping: IImportMapping | Null = js.native
    val importMappingQualifiedName: String | Null = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/import-mapping-action relevant section in reference guide}
    */
  @js.native
  class ImportXmlAction protected () extends MicroflowAction {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var isValidationRequired: Boolean = js.native
    var resultHandling: ResultHandling = js.native
    var xmlDocumentVariableName: String = js.native
  }
  
  @js.native
  class InheritanceCase protected () extends CaseValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var value: IEntity | Null = js.native
    val valueQualifiedName: String | Null = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/inheritance-split relevant section in reference guide}
    */
  @js.native
  class InheritanceSplit protected () extends MicroflowObject {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var caption: String = js.native
    var documentation: String = js.native
    var splitVariableName: String = js.native
  }
  
  @js.native
  abstract class InspectAttribute protected () extends ListOperation {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * In version 7.0.0: introduced
      */
    var association: IAssociationBase | Null = js.native
    val associationQualifiedName: String | Null = js.native
    var attribute: IAttribute | Null = js.native
    val attributeQualifiedName: String | Null = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var expression: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var expressionModel: Expression = js.native
  }
  
  @js.native
  class Intersect protected () extends BinaryListOperation {
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
    * See: {@link https://docs.mendix.com/refguide7/java-action-call relevant section in reference guide}
    */
  @js.native
  class JavaActionCallAction protected () extends MicroflowAction {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var javaAction: IJavaAction | Null = js.native
    val javaActionQualifiedName: String | Null = js.native
    var outputVariableName: String = js.native
    val parameterMappings: IList[JavaActionParameterMapping] = js.native
    /**
      * In version 7.13.0: introduced
      */
    var useReturnVariable: Boolean = js.native
  }
  
  @js.native
  class JavaActionParameterMapping protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      *
      * In version 6.7.0: deleted
      */
    var argument: String = js.native
    val containerAsJavaActionCallAction: JavaActionCallAction = js.native
    @JSName("model")
    var model_JavaActionParameterMapping: IModel = js.native
    var parameter: IJavaActionParameter = js.native
    val parameterQualifiedName: String = js.native
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
  abstract class JavaActionParameterValue protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsJavaActionParameterMapping: JavaActionParameterMapping = js.native
    @JSName("model")
    var model_JavaActionParameterValue: IModel = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.21.0: introduced
    */
  @js.native
  class JavaScriptActionCallAction protected () extends MicroflowAction {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var javaScriptAction: IJavaScriptAction | Null = js.native
    val javaScriptActionQualifiedName: String | Null = js.native
    var outputVariableName: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    val parameterMappings: IList[JavaScriptActionParameterMapping] = js.native
    var useReturnVariable: Boolean = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.21.0: introduced
    */
  @js.native
  class JavaScriptActionParameterMapping protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsJavaScriptActionCallAction: JavaScriptActionCallAction = js.native
    @JSName("model")
    var model_JavaScriptActionParameterMapping: IModel = js.native
    var parameter: IJavaScriptActionParameter = js.native
    val parameterQualifiedName: String = js.native
    var parameterValue: CodeActionParameterValue = js.native
  }
  
  @js.native
  class LanguageSettingType () extends AbstractEnum
  
  @js.native
  class ListEquals protected () extends BinaryListOperation {
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
  abstract class ListOperation protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsListOperationAction: ListOperationAction = js.native
    var listVariableName: String = js.native
    @JSName("model")
    var model_ListOperation: IModel = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/list-operation relevant section in reference guide}
    */
  @js.native
  class ListOperationAction protected () extends MicroflowAction {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var operation: ListOperation | Null = js.native
    var outputVariableName: String = js.native
  }
  
  @js.native
  class LogLevel () extends AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/log-message relevant section in reference guide}
    */
  @js.native
  class LogMessageAction protected () extends MicroflowAction {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var includeLatestStackTrace: Boolean = js.native
    var level: LogLevel = js.native
    var messageTemplate: StringTemplate = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var node: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var nodeModel: Expression = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/loop relevant section in reference guide}
    */
  @js.native
  class LoopedActivity protected () extends Activity {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var documentation: String = js.native
    var errorHandlingType: ErrorHandlingType = js.native
    var iteratedListVariableName: String = js.native
    var loopVariableName: String = js.native
    var objectCollection: MicroflowObjectCollection = js.native
  }
  
  @js.native
  class MappingRequestHandling protected () extends RequestHandling {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * In version 7.6.0: introduced
      */
    var contentType: ContentType = js.native
    var mapping: IExportMapping | Null = js.native
    var mappingArgumentVariableName: String = js.native
    val mappingQualifiedName: String | Null = js.native
  }
  
  @js.native
  class MemberChange protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var association: IAssociationBase | Null = js.native
    val associationQualifiedName: String | Null = js.native
    var attribute: IAttribute | Null = js.native
    val attributeQualifiedName: String | Null = js.native
    val containerAsChangeMembersAction: ChangeMembersAction = js.native
    @JSName("model")
    var model_MemberChange: IModel = js.native
    var `type`: ChangeActionItemType = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var value: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var valueModel: Expression = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/microflows relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.IMicroflow because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined allowedModuleRoles, allowedModuleRolesQualifiedNames, microflowActionInfo */ @js.native
  class Microflow protected () extends ServerSideMicroflow {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
    var allowConcurrentExecution: Boolean = js.native
    /**
      * In version 7.23.0: added public
      */
    val allowedModuleRoles: IList[IModuleRole] = js.native
    val allowedModuleRolesQualifiedNames: js.Array[String] = js.native
    var concurrencyErrorMessage: Text = js.native
    var concurrencyErrorMicroflow: IMicroflow | Null = js.native
    val concurrencyErrorMicroflowQualifiedName: String | Null = js.native
    /**
      * In version 8.0.0: introduced
      */
    var microflowActionInfo: IMicroflowActionInfo | MicroflowActionInfo | Null = js.native
  }
  
  @js.native
  abstract class MicroflowAction protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsActionActivity: ActionActivity = js.native
    var errorHandlingType: ErrorHandlingType = js.native
    @JSName("model")
    var model_MicroflowAction: IModel = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.IMicroflowBase because var conflicts: id, isLoaded, model, name, structureTypeName, unit. Inlined returnType, microflowReturnType */ @js.native
  abstract class MicroflowBase protected () extends Document {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
    val flows: IList[Flow] = js.native
    var markAsUsed: Boolean = js.native
    /**
      * In version 7.9.0: introduced
      */
    var microflowReturnType: DataType | IDataType = js.native
    var objectCollection: MicroflowObjectCollection = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 7.9.0: deleted
      */
    var returnType: Null | String = js.native
  }
  
  @js.native
  class MicroflowCall protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsMicroflowCallAction: MicroflowCallAction = js.native
    var microflow: IMicroflow | Null = js.native
    val microflowQualifiedName: String | Null = js.native
    @JSName("model")
    var model_MicroflowCall: IModel = js.native
    val parameterMappings: IList[MicroflowCallParameterMapping] = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/microflow-call relevant section in reference guide}
    */
  @js.native
  class MicroflowCallAction protected () extends MicroflowAction {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var microflowCall: MicroflowCall = js.native
    var outputVariableName: String = js.native
    var useReturnVariable: Boolean = js.native
  }
  
  @js.native
  class MicroflowCallParameterMapping protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var argument: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var argumentModel: Expression = js.native
    val containerAsMicroflowCall: MicroflowCall = js.native
    @JSName("model")
    var model_MicroflowCallParameterMapping: IModel = js.native
    var parameter: IMicroflowParameter = js.native
    val parameterQualifiedName: String = js.native
  }
  
  /**
    * In version 7.21.0: deleted
    * In version 6.9.0: introduced
    */
  @js.native
  class MicroflowJavaActionParameterValue protected () extends JavaActionParameterValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var microflow: IMicroflow | Null = js.native
    val microflowQualifiedName: String | Null = js.native
  }
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Microflows`.
    */
  @js.native
  abstract class MicroflowObject protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsMicroflowObjectCollection: MicroflowObjectCollection = js.native
    @JSName("model")
    var model_MicroflowObject: IModel = js.native
    var relativeMiddlePoint: IPoint = js.native
    var size: ISize = js.native
  }
  
  @js.native
  class MicroflowObjectCollection protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsLoopedActivity: LoopedActivity = js.native
    val containerAsMicroflowBase: MicroflowBase = js.native
    @JSName("model")
    var model_MicroflowObjectCollection: IModel = js.native
    val objects: IList[MicroflowObject] = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/parameter relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.IMicroflowParameter because var conflicts: id, isLoaded, model, name, parameterType, structureTypeName, `type`, unit. Inlined  */ @js.native
  class MicroflowParameter protected () extends MicroflowParameterBase {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsMicroflow")
    val containerAsMicroflow_MicroflowParameter: Microflow = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.IMicroflowParameterBase because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsMicroflow, containerAsRule, name, `type`, parameterType */ @js.native
  abstract class MicroflowParameterBase protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsMicroflow: IMicroflow | Microflow = js.native
    val containerAsRule: IRule | Rule = js.native
    @JSName("model")
    var model_MicroflowParameterBase: IModel = js.native
    var name: String = js.native
    /**
      * In version 7.9.0: introduced
      */
    var parameterType: DataType | IDataType = js.native
    val qualifiedName: String | Null = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 7.9.0: deleted
      */
    var `type`: Null | String = js.native
  }
  
  @js.native
  class MicroflowParameterObject protected () extends MicroflowObject {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var documentation: String = js.native
    var name: String = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 7.9.0: deleted
      */
    var `type`: String = js.native
    /**
      * In version 7.9.0: introduced
      */
    var variableType: DataType = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  @js.native
  class MicroflowParameterValue protected () extends CodeActionParameterValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var microflow: IMicroflow | Null = js.native
    val microflowQualifiedName: String | Null = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/nanoflows relevant section in reference guide}
    *
    * In version 7.12.0: removed experimental
    * In version 7.10.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.INanoflow because var conflicts: id, isLoaded, microflowReturnType, model, returnType, structureTypeName, unit. Inlined allowedModuleRoles, allowedModuleRolesQualifiedNames */ @js.native
  class Nanoflow protected () extends MicroflowBase {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
    /**
      * In version 7.23.0: added public
      */
    val allowedModuleRoles: IList[IModuleRole] = js.native
    val allowedModuleRolesQualifiedNames: js.Array[String] = js.native
  }
  
  /**
    * In version 7.19.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.INanoflowParameter because var conflicts: id, isLoaded, model, name, parameterType, structureTypeName, `type`, unit. Inlined  */ @js.native
  class NanoflowParameter protected () extends MicroflowParameterBase {
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
  class NoCase protected () extends CaseValue {
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
  class NullValueOption () extends AbstractEnum
  
  @js.native
  abstract class OutputMethod protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsExportXmlAction: ExportXmlAction = js.native
    @JSName("model")
    var model_OutputMethod: IModel = js.native
  }
  
  /**
    * In version 7.15.0: introduced
    */
  @js.native
  class ProxyConfiguration protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsRestCallAction: RestCallAction = js.native
    val containerAsWebServiceCallAction: WebServiceCallAction = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var hostExpression: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    var hostExpressionModel: Expression | Null = js.native
    @JSName("model")
    var model_ProxyConfiguration: IModel = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var passwordExpression: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    var passwordExpressionModel: Expression | Null = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var portExpression: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    var portExpressionModel: Expression | Null = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var useConfigurationExpression: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    var useConfigurationExpressionModel: Expression | Null = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var usernameExpression: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    var usernameExpressionModel: Expression | Null = js.native
  }
  
  @js.native
  abstract class Range protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsDatabaseRetrieveSource: DatabaseRetrieveSource = js.native
    val containerAsImportMappingCall: ImportMappingCall = js.native
    @JSName("model")
    var model_Range: IModel = js.native
  }
  
  @js.native
  abstract class RequestHandling protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsExportXmlAction: ExportXmlAction = js.native
    val containerAsRestCallAction: RestCallAction = js.native
    val containerAsWebServiceCallAction: WebServiceCallAction = js.native
    @JSName("model")
    var model_RequestHandling: IModel = js.native
  }
  
  @js.native
  class RequestHandlingType () extends AbstractEnum
  
  @js.native
  class RequestProxyType () extends AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/call-rest-action relevant section in reference guide}
    *
    * In version 6.6.0: introduced
    */
  @js.native
  class RestCallAction protected () extends MicroflowAction {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * In version 7.0.2: introduced
      */
    var errorResultHandlingType: ErrorResultHandlingType = js.native
    var httpConfiguration: HttpConfiguration = js.native
    /**
      * In version 7.15.0: introduced
      */
    var proxyConfiguration: ProxyConfiguration | Null = js.native
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
    var timeOut: Double = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      *
      * In version 7.15.0: introduced
      */
    var timeOutExpression: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.15.0: introduced
      */
    var timeOutModel: Expression = js.native
    /**
      * In version 7.1.0: introduced
      */
    var useRequestTimeOut: Boolean = js.native
  }
  
  @js.native
  class ResultHandling protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsImportXmlAction: ImportXmlAction = js.native
    val containerAsRestCallAction: RestCallAction = js.native
    val containerAsWebServiceCallAction: WebServiceCallAction = js.native
    var importMappingCall: ImportMappingCall | Null = js.native
    @JSName("model")
    var model_ResultHandling: IModel = js.native
    var outputVariableName: String = js.native
    var storeInVariable: Boolean = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 7.9.0: deleted
      * In version 6.10.0: introduced
      */
    var variableDataType: String = js.native
    /**
      * In version 7.9.0: introduced
      */
    var variableType: DataType = js.native
  }
  
  @js.native
  class ResultHandlingType () extends AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/retrieve relevant section in reference guide}
    */
  @js.native
  class RetrieveAction protected () extends MicroflowAction {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var outputVariableName: String = js.native
    var retrieveSource: RetrieveSource = js.native
  }
  
  @js.native
  abstract class RetrieveSource protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsRetrieveAction: RetrieveAction = js.native
    @JSName("model")
    var model_RetrieveSource: IModel = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/rollback-object relevant section in reference guide}
    */
  @js.native
  class RollbackAction protected () extends MicroflowAction {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var refreshInClient: Boolean = js.native
    var rollbackVariableName: String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/rules relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.IRule because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class Rule protected () extends ServerSideMicroflow {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  @js.native
  class RuleCall protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsRuleSplitCondition: RuleSplitCondition = js.native
    @JSName("model")
    var model_RuleCall: IModel = js.native
    val parameterMappings: IList[RuleCallParameterMapping] = js.native
    var rule: IRule | Null = js.native
    val ruleQualifiedName: String | Null = js.native
  }
  
  @js.native
  class RuleCallParameterMapping protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var argument: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var argumentModel: Expression = js.native
    val containerAsRuleCall: RuleCall = js.native
    @JSName("model")
    var model_RuleCallParameterMapping: IModel = js.native
    var parameter: IRuleParameter = js.native
    val parameterQualifiedName: String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/parameter relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.IRuleParameter because var conflicts: id, isLoaded, model, name, parameterType, structureTypeName, `type`, unit. Inlined  */ @js.native
  class RuleParameter protected () extends MicroflowParameterBase {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsRule")
    val containerAsRule_RuleParameter: Rule = js.native
  }
  
  @js.native
  class RuleSplitCondition protected () extends SplitCondition {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var ruleCall: RuleCall = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/sequence-flow relevant section in reference guide}
    */
  @js.native
  class SequenceFlow protected () extends Flow {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var caseValue: CaseValue = js.native
    var isErrorHandler: Boolean = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.IServerSideMicroflow because var conflicts: id, isLoaded, microflowReturnType, model, returnType, structureTypeName, unit. Inlined  */ @js.native
  abstract class ServerSideMicroflow protected () extends MicroflowBase {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
    var applyEntityAccess: Boolean = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/show-home-page relevant section in reference guide}
    */
  @js.native
  class ShowHomePageAction protected () extends MicroflowAction {
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
    * See: {@link https://docs.mendix.com/refguide7/show-message relevant section in reference guide}
    */
  @js.native
  class ShowMessageAction protected () extends MicroflowAction {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var blocking: Boolean = js.native
    var template: TextTemplate = js.native
    var `type`: ShowMessageType = js.native
  }
  
  @js.native
  class ShowMessageType () extends AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/show-page relevant section in reference guide}
    */
  @js.native
  class ShowPageAction protected () extends MicroflowAction {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var pageSettings: PageSettings = js.native
    var passedObjectVariableName: String = js.native
  }
  
  @js.native
  class SimpleRequestHandling protected () extends RequestHandling {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * In version 6.7.0: introduced
      */
    var nullValueOption: NullValueOption = js.native
    val parameterMappings: IList[WebServiceOperationSimpleParameterMapping] = js.native
  }
  
  @js.native
  class Sort protected () extends ListOperation {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var sortItemList: SortItemList = js.native
  }
  
  @js.native
  class SortItem protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * The value of this property is conceptually of type paths.LegacyAttributePath.
      *
      * In version 7.11.0: deleted
      */
    var attributePath: String = js.native
    /**
      * In version 7.11.0: introduced
      */
    var attributeRef: AttributeRef = js.native
    val containerAsSortItemList: SortItemList = js.native
    @JSName("model")
    var model_SortItem: IModel = js.native
    var sortOrder: SortOrderEnum = js.native
  }
  
  @js.native
  class SortItemList protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsDatabaseRetrieveSource: DatabaseRetrieveSource = js.native
    val containerAsSort: Sort = js.native
    val items: IList[SortItem] = js.native
    @JSName("model")
    var model_SortItemList: IModel = js.native
  }
  
  @js.native
  class SortOrderEnum () extends AbstractEnum
  
  @js.native
  abstract class SplitCondition protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsExclusiveSplit: ExclusiveSplit = js.native
    @JSName("model")
    var model_SplitCondition: IModel = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/start-event relevant section in reference guide}
    */
  @js.native
  class StartEvent protected () extends MicroflowObject {
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
  class StringTemplate protected () extends Template {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var text: String = js.native
  }
  
  @js.native
  class Subtract protected () extends BinaryListOperation {
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
    * See: {@link https://docs.mendix.com/refguide7/synchronize relevant section in reference guide}
    *
    * In version 7.22.0: introduced
    */
  @js.native
  class SynchronizeAction protected () extends MicroflowAction {
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
  class Tail protected () extends ListOperation {
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
  class TargetDocumentType () extends AbstractEnum
  
  @js.native
  abstract class Template protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val arguments: IList[TemplateArgument] = js.native
    val containerAsCustomRequestHandling: CustomRequestHandling = js.native
    val containerAsHttpConfiguration: HttpConfiguration = js.native
    val containerAsLogMessageAction: LogMessageAction = js.native
    val containerAsShowMessageAction: ShowMessageAction = js.native
    val containerAsValidationFeedbackAction: ValidationFeedbackAction = js.native
    @JSName("model")
    var model_Template: IModel = js.native
  }
  
  @js.native
  class TemplateArgument protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsTemplate: Template = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var expression: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var expressionModel: Expression = js.native
    @JSName("model")
    var model_TemplateArgument: IModel = js.native
  }
  
  @js.native
  class TextTemplate protected () extends Template {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var text: Text = js.native
  }
  
  @js.native
  class Union protected () extends BinaryListOperation {
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
    * See: {@link https://docs.mendix.com/refguide7/validation-feedback relevant section in reference guide}
    */
  @js.native
  class ValidationFeedbackAction protected () extends MicroflowAction {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * See: {@link https://docs.mendix.com/refguide7/validation-feedback See 'Member' section in reference guide}
      */
    var association: IAssociationBase | Null = js.native
    val associationQualifiedName: String | Null = js.native
    /**
      * See: {@link https://docs.mendix.com/refguide7/validation-feedback See 'Member' section in reference guide}
      */
    var attribute: IAttribute | Null = js.native
    val attributeQualifiedName: String | Null = js.native
    var feedbackTemplate: TextTemplate = js.native
    var objectVariableName: String = js.native
  }
  
  @js.native
  class VariableExport protected () extends OutputMethod {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var outputVariableName: String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/call-web-service-action relevant section in reference guide}
    */
  @js.native
  class WebServiceCallAction protected () extends MicroflowAction {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var httpConfiguration: HttpConfiguration = js.native
    var importedWebService: IImportedWebService | Null = js.native
    val importedWebServiceQualifiedName: String | Null = js.native
    var isValidationRequired: Boolean = js.native
    var operationName: String = js.native
    /**
      * In version 7.15.0: introduced
      */
    var proxyConfiguration: ProxyConfiguration | Null = js.native
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
    var serviceName: String = js.native
    /**
      * In version 7.15.0: deleted
      */
    var timeOut: Double = js.native
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      *
      * In version 7.15.0: introduced
      */
    var timeOutExpression: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.15.0: introduced
      */
    var timeOutModel: Expression = js.native
    var useRequestTimeOut: Boolean = js.native
  }
  
  @js.native
  class WebServiceOperationAdvancedParameterMapping protected () extends WebServiceOperationParameterMapping {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var mapping: IExportMapping | Null = js.native
    var mappingArgumentVariableName: String = js.native
    val mappingQualifiedName: String | Null = js.native
  }
  
  /**
    * In version 6.3.0: introduced
    */
  @js.native
  abstract class WebServiceOperationParameterMapping protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      */
    var argument: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.9.0: introduced
      */
    var argumentModel: Expression = js.native
    val containerAsAdvancedRequestHandling: AdvancedRequestHandling = js.native
    val containerAsSimpleRequestHandling: SimpleRequestHandling = js.native
    var isChecked: Boolean = js.native
    @JSName("model")
    var model_WebServiceOperationParameterMapping: IModel = js.native
    var parameterName: String = js.native
  }
  
  @js.native
  class WebServiceOperationSimpleParameterMapping protected () extends WebServiceOperationParameterMapping {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * The value of this property is conceptually of type mappings.ElementPath.
      */
    var parameterPath: String = js.native
  }
  
  /* static members */
  @js.native
  object ActionActivity extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ActionActivity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ActionActivity = js.native
    /**
      * Creates and returns a new ActionActivity instance in the SDK and on the server.
      * The new ActionActivity will be automatically stored in the 'objects' property
      * of the parent MicroflowObjectCollection element passed as argument.
      */
    def createIn(container: MicroflowObjectCollection): ActionActivity = js.native
  }
  
  /* static members */
  @js.native
  object ActionActivityColor extends js.Object {
    var Blue: ActionActivityColor = js.native
    var Default: ActionActivityColor = js.native
    var Gray: ActionActivityColor = js.native
    var Green: ActionActivityColor = js.native
    var Orange: ActionActivityColor = js.native
    var Purple: ActionActivityColor = js.native
    var Red: ActionActivityColor = js.native
    var Yellow: ActionActivityColor = js.native
  }
  
  /* static members */
  @js.native
  object Activity extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object AdvancedRequestHandling extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new AdvancedRequestHandling instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): AdvancedRequestHandling = js.native
    /**
      * Creates and returns a new AdvancedRequestHandling instance in the SDK and on the server.
      * The new AdvancedRequestHandling will be automatically stored in the 'requestHandling' property
      * of the parent RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    def createInRestCallActionUnderRequestHandling(container: RestCallAction): AdvancedRequestHandling = js.native
    /**
      * Creates and returns a new AdvancedRequestHandling instance in the SDK and on the server.
      * The new AdvancedRequestHandling will be automatically stored in the 'requestBodyHandling' property
      * of the parent WebServiceCallAction element passed as argument.
      */
    def createInWebServiceCallActionUnderRequestBodyHandling(container: WebServiceCallAction): AdvancedRequestHandling = js.native
    /**
      * Creates and returns a new AdvancedRequestHandling instance in the SDK and on the server.
      * The new AdvancedRequestHandling will be automatically stored in the 'requestHeaderHandling' property
      * of the parent WebServiceCallAction element passed as argument.
      */
    def createInWebServiceCallActionUnderRequestHeaderHandling(container: WebServiceCallAction): AdvancedRequestHandling = js.native
  }
  
  /* static members */
  @js.native
  object AggregateFunctionEnum extends js.Object {
    var Average: AggregateFunctionEnum = js.native
    var Count: AggregateFunctionEnum = js.native
    var Maximum: AggregateFunctionEnum = js.native
    var Minimum: AggregateFunctionEnum = js.native
    var Sum: AggregateFunctionEnum = js.native
  }
  
  /* static members */
  @js.native
  object AggregateListAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new AggregateListAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): AggregateListAction = js.native
    /**
      * Creates and returns a new AggregateListAction instance in the SDK and on the server.
      * The new AggregateListAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: ActionActivity): AggregateListAction = js.native
  }
  
  /* static members */
  @js.native
  object Annotation extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new Annotation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): Annotation = js.native
    /**
      * Creates and returns a new Annotation instance in the SDK and on the server.
      * The new Annotation will be automatically stored in the 'objects' property
      * of the parent MicroflowObjectCollection element passed as argument.
      */
    def createIn(container: MicroflowObjectCollection): Annotation = js.native
  }
  
  /* static members */
  @js.native
  object AnnotationFlow extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new AnnotationFlow instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): AnnotationFlow = js.native
    /**
      * Creates and returns a new AnnotationFlow instance in the SDK and on the server.
      * The new AnnotationFlow will be automatically stored in the 'flows' property
      * of the parent MicroflowBase element passed as argument.
      */
    def createIn(container: MicroflowBase): AnnotationFlow = js.native
  }
  
  /* static members */
  @js.native
  object AppServiceCallAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new AppServiceCallAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): AppServiceCallAction = js.native
    /**
      * Creates and returns a new AppServiceCallAction instance in the SDK and on the server.
      * The new AppServiceCallAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: ActionActivity): AppServiceCallAction = js.native
  }
  
  /* static members */
  @js.native
  object AppServiceCallParameterMapping extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new AppServiceCallParameterMapping instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): AppServiceCallParameterMapping = js.native
    /**
      * Creates and returns a new AppServiceCallParameterMapping instance in the SDK and on the server.
      * The new AppServiceCallParameterMapping will be automatically stored in the 'parameterMappings' property
      * of the parent AppServiceCallAction element passed as argument.
      */
    def createIn(container: AppServiceCallAction): AppServiceCallParameterMapping = js.native
  }
  
  /* static members */
  @js.native
  object AssociationRetrieveSource extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new AssociationRetrieveSource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): AssociationRetrieveSource = js.native
    /**
      * Creates and returns a new AssociationRetrieveSource instance in the SDK and on the server.
      * The new AssociationRetrieveSource will be automatically stored in the 'retrieveSource' property
      * of the parent RetrieveAction element passed as argument.
      */
    def createIn(container: RetrieveAction): AssociationRetrieveSource = js.native
  }
  
  /* static members */
  @js.native
  object BasicCodeActionParameterValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new BasicCodeActionParameterValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): BasicCodeActionParameterValue = js.native
    /**
      * Creates and returns a new BasicCodeActionParameterValue instance in the SDK and on the server.
      * The new BasicCodeActionParameterValue will be automatically stored in the 'parameterValue' property
      * of the parent JavaActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInJavaActionParameterMappingUnderParameterValue(container: JavaActionParameterMapping): BasicCodeActionParameterValue = js.native
    /**
      * Creates and returns a new BasicCodeActionParameterValue instance in the SDK and on the server.
      * The new BasicCodeActionParameterValue will be automatically stored in the 'parameterValue' property
      * of the parent JavaScriptActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInJavaScriptActionParameterMappingUnderParameterValue(container: JavaScriptActionParameterMapping): BasicCodeActionParameterValue = js.native
  }
  
  /* static members */
  @js.native
  object BasicJavaActionParameterValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new BasicJavaActionParameterValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): BasicJavaActionParameterValue = js.native
    /**
      * Creates and returns a new BasicJavaActionParameterValue instance in the SDK and on the server.
      * The new BasicJavaActionParameterValue will be automatically stored in the 'value' property
      * of the parent JavaActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.20.0
      */
    def createIn(container: JavaActionParameterMapping): BasicJavaActionParameterValue = js.native
  }
  
  /* static members */
  @js.native
  object BinaryListOperation extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object BinaryRequestHandling extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new BinaryRequestHandling instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): BinaryRequestHandling = js.native
    /**
      * Creates and returns a new BinaryRequestHandling instance in the SDK and on the server.
      * The new BinaryRequestHandling will be automatically stored in the 'requestHandling' property
      * of the parent RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.9.0 and higher
      */
    def createInRestCallActionUnderRequestHandling(container: RestCallAction): BinaryRequestHandling = js.native
    /**
      * Creates and returns a new BinaryRequestHandling instance in the SDK and on the server.
      * The new BinaryRequestHandling will be automatically stored in the 'requestBodyHandling' property
      * of the parent WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.9.0 and higher
      */
    def createInWebServiceCallActionUnderRequestBodyHandling(container: WebServiceCallAction): BinaryRequestHandling = js.native
    /**
      * Creates and returns a new BinaryRequestHandling instance in the SDK and on the server.
      * The new BinaryRequestHandling will be automatically stored in the 'requestHeaderHandling' property
      * of the parent WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.9.0 and higher
      */
    def createInWebServiceCallActionUnderRequestHeaderHandling(container: WebServiceCallAction): BinaryRequestHandling = js.native
  }
  
  /* static members */
  @js.native
  object BreakEvent extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new BreakEvent instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): BreakEvent = js.native
    /**
      * Creates and returns a new BreakEvent instance in the SDK and on the server.
      * The new BreakEvent will be automatically stored in the 'objects' property
      * of the parent MicroflowObjectCollection element passed as argument.
      */
    def createIn(container: MicroflowObjectCollection): BreakEvent = js.native
  }
  
  /* static members */
  @js.native
  object CaseValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object CastAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new CastAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): CastAction = js.native
    /**
      * Creates and returns a new CastAction instance in the SDK and on the server.
      * The new CastAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: ActionActivity): CastAction = js.native
  }
  
  /* static members */
  @js.native
  object ChangeActionItemType extends js.Object {
    var Add: ChangeActionItemType = js.native
    var Remove: ChangeActionItemType = js.native
    var Set: ChangeActionItemType = js.native
  }
  
  /* static members */
  @js.native
  object ChangeListAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ChangeListAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ChangeListAction = js.native
    /**
      * Creates and returns a new ChangeListAction instance in the SDK and on the server.
      * The new ChangeListAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: ActionActivity): ChangeListAction = js.native
  }
  
  /* static members */
  @js.native
  object ChangeListActionType extends js.Object {
    var Add: ChangeListActionType = js.native
    var Clear: ChangeListActionType = js.native
    var Remove: ChangeListActionType = js.native
    var Set: ChangeListActionType = js.native
  }
  
  /* static members */
  @js.native
  object ChangeMembersAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object ChangeObjectAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ChangeObjectAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ChangeObjectAction = js.native
    /**
      * Creates and returns a new ChangeObjectAction instance in the SDK and on the server.
      * The new ChangeObjectAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: ActionActivity): ChangeObjectAction = js.native
  }
  
  /* static members */
  @js.native
  object ChangeVariableAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ChangeVariableAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ChangeVariableAction = js.native
    /**
      * Creates and returns a new ChangeVariableAction instance in the SDK and on the server.
      * The new ChangeVariableAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: ActionActivity): ChangeVariableAction = js.native
  }
  
  /* static members */
  @js.native
  object CloseFormAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new CloseFormAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): CloseFormAction = js.native
    /**
      * Creates and returns a new CloseFormAction instance in the SDK and on the server.
      * The new CloseFormAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: ActionActivity): CloseFormAction = js.native
  }
  
  /* static members */
  @js.native
  object CodeActionParameterValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object CommitAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new CommitAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): CommitAction = js.native
    /**
      * Creates and returns a new CommitAction instance in the SDK and on the server.
      * The new CommitAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: ActionActivity): CommitAction = js.native
  }
  
  /* static members */
  @js.native
  object CommitEnum extends js.Object {
    var No: CommitEnum = js.native
    var Yes: CommitEnum = js.native
    var YesWithoutEvents: CommitEnum = js.native
  }
  
  /* static members */
  @js.native
  object ConstantRange extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ConstantRange instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ConstantRange = js.native
    /**
      * Creates and returns a new ConstantRange instance in the SDK and on the server.
      * The new ConstantRange will be automatically stored in the 'range' property
      * of the parent DatabaseRetrieveSource element passed as argument.
      */
    def createInDatabaseRetrieveSourceUnderRange(container: DatabaseRetrieveSource): ConstantRange = js.native
    /**
      * Creates and returns a new ConstantRange instance in the SDK and on the server.
      * The new ConstantRange will be automatically stored in the 'range' property
      * of the parent ImportMappingCall element passed as argument.
      */
    def createInImportMappingCallUnderRange(container: ImportMappingCall): ConstantRange = js.native
  }
  
  /* static members */
  @js.native
  object Contains extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new Contains instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): Contains = js.native
    /**
      * Creates and returns a new Contains instance in the SDK and on the server.
      * The new Contains will be automatically stored in the 'operation' property
      * of the parent ListOperationAction element passed as argument.
      */
    def createIn(container: ListOperationAction): Contains = js.native
  }
  
  /* static members */
  @js.native
  object ContentType extends js.Object {
    var Json: ContentType = js.native
    var Xml: ContentType = js.native
  }
  
  /* static members */
  @js.native
  object ContinueEvent extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ContinueEvent instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ContinueEvent = js.native
    /**
      * Creates and returns a new ContinueEvent instance in the SDK and on the server.
      * The new ContinueEvent will be automatically stored in the 'objects' property
      * of the parent MicroflowObjectCollection element passed as argument.
      */
    def createIn(container: MicroflowObjectCollection): ContinueEvent = js.native
  }
  
  /* static members */
  @js.native
  object CreateListAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new CreateListAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): CreateListAction = js.native
    /**
      * Creates and returns a new CreateListAction instance in the SDK and on the server.
      * The new CreateListAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: ActionActivity): CreateListAction = js.native
  }
  
  /* static members */
  @js.native
  object CreateObjectAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new CreateObjectAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): CreateObjectAction = js.native
    /**
      * Creates and returns a new CreateObjectAction instance in the SDK and on the server.
      * The new CreateObjectAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: ActionActivity): CreateObjectAction = js.native
  }
  
  /* static members */
  @js.native
  object CreateVariableAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new CreateVariableAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): CreateVariableAction = js.native
    /**
      * Creates and returns a new CreateVariableAction instance in the SDK and on the server.
      * The new CreateVariableAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: ActionActivity): CreateVariableAction = js.native
  }
  
  /* static members */
  @js.native
  object CustomRange extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new CustomRange instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): CustomRange = js.native
    /**
      * Creates and returns a new CustomRange instance in the SDK and on the server.
      * The new CustomRange will be automatically stored in the 'range' property
      * of the parent DatabaseRetrieveSource element passed as argument.
      */
    def createInDatabaseRetrieveSourceUnderRange(container: DatabaseRetrieveSource): CustomRange = js.native
    /**
      * Creates and returns a new CustomRange instance in the SDK and on the server.
      * The new CustomRange will be automatically stored in the 'range' property
      * of the parent ImportMappingCall element passed as argument.
      */
    def createInImportMappingCallUnderRange(container: ImportMappingCall): CustomRange = js.native
  }
  
  /* static members */
  @js.native
  object CustomRequestHandling extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new CustomRequestHandling instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): CustomRequestHandling = js.native
    /**
      * Creates and returns a new CustomRequestHandling instance in the SDK and on the server.
      * The new CustomRequestHandling will be automatically stored in the 'requestHandling' property
      * of the parent RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    def createInRestCallActionUnderRequestHandling(container: RestCallAction): CustomRequestHandling = js.native
    /**
      * Creates and returns a new CustomRequestHandling instance in the SDK and on the server.
      * The new CustomRequestHandling will be automatically stored in the 'requestBodyHandling' property
      * of the parent WebServiceCallAction element passed as argument.
      */
    def createInWebServiceCallActionUnderRequestBodyHandling(container: WebServiceCallAction): CustomRequestHandling = js.native
    /**
      * Creates and returns a new CustomRequestHandling instance in the SDK and on the server.
      * The new CustomRequestHandling will be automatically stored in the 'requestHeaderHandling' property
      * of the parent WebServiceCallAction element passed as argument.
      */
    def createInWebServiceCallActionUnderRequestHeaderHandling(container: WebServiceCallAction): CustomRequestHandling = js.native
  }
  
  /* static members */
  @js.native
  object DatabaseRetrieveSource extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new DatabaseRetrieveSource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): DatabaseRetrieveSource = js.native
    /**
      * Creates and returns a new DatabaseRetrieveSource instance in the SDK and on the server.
      * The new DatabaseRetrieveSource will be automatically stored in the 'retrieveSource' property
      * of the parent RetrieveAction element passed as argument.
      */
    def createIn(container: RetrieveAction): DatabaseRetrieveSource = js.native
  }
  
  /* static members */
  @js.native
  object DeleteAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new DeleteAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): DeleteAction = js.native
    /**
      * Creates and returns a new DeleteAction instance in the SDK and on the server.
      * The new DeleteAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: ActionActivity): DeleteAction = js.native
  }
  
  /* static members */
  @js.native
  object DocumentTemplateParameterMapping extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new DocumentTemplateParameterMapping instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): DocumentTemplateParameterMapping = js.native
    /**
      * Creates and returns a new DocumentTemplateParameterMapping instance in the SDK and on the server.
      * The new DocumentTemplateParameterMapping will be automatically stored in the 'parameterMappings' property
      * of the parent GenerateDocumentAction element passed as argument.
      */
    def createIn(container: GenerateDocumentAction): DocumentTemplateParameterMapping = js.native
  }
  
  /* static members */
  @js.native
  object DownloadFileAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new DownloadFileAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): DownloadFileAction = js.native
    /**
      * Creates and returns a new DownloadFileAction instance in the SDK and on the server.
      * The new DownloadFileAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: ActionActivity): DownloadFileAction = js.native
  }
  
  /* static members */
  @js.native
  object EndEvent extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new EndEvent instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): EndEvent = js.native
    /**
      * Creates and returns a new EndEvent instance in the SDK and on the server.
      * The new EndEvent will be automatically stored in the 'objects' property
      * of the parent MicroflowObjectCollection element passed as argument.
      */
    def createIn(container: MicroflowObjectCollection): EndEvent = js.native
  }
  
  /* static members */
  @js.native
  object EntityTypeCodeActionParameterValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new EntityTypeCodeActionParameterValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): EntityTypeCodeActionParameterValue = js.native
    /**
      * Creates and returns a new EntityTypeCodeActionParameterValue instance in the SDK and on the server.
      * The new EntityTypeCodeActionParameterValue will be automatically stored in the 'parameterValue' property
      * of the parent JavaActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInJavaActionParameterMappingUnderParameterValue(container: JavaActionParameterMapping): EntityTypeCodeActionParameterValue = js.native
    /**
      * Creates and returns a new EntityTypeCodeActionParameterValue instance in the SDK and on the server.
      * The new EntityTypeCodeActionParameterValue will be automatically stored in the 'parameterValue' property
      * of the parent JavaScriptActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInJavaScriptActionParameterMappingUnderParameterValue(container: JavaScriptActionParameterMapping): EntityTypeCodeActionParameterValue = js.native
  }
  
  /* static members */
  @js.native
  object EntityTypeJavaActionParameterValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new EntityTypeJavaActionParameterValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): EntityTypeJavaActionParameterValue = js.native
    /**
      * Creates and returns a new EntityTypeJavaActionParameterValue instance in the SDK and on the server.
      * The new EntityTypeJavaActionParameterValue will be automatically stored in the 'value' property
      * of the parent JavaActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.8.0 to 7.20.0
      */
    def createIn(container: JavaActionParameterMapping): EntityTypeJavaActionParameterValue = js.native
  }
  
  /* static members */
  @js.native
  object EnumerationCase extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new EnumerationCase instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): EnumerationCase = js.native
    /**
      * Creates and returns a new EnumerationCase instance in the SDK and on the server.
      * The new EnumerationCase will be automatically stored in the 'caseValue' property
      * of the parent SequenceFlow element passed as argument.
      */
    def createIn(container: SequenceFlow): EnumerationCase = js.native
  }
  
  /* static members */
  @js.native
  object ErrorEvent extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ErrorEvent instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ErrorEvent = js.native
    /**
      * Creates and returns a new ErrorEvent instance in the SDK and on the server.
      * The new ErrorEvent will be automatically stored in the 'objects' property
      * of the parent MicroflowObjectCollection element passed as argument.
      */
    def createIn(container: MicroflowObjectCollection): ErrorEvent = js.native
  }
  
  /* static members */
  @js.native
  object ErrorHandlingType extends js.Object {
    var Abort: ErrorHandlingType = js.native
    var Continue: ErrorHandlingType = js.native
    var Custom: ErrorHandlingType = js.native
    var CustomWithoutRollBack: ErrorHandlingType = js.native
    var Rollback: ErrorHandlingType = js.native
  }
  
  /* static members */
  @js.native
  object ErrorResultHandlingType extends js.Object {
    var HttpResponse: ErrorResultHandlingType = js.native
    var None: ErrorResultHandlingType = js.native
  }
  
  /* static members */
  @js.native
  object ExclusiveMerge extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ExclusiveMerge instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ExclusiveMerge = js.native
    /**
      * Creates and returns a new ExclusiveMerge instance in the SDK and on the server.
      * The new ExclusiveMerge will be automatically stored in the 'objects' property
      * of the parent MicroflowObjectCollection element passed as argument.
      */
    def createIn(container: MicroflowObjectCollection): ExclusiveMerge = js.native
  }
  
  /* static members */
  @js.native
  object ExclusiveSplit extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ExclusiveSplit instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ExclusiveSplit = js.native
    /**
      * Creates and returns a new ExclusiveSplit instance in the SDK and on the server.
      * The new ExclusiveSplit will be automatically stored in the 'objects' property
      * of the parent MicroflowObjectCollection element passed as argument.
      */
    def createIn(container: MicroflowObjectCollection): ExclusiveSplit = js.native
  }
  
  /* static members */
  @js.native
  object ExportMappingJavaActionParameterValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ExportMappingJavaActionParameterValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ExportMappingJavaActionParameterValue = js.native
    /**
      * Creates and returns a new ExportMappingJavaActionParameterValue instance in the SDK and on the server.
      * The new ExportMappingJavaActionParameterValue will be automatically stored in the 'value' property
      * of the parent JavaActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.2.0 to 7.20.0
      */
    def createIn(container: JavaActionParameterMapping): ExportMappingJavaActionParameterValue = js.native
  }
  
  /* static members */
  @js.native
  object ExportMappingParameterValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ExportMappingParameterValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ExportMappingParameterValue = js.native
    /**
      * Creates and returns a new ExportMappingParameterValue instance in the SDK and on the server.
      * The new ExportMappingParameterValue will be automatically stored in the 'parameterValue' property
      * of the parent JavaActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInJavaActionParameterMappingUnderParameterValue(container: JavaActionParameterMapping): ExportMappingParameterValue = js.native
    /**
      * Creates and returns a new ExportMappingParameterValue instance in the SDK and on the server.
      * The new ExportMappingParameterValue will be automatically stored in the 'parameterValue' property
      * of the parent JavaScriptActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInJavaScriptActionParameterMappingUnderParameterValue(container: JavaScriptActionParameterMapping): ExportMappingParameterValue = js.native
  }
  
  /* static members */
  @js.native
  object ExportXmlAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ExportXmlAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ExportXmlAction = js.native
    /**
      * Creates and returns a new ExportXmlAction instance in the SDK and on the server.
      * The new ExportXmlAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: ActionActivity): ExportXmlAction = js.native
  }
  
  /* static members */
  @js.native
  object ExpressionSplitCondition extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ExpressionSplitCondition instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ExpressionSplitCondition = js.native
    /**
      * Creates and returns a new ExpressionSplitCondition instance in the SDK and on the server.
      * The new ExpressionSplitCondition will be automatically stored in the 'splitCondition' property
      * of the parent ExclusiveSplit element passed as argument.
      */
    def createIn(container: ExclusiveSplit): ExpressionSplitCondition = js.native
  }
  
  /* static members */
  @js.native
  object FileDocumentExport extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new FileDocumentExport instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): FileDocumentExport = js.native
    /**
      * Creates and returns a new FileDocumentExport instance in the SDK and on the server.
      * The new FileDocumentExport will be automatically stored in the 'outputMethod' property
      * of the parent ExportXmlAction element passed as argument.
      */
    def createIn(container: ExportXmlAction): FileDocumentExport = js.native
  }
  
  /* static members */
  @js.native
  object Filter extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new Filter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): Filter = js.native
    /**
      * Creates and returns a new Filter instance in the SDK and on the server.
      * The new Filter will be automatically stored in the 'operation' property
      * of the parent ListOperationAction element passed as argument.
      */
    def createIn(container: ListOperationAction): Filter = js.native
  }
  
  /* static members */
  @js.native
  object Find extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new Find instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): Find = js.native
    /**
      * Creates and returns a new Find instance in the SDK and on the server.
      * The new Find will be automatically stored in the 'operation' property
      * of the parent ListOperationAction element passed as argument.
      */
    def createIn(container: ListOperationAction): Find = js.native
  }
  
  /* static members */
  @js.native
  object Flow extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object FormDataPart extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new FormDataPart instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): FormDataPart = js.native
    /**
      * Creates and returns a new FormDataPart instance in the SDK and on the server.
      * The new FormDataPart will be automatically stored in the 'parts' property
      * of the parent FormDataRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createIn(container: FormDataRequestHandling): FormDataPart = js.native
  }
  
  /* static members */
  @js.native
  object FormDataRequestHandling extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new FormDataRequestHandling instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): FormDataRequestHandling = js.native
    /**
      * Creates and returns a new FormDataRequestHandling instance in the SDK and on the server.
      * The new FormDataRequestHandling will be automatically stored in the 'requestHandling' property
      * of the parent RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInRestCallActionUnderRequestHandling(container: RestCallAction): FormDataRequestHandling = js.native
    /**
      * Creates and returns a new FormDataRequestHandling instance in the SDK and on the server.
      * The new FormDataRequestHandling will be automatically stored in the 'requestBodyHandling' property
      * of the parent WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInWebServiceCallActionUnderRequestBodyHandling(container: WebServiceCallAction): FormDataRequestHandling = js.native
    /**
      * Creates and returns a new FormDataRequestHandling instance in the SDK and on the server.
      * The new FormDataRequestHandling will be automatically stored in the 'requestHeaderHandling' property
      * of the parent WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInWebServiceCallActionUnderRequestHeaderHandling(container: WebServiceCallAction): FormDataRequestHandling = js.native
  }
  
  /* static members */
  @js.native
  object GenerateDocumentAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new GenerateDocumentAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): GenerateDocumentAction = js.native
    /**
      * Creates and returns a new GenerateDocumentAction instance in the SDK and on the server.
      * The new GenerateDocumentAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: ActionActivity): GenerateDocumentAction = js.native
  }
  
  /* static members */
  @js.native
  object Head extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new Head instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): Head = js.native
    /**
      * Creates and returns a new Head instance in the SDK and on the server.
      * The new Head will be automatically stored in the 'operation' property
      * of the parent ListOperationAction element passed as argument.
      */
    def createIn(container: ListOperationAction): Head = js.native
  }
  
  /* static members */
  @js.native
  object HttpConfiguration extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): HttpConfiguration = js.native
    /**
      * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
      * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
      * of the parent WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.5.0
      */
    def createIn(container: WebServiceCallAction): HttpConfiguration = js.native
    /**
      * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
      * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
      * of the parent rest.ConsumedODataService element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInConsumedODataServiceUnderHttpConfiguration(container: ConsumedODataService): HttpConfiguration = js.native
    /**
      * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
      * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
      * of the parent RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    def createInRestCallActionUnderHttpConfiguration(container: RestCallAction): HttpConfiguration = js.native
    /**
      * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
      * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
      * of the parent WebServiceCallAction element passed as argument.
      */
    def createInWebServiceCallActionUnderHttpConfiguration(container: WebServiceCallAction): HttpConfiguration = js.native
  }
  
  /* static members */
  @js.native
  object HttpHeaderEntry extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new HttpHeaderEntry instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): HttpHeaderEntry = js.native
    /**
      * Creates and returns a new HttpHeaderEntry instance in the SDK and on the server.
      * The new HttpHeaderEntry will be automatically stored in the 'headerEntries' property
      * of the parent HttpConfiguration element passed as argument.
      */
    def createIn(container: HttpConfiguration): HttpHeaderEntry = js.native
  }
  
  /* static members */
  @js.native
  object HttpMethod extends js.Object {
    var Delete: HttpMethod = js.native
    var Get: HttpMethod = js.native
    var Patch: HttpMethod = js.native
    var Post: HttpMethod = js.native
    var Put: HttpMethod = js.native
  }
  
  /* static members */
  @js.native
  object ImportMappingCall extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ImportMappingCall instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ImportMappingCall = js.native
    /**
      * Creates and returns a new ImportMappingCall instance in the SDK and on the server.
      * The new ImportMappingCall will be automatically stored in the 'importMappingCall' property
      * of the parent ResultHandling element passed as argument.
      */
    def createIn(container: ResultHandling): ImportMappingCall = js.native
  }
  
  /* static members */
  @js.native
  object ImportMappingJavaActionParameterValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ImportMappingJavaActionParameterValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ImportMappingJavaActionParameterValue = js.native
    /**
      * Creates and returns a new ImportMappingJavaActionParameterValue instance in the SDK and on the server.
      * The new ImportMappingJavaActionParameterValue will be automatically stored in the 'value' property
      * of the parent JavaActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.2.0 to 7.20.0
      */
    def createIn(container: JavaActionParameterMapping): ImportMappingJavaActionParameterValue = js.native
  }
  
  /* static members */
  @js.native
  object ImportMappingParameterValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ImportMappingParameterValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ImportMappingParameterValue = js.native
    /**
      * Creates and returns a new ImportMappingParameterValue instance in the SDK and on the server.
      * The new ImportMappingParameterValue will be automatically stored in the 'parameterValue' property
      * of the parent JavaActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInJavaActionParameterMappingUnderParameterValue(container: JavaActionParameterMapping): ImportMappingParameterValue = js.native
    /**
      * Creates and returns a new ImportMappingParameterValue instance in the SDK and on the server.
      * The new ImportMappingParameterValue will be automatically stored in the 'parameterValue' property
      * of the parent JavaScriptActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInJavaScriptActionParameterMappingUnderParameterValue(container: JavaScriptActionParameterMapping): ImportMappingParameterValue = js.native
  }
  
  /* static members */
  @js.native
  object ImportXmlAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ImportXmlAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ImportXmlAction = js.native
    /**
      * Creates and returns a new ImportXmlAction instance in the SDK and on the server.
      * The new ImportXmlAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: ActionActivity): ImportXmlAction = js.native
  }
  
  /* static members */
  @js.native
  object InheritanceCase extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new InheritanceCase instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): InheritanceCase = js.native
    /**
      * Creates and returns a new InheritanceCase instance in the SDK and on the server.
      * The new InheritanceCase will be automatically stored in the 'caseValue' property
      * of the parent SequenceFlow element passed as argument.
      */
    def createIn(container: SequenceFlow): InheritanceCase = js.native
  }
  
  /* static members */
  @js.native
  object InheritanceSplit extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new InheritanceSplit instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): InheritanceSplit = js.native
    /**
      * Creates and returns a new InheritanceSplit instance in the SDK and on the server.
      * The new InheritanceSplit will be automatically stored in the 'objects' property
      * of the parent MicroflowObjectCollection element passed as argument.
      */
    def createIn(container: MicroflowObjectCollection): InheritanceSplit = js.native
  }
  
  /* static members */
  @js.native
  object InspectAttribute extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object Intersect extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new Intersect instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): Intersect = js.native
    /**
      * Creates and returns a new Intersect instance in the SDK and on the server.
      * The new Intersect will be automatically stored in the 'operation' property
      * of the parent ListOperationAction element passed as argument.
      */
    def createIn(container: ListOperationAction): Intersect = js.native
  }
  
  /* static members */
  @js.native
  object JavaActionCallAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new JavaActionCallAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): JavaActionCallAction = js.native
    /**
      * Creates and returns a new JavaActionCallAction instance in the SDK and on the server.
      * The new JavaActionCallAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: ActionActivity): JavaActionCallAction = js.native
  }
  
  /* static members */
  @js.native
  object JavaActionParameterMapping extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new JavaActionParameterMapping instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): JavaActionParameterMapping = js.native
    /**
      * Creates and returns a new JavaActionParameterMapping instance in the SDK and on the server.
      * The new JavaActionParameterMapping will be automatically stored in the 'parameterMappings' property
      * of the parent JavaActionCallAction element passed as argument.
      */
    def createIn(container: JavaActionCallAction): JavaActionParameterMapping = js.native
  }
  
  /* static members */
  @js.native
  object JavaActionParameterValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object JavaScriptActionCallAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new JavaScriptActionCallAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): JavaScriptActionCallAction = js.native
    /**
      * Creates and returns a new JavaScriptActionCallAction instance in the SDK and on the server.
      * The new JavaScriptActionCallAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createIn(container: ActionActivity): JavaScriptActionCallAction = js.native
  }
  
  /* static members */
  @js.native
  object JavaScriptActionParameterMapping extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new JavaScriptActionParameterMapping instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): JavaScriptActionParameterMapping = js.native
    /**
      * Creates and returns a new JavaScriptActionParameterMapping instance in the SDK and on the server.
      * The new JavaScriptActionParameterMapping will be automatically stored in the 'parameterMappings' property
      * of the parent JavaScriptActionCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createIn(container: JavaScriptActionCallAction): JavaScriptActionParameterMapping = js.native
  }
  
  /* static members */
  @js.native
  object LanguageSettingType extends js.Object {
    var CurrentUser: LanguageSettingType = js.native
    var ProjectDefault: LanguageSettingType = js.native
    var Variable: LanguageSettingType = js.native
  }
  
  /* static members */
  @js.native
  object ListEquals extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ListEquals instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ListEquals = js.native
    /**
      * Creates and returns a new ListEquals instance in the SDK and on the server.
      * The new ListEquals will be automatically stored in the 'operation' property
      * of the parent ListOperationAction element passed as argument.
      */
    def createIn(container: ListOperationAction): ListEquals = js.native
  }
  
  /* static members */
  @js.native
  object ListOperation extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object ListOperationAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ListOperationAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ListOperationAction = js.native
    /**
      * Creates and returns a new ListOperationAction instance in the SDK and on the server.
      * The new ListOperationAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: ActionActivity): ListOperationAction = js.native
  }
  
  /* static members */
  @js.native
  object LogLevel extends js.Object {
    var Critical: LogLevel = js.native
    var Debug: LogLevel = js.native
    var Error: LogLevel = js.native
    var Info: LogLevel = js.native
    var Trace: LogLevel = js.native
    var Warning: LogLevel = js.native
  }
  
  /* static members */
  @js.native
  object LogMessageAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new LogMessageAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): LogMessageAction = js.native
    /**
      * Creates and returns a new LogMessageAction instance in the SDK and on the server.
      * The new LogMessageAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: ActionActivity): LogMessageAction = js.native
  }
  
  /* static members */
  @js.native
  object LoopedActivity extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new LoopedActivity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): LoopedActivity = js.native
    /**
      * Creates and returns a new LoopedActivity instance in the SDK and on the server.
      * The new LoopedActivity will be automatically stored in the 'objects' property
      * of the parent MicroflowObjectCollection element passed as argument.
      */
    def createIn(container: MicroflowObjectCollection): LoopedActivity = js.native
  }
  
  /* static members */
  @js.native
  object MappingRequestHandling extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new MappingRequestHandling instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): MappingRequestHandling = js.native
    /**
      * Creates and returns a new MappingRequestHandling instance in the SDK and on the server.
      * The new MappingRequestHandling will be automatically stored in the 'resultHandling' property
      * of the parent ExportXmlAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInExportXmlActionUnderResultHandling(container: ExportXmlAction): MappingRequestHandling = js.native
    /**
      * Creates and returns a new MappingRequestHandling instance in the SDK and on the server.
      * The new MappingRequestHandling will be automatically stored in the 'requestHandling' property
      * of the parent RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    def createInRestCallActionUnderRequestHandling(container: RestCallAction): MappingRequestHandling = js.native
    /**
      * Creates and returns a new MappingRequestHandling instance in the SDK and on the server.
      * The new MappingRequestHandling will be automatically stored in the 'requestBodyHandling' property
      * of the parent WebServiceCallAction element passed as argument.
      */
    def createInWebServiceCallActionUnderRequestBodyHandling(container: WebServiceCallAction): MappingRequestHandling = js.native
    /**
      * Creates and returns a new MappingRequestHandling instance in the SDK and on the server.
      * The new MappingRequestHandling will be automatically stored in the 'requestHeaderHandling' property
      * of the parent WebServiceCallAction element passed as argument.
      */
    def createInWebServiceCallActionUnderRequestHeaderHandling(container: WebServiceCallAction): MappingRequestHandling = js.native
  }
  
  /* static members */
  @js.native
  object MemberChange extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new MemberChange instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): MemberChange = js.native
    /**
      * Creates and returns a new MemberChange instance in the SDK and on the server.
      * The new MemberChange will be automatically stored in the 'items' property
      * of the parent ChangeMembersAction element passed as argument.
      */
    def createIn(container: ChangeMembersAction): MemberChange = js.native
  }
  
  /* static members */
  @js.native
  object Microflow extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates a new Microflow unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): Microflow = js.native
  }
  
  /* static members */
  @js.native
  object MicroflowAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object MicroflowBase extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object MicroflowCall extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new MicroflowCall instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): MicroflowCall = js.native
    /**
      * Creates and returns a new MicroflowCall instance in the SDK and on the server.
      * The new MicroflowCall will be automatically stored in the 'microflowCall' property
      * of the parent MicroflowCallAction element passed as argument.
      */
    def createIn(container: MicroflowCallAction): MicroflowCall = js.native
  }
  
  /* static members */
  @js.native
  object MicroflowCallAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new MicroflowCallAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): MicroflowCallAction = js.native
    /**
      * Creates and returns a new MicroflowCallAction instance in the SDK and on the server.
      * The new MicroflowCallAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: ActionActivity): MicroflowCallAction = js.native
  }
  
  /* static members */
  @js.native
  object MicroflowCallParameterMapping extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new MicroflowCallParameterMapping instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): MicroflowCallParameterMapping = js.native
    /**
      * Creates and returns a new MicroflowCallParameterMapping instance in the SDK and on the server.
      * The new MicroflowCallParameterMapping will be automatically stored in the 'parameterMappings' property
      * of the parent MicroflowCall element passed as argument.
      */
    def createIn(container: MicroflowCall): MicroflowCallParameterMapping = js.native
  }
  
  /* static members */
  @js.native
  object MicroflowJavaActionParameterValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new MicroflowJavaActionParameterValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): MicroflowJavaActionParameterValue = js.native
    /**
      * Creates and returns a new MicroflowJavaActionParameterValue instance in the SDK and on the server.
      * The new MicroflowJavaActionParameterValue will be automatically stored in the 'value' property
      * of the parent JavaActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.9.0 to 7.20.0
      */
    def createIn(container: JavaActionParameterMapping): MicroflowJavaActionParameterValue = js.native
  }
  
  /* static members */
  @js.native
  object MicroflowObject extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object MicroflowObjectCollection extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new MicroflowObjectCollection instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): MicroflowObjectCollection = js.native
    /**
      * Creates and returns a new MicroflowObjectCollection instance in the SDK and on the server.
      * The new MicroflowObjectCollection will be automatically stored in the 'objectCollection' property
      * of the parent LoopedActivity element passed as argument.
      */
    def createInLoopedActivityUnderObjectCollection(container: LoopedActivity): MicroflowObjectCollection = js.native
    /**
      * Creates and returns a new MicroflowObjectCollection instance in the SDK and on the server.
      * The new MicroflowObjectCollection will be automatically stored in the 'objectCollection' property
      * of the parent MicroflowBase element passed as argument.
      */
    def createInMicroflowBaseUnderObjectCollection(container: MicroflowBase): MicroflowObjectCollection = js.native
  }
  
  /* static members */
  @js.native
  object MicroflowParameter extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object MicroflowParameterBase extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object MicroflowParameterObject extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new MicroflowParameterObject instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): MicroflowParameterObject = js.native
    /**
      * Creates and returns a new MicroflowParameterObject instance in the SDK and on the server.
      * The new MicroflowParameterObject will be automatically stored in the 'objects' property
      * of the parent MicroflowObjectCollection element passed as argument.
      */
    def createIn(container: MicroflowObjectCollection): MicroflowParameterObject = js.native
  }
  
  /* static members */
  @js.native
  object MicroflowParameterValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new MicroflowParameterValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): MicroflowParameterValue = js.native
    /**
      * Creates and returns a new MicroflowParameterValue instance in the SDK and on the server.
      * The new MicroflowParameterValue will be automatically stored in the 'parameterValue' property
      * of the parent JavaActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInJavaActionParameterMappingUnderParameterValue(container: JavaActionParameterMapping): MicroflowParameterValue = js.native
    /**
      * Creates and returns a new MicroflowParameterValue instance in the SDK and on the server.
      * The new MicroflowParameterValue will be automatically stored in the 'parameterValue' property
      * of the parent JavaScriptActionParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInJavaScriptActionParameterMappingUnderParameterValue(container: JavaScriptActionParameterMapping): MicroflowParameterValue = js.native
  }
  
  /* static members */
  @js.native
  object Nanoflow extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates a new Nanoflow unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): Nanoflow = js.native
  }
  
  /* static members */
  @js.native
  object NanoflowParameter extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new NanoflowParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): NanoflowParameter = js.native
  }
  
  /* static members */
  @js.native
  object NoCase extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new NoCase instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): NoCase = js.native
    /**
      * Creates and returns a new NoCase instance in the SDK and on the server.
      * The new NoCase will be automatically stored in the 'caseValue' property
      * of the parent SequenceFlow element passed as argument.
      */
    def createIn(container: SequenceFlow): NoCase = js.native
  }
  
  /* static members */
  @js.native
  object NullValueOption extends js.Object {
    var LeaveOutElement: NullValueOption = js.native
    var SendAsNil: NullValueOption = js.native
  }
  
  /* static members */
  @js.native
  object OutputMethod extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object ProxyConfiguration extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ProxyConfiguration instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ProxyConfiguration = js.native
    /**
      * Creates and returns a new ProxyConfiguration instance in the SDK and on the server.
      * The new ProxyConfiguration will be automatically stored in the 'proxyConfiguration' property
      * of the parent RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderProxyConfiguration(container: RestCallAction): ProxyConfiguration = js.native
    /**
      * Creates and returns a new ProxyConfiguration instance in the SDK and on the server.
      * The new ProxyConfiguration will be automatically stored in the 'proxyConfiguration' property
      * of the parent WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderProxyConfiguration(container: WebServiceCallAction): ProxyConfiguration = js.native
  }
  
  /* static members */
  @js.native
  object Range extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object RequestHandling extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object RequestHandlingType extends js.Object {
    var Advanced: RequestHandlingType = js.native
    var Binary: RequestHandlingType = js.native
    var Custom: RequestHandlingType = js.native
    var FormData: RequestHandlingType = js.native
    var Mapping: RequestHandlingType = js.native
    var Simple: RequestHandlingType = js.native
  }
  
  /* static members */
  @js.native
  object RequestProxyType extends js.Object {
    var DefaultProxy: RequestProxyType = js.native
    var NoProxy: RequestProxyType = js.native
    var Override: RequestProxyType = js.native
  }
  
  /* static members */
  @js.native
  object RestCallAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new RestCallAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): RestCallAction = js.native
    /**
      * Creates and returns a new RestCallAction instance in the SDK and on the server.
      * The new RestCallAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    def createIn(container: ActionActivity): RestCallAction = js.native
  }
  
  /* static members */
  @js.native
  object ResultHandling extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ResultHandling instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ResultHandling = js.native
    /**
      * Creates and returns a new ResultHandling instance in the SDK and on the server.
      * The new ResultHandling will be automatically stored in the 'resultHandling' property
      * of the parent ImportXmlAction element passed as argument.
      */
    def createInImportXmlActionUnderResultHandling(container: ImportXmlAction): ResultHandling = js.native
    /**
      * Creates and returns a new ResultHandling instance in the SDK and on the server.
      * The new ResultHandling will be automatically stored in the 'resultHandling' property
      * of the parent RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    def createInRestCallActionUnderResultHandling(container: RestCallAction): ResultHandling = js.native
    /**
      * Creates and returns a new ResultHandling instance in the SDK and on the server.
      * The new ResultHandling will be automatically stored in the 'resultHandling' property
      * of the parent WebServiceCallAction element passed as argument.
      */
    def createInWebServiceCallActionUnderResultHandling(container: WebServiceCallAction): ResultHandling = js.native
  }
  
  /* static members */
  @js.native
  object ResultHandlingType extends js.Object {
    var FileDocument: ResultHandlingType = js.native
    var HttpResponse: ResultHandlingType = js.native
    var Mapping: ResultHandlingType = js.native
    var None: ResultHandlingType = js.native
    var String: ResultHandlingType = js.native
  }
  
  /* static members */
  @js.native
  object RetrieveAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new RetrieveAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): RetrieveAction = js.native
    /**
      * Creates and returns a new RetrieveAction instance in the SDK and on the server.
      * The new RetrieveAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: ActionActivity): RetrieveAction = js.native
  }
  
  /* static members */
  @js.native
  object RetrieveSource extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object RollbackAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new RollbackAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): RollbackAction = js.native
    /**
      * Creates and returns a new RollbackAction instance in the SDK and on the server.
      * The new RollbackAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: ActionActivity): RollbackAction = js.native
  }
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates a new Rule unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): Rule = js.native
  }
  
  /* static members */
  @js.native
  object RuleCall extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new RuleCall instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): RuleCall = js.native
    /**
      * Creates and returns a new RuleCall instance in the SDK and on the server.
      * The new RuleCall will be automatically stored in the 'ruleCall' property
      * of the parent RuleSplitCondition element passed as argument.
      */
    def createIn(container: RuleSplitCondition): RuleCall = js.native
  }
  
  /* static members */
  @js.native
  object RuleCallParameterMapping extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new RuleCallParameterMapping instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): RuleCallParameterMapping = js.native
    /**
      * Creates and returns a new RuleCallParameterMapping instance in the SDK and on the server.
      * The new RuleCallParameterMapping will be automatically stored in the 'parameterMappings' property
      * of the parent RuleCall element passed as argument.
      */
    def createIn(container: RuleCall): RuleCallParameterMapping = js.native
  }
  
  /* static members */
  @js.native
  object RuleParameter extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object RuleSplitCondition extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new RuleSplitCondition instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): RuleSplitCondition = js.native
    /**
      * Creates and returns a new RuleSplitCondition instance in the SDK and on the server.
      * The new RuleSplitCondition will be automatically stored in the 'splitCondition' property
      * of the parent ExclusiveSplit element passed as argument.
      */
    def createIn(container: ExclusiveSplit): RuleSplitCondition = js.native
  }
  
  /* static members */
  @js.native
  object SequenceFlow extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new SequenceFlow instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): SequenceFlow = js.native
    /**
      * Creates and returns a new SequenceFlow instance in the SDK and on the server.
      * The new SequenceFlow will be automatically stored in the 'flows' property
      * of the parent MicroflowBase element passed as argument.
      */
    def createIn(container: MicroflowBase): SequenceFlow = js.native
  }
  
  /* static members */
  @js.native
  object ServerSideMicroflow extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object ShowHomePageAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ShowHomePageAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ShowHomePageAction = js.native
    /**
      * Creates and returns a new ShowHomePageAction instance in the SDK and on the server.
      * The new ShowHomePageAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: ActionActivity): ShowHomePageAction = js.native
  }
  
  /* static members */
  @js.native
  object ShowMessageAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ShowMessageAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ShowMessageAction = js.native
    /**
      * Creates and returns a new ShowMessageAction instance in the SDK and on the server.
      * The new ShowMessageAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: ActionActivity): ShowMessageAction = js.native
  }
  
  /* static members */
  @js.native
  object ShowMessageType extends js.Object {
    var Error: ShowMessageType = js.native
    var Information: ShowMessageType = js.native
    var Warning: ShowMessageType = js.native
  }
  
  /* static members */
  @js.native
  object ShowPageAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ShowPageAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ShowPageAction = js.native
    /**
      * Creates and returns a new ShowPageAction instance in the SDK and on the server.
      * The new ShowPageAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: ActionActivity): ShowPageAction = js.native
  }
  
  /* static members */
  @js.native
  object SimpleRequestHandling extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new SimpleRequestHandling instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): SimpleRequestHandling = js.native
    /**
      * Creates and returns a new SimpleRequestHandling instance in the SDK and on the server.
      * The new SimpleRequestHandling will be automatically stored in the 'requestHandling' property
      * of the parent RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    def createInRestCallActionUnderRequestHandling(container: RestCallAction): SimpleRequestHandling = js.native
    /**
      * Creates and returns a new SimpleRequestHandling instance in the SDK and on the server.
      * The new SimpleRequestHandling will be automatically stored in the 'requestBodyHandling' property
      * of the parent WebServiceCallAction element passed as argument.
      */
    def createInWebServiceCallActionUnderRequestBodyHandling(container: WebServiceCallAction): SimpleRequestHandling = js.native
    /**
      * Creates and returns a new SimpleRequestHandling instance in the SDK and on the server.
      * The new SimpleRequestHandling will be automatically stored in the 'requestHeaderHandling' property
      * of the parent WebServiceCallAction element passed as argument.
      */
    def createInWebServiceCallActionUnderRequestHeaderHandling(container: WebServiceCallAction): SimpleRequestHandling = js.native
  }
  
  /* static members */
  @js.native
  object Sort extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new Sort instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): Sort = js.native
    /**
      * Creates and returns a new Sort instance in the SDK and on the server.
      * The new Sort will be automatically stored in the 'operation' property
      * of the parent ListOperationAction element passed as argument.
      */
    def createIn(container: ListOperationAction): Sort = js.native
  }
  
  /* static members */
  @js.native
  object SortItem extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new SortItem instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): SortItem = js.native
    /**
      * Creates and returns a new SortItem instance in the SDK and on the server.
      * The new SortItem will be automatically stored in the 'items' property
      * of the parent SortItemList element passed as argument.
      */
    def createIn(container: SortItemList): SortItem = js.native
  }
  
  /* static members */
  @js.native
  object SortItemList extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new SortItemList instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): SortItemList = js.native
    /**
      * Creates and returns a new SortItemList instance in the SDK and on the server.
      * The new SortItemList will be automatically stored in the 'sortItemList' property
      * of the parent DatabaseRetrieveSource element passed as argument.
      */
    def createInDatabaseRetrieveSourceUnderSortItemList(container: DatabaseRetrieveSource): SortItemList = js.native
    /**
      * Creates and returns a new SortItemList instance in the SDK and on the server.
      * The new SortItemList will be automatically stored in the 'sortItemList' property
      * of the parent Sort element passed as argument.
      */
    def createInSortUnderSortItemList(container: Sort): SortItemList = js.native
  }
  
  /* static members */
  @js.native
  object SortOrderEnum extends js.Object {
    var Ascending: SortOrderEnum = js.native
    var Descending: SortOrderEnum = js.native
  }
  
  /* static members */
  @js.native
  object SplitCondition extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object StartEvent extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new StartEvent instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): StartEvent = js.native
    /**
      * Creates and returns a new StartEvent instance in the SDK and on the server.
      * The new StartEvent will be automatically stored in the 'objects' property
      * of the parent MicroflowObjectCollection element passed as argument.
      */
    def createIn(container: MicroflowObjectCollection): StartEvent = js.native
  }
  
  /* static members */
  @js.native
  object StringTemplate extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new StringTemplate instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): StringTemplate = js.native
    /**
      * Creates and returns a new StringTemplate instance in the SDK and on the server.
      * The new StringTemplate will be automatically stored in the 'template' property
      * of the parent CustomRequestHandling element passed as argument.
      */
    def createInCustomRequestHandlingUnderTemplate(container: CustomRequestHandling): StringTemplate = js.native
    /**
      * Creates and returns a new StringTemplate instance in the SDK and on the server.
      * The new StringTemplate will be automatically stored in the 'customLocationTemplate' property
      * of the parent HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationTemplate(container: HttpConfiguration): StringTemplate = js.native
    /**
      * Creates and returns a new StringTemplate instance in the SDK and on the server.
      * The new StringTemplate will be automatically stored in the 'messageTemplate' property
      * of the parent LogMessageAction element passed as argument.
      */
    def createInLogMessageActionUnderMessageTemplate(container: LogMessageAction): StringTemplate = js.native
  }
  
  /* static members */
  @js.native
  object Subtract extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new Subtract instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): Subtract = js.native
    /**
      * Creates and returns a new Subtract instance in the SDK and on the server.
      * The new Subtract will be automatically stored in the 'operation' property
      * of the parent ListOperationAction element passed as argument.
      */
    def createIn(container: ListOperationAction): Subtract = js.native
  }
  
  /* static members */
  @js.native
  object SynchronizeAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new SynchronizeAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): SynchronizeAction = js.native
    /**
      * Creates and returns a new SynchronizeAction instance in the SDK and on the server.
      * The new SynchronizeAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 and higher
      */
    def createIn(container: ActionActivity): SynchronizeAction = js.native
  }
  
  /* static members */
  @js.native
  object Tail extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new Tail instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): Tail = js.native
    /**
      * Creates and returns a new Tail instance in the SDK and on the server.
      * The new Tail will be automatically stored in the 'operation' property
      * of the parent ListOperationAction element passed as argument.
      */
    def createIn(container: ListOperationAction): Tail = js.native
  }
  
  /* static members */
  @js.native
  object TargetDocumentType extends js.Object {
    var DOC: TargetDocumentType = js.native
    var DOCX: TargetDocumentType = js.native
    var HTML: TargetDocumentType = js.native
    var ODT: TargetDocumentType = js.native
    var PDF: TargetDocumentType = js.native
    var RTF: TargetDocumentType = js.native
  }
  
  /* static members */
  @js.native
  object Template extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object TemplateArgument extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new TemplateArgument instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): TemplateArgument = js.native
    /**
      * Creates and returns a new TemplateArgument instance in the SDK and on the server.
      * The new TemplateArgument will be automatically stored in the 'arguments' property
      * of the parent Template element passed as argument.
      */
    def createIn(container: Template): TemplateArgument = js.native
  }
  
  /* static members */
  @js.native
  object TextTemplate extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new TextTemplate instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): TextTemplate = js.native
    /**
      * Creates and returns a new TextTemplate instance in the SDK and on the server.
      * The new TextTemplate will be automatically stored in the 'template' property
      * of the parent ShowMessageAction element passed as argument.
      */
    def createInShowMessageActionUnderTemplate(container: ShowMessageAction): TextTemplate = js.native
    /**
      * Creates and returns a new TextTemplate instance in the SDK and on the server.
      * The new TextTemplate will be automatically stored in the 'feedbackTemplate' property
      * of the parent ValidationFeedbackAction element passed as argument.
      */
    def createInValidationFeedbackActionUnderFeedbackTemplate(container: ValidationFeedbackAction): TextTemplate = js.native
  }
  
  /* static members */
  @js.native
  object Union extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new Union instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): Union = js.native
    /**
      * Creates and returns a new Union instance in the SDK and on the server.
      * The new Union will be automatically stored in the 'operation' property
      * of the parent ListOperationAction element passed as argument.
      */
    def createIn(container: ListOperationAction): Union = js.native
  }
  
  /* static members */
  @js.native
  object ValidationFeedbackAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ValidationFeedbackAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ValidationFeedbackAction = js.native
    /**
      * Creates and returns a new ValidationFeedbackAction instance in the SDK and on the server.
      * The new ValidationFeedbackAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: ActionActivity): ValidationFeedbackAction = js.native
  }
  
  /* static members */
  @js.native
  object VariableExport extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new VariableExport instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): VariableExport = js.native
    /**
      * Creates and returns a new VariableExport instance in the SDK and on the server.
      * The new VariableExport will be automatically stored in the 'outputMethod' property
      * of the parent ExportXmlAction element passed as argument.
      */
    def createIn(container: ExportXmlAction): VariableExport = js.native
  }
  
  /* static members */
  @js.native
  object WebServiceCallAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new WebServiceCallAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): WebServiceCallAction = js.native
    /**
      * Creates and returns a new WebServiceCallAction instance in the SDK and on the server.
      * The new WebServiceCallAction will be automatically stored in the 'action' property
      * of the parent ActionActivity element passed as argument.
      */
    def createIn(container: ActionActivity): WebServiceCallAction = js.native
  }
  
  /* static members */
  @js.native
  object WebServiceOperationAdvancedParameterMapping extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new WebServiceOperationAdvancedParameterMapping instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): WebServiceOperationAdvancedParameterMapping = js.native
    /**
      * Creates and returns a new WebServiceOperationAdvancedParameterMapping instance in the SDK and on the server.
      * The new WebServiceOperationAdvancedParameterMapping will be automatically stored in the 'parameterMappings' property
      * of the parent AdvancedRequestHandling element passed as argument.
      */
    def createIn(container: AdvancedRequestHandling): WebServiceOperationAdvancedParameterMapping = js.native
  }
  
  /* static members */
  @js.native
  object WebServiceOperationParameterMapping extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object WebServiceOperationSimpleParameterMapping extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new WebServiceOperationSimpleParameterMapping instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): WebServiceOperationSimpleParameterMapping = js.native
    /**
      * Creates and returns a new WebServiceOperationSimpleParameterMapping instance in the SDK and on the server.
      * The new WebServiceOperationSimpleParameterMapping will be automatically stored in the 'parameterMappings' property
      * of the parent SimpleRequestHandling element passed as argument.
      */
    def createIn(container: SimpleRequestHandling): WebServiceOperationSimpleParameterMapping = js.native
  }
  
}

