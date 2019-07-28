package typings.officeDashJsDashPreview.WordNs

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
  
  /* "Arrow" */ val arrow: typings.officeDashJsDashPreview.WordNs.ListBullet.arrow with String = js.native
  /* "Checkmark" */ val checkmark: typings.officeDashJsDashPreview.WordNs.ListBullet.checkmark with String = js.native
  /* "Custom" */ val custom: typings.officeDashJsDashPreview.WordNs.ListBullet.custom with String = js.native
  /* "Diamonds" */ val diamonds: typings.officeDashJsDashPreview.WordNs.ListBullet.diamonds with String = js.native
  /* "Hollow" */ val hollow: typings.officeDashJsDashPreview.WordNs.ListBullet.hollow with String = js.native
  /* "Solid" */ val solid: typings.officeDashJsDashPreview.WordNs.ListBullet.solid with String = js.native
  /* "Square" */ val square: typings.officeDashJsDashPreview.WordNs.ListBullet.square with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ListBullet with String] = js.native
}

