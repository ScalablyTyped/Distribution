package typings.mendixmodelsdk

import typings.mendixmodelsdk.distGenProjectsMod.projects.Document
import typings.mendixmodelsdk.distGenProjectsMod.projects.IDocument
import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.distGenRegularexpressionsMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenRegularexpressionsMod.regularexpressions.RegularExpression
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalVersionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalVersionChecksMod.StructureType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/regularexpressions", JSImport.Namespace)
@js.native
object distGenRegularexpressionsMod extends js.Object {
  @js.native
  class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.distSdkInternalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  @js.native
  object regularexpressions extends js.Object {
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
    - typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable because Already inherited
    - typings.mendixmodelsdk.distGenProjectsMod.projects.IModuleDocument because Already inherited
    - typings.mendixmodelsdk.distGenProjectsMod.projects.IDocument because Already inherited
    - typings.mendixmodelsdk.distGenRegularexpressionsMod.regularexpressions.IRegularExpression because var conflicts: id, isLoaded, model, name, structureTypeName, unit. Inlined  */ @js.native
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
  
}

