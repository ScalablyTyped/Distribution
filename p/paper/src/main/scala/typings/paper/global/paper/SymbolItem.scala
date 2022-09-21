package typings.paper.global.paper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * A symbol item represents an instance of a symbol which has been
  * placed in a Paper.js project.
  */
@JSGlobal("paper.SymbolItem")
@js.native
open class SymbolItem protected ()
  extends StObject
     with typings.paper.paper.SymbolItem {
  def this(definition: typings.paper.paper.Item) = this()
  /** 
    * Creates a new symbol item.
    * 
    * @param definition - the definition to place or an
    *     item to place as a symbol
    * @param point - the center point of the placed symbol
    */
  def this(definition: typings.paper.paper.SymbolDefinition) = this()
  def this(definition: typings.paper.paper.Item, point: typings.paper.paper.Point) = this()
  def this(definition: typings.paper.paper.SymbolDefinition, point: typings.paper.paper.Point) = this()
}
