package typings.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Engines extends StObject {
  
  val browsers: js.UndefOr[String | js.Array[String]] = js.undefined
  
  val electron: js.UndefOr[SemverRange] = js.undefined
  
  val node: js.UndefOr[SemverRange] = js.undefined
  
  val parcel: js.UndefOr[SemverRange] = js.undefined
}
object Engines {
  
  inline def apply(): Engines = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Engines]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Engines] (val x: Self) extends AnyVal {
    
    inline def setBrowsers(value: String | js.Array[String]): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
    
    inline def setBrowsersUndefined: Self = StObject.set(x, "browsers", js.undefined)
    
    inline def setBrowsersVarargs(value: String*): Self = StObject.set(x, "browsers", js.Array(value*))
    
    inline def setElectron(value: SemverRange): Self = StObject.set(x, "electron", value.asInstanceOf[js.Any])
    
    inline def setElectronUndefined: Self = StObject.set(x, "electron", js.undefined)
    
    inline def setNode(value: SemverRange): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setParcel(value: SemverRange): Self = StObject.set(x, "parcel", value.asInstanceOf[js.Any])
    
    inline def setParcelUndefined: Self = StObject.set(x, "parcel", js.undefined)
  }
}
