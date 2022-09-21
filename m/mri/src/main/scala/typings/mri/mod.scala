package typings.mri

import typings.mri.anon._empty
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](): Argv[T] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Argv[T]]
  inline def apply[T](args: js.Array[String]): Argv[T] = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any]).asInstanceOf[Argv[T]]
  inline def apply[T](args: js.Array[String], options: Options): Argv[T] = (^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Argv[T]]
  inline def apply[T](args: Unit, options: Options): Argv[T] = (^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Argv[T]]
  
  @JSImport("mri", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Argv[T] = T & _empty
  
  type Arrayable[T] = T | js.Array[T]
  
  type Default = Dict[Any]
  
  type Dict[T] = Record[String, T]
  
  trait Options extends StObject {
    
    var default: js.UndefOr[Dict[Any]] = js.undefined
    
    var alias: js.UndefOr[Dict[Arrayable[String]]] = js.undefined
    
    var boolean: js.UndefOr[Arrayable[String]] = js.undefined
    
    var string: js.UndefOr[Arrayable[String]] = js.undefined
    
    var unknown: js.UndefOr[js.Function1[/* flag */ String, Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAlias(value: Dict[Arrayable[String]]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setBoolean(value: Arrayable[String]): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      inline def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
      
      inline def setBooleanVarargs(value: String*): Self = StObject.set(x, "boolean", js.Array(value*))
      
      inline def setDefault(value: Dict[Any]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setString(value: Arrayable[String]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      inline def setStringVarargs(value: String*): Self = StObject.set(x, "string", js.Array(value*))
      
      inline def setUnknown(value: /* flag */ String => Unit): Self = StObject.set(x, "unknown", js.Any.fromFunction1(value))
      
      inline def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
    }
  }
}
