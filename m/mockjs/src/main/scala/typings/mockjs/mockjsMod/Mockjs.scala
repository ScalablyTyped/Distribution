package typings.mockjs.mockjsMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Interface for global namespace 'Mockjs'
@js.native
trait Mockjs extends js.Object {
  var Random: MockjsRandom = js.native
  @JSName("mock")
  var mock_Original: MockjsMock = js.native
  @JSName("setup")
  var setup_Original: MockjsSetup = js.native
  @JSName("toJSONSchema")
  var toJSONSchema_Original: MockjsToJSONSchema = js.native
  @JSName("valid")
  var valid_Original: MockjsValid = js.native
  var version: Double = js.native
  def mock(rurl: S, rtype: S, template: js.Any): Mockjs = js.native
  def mock(rurl: S, template: js.Any): Mockjs = js.native
  def mock(rurl: RegExp, rtype: S, template: js.Any): Mockjs = js.native
  def mock(rurl: RegExp, template: js.Any): Mockjs = js.native
  def mock(template: js.Any): js.Any = js.native
  def setup(settings: MockjsSetupSettings): Unit = js.native
  def toJSONSchema(template: js.Any): MockjsToJSONSchemaRs = js.native
  def valid(template: js.Any, data: js.Any): js.Array[MockjsValidRsItem] = js.native
}

