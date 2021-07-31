package typings.preloadjs.global.createjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("createjs.ManifestLoader")
@js.native
class ManifestLoader protected ()
  extends StObject
     with typings.preloadjs.createjs.AbstractLoader {
  def this(loadItem: js.Object) = this()
  def this(loadItem: typings.preloadjs.createjs.LoadItem) = this()
}
/* static members */
object ManifestLoader {
  
  @JSGlobal("createjs.ManifestLoader")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def canLoadItem(item: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canLoadItem")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  // methods
  @scala.inline
  def canLoadItem(item: typings.preloadjs.createjs.LoadItem): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canLoadItem")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
