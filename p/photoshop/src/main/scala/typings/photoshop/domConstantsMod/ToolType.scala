package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ToolType extends StObject
@JSImport("photoshop/dom/Constants", "ToolType")
@js.native
object ToolType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ToolType & String] = js.native
  
  @js.native
  sealed trait ARTHISTORYBRUSH
    extends StObject
       with ToolType
  /* "artBrushTool" */ val ARTHISTORYBRUSH: typings.photoshop.domConstantsMod.ToolType.ARTHISTORYBRUSH & String = js.native
  
  @js.native
  sealed trait BACKGROUNDERASER
    extends StObject
       with ToolType
  /* "backgroundEraserTool" */ val BACKGROUNDERASER: typings.photoshop.domConstantsMod.ToolType.BACKGROUNDERASER & String = js.native
  
  @js.native
  sealed trait BLUR
    extends StObject
       with ToolType
  /* "blurTool" */ val BLUR: typings.photoshop.domConstantsMod.ToolType.BLUR & String = js.native
  
  @js.native
  sealed trait BRUSH
    extends StObject
       with ToolType
  /* "paintbrushTool" */ val BRUSH: typings.photoshop.domConstantsMod.ToolType.BRUSH & String = js.native
  
  @js.native
  sealed trait BURN
    extends StObject
       with ToolType
  /* "burnInTool" */ val BURN: typings.photoshop.domConstantsMod.ToolType.BURN & String = js.native
  
  @js.native
  sealed trait CLONESTAMP
    extends StObject
       with ToolType
  /* "cloneStampTool" */ val CLONESTAMP: typings.photoshop.domConstantsMod.ToolType.CLONESTAMP & String = js.native
  
  @js.native
  sealed trait COLORREPLACEMENTTOOL
    extends StObject
       with ToolType
  /* "colorReplacementBrushTool" */ val COLORREPLACEMENTTOOL: typings.photoshop.domConstantsMod.ToolType.COLORREPLACEMENTTOOL & String = js.native
  
  @js.native
  sealed trait DODGE
    extends StObject
       with ToolType
  /* "dodgeTool" */ val DODGE: typings.photoshop.domConstantsMod.ToolType.DODGE & String = js.native
  
  @js.native
  sealed trait ERASER
    extends StObject
       with ToolType
  /* "eraserTool" */ val ERASER: typings.photoshop.domConstantsMod.ToolType.ERASER & String = js.native
  
  @js.native
  sealed trait HEALINGBRUSH
    extends StObject
       with ToolType
  /* "magicStampTool" */ val HEALINGBRUSH: typings.photoshop.domConstantsMod.ToolType.HEALINGBRUSH & String = js.native
  
  @js.native
  sealed trait HISTORYBRUSH
    extends StObject
       with ToolType
  /* "historyBrushTool" */ val HISTORYBRUSH: typings.photoshop.domConstantsMod.ToolType.HISTORYBRUSH & String = js.native
  
  @js.native
  sealed trait PATTERNSTAMP
    extends StObject
       with ToolType
  /* "patternStampTool" */ val PATTERNSTAMP: typings.photoshop.domConstantsMod.ToolType.PATTERNSTAMP & String = js.native
  
  @js.native
  sealed trait PENCIL
    extends StObject
       with ToolType
  /* "pencilTool" */ val PENCIL: typings.photoshop.domConstantsMod.ToolType.PENCIL & String = js.native
  
  @js.native
  sealed trait SHARPEN
    extends StObject
       with ToolType
  /* "sharpenTool" */ val SHARPEN: typings.photoshop.domConstantsMod.ToolType.SHARPEN & String = js.native
  
  @js.native
  sealed trait SMUDGE
    extends StObject
       with ToolType
  /* "smudgeTool" */ val SMUDGE: typings.photoshop.domConstantsMod.ToolType.SMUDGE & String = js.native
  
  @js.native
  sealed trait SPONGE
    extends StObject
       with ToolType
  /* "saturationTool" */ val SPONGE: typings.photoshop.domConstantsMod.ToolType.SPONGE & String = js.native
}
