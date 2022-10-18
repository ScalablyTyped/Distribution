package typings.mendixmodelsdk.srcGenMicroflowsMod.microflows

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenQueuesMod.queues.IQueue
import typings.mendixmodelsdk.srcGenQueuesMod.queues.QueueSettings
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

@JSImport("mendixmodelsdk/src/gen/microflows", "microflows.MicroflowCall")
@js.native
open class MicroflowCall protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsMicroflowCallAction: MicroflowCallAction = js.native
  
  def microflow: IMicroflow | Null = js.native
  
  def microflowQualifiedName: String | Null = js.native
  
  def microflow_=(newValue: IMicroflow | Null): Unit = js.native
  
  def parameterMappings: IList[MicroflowCallParameterMapping] = js.native
  
  /**
    * In version 9.10.0: deleted
    * In version 8.16.0: introduced
    */
  def queue: IQueue | Null = js.native
  
  def queueQualifiedName: String | Null = js.native
  
  /**
    * In version 9.10.0: introduced
    */
  def queueSettings: QueueSettings | Null = js.native
  def queueSettings_=(newValue: QueueSettings | Null): Unit = js.native
  
  def queue_=(newValue: IQueue | Null): Unit = js.native
}
object MicroflowCall {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.MicroflowCall")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new MicroflowCall instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): MicroflowCall = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[MicroflowCall]
  
  /**
    * Creates and returns a new MicroflowCall instance in the SDK and on the server.
    * The new MicroflowCall will be automatically stored in the 'microflowCall' property
    * of the parent MicroflowCallAction element passed as argument.
    */
  /* static member */
  inline def createIn(container: MicroflowCallAction): MicroflowCall = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[MicroflowCall]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.MicroflowCall.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.MicroflowCall.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
