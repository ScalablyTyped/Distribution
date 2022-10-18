package typings.mendixmodelsdk.srcGenMicroflowsMod.microflows

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
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 9.12.0: deleted
  * In version 9.3.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ResumeOperation")
@js.native
open class ResumeOperation protected () extends WorkflowOperation {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def workflowVariable: String = js.native
  def workflowVariable_=(newValue: String): Unit = js.native
}
object ResumeOperation {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ResumeOperation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ResumeOperation instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): ResumeOperation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ResumeOperation]
  
  /**
    * Creates and returns a new ResumeOperation instance in the SDK and on the server.
    * The new ResumeOperation will be automatically stored in the 'operation' property
    * of the parent WorkflowOperationAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.3.0 to 9.11.0
    */
  /* static member */
  inline def createIn(container: WorkflowOperationAction): ResumeOperation = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ResumeOperation]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ResumeOperation.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ResumeOperation.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
