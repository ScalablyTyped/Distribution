package typings.plottable

import typings.plottable.componentMod.Component
import typings.plottable.interfacesMod.Point
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformAwareTranslatorMod {
  
  @JSImport("plottable/build/src/utils/transformAwareTranslator", "Translator")
  @js.native
  class Translator protected () extends StObject {
    def this(_rootElement: HTMLElement) = this()
    
    var _rootElement: js.Any = js.native
    
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
    
    /**
      * Is the event's target part of the given component's DOM tree?
      */
    @JSImport("plottable/build/src/utils/transformAwareTranslator", "Translator.isEventInside")
    @js.native
    def isEventInside(component: Component, e: Event): Boolean = js.native
  }
  
  @JSImport("plottable/build/src/utils/transformAwareTranslator", "getTranslator")
  @js.native
  def getTranslator(component: Component): Translator = js.native
}
