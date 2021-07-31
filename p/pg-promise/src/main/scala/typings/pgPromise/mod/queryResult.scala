package typings.pgPromise.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait queryResult extends StObject
// Query Result Mask;
// API: http://vitaly-t.github.io/pg-promise/global.html#queryResult
@JSImport("pg-promise", "queryResult")
@js.native
object queryResult extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[queryResult & Double] = js.native
  
  @js.native
  sealed trait any
    extends StObject
       with queryResult
  /* 6 */ val any: typings.pgPromise.mod.queryResult.any & Double = js.native
  
  @js.native
  sealed trait many
    extends StObject
       with queryResult
  /* 2 */ val many: typings.pgPromise.mod.queryResult.many & Double = js.native
  
  @js.native
  sealed trait none
    extends StObject
       with queryResult
  /* 4 */ val none: typings.pgPromise.mod.queryResult.none & Double = js.native
  
  @js.native
  sealed trait one
    extends StObject
       with queryResult
  /* 1 */ val one: typings.pgPromise.mod.queryResult.one & Double = js.native
}
