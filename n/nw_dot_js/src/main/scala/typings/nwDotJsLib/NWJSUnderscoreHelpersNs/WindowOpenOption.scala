package typings
package nwDotJsLib.NWJSUnderscoreHelpersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WindowOpenOption extends WindowOption {
  /**
           * (Optional) The script to be injected before document unloaded.
           */
  var inject_js_end: js.UndefOr[java.lang.String] = js.undefined
  /**
           * (Optional) The script to be injected before document loaded.
           */
  var inject_js_start: js.UndefOr[java.lang.String] = js.undefined
  /**
           * (Optional) Whether to open a new window in a separate render process.
           */
  var new_instance: js.UndefOr[scala.Boolean] = js.undefined
}

