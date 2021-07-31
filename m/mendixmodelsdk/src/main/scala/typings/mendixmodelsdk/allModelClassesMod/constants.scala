package typings.mendixmodelsdk.allModelClassesMod

import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constants {
  
  /**
    * See: {@link https://docs.mendix.com/refguide/constants relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "constants.Constant")
  @js.native
  class Constant protected ()
    extends typings.mendixmodelsdk.constantsMod.constants.Constant {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object Constant {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "constants.Constant")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Constant unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    @scala.inline
    def createIn(container: IFolderBase): typings.mendixmodelsdk.constantsMod.constants.Constant = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.constantsMod.constants.Constant]
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "constants.Constant.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "constants.Constant.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.constantsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.constantsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
