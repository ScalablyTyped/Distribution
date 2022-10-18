package typings.next

import typings.std.URLSearchParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibRouterUtilsQuerystringMod {
  
  @JSImport("next/dist/shared/lib/router/utils/querystring", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assign(target: URLSearchParams, searchParamsList: URLSearchParams*): URLSearchParams = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(scala.List(target.asInstanceOf[js.Any]).`++`(searchParamsList.asInstanceOf[Seq[js.Any]])*).asInstanceOf[URLSearchParams]
  
  inline def searchParamsToUrlQuery(searchParams: URLSearchParams): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("searchParamsToUrlQuery")(searchParams.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def urlQueryToSearchParams(
    urlQuery: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
  ): URLSearchParams = ^.asInstanceOf[js.Dynamic].applyDynamic("urlQueryToSearchParams")(urlQuery.asInstanceOf[js.Any]).asInstanceOf[URLSearchParams]
}
