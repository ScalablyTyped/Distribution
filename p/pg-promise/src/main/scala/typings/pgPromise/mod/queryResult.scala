package typings.pgPromise.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait queryResult extends StObject
// Query Result Mask;
// API: http://vitaly-t.github.io/pg-promise/global.html#queryResult
@JSImport("pg-promise", "queryResult")
@js.native
object queryResult extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[queryResult with Double] = js.native
  
  @js.native
  sealed trait any extends queryResult
  /* 6 */ val any: typings.pgPromise.mod.queryResult.any with Double = js.native
  
  @js.native
  sealed trait many extends queryResult
  /* 2 */ val many: typings.pgPromise.mod.queryResult.many with Double = js.native
  
  @js.native
  sealed trait none extends queryResult
  /* 4 */ val none: typings.pgPromise.mod.queryResult.none with Double = js.native
  
  @js.native
  sealed trait one extends queryResult
  /* 1 */ val one: typings.pgPromise.mod.queryResult.one with Double = js.native
}
