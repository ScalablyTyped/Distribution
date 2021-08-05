package typings.phenomnomnominalTsquery

import typings.phenomnomnominalTsquery.tsqueryTypesMod.TSQueryOptions
import typings.phenomnomnominalTsquery.tsqueryTypesMod.TSQueryStringTransformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object replaceMod {
  
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
