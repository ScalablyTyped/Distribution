package typings.postcss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Helpers
  extends StObject
     with Postcss {
  
  /**
    * Create a new `Processor` instance that will apply `plugins`
    * as CSS processors.
    *
    * ```js
    * let postcss = require('postcss')
    *
    * postcss(plugins).process(css, { from, to }).then(result => {
    *   console.log(result.css)
    * })
    * ```
    *
    * @param plugins PostCSS plugins.
    * @return Processor to process multiple CSS.
    */
  def postcss(): typings.postcss.libProcessorMod.default = js.native
  def postcss(plugins: AcceptedPlugin*): typings.postcss.libProcessorMod.default = js.native
  def postcss(plugins: js.Array[AcceptedPlugin]): typings.postcss.libProcessorMod.default = js.native
  @JSName("postcss")
  var postcss_Original: Postcss = js.native
  
  var result: typings.postcss.libResultMod.default = js.native
}
