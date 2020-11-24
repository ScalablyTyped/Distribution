package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorMinimapLayoutInfo extends js.Object {
  
  val minimapCanvasInnerHeight: Double = js.native
  
  val minimapCanvasInnerWidth: Double = js.native
  
  val minimapCanvasOuterHeight: Double = js.native
  
  val minimapCanvasOuterWidth: Double = js.native
  
  val minimapHeightIsEditorHeight: Boolean = js.native
  
  val minimapIsSampling: Boolean = js.native
  
  val minimapLeft: Double = js.native
  
  val minimapLineHeight: Double = js.native
  
  val minimapScale: Double = js.native
  
  val minimapWidth: Double = js.native
  
  val renderMinimap: RenderMinimap = js.native
}
object EditorMinimapLayoutInfo {
  
  @scala.inline
  def apply(
    minimapCanvasInnerHeight: Double,
    minimapCanvasInnerWidth: Double,
    minimapCanvasOuterHeight: Double,
    minimapCanvasOuterWidth: Double,
    minimapHeightIsEditorHeight: Boolean,
    minimapIsSampling: Boolean,
    minimapLeft: Double,
    minimapLineHeight: Double,
    minimapScale: Double,
    minimapWidth: Double,
    renderMinimap: RenderMinimap
  ): EditorMinimapLayoutInfo = {
    val __obj = js.Dynamic.literal(minimapCanvasInnerHeight = minimapCanvasInnerHeight.asInstanceOf[js.Any], minimapCanvasInnerWidth = minimapCanvasInnerWidth.asInstanceOf[js.Any], minimapCanvasOuterHeight = minimapCanvasOuterHeight.asInstanceOf[js.Any], minimapCanvasOuterWidth = minimapCanvasOuterWidth.asInstanceOf[js.Any], minimapHeightIsEditorHeight = minimapHeightIsEditorHeight.asInstanceOf[js.Any], minimapIsSampling = minimapIsSampling.asInstanceOf[js.Any], minimapLeft = minimapLeft.asInstanceOf[js.Any], minimapLineHeight = minimapLineHeight.asInstanceOf[js.Any], minimapScale = minimapScale.asInstanceOf[js.Any], minimapWidth = minimapWidth.asInstanceOf[js.Any], renderMinimap = renderMinimap.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorMinimapLayoutInfo]
  }
  
  @scala.inline
  implicit class EditorMinimapLayoutInfoOps[Self <: EditorMinimapLayoutInfo] (val x: Self) extends AnyVal {
    
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
    def setMinimapCanvasInnerHeight(value: Double): Self = this.set("minimapCanvasInnerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimapCanvasInnerWidth(value: Double): Self = this.set("minimapCanvasInnerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimapCanvasOuterHeight(value: Double): Self = this.set("minimapCanvasOuterHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimapCanvasOuterWidth(value: Double): Self = this.set("minimapCanvasOuterWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimapHeightIsEditorHeight(value: Boolean): Self = this.set("minimapHeightIsEditorHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimapIsSampling(value: Boolean): Self = this.set("minimapIsSampling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimapLeft(value: Double): Self = this.set("minimapLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimapLineHeight(value: Double): Self = this.set("minimapLineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimapScale(value: Double): Self = this.set("minimapScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimapWidth(value: Double): Self = this.set("minimapWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderMinimap(value: RenderMinimap): Self = this.set("renderMinimap", value.asInstanceOf[js.Any])
  }
}
