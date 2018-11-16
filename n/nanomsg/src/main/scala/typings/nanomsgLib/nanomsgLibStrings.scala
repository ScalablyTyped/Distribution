package typings
package nanomsgLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nanomsgLibStrings {
  @js.native
  sealed trait binary extends js.Object
  
  @js.native
  sealed trait text extends js.Object
  
  def binary: binary = "binary".asInstanceOf[binary]
  def text: text = "text".asInstanceOf[text]
}

