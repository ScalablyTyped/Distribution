package typings.nightwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Nightwatch extends js.Object {
  var api: NightwatchAPI
  var assert: NightwatchAssertions
  var client: NightwatchClient
  var expect: Expect
  var verify: NightwatchAssertions
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
}

