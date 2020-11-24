package typings.nodeWindows.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LogMode extends js.Object
@JSImport("node-windows", "LogMode")
@js.native
object LogMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LogMode with String] = js.native
  
  @js.native
  sealed trait append extends LogMode
  /* "append" */ @js.native
  object append extends TopLevel[append with String]
  
  @js.native
  sealed trait reset extends LogMode
  /* "reset" */ @js.native
  object reset extends TopLevel[reset with String]
  
  @js.native
  sealed trait roll extends LogMode
  /* "roll" */ @js.native
  object roll extends TopLevel[roll with String]
  
  @js.native
  sealed trait rotate extends LogMode
  /* "rotate" */ @js.native
  object rotate extends TopLevel[rotate with String]
}
