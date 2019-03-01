package typings
package nightwatchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nightwatchMod {
  type NightwatchAssert = js.Function6[
    /* passed */ scala.Boolean, 
    /* receivedValue */ js.UndefOr[js.Any], 
    /* expectedValue */ js.UndefOr[js.Any], 
    /* message */ js.UndefOr[java.lang.String], 
    /* abortOnFailure */ js.UndefOr[scala.Boolean], 
    /* originalStackTrace */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type NightwatchCallbackResult = NightwatchTypedCallbackResult[js.Any]
  type NightwatchTest = js.Function1[/* browser */ NightwatchBrowser, scala.Unit]
  type NightwatchTestHook = js.Function2[/* browser */ NightwatchBrowser, /* done */ js.Function0[scala.Unit], scala.Unit]
}
