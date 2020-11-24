package typings.mockjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Mockjs.Random
// see https://github.com/nuysoft/Mock/wiki/Mock.Random
@js.native
trait MockjsRandom
  extends MockjsRandomExtendOption
     with MockjsRandomBasic
     with MockjsRandomDate
     with MockjsRandomImage
     with MockjsRandomColor
     with MockjsRandomAddress
     with MockjsRandomHelper
     with MockjsRandomMiscellaneous
     with MockjsRandomName
     with MockjsRandomText
     with MockjsRandomWeb {
  
  // Random.extend
  def extend(extendOption: MockjsRandomExtendOption): MockjsRandom = js.native
}
