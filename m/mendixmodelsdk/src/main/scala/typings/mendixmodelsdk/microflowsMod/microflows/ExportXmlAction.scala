package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.exportmappingsMod.exportmappings.IExportMapping
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/export-mapping-action relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ExportXmlAction")
@js.native
class ExportXmlAction protected () extends MicroflowAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def isValidationRequired: Boolean = js.native
  def isValidationRequired_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 7.6.0: deleted
    */
  def mapping: IExportMapping | Null = js.native
  
  /**
    * In version 7.6.0: deleted
    */
  def mappingArgumentVariableName: String = js.native
  def mappingArgumentVariableName_=(newValue: String): Unit = js.native
  
  def mappingQualifiedName: String | Null = js.native
  
  def mapping_=(newValue: IExportMapping | Null): Unit = js.native
  
  def outputMethod: OutputMethod = js.native
  def outputMethod_=(newValue: OutputMethod): Unit = js.native
  
  /**
    * In version 7.6.0: introduced
    */
  def resultHandling: MappingRequestHandling = js.native
  def resultHandling_=(newValue: MappingRequestHandling): Unit = js.native
}
object ExportXmlAction {
  
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ExportXmlAction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ExportXmlAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): ExportXmlAction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ExportXmlAction]
  
  /**
    * Creates and returns a new ExportXmlAction instance in the SDK and on the server.
    * The new ExportXmlAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    */
  /* static member */
  @scala.inline
  def createIn(container: ActionActivity): ExportXmlAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ExportXmlAction]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ExportXmlAction.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ExportXmlAction.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
