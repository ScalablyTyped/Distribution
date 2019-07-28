package typings.numeral

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object numeralStrings {
  @js.native
  sealed trait format extends RegisterType
  
  @js.native
  sealed trait locale extends RegisterType
  
  @scala.inline
  def format: format = "format".asInstanceOf[format]
  @scala.inline
  def locale: locale = "locale".asInstanceOf[locale]
}

