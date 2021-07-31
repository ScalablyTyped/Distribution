package typings.pnpapi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ConsiderBuiltins extends StObject {
    
    var considerBuiltins: js.UndefOr[Boolean] = js.undefined
  }
  object ConsiderBuiltins {
    
    @scala.inline
    def apply(): ConsiderBuiltins = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConsiderBuiltins]
    }
    
    @scala.inline
    implicit class ConsiderBuiltinsMutableBuilder[Self <: ConsiderBuiltins] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsiderBuiltins(value: Boolean): Self = StObject.set(x, "considerBuiltins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsiderBuiltinsUndefined: Self = StObject.set(x, "considerBuiltins", js.undefined)
    }
  }
  
  trait ConsiderBuiltinsExtensions extends StObject {
    
    var considerBuiltins: js.UndefOr[Boolean] = js.undefined
    
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ConsiderBuiltinsExtensions {
    
    @scala.inline
    def apply(): ConsiderBuiltinsExtensions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConsiderBuiltinsExtensions]
    }
    
    @scala.inline
    implicit class ConsiderBuiltinsExtensionsMutableBuilder[Self <: ConsiderBuiltinsExtensions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsiderBuiltins(value: Boolean): Self = StObject.set(x, "considerBuiltins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsiderBuiltinsUndefined: Self = StObject.set(x, "considerBuiltins", js.undefined)
      
      @scala.inline
      def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    }
  }
  
  trait Extensions extends StObject {
    
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Extensions {
    
    @scala.inline
    def apply(): Extensions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Extensions]
    }
    
    @scala.inline
    implicit class ExtensionsMutableBuilder[Self <: Extensions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    }
  }
}
