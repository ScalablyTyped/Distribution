package typings.nodeResque.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Job[TResult] extends js.Object {
  var pluginOptions: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var plugins: js.UndefOr[js.Array[String]] = js.undefined
  def perform(args: js.Any*): js.Promise[TResult]
}

object Job {
  @scala.inline
  def apply[TResult](
    perform: /* repeated */ js.Any => js.Promise[TResult],
    pluginOptions: StringDictionary[js.Any] = null,
    plugins: js.Array[String] = null
  ): Job[TResult] = {
    val __obj = js.Dynamic.literal(perform = js.Any.fromFunction1(perform))
    if (pluginOptions != null) __obj.updateDynamic("pluginOptions")(pluginOptions.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[Job[TResult]]
  }
}

