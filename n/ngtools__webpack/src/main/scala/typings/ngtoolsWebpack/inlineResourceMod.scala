package typings.ngtoolsWebpack

import typings.webpack.mod.Compilation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inlineResourceMod {
  
  @JSImport("@ngtools/webpack/src/loaders/inline-resource", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Unit]
  
  @JSImport("@ngtools/webpack/src/loaders/inline-resource", "InlineAngularResourceLoaderPath")
  @js.native
  val InlineAngularResourceLoaderPath: String = js.native
  
  @JSImport("@ngtools/webpack/src/loaders/inline-resource", "InlineAngularResourceSymbol")
  @js.native
  val InlineAngularResourceSymbol: js.Symbol = js.native
  
  @js.native
  trait CompilationWithInlineAngularResource extends Compilation
}
