package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object client {
  
  @JSImport("mendixmodelsdk", "client.SupportedPlatform")
  @js.native
  class SupportedPlatform protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.client.SupportedPlatform {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object SupportedPlatform {
    
    @JSImport("mendixmodelsdk", "client.SupportedPlatform")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "client.SupportedPlatform.All")
    @js.native
    def All: typings.mendixmodelsdk.clientMod.client.SupportedPlatform = js.native
    @scala.inline
    def All_=(x: typings.mendixmodelsdk.clientMod.client.SupportedPlatform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("All")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "client.SupportedPlatform.Native")
    @js.native
    def Native: typings.mendixmodelsdk.clientMod.client.SupportedPlatform = js.native
    @scala.inline
    def Native_=(x: typings.mendixmodelsdk.clientMod.client.SupportedPlatform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Native")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "client.SupportedPlatform.Web")
    @js.native
    def Web: typings.mendixmodelsdk.clientMod.client.SupportedPlatform = js.native
    @scala.inline
    def Web_=(x: typings.mendixmodelsdk.clientMod.client.SupportedPlatform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Web")(x.asInstanceOf[js.Any])
  }
}
