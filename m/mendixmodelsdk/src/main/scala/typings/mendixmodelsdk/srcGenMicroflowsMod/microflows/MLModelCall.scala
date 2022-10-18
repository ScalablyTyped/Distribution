package typings.mendixmodelsdk.srcGenMicroflowsMod.microflows

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.IMLMappingDocument
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 9.18.0: deleted
  * In version 9.10.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/microflows", "microflows.MLModelCall")
@js.native
open class MLModelCall protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsMLModelCallAction: MLModelCallAction = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.17.0: introduced
    */
  def mlMappingDocument: IMLMappingDocument | Null = js.native
  
  def mlMappingDocumentQualifiedName: String | Null = js.native
  
  def mlMappingDocument_=(newValue: IMLMappingDocument | Null): Unit = js.native
  
  def modelReference: String = js.native
  def modelReference_=(newValue: String): Unit = js.native
  
  def parameterMappings: IList[MLModelCallParameterMapping] = js.native
}
object MLModelCall {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.MLModelCall")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new MLModelCall instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): MLModelCall = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[MLModelCall]
  
  /**
    * Creates and returns a new MLModelCall instance in the SDK and on the server.
    * The new MLModelCall will be automatically stored in the 'modelCall' property
    * of the parent MLModelCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.10.0 to 9.17.0
    */
  /* static member */
  inline def createIn(container: MLModelCallAction): MLModelCall = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[MLModelCall]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.MLModelCall.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.MLModelCall.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
