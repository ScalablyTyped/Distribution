package typings.postcssSelectorParser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postcss-selector-parser", "Parser")
@js.native
open class Parser protected () extends StObject {
  def this(input: ParserOptions) = this()
  
  var current: Selector_ = js.native
  
  /**
    * Raises an error, if the processor is invoked on
    * a postcss Rule node, a better error message is raised.
    */
  def error(message: String): Unit = js.native
  def error(message: String, options: ErrorOptions): Unit = js.native
  
  var input: ParserOptions = js.native
  
  var lossy: Boolean = js.native
  
  var position: Double = js.native
  
  var root: Root_ = js.native
  
  var selectors: String = js.native
}
