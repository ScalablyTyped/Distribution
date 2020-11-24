package typings.oversmash.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NormalizeNamesAs extends js.Object
@JSImport("oversmash", "NormalizeNamesAs")
@js.native
object NormalizeNamesAs extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[NormalizeNamesAs with String] = js.native
  
  @js.native
  sealed trait camel extends NormalizeNamesAs
  /* "camel" */ @js.native
  object camel extends TopLevel[camel with String]
  
  @js.native
  sealed trait snake extends NormalizeNamesAs
  /* "snake" */ @js.native
  object snake extends TopLevel[snake with String]
}
