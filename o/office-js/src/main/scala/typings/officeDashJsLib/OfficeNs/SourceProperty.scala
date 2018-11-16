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
  
  val Body: Body with java.lang.String = js.native
  val Subject: Subject with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.OfficeNs.SourceProperty with java.lang.String] = js.native
}

