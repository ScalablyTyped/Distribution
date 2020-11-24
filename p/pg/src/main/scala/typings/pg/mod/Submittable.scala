package typings.pg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Submittable extends js.Object {
  
  def submit(connection: Connection): Unit = js.native
}
object Submittable {
  
  @scala.inline
  def apply(submit: Connection => Unit): Submittable = {
    val __obj = js.Dynamic.literal(submit = js.Any.fromFunction1(submit))
    __obj.asInstanceOf[Submittable]
  }
  
  @scala.inline
  implicit class SubmittableOps[Self <: Submittable] (val x: Self) extends AnyVal {
    
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
    def setSubmit(value: Connection => Unit): Self = this.set("submit", js.Any.fromFunction1(value))
  }
}
