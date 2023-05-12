package typings.postcss

import typings.postcss.libResultMod.ResultOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNoWorkResultMod {
  
  @JSImport("postcss/lib/no-work-result", JSImport.Namespace)
  @js.native
  open class ^ () extends NoWorkResult_
  
  /**
    * A Promise proxy for the result of PostCSS transformations.
    * This lazy result instance doesn't parse css unless `NoWorkResult#root` or `Result#root`
    * are accessed. See the example below for details.
    * A `NoWork` instance is returned by `Processor#process` ONLY when no plugins defined.
    *
    * ```js
    * const noWorkResult = postcss().process(css) // No plugins are defined.
    *                                             // CSS is not parsed
    * let root = noWorkResult.root // now css is parsed because we accessed the root
    * ```
    */
  @JSImport("postcss/lib/no-work-result", JSImport.Default)
  @js.native
  open class default protected () extends NoWorkResult_ {
    def this(processor: typings.postcss.libProcessorMod.default, css: String, opts: ResultOptions) = this()
  }
  
  type NoWorkResult = NoWorkResult_
  
  /**
    * A Promise proxy for the result of PostCSS transformations.
    * This lazy result instance doesn't parse css unless `NoWorkResult#root` or `Result#root`
    * are accessed. See the example below for details.
    * A `NoWork` instance is returned by `Processor#process` ONLY when no plugins defined.
    *
    * ```js
    * const noWorkResult = postcss().process(css) // No plugins are defined.
    *                                             // CSS is not parsed
    * let root = noWorkResult.root // now css is parsed because we accessed the root
    * ```
    */
  @js.native
  trait NoWorkResult_
    extends typings.postcss.libLazyResultMod.default
}
