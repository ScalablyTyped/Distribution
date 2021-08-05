package typings.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nightwatch extends StObject {
  
  var api: NightwatchAPI
  
  var assert: NightwatchAssertions
  
  var client: NightwatchClient
  
  var expect: Expect
  
  var verify: NightwatchAssertions
}
object Nightwatch {
  
  inline def apply(
    api: NightwatchAPI,
    assert: NightwatchAssertions,
    client: NightwatchClient,
    expect: Expect,
    verify: NightwatchAssertions
  ): Nightwatch = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], assert = assert.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], expect = expect.asInstanceOf[js.Any], verify = verify.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nightwatch]
  }
  
  extension [Self <: Nightwatch](x: Self) {
    
    inline def setApi(value: NightwatchAPI): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setAssert(value: NightwatchAssertions): Self = StObject.set(x, "assert", value.asInstanceOf[js.Any])
    
    inline def setClient(value: NightwatchClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setExpect(value: Expect): Self = StObject.set(x, "expect", value.asInstanceOf[js.Any])
    
    inline def setVerify(value: NightwatchAssertions): Self = StObject.set(x, "verify", value.asInstanceOf[js.Any])
  }
}
