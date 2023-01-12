package typings.navermaps.naver.maps.Service

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Region extends StObject {
  
  var addition0: Addition
  
  var addition1: Addition
  
  var addition2: Addition
  
  var addition3: Addition
  
  var addition4: Addition
  
  var area0: Area
  
  var area1: Area
  
  var area2: Area
  
  var area3: Area
  
  var area4: Area
  
  var land: Land
}
object Region {
  
  inline def apply(
    addition0: Addition,
    addition1: Addition,
    addition2: Addition,
    addition3: Addition,
    addition4: Addition,
    area0: Area,
    area1: Area,
    area2: Area,
    area3: Area,
    area4: Area,
    land: Land
  ): Region = {
    val __obj = js.Dynamic.literal(addition0 = addition0.asInstanceOf[js.Any], addition1 = addition1.asInstanceOf[js.Any], addition2 = addition2.asInstanceOf[js.Any], addition3 = addition3.asInstanceOf[js.Any], addition4 = addition4.asInstanceOf[js.Any], area0 = area0.asInstanceOf[js.Any], area1 = area1.asInstanceOf[js.Any], area2 = area2.asInstanceOf[js.Any], area3 = area3.asInstanceOf[js.Any], area4 = area4.asInstanceOf[js.Any], land = land.asInstanceOf[js.Any])
    __obj.asInstanceOf[Region]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Region] (val x: Self) extends AnyVal {
    
    inline def setAddition0(value: Addition): Self = StObject.set(x, "addition0", value.asInstanceOf[js.Any])
    
    inline def setAddition1(value: Addition): Self = StObject.set(x, "addition1", value.asInstanceOf[js.Any])
    
    inline def setAddition2(value: Addition): Self = StObject.set(x, "addition2", value.asInstanceOf[js.Any])
    
    inline def setAddition3(value: Addition): Self = StObject.set(x, "addition3", value.asInstanceOf[js.Any])
    
    inline def setAddition4(value: Addition): Self = StObject.set(x, "addition4", value.asInstanceOf[js.Any])
    
    inline def setArea0(value: Area): Self = StObject.set(x, "area0", value.asInstanceOf[js.Any])
    
    inline def setArea1(value: Area): Self = StObject.set(x, "area1", value.asInstanceOf[js.Any])
    
    inline def setArea2(value: Area): Self = StObject.set(x, "area2", value.asInstanceOf[js.Any])
    
    inline def setArea3(value: Area): Self = StObject.set(x, "area3", value.asInstanceOf[js.Any])
    
    inline def setArea4(value: Area): Self = StObject.set(x, "area4", value.asInstanceOf[js.Any])
    
    inline def setLand(value: Land): Self = StObject.set(x, "land", value.asInstanceOf[js.Any])
  }
}
