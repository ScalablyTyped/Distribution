package typings
package officeDashUiDashFabricDashReactLib.libComponentsPanelPanelDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPanelHeaderRenderer
  extends atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IPanelProps] {
  /**
       * @param props Props given to the panel
       * @param defaultRender Default header renderer. If using this renderer in code that does not
       * assign `headerTextId` to an element elsewhere, it **must** be passed to this function.
       * @param headerTextId If provided, this **must** be used as the ID of an element containing the
       * panel's title, because the panel popup uses this ID as its aria-labelledby.
       */
  def apply(): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
  /**
       * @param props Props given to the panel
       * @param defaultRender Default header renderer. If using this renderer in code that does not
       * assign `headerTextId` to an element elsewhere, it **must** be passed to this function.
       * @param headerTextId If provided, this **must** be used as the ID of an element containing the
       * panel's title, because the panel popup uses this ID as its aria-labelledby.
       */
  def apply(props: IPanelProps): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
  /**
       * @param props Props given to the panel
       * @param defaultRender Default header renderer. If using this renderer in code that does not
       * assign `headerTextId` to an element elsewhere, it **must** be passed to this function.
       * @param headerTextId If provided, this **must** be used as the ID of an element containing the
       * panel's title, because the panel popup uses this ID as its aria-labelledby.
       */
  def apply(props: IPanelProps, defaultRender: IPanelHeaderRenderer): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
  /**
       * @param props Props given to the panel
       * @param defaultRender Default header renderer. If using this renderer in code that does not
       * assign `headerTextId` to an element elsewhere, it **must** be passed to this function.
       * @param headerTextId If provided, this **must** be used as the ID of an element containing the
       * panel's title, because the panel popup uses this ID as its aria-labelledby.
       */
  def apply(props: IPanelProps, defaultRender: IPanelHeaderRenderer, headerTextId: java.lang.String): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
}

