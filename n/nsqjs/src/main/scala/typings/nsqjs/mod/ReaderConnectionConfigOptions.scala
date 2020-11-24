package typings.nsqjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReaderConnectionConfigOptions extends ConnectionConfigOptions {
  
  var lookupdHTTPAddresses: js.UndefOr[String | js.Array[String]] = js.native
  
  var lookupdPollInterval: js.UndefOr[Double] = js.native
  
  var lookupdPollJitter: js.UndefOr[Double] = js.native
  
  var lowRdyTimeout: js.UndefOr[Double] = js.native
  
  var maxAttempts: js.UndefOr[Double] = js.native
  
  var maxBackoffDuration: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var nsqdTCPAddresses: js.UndefOr[String | js.Array[String]] = js.native
}
object ReaderConnectionConfigOptions {
  
  @scala.inline
  def apply(): ReaderConnectionConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReaderConnectionConfigOptions]
  }
  
  @scala.inline
  implicit class ReaderConnectionConfigOptionsOps[Self <: ReaderConnectionConfigOptions] (val x: Self) extends AnyVal {
    
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
    def setLookupdHTTPAddressesVarargs(value: String*): Self = this.set("lookupdHTTPAddresses", js.Array(value :_*))
    
    @scala.inline
    def setLookupdHTTPAddresses(value: String | js.Array[String]): Self = this.set("lookupdHTTPAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLookupdHTTPAddresses: Self = this.set("lookupdHTTPAddresses", js.undefined)
    
    @scala.inline
    def setLookupdPollInterval(value: Double): Self = this.set("lookupdPollInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLookupdPollInterval: Self = this.set("lookupdPollInterval", js.undefined)
    
    @scala.inline
    def setLookupdPollJitter(value: Double): Self = this.set("lookupdPollJitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLookupdPollJitter: Self = this.set("lookupdPollJitter", js.undefined)
    
    @scala.inline
    def setLowRdyTimeout(value: Double): Self = this.set("lowRdyTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowRdyTimeout: Self = this.set("lowRdyTimeout", js.undefined)
    
    @scala.inline
    def setMaxAttempts(value: Double): Self = this.set("maxAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAttempts: Self = this.set("maxAttempts", js.undefined)
    
    @scala.inline
    def setMaxBackoffDuration(value: Double): Self = this.set("maxBackoffDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxBackoffDuration: Self = this.set("maxBackoffDuration", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNsqdTCPAddressesVarargs(value: String*): Self = this.set("nsqdTCPAddresses", js.Array(value :_*))
    
    @scala.inline
    def setNsqdTCPAddresses(value: String | js.Array[String]): Self = this.set("nsqdTCPAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNsqdTCPAddresses: Self = this.set("nsqdTCPAddresses", js.undefined)
  }
}
