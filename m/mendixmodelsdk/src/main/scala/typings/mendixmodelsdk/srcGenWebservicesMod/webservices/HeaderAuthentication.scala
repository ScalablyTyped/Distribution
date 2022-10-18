package typings.mendixmodelsdk.srcGenWebservicesMod.webservices

import typings.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/webservices", "webservices.HeaderAuthentication")
@js.native
open class HeaderAuthentication protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object HeaderAuthentication {
  
  @JSImport("mendixmodelsdk/src/gen/webservices", "webservices.HeaderAuthentication")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/webservices", "webservices.HeaderAuthentication.Custom")
  @js.native
  def Custom: HeaderAuthentication = js.native
  inline def Custom_=(x: HeaderAuthentication): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Custom")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/webservices", "webservices.HeaderAuthentication.None")
  @js.native
  def None: HeaderAuthentication = js.native
  inline def None_=(x: HeaderAuthentication): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/webservices", "webservices.HeaderAuthentication.UsernamePassword")
  @js.native
  def UsernamePassword: HeaderAuthentication = js.native
  inline def UsernamePassword_=(x: HeaderAuthentication): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UsernamePassword")(x.asInstanceOf[js.Any])
}
