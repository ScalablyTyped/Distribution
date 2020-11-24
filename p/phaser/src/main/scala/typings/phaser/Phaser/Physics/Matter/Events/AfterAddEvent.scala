package typings.phaser.Phaser.Physics.Matter.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AfterAddEvent extends js.Object {
  
  /**
    * The name of the event.
    */
  var name: String = js.native
  
  /**
    * An array of the object(s) that have been added. May be a single body, constraint, composite or a mixture of these.
    */
  var `object`: js.Array[_] = js.native
  
  /**
    * The source object of the event.
    */
  var source: js.Any = js.native
}
object AfterAddEvent {
  
  @scala.inline
  def apply(name: String, `object`: js.Array[_], source: js.Any): AfterAddEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterAddEvent]
  }
  
  @scala.inline
  implicit class AfterAddEventOps[Self <: AfterAddEvent] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectVarargs(value: js.Any*): Self = this.set("object", js.Array(value :_*))
    
    @scala.inline
    def setObject(value: js.Array[_]): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: js.Any): Self = this.set("source", value.asInstanceOf[js.Any])
  }
}
