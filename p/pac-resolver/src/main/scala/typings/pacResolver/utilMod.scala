package typings.pacResolver

import typings.node.dnsMod.LookupAddress
import typings.node.dnsMod.LookupOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pac-resolver/dist/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  
  def dnsLookup(host: String, opts: LookupOptions): js.Promise[String | js.Array[LookupAddress]] = js.native
  
  def isGMT(v: js.Any): /* is pac-resolver.pac-resolver.GMT */ Boolean = js.native
}
