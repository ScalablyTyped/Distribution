package typings
package paperLib.paperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "Layer")
@js.native
class Layer ()
  extends paperLib.paperNs.Layer {
  /**
           * Creates a new Layer item and places it at the end of the project.layers array. The newly created layer will be activated, so all newly created items will be placed within it.
           * @param children [optional] - An array of Items that will be added to the newly created layer.
           */
  def this(children: js.Array[paperLib.paperNs.Item]) = this()
  /**
           * Creates a new Layer item and places it at the end of the project.layers array. The newly created layer will be activated, so all newly created items will be placed within it.
           * @param object [optional] - an object literal containing the properties to be set on the layer.
           */
  def this(`object`: js.Any) = this()
}

