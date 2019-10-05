package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.Symbol")
@js.native
class Symbol protected () extends Base {
  /**
    * Creates a Symbol item.
    * @param item - the source item which is copied as the definition of the symbol
    * @param dontCenter [optional] - default: false
    */
  def this(item: Item) = this()
  def this(item: Item, dontCenter: Boolean) = this()
  /**
    * The symbol definition.
    */
  var definition: Item = js.native
  /**
    * The project that this symbol belongs to.
    * Read Only.
    */
  val project: Project = js.native
  /**
    * Checks whether the symbol’s definition is equal to the supplied symbol.
    * @param symbol Symbol
    */
  def equals(symbol: Symbol): Boolean = js.native
  /**
    * Places in instance of the symbol in the project.
    * @param position [optional] - The position of the placed symbol.
    */
  def place(): PlacedSymbol = js.native
  def place(position: Point): PlacedSymbol = js.native
}

