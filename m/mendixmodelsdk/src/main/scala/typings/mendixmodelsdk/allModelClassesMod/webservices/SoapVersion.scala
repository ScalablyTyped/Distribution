package typings.mendixmodelsdk.allModelClassesMod.webservices

import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/all-model-classes", "webservices.SoapVersion")
@js.native
open class SoapVersion protected ()
  extends typings.mendixmodelsdk.webservicesMod.webservices.SoapVersion {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object SoapVersion {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "webservices.SoapVersion")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "webservices.SoapVersion.Soap11")
  @js.native
  def Soap11: typings.mendixmodelsdk.webservicesMod.webservices.SoapVersion = js.native
  inline def Soap11_=(x: typings.mendixmodelsdk.webservicesMod.webservices.SoapVersion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Soap11")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "webservices.SoapVersion.Soap12")
  @js.native
  def Soap12: typings.mendixmodelsdk.webservicesMod.webservices.SoapVersion = js.native
  inline def Soap12_=(x: typings.mendixmodelsdk.webservicesMod.webservices.SoapVersion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Soap12")(x.asInstanceOf[js.Any])
}
