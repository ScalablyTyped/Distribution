package typings.node.vmMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileFunctionOptions extends BaseOptions {
  /**
    * Provides an optional data with V8's code cache data for the supplied source.
    */
  var cachedData: js.UndefOr[Buffer] = js.undefined
  /**
    * An array containing a collection of context extensions (objects wrapping the current scope) to be applied while compiling
    */
  var contextExtensions: js.UndefOr[js.Array[js.Object]] = js.undefined
  /**
    * The sandbox/context in which the said function should be compiled in.
    */
  var parsingContext: js.UndefOr[Context] = js.undefined
  /**
    * Specifies whether to produce new cache data.
    * Default: `false`,
    */
  var produceCachedData: js.UndefOr[Boolean] = js.undefined
}

object CompileFunctionOptions {
  @scala.inline
  def apply(
    cachedData: Buffer = null,
    columnOffset: Int | Double = null,
    contextExtensions: js.Array[js.Object] = null,
    filename: java.lang.String = null,
    lineOffset: Int | Double = null,
    parsingContext: Context = null,
    produceCachedData: js.UndefOr[Boolean] = js.undefined
  ): CompileFunctionOptions = {
    val __obj = js.Dynamic.literal()
    if (cachedData != null) __obj.updateDynamic("cachedData")(cachedData)
    if (columnOffset != null) __obj.updateDynamic("columnOffset")(columnOffset.asInstanceOf[js.Any])
    if (contextExtensions != null) __obj.updateDynamic("contextExtensions")(contextExtensions)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (lineOffset != null) __obj.updateDynamic("lineOffset")(lineOffset.asInstanceOf[js.Any])
    if (parsingContext != null) __obj.updateDynamic("parsingContext")(parsingContext)
    if (!js.isUndefined(produceCachedData)) __obj.updateDynamic("produceCachedData")(produceCachedData)
    __obj.asInstanceOf[CompileFunctionOptions]
  }
}

