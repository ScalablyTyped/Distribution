package typings.nightwatch.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchTestFunctions
  extends /* key */ StringDictionary[js.Any]
     with NightwatchTests {
  var `@disabled`: js.UndefOr[Boolean] = js.undefined
  var `@tags`: js.UndefOr[String | js.Array[String]] = js.undefined
  var after: js.UndefOr[NightwatchTestHook] = js.undefined
  var afterEach: js.UndefOr[NightwatchTestHook] = js.undefined
  var before: js.UndefOr[NightwatchTestHook] = js.undefined
  var beforeEach: js.UndefOr[NightwatchTestHook] = js.undefined
}

object NightwatchTestFunctions {
  @scala.inline
  def apply(
    `@disabled`: js.UndefOr[Boolean] = js.undefined,
    `@tags`: String | js.Array[String] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    after: NightwatchTestHook = null,
    afterEach: NightwatchTestHook = null,
    before: NightwatchTestHook = null,
    beforeEach: NightwatchTestHook = null
  ): NightwatchTestFunctions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`@disabled`)) __obj.updateDynamic("@disabled")(`@disabled`.asInstanceOf[js.Any])
    if (`@tags` != null) __obj.updateDynamic("@tags")(`@tags`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (afterEach != null) __obj.updateDynamic("afterEach")(afterEach.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (beforeEach != null) __obj.updateDynamic("beforeEach")(beforeEach.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchTestFunctions]
  }
}

