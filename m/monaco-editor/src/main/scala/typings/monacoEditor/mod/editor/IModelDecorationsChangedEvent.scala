package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IModelDecorationsChangedEvent extends js.Object {
  
  val affectsMinimap: Boolean = js.native
  
  val affectsOverviewRuler: Boolean = js.native
}
object IModelDecorationsChangedEvent {
  
  @scala.inline
  def apply(affectsMinimap: Boolean, affectsOverviewRuler: Boolean): IModelDecorationsChangedEvent = {
    val __obj = js.Dynamic.literal(affectsMinimap = affectsMinimap.asInstanceOf[js.Any], affectsOverviewRuler = affectsOverviewRuler.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelDecorationsChangedEvent]
  }
  
  @scala.inline
  implicit class IModelDecorationsChangedEventOps[Self <: IModelDecorationsChangedEvent] (val x: Self) extends AnyVal {
    
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
    def setAffectsMinimap(value: Boolean): Self = this.set("affectsMinimap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAffectsOverviewRuler(value: Boolean): Self = this.set("affectsOverviewRuler", value.asInstanceOf[js.Any])
  }
}
