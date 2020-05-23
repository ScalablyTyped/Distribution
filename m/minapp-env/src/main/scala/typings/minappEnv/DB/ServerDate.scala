package typings.minappEnv.DB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerDate extends js.Object {
  val options: IServerDateOptions
}

object ServerDate {
  @scala.inline
  def apply(options: IServerDateOptions): ServerDate = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerDate]
  }
}

