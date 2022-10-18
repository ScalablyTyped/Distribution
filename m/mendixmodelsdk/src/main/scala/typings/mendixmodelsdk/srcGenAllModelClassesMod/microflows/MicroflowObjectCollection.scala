package typings.mendixmodelsdk.srcGenAllModelClassesMod.microflows

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

@JSImport("mendixmodelsdk/src/gen/all-model-classes", "microflows.MicroflowObjectCollection")
@js.native
open class MicroflowObjectCollection protected ()
  extends typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.MicroflowObjectCollection {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object MicroflowObjectCollection {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "microflows.MicroflowObjectCollection")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new MicroflowObjectCollection instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.MicroflowObjectCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.MicroflowObjectCollection]
  
  /**
    * Creates and returns a new MicroflowObjectCollection instance in the SDK and on the server.
    * The new MicroflowObjectCollection will be automatically stored in the 'objectCollection' property
    * of the parent LoopedActivity element passed as argument.
    */
  /* static member */
  inline def createInLoopedActivityUnderObjectCollection(container: typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.LoopedActivity): typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.MicroflowObjectCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLoopedActivityUnderObjectCollection")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.MicroflowObjectCollection]
  
  /**
    * Creates and returns a new MicroflowObjectCollection instance in the SDK and on the server.
    * The new MicroflowObjectCollection will be automatically stored in the 'objectCollection' property
    * of the parent MicroflowBase element passed as argument.
    */
  /* static member */
  inline def createInMicroflowBaseUnderObjectCollection(container: typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.MicroflowBase): typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.MicroflowObjectCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowBaseUnderObjectCollection")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.MicroflowObjectCollection]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "microflows.MicroflowObjectCollection.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "microflows.MicroflowObjectCollection.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
