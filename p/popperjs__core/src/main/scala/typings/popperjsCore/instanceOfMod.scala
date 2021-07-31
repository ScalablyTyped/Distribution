package typings.popperjsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instanceOfMod {
  
  @JSImport("@popperjs/core/lib/dom-utils/instanceOf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isElement(node: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isHTMLElement(node: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHTMLElement")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isShadowRoot(node: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isShadowRoot")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
