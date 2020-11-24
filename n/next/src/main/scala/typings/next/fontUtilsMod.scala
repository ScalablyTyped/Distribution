package typings.next

import typings.next.anon.Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("next/dist/next-server/server/font-utils", JSImport.Namespace)
@js.native
object fontUtilsMod extends js.Object {
  
  def getFontDefinitionFromManifest(url: String, manifest: FontManifest): String = js.native
  
  def getFontDefinitionFromNetwork(url: String): js.Promise[String] = js.native
  
  type FontManifest = js.Array[Content]
}
