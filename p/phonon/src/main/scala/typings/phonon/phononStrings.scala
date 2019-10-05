package typings.phonon

import typings.phonon.Phonon.PhononAjaxErrorFlag
import typings.phonon.Phonon.PhononColor
import typings.phonon.Phonon.PhononPopoverDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object phononStrings {
  @js.native
  sealed trait JSON_MALFORMED extends PhononAjaxErrorFlag
  
  @js.native
  sealed trait NO_INTERNET_ACCESS extends PhononAjaxErrorFlag
  
  @js.native
  sealed trait REQUEST_CANCELED extends PhononAjaxErrorFlag
  
  @js.native
  sealed trait TIMEOUT_EXCEEDED extends PhononAjaxErrorFlag
  
  @js.native
  sealed trait XMLHTTPREQUEST_UNAVAILABLE extends PhononAjaxErrorFlag
  
  @js.native
  sealed trait left extends PhononPopoverDirection
  
  @js.native
  sealed trait negative extends PhononColor
  
  @js.native
  sealed trait positive extends PhononColor
  
  @js.native
  sealed trait right extends PhononPopoverDirection
  
  @js.native
  sealed trait title extends PhononPopoverDirection
  
  @js.native
  sealed trait `title-left` extends PhononPopoverDirection
  
  @scala.inline
  def JSON_MALFORMED: JSON_MALFORMED = "JSON_MALFORMED".asInstanceOf[JSON_MALFORMED]
  @scala.inline
  def NO_INTERNET_ACCESS: NO_INTERNET_ACCESS = "NO_INTERNET_ACCESS".asInstanceOf[NO_INTERNET_ACCESS]
  @scala.inline
  def REQUEST_CANCELED: REQUEST_CANCELED = "REQUEST_CANCELED".asInstanceOf[REQUEST_CANCELED]
  @scala.inline
  def TIMEOUT_EXCEEDED: TIMEOUT_EXCEEDED = "TIMEOUT_EXCEEDED".asInstanceOf[TIMEOUT_EXCEEDED]
  @scala.inline
  def XMLHTTPREQUEST_UNAVAILABLE: XMLHTTPREQUEST_UNAVAILABLE = "XMLHTTPREQUEST_UNAVAILABLE".asInstanceOf[XMLHTTPREQUEST_UNAVAILABLE]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def negative: negative = "negative".asInstanceOf[negative]
  @scala.inline
  def positive: positive = "positive".asInstanceOf[positive]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def title: title = "title".asInstanceOf[title]
  @scala.inline
  def `title-left`: `title-left` = "title-left".asInstanceOf[`title-left`]
}

