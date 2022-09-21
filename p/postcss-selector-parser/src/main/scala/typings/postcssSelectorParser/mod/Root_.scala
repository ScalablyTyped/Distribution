package typings.postcssSelectorParser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Root_
  extends StObject
     with Container[Unit, Selector_] {
  
  /**
    * Raises an error, if the processor is invoked on
    * a postcss Rule node, a better error message is raised.
    */
  def error(message: String): js.Error = js.native
  def error(message: String, options: ErrorOptions): js.Error = js.native
  
  def nodeAt(line: Double, column: Double): Node = js.native
  
  @JSName("type")
  var type_Root_ : typings.postcssSelectorParser.postcssSelectorParserStrings.root = js.native
}
