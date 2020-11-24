package typings.playable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object tooltipTypesMod {
  
  type ITooltipPositionFunction = js.Function1[
    /* tooltipContainerElement */ typings.std.HTMLElement, 
    typings.playable.tooltipTypesMod.ITooltipPosition
  ]
}
