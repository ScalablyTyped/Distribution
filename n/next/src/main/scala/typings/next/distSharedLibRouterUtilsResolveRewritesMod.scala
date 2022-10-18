package typings.next

import typings.next.anon.AfterFilesBeforeFiles
import typings.next.anon.ExternalDest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibRouterUtilsResolveRewritesMod {
  
  @JSImport("next/dist/shared/lib/router/utils/resolve-rewrites", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    asPath: String,
    pages: js.Array[String],
    rewrites: AfterFilesBeforeFiles,
    query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any,
    resolveHref: js.Function1[/* path */ String, String]
  ): ExternalDest = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(asPath.asInstanceOf[js.Any], pages.asInstanceOf[js.Any], rewrites.asInstanceOf[js.Any], query.asInstanceOf[js.Any], resolveHref.asInstanceOf[js.Any])).asInstanceOf[ExternalDest]
  inline def default(
    asPath: String,
    pages: js.Array[String],
    rewrites: AfterFilesBeforeFiles,
    query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any,
    resolveHref: js.Function1[/* path */ String, String],
    locales: js.Array[String]
  ): ExternalDest = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(asPath.asInstanceOf[js.Any], pages.asInstanceOf[js.Any], rewrites.asInstanceOf[js.Any], query.asInstanceOf[js.Any], resolveHref.asInstanceOf[js.Any], locales.asInstanceOf[js.Any])).asInstanceOf[ExternalDest]
}
