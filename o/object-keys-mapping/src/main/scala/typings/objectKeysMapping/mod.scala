package typings.objectKeysMapping

import typings.objectKeysMapping.anon.Camelcase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("object-keys-mapping", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("object-keys-mapping", "Operator")
  @js.native
  open class Operator () extends StObject {
    def this(opts: Camelcase) = this()
    
    def map(origin: js.Array[js.Object]): js.Array[js.Object] = js.native
    def map(origin: js.Object): js.Object = js.native
    
    def mapArray(origin: js.Array[js.Object]): js.Array[js.Object] = js.native
    
    def mapField(path: String): String = js.native
    
    def mapObject(origin: js.Object, path: String): js.Object = js.native
  }
  
  inline def reverseCamelcase(origin: js.Array[js.Object]): js.Array[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverseCamelcase")(origin.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Object]]
  inline def reverseCamelcase(origin: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("reverseCamelcase")(origin.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def toCamelcase(origin: js.Array[js.Object]): js.Array[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("toCamelcase")(origin.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Object]]
  inline def toCamelcase(origin: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("toCamelcase")(origin.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def trim(origin: js.Array[js.Object]): js.Array[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("trim")(origin.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Object]]
  inline def trim(origin: js.Array[js.Object], ignore: js.Function1[/* v */ Any, Boolean]): js.Array[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("trim")(origin.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  inline def trim(origin: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("trim")(origin.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def trim(origin: js.Object, ignore: js.Function1[/* v */ Any, Boolean]): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("trim")(origin.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  trait OperatorOptions extends StObject {
    
    var camelcase: js.UndefOr[Boolean] = js.undefined
    
    var mapping: js.UndefOr[js.Object] = js.undefined
  }
  object OperatorOptions {
    
    inline def apply(): OperatorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OperatorOptions]
    }
    
    extension [Self <: OperatorOptions](x: Self) {
      
      inline def setCamelcase(value: Boolean): Self = StObject.set(x, "camelcase", value.asInstanceOf[js.Any])
      
      inline def setCamelcaseUndefined: Self = StObject.set(x, "camelcase", js.undefined)
      
      inline def setMapping(value: js.Object): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
      
      inline def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
    }
  }
}
