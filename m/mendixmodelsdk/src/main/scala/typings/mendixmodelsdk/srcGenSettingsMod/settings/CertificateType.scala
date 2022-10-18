package typings.mendixmodelsdk.srcGenSettingsMod.settings

import typings.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/settings", "settings.CertificateType")
@js.native
open class CertificateType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object CertificateType {
  
  @JSImport("mendixmodelsdk/src/gen/settings", "settings.CertificateType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/settings", "settings.CertificateType.Authority")
  @js.native
  def Authority: CertificateType = js.native
  inline def Authority_=(x: CertificateType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Authority")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/settings", "settings.CertificateType.Client")
  @js.native
  def Client: CertificateType = js.native
  inline def Client_=(x: CertificateType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Client")(x.asInstanceOf[js.Any])
}
