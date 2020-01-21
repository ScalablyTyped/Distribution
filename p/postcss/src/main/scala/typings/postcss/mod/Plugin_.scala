package typings.postcss.mod

import typings.postcss.AnonToString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugin_[T] extends Transformer {
  var postcss: Transformer = js.native
  def apply(): Transformer = js.native
  def apply(opts: T): Transformer = js.native
  def process(css: String): LazyResult = js.native
  def process(css: String, opts: js.Any): LazyResult = js.native
  def process(css: AnonToString): LazyResult = js.native
  def process(css: AnonToString, opts: js.Any): LazyResult = js.native
  def process(css: Result): LazyResult = js.native
  def process(css: Result, opts: js.Any): LazyResult = js.native
}

