package typings.mendixmodelsdk.srcGenRestMod.rest

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenExportmappingsMod.exportmappings.ExportObjectMappingElement
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.NullValueOption
import typings.mendixmodelsdk.srcGenRestMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 9.23.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/rest", "rest.ImplicitExportMapping")
@js.native
open class ImplicitExportMapping protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsImplicitRequestHandling: ImplicitRequestHandling = js.native
  
  def mapping: ExportObjectMappingElement | Null = js.native
  def mapping_=(newValue: ExportObjectMappingElement | Null): Unit = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  
  def nullValueOption: NullValueOption = js.native
  def nullValueOption_=(newValue: NullValueOption): Unit = js.native
}
object ImplicitExportMapping {
  
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.ImplicitExportMapping")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ImplicitExportMapping instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): ImplicitExportMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ImplicitExportMapping]
  
  /**
    * Creates and returns a new ImplicitExportMapping instance in the SDK and on the server.
    * The new ImplicitExportMapping will be automatically stored in the 'implicitExportMapping' property
    * of the parent ImplicitRequestHandling element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.23.0 and higher
    */
  /* static member */
  inline def createIn(container: ImplicitRequestHandling): ImplicitExportMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ImplicitExportMapping]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.ImplicitExportMapping.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.ImplicitExportMapping.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
