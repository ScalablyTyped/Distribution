package typings.mendixmodelsdk.webservicesMod.webservices

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.SoapVersion")
@js.native
class SoapVersion protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object SoapVersion {
  
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.SoapVersion")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.SoapVersion.Soap11")
  @js.native
  def Soap11: SoapVersion = js.native
  @scala.inline
  def Soap11_=(x: SoapVersion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Soap11")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.SoapVersion.Soap12")
  @js.native
  def Soap12: SoapVersion = js.native
  @scala.inline
  def Soap12_=(x: SoapVersion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Soap12")(x.asInstanceOf[js.Any])
}
