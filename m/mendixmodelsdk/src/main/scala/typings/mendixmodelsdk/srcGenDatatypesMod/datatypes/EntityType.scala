package typings.mendixmodelsdk.srcGenDatatypesMod.datatypes

import typings.mendixmodelsdk.srcGenAppservicesMod.appservices.AppServiceAction
import typings.mendixmodelsdk.srcGenAppservicesMod.appservices.AppServiceActionParameter
import typings.mendixmodelsdk.srcGenConstantsMod.constants.Constant
import typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetParameter
import typings.mendixmodelsdk.srcGenDatatypesMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DocumentTemplateParameter
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.srcGenImportmappingsMod.importmappings.ImportMapping
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.MicroflowBase
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.MicroflowParameterBase
import typings.mendixmodelsdk.srcGenPagesMod.pages.PageParameter
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.9.0: introduced
  */
/* note: abstract class */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IDataType because Already inherited
- typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IEntityType because var conflicts: containerAsAppServiceAction, containerAsAppServiceActionParameter, containerAsConstant, containerAsDataSetParameter, containerAsDocumentTemplateParameter, containerAsImportMapping, containerAsMicroflowBase, containerAsMicroflowParameterBase, containerAsPageParameter, id, isLoaded, model, structureTypeName, unit. Inlined entity, entityQualifiedName */ @JSImport("mendixmodelsdk/src/gen/datatypes", "datatypes.EntityType")
@js.native
open class EntityType protected () extends DataType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsAppServiceActionParameter")
  def containerAsAppServiceActionParameter_MEntityType: AppServiceActionParameter = js.native
  
  @JSName("containerAsAppServiceAction")
  def containerAsAppServiceAction_MEntityType: AppServiceAction = js.native
  
  @JSName("containerAsConstant")
  def containerAsConstant_MEntityType: Constant = js.native
  
  @JSName("containerAsDataSetParameter")
  def containerAsDataSetParameter_MEntityType: DataSetParameter = js.native
  
  @JSName("containerAsDocumentTemplateParameter")
  def containerAsDocumentTemplateParameter_MEntityType: DocumentTemplateParameter = js.native
  
  @JSName("containerAsImportMapping")
  def containerAsImportMapping_MEntityType: ImportMapping = js.native
  
  @JSName("containerAsMicroflowBase")
  def containerAsMicroflowBase_MEntityType: MicroflowBase = js.native
  
  @JSName("containerAsMicroflowParameterBase")
  def containerAsMicroflowParameterBase_MEntityType: MicroflowParameterBase = js.native
  
  @JSName("containerAsPageParameter")
  def containerAsPageParameter_MEntityType: PageParameter = js.native
  
  def entity: IEntity = js.native
  
  def entityQualifiedName: String = js.native
  @JSName("entityQualifiedName")
  val entityQualifiedName_FEntityType: String = js.native
  
  def entity_=(newValue: IEntity): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("entity")
  val entity_FEntityType: IEntity = js.native
}
object EntityType {
  
  @JSImport("mendixmodelsdk/src/gen/datatypes", "datatypes.EntityType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/datatypes", "datatypes.EntityType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/datatypes", "datatypes.EntityType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
