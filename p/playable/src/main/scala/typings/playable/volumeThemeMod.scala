package typings.playable

import typings.playable.anon.After
import typings.playable.anon.BackgroundColor
import typings.playable.anon.Fill
import typings.playable.anon.Stroke
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/ui/controls/volume/volume.theme", JSImport.Namespace)
@js.native
object volumeThemeMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    var volumeProgress: After = js.native
    
    var volumeProgressBackground: BackgroundColor = js.native
    
    var volumeSvgFill: Fill = js.native
    
    var volumeSvgStroke: Stroke = js.native
  }
}
