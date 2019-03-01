package typings
package mockjsLib.mockjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mockjsNs {
  type B = scala.Boolean
  // Mockjs.setup()
  // see https://github.com/nuysoft/Mock/wiki/Mock.setup()
  type MockjsSetup = js.Function1[/* settings */ MockjsSetupSettings, scala.Unit]
  // Mockjs.toJSONSchema()
  // see https://github.com/nuysoft/Mock/wiki/Mock.toJSONSchema()
  type MockjsToJSONSchema = js.Function1[/* template */ js.Any, MockjsToJSONSchemaRs]
  // Mockjs.valid()
  // see https://github.com/nuysoft/Mock/wiki/Mock.valid()
  type MockjsValid = js.Function2[/* template */ js.Any, /* data */ js.Any, js.Array[MockjsValidRsItem]]
  type N = scala.Double
  type S = java.lang.String
}
