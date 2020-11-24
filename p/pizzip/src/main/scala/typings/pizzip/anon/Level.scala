package typings.pizzip.anon

import typings.pizzip.pizzipNumbers.`1`
import typings.pizzip.pizzipNumbers.`2`
import typings.pizzip.pizzipNumbers.`3`
import typings.pizzip.pizzipNumbers.`4`
import typings.pizzip.pizzipNumbers.`5`
import typings.pizzip.pizzipNumbers.`6`
import typings.pizzip.pizzipNumbers.`7`
import typings.pizzip.pizzipNumbers.`8`
import typings.pizzip.pizzipNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Level extends js.Object {
  
  var level: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` = js.native
}
object Level {
  
  @scala.inline
  def apply(level: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`): Level = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Level]
  }
  
  @scala.inline
  implicit class LevelOps[Self <: Level] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLevel(value: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`): Self = this.set("level", value.asInstanceOf[js.Any])
  }
}
