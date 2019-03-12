package typings
package postcssDashModulesDashScopeLib.postcssDashModulesDashScopeMod.scopeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var generateScopedName: js.UndefOr[
    js.Function3[
      /* exportedName */ java.lang.String, 
      /* path */ java.lang.String, 
      /* css */ java.lang.String, 
      java.lang.String
    ]
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    generateScopedName: (/* exportedName */ java.lang.String, /* path */ java.lang.String, /* css */ java.lang.String) => java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (generateScopedName != null) __obj.updateDynamic("generateScopedName")(js.Any.fromFunction3(generateScopedName))
    __obj.asInstanceOf[Options]
  }
}

