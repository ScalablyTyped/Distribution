package typings.pdfjsDist

import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAccessibilityMod {
  
  @JSImport("pdfjs-dist/types/web/text_accessibility", "TextAccessibilityManager")
  @js.native
  open class TextAccessibilityManager () extends StObject {
    
    /**
      * Find the text node which is the nearest and add an aria-owns attribute
      * in order to correctly position this editor in the text flow.
      * @param {HTMLElement} element
      * @param {boolean} isRemovable
      */
    def addPointerInTextLayer(element: HTMLElement, isRemovable: Boolean): Unit = js.native
    
    def disable(): Unit = js.native
    
    /**
      * Function called when the text layer has finished rendering.
      */
    def enable(): Unit = js.native
    
    /**
      * Move a div in the DOM in order to respect the visual order.
      * @param {HTMLDivElement} element
      */
    def moveElementInDOM(container: Any, element: HTMLDivElement, contentElement: Any, isRemovable: Any): Unit = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      * Remove an aria-owns id from a node in the text layer.
      * @param {HTMLElement} element
      */
    def removePointerInTextLayer(element: HTMLElement): Unit = js.native
    
    def setTextMapping(textDivs: Any): Unit = js.native
  }
  /* static members */
  object TextAccessibilityManager {
    
    @JSImport("pdfjs-dist/types/web/text_accessibility", "TextAccessibilityManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Compare the positions of two elements, it must correspond to
      * the visual ordering.
      *
      * @param {HTMLElement} e1
      * @param {HTMLElement} e2
      * @returns {number}
      */
    inline def `__Numbersign23@NumbersigncompareElementPositions`(e1: HTMLElement, e2: HTMLElement): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("__#23@#compareElementPositions")(e1.asInstanceOf[js.Any], e2.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
}
