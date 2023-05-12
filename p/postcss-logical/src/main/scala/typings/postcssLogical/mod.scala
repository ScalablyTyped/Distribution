package typings.postcssLogical

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.PluginCreator
import typings.postcssLogical.distLibTypesMod.DirectionFlow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-logical", JSImport.Default)
  @js.native
  val default: PluginCreator[pluginOptions] = js.native
  
  type _To = PluginCreator[pluginOptions]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: PluginCreator[pluginOptions] = default
  
  trait pluginOptions extends StObject {
    
    /** Sets the direction for block. default: top-to-bottom */
    var blockDirection: js.UndefOr[DirectionFlow] = js.undefined
    
    /** Sets the direction for inline. default: left-to-right */
    var inlineDirection: js.UndefOr[DirectionFlow] = js.undefined
  }
  object pluginOptions {
    
    inline def apply(): pluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[pluginOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: pluginOptions] (val x: Self) extends AnyVal {
      
      inline def setBlockDirection(value: DirectionFlow): Self = StObject.set(x, "blockDirection", value.asInstanceOf[js.Any])
      
      inline def setBlockDirectionUndefined: Self = StObject.set(x, "blockDirection", js.undefined)
      
      inline def setInlineDirection(value: DirectionFlow): Self = StObject.set(x, "inlineDirection", value.asInstanceOf[js.Any])
      
      inline def setInlineDirectionUndefined: Self = StObject.set(x, "inlineDirection", js.undefined)
    }
  }
}
