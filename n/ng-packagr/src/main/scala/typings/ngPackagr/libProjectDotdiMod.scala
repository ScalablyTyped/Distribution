package typings.ngPackagr

import typings.injectionJs.mod.InjectionToken
import typings.injectionJs.providerMod.ValueProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProjectDotdiMod {
  
  @JSImport("ng-packagr/lib/project.di", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ng-packagr/lib/project.di", "PROJECT_TOKEN")
  @js.native
  val PROJECT_TOKEN: InjectionToken[String] = js.native
  
  inline def provideProject(project: String): ValueProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("provideProject")(project.asInstanceOf[js.Any]).asInstanceOf[ValueProvider]
}
