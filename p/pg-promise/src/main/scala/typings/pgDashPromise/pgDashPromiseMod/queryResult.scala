package typings.pgDashPromise.pgDashPromiseMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[queryResult with Double] = js.native
  /* 6 */ @js.native
  object any extends TopLevel[any with Double]
  
  /* 2 */ @js.native
  object many extends TopLevel[many with Double]
  
  /* 4 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object one extends TopLevel[one with Double]
  
}

