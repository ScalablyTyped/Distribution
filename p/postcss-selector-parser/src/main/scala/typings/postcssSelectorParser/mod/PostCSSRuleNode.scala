package typings.postcssSelectorParser.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* the bits we use of postcss.Rule, copied from postcss -- so we don't need to add a dependency */
@js.native
trait PostCSSRuleNode extends StObject {
  
  /**
    * @returns postcss.CssSyntaxError but it's a complex object, caller
    *   should cast to it if they have a dependency on postcss.
    */
  def error(message: String): Error = js.native
  def error(message: String, options: ErrorOptions): Error = js.native
  
  var selector: String = js.native
}
