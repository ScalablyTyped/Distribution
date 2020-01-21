package typings.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EggGroup extends js.Object {
  var names: Translations
}

object EggGroup {
  @scala.inline
  def apply(names: Translations): EggGroup = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EggGroup]
  }
}

