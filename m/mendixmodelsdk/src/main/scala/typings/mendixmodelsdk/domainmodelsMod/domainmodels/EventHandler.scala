package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/event-handlers relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EventHandler")
@js.native
class EventHandler protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FEventHandler: IModel = js.native
  def containerAsEntity: Entity = js.native
  def event: EventType = js.native
  def event_=(newValue: EventType): Unit = js.native
  def microflow: IMicroflow | Null = js.native
  def microflowQualifiedName: String | Null = js.native
  def microflow_=(newValue: IMicroflow | Null): Unit = js.native
  def moment: ActionMoment = js.native
  def moment_=(newValue: ActionMoment): Unit = js.native
  def passEventObject: Boolean = js.native
  def passEventObject_=(newValue: Boolean): Unit = js.native
  def raiseErrorOnFalse: Boolean = js.native
  def raiseErrorOnFalse_=(newValue: Boolean): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EventHandler")
@js.native
object EventHandler extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new EventHandler instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): EventHandler = js.native
  /**
    * Creates and returns a new EventHandler instance in the SDK and on the server.
    * The new EventHandler will be automatically stored in the 'eventHandlers' property
    * of the parent Entity element passed as argument.
    */
  def createIn(container: Entity): EventHandler = js.native
}

