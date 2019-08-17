package typings.atMysticateaSpy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distMod {
  import typings.atMysticateaSpy.distMod.SpyNs.CallInformation

  type Spy[T /* <: js.Function1[/* repeated */ js.Any, _] */] = T with CallInformation[T]
  type This[T] = js.UndefOr[scala.Nothing]
}
