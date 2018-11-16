package typings
package postcssLib.postcssMod.postcssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Provides the result of the PostCSS transformations.
     */
@js.native
trait Result extends js.Object {
  /**
           * Alias for css property to use with syntaxes that generate non-CSS output.
           */
  var content: java.lang.String = js.native
  /**
           * A CSS string representing this Result's Root instance.
           */
  var css: java.lang.String = js.native
  /**
           * An instance of the SourceMapGenerator class from the source-map library,
           * representing changes to the Result's Root instance.
           * This property will have a value only if the user does not want an inline
           * source map. By default, PostCSS generates inline source maps, written
           * directly into the processed CSS. The map property will be empty by default.
           * An external source map will be generated — and assigned to map — only if
           * the user has set the map.inline option to false, or if PostCSS was passed
           * an external input source map.
           */
  var map: ResultMap = js.native
  /**
           * Contains messages from plugins (e.g., warnings or custom messages).
           * Add a warning using Result#warn() and get all warnings
           * using the Result#warnings() method.
           */
  var messages: js.Array[ResultMessage] = js.native
  /**
           * Options from the Processor#process(css, opts) or Root#toResult(opts) call
           * that produced this Result instance.
           */
  var opts: js.UndefOr[ResultOptions] = js.native
  /**
           * The Processor instance used for this transformation.
           */
  var processor: js.UndefOr[Processor] = js.native
  /**
           * Contains the Root node after all transformations.
           */
  var root: js.UndefOr[Root] = js.native
  /**
           * Creates an instance of Warning and adds it to messages.
           * @param message Used in the text property of the message object.
           * @param options Properties for Message object.
           */
  def warn(message: java.lang.String): scala.Unit = js.native
  /**
           * Creates an instance of Warning and adds it to messages.
           * @param message Used in the text property of the message object.
           * @param options Properties for Message object.
           */
  def warn(message: java.lang.String, options: WarningOptions): scala.Unit = js.native
  /**
           * @returns Warnings from plugins, filtered from messages.
           */
  def warnings(): js.Array[ResultMessage] = js.native
}

