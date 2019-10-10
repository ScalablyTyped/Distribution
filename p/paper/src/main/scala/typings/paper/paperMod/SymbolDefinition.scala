package typings.paper.paperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * Symbols allow you to place multiple instances of an item in your
  * project. This can save memory, since all instances of a symbol simply refer
  * to the original item and it can speed up moving around complex objects, since
  * internal properties such as segment lists and gradient positions don't need
  * to be updated with every transformation.
  */
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

