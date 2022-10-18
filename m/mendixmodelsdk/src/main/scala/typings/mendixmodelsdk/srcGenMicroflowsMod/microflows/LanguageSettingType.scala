package typings.mendixmodelsdk.srcGenMicroflowsMod.microflows

import typings.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/microflows", "microflows.LanguageSettingType")
@js.native
open class LanguageSettingType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object LanguageSettingType {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.LanguageSettingType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.LanguageSettingType.CurrentUser")
  @js.native
  def CurrentUser: LanguageSettingType = js.native
  inline def CurrentUser_=(x: LanguageSettingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CurrentUser")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.LanguageSettingType.ProjectDefault")
  @js.native
  def ProjectDefault: LanguageSettingType = js.native
  inline def ProjectDefault_=(x: LanguageSettingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ProjectDefault")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.LanguageSettingType.Variable")
  @js.native
  def Variable: LanguageSettingType = js.native
  inline def Variable_=(x: LanguageSettingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Variable")(x.asInstanceOf[js.Any])
}
