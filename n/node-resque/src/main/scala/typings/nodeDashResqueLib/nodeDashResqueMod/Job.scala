package typings
package nodeDashResqueLib.nodeDashResqueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Job[TResult] extends js.Object {
  var pluginOptions: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var plugins: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  def perform(args: js.Any*): js.Promise[TResult]
}

object Job {
  @scala.inline
  def apply[TResult](
    perform: js.Function1[/* repeated */ js.Any, js.Promise[TResult]],
    pluginOptions: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    plugins: js.Array[java.lang.String] = null
  ): Job[TResult] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("perform")(perform)
    if (pluginOptions != null) __obj.updateDynamic("pluginOptions")(pluginOptions)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    __obj.asInstanceOf[Job[TResult]]
  }
}

