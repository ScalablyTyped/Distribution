package typings.next

import typings.next.anon.Code
import typings.next.distTraceMod.Span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildBabelLoaderTransformMod {
  
  @JSImport("next/dist/build/babel/loader/transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    source: String,
    inputSourceMap: js.Object,
    loaderOptions: Any,
    filename: String,
    target: String,
    parentSpan: Span
  ): Code = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], inputSourceMap.asInstanceOf[js.Any], loaderOptions.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], target.asInstanceOf[js.Any], parentSpan.asInstanceOf[js.Any])).asInstanceOf[Code]
  inline def default(
    source: String,
    inputSourceMap: Null,
    loaderOptions: Any,
    filename: String,
    target: String,
    parentSpan: Span
  ): Code = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], inputSourceMap.asInstanceOf[js.Any], loaderOptions.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], target.asInstanceOf[js.Any], parentSpan.asInstanceOf[js.Any])).asInstanceOf[Code]
  inline def default(
    source: String,
    inputSourceMap: Unit,
    loaderOptions: Any,
    filename: String,
    target: String,
    parentSpan: Span
  ): Code = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], inputSourceMap.asInstanceOf[js.Any], loaderOptions.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], target.asInstanceOf[js.Any], parentSpan.asInstanceOf[js.Any])).asInstanceOf[Code]
}
