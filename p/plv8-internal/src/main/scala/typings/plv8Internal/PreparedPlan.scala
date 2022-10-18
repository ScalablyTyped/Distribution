package typings.plv8Internal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreparedPlan extends StObject {
  
  def cursor(): Cursor = js.native
  def cursor(args: js.Array[Any]): Cursor = js.native
  
  def execute(): js.Array[SQLRow] = js.native
  def execute(args: js.Array[Any]): js.Array[SQLRow] = js.native
  
  def free(): Unit = js.native
}
