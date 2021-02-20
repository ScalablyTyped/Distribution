package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IModelDecorationOverviewRulerOptions extends IDecorationOptions {
  
  /**
    * The position in the overview ruler.
    */
  var position: OverviewRulerLane = js.native
}
object IModelDecorationOverviewRulerOptions {
  
  @scala.inline
  def apply(position: OverviewRulerLane): IModelDecorationOverviewRulerOptions = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelDecorationOverviewRulerOptions]
  }
  
  @scala.inline
  implicit class IModelDecorationOverviewRulerOptionsMutableBuilder[Self <: IModelDecorationOverviewRulerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: OverviewRulerLane): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
