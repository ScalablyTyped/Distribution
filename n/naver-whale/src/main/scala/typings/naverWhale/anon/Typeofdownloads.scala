package typings.naverWhale.anon

import typings.naverWhale.chrome.downloads.StateType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofdownloads extends js.Object {
  
  val State: StateType = js.native
}
object Typeofdownloads {
  
  @scala.inline
  def apply(State: StateType): Typeofdownloads = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofdownloads]
  }
  
  @scala.inline
  implicit class TypeofdownloadsOps[Self <: Typeofdownloads] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setState(value: StateType): Self = this.set("State", value.asInstanceOf[js.Any])
  }
}
