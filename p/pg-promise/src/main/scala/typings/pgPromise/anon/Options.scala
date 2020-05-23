package typings.pgPromise.anon

import typings.pgPromise.mod.IFormattingOptions
import typings.pgPromise.mod.QueryFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var options: js.UndefOr[IFormattingOptions] = js.undefined
  var query: String | QueryFile
  var values: js.UndefOr[js.Any] = js.undefined
}

object Options {
  @scala.inline
  def apply(query: String | QueryFile, options: IFormattingOptions = null, values: js.Any = null): Options = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

