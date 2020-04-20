package typings.minappEnv.App

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILaunchOptions extends js.Object {
  var query: Double
}

object ILaunchOptions {
  @scala.inline
  def apply(query: Double): ILaunchOptions = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILaunchOptions]
  }
}

