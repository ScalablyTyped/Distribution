package typings.mendixmodelsdk.distGenDatatypesMod.datatypes

import typings.mendixmodelsdk.distGenAppservicesMod.appservices.AppServiceAction
import typings.mendixmodelsdk.distGenAppservicesMod.appservices.AppServiceActionParameter
import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenConstantsMod.constants.Constant
import typings.mendixmodelsdk.distGenDatasetsMod.datasets.DataSetParameter
import typings.mendixmodelsdk.distGenDatatypesMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DocumentTemplateParameter
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.distGenImportmappingsMod.importmappings.ImportMapping
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.MicroflowBase
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.MicroflowParameterBase
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.9.0: introduced
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.distGenDatatypesMod.datatypes.IDataType because Already inherited
- typings.mendixmodelsdk.distGenDatatypesMod.datatypes.IEntityType because var conflicts: containerAsAppServiceAction, containerAsAppServiceActionParameter, containerAsConstant, containerAsDataSetParameter, containerAsDocumentTemplateParameter, containerAsImportMapping, containerAsMicroflowBase, containerAsMicroflowParameterBase, id, isLoaded, model, structureTypeName, unit. Inlined entity, entityQualifiedName */ @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.EntityType")
@js.native
abstract class EntityType protected () extends DataType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("entityQualifiedName")
  val entityQualifiedName_FEntityType: String = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("entity")
  val entity_FEntityType: IEntity = js.native
  @JSName("model")
  var model_FEntityType: IModel = js.native
  @JSName("containerAsAppServiceActionParameter")
  def containerAsAppServiceActionParameter_MEntityType(): AppServiceActionParameter = js.native
  @JSName("containerAsAppServiceAction")
  def containerAsAppServiceAction_MEntityType(): AppServiceAction = js.native
  @JSName("containerAsConstant")
  def containerAsConstant_MEntityType(): Constant = js.native
  @JSName("containerAsDataSetParameter")
  def containerAsDataSetParameter_MEntityType(): DataSetParameter = js.native
  @JSName("containerAsDocumentTemplateParameter")
  def containerAsDocumentTemplateParameter_MEntityType(): DocumentTemplateParameter = js.native
  @JSName("containerAsImportMapping")
  def containerAsImportMapping_MEntityType(): ImportMapping = js.native
  @JSName("containerAsMicroflowBase")
  def containerAsMicroflowBase_MEntityType(): MicroflowBase = js.native
  @JSName("containerAsMicroflowParameterBase")
  def containerAsMicroflowParameterBase_MEntityType(): MicroflowParameterBase = js.native
  def entity(): IEntity = js.native
  def entity(newValue: IEntity): js.Any = js.native
  def entityQualifiedName(): String = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.EntityType")
@js.native
object EntityType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

