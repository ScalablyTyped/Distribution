package typings.pgDashPool

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pgDashPoolMod {
  import org.scalablytyped.runtime.Instantiable1
  import typings.pg.pgMod.Client
  import typings.pg.pgMod.ClientConfig

  type ClientLikeCtr[T /* <: Client */] = Instantiable1[js.UndefOr[String | ClientConfig], T]
}
