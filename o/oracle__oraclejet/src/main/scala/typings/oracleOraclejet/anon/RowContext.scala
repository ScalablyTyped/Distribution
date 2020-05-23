package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowContext
  extends /* key */ StringDictionary[js.Any] {
  var rowContext: js.Object
}

object RowContext {
  @scala.inline
  def apply(rowContext: js.Object, StringDictionary: /* name */ StringDictionary[js.Any] = null): RowContext = {
    val __obj = js.Dynamic.literal(rowContext = rowContext.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[RowContext]
  }
}

