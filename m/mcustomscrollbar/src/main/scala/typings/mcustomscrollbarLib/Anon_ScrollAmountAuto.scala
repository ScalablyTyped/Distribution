package typings
package mcustomscrollbarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_ScrollAmountAuto extends js.Object {
  /**
               * Enable or disable scroll buttons.
               */
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  /**
              * Scroll buttons pixels scrolling amount, value in pixels or "auto"
              */
  var scrollAmount: js.UndefOr[mcustomscrollbarLib.mcustomscrollbarLibStrings.auto | scala.Double] = js.undefined
  /**
              * Define the buttons scrolling type/behavior.
              * scrollType: "stepless" – continuously scroll content while pressing the button (default)
              * scrollType: "stepped" – each button click scrolls content by a certain amount (defined in scrollAmount option above)
              */
  var scrollType: js.UndefOr[
    mcustomscrollbarLib.mcustomscrollbarLibStrings.stepless | mcustomscrollbarLib.mcustomscrollbarLibStrings.stepped
  ] = js.undefined
  /**
              * Set a tabindex value for the buttons.
              */
  var tabindex: js.UndefOr[scala.Double] = js.undefined
}

