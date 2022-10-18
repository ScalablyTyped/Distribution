package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.anon.Hostname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibGetHostnameMod {
  
  @JSImport("next/dist/shared/lib/get-hostname", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getHostname(parsed: Hostname): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHostname")(parsed.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def getHostname(parsed: Hostname, headers: StringDictionary[js.UndefOr[String | js.Array[String]]]): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHostname")(parsed.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
}
