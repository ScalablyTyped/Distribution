package typings.nouislider

import typings.nouislider.mod.Options
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object noUiSlider {
    
    @JSGlobal("noUiSlider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * To create a slider, call noUiSlider.create() with an element and your options.
      */
    inline def create(target: HTMLElement, options: Options): typings.nouislider.mod.noUiSlider = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.nouislider.mod.noUiSlider]
  }
}
