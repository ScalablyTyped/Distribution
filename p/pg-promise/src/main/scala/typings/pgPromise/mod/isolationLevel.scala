package typings.pgPromise.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait isolationLevel extends StObject
// Transaction Isolation Level;
// API: http://vitaly-t.github.io/pg-promise/txMode.html#.isolationLevel
@JSImport("pg-promise", "isolationLevel")
@js.native
object isolationLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[isolationLevel & Double] = js.native
  
  @js.native
  sealed trait none
    extends StObject
       with isolationLevel
  /* 0 */ val none: typings.pgPromise.mod.isolationLevel.none & Double = js.native
  
  @js.native
  sealed trait readCommitted
    extends StObject
       with isolationLevel
  /* 3 */ val readCommitted: typings.pgPromise.mod.isolationLevel.readCommitted & Double = js.native
  
  @js.native
  sealed trait repeatableRead
    extends StObject
       with isolationLevel
  /* 2 */ val repeatableRead: typings.pgPromise.mod.isolationLevel.repeatableRead & Double = js.native
  
  @js.native
  sealed trait serializable
    extends StObject
       with isolationLevel
  /* 1 */ val serializable: typings.pgPromise.mod.isolationLevel.serializable & Double = js.native
}
