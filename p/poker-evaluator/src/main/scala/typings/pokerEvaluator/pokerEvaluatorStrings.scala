package typings.pokerEvaluator

import typings.pokerEvaluator.mod.HandName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pokerEvaluatorStrings {
  
  @scala.inline
  def flush: flush = "flush".asInstanceOf[flush]
  
  @scala.inline
  def `four of a kind`: `four of a kind` = ("four of a kind").asInstanceOf[`four of a kind`]
  
  @scala.inline
  def `full house`: `full house` = ("full house").asInstanceOf[`full house`]
  
  @scala.inline
  def `high card`: `high card` = ("high card").asInstanceOf[`high card`]
  
  @scala.inline
  def `invalid hand`: `invalid hand` = ("invalid hand").asInstanceOf[`invalid hand`]
  
  @scala.inline
  def `one pair`: `one pair` = ("one pair").asInstanceOf[`one pair`]
  
  @scala.inline
  def straight: straight = "straight".asInstanceOf[straight]
  
  @scala.inline
  def `straight flush`: `straight flush` = ("straight flush").asInstanceOf[`straight flush`]
  
  @scala.inline
  def `three of a kind`: `three of a kind` = ("three of a kind").asInstanceOf[`three of a kind`]
  
  @scala.inline
  def `two pairs`: `two pairs` = ("two pairs").asInstanceOf[`two pairs`]
  
  @js.native
  sealed trait flush extends HandName
  
  @js.native
  sealed trait `four of a kind` extends HandName
  
  @js.native
  sealed trait `full house` extends HandName
  
  @js.native
  sealed trait `high card` extends HandName
  
  @js.native
  sealed trait `invalid hand` extends HandName
  
  @js.native
  sealed trait `one pair` extends HandName
  
  @js.native
  sealed trait straight extends HandName
  
  @js.native
  sealed trait `straight flush` extends HandName
  
  @js.native
  sealed trait `three of a kind` extends HandName
  
  @js.native
  sealed trait `two pairs` extends HandName
}
