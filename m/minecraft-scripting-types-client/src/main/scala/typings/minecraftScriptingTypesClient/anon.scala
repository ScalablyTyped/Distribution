package typings.minecraftScriptingTypesClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Absorbsinput extends StObject {
    
    /**
      * If true, input will not be passed down to any other screens underneath
      */
    var absorbs_input: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the screen will always accept and process input for as long as it is in the stack, even if other custom UI screens appear on top of it
      */
    var always_accepts_input: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, this screen will be rendered even if another screen is on top of it and will render over them, including the HUD
      */
    var force_render_below: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the screen will be treated as the pause menu and the pause menu won't be allowed to show on top of this screen
      */
    var is_showing_menu: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the game will continue to be rendered underneath this screen
      */
    var render_game_behind: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, this screen will only be rendered if it is the screen at the top of the stack
      */
    var render_only_when_topmost: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the screen will capture the mouse pointer and limit its movement to the UI screen
      */
    var should_steal_mouse: js.UndefOr[Boolean] = js.undefined
  }
  object Absorbsinput {
    
    inline def apply(): Absorbsinput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Absorbsinput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Absorbsinput] (val x: Self) extends AnyVal {
      
      inline def setAbsorbs_input(value: Boolean): Self = StObject.set(x, "absorbs_input", value.asInstanceOf[js.Any])
      
      inline def setAbsorbs_inputUndefined: Self = StObject.set(x, "absorbs_input", js.undefined)
      
      inline def setAlways_accepts_input(value: Boolean): Self = StObject.set(x, "always_accepts_input", value.asInstanceOf[js.Any])
      
      inline def setAlways_accepts_inputUndefined: Self = StObject.set(x, "always_accepts_input", js.undefined)
      
      inline def setForce_render_below(value: Boolean): Self = StObject.set(x, "force_render_below", value.asInstanceOf[js.Any])
      
      inline def setForce_render_belowUndefined: Self = StObject.set(x, "force_render_below", js.undefined)
      
      inline def setIs_showing_menu(value: Boolean): Self = StObject.set(x, "is_showing_menu", value.asInstanceOf[js.Any])
      
      inline def setIs_showing_menuUndefined: Self = StObject.set(x, "is_showing_menu", js.undefined)
      
      inline def setRender_game_behind(value: Boolean): Self = StObject.set(x, "render_game_behind", value.asInstanceOf[js.Any])
      
      inline def setRender_game_behindUndefined: Self = StObject.set(x, "render_game_behind", js.undefined)
      
      inline def setRender_only_when_topmost(value: Boolean): Self = StObject.set(x, "render_only_when_topmost", value.asInstanceOf[js.Any])
      
      inline def setRender_only_when_topmostUndefined: Self = StObject.set(x, "render_only_when_topmost", js.undefined)
      
      inline def setShould_steal_mouse(value: Boolean): Self = StObject.set(x, "should_steal_mouse", value.asInstanceOf[js.Any])
      
      inline def setShould_steal_mouseUndefined: Self = StObject.set(x, "should_steal_mouse", js.undefined)
    }
  }
}
