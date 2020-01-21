package typings.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Processor instance contains plugins to process CSS. Create one
  * Processor  instance, initialize its plugins, and then use that instance
  * on numerous CSS files.
  */
@js.native
trait Processor extends _AcceptedPlugin {
  /**
    * Contains plugins added to this processor.
    */
  var plugins: js.Array[Plugin_[_]] = js.native
  /**
    * Contains the current version of PostCSS (e.g., "4.0.5").
    */
  var version: String = js.native
  def process(css: LazyResult): LazyResult = js.native
  def process(css: LazyResult, options: ProcessOptions): LazyResult = js.native
  /**
    * Parses source CSS. Because some plugins can be asynchronous it doesn't
    * make any transformations. Transformations will be applied in LazyResult's
    * methods.
    * @param css Input CSS or any object with toString() method, like a file
    * stream. If a Result instance is passed the processor will take the
    * existing Root parser from it.
    */
  def process(css: ParserInput): LazyResult = js.native
  def process(css: ParserInput, options: ProcessOptions): LazyResult = js.native
  def process(css: Result): LazyResult = js.native
  def process(css: Result, options: ProcessOptions): LazyResult = js.native
  def process(css: Root_): LazyResult = js.native
  def process(css: Root_, options: ProcessOptions): LazyResult = js.native
  /**
    * Adds a plugin to be used as a CSS processor. Plugins can also be
    * added by passing them as arguments when creating a postcss instance.
    */
  def use(plugin: AcceptedPlugin): Processor = js.native
}

