package typings.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object errorMod {
  import typings.react.reactMod.Component

  type Error[P] = Component[P with DefaultErrorIProps, js.Object, js.Any]
}
