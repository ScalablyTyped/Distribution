package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelBindingModeMod {
  
  /**
    * Binding type definitions.
    */
  @JSImport("sap/ui/model/BindingMode", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[BindingMode & String] = js.native
    
    /* "Default" */ val Default: typings.openui5.sapUiModelBindingModeMod.BindingMode.Default & String = js.native
    
    /* "OneTime" */ val OneTime: typings.openui5.sapUiModelBindingModeMod.BindingMode.OneTime & String = js.native
    
    /* "OneWay" */ val OneWay: typings.openui5.sapUiModelBindingModeMod.BindingMode.OneWay & String = js.native
    
    /* "TwoWay" */ val TwoWay: typings.openui5.sapUiModelBindingModeMod.BindingMode.TwoWay & String = js.native
  }
  
  @js.native
  sealed trait BindingMode extends StObject
  /**
    * Binding type definitions.
    */
  @JSImport("sap/ui/model/BindingMode", "BindingMode")
  @js.native
  object BindingMode extends StObject {
    
    /**
      * BindingMode default means that the binding mode of the model is used
      */
    @js.native
    sealed trait Default
      extends StObject
         with BindingMode
    
    /**
      * BindingMode one time means value is only read from the model once
      */
    @js.native
    sealed trait OneTime
      extends StObject
         with BindingMode
    
    /**
      * BindingMode one way means from model to view
      */
    @js.native
    sealed trait OneWay
      extends StObject
         with BindingMode
    
    /**
      * BindingMode two way means from model to view and vice versa
      */
    @js.native
    sealed trait TwoWay
      extends StObject
         with BindingMode
  }
}
