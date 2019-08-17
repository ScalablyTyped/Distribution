package typings.opener

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object openerMod {
  import typings.std.Error

  type Callback = js.Function3[/* error */ Error, /* stdout */ String, /* stderr */ String, Unit]
}
