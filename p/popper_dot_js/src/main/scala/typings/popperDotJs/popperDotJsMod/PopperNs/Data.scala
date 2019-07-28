package typings.popperDotJs.popperDotJsMod.PopperNs

import typings.popperDotJs.Anon_Arrow
import typings.popperDotJs.popperDotJsMod.Popper
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
  var instance: Popper
  var offsets: Anon_Arrow
  var originalPlacement: typings.popperDotJs.popperDotJsMod.PopperNs.Placement
  var placement: typings.popperDotJs.popperDotJsMod.PopperNs.Placement
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
    instance: Popper,
    offsets: Anon_Arrow,
    originalPlacement: typings.popperDotJs.popperDotJsMod.PopperNs.Placement,
    placement: typings.popperDotJs.popperDotJsMod.PopperNs.Placement,
    styles: CSSStyleDeclaration
  ): Data = {
    val __obj = js.Dynamic.literal(arrowElement = arrowElement, arrowStyles = arrowStyles, attributes = attributes, boundaries = boundaries, flipped = flipped, hide = hide, instance = instance, offsets = offsets, originalPlacement = originalPlacement, placement = placement, styles = styles)
  
    __obj.asInstanceOf[Data]
  }
}

