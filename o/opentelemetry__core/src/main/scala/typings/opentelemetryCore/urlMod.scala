package typings.opentelemetryCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlMod {
  
  @JSImport("@opentelemetry/core/build/src/utils/url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isUrlIgnored(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUrlIgnored")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isUrlIgnored(url: String, ignoredUrls: js.Array[String | js.RegExp]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isUrlIgnored")(url.asInstanceOf[js.Any], ignoredUrls.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def urlMatches(url: String, urlToMatch: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("urlMatches")(url.asInstanceOf[js.Any], urlToMatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def urlMatches(url: String, urlToMatch: js.RegExp): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("urlMatches")(url.asInstanceOf[js.Any], urlToMatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
