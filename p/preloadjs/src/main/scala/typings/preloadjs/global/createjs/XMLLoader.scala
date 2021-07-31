package typings.preloadjs.global.createjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("createjs.XMLLoader")
@js.native
class XMLLoader protected ()
  extends StObject
     with typings.preloadjs.createjs.AbstractLoader {
  def this(loadItem: js.Object) = this()
}
/* static members */
object XMLLoader {
  
  @JSGlobal("createjs.XMLLoader")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def canLoadItem(item: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canLoadItem")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
