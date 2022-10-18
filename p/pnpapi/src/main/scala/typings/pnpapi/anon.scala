package typings.pnpapi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var considerBuiltins: js.UndefOr[Boolean] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setConsiderBuiltins(value: Boolean): Self = StObject.set(x, "considerBuiltins", value.asInstanceOf[js.Any])
      
      inline def setConsiderBuiltinsUndefined: Self = StObject.set(x, "considerBuiltins", js.undefined)
    }
  }
  
  trait ConsiderBuiltins extends StObject {
    
    var considerBuiltins: js.UndefOr[Boolean] = js.undefined
    
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ConsiderBuiltins {
    
    inline def apply(): ConsiderBuiltins = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConsiderBuiltins]
    }
    
    extension [Self <: ConsiderBuiltins](x: Self) {
      
      inline def setConsiderBuiltins(value: Boolean): Self = StObject.set(x, "considerBuiltins", value.asInstanceOf[js.Any])
      
      inline def setConsiderBuiltinsUndefined: Self = StObject.set(x, "considerBuiltins", js.undefined)
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
    }
  }
  
  trait Extensions extends StObject {
    
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Extensions {
    
    inline def apply(): Extensions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Extensions]
    }
    
    extension [Self <: Extensions](x: Self) {
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
    }
  }
}
