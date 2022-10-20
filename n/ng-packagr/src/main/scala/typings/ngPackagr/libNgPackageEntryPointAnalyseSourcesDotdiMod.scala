package typings.ngPackagr

import typings.injectionJs.mod.InjectionToken
import typings.ngPackagr.libGraphTransformDotdiMod.TransformProvider
import typings.ngPackagr.libGraphTransformMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNgPackageEntryPointAnalyseSourcesDotdiMod {
  
  @JSImport("ng-packagr/lib/ng-package/entry-point/analyse-sources.di", "ANALYSE_SOURCES_TOKEN")
  @js.native
  val ANALYSE_SOURCES_TOKEN: InjectionToken[Transform] = js.native
  
  @JSImport("ng-packagr/lib/ng-package/entry-point/analyse-sources.di", "ANALYSE_SOURCES_TRANSFORM")
  @js.native
  val ANALYSE_SOURCES_TRANSFORM: TransformProvider = js.native
}
