package typings.popperJs.mod.Popper

import typings.popperJs.anon.Arrow
import typings.std.CSSStyleDeclaration
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var arrowElement: Element
  var arrowStyles: CSSStyleDeclaration
  var attributes: Attributes
  var boundaries: js.Object
  var flipped: Boolean
  var hide: Boolean
  var instance: typings.popperJs.mod.Popper
  var offsets: Arrow
  var originalPlacement: Placement
  var placement: Placement
  var styles: CSSStyleDeclaration
}

object Data {
  @scala.inline
  def apply(
    arrowElement: Element,
    arrowStyles: CSSStyleDeclaration,
    attributes: Attributes,
    boundaries: js.Object,
    flipped: Boolean,
    hide: Boolean,
    instance: typings.popperJs.mod.Popper,
    offsets: Arrow,
    originalPlacement: Placement,
    placement: Placement,
    styles: CSSStyleDeclaration
  ): Data = {
    val __obj = js.Dynamic.literal(arrowElement = arrowElement.asInstanceOf[js.Any], arrowStyles = arrowStyles.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], boundaries = boundaries.asInstanceOf[js.Any], flipped = flipped.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], offsets = offsets.asInstanceOf[js.Any], originalPlacement = originalPlacement.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

