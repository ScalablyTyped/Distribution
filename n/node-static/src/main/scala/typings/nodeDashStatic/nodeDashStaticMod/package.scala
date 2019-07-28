package typings.nodeDashStatic

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashStaticMod {
  type Callback = js.Function1[/* e */ Error, Unit]
  type Finish = js.Function2[/* status */ Double, /* headers */ js.UndefOr[Headers], Unit]
  type Headers = StringDictionary[js.Any]
}
