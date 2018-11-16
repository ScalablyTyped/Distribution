package typings
package mdnsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object mdnsLibStrings {
  @js.native
  sealed trait serviceDown extends js.Object
  
  @js.native
  sealed trait serviceUp extends js.Object
  
  def serviceDown: serviceDown = "serviceDown".asInstanceOf[serviceDown]
  def serviceUp: serviceUp = "serviceUp".asInstanceOf[serviceUp]
}

