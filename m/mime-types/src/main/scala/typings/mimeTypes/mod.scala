package typings.mimeTypes

import typings.mimeTypes.mimeTypesBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mime-types", "charset")
  @js.native
  def charset(typeString: String): String | `false` = js.native
  
  @JSImport("mime-types", "contentType")
  @js.native
  def contentType(filenameOrExt: String): String | `false` = js.native
  
  @JSImport("mime-types", "extension")
  @js.native
  def extension(typeString: String): String | `false` = js.native
  
  @JSImport("mime-types", "lookup")
  @js.native
  def lookup(filenameOrExt: String): String | `false` = js.native
}
