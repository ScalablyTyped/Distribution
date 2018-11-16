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
  // Mockjs.Random - Date
  // see https://github.com/nuysoft/Mock/wiki/Date
  type RandomDateUtilString = mockjsLib.mockjsLibStrings.year | mockjsLib.mockjsLibStrings.month | mockjsLib.mockjsLibStrings.week | mockjsLib.mockjsLibStrings.day | mockjsLib.mockjsLibStrings.hour | mockjsLib.mockjsLibStrings.minute | mockjsLib.mockjsLibStrings.second
  // Mockjs.Random - Image
  // see https://github.com/nuysoft/Mock/wiki/Image
  type RandomImageFormatString = mockjsLib.mockjsLibStrings.png | mockjsLib.mockjsLibStrings.gif | mockjsLib.mockjsLibStrings.jpg
  // Mockjs.Random - Web
  // see https://github.com/nuysoft/Mock/wiki/Web
  type RandomWebProtocal = mockjsLib.mockjsLibStrings.http | mockjsLib.mockjsLibStrings.ftp | mockjsLib.mockjsLibStrings.gopher | mockjsLib.mockjsLibStrings.mailto | mockjsLib.mockjsLibStrings.mid | mockjsLib.mockjsLibStrings.cid | mockjsLib.mockjsLibStrings.news | mockjsLib.mockjsLibStrings.nntp | mockjsLib.mockjsLibStrings.prospero | mockjsLib.mockjsLibStrings.telnet | mockjsLib.mockjsLibStrings.rlogin | mockjsLib.mockjsLibStrings.tn3270 | mockjsLib.mockjsLibStrings.wais
  type S = java.lang.String
}
