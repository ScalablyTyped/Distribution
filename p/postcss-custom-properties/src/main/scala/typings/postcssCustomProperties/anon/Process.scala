package typings.postcssCustomProperties.anon

import typings.postcss.mod.LazyResult
import typings.postcss.mod.Result
import typings.postcssCustomProperties.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Process extends js.Object {
  def process(css: String): LazyResult = js.native
  def process(css: String, opts: js.Any): LazyResult = js.native
  def process(css: String, opts: js.Any, pluginOptions: Options): LazyResult = js.native
  def process(css: Result): LazyResult = js.native
  def process(css: Result, opts: js.Any): LazyResult = js.native
  def process(css: Result, opts: js.Any, pluginOptions: Options): LazyResult = js.native
  def process(css: ToString): LazyResult = js.native
  def process(css: ToString, opts: js.Any): LazyResult = js.native
  def process(css: ToString, opts: js.Any, pluginOptions: Options): LazyResult = js.native
}

