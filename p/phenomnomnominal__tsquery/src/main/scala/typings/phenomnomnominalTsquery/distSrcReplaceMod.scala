package typings.phenomnomnominalTsquery

import typings.phenomnomnominalTsquery.distSrcTsqueryTypesMod.TSQueryOptions
import typings.phenomnomnominalTsquery.distSrcTsqueryTypesMod.TSQueryStringTransformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcReplaceMod {
  
  @JSImport("@phenomnomnominal/tsquery/dist/src/replace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def replace(source: String, selector: String, stringTransformer: TSQueryStringTransformer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(source.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], stringTransformer.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def replace(
    source: String,
    selector: String,
    stringTransformer: TSQueryStringTransformer,
    options: TSQueryOptions
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(source.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], stringTransformer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
