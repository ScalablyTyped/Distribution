package typings.ngPackagr

import org.scalablytyped.runtime.Instantiable4
import typings.ngPackagr.ngPackagrBooleans.`false`
import typings.ngPackagr.optionsDiMod.NgPackagrOptions
import typings.ngPackagr.stylesheetProcessorMod.CssUrl
import typings.ngPackagr.stylesheetProcessorMod.StylesheetProcessor
import typings.ngPackagr.transformMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compileNgcTransformMod {
  
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
