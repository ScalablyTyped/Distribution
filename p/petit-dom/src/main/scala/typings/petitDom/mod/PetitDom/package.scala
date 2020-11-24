package typings.petitDom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object PetitDom {
  
  type ComponentProps = js.Object
  
  type Content = java.lang.String | typings.petitDom.mod.PetitDom.VNode
  
  type DOMElementProps[E /* <: typings.std.Element */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof E ]:? E[P]}
    */ typings.petitDom.petitDomStrings.DOMElementProps with org.scalablytyped.runtime.TopLevel[E]
  
  type Key = java.lang.String | scala.Double
  
  type Props[E /* <: typings.std.Element */] = typings.petitDom.mod.PetitDom.IntrinsicProps with typings.petitDom.mod.PetitDom.DOMElementProps[E]
  
  type ShouldUpdate[P /* <: typings.petitDom.mod.PetitDom.ComponentProps */] = js.Function4[
    /* newProps */ P, 
    /* oldProps */ P, 
    /* newContent */ js.Array[typings.petitDom.mod.PetitDom.VNode], 
    /* oldContent */ js.Array[typings.petitDom.mod.PetitDom.VNode], 
    scala.Boolean
  ]
}
