package typings.next

import typings.next.distSharedLibImageConfigMod.RemotePattern
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibMatchRemotePatternMod {
  
  @JSImport("next/dist/shared/lib/match-remote-pattern", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasMatch(domains: js.Array[String], remotePatterns: js.Array[RemotePattern], url: URL): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasMatch")(domains.asInstanceOf[js.Any], remotePatterns.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def matchRemotePattern(pattern: RemotePattern, url: URL): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchRemotePattern")(pattern.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
