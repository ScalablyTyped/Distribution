package typings.nanoajax

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nanoajaxMod {
  type Callback = js.Function3[/* statusCode */ Double, /* response */ String, /* request */ XMLHttpRequest, js.Any]
}
