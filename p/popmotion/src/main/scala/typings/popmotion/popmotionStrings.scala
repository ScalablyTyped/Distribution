package typings.popmotion

import typings.popmotion.stepsMod.Direction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popmotionStrings {
  
  @scala.inline
  def decay: decay = "decay".asInstanceOf[decay]
  
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @scala.inline
  def keyframes: keyframes = "keyframes".asInstanceOf[keyframes]
  
  @scala.inline
  def loop: loop = "loop".asInstanceOf[loop]
  
  @scala.inline
  def mirror: mirror = "mirror".asInstanceOf[mirror]
  
  @scala.inline
  def reverse: reverse = "reverse".asInstanceOf[reverse]
  
  @scala.inline
  def spring: spring = "spring".asInstanceOf[spring]
  
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait decay extends js.Object
  
  @js.native
  sealed trait end extends Direction
  
  @js.native
  sealed trait keyframes extends js.Object
  
  @js.native
  sealed trait loop extends js.Object
  
  @js.native
  sealed trait mirror extends js.Object
  
  @js.native
  sealed trait reverse extends js.Object
  
  @js.native
  sealed trait spring extends js.Object
  
  @js.native
  sealed trait start extends Direction
}
