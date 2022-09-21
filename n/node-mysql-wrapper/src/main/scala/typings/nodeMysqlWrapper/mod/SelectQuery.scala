package typings.nodeMysqlWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-mysql-wrapper", "SelectQuery")
@js.native
open class SelectQuery[T] protected ()
  extends StObject
     with IQuery[T] {
  def this(_table: Table[T]) = this()
  
  /* private */ def parseQueryResult(result: Any, criteria: ICriteriaParts): typings.bluebird.mod.^[Any] = js.native
  
  /**
    * Executes the select and returns the Promise.
    */
  def promise(rawCriteria: Any): typings.bluebird.mod.^[js.Array[T]] = js.native
  def promise(rawCriteria: Any, callback: js.Function1[/* _results */ js.Array[T], Any]): typings.bluebird.mod.^[js.Array[T]] = js.native
}
