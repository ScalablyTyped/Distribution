package typings
package mendixmodelsdkLib.mendixmodelsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "regularexpressions")
@js.native
object regularexpressionsNs extends js.Object {
  /**
       * See: {@link https://docs.mendix.com/refguide7/regular-expressions relevant section in reference guide}
       */
  @js.native
  class RegularExpression protected ()
    extends mendixmodelsdkLib.distGenAllDashModelDashClassesMod.regularexpressionsNs.RegularExpression {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/regular-expressions relevant section in reference guide}
       */
  @js.native
  object RegularExpression extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenRegularexpressionsMod.StructureVersionInfo = js.native
    /**
             * Creates a new RegularExpression unit in the SDK and on the server.
             * Expects one argument, the projects.IFolderBase in which this unit is contained.
             */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase): mendixmodelsdkLib.distGenRegularexpressionsMod.regularexpressionsNs.RegularExpression = js.native
  }
  
}

