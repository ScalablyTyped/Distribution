package typings.ngPackagr

import typings.ngPackagr.optionsDiMod.NgPackagrOptions
import typings.ngPackagr.transformMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packageTransformMod {
  
  @JSImport("ng-packagr/lib/ng-package/package.transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def packageTransformFactory(
    project: String,
    options: NgPackagrOptions,
    initTsConfigTransform: Transform,
    analyseSourcesTransform: Transform,
    entryPointTransform: Transform
  ): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<BuildGraph> */ /* source$ */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<BuildGraph> */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("packageTransformFactory")(project.asInstanceOf[js.Any], options.asInstanceOf[js.Any], initTsConfigTransform.asInstanceOf[js.Any], analyseSourcesTransform.asInstanceOf[js.Any], entryPointTransform.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<BuildGraph> */ /* source$ */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<BuildGraph> */ Any
  ]]
}
