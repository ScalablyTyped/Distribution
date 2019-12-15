package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * A symbol item represents an instance of a symbol which has been
  * placed in a Paper.js project.
  */
@JSGlobal("paper.SymbolItem")
@js.native
class SymbolItem protected () extends Item {
  def this(definition: Item) = this()
  /** 
    * Creates a new symbol item.
    * 
    * @param definition - the definition to place or an
    *     item to place as a symbol
    * @param point - the center point of the placed symbol
    */
  def this(definition: SymbolDefinition) = this()
  def this(definition: Item, point: Point) = this()
  def this(definition: SymbolDefinition, point: Point) = this()
  /** 
    * The symbol definition that the placed symbol refers to.
    */
  var definition: SymbolDefinition = js.native
}

