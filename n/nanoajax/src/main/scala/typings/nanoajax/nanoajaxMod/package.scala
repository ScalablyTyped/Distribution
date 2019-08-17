package typings.nanoajax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nanoajaxMod {
  import typings.std.XMLHttpRequest

  type Callback = js.Function3[/* statusCode */ Double, /* response */ String, /* request */ XMLHttpRequest, js.Any]
}
