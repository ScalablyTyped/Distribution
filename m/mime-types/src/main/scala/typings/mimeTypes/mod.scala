package typings.mimeTypes

import typings.mimeTypes.mimeTypesBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mime-types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def charset(typeString: String): String | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("charset")(typeString.asInstanceOf[js.Any]).asInstanceOf[String | `false`]
  
  @scala.inline
  def contentType(filenameOrExt: String): String | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("contentType")(filenameOrExt.asInstanceOf[js.Any]).asInstanceOf[String | `false`]
  
  @scala.inline
  def `extension`(typeString: String): String | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("extension")(typeString.asInstanceOf[js.Any]).asInstanceOf[String | `false`]
  
  @scala.inline
  def lookup(filenameOrExt: String): String | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(filenameOrExt.asInstanceOf[js.Any]).asInstanceOf[String | `false`]
}
