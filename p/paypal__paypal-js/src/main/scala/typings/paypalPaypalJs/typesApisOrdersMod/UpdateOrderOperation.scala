package typings.paypalPaypalJs.typesApisOrdersMod

import typings.paypalPaypalJs.paypalPaypalJsStrings.add
import typings.paypalPaypalJs.paypalPaypalJsStrings.copy
import typings.paypalPaypalJs.paypalPaypalJsStrings.replace
import typings.paypalPaypalJs.paypalPaypalJsStrings.test
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.paypalPaypalJs.anon.Op
  - typings.paypalPaypalJs.anon.Path
*/
trait UpdateOrderOperation extends StObject
object UpdateOrderOperation {
  
  inline def Op(op: add | replace | copy | test, path: String, value: Record[String, Any]): typings.paypalPaypalJs.anon.Op = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.paypalPaypalJs.anon.Op]
  }
  
  inline def Path(path: String): typings.paypalPaypalJs.anon.Path = {
    val __obj = js.Dynamic.literal(op = "remove", path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.paypalPaypalJs.anon.Path]
  }
}
