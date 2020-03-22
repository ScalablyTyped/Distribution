package typings.minappEnv.DB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServerDateOptions extends js.Object {
  var offset: Double
}

object IServerDateOptions {
  @scala.inline
  def apply(offset: Double): IServerDateOptions = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IServerDateOptions]
  }
}

