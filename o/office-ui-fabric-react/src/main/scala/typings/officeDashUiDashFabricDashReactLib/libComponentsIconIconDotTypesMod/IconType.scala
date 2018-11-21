package typings
package officeDashUiDashFabricDashReactLib.libComponentsIconIconDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IconType extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Icon/Icon.types", "IconType")
@js.native
object IconType extends js.Object {
  /**
       * Deprecated, use default.
       * @deprecated
       */
  @js.native
  sealed trait Default
    extends officeDashUiDashFabricDashReactLib.libComponentsIconIconDotTypesMod.IconType
  
  /**
       * Deprecated, use image.
       * @deprecated
       */
  @js.native
  sealed trait Image
    extends officeDashUiDashFabricDashReactLib.libComponentsIconIconDotTypesMod.IconType
  
  /**
       * Render using the fabric icon font.
       */
  @js.native
  sealed trait default
    extends officeDashUiDashFabricDashReactLib.libComponentsIconIconDotTypesMod.IconType
  
  /**
       * Render using an image, where imageProps would be used.
       */
  @js.native
  sealed trait image
    extends officeDashUiDashFabricDashReactLib.libComponentsIconIconDotTypesMod.IconType
  
  /* 100000 */ val Default: Default with scala.Double = js.native
  /* 100001 */ val Image: Image with scala.Double = js.native
  /* 0 */ val default: default with scala.Double = js.native
  /* 1 */ val image: image with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsIconIconDotTypesMod.IconType with scala.Double
  ] = js.native
}

