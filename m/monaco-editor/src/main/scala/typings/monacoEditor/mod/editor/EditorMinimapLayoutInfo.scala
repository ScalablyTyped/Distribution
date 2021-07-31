package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorMinimapLayoutInfo extends StObject {
  
  val minimapCanvasInnerHeight: Double
  
  val minimapCanvasInnerWidth: Double
  
  val minimapCanvasOuterHeight: Double
  
  val minimapCanvasOuterWidth: Double
  
  val minimapHeightIsEditorHeight: Boolean
  
  val minimapIsSampling: Boolean
  
  val minimapLeft: Double
  
  val minimapLineHeight: Double
  
  val minimapScale: Double
  
  val minimapWidth: Double
  
  val renderMinimap: RenderMinimap
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
  implicit class EditorMinimapLayoutInfoMutableBuilder[Self <: EditorMinimapLayoutInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinimapCanvasInnerHeight(value: Double): Self = StObject.set(x, "minimapCanvasInnerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimapCanvasInnerWidth(value: Double): Self = StObject.set(x, "minimapCanvasInnerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimapCanvasOuterHeight(value: Double): Self = StObject.set(x, "minimapCanvasOuterHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimapCanvasOuterWidth(value: Double): Self = StObject.set(x, "minimapCanvasOuterWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimapHeightIsEditorHeight(value: Boolean): Self = StObject.set(x, "minimapHeightIsEditorHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimapIsSampling(value: Boolean): Self = StObject.set(x, "minimapIsSampling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimapLeft(value: Double): Self = StObject.set(x, "minimapLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimapLineHeight(value: Double): Self = StObject.set(x, "minimapLineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimapScale(value: Double): Self = StObject.set(x, "minimapScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimapWidth(value: Double): Self = StObject.set(x, "minimapWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderMinimap(value: RenderMinimap): Self = StObject.set(x, "renderMinimap", value.asInstanceOf[js.Any])
  }
}
