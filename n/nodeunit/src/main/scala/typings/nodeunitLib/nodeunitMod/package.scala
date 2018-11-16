package typings
package nodeunitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeunitMod {
  type ICallbackFunction = js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]
  type ITestBody = js.Function1[/* callback */ Test, scala.Unit]
  type ITestCase = js.Function1[
    /* testCase */ ScalablyTyped.runtime.StringDictionary[ITestBody | ITestGroup | scala.Unit], 
    scala.Unit
  ]
}
