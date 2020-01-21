package typings.mendixmodelsdk.mod.appservices

import typings.mendixmodelsdk.appservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "appservices.MsdText")
@js.native
class MsdText protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.appservices.MsdText {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "appservices.MsdText")
@js.native
object MsdText extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MsdText instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.appservicesMod.appservices.MsdText = js.native
  /**
    * Creates and returns a new MsdText instance in the SDK and on the server.
    * The new MsdText will be automatically stored in the 'translations' property
    * of the parent MsdEnumerationValue element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.appservicesMod.appservices.MsdEnumerationValue): typings.mendixmodelsdk.appservicesMod.appservices.MsdText = js.native
}

