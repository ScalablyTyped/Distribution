package typings.paper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "SymbolDefinition")
@js.native
class SymbolDefinition protected ()
  extends typings.paper.paper.SymbolDefinition {
  /** 
    * Creates a Symbol definition.
    * 
    * @param item - the source item which is removed from the scene graph
    *     and becomes the symbol's definition.
    */
  def this(item: typings.paper.paper.Item) = this()
  def this(item: typings.paper.paper.Item, dontCenter: Boolean) = this()
}

