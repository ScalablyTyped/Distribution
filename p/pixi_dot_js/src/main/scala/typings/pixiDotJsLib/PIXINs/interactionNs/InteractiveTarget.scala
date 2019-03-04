package typings
package pixiDotJsLib.PIXINs.interactionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractiveTarget extends js.Object {
  var buttonMode: scala.Boolean
  var cursor: java.lang.String
  // Deprecated
  var defaultCursor: java.lang.String
  var hitArea: pixiDotJsLib.PIXINs.Rectangle | pixiDotJsLib.PIXINs.Circle | pixiDotJsLib.PIXINs.Ellipse | pixiDotJsLib.PIXINs.Polygon | pixiDotJsLib.PIXINs.RoundedRectangle | pixiDotJsLib.PIXINs.HitArea
  var interactive: scala.Boolean
  var interactiveChildren: scala.Boolean
  var trackedPointers: org.scalablytyped.runtime.NumberDictionary[InteractionTrackingData]
}

object InteractiveTarget {
  @scala.inline
  def apply(
    buttonMode: scala.Boolean,
    cursor: java.lang.String,
    defaultCursor: java.lang.String,
    hitArea: pixiDotJsLib.PIXINs.Rectangle | pixiDotJsLib.PIXINs.Circle | pixiDotJsLib.PIXINs.Ellipse | pixiDotJsLib.PIXINs.Polygon | pixiDotJsLib.PIXINs.RoundedRectangle | pixiDotJsLib.PIXINs.HitArea,
    interactive: scala.Boolean,
    interactiveChildren: scala.Boolean,
    trackedPointers: org.scalablytyped.runtime.NumberDictionary[InteractionTrackingData]
  ): InteractiveTarget = {
    val __obj = js.Dynamic.literal(buttonMode = buttonMode, cursor = cursor, defaultCursor = defaultCursor, hitArea = hitArea.asInstanceOf[js.Any], interactive = interactive, interactiveChildren = interactiveChildren, trackedPointers = trackedPointers)
  
    __obj.asInstanceOf[InteractiveTarget]
  }
}

