package typings.popperjsCore

import typings.popperjsCore.popperjsCoreStrings.height
import typings.popperjsCore.popperjsCoreStrings.width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getAltLenMod {
  
  @JSImport("@popperjs/core/lib/utils/getAltLen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default_height(len: height): width | height = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(len.asInstanceOf[js.Any]).asInstanceOf[width | height]
  
  @scala.inline
  def default_width(len: width): width | height = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(len.asInstanceOf[js.Any]).asInstanceOf[width | height]
}
