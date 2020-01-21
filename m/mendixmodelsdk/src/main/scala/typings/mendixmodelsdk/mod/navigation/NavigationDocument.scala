package typings.mendixmodelsdk.mod.navigation

import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.navigationMod.StructureVersionInfo
import typings.mendixmodelsdk.projectsMod.projects.IProject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/navigation relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "navigation.NavigationDocument")
@js.native
class NavigationDocument protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.navigation.NavigationDocument {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IProject
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "navigation.NavigationDocument")
@js.native
object NavigationDocument extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new NavigationDocument unit in the SDK and on the server.
    * Expects one argument, the projects.IProject in which this unit is contained.
    */
  def createIn(container: IProject): typings.mendixmodelsdk.navigationMod.navigation.NavigationDocument = js.native
}

