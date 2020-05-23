package typings.openseadragon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorldEvent extends OSDEvent[World] {
  var item: js.UndefOr[TiledImage] = js.native
  var newIndex: js.UndefOr[Double] = js.native
  var previousIndex: js.UndefOr[Double] = js.native
}

