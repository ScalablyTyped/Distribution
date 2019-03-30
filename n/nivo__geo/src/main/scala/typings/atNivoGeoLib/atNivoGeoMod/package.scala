package typings
package atNivoGeoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoGeoMod {
  type ChoroplethEventHandler = js.Function2[
    /* feature */ ChoroplethBoundFeature, 
    /* event */ reactLib.reactMod.ReactNs.MouseEvent[js.Any, reactLib.NativeMouseEvent], 
    scala.Unit
  ]
  type ChoroplethProps = ChoroplethCommonProps
  type ChoroplethTooltip = reactLib.reactMod.ReactNs.FunctionComponent[atNivoGeoLib.Anon_FeatureChoroplethBoundFeature]
  type DatumMatcher = js.Function1[/* repeated */ js.Any, scala.Boolean]
  type FeatureAccessor[F, T] = js.Function1[/* feature */ F, T]
  type GeoMapEventHandler = js.Function2[
    /* feature */ js.Any, 
    /* event */ reactLib.reactMod.ReactNs.MouseEvent[js.Any, reactLib.NativeMouseEvent], 
    scala.Unit
  ]
  type GeoMapProps = GeoMapCommonProps
  type GeoMapTooltip = reactLib.reactMod.ReactNs.FunctionComponent[atNivoGeoLib.Anon_Feature]
}
