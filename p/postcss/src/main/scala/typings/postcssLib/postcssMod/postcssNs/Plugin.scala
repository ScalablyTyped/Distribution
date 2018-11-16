package typings
package postcssLib.postcssMod.postcssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugin[T] extends Transformer {
  var postcss: Transformer = js.native
  def apply(): Transformer = js.native
  def apply(opts: T): Transformer = js.native
  def process(css: java.lang.String): LazyResult = js.native
  def process(css: java.lang.String, opts: js.Any): LazyResult = js.native
  def process(css: postcssLib.Anon_ToString): LazyResult = js.native
  def process(css: postcssLib.Anon_ToString, opts: js.Any): LazyResult = js.native
  def process(css: Result): LazyResult = js.native
  def process(css: Result, opts: js.Any): LazyResult = js.native
}

