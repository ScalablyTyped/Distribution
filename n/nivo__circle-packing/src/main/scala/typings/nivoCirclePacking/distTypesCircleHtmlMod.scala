package typings.nivoCirclePacking

import typings.nivoCirclePacking.distTypesTypesMod.CircleProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCircleHtmlMod {
  
  @JSImport("@nivo/circle-packing/dist/types/CircleHtml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CircleHtml[RawDatum](param0: CircleProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CircleHtml")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def interpolateBorderWidth(
    borderWidth: Double,
    radiusValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Interpolation<number> */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateBorderWidth")(borderWidth.asInstanceOf[js.Any], radiusValue.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def interpolatePosition(
    positionValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any,
    radiusValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Interpolation<number> */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolatePosition")(positionValue.asInstanceOf[js.Any], radiusValue.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def interpolateSize(
    radiusValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Interpolation<number> */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("interpolateSize")(radiusValue.asInstanceOf[js.Any]).asInstanceOf[Any]
}
