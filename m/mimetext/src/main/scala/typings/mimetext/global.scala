package typings.mimetext

import typings.mimetext.mod.NodeMIMEMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object MimeText {
    
    @JSGlobal("MimeText")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createMimeMessage(): NodeMIMEMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("createMimeMessage")().asInstanceOf[NodeMIMEMessage]
  }
}
