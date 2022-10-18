package typings.popperjsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomUtilsInstanceOfMod {
  
  @JSImport("@popperjs/core/lib/dom-utils/instanceOf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isElement(node: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isHTMLElement(node: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHTMLElement")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isShadowRoot(node: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isShadowRoot")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
