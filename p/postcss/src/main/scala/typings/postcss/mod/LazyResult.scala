package typings.postcss.mod

import typings.postcss.resultMod.ResultOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postcss", "LazyResult")
@js.native
open class LazyResult protected ()
  extends typings.postcss.lazyResultMod.default {
  /**
    * @param processor Processor used for this transformation.
    * @param css       CSS to parse and transform.
    * @param opts      Options from the `Processor#process` or `Root#toResult`.
    */
  def this(processor: typings.postcss.processorMod.default, css: String, opts: ResultOptions) = this()
}
