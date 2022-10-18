package typings.mendixmodelsdk.srcGenMicroflowsMod.microflows

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenExportmappingsMod.exportmappings.IExportMapping
import typings.mendixmodelsdk.srcGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/microflows", "microflows.WebServiceOperationAdvancedParameterMapping")
@js.native
open class WebServiceOperationAdvancedParameterMapping protected () extends WebServiceOperationParameterMapping {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def mapping: IExportMapping | Null = js.native
  
  def mappingArgumentVariableName: String = js.native
  def mappingArgumentVariableName_=(newValue: String): Unit = js.native
  
  def mappingQualifiedName: String | Null = js.native
  
  def mapping_=(newValue: IExportMapping | Null): Unit = js.native
}
object WebServiceOperationAdvancedParameterMapping {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.WebServiceOperationAdvancedParameterMapping")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new WebServiceOperationAdvancedParameterMapping instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): WebServiceOperationAdvancedParameterMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[WebServiceOperationAdvancedParameterMapping]
  
  /**
    * Creates and returns a new WebServiceOperationAdvancedParameterMapping instance in the SDK and on the server.
    * The new WebServiceOperationAdvancedParameterMapping will be automatically stored in the 'parameterMappings' property
    * of the parent AdvancedRequestHandling element passed as argument.
    */
  /* static member */
  inline def createIn(container: AdvancedRequestHandling): WebServiceOperationAdvancedParameterMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[WebServiceOperationAdvancedParameterMapping]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.WebServiceOperationAdvancedParameterMapping.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.WebServiceOperationAdvancedParameterMapping.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
