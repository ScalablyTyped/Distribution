package typings.mendixmodelsdk.settingsMod.settings

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/settings", "settings.HashAlgorithmType")
@js.native
open class HashAlgorithmType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object HashAlgorithmType {
  
  @JSImport("mendixmodelsdk/src/gen/settings", "settings.HashAlgorithmType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/settings", "settings.HashAlgorithmType.BCrypt")
  @js.native
  def BCrypt: HashAlgorithmType = js.native
  inline def BCrypt_=(x: HashAlgorithmType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BCrypt")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/settings", "settings.HashAlgorithmType.MD5")
  @js.native
  def MD5: HashAlgorithmType = js.native
  inline def MD5_=(x: HashAlgorithmType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MD5")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/settings", "settings.HashAlgorithmType.SHA256")
  @js.native
  def SHA256: HashAlgorithmType = js.native
  inline def SHA256_=(x: HashAlgorithmType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHA256")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/settings", "settings.HashAlgorithmType.SSHA256")
  @js.native
  def SSHA256: HashAlgorithmType = js.native
  inline def SSHA256_=(x: HashAlgorithmType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SSHA256")(x.asInstanceOf[js.Any])
}
