package typings.paper.global.paper

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
@JSGlobal("paper.SymbolDefinition")
@js.native
open class SymbolDefinition protected ()
  extends StObject
     with typings.paper.paper.SymbolDefinition {
  /** 
    * Creates a Symbol definition.
    * 
    * @param item - the source item which is removed from the scene graph
    *     and becomes the symbol's definition.
    */
  def this(item: typings.paper.paper.Item) = this()
  def this(item: typings.paper.paper.Item, dontCenter: Boolean) = this()
}
