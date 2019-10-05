package typings.mendixmodelsdk

import typings.mendixmodelsdk.distGenAppservicesMod.appservices.IAppServiceAction
import typings.mendixmodelsdk.distGenAppservicesMod.appservices.IAppServiceActionParameter
import typings.mendixmodelsdk.distGenAppservicesMod.appservices.IConsumedAppService
import typings.mendixmodelsdk.distGenBaseDashModelMod.IBaseModel
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactions.ICodeAction
import typings.mendixmodelsdk.distGenConstantsMod.constants.IConstant
import typings.mendixmodelsdk.distGenDatasetsMod.datasets.IDataSet
import typings.mendixmodelsdk.distGenDatasetsMod.datasets.IDataSetParameter
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.IDocumentTemplate
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IAssociationBase
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IAttribute
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IDomainModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IRemoteEntitySourceDocument
import typings.mendixmodelsdk.distGenEnumerationsMod.enumerations.IEnumeration
import typings.mendixmodelsdk.distGenEnumerationsMod.enumerations.IEnumerationValue
import typings.mendixmodelsdk.distGenExportmappingsMod.exportmappings.IExportMapping
import typings.mendixmodelsdk.distGenImagesMod.images.IImage
import typings.mendixmodelsdk.distGenImagesMod.images.IImageCollection
import typings.mendixmodelsdk.distGenImportmappingsMod.importmappings.IImportMapping
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactions.IJavaAction
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactions.IJavaActionParameter
import typings.mendixmodelsdk.distGenJavascriptactionsMod.javascriptactions.IJavaScriptAction
import typings.mendixmodelsdk.distGenJavascriptactionsMod.javascriptactions.IJavaScriptActionParameter
import typings.mendixmodelsdk.distGenJsonstructuresMod.jsonstructures.IJsonStructure
import typings.mendixmodelsdk.distGenMappingsMod.mappings.IMappingDocument
import typings.mendixmodelsdk.distGenMenusMod.menus.IMenuDocument
import typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitions.IMessageDefinition
import typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitions.IMessageDefinitionCollection
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.IMicroflowBase
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.IMicroflowParameter
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.INanoflow
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.INanoflowParameter
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.IRule
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.IRuleParameter
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.IServerSideMicroflow
import typings.mendixmodelsdk.distGenNativepagesMod.nativepages.INativeLayout
import typings.mendixmodelsdk.distGenNativepagesMod.nativepages.INativePage
import typings.mendixmodelsdk.distGenNavigationMod.navigation.INavigationDocument
import typings.mendixmodelsdk.distGenNavigationMod.navigation.INavigationProfile
import typings.mendixmodelsdk.distGenPagesMod.pages.IBuildingBlock
import typings.mendixmodelsdk.distGenPagesMod.pages.IFormBase
import typings.mendixmodelsdk.distGenPagesMod.pages.ILayout
import typings.mendixmodelsdk.distGenPagesMod.pages.ILayoutParameter
import typings.mendixmodelsdk.distGenPagesMod.pages.IPage
import typings.mendixmodelsdk.distGenPagesMod.pages.IPageTemplate
import typings.mendixmodelsdk.distGenPagesMod.pages.ISnippet
import typings.mendixmodelsdk.distGenPagesMod.pages.ITemplateFormBase
import typings.mendixmodelsdk.distGenProjectsMod.projects.IDocument
import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolder
import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.distGenProjectsMod.projects.IModule
import typings.mendixmodelsdk.distGenProjectsMod.projects.IModuleDocument
import typings.mendixmodelsdk.distGenProjectsMod.projects.IProject
import typings.mendixmodelsdk.distGenProjectsMod.projects.IProjectConversion
import typings.mendixmodelsdk.distGenProjectsMod.projects.IProjectDocument
import typings.mendixmodelsdk.distGenRegularexpressionsMod.regularexpressions.IRegularExpression
import typings.mendixmodelsdk.distGenRestMod.rest.IConsumedODataService
import typings.mendixmodelsdk.distGenRestMod.rest.IPublishedODataService
import typings.mendixmodelsdk.distGenRestMod.rest.IPublishedRestService
import typings.mendixmodelsdk.distGenScheduledeventsMod.scheduledevents.IScheduledEvent
import typings.mendixmodelsdk.distGenSecurityMod.security.IModuleRole
import typings.mendixmodelsdk.distGenSecurityMod.security.IModuleSecurity
import typings.mendixmodelsdk.distGenSecurityMod.security.IProjectSecurity
import typings.mendixmodelsdk.distGenSecurityMod.security.IUserRole
import typings.mendixmodelsdk.distGenSettingsMod.settings.IProjectSettings
import typings.mendixmodelsdk.distGenTextsMod.texts.ISystemTextCollection
import typings.mendixmodelsdk.distGenWebservicesMod.webservices.IImportedWebService
import typings.mendixmodelsdk.distGenWebservicesMod.webservices.IPublishedAppService
import typings.mendixmodelsdk.distGenWebservicesMod.webservices.IPublishedServiceBase
import typings.mendixmodelsdk.distGenWebservicesMod.webservices.IPublishedWebService
import typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemas.IMxSchema
import typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemas.IXmlSchema
import typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod.IAbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/base-model", JSImport.Namespace)
@js.native
object distGenBaseDashModelMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod.IAbstractModel because Already inherited
  - typings.mendixmodelsdk.distGenBaseDashModelMod.IBaseModel because var conflicts: id, metaModelVersion, mxVersionForModel, workingCopy. Inlined allBuildingBlocks, allCodeActions, allConstants, allConsumedAppServices, allConsumedODataServices, allDataSets, allDocuments, allDocumentTemplates, allDomainModels, allEnumerations, allExportMappings, allFolders, allFolderBases, allFormBases, allImageCollections, allImportMappings, allImportedWebServices, allJavaActions, allJavaScriptActions, allJsonStructures, allLayouts, allMappingDocuments, allMenuDocuments, allMessageDefinitionCollections, allMicroflows, allMicroflowBases, allModules, allModuleDocuments, allModuleSecurities, allMxSchemas, allNanoflows, allNativeLayouts, allNativePages, allNavigationDocuments, allPages, allPageTemplates, allProjects, allProjectConversions, allProjectDocuments, allProjectSecurities, allProjectSettings, allPublishedAppServices, allPublishedODataServices, allPublishedRestServices, allPublishedServiceBases, allPublishedWebServices, allRegularExpressions, allRemoteEntitySourceDocuments, allRules, allScheduledEvents, allServerSideMicroflows, allSnippets, allSystemTextCollections, allTemplateFormBases, allXmlSchemas, findAppServiceActionByQualifiedName, findAppServiceActionParameterByQualifiedName, findConstantByQualifiedName, findDataSetByQualifiedName, findDataSetParameterByQualifiedName, findDocumentTemplateByQualifiedName, findAssociationBaseByQualifiedName, findAttributeByQualifiedName, findEntityByQualifiedName, findRemoteEntitySourceDocumentByQualifiedName, findEnumerationByQualifiedName, findEnumerationValueByQualifiedName, findExportMappingByQualifiedName, findImageByQualifiedName, findImportMappingByQualifiedName, findJavaActionByQualifiedName, findJavaActionParameterByQualifiedName, findJavaScriptActionByQualifiedName, findJavaScriptActionParameterByQualifiedName, findJsonStructureByQualifiedName, findMenuDocumentByQualifiedName, findMessageDefinitionByQualifiedName, findMicroflowByQualifiedName, findMicroflowParameterByQualifiedName, findNanoflowByQualifiedName, findNanoflowParameterByQualifiedName, findRuleByQualifiedName, findRuleParameterByQualifiedName, findNativeLayoutByQualifiedName, findNativePageByQualifiedName, findNavigationProfileByQualifiedName, findLayoutByQualifiedName, findLayoutParameterByQualifiedName, findPageByQualifiedName, findSnippetByQualifiedName, findRegularExpressionByQualifiedName, findModuleRoleByQualifiedName, findUserRoleByQualifiedName, findImportedWebServiceByQualifiedName, findXmlSchemaByQualifiedName */ @js.native
  abstract class BaseModel () extends AbstractModel {
    def allBuildingBlocks(): js.Array[IBuildingBlock] = js.native
    def allCodeActions(): js.Array[ICodeAction] = js.native
    def allConstants(): js.Array[IConstant] = js.native
    def allConsumedAppServices(): js.Array[IConsumedAppService] = js.native
    def allConsumedODataServices(): js.Array[IConsumedODataService] = js.native
    def allDataSets(): js.Array[IDataSet] = js.native
    def allDocumentTemplates(): js.Array[IDocumentTemplate] = js.native
    def allDocuments(): js.Array[IDocument] = js.native
    def allDomainModels(): js.Array[IDomainModel] = js.native
    def allEnumerations(): js.Array[IEnumeration] = js.native
    def allExportMappings(): js.Array[IExportMapping] = js.native
    def allFolderBases(): js.Array[IFolderBase] = js.native
    def allFolders(): js.Array[IFolder] = js.native
    def allFormBases(): js.Array[IFormBase] = js.native
    def allImageCollections(): js.Array[IImageCollection] = js.native
    def allImportMappings(): js.Array[IImportMapping] = js.native
    def allImportedWebServices(): js.Array[IImportedWebService] = js.native
    def allJavaActions(): js.Array[IJavaAction] = js.native
    def allJavaScriptActions(): js.Array[IJavaScriptAction] = js.native
    def allJsonStructures(): js.Array[IJsonStructure] = js.native
    def allLayouts(): js.Array[ILayout] = js.native
    def allMappingDocuments(): js.Array[IMappingDocument] = js.native
    def allMenuDocuments(): js.Array[IMenuDocument] = js.native
    def allMessageDefinitionCollections(): js.Array[IMessageDefinitionCollection] = js.native
    def allMicroflowBases(): js.Array[IMicroflowBase] = js.native
    def allMicroflows(): js.Array[IMicroflow] = js.native
    def allModuleDocuments(): js.Array[IModuleDocument] = js.native
    def allModuleSecurities(): js.Array[IModuleSecurity] = js.native
    def allModules(): js.Array[IModule] = js.native
    def allMxSchemas(): js.Array[IMxSchema] = js.native
    def allNanoflows(): js.Array[INanoflow] = js.native
    def allNativeLayouts(): js.Array[INativeLayout] = js.native
    def allNativePages(): js.Array[INativePage] = js.native
    def allNavigationDocuments(): js.Array[INavigationDocument] = js.native
    def allPageTemplates(): js.Array[IPageTemplate] = js.native
    def allPages(): js.Array[IPage] = js.native
    def allProjectConversions(): js.Array[IProjectConversion] = js.native
    def allProjectDocuments(): js.Array[IProjectDocument] = js.native
    def allProjectSecurities(): js.Array[IProjectSecurity] = js.native
    def allProjectSettings(): js.Array[IProjectSettings] = js.native
    def allProjects(): js.Array[IProject] = js.native
    def allPublishedAppServices(): js.Array[IPublishedAppService] = js.native
    def allPublishedODataServices(): js.Array[IPublishedODataService] = js.native
    def allPublishedRestServices(): js.Array[IPublishedRestService] = js.native
    def allPublishedServiceBases(): js.Array[IPublishedServiceBase] = js.native
    def allPublishedWebServices(): js.Array[IPublishedWebService] = js.native
    def allRegularExpressions(): js.Array[IRegularExpression] = js.native
    def allRemoteEntitySourceDocuments(): js.Array[IRemoteEntitySourceDocument] = js.native
    def allRules(): js.Array[IRule] = js.native
    def allScheduledEvents(): js.Array[IScheduledEvent] = js.native
    def allServerSideMicroflows(): js.Array[IServerSideMicroflow] = js.native
    def allSnippets(): js.Array[ISnippet] = js.native
    def allSystemTextCollections(): js.Array[ISystemTextCollection] = js.native
    def allTemplateFormBases(): js.Array[ITemplateFormBase] = js.native
    def allXmlSchemas(): js.Array[IXmlSchema] = js.native
    def findAppServiceActionByQualifiedName(qname: String): IAppServiceAction = js.native
    def findAppServiceActionParameterByQualifiedName(qname: String): IAppServiceActionParameter = js.native
    def findAssociationBaseByQualifiedName(qname: String): IAssociationBase = js.native
    def findAttributeByQualifiedName(qname: String): IAttribute = js.native
    def findConstantByQualifiedName(qname: String): IConstant = js.native
    def findDataSetByQualifiedName(qname: String): IDataSet = js.native
    def findDataSetParameterByQualifiedName(qname: String): IDataSetParameter = js.native
    def findDocumentTemplateByQualifiedName(qname: String): IDocumentTemplate = js.native
    def findEntityByQualifiedName(qname: String): IEntity = js.native
    def findEnumerationByQualifiedName(qname: String): IEnumeration = js.native
    def findEnumerationValueByQualifiedName(qname: String): IEnumerationValue = js.native
    def findExportMappingByQualifiedName(qname: String): IExportMapping = js.native
    def findImageByQualifiedName(qname: String): IImage = js.native
    def findImportMappingByQualifiedName(qname: String): IImportMapping = js.native
    def findImportedWebServiceByQualifiedName(qname: String): IImportedWebService = js.native
    def findJavaActionByQualifiedName(qname: String): IJavaAction = js.native
    def findJavaActionParameterByQualifiedName(qname: String): IJavaActionParameter = js.native
    def findJavaScriptActionByQualifiedName(qname: String): IJavaScriptAction = js.native
    def findJavaScriptActionParameterByQualifiedName(qname: String): IJavaScriptActionParameter = js.native
    def findJsonStructureByQualifiedName(qname: String): IJsonStructure = js.native
    def findLayoutByQualifiedName(qname: String): ILayout = js.native
    def findLayoutParameterByQualifiedName(qname: String): ILayoutParameter = js.native
    def findMenuDocumentByQualifiedName(qname: String): IMenuDocument = js.native
    def findMessageDefinitionByQualifiedName(qname: String): IMessageDefinition = js.native
    def findMicroflowByQualifiedName(qname: String): IMicroflow = js.native
    def findMicroflowParameterByQualifiedName(qname: String): IMicroflowParameter = js.native
    def findModuleRoleByQualifiedName(qname: String): IModuleRole = js.native
    def findNanoflowByQualifiedName(qname: String): INanoflow = js.native
    def findNanoflowParameterByQualifiedName(qname: String): INanoflowParameter = js.native
    def findNativeLayoutByQualifiedName(qname: String): INativeLayout = js.native
    def findNativePageByQualifiedName(qname: String): INativePage = js.native
    def findNavigationProfileByQualifiedName(qname: String): INavigationProfile = js.native
    def findPageByQualifiedName(qname: String): IPage = js.native
    def findRegularExpressionByQualifiedName(qname: String): IRegularExpression = js.native
    def findRemoteEntitySourceDocumentByQualifiedName(qname: String): IRemoteEntitySourceDocument = js.native
    def findRuleByQualifiedName(qname: String): IRule = js.native
    def findRuleParameterByQualifiedName(qname: String): IRuleParameter = js.native
    def findSnippetByQualifiedName(qname: String): ISnippet = js.native
    def findUserRoleByQualifiedName(qname: String): IUserRole = js.native
    def findXmlSchemaByQualifiedName(qname: String): IXmlSchema = js.native
  }
  
  @js.native
  trait IBaseModel extends IAbstractModel {
    def allBuildingBlocks(): js.Array[IBuildingBlock] = js.native
    def allCodeActions(): js.Array[ICodeAction] = js.native
    def allConstants(): js.Array[IConstant] = js.native
    def allConsumedAppServices(): js.Array[IConsumedAppService] = js.native
    def allConsumedODataServices(): js.Array[IConsumedODataService] = js.native
    def allDataSets(): js.Array[IDataSet] = js.native
    def allDocumentTemplates(): js.Array[IDocumentTemplate] = js.native
    def allDocuments(): js.Array[IDocument] = js.native
    def allDomainModels(): js.Array[IDomainModel] = js.native
    def allEnumerations(): js.Array[IEnumeration] = js.native
    def allExportMappings(): js.Array[IExportMapping] = js.native
    def allFolderBases(): js.Array[IFolderBase] = js.native
    def allFolders(): js.Array[IFolder] = js.native
    def allFormBases(): js.Array[IFormBase] = js.native
    def allImageCollections(): js.Array[IImageCollection] = js.native
    def allImportMappings(): js.Array[IImportMapping] = js.native
    def allImportedWebServices(): js.Array[IImportedWebService] = js.native
    def allJavaActions(): js.Array[IJavaAction] = js.native
    def allJavaScriptActions(): js.Array[IJavaScriptAction] = js.native
    def allJsonStructures(): js.Array[IJsonStructure] = js.native
    def allLayouts(): js.Array[ILayout] = js.native
    def allMappingDocuments(): js.Array[IMappingDocument] = js.native
    def allMenuDocuments(): js.Array[IMenuDocument] = js.native
    def allMessageDefinitionCollections(): js.Array[IMessageDefinitionCollection] = js.native
    def allMicroflowBases(): js.Array[IMicroflowBase] = js.native
    def allMicroflows(): js.Array[IMicroflow] = js.native
    def allModuleDocuments(): js.Array[IModuleDocument] = js.native
    def allModuleSecurities(): js.Array[IModuleSecurity] = js.native
    def allModules(): js.Array[IModule] = js.native
    def allMxSchemas(): js.Array[IMxSchema] = js.native
    def allNanoflows(): js.Array[INanoflow] = js.native
    def allNativeLayouts(): js.Array[INativeLayout] = js.native
    def allNativePages(): js.Array[INativePage] = js.native
    def allNavigationDocuments(): js.Array[INavigationDocument] = js.native
    def allPageTemplates(): js.Array[IPageTemplate] = js.native
    def allPages(): js.Array[IPage] = js.native
    def allProjectConversions(): js.Array[IProjectConversion] = js.native
    def allProjectDocuments(): js.Array[IProjectDocument] = js.native
    def allProjectSecurities(): js.Array[IProjectSecurity] = js.native
    def allProjectSettings(): js.Array[IProjectSettings] = js.native
    def allProjects(): js.Array[IProject] = js.native
    def allPublishedAppServices(): js.Array[IPublishedAppService] = js.native
    def allPublishedODataServices(): js.Array[IPublishedODataService] = js.native
    def allPublishedRestServices(): js.Array[IPublishedRestService] = js.native
    def allPublishedServiceBases(): js.Array[IPublishedServiceBase] = js.native
    def allPublishedWebServices(): js.Array[IPublishedWebService] = js.native
    def allRegularExpressions(): js.Array[IRegularExpression] = js.native
    def allRemoteEntitySourceDocuments(): js.Array[IRemoteEntitySourceDocument] = js.native
    def allRules(): js.Array[IRule] = js.native
    def allScheduledEvents(): js.Array[IScheduledEvent] = js.native
    def allServerSideMicroflows(): js.Array[IServerSideMicroflow] = js.native
    def allSnippets(): js.Array[ISnippet] = js.native
    def allSystemTextCollections(): js.Array[ISystemTextCollection] = js.native
    def allTemplateFormBases(): js.Array[ITemplateFormBase] = js.native
    def allXmlSchemas(): js.Array[IXmlSchema] = js.native
    def findAppServiceActionByQualifiedName(qname: String): IAppServiceAction = js.native
    def findAppServiceActionParameterByQualifiedName(qname: String): IAppServiceActionParameter = js.native
    def findAssociationBaseByQualifiedName(qname: String): IAssociationBase = js.native
    def findAttributeByQualifiedName(qname: String): IAttribute = js.native
    def findConstantByQualifiedName(qname: String): IConstant = js.native
    def findDataSetByQualifiedName(qname: String): IDataSet = js.native
    def findDataSetParameterByQualifiedName(qname: String): IDataSetParameter = js.native
    def findDocumentTemplateByQualifiedName(qname: String): IDocumentTemplate = js.native
    def findEntityByQualifiedName(qname: String): IEntity = js.native
    def findEnumerationByQualifiedName(qname: String): IEnumeration = js.native
    def findEnumerationValueByQualifiedName(qname: String): IEnumerationValue = js.native
    def findExportMappingByQualifiedName(qname: String): IExportMapping = js.native
    def findImageByQualifiedName(qname: String): IImage = js.native
    def findImportMappingByQualifiedName(qname: String): IImportMapping = js.native
    def findImportedWebServiceByQualifiedName(qname: String): IImportedWebService = js.native
    def findJavaActionByQualifiedName(qname: String): IJavaAction = js.native
    def findJavaActionParameterByQualifiedName(qname: String): IJavaActionParameter = js.native
    def findJavaScriptActionByQualifiedName(qname: String): IJavaScriptAction = js.native
    def findJavaScriptActionParameterByQualifiedName(qname: String): IJavaScriptActionParameter = js.native
    def findJsonStructureByQualifiedName(qname: String): IJsonStructure = js.native
    def findLayoutByQualifiedName(qname: String): ILayout = js.native
    def findLayoutParameterByQualifiedName(qname: String): ILayoutParameter = js.native
    def findMenuDocumentByQualifiedName(qname: String): IMenuDocument = js.native
    def findMessageDefinitionByQualifiedName(qname: String): IMessageDefinition = js.native
    def findMicroflowByQualifiedName(qname: String): IMicroflow = js.native
    def findMicroflowParameterByQualifiedName(qname: String): IMicroflowParameter = js.native
    def findModuleRoleByQualifiedName(qname: String): IModuleRole = js.native
    def findNanoflowByQualifiedName(qname: String): INanoflow = js.native
    def findNanoflowParameterByQualifiedName(qname: String): INanoflowParameter = js.native
    def findNativeLayoutByQualifiedName(qname: String): INativeLayout = js.native
    def findNativePageByQualifiedName(qname: String): INativePage = js.native
    def findNavigationProfileByQualifiedName(qname: String): INavigationProfile = js.native
    def findPageByQualifiedName(qname: String): IPage = js.native
    def findRegularExpressionByQualifiedName(qname: String): IRegularExpression = js.native
    def findRemoteEntitySourceDocumentByQualifiedName(qname: String): IRemoteEntitySourceDocument = js.native
    def findRuleByQualifiedName(qname: String): IRule = js.native
    def findRuleParameterByQualifiedName(qname: String): IRuleParameter = js.native
    def findSnippetByQualifiedName(qname: String): ISnippet = js.native
    def findUserRoleByQualifiedName(qname: String): IUserRole = js.native
    def findXmlSchemaByQualifiedName(qname: String): IXmlSchema = js.native
  }
  
  @js.native
  trait IModel extends IBaseModel {
    /**
      * The actual contents of the model.
      */
    var root: IProject = js.native
    /**
      * Given a qualified name, returns a Module.
      */
    def findModuleByQualifiedName(qualifiedName: String): IModule | Null = js.native
  }
  
}

