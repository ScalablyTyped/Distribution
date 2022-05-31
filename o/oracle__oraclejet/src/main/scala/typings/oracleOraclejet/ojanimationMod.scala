package typings.oracleOraclejet

import typings.oracleOraclejet.anon.Axis
import typings.oracleOraclejet.anon.Color
import typings.oracleOraclejet.anon.Delay
import typings.oracleOraclejet.anon.Direction
import typings.oracleOraclejet.anon.Duration
import typings.oracleOraclejet.anon.Persist
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojanimationMod {
  
  @JSImport("@oracle/oraclejet/ojanimation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def collapse(element: Element): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("collapse")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def collapse(element: Element, options: Delay): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("collapse")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def expand(element: Element): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("expand")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def expand(element: Element, options: Delay): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def fadeIn(element: Element): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("fadeIn")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def fadeIn(element: Element, options: Duration): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("fadeIn")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def fadeOut(element: Element): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("fadeOut")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def fadeOut(element: Element, options: Duration): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("fadeOut")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def flipIn(element: Element): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("flipIn")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def flipIn(element: Element, options: Axis): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("flipIn")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def flipOut(element: Element): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("flipOut")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def flipOut(element: Element, options: Axis): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("flipOut")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def ripple(element: Element): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("ripple")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def ripple(element: Element, options: Color): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("ripple")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def slideIn(element: Element): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("slideIn")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def slideIn(element: Element, options: Direction): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("slideIn")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def slideOut(element: Element): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("slideOut")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def slideOut(element: Element, options: Direction): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("slideOut")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def zoomIn(element: Element): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("zoomIn")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def zoomIn(element: Element, options: Persist): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomIn")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def zoomOut(element: Element): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("zoomOut")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def zoomOut(element: Element, options: Persist): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomOut")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.oracleOraclejet.oracleOraclejetStrings.collapse
    - typings.oracleOraclejet.oracleOraclejetStrings.expand
    - typings.oracleOraclejet.oracleOraclejetStrings.fadeIn
    - typings.oracleOraclejet.oracleOraclejetStrings.fadeOut
    - typings.oracleOraclejet.oracleOraclejetStrings.flipIn
    - typings.oracleOraclejet.oracleOraclejetStrings.flipOut
    - typings.oracleOraclejet.oracleOraclejetStrings.ripple
    - typings.oracleOraclejet.oracleOraclejetStrings.slideIn
    - typings.oracleOraclejet.oracleOraclejetStrings.slideOut
    - typings.oracleOraclejet.oracleOraclejetStrings.zoomIn
    - typings.oracleOraclejet.oracleOraclejetStrings.zoomOut
  */
  trait AnimationMethods extends StObject
  object AnimationMethods {
    
    inline def collapse: typings.oracleOraclejet.oracleOraclejetStrings.collapse = "collapse".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.collapse]
    
    inline def expand: typings.oracleOraclejet.oracleOraclejetStrings.expand = "expand".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.expand]
    
    inline def fadeIn: typings.oracleOraclejet.oracleOraclejetStrings.fadeIn = "fadeIn".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.fadeIn]
    
    inline def fadeOut: typings.oracleOraclejet.oracleOraclejetStrings.fadeOut = "fadeOut".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.fadeOut]
    
    inline def flipIn: typings.oracleOraclejet.oracleOraclejetStrings.flipIn = "flipIn".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.flipIn]
    
    inline def flipOut: typings.oracleOraclejet.oracleOraclejetStrings.flipOut = "flipOut".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.flipOut]
    
    inline def ripple: typings.oracleOraclejet.oracleOraclejetStrings.ripple = "ripple".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.ripple]
    
    inline def slideIn: typings.oracleOraclejet.oracleOraclejetStrings.slideIn = "slideIn".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.slideIn]
    
    inline def slideOut: typings.oracleOraclejet.oracleOraclejetStrings.slideOut = "slideOut".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.slideOut]
    
    inline def zoomIn: typings.oracleOraclejet.oracleOraclejetStrings.zoomIn = "zoomIn".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.zoomIn]
    
    inline def zoomOut: typings.oracleOraclejet.oracleOraclejetStrings.zoomOut = "zoomOut".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.zoomOut]
  }
}
