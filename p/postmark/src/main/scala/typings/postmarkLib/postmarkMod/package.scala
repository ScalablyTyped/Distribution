package typings
package postmarkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object postmarkMod {
  type PostmarkCallback[T /* <: js.Object */] = js.UndefOr[js.Function2[/* e */ PostmarkError, /* ret */ T, js.UndefOr[scala.Nothing]]]
}
