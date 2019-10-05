package typings.mendixmodelsdk

import typings.mendixmodelsdk.distGenServicesMod.services.HttpMethod
import typings.mendixmodelsdk.distSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.distSdkInternalVersionDashChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalVersionDashChecksMod.StructureType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/services", JSImport.Namespace)
@js.native
object distGenServicesMod extends js.Object {
  @js.native
  class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.distSdkInternalMod.StructureVersionInfo {
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

