package typings.phaser.Phaser.Types.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BannerConfig extends StObject {
  
  /**
    * The background colors of the banner.
    */
  var background: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Omit Phaser's name and version from the banner.
    */
  var hidePhaser: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The color of the banner text.
    */
  var text: js.UndefOr[String] = js.undefined
}
object BannerConfig {
  
  inline def apply(): BannerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BannerConfig]
  }
  
  extension [Self <: BannerConfig](x: Self) {
    
    inline def setBackground(value: js.Array[String]): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBackgroundVarargs(value: String*): Self = StObject.set(x, "background", js.Array(value*))
    
    inline def setHidePhaser(value: Boolean): Self = StObject.set(x, "hidePhaser", value.asInstanceOf[js.Any])
    
    inline def setHidePhaserUndefined: Self = StObject.set(x, "hidePhaser", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
