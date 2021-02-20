package typings.officeUiFabricReact

import typings.officeUiFabricReact.keytipDataTypesMod.KeytipDataOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useKeytipDataMod {
  
  @JSImport("office-ui-fabric-react/lib/components/KeytipData/useKeytipData", "useKeytipData")
  @js.native
  def useKeytipData(options: KeytipDataOptions): IKeytipData = js.native
  
  @js.native
  trait IKeytipData extends StObject {
    
    var ariaDescribedBy: js.UndefOr[String] = js.native
    
    var keytipId: js.UndefOr[String] = js.native
  }
  object IKeytipData {
    
    @scala.inline
    def apply(): IKeytipData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IKeytipData]
    }
    
    @scala.inline
    implicit class IKeytipDataMutableBuilder[Self <: IKeytipData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      @scala.inline
      def setKeytipId(value: String): Self = StObject.set(x, "keytipId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeytipIdUndefined: Self = StObject.set(x, "keytipId", js.undefined)
    }
  }
}
