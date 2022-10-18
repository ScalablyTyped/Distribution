package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNetDownloadFileMod {
  
  inline def apply(url: String, path: String): Unit = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(url: String, path: String, ignoreSslErrors: Boolean): Unit = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], path.asInstanceOf[js.Any], ignoreSslErrors.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/net/downloadFile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
