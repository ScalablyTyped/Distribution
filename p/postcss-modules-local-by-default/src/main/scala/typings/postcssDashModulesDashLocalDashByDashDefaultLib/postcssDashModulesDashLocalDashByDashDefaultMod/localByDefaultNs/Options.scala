package typings
package postcssDashModulesDashLocalDashByDashDefaultLib.postcssDashModulesDashLocalDashByDashDefaultMod.localByDefaultNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var mode: js.UndefOr[
    postcssDashModulesDashLocalDashByDashDefaultLib.postcssDashModulesDashLocalDashByDashDefaultLibStrings.global | postcssDashModulesDashLocalDashByDashDefaultLib.postcssDashModulesDashLocalDashByDashDefaultLibStrings.local | postcssDashModulesDashLocalDashByDashDefaultLib.postcssDashModulesDashLocalDashByDashDefaultLibStrings.pure
  ] = js.undefined
  var rewriteUrl: js.UndefOr[
    js.Function2[/* global */ scala.Boolean, /* url */ java.lang.String, java.lang.String]
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    mode: postcssDashModulesDashLocalDashByDashDefaultLib.postcssDashModulesDashLocalDashByDashDefaultLibStrings.global | postcssDashModulesDashLocalDashByDashDefaultLib.postcssDashModulesDashLocalDashByDashDefaultLibStrings.local | postcssDashModulesDashLocalDashByDashDefaultLib.postcssDashModulesDashLocalDashByDashDefaultLibStrings.pure = null,
    rewriteUrl: js.Function2[/* global */ scala.Boolean, /* url */ java.lang.String, java.lang.String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (rewriteUrl != null) __obj.updateDynamic("rewriteUrl")(rewriteUrl)
    __obj.asInstanceOf[Options]
  }
}

