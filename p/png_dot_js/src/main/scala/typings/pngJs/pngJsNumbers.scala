package typings.pngJs

import typings.pngJs.mod.BitDepth
import typings.pngJs.mod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object pngJsNumbers {
  @js.native
  sealed trait `0` extends ColorType
  
  @js.native
  sealed trait `1` extends js.Object
  
  @js.native
  sealed trait `16` extends BitDepth
  
  @js.native
  sealed trait `2`
    extends BitDepth
       with ColorType
  
  @js.native
  sealed trait `3` extends ColorType
  
  @js.native
  sealed trait `4`
    extends BitDepth
       with ColorType
  
  @js.native
  sealed trait `6` extends ColorType
  
  @js.native
  sealed trait `8` extends BitDepth
  
  @scala.inline
  def `0`: `0` = 0.asInstanceOf[`0`]
  @scala.inline
  def `1`: `1` = 1.asInstanceOf[`1`]
  @scala.inline
  def `16`: `16` = 16.asInstanceOf[`16`]
  @scala.inline
  def `2`: `2` = 2.asInstanceOf[`2`]
  @scala.inline
  def `3`: `3` = 3.asInstanceOf[`3`]
  @scala.inline
  def `4`: `4` = 4.asInstanceOf[`4`]
  @scala.inline
  def `6`: `6` = 6.asInstanceOf[`6`]
  @scala.inline
  def `8`: `8` = 8.asInstanceOf[`8`]
}

