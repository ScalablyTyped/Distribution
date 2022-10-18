package typings.mendixmodelsdk.mod.settings

import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "settings.CertificateType")
@js.native
open class CertificateType protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.settings.CertificateType {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object CertificateType {
  
  @JSImport("mendixmodelsdk", "settings.CertificateType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "settings.CertificateType.Authority")
  @js.native
  def Authority: typings.mendixmodelsdk.srcGenSettingsMod.settings.CertificateType = js.native
  inline def Authority_=(x: typings.mendixmodelsdk.srcGenSettingsMod.settings.CertificateType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Authority")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "settings.CertificateType.Client")
  @js.native
  def Client: typings.mendixmodelsdk.srcGenSettingsMod.settings.CertificateType = js.native
  inline def Client_=(x: typings.mendixmodelsdk.srcGenSettingsMod.settings.CertificateType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Client")(x.asInstanceOf[js.Any])
}
