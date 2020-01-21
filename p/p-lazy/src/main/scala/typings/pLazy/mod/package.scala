package typings.pLazy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type PLazy[ValueType] = js.Promise[ValueType]
}
