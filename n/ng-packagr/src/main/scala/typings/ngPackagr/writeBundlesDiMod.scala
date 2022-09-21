package typings.ngPackagr

import typings.injectionJs.mod.InjectionToken
import typings.ngPackagr.transformDiMod.TransformProvider
import typings.ngPackagr.transformMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writeBundlesDiMod {
  
  @JSImport("ng-packagr/lib/ng-package/entry-point/write-bundles.di", "WRITE_BUNDLES_TRANSFORM")
  @js.native
  val WRITE_BUNDLES_TRANSFORM: TransformProvider = js.native
  
  @JSImport("ng-packagr/lib/ng-package/entry-point/write-bundles.di", "WRITE_BUNDLES_TRANSFORM_TOKEN")
  @js.native
  val WRITE_BUNDLES_TRANSFORM_TOKEN: InjectionToken[Transform] = js.native
}
