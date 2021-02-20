package typings.nodeMysqlWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CollectionChangedAction extends StObject
@JSImport("node-mysql-wrapper", "CollectionChangedAction")
@js.native
object CollectionChangedAction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CollectionChangedAction with Double] = js.native
  
  @js.native
  sealed trait DELETE extends CollectionChangedAction
  /* 1 */ val DELETE: typings.nodeMysqlWrapper.mod.CollectionChangedAction.DELETE with Double = js.native
  
  @js.native
  sealed trait INSERT extends CollectionChangedAction
  /* 0 */ val INSERT: typings.nodeMysqlWrapper.mod.CollectionChangedAction.INSERT with Double = js.native
  
  @js.native
  sealed trait RESET extends CollectionChangedAction
  /* 2 */ val RESET: typings.nodeMysqlWrapper.mod.CollectionChangedAction.RESET with Double = js.native
}
