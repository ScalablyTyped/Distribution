package typings.osLocale.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Set to `false` to avoid spawning subprocesses and instead only resolve the locale from environment variables.
  		@default true
  		*/
  val spawn: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(spawn: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(spawn)) __obj.updateDynamic("spawn")(spawn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

