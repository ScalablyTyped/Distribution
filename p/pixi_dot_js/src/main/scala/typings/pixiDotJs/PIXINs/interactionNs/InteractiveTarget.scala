package typings.pixiDotJs.PIXINs.interactionNs

import org.scalablytyped.runtime.NumberDictionary
import typings.pixiDotJs.PIXINs.Circle
import typings.pixiDotJs.PIXINs.Ellipse
import typings.pixiDotJs.PIXINs.HitArea
import typings.pixiDotJs.PIXINs.Polygon
import typings.pixiDotJs.PIXINs.Rectangle
import typings.pixiDotJs.PIXINs.RoundedRectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractiveTarget extends js.Object {
  var buttonMode: Boolean
  var cursor: String
  // Deprecated
  var defaultCursor: String
  var hitArea: Rectangle | Circle | Ellipse | Polygon | RoundedRectangle | HitArea
  var interactive: Boolean
  var interactiveChildren: Boolean
  var trackedPointers: NumberDictionary[InteractionTrackingData]
}

object InteractiveTarget {
  @scala.inline
  def apply(
    buttonMode: Boolean,
    cursor: String,
    defaultCursor: String,
    hitArea: Rectangle | Circle | Ellipse | Polygon | RoundedRectangle | HitArea,
    interactive: Boolean,
    interactiveChildren: Boolean,
    trackedPointers: NumberDictionary[InteractionTrackingData]
  ): InteractiveTarget = {
    val __obj = js.Dynamic.literal(buttonMode = buttonMode, cursor = cursor, defaultCursor = defaultCursor, hitArea = hitArea.asInstanceOf[js.Any], interactive = interactive, interactiveChildren = interactiveChildren, trackedPointers = trackedPointers)
  
    __obj.asInstanceOf[InteractiveTarget]
  }
}

