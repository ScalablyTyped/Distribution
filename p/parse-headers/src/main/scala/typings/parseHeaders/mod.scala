package typings.parseHeaders

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(headers: String): Record[String, String | js.Array[String]] = ^.asInstanceOf[js.Dynamic].apply(headers.asInstanceOf[js.Any]).asInstanceOf[Record[String, String | js.Array[String]]]
  
  @JSImport("parse-headers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
