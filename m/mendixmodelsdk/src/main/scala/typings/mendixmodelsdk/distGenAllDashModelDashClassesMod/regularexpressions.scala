package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod

import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "regularexpressions")
@js.native
object regularexpressions extends js.Object {
  /**
    * See: {@link https://docs.mendix.com/refguide7/regular-expressions relevant section in reference guide}
    */
  @js.native
  class RegularExpression protected ()
    extends typings.mendixmodelsdk.distGenRegularexpressionsMod.regularexpressions.RegularExpression {
    def this(
      model: AbstractModel,
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
    def createIn(container: IFolderBase): typings.mendixmodelsdk.distGenRegularexpressionsMod.regularexpressions.RegularExpression = js.native
  }
  
}

