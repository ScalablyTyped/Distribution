package typings.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The CSS parser throws this error for broken CSS.
  */
@js.native
trait CssSyntaxError extends InputOrigin {
  
  var input: js.UndefOr[InputOrigin] = js.native
  
  /**
    * Contains full error text in the GNU error format.
    */
  var message: String = js.native
  
  var name: String = js.native
  
  /**
    * Contains the PostCSS plugin name if the error didn't come from the
    * CSS parser.
    */
  var plugin: js.UndefOr[String] = js.native
  
  /**
    * Contains only the error description.
    */
  var reason: String = js.native
  
  /**
    * @param color Whether arrow should be colored red by terminal color codes.
    * By default, PostCSS will use process.stdout.isTTY and
    * process.env.NODE_DISABLE_COLORS.
    * @returns A few lines of CSS source that caused the error. If CSS has
    * input source map without sourceContent this method will return an empty
    * string.
    */
  def showSourceCode(): String = js.native
  def showSourceCode(color: Boolean): String = js.native
}
