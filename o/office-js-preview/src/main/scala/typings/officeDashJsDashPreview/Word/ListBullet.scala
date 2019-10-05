package typings.officeDashJsDashPreview.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ListBullet extends js.Object

/**
  * [Api set: WordApi]
  */
@JSGlobal("Word.ListBullet")
@js.native
object ListBullet extends js.Object {
  @js.native
  sealed trait arrow extends ListBullet
  
  @js.native
  sealed trait checkmark extends ListBullet
  
  @js.native
  sealed trait custom extends ListBullet
  
  @js.native
  sealed trait diamonds extends ListBullet
  
  @js.native
  sealed trait hollow extends ListBullet
  
  @js.native
  sealed trait solid extends ListBullet
  
  @js.native
  sealed trait square extends ListBullet
  
  /* "Arrow" */ val arrow: typings.officeDashJsDashPreview.Word.ListBullet.arrow with String = js.native
  /* "Checkmark" */ val checkmark: typings.officeDashJsDashPreview.Word.ListBullet.checkmark with String = js.native
  /* "Custom" */ val custom: typings.officeDashJsDashPreview.Word.ListBullet.custom with String = js.native
  /* "Diamonds" */ val diamonds: typings.officeDashJsDashPreview.Word.ListBullet.diamonds with String = js.native
  /* "Hollow" */ val hollow: typings.officeDashJsDashPreview.Word.ListBullet.hollow with String = js.native
  /* "Solid" */ val solid: typings.officeDashJsDashPreview.Word.ListBullet.solid with String = js.native
  /* "Square" */ val square: typings.officeDashJsDashPreview.Word.ListBullet.square with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ListBullet with String] = js.native
}

