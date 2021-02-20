package typings.postcssCustomProperties

import typings.postcss.mod.LazyResult
import typings.postcss.mod.Result
import typings.postcssCustomProperties.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Process extends StObject {
    
    def process(css: String): LazyResult = js.native
    def process(css: String, opts: js.UndefOr[scala.Nothing], pluginOptions: Options): LazyResult = js.native
    def process(css: String, opts: js.Any): LazyResult = js.native
    def process(css: String, opts: js.Any, pluginOptions: Options): LazyResult = js.native
    def process(css: Result): LazyResult = js.native
    def process(css: Result, opts: js.UndefOr[scala.Nothing], pluginOptions: Options): LazyResult = js.native
    def process(css: Result, opts: js.Any): LazyResult = js.native
    def process(css: Result, opts: js.Any, pluginOptions: Options): LazyResult = js.native
    def process(css: ToString): LazyResult = js.native
    def process(css: ToString, opts: js.UndefOr[scala.Nothing], pluginOptions: Options): LazyResult = js.native
    def process(css: ToString, opts: js.Any): LazyResult = js.native
    def process(css: ToString, opts: js.Any, pluginOptions: Options): LazyResult = js.native
  }
  
  @js.native
  trait ToString extends StObject
}
