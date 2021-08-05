package typings.nodeObjectHash

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringifiersMod {
  
  @JSImport("node-object-hash/dist/stringifiers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object PREFIX {
    
    @JSImport("node-object-hash/dist/stringifiers", "PREFIX")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("node-object-hash/dist/stringifiers", "PREFIX.array")
    @js.native
    def array: String = js.native
    inline def array_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("array")(x.asInstanceOf[js.Any])
    
    @JSImport("node-object-hash/dist/stringifiers", "PREFIX.boolean")
    @js.native
    def boolean: String = js.native
    inline def boolean_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("boolean")(x.asInstanceOf[js.Any])
    
    @JSImport("node-object-hash/dist/stringifiers", "PREFIX.date")
    @js.native
    def date: String = js.native
    inline def date_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("date")(x.asInstanceOf[js.Any])
    
    @JSImport("node-object-hash/dist/stringifiers", "PREFIX.function")
    @js.native
    def function: String = js.native
    inline def function_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("function")(x.asInstanceOf[js.Any])
    
    @JSImport("node-object-hash/dist/stringifiers", "PREFIX.map")
    @js.native
    def map: String = js.native
    inline def map_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("map")(x.asInstanceOf[js.Any])
    
    @JSImport("node-object-hash/dist/stringifiers", "PREFIX.null")
    @js.native
    val `null`: String = js.native
    
    @JSImport("node-object-hash/dist/stringifiers", "PREFIX.number")
    @js.native
    def number: String = js.native
    inline def number_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("number")(x.asInstanceOf[js.Any])
    
    @JSImport("node-object-hash/dist/stringifiers", "PREFIX.set")
    @js.native
    def set: String = js.native
    inline def set_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("set")(x.asInstanceOf[js.Any])
    
    @JSImport("node-object-hash/dist/stringifiers", "PREFIX.string")
    @js.native
    def string: String = js.native
    inline def string_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("string")(x.asInstanceOf[js.Any])
    
    @JSImport("node-object-hash/dist/stringifiers", "PREFIX.symbol")
    @js.native
    def symbol: String = js.native
    inline def symbol_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbol")(x.asInstanceOf[js.Any])
    
    @JSImport("node-object-hash/dist/stringifiers", "PREFIX.undefined")
    @js.native
    def undefined: String = js.native
    inline def undefined_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("undefined")(x.asInstanceOf[js.Any])
  }
  
  inline def array(obj: js.Array[js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_array")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def arraySort(obj: js.Array[js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_arraySort")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def boolean(obj: Boolean): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_boolean")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def booleanCoerce(obj: Boolean): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_booleanCoerce")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def date(obj: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_date")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def dateCoerce(obj: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_dateCoerce")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def function(obj: js.Function): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_function")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def functionCoerce(obj: js.Function): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_functionCoerce")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def functionTrim(obj: js.Function): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_functionTrim")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def functionTrimCoerce(obj: js.Function): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_functionTrimCoerce")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def map(obj: Map[js.Any, js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_map")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def mapSort(obj: Map[js.Any, js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_mapSort")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def `null`(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_null")().asInstanceOf[String]
  
  inline def nullCoerce(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_nullCoerce")().asInstanceOf[String]
  
  inline def number(obj: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_number")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def numberCoerce(obj: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_numberCoerce")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def `object`(obj: StringDictionary[js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_object")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def objectSort(obj: StringDictionary[js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_objectSort")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def set(obj: Set[js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_set")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def setCoerce(obj: Set[js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_setCoerce")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def setSort(obj: Set[js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_setSort")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def setSortCoerce(obj: Set[js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_setSortCoerce")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def string(obj: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_string")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringCoerce(obj: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_stringCoerce")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringTrim(obj: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_stringTrim")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringTrimCoerce(obj: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_stringTrimCoerce")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def symbol(obj: js.Symbol): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_symbol")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def symbolCoerce(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_symbolCoerce")().asInstanceOf[String]
  
  inline def undefined(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_undefined")().asInstanceOf[String]
  
  inline def undefinedCoerce(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_undefinedCoerce")().asInstanceOf[String]
  
  type Stringifiers = StringDictionary[js.Function1[/* obj */ js.Any, String]]
}
