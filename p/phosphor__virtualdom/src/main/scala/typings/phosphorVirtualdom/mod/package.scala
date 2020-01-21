package typings.phosphorVirtualdom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ElementAttrs = typings.phosphorVirtualdom.mod.ElementBaseAttrs with typings.phosphorVirtualdom.mod.ElementEventAttrs with typings.phosphorVirtualdom.mod.ElementSpecialAttrs
  type ElementBaseAttrs = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ T in @phosphor/virtualdom.@phosphor/virtualdom.ElementAttrNames ]:? string}
    */ typings.phosphorVirtualdom.phosphorVirtualdomStrings.ElementBaseAttrs with js.Any
  type ElementDataset = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type ElementEventAttrs = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ T in keyof @phosphor/virtualdom.@phosphor/virtualdom.ElementEventMap ]:? (this : std.HTMLElement, event : @phosphor/virtualdom.@phosphor/virtualdom.ElementEventMap[T]): any}
    */ typings.phosphorVirtualdom.phosphorVirtualdomStrings.ElementEventAttrs with typings.phosphorVirtualdom.mod.ElementEventMap
  type ElementInlineStyle = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ T in @phosphor/virtualdom.@phosphor/virtualdom.CSSPropertyNames ]:? string}
    */ typings.phosphorVirtualdom.phosphorVirtualdomStrings.ElementInlineStyle with js.Any
}
