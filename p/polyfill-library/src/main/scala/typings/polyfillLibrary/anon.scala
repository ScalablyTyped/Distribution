package typings.polyfillLibrary

import typings.polyfillLibrary.mod.Flag
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AliasOf extends StObject {
    
    var aliasOf: Set[String]
    
    var dependencyOf: Set[String]
    
    var flags: Set[Flag]
  }
  object AliasOf {
    
    inline def apply(aliasOf: Set[String], dependencyOf: Set[String], flags: Set[Flag]): AliasOf = {
      val __obj = js.Dynamic.literal(aliasOf = aliasOf.asInstanceOf[js.Any], dependencyOf = dependencyOf.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any])
      __obj.asInstanceOf[AliasOf]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AliasOf] (val x: Self) extends AnyVal {
      
      inline def setAliasOf(value: Set[String]): Self = StObject.set(x, "aliasOf", value.asInstanceOf[js.Any])
      
      inline def setDependencyOf(value: Set[String]): Self = StObject.set(x, "dependencyOf", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: Set[Flag]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    }
  }
  
  trait Flags extends StObject {
    
    var flags: js.Array[Flag] | Set[Flag]
  }
  object Flags {
    
    inline def apply(flags: js.Array[Flag] | Set[Flag]): Flags = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
      __obj.asInstanceOf[Flags]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Flags] (val x: Self) extends AnyVal {
      
      inline def setFlags(value: js.Array[Flag] | Set[Flag]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsVarargs(value: Flag*): Self = StObject.set(x, "flags", js.Array(value*))
    }
  }
}
