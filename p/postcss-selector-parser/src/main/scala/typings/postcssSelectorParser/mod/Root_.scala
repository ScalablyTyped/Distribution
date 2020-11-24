package typings.postcssSelectorParser.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Root_
  extends Container[js.UndefOr[scala.Nothing], Selector_] {
  
  /**
    * Raises an error, if the processor is invoked on
    * a postcss Rule node, a better error message is raised.
    */
  def error(message: String): Error = js.native
  def error(message: String, options: ErrorOptions): Error = js.native
  
  def nodeAt(line: Double, column: Double): Node = js.native
  
  @JSName("type")
  var type_Root_ : typings.postcssSelectorParser.postcssSelectorParserStrings.root = js.native
}
