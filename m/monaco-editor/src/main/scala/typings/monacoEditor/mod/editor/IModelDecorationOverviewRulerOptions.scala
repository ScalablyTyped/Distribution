package typings.monacoEditor.mod.editor

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
  implicit class IModelDecorationOverviewRulerOptionsOps[Self <: IModelDecorationOverviewRulerOptions] (val x: Self) extends AnyVal {
    
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
    def setPosition(value: OverviewRulerLane): Self = this.set("position", value.asInstanceOf[js.Any])
  }
}
