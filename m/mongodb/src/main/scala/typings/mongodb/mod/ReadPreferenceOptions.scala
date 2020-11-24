package typings.mongodb.mod

import typings.mongodb.anon.Enabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadPreferenceOptions extends js.Object {
  
  var hedge: js.UndefOr[Enabled] = js.native
  
  /**
    * Max Secondary Read Staleness in Seconds
    */
  var maxStalenessSeconds: js.UndefOr[scala.Double] = js.native
}
object ReadPreferenceOptions {
  
  @scala.inline
  def apply(): ReadPreferenceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadPreferenceOptions]
  }
  
  @scala.inline
  implicit class ReadPreferenceOptionsOps[Self <: ReadPreferenceOptions] (val x: Self) extends AnyVal {
    
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
    def setHedge(value: Enabled): Self = this.set("hedge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHedge: Self = this.set("hedge", js.undefined)
    
    @scala.inline
    def setMaxStalenessSeconds(value: scala.Double): Self = this.set("maxStalenessSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxStalenessSeconds: Self = this.set("maxStalenessSeconds", js.undefined)
  }
}
