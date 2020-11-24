package typings.nodeRedEditorClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ADDING extends js.Object {
  
  val ADDING: Double = js.native
  
  val DEFAULT: Double = js.native
  
  val EDITING: Double = js.native
  
  val EXPORT: Double = js.native
  
  val GROUP_DRAGGING: Double = js.native
  
  val GROUP_RESIZE: Double = js.native
  
  val IMPORT: Double = js.native
  
  val IMPORT_DRAGGING: Double = js.native
  
  val JOINING: Double = js.native
  
  val MOVING: Double = js.native
  
  val MOVING_ACTIVE: Double = js.native
  
  val PANNING: Double = js.native
  
  val QUICK_JOINING: Double = js.native
  
  val SELECTING_NODE: Double = js.native
}
object ADDING {
  
  @scala.inline
  def apply(
    ADDING: Double,
    DEFAULT: Double,
    EDITING: Double,
    EXPORT: Double,
    GROUP_DRAGGING: Double,
    GROUP_RESIZE: Double,
    IMPORT: Double,
    IMPORT_DRAGGING: Double,
    JOINING: Double,
    MOVING: Double,
    MOVING_ACTIVE: Double,
    PANNING: Double,
    QUICK_JOINING: Double,
    SELECTING_NODE: Double
  ): ADDING = {
    val __obj = js.Dynamic.literal(ADDING = ADDING.asInstanceOf[js.Any], DEFAULT = DEFAULT.asInstanceOf[js.Any], EDITING = EDITING.asInstanceOf[js.Any], EXPORT = EXPORT.asInstanceOf[js.Any], GROUP_DRAGGING = GROUP_DRAGGING.asInstanceOf[js.Any], GROUP_RESIZE = GROUP_RESIZE.asInstanceOf[js.Any], IMPORT = IMPORT.asInstanceOf[js.Any], IMPORT_DRAGGING = IMPORT_DRAGGING.asInstanceOf[js.Any], JOINING = JOINING.asInstanceOf[js.Any], MOVING = MOVING.asInstanceOf[js.Any], MOVING_ACTIVE = MOVING_ACTIVE.asInstanceOf[js.Any], PANNING = PANNING.asInstanceOf[js.Any], QUICK_JOINING = QUICK_JOINING.asInstanceOf[js.Any], SELECTING_NODE = SELECTING_NODE.asInstanceOf[js.Any])
    __obj.asInstanceOf[ADDING]
  }
  
  @scala.inline
  implicit class ADDINGOps[Self <: ADDING] (val x: Self) extends AnyVal {
    
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
    def setADDING(value: Double): Self = this.set("ADDING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDEFAULT(value: Double): Self = this.set("DEFAULT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEDITING(value: Double): Self = this.set("EDITING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEXPORT(value: Double): Self = this.set("EXPORT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGROUP_DRAGGING(value: Double): Self = this.set("GROUP_DRAGGING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGROUP_RESIZE(value: Double): Self = this.set("GROUP_RESIZE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIMPORT(value: Double): Self = this.set("IMPORT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIMPORT_DRAGGING(value: Double): Self = this.set("IMPORT_DRAGGING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJOINING(value: Double): Self = this.set("JOINING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMOVING(value: Double): Self = this.set("MOVING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMOVING_ACTIVE(value: Double): Self = this.set("MOVING_ACTIVE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPANNING(value: Double): Self = this.set("PANNING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUICK_JOINING(value: Double): Self = this.set("QUICK_JOINING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSELECTING_NODE(value: Double): Self = this.set("SELECTING_NODE", value.asInstanceOf[js.Any])
  }
}
