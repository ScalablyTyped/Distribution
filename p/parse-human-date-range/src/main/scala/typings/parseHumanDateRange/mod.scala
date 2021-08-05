package typings.parseHumanDateRange

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(input: String): js.Array[Date] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[Date]]
  inline def apply(input: String, offset: Date): js.Array[Date] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Date]]
  
  @JSImport("parse-human-date-range", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
