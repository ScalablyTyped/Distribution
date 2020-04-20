package typings.naverWhale

import typings.naverWhale.chrome.downloads.StateType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofdownloads extends js.Object {
  val State: StateType
}

object Typeofdownloads {
  @scala.inline
  def apply(State: StateType): Typeofdownloads = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofdownloads]
  }
}

