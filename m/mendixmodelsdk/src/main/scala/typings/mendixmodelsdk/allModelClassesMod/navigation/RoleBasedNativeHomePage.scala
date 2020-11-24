package typings.mendixmodelsdk.allModelClassesMod.navigation

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.navigationMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.0.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "navigation.RoleBasedNativeHomePage")
@js.native
class RoleBasedNativeHomePage protected ()
  extends typings.mendixmodelsdk.navigationMod.navigation.RoleBasedNativeHomePage {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "navigation.RoleBasedNativeHomePage")
@js.native
object RoleBasedNativeHomePage extends js.Object {
  
  /**
    * Creates and returns a new RoleBasedNativeHomePage instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.navigationMod.navigation.RoleBasedNativeHomePage = js.native
  
  /**
    * Creates and returns a new RoleBasedNativeHomePage instance in the SDK and on the server.
    * The new RoleBasedNativeHomePage will be automatically stored in the 'roleBasedNativeHomePages' property
    * of the parent NativeNavigationProfile element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createIn(container: typings.mendixmodelsdk.navigationMod.navigation.NativeNavigationProfile): typings.mendixmodelsdk.navigationMod.navigation.RoleBasedNativeHomePage = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
