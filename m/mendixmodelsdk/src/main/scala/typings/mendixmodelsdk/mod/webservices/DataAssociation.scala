package typings.mendixmodelsdk.mod.webservices

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.webservicesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "webservices.DataAssociation")
@js.native
class DataAssociation protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.webservices.DataAssociation {
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
@JSImport("mendixmodelsdk", "webservices.DataAssociation")
@js.native
object DataAssociation extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataAssociation instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.webservicesMod.webservices.DataAssociation = js.native
  /**
    * Creates and returns a new DataAssociation instance in the SDK and on the server.
    * The new DataAssociation will be automatically stored in the 'childMembers' property
    * of the parent DataEntityBase element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.webservicesMod.webservices.DataEntityBase): typings.mendixmodelsdk.webservicesMod.webservices.DataAssociation = js.native
}

