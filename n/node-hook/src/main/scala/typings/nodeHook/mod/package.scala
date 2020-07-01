package typings.nodeHook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Transform = js.Function2[/* source */ java.lang.String, /* filename */ java.lang.String, java.lang.String]
}
