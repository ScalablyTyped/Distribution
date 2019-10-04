package typings.pgDashPromise.pgDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait queryResult extends js.Object

// Query Result Mask;
// API: http://vitaly-t.github.io/pg-promise/global.html#queryResult
@JSImport("pg-promise", "queryResult")
@js.native
object queryResult extends js.Object {
  @js.native
  sealed trait any extends queryResult
  
  @js.native
  sealed trait many extends queryResult
  
  @js.native
  sealed trait none extends queryResult
  
  @js.native
  sealed trait one extends queryResult
  
  /* 6 */ val any: typings.pgDashPromise.pgDashPromiseMod.queryResult.any with Double = js.native
  /* 2 */ val many: typings.pgDashPromise.pgDashPromiseMod.queryResult.many with Double = js.native
  /* 4 */ val none: typings.pgDashPromise.pgDashPromiseMod.queryResult.none with Double = js.native
  /* 1 */ val one: typings.pgDashPromise.pgDashPromiseMod.queryResult.one with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[queryResult with Double] = js.native
}

