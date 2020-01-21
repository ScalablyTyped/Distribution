package typings.officeJs.Word

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ListBullet with String] = js.native
  /* "Arrow" */ @js.native
  object arrow extends TopLevel[arrow with String]
  
  /* "Checkmark" */ @js.native
  object checkmark extends TopLevel[checkmark with String]
  
  /* "Custom" */ @js.native
  object custom extends TopLevel[custom with String]
  
  /* "Diamonds" */ @js.native
  object diamonds extends TopLevel[diamonds with String]
  
  /* "Hollow" */ @js.native
  object hollow extends TopLevel[hollow with String]
  
  /* "Solid" */ @js.native
  object solid extends TopLevel[solid with String]
  
  /* "Square" */ @js.native
  object square extends TopLevel[square with String]
  
}

