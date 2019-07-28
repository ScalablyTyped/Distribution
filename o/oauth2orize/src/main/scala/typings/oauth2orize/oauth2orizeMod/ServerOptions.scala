package typings.oauth2orize.oauth2orizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions extends js.Object {
  var loadTransaction: Boolean
  var store: js.Any
}

object ServerOptions {
  @scala.inline
  def apply(loadTransaction: Boolean, store: js.Any): ServerOptions = {
    val __obj = js.Dynamic.literal(loadTransaction = loadTransaction, store = store)
  
    __obj.asInstanceOf[ServerOptions]
  }
}

