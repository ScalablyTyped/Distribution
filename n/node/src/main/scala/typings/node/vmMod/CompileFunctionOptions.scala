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
    columnOffset: js.UndefOr[Double] = js.undefined,
    contextExtensions: js.Array[js.Object] = null,
    filename: String = null,
    lineOffset: js.UndefOr[Double] = js.undefined,
    parsingContext: Context = null,
    produceCachedData: js.UndefOr[Boolean] = js.undefined
  ): CompileFunctionOptions = {
    val __obj = js.Dynamic.literal()
    if (cachedData != null) __obj.updateDynamic("cachedData")(cachedData.asInstanceOf[js.Any])
    if (!js.isUndefined(columnOffset)) __obj.updateDynamic("columnOffset")(columnOffset.get.asInstanceOf[js.Any])
    if (contextExtensions != null) __obj.updateDynamic("contextExtensions")(contextExtensions.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (!js.isUndefined(lineOffset)) __obj.updateDynamic("lineOffset")(lineOffset.get.asInstanceOf[js.Any])
    if (parsingContext != null) __obj.updateDynamic("parsingContext")(parsingContext.asInstanceOf[js.Any])
    if (!js.isUndefined(produceCachedData)) __obj.updateDynamic("produceCachedData")(produceCachedData.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileFunctionOptions]
  }
}

