package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The scope for a variable.
  * @property name - The variable name.
  * @param name - The variable name.
  */
@js.native
trait ScopeId extends js.Object {
  
  /**
    * Get variable value.
    * @returns The value.
    */
  def getValue(): js.Any = js.native
  
  /**
    * The variable name.
    */
  var name: String = js.native
  
  /**
    * Set variable value.
    * @param value - The value.
    */
  def setValue(value: js.Any): Unit = js.native
}
object ScopeId {
  
  @scala.inline
  def apply(getValue: () => js.Any, name: String, setValue: js.Any => Unit): ScopeId = {
    val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction0(getValue), name = name.asInstanceOf[js.Any], setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[ScopeId]
  }
  
  @scala.inline
  implicit class ScopeIdOps[Self <: ScopeId] (val x: Self) extends AnyVal {
    
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
    def setGetValue(value: () => js.Any): Self = this.set("getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetValue(value: js.Any => Unit): Self = this.set("setValue", js.Any.fromFunction1(value))
  }
}
