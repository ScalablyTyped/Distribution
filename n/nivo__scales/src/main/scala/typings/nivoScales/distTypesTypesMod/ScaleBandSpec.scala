package typings.nivoScales.distTypesTypesMod

import typings.nivoScales.nivoScalesStrings.band
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleBandSpec extends StObject {
  
  var round: js.UndefOr[Boolean] = js.undefined
  
  var `type`: band
}
object ScaleBandSpec {
  
  inline def apply(): ScaleBandSpec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("band")
    __obj.asInstanceOf[ScaleBandSpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScaleBandSpec] (val x: Self) extends AnyVal {
    
    inline def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
    
    inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
    
    inline def setType(value: band): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
