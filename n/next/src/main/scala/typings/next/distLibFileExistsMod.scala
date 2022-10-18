package typings.next

import typings.next.nextStrings.directory
import typings.next.nextStrings.file
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFileExistsMod {
  
  @JSImport("next/dist/lib/file-exists", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fileExists(fileName: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileExists")(fileName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def fileExists(fileName: String, `type`: file | directory): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("fileExists")(fileName.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
}
