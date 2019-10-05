package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.PlacedSymbol")
@js.native
class PlacedSymbol protected () extends Item {
  /**
    * Creates a new PlacedSymbol Item.
    * @param symbol - the symbol to place
    * @param point [optional] - the center point of the placed symbol
    */
  def this(symbol: Symbol) = this()
  def this(symbol: Symbol, point: Point) = this()
  /**
    * The symbol that the placed symbol refers to.
    */
  var symbol: Symbol = js.native
}

