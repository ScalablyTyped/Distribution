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

object Anon_AddListener {
  @scala.inline
  def apply(
    addListener: js.Function1[
      /* changeInfo */ nwDotJsLib.NWJSUnderscoreHelpersNs.CookiesOnChangedCallbackChangeInfo, 
      scala.Unit
    ] => scala.Unit
  ): Anon_AddListener = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener))
  
    __obj.asInstanceOf[Anon_AddListener]
  }
}

