package typings.mendixmodelsdk.srcGenSettingsMod.settings

import typings.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/settings", "settings.ThemeConversionStatusEnum")
@js.native
open class ThemeConversionStatusEnum protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object ThemeConversionStatusEnum {
  
  @JSImport("mendixmodelsdk/src/gen/settings", "settings.ThemeConversionStatusEnum")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/settings", "settings.ThemeConversionStatusEnum.AtlasNotFound")
  @js.native
  def AtlasNotFound: ThemeConversionStatusEnum = js.native
  inline def AtlasNotFound_=(x: ThemeConversionStatusEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AtlasNotFound")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/settings", "settings.ThemeConversionStatusEnum.ChangesInAtlas")
  @js.native
  def ChangesInAtlas: ThemeConversionStatusEnum = js.native
  inline def ChangesInAtlas_=(x: ThemeConversionStatusEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ChangesInAtlas")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/settings", "settings.ThemeConversionStatusEnum.ConvertedChangesInCustom")
  @js.native
  def ConvertedChangesInCustom: ThemeConversionStatusEnum = js.native
  inline def ConvertedChangesInCustom_=(x: ThemeConversionStatusEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConvertedChangesInCustom")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/settings", "settings.ThemeConversionStatusEnum.ConvertedChangesInVariables")
  @js.native
  def ConvertedChangesInVariables: ThemeConversionStatusEnum = js.native
  inline def ConvertedChangesInVariables_=(x: ThemeConversionStatusEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConvertedChangesInVariables")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/settings", "settings.ThemeConversionStatusEnum.Done")
  @js.native
  def Done: ThemeConversionStatusEnum = js.native
  inline def Done_=(x: ThemeConversionStatusEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Done")(x.asInstanceOf[js.Any])
}
