package typings.mendixmodelsdk.mod.microflows

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 9.12.0: removed experimental
  * In version 9.2.0: introduced
  */
@JSImport("mendixmodelsdk", "microflows.RestartOperation")
@js.native
open class RestartOperation protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.microflows.RestartOperation {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object RestartOperation {
  
  @JSImport("mendixmodelsdk", "microflows.RestartOperation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new RestartOperation instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.RestartOperation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.RestartOperation]
  
  /**
    * Creates and returns a new RestartOperation instance in the SDK and on the server.
    * The new RestartOperation will be automatically stored in the 'operation' property
    * of the parent WorkflowOperationAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.2.0 and higher
    */
  /* static member */
  inline def createIn(container: typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.WorkflowOperationAction): typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.RestartOperation = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.RestartOperation]
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.RestartOperation.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.RestartOperation.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
