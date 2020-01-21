package typings.postcssModulesScope.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var generateScopedName: js.UndefOr[
    js.Function3[/* exportedName */ String, /* path */ String, /* css */ String, String]
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    generateScopedName: (/* exportedName */ String, /* path */ String, /* css */ String) => String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (generateScopedName != null) __obj.updateDynamic("generateScopedName")(js.Any.fromFunction3(generateScopedName))
    __obj.asInstanceOf[Options]
  }
}

