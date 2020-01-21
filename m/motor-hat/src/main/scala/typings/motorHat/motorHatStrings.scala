package typings.motorHat

import typings.motorHat.mod.Direction
import typings.motorHat.mod.Motor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object motorHatStrings {
  @js.native
  sealed trait M1 extends Motor
  
  @js.native
  sealed trait M2 extends Motor
  
  @js.native
  sealed trait M3 extends Motor
  
  @js.native
  sealed trait M4 extends Motor
  
  @js.native
  sealed trait back extends Direction
  
  @js.native
  sealed trait double extends js.Object
  
  @js.native
  sealed trait fwd extends Direction
  
  @js.native
  sealed trait interleaved extends js.Object
  
  @js.native
  sealed trait microstep extends js.Object
  
  @js.native
  sealed trait single extends js.Object
  
  @scala.inline
  def M1: M1 = "M1".asInstanceOf[M1]
  @scala.inline
  def M2: M2 = "M2".asInstanceOf[M2]
  @scala.inline
  def M3: M3 = "M3".asInstanceOf[M3]
  @scala.inline
  def M4: M4 = "M4".asInstanceOf[M4]
  @scala.inline
  def back: back = "back".asInstanceOf[back]
  @scala.inline
  def double: double = "double".asInstanceOf[double]
  @scala.inline
  def fwd: fwd = "fwd".asInstanceOf[fwd]
  @scala.inline
  def interleaved: interleaved = "interleaved".asInstanceOf[interleaved]
  @scala.inline
  def microstep: microstep = "microstep".asInstanceOf[microstep]
  @scala.inline
  def single: single = "single".asInstanceOf[single]
}

