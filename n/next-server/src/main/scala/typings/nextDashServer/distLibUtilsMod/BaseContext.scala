package typings.nextDashServer.distLibUtilsMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseContext
  extends /* k */ StringDictionary[js.Any] {
  var res: js.UndefOr[ServerResponse] = js.undefined
}

object BaseContext {
  @scala.inline
  def apply(StringDictionary: /* k */ StringDictionary[js.Any] = null, res: ServerResponse = null): BaseContext = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (res != null) __obj.updateDynamic("res")(res.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseContext]
  }
}

