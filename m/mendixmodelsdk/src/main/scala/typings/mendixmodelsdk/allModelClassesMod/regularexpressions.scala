package typings.mendixmodelsdk.allModelClassesMod

import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object regularexpressions {
  
  /**
    * See: {@link https://docs.mendix.com/refguide/regular-expressions relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "regularexpressions.RegularExpression")
  @js.native
  class RegularExpression protected ()
    extends typings.mendixmodelsdk.regularexpressionsMod.regularexpressions.RegularExpression {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object RegularExpression {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "regularexpressions.RegularExpression")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new RegularExpression unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "regularexpressions.RegularExpression.createIn")
    @js.native
    def createIn(container: IFolderBase): typings.mendixmodelsdk.regularexpressionsMod.regularexpressions.RegularExpression = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "regularexpressions.RegularExpression.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "regularexpressions.RegularExpression.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.regularexpressionsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.regularexpressionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
