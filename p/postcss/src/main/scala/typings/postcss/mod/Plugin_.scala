package typings.postcss.mod

import typings.postcss.anon.ToString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Plugin_[T] extends Transformer {
  
  def apply(): Transformer = js.native
  def apply(opts: T): Transformer = js.native
  
  var postcss: Transformer = js.native
  
  def process(css: String): LazyResult = js.native
  def process(css: String, processOpts: js.UndefOr[scala.Nothing], pluginOpts: T): LazyResult = js.native
  def process(css: String, processOpts: ProcessOptions): LazyResult = js.native
  def process(css: String, processOpts: ProcessOptions, pluginOpts: T): LazyResult = js.native
  def process(css: ToString): LazyResult = js.native
  def process(css: ToString, processOpts: js.UndefOr[scala.Nothing], pluginOpts: T): LazyResult = js.native
  def process(css: ToString, processOpts: ProcessOptions): LazyResult = js.native
  def process(css: ToString, processOpts: ProcessOptions, pluginOpts: T): LazyResult = js.native
  def process(css: Result): LazyResult = js.native
  def process(css: Result, processOpts: js.UndefOr[scala.Nothing], pluginOpts: T): LazyResult = js.native
  def process(css: Result, processOpts: ProcessOptions): LazyResult = js.native
  def process(css: Result, processOpts: ProcessOptions, pluginOpts: T): LazyResult = js.native
}
