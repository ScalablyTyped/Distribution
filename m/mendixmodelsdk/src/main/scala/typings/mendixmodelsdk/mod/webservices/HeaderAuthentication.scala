package typings.mendixmodelsdk.mod.webservices

import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "webservices.HeaderAuthentication")
@js.native
open class HeaderAuthentication protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.webservices.HeaderAuthentication {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object HeaderAuthentication {
  
  @JSImport("mendixmodelsdk", "webservices.HeaderAuthentication")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.HeaderAuthentication.Custom")
  @js.native
  def Custom: typings.mendixmodelsdk.srcGenWebservicesMod.webservices.HeaderAuthentication = js.native
  inline def Custom_=(x: typings.mendixmodelsdk.srcGenWebservicesMod.webservices.HeaderAuthentication): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Custom")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.HeaderAuthentication.None")
  @js.native
  def None: typings.mendixmodelsdk.srcGenWebservicesMod.webservices.HeaderAuthentication = js.native
  inline def None_=(x: typings.mendixmodelsdk.srcGenWebservicesMod.webservices.HeaderAuthentication): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.HeaderAuthentication.UsernamePassword")
  @js.native
  def UsernamePassword: typings.mendixmodelsdk.srcGenWebservicesMod.webservices.HeaderAuthentication = js.native
  inline def UsernamePassword_=(x: typings.mendixmodelsdk.srcGenWebservicesMod.webservices.HeaderAuthentication): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UsernamePassword")(x.asInstanceOf[js.Any])
}
