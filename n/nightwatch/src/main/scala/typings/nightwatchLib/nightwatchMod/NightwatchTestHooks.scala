package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NightwatchTestHooks extends js.Object {
  var `@disabled`: js.UndefOr[scala.Boolean] = js.undefined
  var after: js.UndefOr[NightwatchTestHook] = js.undefined
  var afterEach: js.UndefOr[NightwatchTestHook] = js.undefined
  var before: js.UndefOr[NightwatchTestHook] = js.undefined
  var beforeEach: js.UndefOr[NightwatchTestHook] = js.undefined
}

