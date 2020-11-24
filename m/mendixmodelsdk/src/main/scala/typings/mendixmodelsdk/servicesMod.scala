package typings.mendixmodelsdk

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.versionChecksMod.StructureType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/services", JSImport.Namespace)
@js.native
object servicesMod extends js.Object {
  
  @js.native
  class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  @js.native
  object services extends js.Object {
    
    @js.native
    class HttpMethod () extends AbstractEnum
    /* static members */
    @js.native
    object HttpMethod extends js.Object {
      
      var Delete: HttpMethod = js.native
      
      var Get: HttpMethod = js.native
      
      var Head: HttpMethod = js.native
      
      var Options: HttpMethod = js.native
      
      var Patch: HttpMethod = js.native
      
      var Post: HttpMethod = js.native
      
      var Put: HttpMethod = js.native
    }
  }
}
