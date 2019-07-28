package typings.atNivoGeo

import typings.atNivoGeo.Anon_Feature
import typings.atNivoGeo.Anon_FeatureChoroplethBoundFeature
import typings.react.NativeMouseEvent
import typings.react.reactMod.FunctionComponent
import typings.react.reactMod.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoGeoMod {
  type ChoroplethEventHandler = js.Function2[
    /* feature */ ChoroplethBoundFeature, 
    /* event */ MouseEvent[js.Any, NativeMouseEvent], 
    Unit
  ]
  type ChoroplethProps = ChoroplethCommonProps
  type ChoroplethTooltip = FunctionComponent[Anon_FeatureChoroplethBoundFeature]
  type DatumMatcher = js.Function1[/* repeated */ js.Any, Boolean]
  type FeatureAccessor[F, T] = js.Function1[/* feature */ F, T]
  type GeoMapEventHandler = js.Function2[/* feature */ js.Any, /* event */ MouseEvent[js.Any, NativeMouseEvent], Unit]
  type GeoMapProps = GeoMapCommonProps
  type GeoMapTooltip = FunctionComponent[Anon_Feature]
}
