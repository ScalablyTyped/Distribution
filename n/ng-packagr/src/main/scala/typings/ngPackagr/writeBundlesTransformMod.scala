package typings.ngPackagr

import typings.ngPackagr.optionsDiMod.NgPackagrOptions
import typings.ngPackagr.transformMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writeBundlesTransformMod {
  
  @JSImport("ng-packagr/lib/ng-package/entry-point/write-bundles.transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def writeBundlesTransform(options: NgPackagrOptions): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("writeBundlesTransform")(options.asInstanceOf[js.Any]).asInstanceOf[Transform]
}
