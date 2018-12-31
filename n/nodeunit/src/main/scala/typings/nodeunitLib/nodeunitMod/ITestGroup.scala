package typings
package nodeunitLib.nodeunitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITestGroup
  extends /* property */ org.scalablytyped.runtime.StringDictionary[
      js.UndefOr[
        ITestGroup | ITestBody | (js.Function1[/* callback */ ICallbackFunction, scala.Unit])
      ]
    ] {
  /** The setUp function is run before each test */
  var setUp: js.UndefOr[js.Function1[/* callback */ ICallbackFunction, scala.Unit]] = js.undefined
  /** The tearDown function is run after each test calls test.done() */
  var tearDown: js.UndefOr[js.Function1[/* callback */ ICallbackFunction, scala.Unit]] = js.undefined
}

