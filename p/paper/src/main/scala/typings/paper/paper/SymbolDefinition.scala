package typings.paper.paper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * Symbols allow you to place multiple instances of an item in your
  * project. This can save memory, since all instances of a symbol simply refer
  * to the original item and it can speed up moving around complex objects, since
  * internal properties such as segment lists and gradient positions don't need
  * to be updated with every transformation.
  */
@js.native
trait SymbolDefinition extends StObject {
  
  /** 
    * Checks whether the symbol's definition is equal to the supplied symbol.
    * 
    * @return true if they are equal
    */
  def equals(symbol: SymbolDefinition): Boolean = js.native
  
  /** 
    * The item used as the symbol's definition.
    */
  var item: Item = js.native
  
  /** 
    * Places in instance of the symbol in the project.
    * 
    * @param position - the position of the placed symbol
    */
  def place(): SymbolItem = js.native
  def place(position: PointLike): SymbolItem = js.native
  
  /** 
    * The project that this symbol belongs to.
    */
  val project: Project = js.native
}
