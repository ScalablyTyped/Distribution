package typings.nodeDashWindows.nodeDashWindowsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LogMode extends js.Object

@JSImport("node-windows", "LogMode")
@js.native
object LogMode extends js.Object {
  @js.native
  sealed trait append extends LogMode
  
  @js.native
  sealed trait reset extends LogMode
  
  @js.native
  sealed trait roll extends LogMode
  
  @js.native
  sealed trait rotate extends LogMode
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LogMode with String] = js.native
  /* "append" */ @js.native
  object append extends TopLevel[append with String]
  
  /* "reset" */ @js.native
  object reset extends TopLevel[reset with String]
  
  /* "roll" */ @js.native
  object roll extends TopLevel[roll with String]
  
  /* "rotate" */ @js.native
  object rotate extends TopLevel[rotate with String]
  
}

