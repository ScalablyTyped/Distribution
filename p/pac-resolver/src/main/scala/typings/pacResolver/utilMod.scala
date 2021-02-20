package typings.pacResolver

import typings.node.dnsMod.LookupAddress
import typings.node.dnsMod.LookupOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("pac-resolver/dist/util", "dnsLookup")
  @js.native
  def dnsLookup(host: String, opts: LookupOptions): js.Promise[String | js.Array[LookupAddress]] = js.native
  
  @JSImport("pac-resolver/dist/util", "isGMT")
  @js.native
  def isGMT(v: js.Any): /* is pac-resolver.pac-resolver.GMT */ Boolean = js.native
}
