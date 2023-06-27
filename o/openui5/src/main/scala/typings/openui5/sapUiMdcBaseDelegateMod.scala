package typings.openui5

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcBaseDelegateMod extends Shortcut {
  
  @JSImport("sap/ui/mdc/BaseDelegate", JSImport.Default)
  @js.native
  val default: BaseDelegate = js.native
  
  /**
    * @since 1.79.0
    *
    * Basic Delegate for {@link sap.ui.mdc.Control}, {@link sap.ui.mdc.Element}
    *
    *
    * All delegate implementations for MDC controls must be derived directly or indirectly from this entity.
    * Applications should implement {@link sap.ui.mdc.BaseDelegate.getTypeMap getTypeMap} to provide type mappings
    * based on their model usage. Please also see the following extensible presets: {@link sap.ui.mdc.DefaultTypeMap},
    * {@link sap.ui.mdc.odata.TypeMap}, {@link sap.ui.mdc.odata.v4.TypeMap}
    */
  trait BaseDelegate extends StObject {
    
    /**
      * @since 1.114.0
      *
      * Returns the typeutil configuration for this delegate.
      *
      * @returns typeMap configuration for this delegate Note: The returned array will also serve as a key in
      * the weakmap-based typeutil cache of BaseDelegate
      */
    def getTypeMap(/**
      * Delegate payload object
      */
    oControl: typings.openui5.sapUiMdcControlMod.default): Any
  }
  object BaseDelegate {
    
    inline def apply(getTypeMap: typings.openui5.sapUiMdcControlMod.default => Any): BaseDelegate = {
      val __obj = js.Dynamic.literal(getTypeMap = js.Any.fromFunction1(getTypeMap))
      __obj.asInstanceOf[BaseDelegate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseDelegate] (val x: Self) extends AnyVal {
      
      inline def setGetTypeMap(value: typings.openui5.sapUiMdcControlMod.default => Any): Self = StObject.set(x, "getTypeMap", js.Any.fromFunction1(value))
    }
  }
  
  type _To = BaseDelegate
  
  /* This means you don't have to write `default`, but can instead just say `sapUiMdcBaseDelegateMod.foo` */
  override def _to: BaseDelegate = default
}
