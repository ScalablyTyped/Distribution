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

@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdEnumerationValue")
@js.native
class MsdEnumerationValue protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  val containerAsMsdEnumeration: MsdEnumeration = js.native
  var guid: String = js.native
  var image: String = js.native
  @JSName("model")
  var model_MsdEnumerationValue: IModel = js.native
  var name: String = js.native
  val translations: IList[MsdText] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdEnumerationValue")
@js.native
object MsdEnumerationValue extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MsdEnumerationValue instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): MsdEnumerationValue = js.native
  /**
    * Creates and returns a new MsdEnumerationValue instance in the SDK and on the server.
    * The new MsdEnumerationValue will be automatically stored in the 'values' property
    * of the parent MsdEnumeration element passed as argument.
    */
  def createIn(container: MsdEnumeration): MsdEnumerationValue = js.native
}

