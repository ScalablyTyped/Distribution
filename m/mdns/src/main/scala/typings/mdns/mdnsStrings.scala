package typings.mdns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object mdnsStrings {
  @js.native
  sealed trait serviceDown extends js.Object
  
  @js.native
  sealed trait serviceUp extends js.Object
  
  @scala.inline
  def serviceDown: serviceDown = "serviceDown".asInstanceOf[serviceDown]
  @scala.inline
  def serviceUp: serviceUp = "serviceUp".asInstanceOf[serviceUp]
}

