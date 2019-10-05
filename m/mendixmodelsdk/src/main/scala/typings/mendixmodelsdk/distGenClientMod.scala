package typings.mendixmodelsdk

import typings.mendixmodelsdk.distGenClientMod.client.SupportedPlatform
import typings.mendixmodelsdk.distSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.distSdkInternalVersionDashChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalVersionDashChecksMod.StructureType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/client", JSImport.Namespace)
@js.native
object distGenClientMod extends js.Object {
  @js.native
  class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.distSdkInternalMod.StructureVersionInfo {
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

