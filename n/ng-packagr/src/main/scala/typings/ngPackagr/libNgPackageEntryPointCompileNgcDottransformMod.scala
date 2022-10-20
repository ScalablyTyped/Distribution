package typings.ngPackagr

import org.scalablytyped.runtime.Instantiable4
import typings.ngPackagr.libGraphTransformMod.Transform
import typings.ngPackagr.libNgPackageOptionsDotdiMod.NgPackagrOptions
import typings.ngPackagr.libStylesStylesheetProcessorMod.CssUrl
import typings.ngPackagr.libStylesStylesheetProcessorMod.StylesheetProcessor
import typings.ngPackagr.ngPackagrBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNgPackageEntryPointCompileNgcDottransformMod {
  
  @JSImport("ng-packagr/lib/ng-package/entry-point/compile-ngc.transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compileNgcTransformFactory_false(
    StylesheetProcessor: Instantiable4[
      /* basePath */ String, 
      /* cssUrl */ js.UndefOr[CssUrl], 
      /* includePaths */ js.UndefOr[js.Array[String]], 
      /* cacheDirectory */ js.UndefOr[String | `false`], 
      StylesheetProcessor
    ],
    options: NgPackagrOptions
  ): Transform = (^.asInstanceOf[js.Dynamic].applyDynamic("compileNgcTransformFactory")(StylesheetProcessor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Transform]
}
