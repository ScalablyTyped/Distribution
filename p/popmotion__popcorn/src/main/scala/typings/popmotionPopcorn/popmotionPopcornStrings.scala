package typings.popmotionPopcorn

import typings.popmotionPopcorn.stepsMod.Direction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object popmotionPopcornStrings {
  @js.native
  sealed trait end extends Direction
  
  @js.native
  sealed trait start extends Direction
  
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
}

