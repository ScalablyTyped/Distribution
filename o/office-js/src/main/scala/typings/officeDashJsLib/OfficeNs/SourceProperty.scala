package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SourceProperty extends js.Object

@JSGlobal("Office.SourceProperty")
@js.native
object SourceProperty extends js.Object {
  /**
    * The source of the data is from the body of the message.
    */
  @js.native
  sealed trait Body
    extends officeDashJsLib.OfficeNs.SourceProperty
  
  /**
    * The source of the data is from the subject of the message.
    */
  @js.native
  sealed trait Subject
    extends officeDashJsLib.OfficeNs.SourceProperty
  
  /* 0 */ val Body: Body with scala.Double = js.native
  /* 1 */ val Subject: Subject with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[officeDashJsLib.OfficeNs.SourceProperty with scala.Double] = js.native
}

