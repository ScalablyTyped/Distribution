package typings.node

import typings.node.readlineMod.Direction
import typings.node.v8Mod.DoesZapCodeSpaceFlag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nodeNumbers {
  @js.native
  sealed trait `-1`
    extends Direction
       with typings.node.ttyMod.Direction
  
  @js.native
  sealed trait `0`
    extends Direction
       with typings.node.ttyMod.Direction
       with DoesZapCodeSpaceFlag
  
  @js.native
  sealed trait `1`
    extends Direction
       with typings.node.ttyMod.Direction
       with DoesZapCodeSpaceFlag
  
  @js.native
  sealed trait `false` extends js.Object
  
  @js.native
  sealed trait `true` extends js.Object
  
  @scala.inline
  def `-1`: `-1` = -1.asInstanceOf[`-1`]
  @scala.inline
  def `0`: `0` = 0.asInstanceOf[`0`]
  @scala.inline
  def `1`: `1` = 1.asInstanceOf[`1`]
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

