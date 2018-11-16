package typings
package postcssLib.postcssMod.postcssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A Processor instance contains plugins to process CSS. Create one
     * Processor  instance, initialize its plugins, and then use that instance
     * on numerous CSS files.
     */
@js.native
trait Processor extends js.Object {
  /**
           * Contains plugins added to this processor.
           */
  var plugins: js.Array[Plugin[_]] = js.native
  /**
           * Contains the current version of PostCSS (e.g., "4.0.5").
           */
  var version: java.lang.String = js.native
  /**
           * Parses source CSS. Because some plugins can be asynchronous it doesn't
           * make any transformations. Transformations will be applied in LazyResult's
           * methods.
           * @param css Input CSS or any object with toString() method, like a file
           * stream. If a Result instance is passed the processor will take the
           * existing Root parser from it.
           */
  def process(css: java.lang.String): LazyResult = js.native
  /**
           * Parses source CSS. Because some plugins can be asynchronous it doesn't
           * make any transformations. Transformations will be applied in LazyResult's
           * methods.
           * @param css Input CSS or any object with toString() method, like a file
           * stream. If a Result instance is passed the processor will take the
           * existing Root parser from it.
           */
  def process(css: java.lang.String, options: ProcessOptions): LazyResult = js.native
  /**
           * Parses source CSS. Because some plugins can be asynchronous it doesn't
           * make any transformations. Transformations will be applied in LazyResult's
           * methods.
           * @param css Input CSS or any object with toString() method, like a file
           * stream. If a Result instance is passed the processor will take the
           * existing Root parser from it.
           */
  def process(css: postcssLib.Anon_ToString): LazyResult = js.native
  /**
           * Parses source CSS. Because some plugins can be asynchronous it doesn't
           * make any transformations. Transformations will be applied in LazyResult's
           * methods.
           * @param css Input CSS or any object with toString() method, like a file
           * stream. If a Result instance is passed the processor will take the
           * existing Root parser from it.
           */
  def process(css: postcssLib.Anon_ToString, options: ProcessOptions): LazyResult = js.native
  /**
           * Parses source CSS. Because some plugins can be asynchronous it doesn't
           * make any transformations. Transformations will be applied in LazyResult's
           * methods.
           * @param css Input CSS or any object with toString() method, like a file
           * stream. If a Result instance is passed the processor will take the
           * existing Root parser from it.
           */
  def process(css: Result): LazyResult = js.native
  /**
           * Parses source CSS. Because some plugins can be asynchronous it doesn't
           * make any transformations. Transformations will be applied in LazyResult's
           * methods.
           * @param css Input CSS or any object with toString() method, like a file
           * stream. If a Result instance is passed the processor will take the
           * existing Root parser from it.
           */
  def process(css: Result, options: ProcessOptions): LazyResult = js.native
  /**
           * Adds a plugin to be used as a CSS processor. Plugins can also be
           * added by passing them as arguments when creating a postcss instance.
           */
  def use(plugin: AcceptedPlugin): Processor = js.native
}

