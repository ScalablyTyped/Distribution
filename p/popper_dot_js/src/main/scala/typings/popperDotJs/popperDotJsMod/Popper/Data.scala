package typings.popperDotJs.popperDotJsMod.Popper

import typings.popperDotJs.Anon_Arrow
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
  var instance: typings.popperDotJs.popperDotJsMod.Popper
  var offsets: Anon_Arrow
  var originalPlacement: typings.popperDotJs.popperDotJsMod.Popper.Placement
  var placement: typings.popperDotJs.popperDotJsMod.Popper.Placement
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
    instance: typings.popperDotJs.popperDotJsMod.Popper,
    offsets: Anon_Arrow,
    originalPlacement: typings.popperDotJs.popperDotJsMod.Popper.Placement,
    placement: typings.popperDotJs.popperDotJsMod.Popper.Placement,
    styles: CSSStyleDeclaration
  ): Data = {
    val __obj = js.Dynamic.literal(arrowElement = arrowElement, arrowStyles = arrowStyles, attributes = attributes, boundaries = boundaries, flipped = flipped, hide = hide, instance = instance, offsets = offsets, originalPlacement = originalPlacement, placement = placement, styles = styles)
  
    __obj.asInstanceOf[Data]
  }
}

