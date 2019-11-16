package typings.pirates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object piratesMod {
  type Hook = js.Function2[/* code */ String, /* filename */ String, String]
  type Matcher = js.Function1[/* code */ String, Boolean]
  type RevertFunction = js.Function0[Unit]
}
