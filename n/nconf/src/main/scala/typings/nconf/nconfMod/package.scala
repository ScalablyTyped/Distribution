package typings.nconf

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nconfMod {
  type ICallbackFunction = js.Function1[/* err */ Error, Unit]
  type IOptions = StringDictionary[js.Any]
}
