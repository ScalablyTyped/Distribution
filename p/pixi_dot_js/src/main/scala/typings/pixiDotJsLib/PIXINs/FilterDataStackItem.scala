package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterDataStackItem extends js.Object {
  var bounds: Rectangle
  var filter: js.Array[_]
  var renderTarget: RenderTarget
}

object FilterDataStackItem {
  @scala.inline
  def apply(bounds: Rectangle, filter: js.Array[_], renderTarget: RenderTarget): FilterDataStackItem = {
    val __obj = js.Dynamic.literal(bounds = bounds, filter = filter, renderTarget = renderTarget)
  
    __obj.asInstanceOf[FilterDataStackItem]
  }
}

