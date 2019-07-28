package typings.paper.paperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "Layer")
@js.native
/**
  * Creates a new Layer item and places it at the end of the project.layers array. The newly created layer will be activated, so all newly created items will be placed within it.
  * @param children [optional] - An array of Items that will be added to the newly created layer.
  */
class Layer ()
  extends typings.paper.paperNs.Layer {
  def this(children: js.Array[typings.paper.paperNs.Item]) = this()
  def this(`object`: js.Any) = this()
}

