package typings.mendixmodelsdk

import typings.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.StructureType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGenServicesMod {
  
  @JSImport("mendixmodelsdk/src/gen/services", "StructureVersionInfo")
  @js.native
  open class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.srcSdkInternalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object services {
    
    @JSImport("mendixmodelsdk/src/gen/services", "services.HttpMethod")
    @js.native
    open class HttpMethod protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object HttpMethod {
      
      @JSImport("mendixmodelsdk/src/gen/services", "services.HttpMethod")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/services", "services.HttpMethod.Delete")
      @js.native
      def Delete: HttpMethod = js.native
      inline def Delete_=(x: HttpMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Delete")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/services", "services.HttpMethod.Get")
      @js.native
      def Get: HttpMethod = js.native
      inline def Get_=(x: HttpMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Get")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/services", "services.HttpMethod.Head")
      @js.native
      def Head: HttpMethod = js.native
      inline def Head_=(x: HttpMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Head")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/services", "services.HttpMethod.Options")
      @js.native
      def Options: HttpMethod = js.native
      inline def Options_=(x: HttpMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Options")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/services", "services.HttpMethod.Patch")
      @js.native
      def Patch: HttpMethod = js.native
      inline def Patch_=(x: HttpMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Patch")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/services", "services.HttpMethod.Post")
      @js.native
      def Post: HttpMethod = js.native
      inline def Post_=(x: HttpMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Post")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/services", "services.HttpMethod.Put")
      @js.native
      def Put: HttpMethod = js.native
      inline def Put_=(x: HttpMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Put")(x.asInstanceOf[js.Any])
    }
  }
}
