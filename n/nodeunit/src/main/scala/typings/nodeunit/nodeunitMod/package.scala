package typings.nodeunit

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeunitMod {
  type ICallbackFunction = js.Function1[/* err */ js.UndefOr[js.Any], Unit]
  type ITestBody = js.Function1[/* callback */ Test, Unit]
  type ITestCase = js.Function1[/* testCase */ StringDictionary[ITestBody | ITestGroup | Unit], Unit]
}
