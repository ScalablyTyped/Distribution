package typings.next

import org.scalablytyped.runtime.Shortcut
import typings.next.anon.AppPaths
import typings.webpack.mod.LoaderDefinitionFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackLoadersNextAppLoaderMod extends Shortcut {
  
  @JSImport("next/dist/build/webpack/loaders/next-app-loader", JSImport.Default)
  @js.native
  val default: LoaderDefinitionFunction[AppPaths, js.Object] = js.native
  
  object FILE_TYPES {
    
    @JSImport("next/dist/build/webpack/loaders/next-app-loader", "FILE_TYPES.error")
    @js.native
    val error: typings.next.nextStrings.error = js.native
    
    @JSImport("next/dist/build/webpack/loaders/next-app-loader", "FILE_TYPES.layout")
    @js.native
    val layout: typings.next.nextStrings.layout = js.native
    
    @JSImport("next/dist/build/webpack/loaders/next-app-loader", "FILE_TYPES.loading")
    @js.native
    val loading: typings.next.nextStrings.loading = js.native
    
    @JSImport("next/dist/build/webpack/loaders/next-app-loader", "FILE_TYPES.template")
    @js.native
    val template: typings.next.nextStrings.template = js.native
  }
  
  type ComponentModule = js.Function0[Any]
  
  @js.native
  trait ComponentsType extends StObject {
    
    val layoutOrPagePath: js.UndefOr[String] = js.native
    
    val page: js.UndefOr[ComponentModule] = js.native
  }
  
  type _To = LoaderDefinitionFunction[AppPaths, js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `distBuildWebpackLoadersNextAppLoaderMod.foo` */
  override def _to: LoaderDefinitionFunction[AppPaths, js.Object] = default
}
