package typings.postcss.mod

import typings.postcss.libResultMod.ResultOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postcss", "LazyResult")
@js.native
open class LazyResult protected ()
  extends typings.postcss.libLazyResultMod.default {
  /**
    * @param processor Processor used for this transformation.
    * @param css       CSS to parse and transform.
    * @param opts      Options from the `Processor#process` or `Root#toResult`.
    */
  def this(processor: typings.postcss.libProcessorMod.default, css: String, opts: ResultOptions) = this()
}
