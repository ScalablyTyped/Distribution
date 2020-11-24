package typings.osrsJsonApi.anon

import typings.osrsJsonApi.mod.hiscores.RankScoreObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hunter extends js.Object {
  
  var hunter: RankScoreObject = js.native
  
  var rogue: RankScoreObject = js.native
}
object Hunter {
  
  @scala.inline
  def apply(hunter: RankScoreObject, rogue: RankScoreObject): Hunter = {
    val __obj = js.Dynamic.literal(hunter = hunter.asInstanceOf[js.Any], rogue = rogue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hunter]
  }
  
  @scala.inline
  implicit class HunterOps[Self <: Hunter] (val x: Self) extends AnyVal {
    
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
    def setHunter(value: RankScoreObject): Self = this.set("hunter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRogue(value: RankScoreObject): Self = this.set("rogue", value.asInstanceOf[js.Any])
  }
}
