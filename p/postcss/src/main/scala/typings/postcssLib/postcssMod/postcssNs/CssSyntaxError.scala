package typings
package postcssLib.postcssMod.postcssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The CSS parser throws this error for broken CSS.
  */
@js.native
trait CssSyntaxError extends InputOrigin {
  var input: js.UndefOr[InputOrigin] = js.native
  /**
    * Contains full error text in the GNU error format.
    */
  var message: java.lang.String = js.native
  var name: java.lang.String = js.native
  /**
    * Contains the PostCSS plugin name if the error didn't come from the
    * CSS parser.
    */
  var plugin: js.UndefOr[java.lang.String] = js.native
  /**
    * Contains only the error description.
    */
  var reason: java.lang.String = js.native
  /**
    * @param color Whether arrow should be colored red by terminal color codes.
    * By default, PostCSS will use process.stdout.isTTY and
    * process.env.NODE_DISABLE_COLORS.
    * @returns A few lines of CSS source that caused the error. If CSS has
    * input source map without sourceContent this method will return an empty
    * string.
    */
  def showSourceCode(): java.lang.String = js.native
  def showSourceCode(color: scala.Boolean): java.lang.String = js.native
}

