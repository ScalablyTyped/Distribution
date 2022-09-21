package typings.pdfjsDist

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contentDispositionMod {
  
  @JSImport("pdfjs-dist/types/src/display/content_disposition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFilenameFromContentDispositionHeader(contentDisposition: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilenameFromContentDispositionHeader")(contentDisposition.asInstanceOf[js.Any]).asInstanceOf[String]
}
