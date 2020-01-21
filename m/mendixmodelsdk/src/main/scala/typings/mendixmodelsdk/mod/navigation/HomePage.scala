package typings.mendixmodelsdk.mod.navigation

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.navigationMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "navigation.HomePage")
@js.native
class HomePage protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.navigation.HomePage {
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
@JSImport("mendixmodelsdk", "navigation.HomePage")
@js.native
object HomePage extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new HomePage instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.navigationMod.navigation.HomePage = js.native
  /**
    * Creates and returns a new HomePage instance in the SDK and on the server.
    * The new HomePage will be automatically stored in the 'homePage' property
    * of the parent NavigationProfile element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.navigationMod.navigation.NavigationProfile): typings.mendixmodelsdk.navigationMod.navigation.HomePage = js.native
}

