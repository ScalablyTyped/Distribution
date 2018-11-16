package typings
package mixpanelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object mixpanelLibStrings {
  @js.native
  sealed trait cookie extends js.Object
  
  @js.native
  sealed trait localStorage extends js.Object
  
  def cookie: cookie = "cookie".asInstanceOf[cookie]
  def localStorage: localStorage = "localStorage".asInstanceOf[localStorage]
}

