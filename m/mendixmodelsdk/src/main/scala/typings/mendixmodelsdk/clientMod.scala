package typings.mendixmodelsdk

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.versionChecksMod.StructureType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/client", JSImport.Namespace)
@js.native
object clientMod extends js.Object {
  
  @js.native
  class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  @js.native
  object client extends js.Object {
    
    @js.native
    class SupportedPlatform () extends AbstractEnum
    /* static members */
    @js.native
    object SupportedPlatform extends js.Object {
      
      var All: SupportedPlatform = js.native
      
      var Native: SupportedPlatform = js.native
      
      var Web: SupportedPlatform = js.native
    }
  }
}
