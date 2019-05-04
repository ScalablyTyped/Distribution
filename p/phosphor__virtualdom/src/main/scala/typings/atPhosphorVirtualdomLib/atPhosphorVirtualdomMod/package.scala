package typings
package atPhosphorVirtualdomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atPhosphorVirtualdomMod {
  type ElementAttrs = ElementBaseAttrs with ElementEventAttrs with ElementSpecialAttrs
  type ElementBaseAttrs = /* import warning: ImportType.apply c Unsupported type mapping: 
  {readonly [ T in @phosphor/virtualdom.@phosphor/virtualdom.ElementAttrNames ]:? string}
    */ atPhosphorVirtualdomLib.atPhosphorVirtualdomLibStrings.ElementBaseAttrs with js.Any
  type ElementDataset = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type ElementEventAttrs = /* import warning: ImportType.apply c Unsupported type mapping: 
  {readonly [ T in keyof @phosphor/virtualdom.@phosphor/virtualdom.ElementEventMap ]:? (this : std.HTMLElement, event : @phosphor/virtualdom.@phosphor/virtualdom.ElementEventMap[T]): any}
    */ atPhosphorVirtualdomLib.atPhosphorVirtualdomLibStrings.ElementEventAttrs with ElementEventMap
  type ElementInlineStyle = /* import warning: ImportType.apply c Unsupported type mapping: 
  {readonly [ T in @phosphor/virtualdom.@phosphor/virtualdom.CSSPropertyNames ]:? string}
    */ atPhosphorVirtualdomLib.atPhosphorVirtualdomLibStrings.ElementInlineStyle with js.Any
}
