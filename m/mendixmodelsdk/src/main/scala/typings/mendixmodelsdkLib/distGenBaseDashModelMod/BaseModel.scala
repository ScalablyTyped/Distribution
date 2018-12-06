package typings
package mendixmodelsdkLib.distGenBaseDashModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenBaseDashModelMod.IBaseModel because Would inherit conflicting mutable fields List(mxVersionForModel, id, workingCopy, metaModelVersion))*/
@JSImport("mendixmodelsdk/dist/gen/base-model", "BaseModel")
@js.native
abstract class BaseModel ()
  extends mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.AbstractModel {
  def allBuildingBlocks(): js.Array[mendixmodelsdkLib.distGenPagesMod.pagesNs.IBuildingBlock] = js.native
  def allCodeActions(): js.Array[mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.ICodeAction] = js.native
  def allConstants(): js.Array[mendixmodelsdkLib.distGenConstantsMod.constantsNs.IConstant] = js.native
  def allConsumedAppServices(): js.Array[mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.IConsumedAppService] = js.native
  def allConsumedODataServices(): js.Array[mendixmodelsdkLib.distGenRestMod.restNs.IConsumedODataService] = js.native
  def allDataSets(): js.Array[mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.IDataSet] = js.native
  def allDocumentTemplates(): js.Array[
    mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.IDocumentTemplate
  ] = js.native
  def allDocuments(): js.Array[mendixmodelsdkLib.distGenProjectsMod.projectsNs.IDocument] = js.native
  def allDomainModels(): js.Array[mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IDomainModel] = js.native
  def allEnumerations(): js.Array[mendixmodelsdkLib.distGenEnumerationsMod.enumerationsNs.IEnumeration] = js.native
  def allExportMappings(): js.Array[mendixmodelsdkLib.distGenExportmappingsMod.exportmappingsNs.IExportMapping] = js.native
  def allFolderBases(): js.Array[mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase] = js.native
  def allFolders(): js.Array[mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolder] = js.native
  def allFormBases(): js.Array[mendixmodelsdkLib.distGenPagesMod.pagesNs.IFormBase] = js.native
  def allImageCollections(): js.Array[mendixmodelsdkLib.distGenImagesMod.imagesNs.IImageCollection] = js.native
  def allImportMappings(): js.Array[mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.IImportMapping] = js.native
  def allImportedWebServices(): js.Array[mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.IImportedWebService] = js.native
  def allJavaActions(): js.Array[mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.IJavaAction] = js.native
  def allJavaScriptActions(): js.Array[
    mendixmodelsdkLib.distGenJavascriptactionsMod.javascriptactionsNs.IJavaScriptAction
  ] = js.native
  def allJsonStructures(): js.Array[mendixmodelsdkLib.distGenJsonstructuresMod.jsonstructuresNs.IJsonStructure] = js.native
  def allLayouts(): js.Array[mendixmodelsdkLib.distGenPagesMod.pagesNs.ILayout] = js.native
  def allMappingDocuments(): js.Array[mendixmodelsdkLib.distGenMappingsMod.mappingsNs.IMappingDocument] = js.native
  def allMenuDocuments(): js.Array[mendixmodelsdkLib.distGenMenusMod.menusNs.IMenuDocument] = js.native
  def allMessageDefinitionCollections(): js.Array[
    mendixmodelsdkLib.distGenMessagedefinitionsMod.messagedefinitionsNs.IMessageDefinitionCollection
  ] = js.native
  def allMicroflowBases(): js.Array[mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IMicroflowBase] = js.native
  def allMicroflows(): js.Array[mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IMicroflow] = js.native
  def allModuleDocuments(): js.Array[mendixmodelsdkLib.distGenProjectsMod.projectsNs.IModuleDocument] = js.native
  def allModuleSecurities(): js.Array[mendixmodelsdkLib.distGenSecurityMod.securityNs.IModuleSecurity] = js.native
  def allModules(): js.Array[mendixmodelsdkLib.distGenProjectsMod.projectsNs.IModule] = js.native
  def allMxSchemas(): js.Array[mendixmodelsdkLib.distGenXmlschemasMod.xmlschemasNs.IMxSchema] = js.native
  def allNanoflows(): js.Array[mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.INanoflow] = js.native
  def allNativeLayouts(): js.Array[mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.INativeLayout] = js.native
  def allNativePages(): js.Array[mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.INativePage] = js.native
  def allNavigationDocuments(): js.Array[mendixmodelsdkLib.distGenNavigationMod.navigationNs.INavigationDocument] = js.native
  def allPageTemplates(): js.Array[mendixmodelsdkLib.distGenPagesMod.pagesNs.IPageTemplate] = js.native
  def allPages(): js.Array[mendixmodelsdkLib.distGenPagesMod.pagesNs.IPage] = js.native
  def allProjectConversions(): js.Array[mendixmodelsdkLib.distGenProjectsMod.projectsNs.IProjectConversion] = js.native
  def allProjectDocuments(): js.Array[mendixmodelsdkLib.distGenProjectsMod.projectsNs.IProjectDocument] = js.native
  def allProjectSecurities(): js.Array[mendixmodelsdkLib.distGenSecurityMod.securityNs.IProjectSecurity] = js.native
  def allProjectSettings(): js.Array[mendixmodelsdkLib.distGenSettingsMod.settingsNs.IProjectSettings] = js.native
  def allProjects(): js.Array[mendixmodelsdkLib.distGenProjectsMod.projectsNs.IProject] = js.native
  def allPublishedAppServices(): js.Array[mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.IPublishedAppService] = js.native
  def allPublishedODataServices(): js.Array[mendixmodelsdkLib.distGenRestMod.restNs.IPublishedODataService] = js.native
  def allPublishedRestServices(): js.Array[mendixmodelsdkLib.distGenRestMod.restNs.IPublishedRestService] = js.native
  def allPublishedServiceBases(): js.Array[mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.IPublishedServiceBase] = js.native
  def allPublishedWebServices(): js.Array[mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.IPublishedWebService] = js.native
  def allRegularExpressions(): js.Array[
    mendixmodelsdkLib.distGenRegularexpressionsMod.regularexpressionsNs.IRegularExpression
  ] = js.native
  def allRules(): js.Array[mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IRule] = js.native
  def allScheduledEvents(): js.Array[mendixmodelsdkLib.distGenScheduledeventsMod.scheduledeventsNs.IScheduledEvent] = js.native
  def allServerSideMicroflows(): js.Array[mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IServerSideMicroflow] = js.native
  def allSnippets(): js.Array[mendixmodelsdkLib.distGenPagesMod.pagesNs.ISnippet] = js.native
  def allSystemTextCollections(): js.Array[mendixmodelsdkLib.distGenTextsMod.textsNs.ISystemTextCollection] = js.native
  def allTemplateFormBases(): js.Array[mendixmodelsdkLib.distGenPagesMod.pagesNs.ITemplateFormBase] = js.native
  def allXmlSchemas(): js.Array[mendixmodelsdkLib.distGenXmlschemasMod.xmlschemasNs.IXmlSchema] = js.native
  def findAppServiceActionByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.IAppServiceAction = js.native
  def findAppServiceActionParameterByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.IAppServiceActionParameter = js.native
  def findAssociationBaseByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IAssociationBase = js.native
  def findAttributeByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IAttribute = js.native
  def findConstantByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenConstantsMod.constantsNs.IConstant = js.native
  def findDataSetByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.IDataSet = js.native
  def findDataSetParameterByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.IDataSetParameter = js.native
  def findDocumentTemplateByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.IDocumentTemplate = js.native
  def findEntityByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IEntity = js.native
  def findEnumerationByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenEnumerationsMod.enumerationsNs.IEnumeration = js.native
  def findEnumerationValueByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenEnumerationsMod.enumerationsNs.IEnumerationValue = js.native
  def findExportMappingByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenExportmappingsMod.exportmappingsNs.IExportMapping = js.native
  def findImageByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenImagesMod.imagesNs.IImage = js.native
  def findImportMappingByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.IImportMapping = js.native
  def findImportedWebServiceByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.IImportedWebService = js.native
  def findJavaActionByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.IJavaAction = js.native
  def findJavaActionParameterByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.IJavaActionParameter = js.native
  def findJavaScriptActionByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenJavascriptactionsMod.javascriptactionsNs.IJavaScriptAction = js.native
  def findJavaScriptActionParameterByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenJavascriptactionsMod.javascriptactionsNs.IJavaScriptActionParameter = js.native
  def findJsonStructureByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenJsonstructuresMod.jsonstructuresNs.IJsonStructure = js.native
  def findLayoutByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenPagesMod.pagesNs.ILayout = js.native
  def findLayoutParameterByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenPagesMod.pagesNs.ILayoutParameter = js.native
  def findMenuDocumentByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenMenusMod.menusNs.IMenuDocument = js.native
  def findMessageDefinitionByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenMessagedefinitionsMod.messagedefinitionsNs.IMessageDefinition = js.native
  def findMicroflowByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IMicroflow = js.native
  def findMicroflowParameterByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IMicroflowParameter = js.native
  def findModuleRoleByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenSecurityMod.securityNs.IModuleRole = js.native
  def findNanoflowByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.INanoflow = js.native
  def findNanoflowParameterByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.INanoflowParameter = js.native
  def findNativeLayoutByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.INativeLayout = js.native
  def findNavigationProfileByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenNavigationMod.navigationNs.INavigationProfile = js.native
  def findPageByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenPagesMod.pagesNs.IPage = js.native
  def findRegularExpressionByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenRegularexpressionsMod.regularexpressionsNs.IRegularExpression = js.native
  def findRuleByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IRule = js.native
  def findRuleParameterByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IRuleParameter = js.native
  def findSnippetByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenPagesMod.pagesNs.ISnippet = js.native
  def findUserRoleByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenSecurityMod.securityNs.IUserRole = js.native
  def findXmlSchemaByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenXmlschemasMod.xmlschemasNs.IXmlSchema = js.native
}

