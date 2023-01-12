package typings.ngTable

import typings.ngTable.srcCoreNgTableParamsMod.IParamValues
import typings.ngTable.srcCoreNgTableSettingsMod.ISettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreNgTableDefaultsMod {
  
  @JSImport("ng-table/src/core/ngTableDefaults", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ng-table/src/core/ngTableDefaults", "ngTableDefaults")
  @js.native
  def ngTableDefaults: IDefaults = js.native
  inline def ngTableDefaults_=(x: IDefaults): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ngTableDefaults")(x.asInstanceOf[js.Any])
  
  trait IDefaults extends StObject {
    
    var params: js.UndefOr[IParamValues[Any]] = js.undefined
    
    var settings: js.UndefOr[ISettings[Any]] = js.undefined
  }
  object IDefaults {
    
    inline def apply(): IDefaults = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDefaults]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDefaults] (val x: Self) extends AnyVal {
      
      inline def setParams(value: IParamValues[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setSettings(value: ISettings[Any]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    }
  }
}
