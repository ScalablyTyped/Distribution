package typings.officeJs.Word

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
  
}

