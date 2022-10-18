package typings.plottable

import typings.plottable.buildSrcComponentsComponentMod.Component
import typings.plottable.buildSrcCoreInterfacesMod.Point
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcUtilsTransformAwareTranslatorMod {
  
  @JSImport("plottable/build/src/utils/transformAwareTranslator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("plottable/build/src/utils/transformAwareTranslator", "Translator")
  @js.native
  open class Translator protected () extends StObject {
    def this(_rootElement: HTMLElement) = this()
    
    /* private */ var _rootElement: Any = js.native
    
    /**
      * Given `document` client coordinates, computes the position relative to the
      * `Component`'s root element, taking into account the cumulative CSS3
      * transforms of the root element ancestors up to `<body>`.
      *
      * This triggers a layout but doesn't further modify the DOM, so causes a
      * maximum of one layout per frame.
      *
      * Does not support `transform-origin` CSS property other than the default.
      */
    def computePosition(clientX: Double, clientY: Double): Point = js.native
  }
  /* static members */
  object Translator {
    
    @JSImport("plottable/build/src/utils/transformAwareTranslator", "Translator")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Is the event's target part of the given component's DOM tree?
      */
    inline def isEventInside(component: Component, e: Event): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEventInside")(component.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  inline def getTranslator(component: Component): Translator = ^.asInstanceOf[js.Dynamic].applyDynamic("getTranslator")(component.asInstanceOf[js.Any]).asInstanceOf[Translator]
}
