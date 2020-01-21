package typings.pgPromise.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait isolationLevel extends js.Object

// Transaction Isolation Level;
// API: http://vitaly-t.github.io/pg-promise/txMode.html#.isolationLevel
@JSImport("pg-promise", "isolationLevel")
@js.native
object isolationLevel extends js.Object {
  @js.native
  sealed trait none extends isolationLevel
  
  @js.native
  sealed trait readCommitted extends isolationLevel
  
  @js.native
  sealed trait repeatableRead extends isolationLevel
  
  @js.native
  sealed trait serializable extends isolationLevel
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[isolationLevel with Double] = js.native
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 3 */ @js.native
  object readCommitted extends TopLevel[readCommitted with Double]
  
  /* 2 */ @js.native
  object repeatableRead extends TopLevel[repeatableRead with Double]
  
  /* 1 */ @js.native
  object serializable extends TopLevel[serializable with Double]
  
}

