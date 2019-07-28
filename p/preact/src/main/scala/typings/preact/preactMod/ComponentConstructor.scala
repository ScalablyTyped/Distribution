package typings.preact.preactMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentConstructor[P, S]
  extends AnyComponent[P, S]
     with Instantiable1[/* props */ P, Component[P, S]]
     with Instantiable2[/* props */ P, /* context */ js.Any, Component[P, S]] {
  var defaultProps: js.UndefOr[Partial[P]] = js.native
  var displayName: js.UndefOr[String] = js.native
}

