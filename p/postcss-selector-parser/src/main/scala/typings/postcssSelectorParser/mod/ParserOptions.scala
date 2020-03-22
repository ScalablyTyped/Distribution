package typings.postcssSelectorParser.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserOptions extends js.Object {
  var css: String
  var options: Options
  def error(message: String, options: ErrorOptions): Error
}

object ParserOptions {
  @scala.inline
  def apply(css: String, error: (String, ErrorOptions) => Error, options: Options): ParserOptions = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], error = js.Any.fromFunction2(error), options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParserOptions]
  }
}

