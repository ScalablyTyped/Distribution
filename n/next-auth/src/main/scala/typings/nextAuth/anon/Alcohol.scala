package typings.nextAuth.anon

import typings.nextAuth.nextAuthInts.`2`
import typings.nextAuth.nextAuthInts.`3`
import typings.nextAuth.nextAuthInts.`4`
import typings.nextAuth.nextAuthInts.`5`
import typings.nextAuth.nextAuthInts.`6`
import typings.nextAuth.nextAuthInts.`7`
import typings.nextAuth.nextAuthInts.`8`
import typings.nextAuth.nextAuthInts.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alcohol extends StObject {
  
  var alcohol: js.UndefOr[typings.nextAuth.nextAuthInts.`1` | `2` | `3` | `4` | `5`] = js.undefined
  
  var inspired_by: js.UndefOr[String] = js.undefined
  
  var langs: js.UndefOr[js.Array[String]] = js.undefined
  
  var life_main: js.UndefOr[typings.nextAuth.nextAuthInts.`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`] = js.undefined
  
  var people_main: js.UndefOr[typings.nextAuth.nextAuthInts.`1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
  
  var political: js.UndefOr[
    typings.nextAuth.nextAuthInts.`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`
  ] = js.undefined
  
  var religion: js.UndefOr[String] = js.undefined
  
  var smoking: js.UndefOr[typings.nextAuth.nextAuthInts.`1` | `2` | `3` | `4` | `5`] = js.undefined
}
object Alcohol {
  
  inline def apply(): Alcohol = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alcohol]
  }
  
  extension [Self <: Alcohol](x: Self) {
    
    inline def setAlcohol(value: typings.nextAuth.nextAuthInts.`1` | `2` | `3` | `4` | `5`): Self = StObject.set(x, "alcohol", value.asInstanceOf[js.Any])
    
    inline def setAlcoholUndefined: Self = StObject.set(x, "alcohol", js.undefined)
    
    inline def setInspired_by(value: String): Self = StObject.set(x, "inspired_by", value.asInstanceOf[js.Any])
    
    inline def setInspired_byUndefined: Self = StObject.set(x, "inspired_by", js.undefined)
    
    inline def setLangs(value: js.Array[String]): Self = StObject.set(x, "langs", value.asInstanceOf[js.Any])
    
    inline def setLangsUndefined: Self = StObject.set(x, "langs", js.undefined)
    
    inline def setLangsVarargs(value: String*): Self = StObject.set(x, "langs", js.Array(value*))
    
    inline def setLife_main(value: typings.nextAuth.nextAuthInts.`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): Self = StObject.set(x, "life_main", value.asInstanceOf[js.Any])
    
    inline def setLife_mainUndefined: Self = StObject.set(x, "life_main", js.undefined)
    
    inline def setPeople_main(value: typings.nextAuth.nextAuthInts.`1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "people_main", value.asInstanceOf[js.Any])
    
    inline def setPeople_mainUndefined: Self = StObject.set(x, "people_main", js.undefined)
    
    inline def setPolitical(value: typings.nextAuth.nextAuthInts.`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`): Self = StObject.set(x, "political", value.asInstanceOf[js.Any])
    
    inline def setPoliticalUndefined: Self = StObject.set(x, "political", js.undefined)
    
    inline def setReligion(value: String): Self = StObject.set(x, "religion", value.asInstanceOf[js.Any])
    
    inline def setReligionUndefined: Self = StObject.set(x, "religion", js.undefined)
    
    inline def setSmoking(value: typings.nextAuth.nextAuthInts.`1` | `2` | `3` | `4` | `5`): Self = StObject.set(x, "smoking", value.asInstanceOf[js.Any])
    
    inline def setSmokingUndefined: Self = StObject.set(x, "smoking", js.undefined)
  }
}
