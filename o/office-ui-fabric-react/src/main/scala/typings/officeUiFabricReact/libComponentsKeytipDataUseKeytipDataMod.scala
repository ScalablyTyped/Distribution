package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsKeytipDataKeytipDataDottypesMod.KeytipDataOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsKeytipDataUseKeytipDataMod {
  
  @JSImport("office-ui-fabric-react/lib/components/KeytipData/useKeytipData", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useKeytipData(options: KeytipDataOptions): IKeytipData = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeytipData")(options.asInstanceOf[js.Any]).asInstanceOf[IKeytipData]
  
  trait IKeytipData extends StObject {
    
    var ariaDescribedBy: js.UndefOr[String] = js.undefined
    
    var keytipId: js.UndefOr[String] = js.undefined
  }
  object IKeytipData {
    
    inline def apply(): IKeytipData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IKeytipData]
    }
    
    extension [Self <: IKeytipData](x: Self) {
      
      inline def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setKeytipId(value: String): Self = StObject.set(x, "keytipId", value.asInstanceOf[js.Any])
      
      inline def setKeytipIdUndefined: Self = StObject.set(x, "keytipId", js.undefined)
    }
  }
}
