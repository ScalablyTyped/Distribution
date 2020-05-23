package typings.pirates.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The extensions to hook. Should start with '.' (ex. ['.js']).
    *
    * @default ['.js']
    */
  var exts: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Auto-ignore node_modules. Independent of any matcher.
    *
    * @default true
    */
  var ignoreNodeModules: js.UndefOr[Boolean] = js.undefined
  /** A matcher function, will be called with path to a file. Should return truthy if the file should be hooked, falsy otherwise. */
  var matcher: js.UndefOr[Matcher] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    exts: js.Array[String] = null,
    ignoreNodeModules: js.UndefOr[Boolean] = js.undefined,
    matcher: /* code */ String => Boolean = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (exts != null) __obj.updateDynamic("exts")(exts.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreNodeModules)) __obj.updateDynamic("ignoreNodeModules")(ignoreNodeModules.get.asInstanceOf[js.Any])
    if (matcher != null) __obj.updateDynamic("matcher")(js.Any.fromFunction1(matcher))
    __obj.asInstanceOf[Options]
  }
}

