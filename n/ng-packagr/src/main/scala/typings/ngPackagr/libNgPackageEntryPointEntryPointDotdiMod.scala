package typings.ngPackagr

import typings.injectionJs.mod.InjectionToken
import typings.injectionJs.providerMod.Provider
import typings.ngPackagr.libGraphTransformDotdiMod.TransformProvider
import typings.ngPackagr.libGraphTransformMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNgPackageEntryPointEntryPointDotdiMod {
  
  @JSImport("ng-packagr/lib/ng-package/entry-point/entry-point.di", "ENTRY_POINT_PROVIDERS")
  @js.native
  val ENTRY_POINT_PROVIDERS: js.Array[Provider] = js.native
  
  @JSImport("ng-packagr/lib/ng-package/entry-point/entry-point.di", "ENTRY_POINT_TRANSFORM")
  @js.native
  val ENTRY_POINT_TRANSFORM: TransformProvider = js.native
  
  @JSImport("ng-packagr/lib/ng-package/entry-point/entry-point.di", "ENTRY_POINT_TRANSFORM_TOKEN")
  @js.native
  val ENTRY_POINT_TRANSFORM_TOKEN: InjectionToken[Transform] = js.native
}
