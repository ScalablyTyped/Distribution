package typings.mendixmodelsdk.appservicesMod.appservices

import typings.mendixmodelsdk.appservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdEntity")
@js.native
class MsdEntity protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FMsdEntity: IModel = js.native
  def attributes: IList[MsdAttribute] = js.native
  def containerAsMsdDomainModel: MsdDomainModel = js.native
  def generalizationName: String = js.native
  def generalizationName(newValue: String): js.Any = js.native
  def guid: String = js.native
  def guid(newValue: String): js.Any = js.native
  def locationX: Double = js.native
  def locationX(newValue: Double): js.Any = js.native
  def locationY: Double = js.native
  def locationY(newValue: Double): js.Any = js.native
  def name: String = js.native
  def name(newValue: String): js.Any = js.native
  def persistable: Boolean = js.native
  def persistable(newValue: Boolean): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdEntity")
@js.native
object MsdEntity extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MsdEntity instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): MsdEntity = js.native
  /**
    * Creates and returns a new MsdEntity instance in the SDK and on the server.
    * The new MsdEntity will be automatically stored in the 'entities' property
    * of the parent MsdDomainModel element passed as argument.
    */
  def createIn(container: MsdDomainModel): MsdEntity = js.native
}

