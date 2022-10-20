package typings.ngPackagr

import typings.ngPackagr.libGraphBuildGraphMod.BuildGraph
import typings.ngPackagr.libGraphTransformMod.Transform
import typings.ngPackagr.libNgPackageOptionsDotdiMod.NgPackagrOptions
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNgPackagePackageDottransformMod {
  
  @JSImport("ng-packagr/lib/ng-package/package.transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def packageTransformFactory(
    project: String,
    options: NgPackagrOptions,
    initTsConfigTransform: Transform,
    analyseSourcesTransform: Transform,
    entryPointTransform: Transform
  ): js.Function1[/* source$ */ Observable_[BuildGraph], Observable_[BuildGraph]] = (^.asInstanceOf[js.Dynamic].applyDynamic("packageTransformFactory")(project.asInstanceOf[js.Any], options.asInstanceOf[js.Any], initTsConfigTransform.asInstanceOf[js.Any], analyseSourcesTransform.asInstanceOf[js.Any], entryPointTransform.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* source$ */ Observable_[BuildGraph], Observable_[BuildGraph]]]
}
