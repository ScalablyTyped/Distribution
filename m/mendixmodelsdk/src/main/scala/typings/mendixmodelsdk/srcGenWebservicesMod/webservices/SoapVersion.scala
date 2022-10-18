package typings.mendixmodelsdk.srcGenWebservicesMod.webservices

import typings.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/webservices", "webservices.SoapVersion")
@js.native
open class SoapVersion protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object SoapVersion {
  
  @JSImport("mendixmodelsdk/src/gen/webservices", "webservices.SoapVersion")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/webservices", "webservices.SoapVersion.Soap11")
  @js.native
  def Soap11: SoapVersion = js.native
  inline def Soap11_=(x: SoapVersion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Soap11")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/webservices", "webservices.SoapVersion.Soap12")
  @js.native
  def Soap12: SoapVersion = js.native
  inline def Soap12_=(x: SoapVersion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Soap12")(x.asInstanceOf[js.Any])
}
