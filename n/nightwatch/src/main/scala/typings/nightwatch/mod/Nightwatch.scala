package typings.nightwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Nightwatch extends js.Object {
  
  var api: NightwatchAPI = js.native
  
  var assert: NightwatchAssertions = js.native
  
  var client: NightwatchClient = js.native
  
  var expect: Expect = js.native
  
  var verify: NightwatchAssertions = js.native
}
object Nightwatch {
  
  @scala.inline
  def apply(
    api: NightwatchAPI,
    assert: NightwatchAssertions,
    client: NightwatchClient,
    expect: Expect,
    verify: NightwatchAssertions
  ): Nightwatch = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], assert = assert.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], expect = expect.asInstanceOf[js.Any], verify = verify.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nightwatch]
  }
  
  @scala.inline
  implicit class NightwatchOps[Self <: Nightwatch] (val x: Self) extends AnyVal {
    
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
    def setApi(value: NightwatchAPI): Self = this.set("api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssert(value: NightwatchAssertions): Self = this.set("assert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient(value: NightwatchClient): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpect(value: Expect): Self = this.set("expect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerify(value: NightwatchAssertions): Self = this.set("verify", value.asInstanceOf[js.Any])
  }
}
