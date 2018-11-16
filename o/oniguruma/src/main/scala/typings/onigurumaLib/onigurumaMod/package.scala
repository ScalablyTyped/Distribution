package typings
package onigurumaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object onigurumaMod {
  type Callback[T] = js.Function2[/* error */ stdLib.Error, /* match */ T, scala.Unit]
}
