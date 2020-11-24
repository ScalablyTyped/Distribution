package typings.ol.mod

import typings.ol.tileQueueMod.PriorityFunction
import typings.ol.tileQueueMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol", "TileQueue")
@js.native
class TileQueue protected () extends default {
  def this(tilePriorityFunction: PriorityFunction, tileChangeCallback: js.Function0[_]) = this()
}
