package typings.ngPackagr

import typings.ngPackagr.libGraphTransformMod.Transform
import typings.ngPackagr.libNgPackageOptionsDotdiMod.NgPackagrOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNgPackageEntryPointWriteBundlesDottransformMod {
  
  @JSImport("ng-packagr/lib/ng-package/entry-point/write-bundles.transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def writeBundlesTransform(options: NgPackagrOptions): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("writeBundlesTransform")(options.asInstanceOf[js.Any]).asInstanceOf[Transform]
}
