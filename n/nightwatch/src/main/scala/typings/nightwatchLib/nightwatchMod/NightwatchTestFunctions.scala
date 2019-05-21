package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchTestFunctions
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]
     with NightwatchTests {
  var `@disabled`: js.UndefOr[scala.Boolean] = js.undefined
  var `@tags`: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var after: js.UndefOr[NightwatchTestHook] = js.undefined
  var afterEach: js.UndefOr[NightwatchTestHook] = js.undefined
  var before: js.UndefOr[NightwatchTestHook] = js.undefined
  var beforeEach: js.UndefOr[NightwatchTestHook] = js.undefined
}

object NightwatchTestFunctions {
  @scala.inline
  def apply(
    `@disabled`: js.UndefOr[scala.Boolean] = js.undefined,
    `@tags`: java.lang.String | js.Array[java.lang.String] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    after: NightwatchTestHook = null,
    afterEach: NightwatchTestHook = null,
    before: NightwatchTestHook = null,
    beforeEach: NightwatchTestHook = null
  ): NightwatchTestFunctions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`@disabled`)) __obj.updateDynamic("@disabled")(`@disabled`)
    if (`@tags` != null) __obj.updateDynamic("@tags")(`@tags`.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (afterEach != null) __obj.updateDynamic("afterEach")(afterEach.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (beforeEach != null) __obj.updateDynamic("beforeEach")(beforeEach.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchTestFunctions]
  }
}

