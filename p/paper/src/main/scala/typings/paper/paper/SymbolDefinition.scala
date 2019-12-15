package typings.paper.paper

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
@JSGlobal("paper.SymbolDefinition")
@js.native
class SymbolDefinition protected () extends js.Object {
  /** 
    * Creates a Symbol definition.
    * 
    * @param item - the source item which is removed from the scene graph
    *     and becomes the symbol's definition.
    */
  def this(item: Item) = this()
  def this(item: Item, dontCenter: Boolean) = this()
  /** 
    * The item used as the symbol's definition.
    */
  var item: Item = js.native
  /** 
    * The project that this symbol belongs to.
    */
  val project: Project = js.native
  /** 
    * Checks whether the symbol's definition is equal to the supplied symbol.
    * 
    * @return true if they are equal
    */
  def equals(symbol: SymbolDefinition): Boolean = js.native
  /** 
    * Places in instance of the symbol in the project.
    * 
    * @param position - the position of the placed symbol
    */
  def place(): SymbolItem = js.native
  def place(position: Point): SymbolItem = js.native
}

