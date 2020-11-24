package typings.plugapi.mod.Enum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BanReason extends js.Object {
  
  var INAPPROPRIATE_GENRE: Double = js.native
  
  var NEGATIVE_ATTITUDE: Double = js.native
  
  var OFFENSIVE_MEDIA: Double = js.native
  
  var SPAMMING_TROLLING: Double = js.native
  
  var VERBAL_ABUSE: Double = js.native
}
object BanReason {
  
  @scala.inline
  def apply(
    INAPPROPRIATE_GENRE: Double,
    NEGATIVE_ATTITUDE: Double,
    OFFENSIVE_MEDIA: Double,
    SPAMMING_TROLLING: Double,
    VERBAL_ABUSE: Double
  ): BanReason = {
    val __obj = js.Dynamic.literal(INAPPROPRIATE_GENRE = INAPPROPRIATE_GENRE.asInstanceOf[js.Any], NEGATIVE_ATTITUDE = NEGATIVE_ATTITUDE.asInstanceOf[js.Any], OFFENSIVE_MEDIA = OFFENSIVE_MEDIA.asInstanceOf[js.Any], SPAMMING_TROLLING = SPAMMING_TROLLING.asInstanceOf[js.Any], VERBAL_ABUSE = VERBAL_ABUSE.asInstanceOf[js.Any])
    __obj.asInstanceOf[BanReason]
  }
  
  @scala.inline
  implicit class BanReasonOps[Self <: BanReason] (val x: Self) extends AnyVal {
    
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
    def setINAPPROPRIATE_GENRE(value: Double): Self = this.set("INAPPROPRIATE_GENRE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNEGATIVE_ATTITUDE(value: Double): Self = this.set("NEGATIVE_ATTITUDE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOFFENSIVE_MEDIA(value: Double): Self = this.set("OFFENSIVE_MEDIA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSPAMMING_TROLLING(value: Double): Self = this.set("SPAMMING_TROLLING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVERBAL_ABUSE(value: Double): Self = this.set("VERBAL_ABUSE", value.asInstanceOf[js.Any])
  }
}
