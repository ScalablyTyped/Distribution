package typings
package oauth2orizeLib.oauth2orizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions extends js.Object {
  var loadTransaction: scala.Boolean
  var store: js.Any
}

object ServerOptions {
  @scala.inline
  def apply(loadTransaction: scala.Boolean, store: js.Any): ServerOptions = {
    val __obj = js.Dynamic.literal(loadTransaction = loadTransaction, store = store)
  
    __obj.asInstanceOf[ServerOptions]
  }
}

