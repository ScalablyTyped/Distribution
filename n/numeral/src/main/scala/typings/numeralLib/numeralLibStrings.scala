package typings
package numeralLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object numeralLibStrings {
  @js.native
  sealed trait format extends RegisterType
  
  @js.native
  sealed trait locale extends RegisterType
  
  @scala.inline
  def format: format = "format".asInstanceOf[format]
  @scala.inline
  def locale: locale = "locale".asInstanceOf[locale]
}

