package typings.nodeMysqlWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-mysql-wrapper", "DeleteQuery")
@js.native
class DeleteQuery[T] protected ()
  extends StObject
     with IQuery[T] {
  def this(_table: Table[T]) = this()
  
  def execute(criteriaOrID: String): typings.bluebird.mod.^[DeleteAnswer] = js.native
  def execute(criteriaOrID: String, callback: js.Function1[/* _result */ DeleteAnswer, js.Any]): typings.bluebird.mod.^[DeleteAnswer] = js.native
  def execute(criteriaOrID: Double): typings.bluebird.mod.^[DeleteAnswer] = js.native
  def execute(criteriaOrID: Double, callback: js.Function1[/* _result */ DeleteAnswer, js.Any]): typings.bluebird.mod.^[DeleteAnswer] = js.native
}
