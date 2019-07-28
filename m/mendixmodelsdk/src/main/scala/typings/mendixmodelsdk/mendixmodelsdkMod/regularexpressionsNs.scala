package typings.mendixmodelsdk.mendixmodelsdkMod

import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IFolderBase
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
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.regularexpressionsNs.RegularExpression {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  /* static members */
  @js.native
  object RegularExpression extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenRegularexpressionsMod.StructureVersionInfo = js.native
    /**
      * Creates a new RegularExpression unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typings.mendixmodelsdk.distGenRegularexpressionsMod.regularexpressionsNs.RegularExpression = js.native
  }
  
}

