package typings.pagerJackrabbit.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait exchangeType extends js.Object

@JSImport("@pager/jackrabbit", "exchangeType")
@js.native
object exchangeType extends js.Object {
  @js.native
  sealed trait direct extends exchangeType
  
  @js.native
  sealed trait fanout extends exchangeType
  
  @js.native
  sealed trait topic extends exchangeType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[exchangeType with String] = js.native
  /* "direct" */ @js.native
  object direct extends TopLevel[direct with String]
  
  /* "fanout" */ @js.native
  object fanout extends TopLevel[fanout with String]
  
  /* "topic" */ @js.native
  object topic extends TopLevel[topic with String]
  
}

