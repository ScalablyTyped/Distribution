package typings.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IconType extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Icon/Icon.types", "IconType")
@js.native
object IconType extends js.Object {
  /**
    * Deprecated, use `default`.
    * @deprecated Use `default`.
    */
  @js.native
  sealed trait Default extends IconType
  
  /**
    * Deprecated, use `image`.
    * @deprecated Use `image`.
    */
  @js.native
  sealed trait Image extends IconType
  
  /**
    * Render using the fabric icon font.
    * @deprecated Icon type is inferred based on presence of `IIconProps.imageProps`
    */
  @js.native
  sealed trait default extends IconType
  
  /**
    * Render using an image, where imageProps would be used.
    * @deprecated Icon type is inferred based on presence of `IIconProps.imageProps`
    */
  @js.native
  sealed trait image extends IconType
  
  /* 100000 */ val Default: typings.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod.IconType.Default with Double = js.native
  /* 100001 */ val Image: typings.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod.IconType.Image with Double = js.native
  /* 0 */ val default: typings.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod.IconType.default with Double = js.native
  /* 1 */ val image: typings.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod.IconType.image with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IconType with Double] = js.native
}

