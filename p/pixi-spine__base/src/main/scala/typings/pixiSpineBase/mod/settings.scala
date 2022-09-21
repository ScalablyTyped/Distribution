package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settings {
  
  @JSImport("@pixi-spine/base", "settings")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * pixi-spine gives option to not fail at certain parsing errors
    * spine-ts fails here
    */
  @JSImport("@pixi-spine/base", "settings.FAIL_ON_NON_EXISTING_SKIN")
  @js.native
  def FAIL_ON_NON_EXISTING_SKIN: Boolean = js.native
  inline def FAIL_ON_NON_EXISTING_SKIN_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAIL_ON_NON_EXISTING_SKIN")(x.asInstanceOf[js.Any])
  
  /**
    * past Spine.globalAutoUpdate
    */
  @JSImport("@pixi-spine/base", "settings.GLOBAL_AUTO_UPDATE")
  @js.native
  def GLOBAL_AUTO_UPDATE: Boolean = js.native
  inline def GLOBAL_AUTO_UPDATE_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GLOBAL_AUTO_UPDATE")(x.asInstanceOf[js.Any])
  
  /**
    * past Spine.globalDelayLimit
    */
  @JSImport("@pixi-spine/base", "settings.GLOBAL_DELAY_LIMIT")
  @js.native
  def GLOBAL_DELAY_LIMIT: Double = js.native
  inline def GLOBAL_DELAY_LIMIT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GLOBAL_DELAY_LIMIT")(x.asInstanceOf[js.Any])
  
  @JSImport("@pixi-spine/base", "settings.yDown")
  @js.native
  def yDown: Boolean = js.native
  inline def yDown_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yDown")(x.asInstanceOf[js.Any])
}
