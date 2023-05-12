package typings.nivoGenerators

import typings.nivoGenerators.anon.Label
import typings.nivoGenerators.anon.Total
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesWaffleMod {
  
  @JSImport("@nivo/generators/dist/types/waffle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateWaffleData[D /* <: WaffleDatumSpec */](param0: Total[D]): js.Array[D & Label] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateWaffleData")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[D & Label]]
  
  trait WaffleDatumSpec extends StObject {
    
    var id: String
    
    var label: js.UndefOr[String] = js.undefined
  }
  object WaffleDatumSpec {
    
    inline def apply(id: String): WaffleDatumSpec = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[WaffleDatumSpec]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WaffleDatumSpec] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
}
