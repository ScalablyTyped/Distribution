package typings.md5File

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promiseMod {
  
  @scala.inline
  def apply(filename: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  @JSImport("md5-file/promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def sync(filename: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filename.asInstanceOf[js.Any]).asInstanceOf[String]
}
