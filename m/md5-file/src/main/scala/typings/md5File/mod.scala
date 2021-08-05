package typings.md5File

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(filename: String, cb: js.Function2[/* err */ Error, /* hash */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("md5-file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sync(filename: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filename.asInstanceOf[js.Any]).asInstanceOf[String]
}
