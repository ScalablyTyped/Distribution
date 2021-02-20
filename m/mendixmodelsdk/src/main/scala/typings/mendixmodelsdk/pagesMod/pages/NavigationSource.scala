package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.navigationMod.navigation.INavigationProfile
import typings.mendixmodelsdk.navigationMod.navigation.ProfileType
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.NavigationSource")
@js.native
class NavigationSource protected () extends MenuSource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * In version 7.2.0: introduced
    */
  def navigationProfile: INavigationProfile = js.native
  
  def navigationProfileQualifiedName: String = js.native
  
  def navigationProfile_=(newValue: INavigationProfile): Unit = js.native
  
  /**
    * In version 7.2.0: deleted
    */
  def profileType: ProfileType = js.native
  def profileType_=(newValue: ProfileType): Unit = js.native
}
object NavigationSource {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NavigationSource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new NavigationSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NavigationSource.create")
  @js.native
  def create(model: IModel): NavigationSource = js.native
  
  /**
    * Creates and returns a new NavigationSource instance in the SDK and on the server.
    * The new NavigationSource will be automatically stored in the 'menuSource' property
    * of the parent MenuWidget element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NavigationSource.createIn")
  @js.native
  def createIn(container: MenuWidget): NavigationSource = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NavigationSource.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NavigationSource.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
