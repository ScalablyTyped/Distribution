package typings.officeUiFabricReact.iconTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IconType extends js.Object
@JSImport("office-ui-fabric-react/lib/components/Icon/Icon.types", "IconType")
@js.native
object IconType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IconType with Double] = js.native
  
  /**
    * Deprecated, use `default`.
    * @deprecated Use `default`.
    */
  @js.native
  sealed trait Default extends IconType
  /* 100000 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /**
    * Deprecated, use `image`.
    * @deprecated Use `image`.
    */
  @js.native
  sealed trait Image extends IconType
  /* 100001 */ @js.native
  object Image extends TopLevel[Image with Double]
  
  /**
    * Render using the fabric icon font.
    * @deprecated Icon type is inferred based on presence of `IIconProps.imageProps`
    */
  @js.native
  sealed trait default extends IconType
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /**
    * Render using an image, where imageProps would be used.
    * @deprecated Icon type is inferred based on presence of `IIconProps.imageProps`
    */
  @js.native
  sealed trait image extends IconType
  /* 1 */ @js.native
  object image extends TopLevel[image with Double]
}
