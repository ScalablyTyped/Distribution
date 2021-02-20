package typings.next

import typings.next.anon.Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fontUtilsMod {
  
  @JSImport("next/dist/next-server/server/font-utils", "getFontDefinitionFromManifest")
  @js.native
  def getFontDefinitionFromManifest(url: String, manifest: FontManifest): String = js.native
  
  @JSImport("next/dist/next-server/server/font-utils", "getFontDefinitionFromNetwork")
  @js.native
  def getFontDefinitionFromNetwork(url: String): js.Promise[String] = js.native
  
  type FontManifest = js.Array[Content]
}
