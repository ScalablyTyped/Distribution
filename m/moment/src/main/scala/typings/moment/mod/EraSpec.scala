package typings.moment.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EraSpec extends js.Object {
  
  var abbr: String = js.native
  
  var name: String = js.native
  
  var narrow: String = js.native
  
  var offset: Double = js.native
  
  var since: String | Double = js.native
  
  var until: String | Double = js.native
}
object EraSpec {
  
  @scala.inline
  def apply(
    abbr: String,
    name: String,
    narrow: String,
    offset: Double,
    since: String | Double,
    until: String | Double
  ): EraSpec = {
    val __obj = js.Dynamic.literal(abbr = abbr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any], until = until.asInstanceOf[js.Any])
    __obj.asInstanceOf[EraSpec]
  }
  
  @scala.inline
  implicit class EraSpecOps[Self <: EraSpec] (val x: Self) extends AnyVal {
    
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
    def setAbbr(value: String): Self = this.set("abbr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNarrow(value: String): Self = this.set("narrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSince(value: String | Double): Self = this.set("since", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUntil(value: String | Double): Self = this.set("until", value.asInstanceOf[js.Any])
  }
}
