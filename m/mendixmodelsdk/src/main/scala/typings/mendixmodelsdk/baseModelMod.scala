package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractModelMod.AbstractModel
import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.appservicesMod.appservices.IAppServiceAction
import typings.mendixmodelsdk.appservicesMod.appservices.IAppServiceActionParameter
import typings.mendixmodelsdk.appservicesMod.appservices.IConsumedAppService
import typings.mendixmodelsdk.codeactionsMod.codeactions.ICodeAction
import typings.mendixmodelsdk.constantsMod.constants.IConstant
import typings.mendixmodelsdk.datasetsMod.datasets.IDataSet
import typings.mendixmodelsdk.datasetsMod.datasets.IDataSetParameter
import typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.IDocumentTemplate
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IAssociationBase
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IAttribute
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IDomainModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IRemoteEntitySourceDocument
import typings.mendixmodelsdk.enumerationsMod.enumerations.IEnumeration
import typings.mendixmodelsdk.enumerationsMod.enumerations.IEnumerationValue
import typings.mendixmodelsdk.exportmappingsMod.exportmappings.IExportMapping
import typings.mendixmodelsdk.imagesMod.images.IImage
import typings.mendixmodelsdk.imagesMod.images.IImageCollection
import typings.mendixmodelsdk.importmappingsMod.importmappings.IImportMapping
import typings.mendixmodelsdk.javaactionsMod.javaactions.IJavaAction
import typings.mendixmodelsdk.javaactionsMod.javaactions.IJavaActionParameter
import typings.mendixmodelsdk.javascriptactionsMod.javascriptactions.IJavaScriptAction
import typings.mendixmodelsdk.javascriptactionsMod.javascriptactions.IJavaScriptActionParameter
import typings.mendixmodelsdk.jsonstructuresMod.jsonstructures.IJsonStructure
import typings.mendixmodelsdk.mappingsMod.mappings.IMappingDocument
import typings.mendixmodelsdk.menusMod.menus.IMenuDocument
import typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.IMessageDefinition
import typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.IMessageDefinitionCollection
import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflowBase
import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflowParameter
import typings.mendixmodelsdk.microflowsMod.microflows.INanoflow
import typings.mendixmodelsdk.microflowsMod.microflows.INanoflowParameter
import typings.mendixmodelsdk.microflowsMod.microflows.IRule
import typings.mendixmodelsdk.microflowsMod.microflows.IRuleParameter
import typings.mendixmodelsdk.microflowsMod.microflows.IServerSideMicroflow
import typings.mendixmodelsdk.nativepagesMod.nativepages.INativeLayout
import typings.mendixmodelsdk.nativepagesMod.nativepages.INativePage
import typings.mendixmodelsdk.navigationMod.navigation.INavigationDocument
import typings.mendixmodelsdk.navigationMod.navigation.INavigationProfile
import typings.mendixmodelsdk.pagesMod.pages.IBuildingBlock
import typings.mendixmodelsdk.pagesMod.pages.IFormBase
import typings.mendixmodelsdk.pagesMod.pages.ILayout
import typings.mendixmodelsdk.pagesMod.pages.ILayoutParameter
import typings.mendixmodelsdk.pagesMod.pages.IPage
import typings.mendixmodelsdk.pagesMod.pages.IPageTemplate
import typings.mendixmodelsdk.pagesMod.pages.ISnippet
import typings.mendixmodelsdk.pagesMod.pages.ITemplateFormBase
import typings.mendixmodelsdk.projectsMod.projects.IDocument
import typings.mendixmodelsdk.projectsMod.projects.IFolder
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.projectsMod.projects.IModule
import typings.mendixmodelsdk.projectsMod.projects.IModuleDocument
import typings.mendixmodelsdk.projectsMod.projects.IProject
import typings.mendixmodelsdk.projectsMod.projects.IProjectConversion
import typings.mendixmodelsdk.projectsMod.projects.IProjectDocument
import typings.mendixmodelsdk.regularexpressionsMod.regularexpressions.IRegularExpression
import typings.mendixmodelsdk.restMod.rest.IConsumedODataService
import typings.mendixmodelsdk.restMod.rest.IPublishedODataService
import typings.mendixmodelsdk.restMod.rest.IPublishedRestService
import typings.mendixmodelsdk.scheduledeventsMod.scheduledevents.IScheduledEvent
import typings.mendixmodelsdk.securityMod.security.IModuleRole
import typings.mendixmodelsdk.securityMod.security.IModuleSecurity
import typings.mendixmodelsdk.securityMod.security.IProjectSecurity
import typings.mendixmodelsdk.securityMod.security.IUserRole
import typings.mendixmodelsdk.settingsMod.settings.IProjectSettings
import typings.mendixmodelsdk.textsMod.texts.ISystemTextCollection
import typings.mendixmodelsdk.webservicesMod.webservices.IImportedWebService
import typings.mendixmodelsdk.webservicesMod.webservices.IPublishedAppService
import typings.mendixmodelsdk.webservicesMod.webservices.IPublishedServiceBase
import typings.mendixmodelsdk.webservicesMod.webservices.IPublishedWebService
import typings.mendixmodelsdk.xmlschemasMod.xmlschemas.IMxSchema
import typings.mendixmodelsdk.xmlschemasMod.xmlschemas.IXmlSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/base-model", JSImport.Namespace)
@js.native
object baseModelMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.abstractModelMod.IAbstractModel because Already inherited
  - typings.mendixmodelsdk.baseModelMod.IBaseModel because var conflicts: id, metaModelVersion, mxVersionForModel, workingCopy. Inlined allBuildingBlocks, allCodeActions, allConstants, allConsumedAppServices, allConsumedODataServices, allDataSets, allDocuments, allDocumentTemplates, allDomainModels, allEnumerations, allExportMappings, allFolders, allFolderBases, allFormBases, allImageCollections, allImportMappings, allImportedWebServices, allJavaActions, allJavaScriptActions, allJsonStructures, allLayouts, allMappingDocuments, allMenuDocuments, allMessageDefinitionCollections, allMicroflows, allMicroflowBases, allModules, allModuleDocuments, allModuleSecurities, allMxSchemas, allNanoflows, allNativeLayouts, allNativePages, allNavigationDocuments, allPages, allPageTemplates, allProjects, allProjectConversions, allProjectDocuments, allProjectSecurities, allProjectSettings, allPublishedAppServices, allPublishedODataServices, allPublishedRestServices, allPublishedServiceBases, allPublishedWebServices, allRegularExpressions, allRemoteEntitySourceDocuments, allRules, allScheduledEvents, allServerSideMicroflows, allSnippets, allSystemTextCollections, allTemplateFormBases, allXmlSchemas, findAppServiceActionByQualifiedName, findAppServiceActionParameterByQualifiedName, findConstantByQualifiedName, findDataSetByQualifiedName, findDataSetParameterByQualifiedName, findDocumentTemplateByQualifiedName, findAssociationBaseByQualifiedName, findAttributeByQualifiedName, findEntityByQualifiedName, findRemoteEntitySourceDocumentByQualifiedName, findEnumerationByQualifiedName, findEnumerationValueByQualifiedName, findExportMappingByQualifiedName, findImageByQualifiedName, findImportMappingByQualifiedName, findJavaActionByQualifiedName, findJavaActionParameterByQualifiedName, findJavaScriptActionByQualifiedName, findJavaScriptActionParameterByQualifiedName, findJsonStructureByQualifiedName, findMenuDocumentByQualifiedName, findMessageDefinitionByQualifiedName, findMicroflowByQualifiedName, findMicroflowParameterByQualifiedName, findNanoflowByQualifiedName, findNanoflowParameterByQualifiedName, findRuleByQualifiedName, findRuleParameterByQualifiedName, findNativeLayoutByQualifiedName, findNativePageByQualifiedName, findNavigationProfileByQualifiedName, findLayoutByQualifiedName, findLayoutParameterByQualifiedName, findPageByQualifiedName, findSnippetByQualifiedName, findRegularExpressionByQualifiedName, findModuleRoleByQualifiedName, findUserRoleByQualifiedName, findImportedWebServiceByQualifiedName, findXmlSchemaByQualifiedName */ @js.native
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

