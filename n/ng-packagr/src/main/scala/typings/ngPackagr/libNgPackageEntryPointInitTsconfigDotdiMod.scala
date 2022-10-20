package typings.ngPackagr

import typings.angularCompilerCli.srcPerformCompileMod.ParsedConfiguration
import typings.injectionJs.mod.InjectionToken
import typings.injectionJs.providerMod.Provider
import typings.ngPackagr.libGraphTransformDotdiMod.TransformProvider
import typings.ngPackagr.libGraphTransformMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNgPackageEntryPointInitTsconfigDotdiMod {
  
  @JSImport("ng-packagr/lib/ng-package/entry-point/init-tsconfig.di", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ng-packagr/lib/ng-package/entry-point/init-tsconfig.di", "DEFAULT_TS_CONFIG_TOKEN")
  @js.native
  val DEFAULT_TS_CONFIG_TOKEN: InjectionToken[String | ParsedConfiguration] = js.native
  
  @JSImport("ng-packagr/lib/ng-package/entry-point/init-tsconfig.di", "INIT_TS_CONFIG_TOKEN")
  @js.native
  val INIT_TS_CONFIG_TOKEN: InjectionToken[Transform] = js.native
  
  @JSImport("ng-packagr/lib/ng-package/entry-point/init-tsconfig.di", "INIT_TS_CONFIG_TRANSFORM")
  @js.native
  val INIT_TS_CONFIG_TRANSFORM: TransformProvider = js.native
  
  inline def provideTsConfig(): Provider = ^.asInstanceOf[js.Dynamic].applyDynamic("provideTsConfig")().asInstanceOf[Provider]
  inline def provideTsConfig(values: String): Provider = ^.asInstanceOf[js.Dynamic].applyDynamic("provideTsConfig")(values.asInstanceOf[js.Any]).asInstanceOf[Provider]
  inline def provideTsConfig(values: ParsedConfiguration): Provider = ^.asInstanceOf[js.Dynamic].applyDynamic("provideTsConfig")(values.asInstanceOf[js.Any]).asInstanceOf[Provider]
}
