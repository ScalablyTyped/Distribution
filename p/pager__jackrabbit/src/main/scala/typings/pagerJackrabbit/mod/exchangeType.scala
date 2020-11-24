package typings.pagerJackrabbit.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait exchangeType extends js.Object
@JSImport("@pager/jackrabbit", "exchangeType")
@js.native
object exchangeType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[exchangeType with String] = js.native
  
  @js.native
  sealed trait direct extends exchangeType
  /* "direct" */ @js.native
  object direct extends TopLevel[direct with String]
  
  @js.native
  sealed trait fanout extends exchangeType
  /* "fanout" */ @js.native
  object fanout extends TopLevel[fanout with String]
  
  @js.native
  sealed trait topic extends exchangeType
  /* "topic" */ @js.native
  object topic extends TopLevel[topic with String]
}
