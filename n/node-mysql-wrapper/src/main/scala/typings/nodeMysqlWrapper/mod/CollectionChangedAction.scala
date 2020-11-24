package typings.nodeMysqlWrapper.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CollectionChangedAction extends js.Object
@JSImport("node-mysql-wrapper", "CollectionChangedAction")
@js.native
object CollectionChangedAction extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CollectionChangedAction with Double] = js.native
  
  @js.native
  sealed trait DELETE extends CollectionChangedAction
  /* 1 */ @js.native
  object DELETE extends TopLevel[DELETE with Double]
  
  @js.native
  sealed trait INSERT extends CollectionChangedAction
  /* 0 */ @js.native
  object INSERT extends TopLevel[INSERT with Double]
  
  @js.native
  sealed trait RESET extends CollectionChangedAction
  /* 2 */ @js.native
  object RESET extends TopLevel[RESET with Double]
}
