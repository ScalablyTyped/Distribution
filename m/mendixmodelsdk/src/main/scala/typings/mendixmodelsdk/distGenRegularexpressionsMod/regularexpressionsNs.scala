package typings.mendixmodelsdk.distGenRegularexpressionsMod

import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.Document
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IDocument
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IFolderBase
import typings.mendixmodelsdk.distGenRegularexpressionsMod.regularexpressionsNs.RegularExpression
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/regularexpressions", "regularexpressions")
@js.native
object regularexpressionsNs extends js.Object {
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `RegularExpressions`.
    */
  /**
    * See: {@link https://docs.mendix.com/refguide7/regular-expressions relevant section in reference guide}
    */
  @js.native
  trait IRegularExpression extends IDocument
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/regular-expressions relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenRegularexpressionsMod.regularexpressionsNs.IRegularExpression because var conflicts: id, isLoaded, model, name, structureTypeName, unit. Inlined  */ @js.native
  class RegularExpression protected () extends Document {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
    var regEx: String = js.native
  }
  
  /* static members */
  @js.native
  object RegularExpression extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates a new RegularExpression unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): RegularExpression = js.native
  }
  
}

