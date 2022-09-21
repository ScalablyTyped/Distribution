package typings.mdastUtilToHast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object footerMod {
  
  @JSImport("mdast-util-to-hast/lib/footer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def footer(h: H): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("footer")(h.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  type Element = typings.hast.mod.Element
  
  type ElementContent = typings.hast.mod.ElementContent
  
  type H = typings.mdastUtilToHast.libMod.H
}
