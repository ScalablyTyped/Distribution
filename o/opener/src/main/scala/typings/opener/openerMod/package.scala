package typings.opener

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object openerMod {
  type Callback = js.Function3[/* error */ Error, /* stdout */ String, /* stderr */ String, Unit]
}
