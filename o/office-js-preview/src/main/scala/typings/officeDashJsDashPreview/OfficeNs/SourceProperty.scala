package typings.officeDashJsDashPreview.OfficeNs

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
  
  /* 0 */ val Body: typings.officeDashJsDashPreview.OfficeNs.SourceProperty.Body with Double = js.native
  /* 1 */ val Subject: typings.officeDashJsDashPreview.OfficeNs.SourceProperty.Subject with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SourceProperty with Double] = js.native
}

