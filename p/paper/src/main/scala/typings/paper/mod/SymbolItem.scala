package typings.paper.mod

import typings.paper.paper.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "SymbolItem")
@js.native
class SymbolItem protected ()
  extends typings.paper.paper.SymbolItem {
  def this(definition: typings.paper.paper.Item) = this()
  /** 
    * Creates a new symbol item.
    * 
    * @param definition - the definition to place or an
    *     item to place as a symbol
    * @param point - the center point of the placed symbol
    */
  def this(definition: typings.paper.paper.SymbolDefinition) = this()
  def this(definition: typings.paper.paper.Item, point: Point) = this()
  def this(definition: typings.paper.paper.SymbolDefinition, point: Point) = this()
}

