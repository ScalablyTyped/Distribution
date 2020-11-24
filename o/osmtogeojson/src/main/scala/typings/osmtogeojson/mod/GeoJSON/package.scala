package typings.osmtogeojson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object GeoJSON {
  
  type Coordinate = typings.osmtogeojson.mod.GeoJSON.Coordinate2d | typings.osmtogeojson.mod.GeoJSON.Coordinate3d
  
  type Coordinate2d = js.Tuple2[scala.Double, scala.Double]
  
  type Coordinate3d = js.Tuple3[scala.Double, scala.Double, scala.Double]
}
