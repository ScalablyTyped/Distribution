package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryContext
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var transaction: Transaction
}

object QueryContext {
  @scala.inline
  def apply(
    transaction: Transaction,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): QueryContext = {
    val __obj = js.Dynamic.literal(transaction = transaction)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[QueryContext]
  }
}

