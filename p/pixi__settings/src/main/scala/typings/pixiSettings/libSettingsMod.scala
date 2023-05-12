package typings.pixiSettings

import typings.pixiSettings.libAdapterMod.IAdapter
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSettingsMod {
  
  @JSImport("@pixi/settings/lib/settings", "settings")
  @js.native
  val settings: ISettings & (Partial[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalMixins.Settings */ Any
  ]) = js.native
  
  trait ISettings extends StObject {
    
    var ADAPTER: IAdapter
    
    var CREATE_IMAGE_BITMAP: Boolean
    
    var RESOLUTION: Double
    
    var ROUND_PIXELS: Boolean
  }
  object ISettings {
    
    inline def apply(ADAPTER: IAdapter, CREATE_IMAGE_BITMAP: Boolean, RESOLUTION: Double, ROUND_PIXELS: Boolean): ISettings = {
      val __obj = js.Dynamic.literal(ADAPTER = ADAPTER.asInstanceOf[js.Any], CREATE_IMAGE_BITMAP = CREATE_IMAGE_BITMAP.asInstanceOf[js.Any], RESOLUTION = RESOLUTION.asInstanceOf[js.Any], ROUND_PIXELS = ROUND_PIXELS.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISettings] (val x: Self) extends AnyVal {
      
      inline def setADAPTER(value: IAdapter): Self = StObject.set(x, "ADAPTER", value.asInstanceOf[js.Any])
      
      inline def setCREATE_IMAGE_BITMAP(value: Boolean): Self = StObject.set(x, "CREATE_IMAGE_BITMAP", value.asInstanceOf[js.Any])
      
      inline def setRESOLUTION(value: Double): Self = StObject.set(x, "RESOLUTION", value.asInstanceOf[js.Any])
      
      inline def setROUND_PIXELS(value: Boolean): Self = StObject.set(x, "ROUND_PIXELS", value.asInstanceOf[js.Any])
    }
  }
}
