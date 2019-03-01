package typings
package maxmindLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object maxmindMod {
  type openCb[T /* <: Response */] = js.Function2[/* err */ nodeLib.Error, /* cb */ Reader[T], scala.Unit]
}
