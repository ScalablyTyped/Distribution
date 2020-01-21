package typings.postcssModulesLocalByDefault.mod

import typings.postcssModulesLocalByDefault.postcssModulesLocalByDefaultStrings.global
import typings.postcssModulesLocalByDefault.postcssModulesLocalByDefaultStrings.local
import typings.postcssModulesLocalByDefault.postcssModulesLocalByDefaultStrings.pure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var mode: js.UndefOr[global | local | pure] = js.undefined
  var rewriteUrl: js.UndefOr[js.Function2[/* global */ Boolean, /* url */ String, String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    mode: global | local | pure = null,
    rewriteUrl: (/* global */ Boolean, /* url */ String) => String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (rewriteUrl != null) __obj.updateDynamic("rewriteUrl")(js.Any.fromFunction2(rewriteUrl))
    __obj.asInstanceOf[Options]
  }
}

