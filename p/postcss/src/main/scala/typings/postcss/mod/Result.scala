package typings.postcss.mod

import typings.postcss.resultMod.ResultOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postcss", "Result")
@js.native
open class Result protected ()
  extends typings.postcss.resultMod.default {
  def this(processor: typings.postcss.processorMod.default, root: Document, opts: ResultOptions) = this()
  /**
    * @param processor Processor used for this transformation.
    * @param root      Root node after all transformations.
    * @param opts      Options from the `Processor#process` or `Root#toResult`.
    */
  def this(processor: typings.postcss.processorMod.default, root: Root_, opts: ResultOptions) = this()
}
