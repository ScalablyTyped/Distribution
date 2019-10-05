package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.javaactions

import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/java-actions relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javaactions.JavaAction")
@js.native
class JavaAction protected ()
  extends typings.mendixmodelsdk.distGenJavaactionsMod.javaactions.JavaAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javaactions.JavaAction")
@js.native
object JavaAction extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenJavaactionsMod.StructureVersionInfo = js.native
  /**
    * Creates a new JavaAction unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): typings.mendixmodelsdk.distGenJavaactionsMod.javaactions.JavaAction = js.native
}

