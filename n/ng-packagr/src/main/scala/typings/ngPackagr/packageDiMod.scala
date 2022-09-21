package typings.ngPackagr

import typings.injectionJs.mod.InjectionToken
import typings.injectionJs.providerMod.Provider
import typings.ngPackagr.transformDiMod.TransformProvider
import typings.ngPackagr.transformMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packageDiMod {
  
  @JSImport("ng-packagr/lib/ng-package/package.di", "PACKAGE_PROVIDERS")
  @js.native
  val PACKAGE_PROVIDERS: js.Array[Provider] = js.native
  
  @JSImport("ng-packagr/lib/ng-package/package.di", "PACKAGE_TRANSFORM")
  @js.native
  val PACKAGE_TRANSFORM: TransformProvider = js.native
  
  @JSImport("ng-packagr/lib/ng-package/package.di", "PACKAGE_TRANSFORM_TOKEN")
  @js.native
  val PACKAGE_TRANSFORM_TOKEN: InjectionToken[Transform] = js.native
}
