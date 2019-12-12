package typings.officeDashJs.Office

import org.scalablytyped.runtime.TopLevel
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
  sealed trait Body extends SourceProperty
  
  /**
    * The source of the data is from the subject of the message.
    */
  @js.native
  sealed trait Subject extends SourceProperty
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SourceProperty with Double] = js.native
  /* 0 */ @js.native
  object Body
    extends TopLevel[typings.officeDashJs.Office.SourceProperty.Body with Double]
  
  /* 1 */ @js.native
  object Subject
    extends TopLevel[typings.officeDashJs.Office.SourceProperty.Subject with Double]
  
}

