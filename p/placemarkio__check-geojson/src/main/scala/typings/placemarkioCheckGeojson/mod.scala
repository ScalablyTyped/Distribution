package typings.placemarkioCheckGeojson

import typings.geojson.mod.GeoJSON
import typings.placemarkioCheckGeojson.anon.Rejected
import typings.placemarkioCheckGeojson.typesMod.HintIssue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@placemarkio/check-geojson", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@placemarkio/check-geojson", "HintError")
  @js.native
  open class HintError protected ()
    extends typings.placemarkioCheckGeojson.errorsMod.HintError {
    def this(issues: js.Array[HintIssue]) = this()
  }
  
  inline def check(jsonStr: String): GeoJSON = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(jsonStr.asInstanceOf[js.Any]).asInstanceOf[GeoJSON]
  
  inline def getIssues(jsonStr: String): js.Array[HintIssue] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIssues")(jsonStr.asInstanceOf[js.Any]).asInstanceOf[js.Array[HintIssue]]
  
  inline def scavenge(jsonStr: String): Rejected = ^.asInstanceOf[js.Dynamic].applyDynamic("scavenge")(jsonStr.asInstanceOf[js.Any]).asInstanceOf[Rejected]
}
