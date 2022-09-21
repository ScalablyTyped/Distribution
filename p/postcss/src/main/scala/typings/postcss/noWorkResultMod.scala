package typings.postcss

import typings.postcss.resultMod.ResultOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noWorkResultMod {
  
  @JSImport("postcss/lib/no-work-result", JSImport.Default)
  @js.native
  open class default protected () extends NoWorkResult {
    def this(processor: typings.postcss.processorMod.default, css: String, opts: ResultOptions) = this()
  }
  
  @js.native
  trait NoWorkResult
    extends typings.postcss.lazyResultMod.default
}
