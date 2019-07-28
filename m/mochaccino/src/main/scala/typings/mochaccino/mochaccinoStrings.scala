package typings.mochaccino

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object mochaccinoStrings {
  @js.native
  sealed trait document extends js.Object
  
  @js.native
  sealed trait navigator extends js.Object
  
  @js.native
  sealed trait window extends js.Object
  
  @scala.inline
  def document: document = "document".asInstanceOf[document]
  @scala.inline
  def navigator: navigator = "navigator".asInstanceOf[navigator]
  @scala.inline
  def window: window = "window".asInstanceOf[window]
}

