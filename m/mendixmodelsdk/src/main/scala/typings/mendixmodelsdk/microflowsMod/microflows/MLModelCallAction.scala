package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.mlmappingsMod.mlmappings.IMLMappingDocument
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/ml-model-call-action relevant section in reference guide}
  *
  * In version 9.10.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/microflows", "microflows.MLModelCallAction")
@js.native
open class MLModelCallAction protected () extends MicroflowAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * In version 9.18.0: introduced
    */
  def inputVariableName: String = js.native
  def inputVariableName_=(newValue: String): Unit = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.18.0: introduced
    */
  def mlMappingDocument: IMLMappingDocument | Null = js.native
  
  def mlMappingDocumentQualifiedName: String | Null = js.native
  
  def mlMappingDocument_=(newValue: IMLMappingDocument | Null): Unit = js.native
  
  /**
    * In version 9.18.0: deleted
    */
  def modelCall: MLModelCall = js.native
  def modelCall_=(newValue: MLModelCall): Unit = js.native
  
  def outputVariableName: String = js.native
  def outputVariableName_=(newValue: String): Unit = js.native
}
object MLModelCallAction {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.MLModelCallAction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new MLModelCallAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): MLModelCallAction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[MLModelCallAction]
  
  /**
    * Creates and returns a new MLModelCallAction instance in the SDK and on the server.
    * The new MLModelCallAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.10.0 and higher
    */
  /* static member */
  inline def createIn(container: ActionActivity): MLModelCallAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[MLModelCallAction]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.MLModelCallAction.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.MLModelCallAction.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
