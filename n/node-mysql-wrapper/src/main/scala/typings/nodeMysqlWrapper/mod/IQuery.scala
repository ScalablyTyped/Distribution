package typings.nodeMysqlWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IQuery[T] extends StObject {
  
  var _table: Table[T] = js.native
  
  def execute(rawCriteria: Any): typings.bluebird.mod.^[Any] = js.native
  def execute(rawCriteria: Any, callback: js.Function1[/* _results */ Any, Any]): typings.bluebird.mod.^[Any] = js.native
}
