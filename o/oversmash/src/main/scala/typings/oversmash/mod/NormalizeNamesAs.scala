package typings.oversmash.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NormalizeNamesAs extends js.Object

@JSImport("oversmash", "NormalizeNamesAs")
@js.native
object NormalizeNamesAs extends js.Object {
  @js.native
  sealed trait camel extends NormalizeNamesAs
  
  @js.native
  sealed trait snake extends NormalizeNamesAs
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[NormalizeNamesAs with String] = js.native
  /* "camel" */ @js.native
  object camel extends TopLevel[camel with String]
  
  /* "snake" */ @js.native
  object snake extends TopLevel[snake with String]
  
}

