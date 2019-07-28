package typings.postcss.postcssMod

import typings.postcss.Anon_ToString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugin[T] extends Transformer {
  var postcss: Transformer = js.native
  def apply(): Transformer = js.native
  def apply(opts: T): Transformer = js.native
  def process(css: String): LazyResult = js.native
  def process(css: String, opts: js.Any): LazyResult = js.native
  def process(css: Anon_ToString): LazyResult = js.native
  def process(css: Anon_ToString, opts: js.Any): LazyResult = js.native
  def process(css: Result): LazyResult = js.native
  def process(css: Result, opts: js.Any): LazyResult = js.native
}

