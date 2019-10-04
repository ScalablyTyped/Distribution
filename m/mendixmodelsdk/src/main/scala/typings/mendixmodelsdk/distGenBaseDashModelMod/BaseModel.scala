package typings.mendixmodelsdk.distGenBaseDashModelMod

import typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.IAppServiceAction
import typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.IAppServiceActionParameter
import typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.IConsumedAppService
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.ICodeAction
import typings.mendixmodelsdk.distGenConstantsMod.constantsNs.IConstant
import typings.mendixmodelsdk.distGenDatasetsMod.datasetsNs.IDataSet
import typings.mendixmodelsdk.distGenDatasetsMod.datasetsNs.IDataSetParameter
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.IDocumentTemplate
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IAssociationBase
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IAttribute
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IDomainModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IEntity
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IRemoteEntitySourceDocument
import typings.mendixmodelsdk.distGenEnumerationsMod.enumerationsNs.IEnumeration
import typings.mendixmodelsdk.distGenEnumerationsMod.enumerationsNs.IEnumerationValue
import typings.mendixmodelsdk.distGenExportmappingsMod.exportmappingsNs.IExportMapping
import typings.mendixmodelsdk.distGenImagesMod.imagesNs.IImage
import typings.mendixmodelsdk.distGenImagesMod.imagesNs.IImageCollection
import typings.mendixmodelsdk.distGenImportmappingsMod.importmappingsNs.IImportMapping
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IJavaAction
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IJavaActionParameter
import typings.mendixmodelsdk.distGenJavascriptactionsMod.javascriptactionsNs.IJavaScriptAction
import typings.mendixmodelsdk.distGenJavascriptactionsMod.javascriptactionsNs.IJavaScriptActionParameter
import typings.mendixmodelsdk.distGenJsonstructuresMod.jsonstructuresNs.IJsonStructure
import typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.IMappingDocument
import typings.mendixmodelsdk.distGenMenusMod.menusNs.IMenuDocument
import typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.IMessageDefinition
import typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.IMessageDefinitionCollection
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.IMicroflow
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.IMicroflowBase
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.IMicroflowParameter
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.INanoflow
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.INanoflowParameter
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.IRule
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.IRuleParameter
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.IServerSideMicroflow
import typings.mendixmodelsdk.distGenNativepagesMod.nativepagesNs.INativeLayout
import typings.mendixmodelsdk.distGenNativepagesMod.nativepagesNs.INativePage
import typings.mendixmodelsdk.distGenNavigationMod.navigationNs.INavigationDocument
import typings.mendixmodelsdk.distGenNavigationMod.navigationNs.INavigationProfile
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.IBuildingBlock
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.IFormBase
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.ILayout
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.ILayoutParameter
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.IPage
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.IPageTemplate
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.ISnippet
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.ITemplateFormBase
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IDocument
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IFolder
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IFolderBase
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IModule
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IModuleDocument
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IProject
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IProjectConversion
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IProjectDocument
import typings.mendixmodelsdk.distGenRegularexpressionsMod.regularexpressionsNs.IRegularExpression
import typings.mendixmodelsdk.distGenRestMod.restNs.IConsumedODataService
import typings.mendixmodelsdk.distGenRestMod.restNs.IPublishedODataService
import typings.mendixmodelsdk.distGenRestMod.restNs.IPublishedRestService
import typings.mendixmodelsdk.distGenScheduledeventsMod.scheduledeventsNs.IScheduledEvent
import typings.mendixmodelsdk.distGenSecurityMod.securityNs.IModuleRole
import typings.mendixmodelsdk.distGenSecurityMod.securityNs.IModuleSecurity
import typings.mendixmodelsdk.distGenSecurityMod.securityNs.IProjectSecurity
import typings.mendixmodelsdk.distGenSecurityMod.securityNs.IUserRole
import typings.mendixmodelsdk.distGenSettingsMod.settingsNs.IProjectSettings
import typings.mendixmodelsdk.distGenTextsMod.textsNs.ISystemTextCollection
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.IImportedWebService
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.IPublishedAppService
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.IPublishedServiceBase
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.IPublishedWebService
import typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.IMxSchema
import typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.IXmlSchema
import typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distGenBaseDashModelMod.IBaseModel because var conflicts: id, metaModelVersion, mxVersionForModel, workingCopy. Inlined allBuildingBlocks, allCodeActions, allConstants, allConsumedAppServices, allConsumedODataServices, allDataSets, allDocuments, allDocumentTemplates, allDomainModels, allEnumerations, allExportMappings, allFolders, allFolderBases, allFormBases, allImageCollections, allImportMappings, allImportedWebServices, allJavaActions, allJavaScriptActions, allJsonStructures, allLayouts, allMappingDocuments, allMenuDocuments, allMessageDefinitionCollections, allMicroflows, allMicroflowBases, allModules, allModuleDocuments, allModuleSecurities, allMxSchemas, allNanoflows, allNativeLayouts, allNativePages, allNavigationDocuments, allPages, allPageTemplates, allProjects, allProjectConversions, allProjectDocuments, allProjectSecurities, allProjectSettings, allPublishedAppServices, allPublishedODataServices, allPublishedRestServices, allPublishedServiceBases, allPublishedWebServices, allRegularExpressions, allRemoteEntitySourceDocuments, allRules, allScheduledEvents, allServerSideMicroflows, allSnippets, allSystemTextCollections, allTemplateFormBases, allXmlSchemas, findAppServiceActionByQualifiedName, findAppServiceActionParameterByQualifiedName, findConstantByQualifiedName, findDataSetByQualifiedName, findDataSetParameterByQualifiedName, findDocumentTemplateByQualifiedName, findAssociationBaseByQualifiedName, findAttributeByQualifiedName, findEntityByQualifiedName, findRemoteEntitySourceDocumentByQualifiedName, findEnumerationByQualifiedName, findEnumerationValueByQualifiedName, findExportMappingByQualifiedName, findImageByQualifiedName, findImportMappingByQualifiedName, findJavaActionByQualifiedName, findJavaActionParameterByQualifiedName, findJavaScriptActionByQualifiedName, findJavaScriptActionParameterByQualifiedName, findJsonStructureByQualifiedName, findMenuDocumentByQualifiedName, findMessageDefinitionByQualifiedName, findMicroflowByQualifiedName, findMicroflowParameterByQualifiedName, findNanoflowByQualifiedName, findNanoflowParameterByQualifiedName, findRuleByQualifiedName, findRuleParameterByQualifiedName, findNativeLayoutByQualifiedName, findNativePageByQualifiedName, findNavigationProfileByQualifiedName, findLayoutByQualifiedName, findLayoutParameterByQualifiedName, findPageByQualifiedName, findSnippetByQualifiedName, findRegularExpressionByQualifiedName, findModuleRoleByQualifiedName, findUserRoleByQualifiedName, findImportedWebServiceByQualifiedName, findXmlSchemaByQualifiedName */ @JSImport("mendixmodelsdk/dist/gen/base-model", "BaseModel")
@js.native
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

