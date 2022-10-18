package typings.officeUiFabricReact.libIndexDotbundleMod

import typings.officeUiFabricReact.officeUiFabricReactInts.`0`
import typings.officeUiFabricReact.officeUiFabricReactInts.`1`
import typings.officeUiFabricReact.officeUiFabricReactInts.`2`
import typings.officeUiFabricReact.officeUiFabricReactInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScrollToMode {
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "ScrollToMode")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Does not make any consideration to where in the viewport the item should align to.
    */
  @JSImport("office-ui-fabric-react/lib/index.bundle", "ScrollToMode.auto")
  @js.native
  def auto: `0` = js.native
  inline def auto_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("auto")(x.asInstanceOf[js.Any])
  
  /**
    * Attempts to scroll the list so the bottom of the desired item is aligned with the bottom of the viewport.
    */
  @JSImport("office-ui-fabric-react/lib/index.bundle", "ScrollToMode.bottom")
  @js.native
  def bottom: `2` = js.native
  inline def bottom_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottom")(x.asInstanceOf[js.Any])
  
  /**
    * Attempts to scroll the list so the desired item is in the exact center of the viewport.
    */
  @JSImport("office-ui-fabric-react/lib/index.bundle", "ScrollToMode.center")
  @js.native
  def center: `3` = js.native
  inline def center_=(x: `3`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("center")(x.asInstanceOf[js.Any])
  
  /**
    * Attempts to scroll the list so the top of the desired item is aligned with the top of the viewport.
    */
  @JSImport("office-ui-fabric-react/lib/index.bundle", "ScrollToMode.top")
  @js.native
  def top: `1` = js.native
  inline def top_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("top")(x.asInstanceOf[js.Any])
}
