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
  /**
    * If enabled, the mouse cursor use the pointer behavior when hovered over the displayObject if it is interactive
    * Setting this changes the "cursor" property to `"pointer"`.
    *
    * @example
    * const sprite = new PIXI.Sprite(texture);
    * sprite.interactive = true;
    * sprite.buttonMode = true;
    */
  var buttonMode: Boolean
  /**
    * This defines what cursor mode is used when the mouse cursor
    * is hovered over the displayObject.
    * @example
    * const sprite = new PIXI.Sprite(texture);
    * sprite.interactive = true;
    * sprite.cursor = "wait";
    * @see https://developer.mozilla.org/en/docs/Web/CSS/cursor
    */
  var cursor: String
  /** @deprecated */
  var defaultCursor: String
  /**
    * Interaction shape. Children will be hit first, then this shape will be checked.
    * Setting this will cause this shape to be checked in hit tests rather than the displayObject"s bounds.
    * @example
    * const sprite = new PIXI.Sprite(texture);
    * sprite.interactive = true;
    * sprite.hitArea = new PIXI.Rectangle(0, 0, 100, 100);
    */
  var hitArea: Rectangle | Circle | Ellipse | Polygon | RoundedRectangle | HitArea
  /**
    * Enable interaction events for the DisplayObject. Touch, pointer and mouse
    * events will not be emitted unless `interactive` is set to `true`.
    *
    * @example
    * const sprite = new PIXI.Sprite(texture);
    * sprite.interactive = true;
    * sprite.on("tap", (event) => {
    *    //handle event
    * });
    */
  var interactive: Boolean
  /**
    * Determines if the children to the displayObject can be clicked/touched
    * Setting this to false allows PixiJS to bypass a recursive `hitTest` function
    */
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

