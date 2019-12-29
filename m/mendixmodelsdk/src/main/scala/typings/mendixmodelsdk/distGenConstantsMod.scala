package typings.mendixmodelsdk

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDatatypesMod.datatypes.DataType
import typings.mendixmodelsdk.distGenProjectsMod.projects.Document
import typings.mendixmodelsdk.distGenProjectsMod.projects.FolderBase
import typings.mendixmodelsdk.distGenProjectsMod.projects.IDocument
import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalVersionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalVersionChecksMod.StructureType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/constants", JSImport.Namespace)
@js.native
object distGenConstantsMod extends js.Object {
  @js.native
  class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.distSdkInternalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  @js.native
  object constants extends js.Object {
    /**
      * See: {@link https://docs.mendix.com/refguide7/constants relevant section in reference guide}
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable because Already inherited
    - typings.mendixmodelsdk.distGenProjectsMod.projects.IModuleDocument because Already inherited
    - typings.mendixmodelsdk.distGenProjectsMod.projects.IDocument because Already inherited
    - typings.mendixmodelsdk.distGenConstantsMod.constants.IConstant because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @js.native
    class Constant protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      @JSName("model")
      var model_FConstant: IModel = js.native
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MConstant(): FolderBase = js.native
      /**
        * The value of this property is conceptually of type dataTypes.LegacyDataType.
        *
        * In version 7.9.0: deleted
        */
      def dataType(): String = js.native
      def dataType(newValue: String): js.Any = js.native
      def defaultValue(): String = js.native
      def defaultValue(newValue: String): js.Any = js.native
      /**
        * In version 8.2.0: introduced
        */
      def exposedToClient(): Boolean = js.native
      def exposedToClient(newValue: Boolean): js.Any = js.native
      /**
        * In version 7.9.0: introduced
        */
      def `type`(): DataType = js.native
      def `type`(newValue: DataType): js.Any = js.native
    }
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `Constants`.
      */
    /**
      * See: {@link https://docs.mendix.com/refguide7/constants relevant section in reference guide}
      */
    @js.native
    trait IConstant extends IDocument
    
    /* static members */
    @js.native
    object Constant extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates a new Constant unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      def createIn(container: IFolderBase): Constant = js.native
    }
    
  }
  
}

