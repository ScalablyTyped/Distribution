package typings.pgPromise.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait isolationLevel extends js.Object
// Transaction Isolation Level;
// API: http://vitaly-t.github.io/pg-promise/txMode.html#.isolationLevel
@JSImport("pg-promise", "isolationLevel")
@js.native
object isolationLevel extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[isolationLevel with Double] = js.native
  
  @js.native
  sealed trait none extends isolationLevel
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  @js.native
  sealed trait readCommitted extends isolationLevel
  /* 3 */ @js.native
  object readCommitted extends TopLevel[readCommitted with Double]
  
  @js.native
  sealed trait repeatableRead extends isolationLevel
  /* 2 */ @js.native
  object repeatableRead extends TopLevel[repeatableRead with Double]
  
  @js.native
  sealed trait serializable extends isolationLevel
  /* 1 */ @js.native
  object serializable extends TopLevel[serializable with Double]
}
