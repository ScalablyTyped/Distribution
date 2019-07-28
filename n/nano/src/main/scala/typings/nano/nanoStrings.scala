package typings.nano

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nanoStrings {
  @js.native
  sealed trait asc extends js.Object
  
  @js.native
  sealed trait continuous extends js.Object
  
  @js.native
  sealed trait desc extends js.Object
  
  @js.native
  sealed trait eventsource extends js.Object
  
  @js.native
  sealed trait longpoll extends js.Object
  
  @js.native
  sealed trait normal extends js.Object
  
  @js.native
  sealed trait ok extends js.Object
  
  @scala.inline
  def asc: asc = "asc".asInstanceOf[asc]
  @scala.inline
  def continuous: continuous = "continuous".asInstanceOf[continuous]
  @scala.inline
  def desc: desc = "desc".asInstanceOf[desc]
  @scala.inline
  def eventsource: eventsource = "eventsource".asInstanceOf[eventsource]
  @scala.inline
  def longpoll: longpoll = "longpoll".asInstanceOf[longpoll]
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  @scala.inline
  def ok: ok = "ok".asInstanceOf[ok]
}

