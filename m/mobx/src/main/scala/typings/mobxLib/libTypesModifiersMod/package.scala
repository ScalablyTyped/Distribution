package typings
package mobxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesModifiersMod {
  type IEnhancer[T] = js.Function3[/* newValue */ T, /* oldValue */ js.UndefOr[T], /* name */ java.lang.String, T]
}
