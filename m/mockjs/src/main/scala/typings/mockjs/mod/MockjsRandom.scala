package typings.mockjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Mockjs.Random
// see https://github.com/nuysoft/Mock/wiki/Mock.Random
@js.native
trait MockjsRandom
  extends MockjsRandomBasic
     with MockjsRandomDate
     with MockjsRandomImage
     with MockjsRandomColor
     with MockjsRandomAddress
     with MockjsRandomHelper
     with MockjsRandomMiscellaneous
     with MockjsRandomName
     with MockjsRandomText
     with MockjsRandomWeb

