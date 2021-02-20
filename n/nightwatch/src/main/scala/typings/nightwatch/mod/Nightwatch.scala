package typings.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Nightwatch extends StObject {
  
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
  implicit class NightwatchMutableBuilder[Self <: Nightwatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApi(value: NightwatchAPI): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssert(value: NightwatchAssertions): Self = StObject.set(x, "assert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient(value: NightwatchClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpect(value: Expect): Self = StObject.set(x, "expect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerify(value: NightwatchAssertions): Self = StObject.set(x, "verify", value.asInstanceOf[js.Any])
  }
}
