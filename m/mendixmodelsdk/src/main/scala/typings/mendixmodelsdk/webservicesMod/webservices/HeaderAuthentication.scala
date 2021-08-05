package typings.mendixmodelsdk.webservicesMod.webservices

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.HeaderAuthentication")
@js.native
class HeaderAuthentication protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object HeaderAuthentication {
  
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.HeaderAuthentication")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.HeaderAuthentication.Custom")
  @js.native
  def Custom: HeaderAuthentication = js.native
  inline def Custom_=(x: HeaderAuthentication): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Custom")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.HeaderAuthentication.None")
  @js.native
  def None: HeaderAuthentication = js.native
  inline def None_=(x: HeaderAuthentication): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.HeaderAuthentication.UsernamePassword")
  @js.native
  def UsernamePassword: HeaderAuthentication = js.native
  inline def UsernamePassword_=(x: HeaderAuthentication): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UsernamePassword")(x.asInstanceOf[js.Any])
}
