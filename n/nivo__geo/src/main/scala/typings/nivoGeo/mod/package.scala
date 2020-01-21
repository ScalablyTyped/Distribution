package typings.nivoGeo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ChoroplethEventHandler = js.Function2[
    /* feature */ typings.nivoGeo.mod.ChoroplethBoundFeature, 
    /* event */ typings.react.mod.MouseEvent[js.Any, typings.react.mod.NativeMouseEvent], 
    scala.Unit
  ]
  type ChoroplethProps = typings.nivoGeo.mod.ChoroplethCommonProps
  type ChoroplethTooltip = typings.react.mod.FunctionComponent[typings.nivoGeo.AnonFeatureChoroplethBoundFeature]
  type DatumMatcher = js.Function1[/* repeated */ js.Any, scala.Boolean]
  type FeatureAccessor[F, T] = js.Function1[/* feature */ F, T]
  type GeoMapEventHandler = js.Function2[
    /* feature */ js.Any, 
    /* event */ typings.react.mod.MouseEvent[js.Any, typings.react.mod.NativeMouseEvent], 
    scala.Unit
  ]
  type GeoMapProps = typings.nivoGeo.mod.GeoMapCommonProps
  type GeoMapTooltip = typings.react.mod.FunctionComponent[typings.nivoGeo.AnonFeature]
}
