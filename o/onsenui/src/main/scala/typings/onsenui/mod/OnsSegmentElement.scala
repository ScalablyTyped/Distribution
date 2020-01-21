package typings.onsenui.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnsSegmentElement extends HTMLElement {
  /**
    * @description Whether the element is disabled or not.
    */
  var disabled: Boolean = js.native
  /**
    * @return {Number} The index of the currently active button
    * @description Returns button index of current active button. If active button is not found, returns -1
    */
  def getActiveButtonIndex(): Double = js.native
  /**
    * @param {Number} index Button index
    * @param {Object} [options] Parameter object passed to the tabbar, if any.
    * @return Resolves to the selected index or to the new page element if there is a connected tabbar.
    * @description Make button with the specified index active. If there is a connected tabbar it shows the corresponding tab page. In this case animations and other options can be specified by the second parameter.
    */
  def setActiveButton(index: Double): js.Promise[HTMLElement] = js.native
  def setActiveButton(index: Double, options: TabbarOptions): js.Promise[HTMLElement] = js.native
}

