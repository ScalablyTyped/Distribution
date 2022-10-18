package typings.next

import typings.next.distServerRequestMetaMod.NextParsedUrlQuery
import typings.std.URLSearchParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerInternalUtilsMod {
  
  @JSImport("next/dist/server/internal-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stripInternalQueries(query: NextParsedUrlQuery): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stripInternalQueries")(query.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def stripInternalSearchParams(searchParams: URLSearchParams): URLSearchParams = ^.asInstanceOf[js.Dynamic].applyDynamic("stripInternalSearchParams")(searchParams.asInstanceOf[js.Any]).asInstanceOf[URLSearchParams]
  inline def stripInternalSearchParams(searchParams: URLSearchParams, extended: Boolean): URLSearchParams = (^.asInstanceOf[js.Dynamic].applyDynamic("stripInternalSearchParams")(searchParams.asInstanceOf[js.Any], extended.asInstanceOf[js.Any])).asInstanceOf[URLSearchParams]
}
