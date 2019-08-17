package typings.nconf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nconfMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Error

  type ICallbackFunction = js.Function1[/* err */ Error, Unit]
  type IOptions = StringDictionary[js.Any]
}
