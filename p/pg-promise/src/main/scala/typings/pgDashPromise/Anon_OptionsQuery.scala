package typings.pgDashPromise

import typings.pgDashPromise.pgDashPromiseMod.IFormattingOptions
import typings.pgDashPromise.pgDashPromiseMod.QueryFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OptionsQuery extends js.Object {
  var options: js.UndefOr[IFormattingOptions] = js.undefined
  var query: String | QueryFile
  var values: js.UndefOr[js.Any] = js.undefined
}

object Anon_OptionsQuery {
  @scala.inline
  def apply(query: String | QueryFile, options: IFormattingOptions = null, values: js.Any = null): Anon_OptionsQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OptionsQuery]
  }
}

