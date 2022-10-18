package typings.mendixmodelsdk.srcGenAllModelClassesMod

import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constants {
  
  /**
    * See: {@link https://docs.mendix.com/refguide/constants relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "constants.Constant")
  @js.native
  open class Constant protected ()
    extends typings.mendixmodelsdk.srcGenConstantsMod.constants.Constant {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object Constant {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "constants.Constant")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Constant unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IFolderBase): typings.mendixmodelsdk.srcGenConstantsMod.constants.Constant = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenConstantsMod.constants.Constant]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "constants.Constant.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "constants.Constant.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenConstantsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenConstantsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
