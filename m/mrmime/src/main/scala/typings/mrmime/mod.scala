package typings.mrmime

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mrmime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def lookup(`extension`: String): String | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(`extension`.asInstanceOf[js.Any]).asInstanceOf[String | Unit]
  
  @JSImport("mrmime", "mimes")
  @js.native
  val mimes: Record[String, String] = js.native
}
