package typings
package nwDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_AddListener extends js.Object {
  /**
               * Add a new listener for onChanged event.
               *
               * @param callback {function(changeInfo?)} The callback when cookie has been changed.
               * - (Optional) changeInfo {Objet} Contains details about the cookie that's been changed.
               */
  def addListener(
    callback: js.Function1[
      /* changeInfo */ nwDotJsLib.NWJSUnderscoreHelpersNs.CookiesOnChangedCallbackChangeInfo, 
      scala.Unit
    ]
  ): scala.Unit
}

