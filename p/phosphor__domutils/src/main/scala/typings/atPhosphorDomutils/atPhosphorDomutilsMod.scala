package typings.atPhosphorDomutils

import typings.atPhosphorDomutils.libElementMod.ElementExtNs.IBoxSizing
import typings.atPhosphorDomutils.libElementMod.ElementExtNs.ISizeLimits
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/domutils", JSImport.Namespace)
@js.native
object atPhosphorDomutilsMod extends js.Object {
  @JSName("ElementExt")
  @js.native
  object ElementExtNs extends js.Object {
    /**
      * Compute the box sizing for an element.
      *
      * @param element - The element of interest.
      *
      * @returns The box sizing data for the specified element.
      */
    def boxSizing(element: Element): IBoxSizing = js.native
    /**
      * Test whether a client position lies within an element.
      *
      * @param element - The DOM element of interest.
      *
      * @param clientX - The client X coordinate of interest.
      *
      * @param clientY - The client Y coordinate of interest.
      *
      * @returns Whether the point is within the given element.
      */
    def hitTest(element: Element, clientX: Double, clientY: Double): Boolean = js.native
    /**
      * Vertically scroll an element into view if needed.
      *
      * @param area - The scroll area element.
      *
      * @param element - The element of interest.
      *
      * #### Notes
      * This follows the "nearest" behavior of the native `scrollIntoView`
      * method, which is not supported by all browsers.
      * https://drafts.csswg.org/cssom-view/#element-scrolling-members
      *
      * If the element fully covers the visible area or is fully contained
      * within the visible area, no scrolling will take place. Otherwise,
      * the nearest edges of the area and element are aligned.
      */
    def scrollIntoViewIfNeeded(area: Element, element: Element): Unit = js.native
    /**
      * Compute the size limits for an element.
      *
      * @param element - The element of interest.
      *
      * @returns The size limit data for the specified element.
      */
    def sizeLimits(element: Element): ISizeLimits = js.native
  }
  
  @JSName("Platform")
  @js.native
  object PlatformNs extends js.Object {
    /**
      * A flag indicating whether the browser is Edge.
      */
    val IS_EDGE: Boolean = js.native
    /**
      * A flag indicating whether the browser is IE.
      */
    val IS_IE: Boolean = js.native
    /**
      * A flag indicating whether the platform is Mac.
      */
    val IS_MAC: Boolean = js.native
    /**
      * A flag indicating whether the platform is Windows.
      */
    val IS_WIN: Boolean = js.native
  }
  
  @JSName("Selector")
  @js.native
  object SelectorNs extends js.Object {
    /**
      * Calculate the specificity of a single CSS selector.
      *
      * @param selector - The CSS selector of interest.
      *
      * @returns The specificity of the selector.
      *
      * #### Undefined Behavior
      * The selector is invalid.
      *
      * #### Notes
      * This is based on https://www.w3.org/TR/css3-selectors/#specificity
      *
      * A larger number represents a more specific selector.
      *
      * The smallest possible specificity is `0`.
      *
      * The result is represented as a hex number `0x<aa><bb><cc>` where
      * each component is the count of the respective selector clause.
      *
      * If the selector contains commas, only the first clause is used.
      *
      * The computed result is cached, so subsequent calculations for the
      * same selector are extremely fast.
      */
    def calculateSpecificity(selector: String): Double = js.native
    /**
      * Test whether a selector is a valid CSS selector.
      *
      * @param selector - The CSS selector of interest.
      *
      * @returns `true` if the selector is valid, `false` otherwise.
      *
      * #### Notes
      * The computed result is cached, so subsequent tests for the same
      * selector are extremely fast.
      */
    def isValid(selector: String): Boolean = js.native
    /**
      * Test whether an element matches a CSS selector.
      *
      * @param element - The element of interest.
      *
      * @param selector - The valid CSS selector of interest.
      *
      * @returns `true` if the element is a match, `false` otherwise.
      *
      * #### Notes
      * This function uses the builtin browser capabilities when possible,
      * falling back onto a document query otherwise.
      */
    def matches(element: Element, selector: String): Boolean = js.native
  }
  
}

