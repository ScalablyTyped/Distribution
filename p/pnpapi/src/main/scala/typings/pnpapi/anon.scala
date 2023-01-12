package typings.pnpapi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ConsiderBuiltins extends StObject {
    
    var considerBuiltins: js.UndefOr[Boolean] = js.undefined
  }
  object ConsiderBuiltins {
    
    inline def apply(): ConsiderBuiltins = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConsiderBuiltins]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConsiderBuiltins] (val x: Self) extends AnyVal {
      
      inline def setConsiderBuiltins(value: Boolean): Self = StObject.set(x, "considerBuiltins", value.asInstanceOf[js.Any])
      
      inline def setConsiderBuiltinsUndefined: Self = StObject.set(x, "considerBuiltins", js.undefined)
    }
  }
  
  trait ConsiderBuiltinsExtensions extends StObject {
    
    var considerBuiltins: js.UndefOr[Boolean] = js.undefined
    
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ConsiderBuiltinsExtensions {
    
    inline def apply(): ConsiderBuiltinsExtensions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConsiderBuiltinsExtensions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConsiderBuiltinsExtensions] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Extensions] (val x: Self) extends AnyVal {
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
    }
  }
}
