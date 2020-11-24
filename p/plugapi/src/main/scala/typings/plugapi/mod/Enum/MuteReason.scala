package typings.plugapi.mod.Enum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MuteReason extends js.Object {
  
  var NEGATIVE_ATTITUDE: Double = js.native
  
  var OFFENSIVE_LANGUAGE: Double = js.native
  
  var SPAMMING_TROLLING: Double = js.native
  
  var VERBAL_ABUSE: Double = js.native
  
  var VIOLATING_COMMUNITY_RULES: Double = js.native
}
object MuteReason {
  
  @scala.inline
  def apply(
    NEGATIVE_ATTITUDE: Double,
    OFFENSIVE_LANGUAGE: Double,
    SPAMMING_TROLLING: Double,
    VERBAL_ABUSE: Double,
    VIOLATING_COMMUNITY_RULES: Double
  ): MuteReason = {
    val __obj = js.Dynamic.literal(NEGATIVE_ATTITUDE = NEGATIVE_ATTITUDE.asInstanceOf[js.Any], OFFENSIVE_LANGUAGE = OFFENSIVE_LANGUAGE.asInstanceOf[js.Any], SPAMMING_TROLLING = SPAMMING_TROLLING.asInstanceOf[js.Any], VERBAL_ABUSE = VERBAL_ABUSE.asInstanceOf[js.Any], VIOLATING_COMMUNITY_RULES = VIOLATING_COMMUNITY_RULES.asInstanceOf[js.Any])
    __obj.asInstanceOf[MuteReason]
  }
  
  @scala.inline
  implicit class MuteReasonOps[Self <: MuteReason] (val x: Self) extends AnyVal {
    
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
    def setNEGATIVE_ATTITUDE(value: Double): Self = this.set("NEGATIVE_ATTITUDE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOFFENSIVE_LANGUAGE(value: Double): Self = this.set("OFFENSIVE_LANGUAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSPAMMING_TROLLING(value: Double): Self = this.set("SPAMMING_TROLLING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVERBAL_ABUSE(value: Double): Self = this.set("VERBAL_ABUSE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVIOLATING_COMMUNITY_RULES(value: Double): Self = this.set("VIOLATING_COMMUNITY_RULES", value.asInstanceOf[js.Any])
  }
}
