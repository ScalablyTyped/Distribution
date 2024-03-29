package typings.mendixmodelsdk

import typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DataType
import typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IDataType
import typings.mendixmodelsdk.srcGenProjectsMod.projects.Document
import typings.mendixmodelsdk.srcGenProjectsMod.projects.FolderBase
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IDocument
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.StructureType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGenConstantsMod {
  
  @JSImport("mendixmodelsdk/src/gen/constants", "StructureVersionInfo")
  @js.native
  open class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.srcSdkInternalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object constants {
    
    /**
      * See: {@link https://docs.mendix.com/refguide/constants relevant section in reference guide}
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalUnitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable because Already inherited
    - typings.mendixmodelsdk.srcGenProjectsMod.projects.IModuleDocument because Already inherited
    - typings.mendixmodelsdk.srcGenProjectsMod.projects.IDocument because Already inherited
    - typings.mendixmodelsdk.srcGenConstantsMod.constants.IConstant because var conflicts: containerAsFolderBase, documentation, excluded, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined `type` */ @JSImport("mendixmodelsdk/src/gen/constants", "constants.Constant")
    @js.native
    open class Constant protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MConstant: FolderBase = js.native
      
      /**
        * The value of this property is conceptually of type dataTypes.LegacyDataType.
        *
        * In version 7.9.0: deleted
        */
      def dataType: String = js.native
      def dataType_=(newValue: String): Unit = js.native
      
      def defaultValue: String = js.native
      def defaultValue_=(newValue: String): Unit = js.native
      
      /**
        * In version 8.2.0: introduced
        */
      def exposedToClient: Boolean = js.native
      def exposedToClient_=(newValue: Boolean): Unit = js.native
      
      /**
        * In version 9.0.5: added public
        * In version 7.9.0: introduced
        */
      def `type`: DataType = js.native
      def type_=(newValue: DataType): Unit = js.native
      /**
        * This property is required and cannot be set to null.
        *
        * In version 9.0.5: added public
        * In version 7.9.0: introduced
        */
      @JSName("type")
      val type_FConstant: IDataType = js.native
    }
    object Constant {
      
      @JSImport("mendixmodelsdk/src/gen/constants", "constants.Constant")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new Constant unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      /* static member */
      inline def createIn(container: IFolderBase): Constant = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[Constant]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/constants", "constants.Constant.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/constants", "constants.Constant.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `Constants`.
      */
    /**
      * See: {@link https://docs.mendix.com/refguide/constants relevant section in reference guide}
      */
    @js.native
    trait IConstant
      extends StObject
         with IDocument {
      
      /**
        * This property is required and cannot be set to null.
        *
        * In version 9.0.5: added public
        * In version 7.9.0: introduced
        */
      val `type`: IDataType = js.native
    }
  }
}
