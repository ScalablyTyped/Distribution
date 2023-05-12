package typings.pixiSettings

import typings.pixiSettings.libAdapterMod.IAdapter
import typings.pixiSettings.libSettingsMod.ISettings
import typings.pixiSettings.libUtilsIsMobileMod.isMobileResult
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/settings", "BrowserAdapter")
  @js.native
  val BrowserAdapter: IAdapter = js.native
  
  @JSImport("@pixi/settings", "isMobile")
  @js.native
  val isMobile: isMobileResult = js.native
  
  @JSImport("@pixi/settings", "settings")
  @js.native
  val settings: ISettings & (Partial[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalMixins.Settings */ Any
  ]) = js.native
}
