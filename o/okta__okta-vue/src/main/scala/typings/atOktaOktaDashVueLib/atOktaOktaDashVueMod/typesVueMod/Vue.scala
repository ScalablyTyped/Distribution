package typings
package atOktaOktaDashVueLib.atOktaOktaDashVueMod.typesVueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vue extends js.Object {
  @JSName("$auth")
  var $auth: atOktaOktaDashVueLib.Anon_AdditionalParams
}

object Vue {
  @scala.inline
  def apply($auth: atOktaOktaDashVueLib.Anon_AdditionalParams): Vue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$auth")($auth)
    __obj.asInstanceOf[Vue]
  }
}

