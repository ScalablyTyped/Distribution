package typings
package officeDashJsDashPreviewLib.WordNs

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
  sealed trait arrow
    extends officeDashJsDashPreviewLib.WordNs.ListBullet
  
  @js.native
  sealed trait checkmark
    extends officeDashJsDashPreviewLib.WordNs.ListBullet
  
  @js.native
  sealed trait custom
    extends officeDashJsDashPreviewLib.WordNs.ListBullet
  
  @js.native
  sealed trait diamonds
    extends officeDashJsDashPreviewLib.WordNs.ListBullet
  
  @js.native
  sealed trait hollow
    extends officeDashJsDashPreviewLib.WordNs.ListBullet
  
  @js.native
  sealed trait solid
    extends officeDashJsDashPreviewLib.WordNs.ListBullet
  
  @js.native
  sealed trait square
    extends officeDashJsDashPreviewLib.WordNs.ListBullet
  
  /* "Arrow" */ val arrow: arrow with java.lang.String = js.native
  /* "Checkmark" */ val checkmark: checkmark with java.lang.String = js.native
  /* "Custom" */ val custom: custom with java.lang.String = js.native
  /* "Diamonds" */ val diamonds: diamonds with java.lang.String = js.native
  /* "Hollow" */ val hollow: hollow with java.lang.String = js.native
  /* "Solid" */ val solid: solid with java.lang.String = js.native
  /* "Square" */ val square: square with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.WordNs.ListBullet with java.lang.String] = js.native
}

