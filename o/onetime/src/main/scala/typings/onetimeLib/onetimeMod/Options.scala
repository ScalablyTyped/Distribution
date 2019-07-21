package typings
package onetimeLib.onetimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Throw an error when called more than once.
  		@default false
  		*/
  var `throw`: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(`throw`: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`throw`)) __obj.updateDynamic("throw")(`throw`)
    __obj.asInstanceOf[Options]
  }
}

