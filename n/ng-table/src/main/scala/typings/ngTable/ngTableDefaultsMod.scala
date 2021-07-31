package typings.ngTable

import typings.ngTable.ngTableParamsMod.IParamValues
import typings.ngTable.ngTableSettingsMod.ISettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngTableDefaultsMod {
  
  @JSImport("ng-table/src/core/ngTableDefaults", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ng-table/src/core/ngTableDefaults", "ngTableDefaults")
  @js.native
  def ngTableDefaults: IDefaults = js.native
  @scala.inline
  def ngTableDefaults_=(x: IDefaults): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ngTableDefaults")(x.asInstanceOf[js.Any])
  
  trait IDefaults extends StObject {
    
    var params: js.UndefOr[IParamValues[js.Any]] = js.undefined
    
    var settings: js.UndefOr[ISettings[js.Any]] = js.undefined
  }
  object IDefaults {
    
    @scala.inline
    def apply(): IDefaults = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDefaults]
    }
    
    @scala.inline
    implicit class IDefaultsMutableBuilder[Self <: IDefaults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParams(value: IParamValues[js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setSettings(value: ISettings[js.Any]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    }
  }
}
