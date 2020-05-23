package typings.pQueue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object pQueueStrings {
  @js.native
  sealed trait active extends js.Object
  
  @js.native
  sealed trait idle extends js.Object
  
  @scala.inline
  def active: active = "active".asInstanceOf[active]
  @scala.inline
  def idle: idle = "idle".asInstanceOf[idle]
}

