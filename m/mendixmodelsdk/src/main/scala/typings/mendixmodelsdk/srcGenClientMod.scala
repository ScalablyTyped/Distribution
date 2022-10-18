package typings.mendixmodelsdk

import typings.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.StructureType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGenClientMod {
  
  @JSImport("mendixmodelsdk/src/gen/client", "StructureVersionInfo")
  @js.native
  open class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.srcSdkInternalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object client {
    
    @JSImport("mendixmodelsdk/src/gen/client", "client.SupportedPlatform")
    @js.native
    open class SupportedPlatform protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object SupportedPlatform {
      
      @JSImport("mendixmodelsdk/src/gen/client", "client.SupportedPlatform")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/client", "client.SupportedPlatform.All")
      @js.native
      def All: SupportedPlatform = js.native
      inline def All_=(x: SupportedPlatform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("All")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/client", "client.SupportedPlatform.Native")
      @js.native
      def Native: SupportedPlatform = js.native
      inline def Native_=(x: SupportedPlatform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Native")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/client", "client.SupportedPlatform.Web")
      @js.native
      def Web: SupportedPlatform = js.native
      inline def Web_=(x: SupportedPlatform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Web")(x.asInstanceOf[js.Any])
    }
  }
}
