package typings.opentelemetryCore

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlMod {
  
  @JSImport("@opentelemetry/core/build/src/utils/url", "isUrlIgnored")
  @js.native
  def isUrlIgnored(url: String): Boolean = js.native
  @JSImport("@opentelemetry/core/build/src/utils/url", "isUrlIgnored")
  @js.native
  def isUrlIgnored(url: String, ignoredUrls: js.Array[String | RegExp]): Boolean = js.native
  
  @JSImport("@opentelemetry/core/build/src/utils/url", "urlMatches")
  @js.native
  def urlMatches(url: String, urlToMatch: String): Boolean = js.native
  @JSImport("@opentelemetry/core/build/src/utils/url", "urlMatches")
  @js.native
  def urlMatches(url: String, urlToMatch: RegExp): Boolean = js.native
}
