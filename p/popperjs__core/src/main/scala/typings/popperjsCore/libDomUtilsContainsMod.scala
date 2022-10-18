package typings.popperjsCore

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomUtilsContainsMod {
  
  @JSImport("@popperjs/core/lib/dom-utils/contains", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(parent: Element, child: Element): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
