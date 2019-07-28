package typings.atPhosphorDomutils.libElementMod

import typings.atPhosphorDomutils.libElementMod.ElementExtNs.IBoxSizing
import typings.atPhosphorDomutils.libElementMod.ElementExtNs.ISizeLimits
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/domutils/lib/element", "ElementExt")
@js.native
object ElementExtNs extends js.Object {
  /**
    * An object which holds the border and padding data for an element.
    */
  trait IBoxSizing extends js.Object {
    /**
      * The bottom border width, in pixels.
      */
    var borderBottom: Double
    /**
      * The left border width, in pixels.
      */
    var borderLeft: Double
    /**
      * The right border width, in pixels.
      */
    var borderRight: Double
    /**
      * The top border width, in pixels.
      */
    var borderTop: Double
    /**
      * The sum of horizontal border and padding.
      */
    var horizontalSum: Double
    /**
      * The bottom padding width, in pixels.
      */
    var paddingBottom: Double
    /**
      * The left padding width, in pixels.
      */
    var paddingLeft: Double
    /**
      * The right padding width, in pixels.
      */
    var paddingRight: Double
    /**
      * The top padding width, in pixels.
      */
    var paddingTop: Double
    /**
      * The sum of vertical border and padding.
      */
    var verticalSum: Double
  }
  
  /**
    * An object which holds the min and max size data for an element.
    */
  trait ISizeLimits extends js.Object {
    /**
      * The maximum height, in pixels.
      */
    var maxHeight: Double
    /**
      * The maximum width, in pixels.
      */
    var maxWidth: Double
    /**
      * The minimum height, in pixels.
      */
    var minHeight: Double
    /**
      * The minimum width, in pixels.
      */
    var minWidth: Double
  }
  
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

