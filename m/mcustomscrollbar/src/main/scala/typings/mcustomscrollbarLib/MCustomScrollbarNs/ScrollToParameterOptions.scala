package typings
package mcustomscrollbarLib.MCustomScrollbarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ScrollToParameterOptions extends js.Object {
  /**
          * Trigger user defined callback after scroll-to completes, value: true, false
          */
  var callbacks: js.UndefOr[scala.Boolean] = js.undefined
  /**
          * Scroll scrollbar dragger (instead of content) to a number of pixels, values: true, false
          */
  var moveDragger: js.UndefOr[scala.Boolean] = js.undefined
  /**
          * Scroll-to animation easing, values: "linear", "easeOut", "easeInOut".
          */
  var scrollEasing: js.UndefOr[java.lang.String] = js.undefined
  /**
          * Scroll-to animation speed, value in milliseconds
          */
  var scrollInertia: js.UndefOr[scala.Double] = js.undefined
  /**
          * Set a timeout for the method (the default timeout is 60 ms in order to work with automatic scrollbar update), value in milliseconds.
          */
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

