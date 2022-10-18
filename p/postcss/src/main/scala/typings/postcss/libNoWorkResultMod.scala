package typings.postcss

import typings.postcss.libResultMod.ResultOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNoWorkResultMod {
  
  @JSImport("postcss/lib/no-work-result", JSImport.Default)
  @js.native
  open class default protected () extends NoWorkResult {
    def this(processor: typings.postcss.libProcessorMod.default, css: String, opts: ResultOptions) = this()
  }
  
  @js.native
  trait NoWorkResult
    extends typings.postcss.libLazyResultMod.default
}
