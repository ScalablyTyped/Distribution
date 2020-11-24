package typings.pgPromise.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait queryResult extends js.Object
// Query Result Mask;
// API: http://vitaly-t.github.io/pg-promise/global.html#queryResult
@JSImport("pg-promise", "queryResult")
@js.native
object queryResult extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[queryResult with Double] = js.native
  
  @js.native
  sealed trait any extends queryResult
  /* 6 */ @js.native
  object any extends TopLevel[any with Double]
  
  @js.native
  sealed trait many extends queryResult
  /* 2 */ @js.native
  object many extends TopLevel[many with Double]
  
  @js.native
  sealed trait none extends queryResult
  /* 4 */ @js.native
  object none extends TopLevel[none with Double]
  
  @js.native
  sealed trait one extends queryResult
  /* 1 */ @js.native
  object one extends TopLevel[one with Double]
}
