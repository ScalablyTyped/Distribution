package typings.mendixmodelsdk.distGenAppservicesMod.appservices

import typings.mendixmodelsdk.distGenAppservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
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
  val attributes: IList[MsdAttribute] = js.native
  val containerAsMsdDomainModel: MsdDomainModel = js.native
  var generalizationName: String = js.native
  var guid: String = js.native
  var locationX: Double = js.native
  var locationY: Double = js.native
  @JSName("model")
  var model_MsdEntity: IModel = js.native
  var name: String = js.native
  var persistable: Boolean = js.native
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

