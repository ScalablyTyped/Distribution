package typings
package mjmlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object mjmlLibStrings {
  @js.native
  sealed trait skip extends js.Object
  
  @js.native
  sealed trait soft extends js.Object
  
  @js.native
  sealed trait strict extends js.Object
  
  def skip: skip = "skip".asInstanceOf[skip]
  def soft: soft = "soft".asInstanceOf[soft]
  def strict: strict = "strict".asInstanceOf[strict]
}

