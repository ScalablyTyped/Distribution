package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.navigationMod.navigation.INavigationProfile
import typings.mendixmodelsdk.navigationMod.navigation.ProfileType
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.NavigationSource")
@js.native
class NavigationSource protected () extends MenuSource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FNavigationSource: IModel = js.native
  /**
    * In version 7.2.0: introduced
    */
  def navigationProfile: INavigationProfile = js.native
  def navigationProfile(newValue: INavigationProfile): js.Any = js.native
  def navigationProfileQualifiedName: String = js.native
  /**
    * In version 7.2.0: deleted
    */
  def profileType: ProfileType = js.native
  def profileType(newValue: ProfileType): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.NavigationSource")
@js.native
object NavigationSource extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new NavigationSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): NavigationSource = js.native
  /**
    * Creates and returns a new NavigationSource instance in the SDK and on the server.
    * The new NavigationSource will be automatically stored in the 'menuSource' property
    * of the parent MenuWidget element passed as argument.
    */
  def createIn(container: MenuWidget): NavigationSource = js.native
}

