package typings
package openui5Lib.sapNs.uiNs.coreNs.delegateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.delegate.ScrollEnablement")
@js.native
class ScrollEnablement ()
  extends openui5Lib.sapNs.uiNs.baseNs.Object {
  /**
             * Calculates scroll position of a child of a container.
             * @param vElement An element(DOM or jQuery) for which the scroll position will be calculated.
             * @returns Position object.
            */
  def getChildPosition(vElement: jqueryLib.JQueryStatic): js.Any = js.native
  /**
             * Calculates scroll position of a child of a container.
             * @param vElement An element(DOM or jQuery) for which the scroll position will be calculated.
             * @returns Position object.
            */
  def getChildPosition(vElement: stdLib.HTMLElement): js.Any = js.native
  /**
             * Get current setting for horizontal scrolling.
             * @since 1.9.1
             * @returns true if horizontal scrolling is enabled
            */
  def getHorizontal(): scala.Boolean = js.native
  /**
             * Get current setting for vertical scrolling.
             * @since 1.9.1
             * @returns true if vertical scrolling is enabled
            */
  def getVertical(): scala.Boolean = js.native
  /**
             * Refreshes this Scrolling delegate.
            */
  def refresh(): scala.Unit = js.native
  /**
             * Scrolls to an element within a container.
             * @param oElement A DOM element.
             * @param iTime The duration of animated scrolling in milliseconds. To scroll immediately without
             * animation, give 0 as value.
            */
  def scrollToElement(oElement: stdLib.HTMLElement): ScrollEnablement = js.native
  /**
             * Scrolls to an element within a container.
             * @param oElement A DOM element.
             * @param iTime The duration of animated scrolling in milliseconds. To scroll immediately without
             * animation, give 0 as value.
            */
  def scrollToElement(oElement: stdLib.HTMLElement, iTime: scala.Double): ScrollEnablement = js.native
  /**
             * Setter for property <code>bounce</code>.
             * @since 1.17
             * @param bBounce new value for property <code>bounce</code>.
            */
  def setBounce(bBounce: scala.Boolean): scala.Unit = js.native
  /**
             * Sets GrowingList control to scroll container
             * @since 1.11.0
             * @param fnScrollLoadCallback Scrolling callback
             * @param sScrollLoadDirection Scrolling directionThis function is supported in iScroll and mouse
             * delegates only.
            */
  def setGrowingList(fnScrollLoadCallback: js.Any, sScrollLoadDirection: openui5Lib.sapNs.mNs.ListGrowingDirection): scala.Unit = js.native
  /**
             * Enable or disable horizontal scrolling.
             * @param bHorizontal set true to enable horizontal scrolling, false - to disable
            */
  def setHorizontal(bHorizontal: scala.Boolean): scala.Unit = js.native
  /**
             * Sets IconTabBar control to scroll container
             * @since 1.16.1
             * @param IconTabBar instanceThis function is supported in iScroll only.
            */
  def setIconTabBar(IconTabBar: openui5Lib.sapNs.mNs.IconTabBar): scala.Unit = js.native
  /**
             * Set overflow control on top of scroll container.
             * @since 1.9.2
             * @param top control that should be normally hidden overthe top border of the scroll container
             * (pull-down content).This function is supported in iScroll delegates only. In MouseScroll delegates
             * the element is not hidden and should have an appropriate rendering for being always displayed and
             * should have an alternative way for triggering (e.g. a Button).
            */
  def setPullDown(top: openui5Lib.sapNs.uiNs.coreNs.Control): scala.Unit = js.native
  /**
             * Enable or disable vertical scrolling.
             * @param bVertical set true to enable vertical scrolling, false - to disable
            */
  def setVertical(bVertical: scala.Boolean): scala.Unit = js.native
}

