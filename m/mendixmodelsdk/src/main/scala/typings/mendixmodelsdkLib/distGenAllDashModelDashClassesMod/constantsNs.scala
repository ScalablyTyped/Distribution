package typings
package mendixmodelsdkLib.distGenAllDashModelDashClassesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "constants")
@js.native
object constantsNs extends js.Object {
  /**
    * See: {@link https://docs.mendix.com/refguide7/constants relevant section in reference guide}
    */
  @js.native
  class Constant protected ()
    extends mendixmodelsdkLib.distGenConstantsMod.constantsNs.Constant {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
  }
  
  /* static members */
  @js.native
  object Constant extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenConstantsMod.StructureVersionInfo = js.native
    /**
      * Creates a new Constant unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase): mendixmodelsdkLib.distGenConstantsMod.constantsNs.Constant = js.native
  }
  
}

