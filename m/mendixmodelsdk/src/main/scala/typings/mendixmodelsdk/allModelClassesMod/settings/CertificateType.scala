package typings.mendixmodelsdk.allModelClassesMod.settings

import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/all-model-classes", "settings.CertificateType")
@js.native
open class CertificateType protected ()
  extends typings.mendixmodelsdk.settingsMod.settings.CertificateType {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object CertificateType {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "settings.CertificateType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "settings.CertificateType.Authority")
  @js.native
  def Authority: typings.mendixmodelsdk.settingsMod.settings.CertificateType = js.native
  inline def Authority_=(x: typings.mendixmodelsdk.settingsMod.settings.CertificateType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Authority")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "settings.CertificateType.Client")
  @js.native
  def Client: typings.mendixmodelsdk.settingsMod.settings.CertificateType = js.native
  inline def Client_=(x: typings.mendixmodelsdk.settingsMod.settings.CertificateType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Client")(x.asInstanceOf[js.Any])
}
