package typings.onoff

import typings.onoff.mod.Direction
import typings.onoff.mod.Edge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onoffStrings {
  
  @scala.inline
  def both: both = "both".asInstanceOf[both]
  
  @scala.inline
  def falling: falling = "falling".asInstanceOf[falling]
  
  @scala.inline
  def high: high = "high".asInstanceOf[high]
  
  @scala.inline
  def in: in = "in".asInstanceOf[in]
  
  @scala.inline
  def low: low = "low".asInstanceOf[low]
  
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @scala.inline
  def out: out = "out".asInstanceOf[out]
  
  @scala.inline
  def rising: rising = "rising".asInstanceOf[rising]
  
  @js.native
  sealed trait both extends Edge
  
  @js.native
  sealed trait falling extends Edge
  
  @js.native
  sealed trait high extends Direction
  
  @js.native
  sealed trait in extends Direction
  
  @js.native
  sealed trait low extends Direction
  
  @js.native
  sealed trait none extends Edge
  
  @js.native
  sealed trait out extends Direction
  
  @js.native
  sealed trait rising extends Edge
}
