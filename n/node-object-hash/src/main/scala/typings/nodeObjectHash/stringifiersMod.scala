package typings.nodeObjectHash

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringifiersMod {
  
  object PREFIX {
    
    @JSImport("node-object-hash/dist/stringifiers", "PREFIX")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("node-object-hash/dist/stringifiers", "PREFIX.array")
    @js.native
    def array: String = js.native
    @scala.inline
    def array_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("array")(x.asInstanceOf[js.Any])
    
    @JSImport("node-object-hash/dist/stringifiers", "PREFIX.boolean")
    @js.native
    def boolean: String = js.native
    @scala.inline
    def boolean_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("boolean")(x.asInstanceOf[js.Any])
    
    @JSImport("node-object-hash/dist/stringifiers", "PREFIX.date")
    @js.native
    def date: String = js.native
    @scala.inline
    def date_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("date")(x.asInstanceOf[js.Any])
    
    @JSImport("node-object-hash/dist/stringifiers", "PREFIX.function")
    @js.native
    def function: String = js.native
    @scala.inline
    def function_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("function")(x.asInstanceOf[js.Any])
    
    @JSImport("node-object-hash/dist/stringifiers", "PREFIX.map")
    @js.native
    def map: String = js.native
    @scala.inline
    def map_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("map")(x.asInstanceOf[js.Any])
    
    @JSImport("node-object-hash/dist/stringifiers", "PREFIX.number")
    @js.native
    def number: String = js.native
    @scala.inline
    def number_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("number")(x.asInstanceOf[js.Any])
    
    @JSImport("node-object-hash/dist/stringifiers", "PREFIX.set")
    @js.native
    def set: String = js.native
    @scala.inline
    def set_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("set")(x.asInstanceOf[js.Any])
    
    @JSImport("node-object-hash/dist/stringifiers", "PREFIX.string")
    @js.native
    def string: String = js.native
    @scala.inline
    def string_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("string")(x.asInstanceOf[js.Any])
    
    @JSImport("node-object-hash/dist/stringifiers", "PREFIX.symbol")
    @js.native
    def symbol: String = js.native
    @scala.inline
    def symbol_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbol")(x.asInstanceOf[js.Any])
    
    @JSImport("node-object-hash/dist/stringifiers", "PREFIX.undefined")
    @js.native
    def undefined: String = js.native
    @scala.inline
    def undefined_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("undefined")(x.asInstanceOf[js.Any])
    
    @JSImport("node-object-hash/dist/stringifiers", "PREFIX.null")
    @js.native
    val `null`: String = js.native
  }
  
  @JSImport("node-object-hash/dist/stringifiers", "_array")
  @js.native
  def array(obj: js.Array[_]): String = js.native
  
  @JSImport("node-object-hash/dist/stringifiers", "_arraySort")
  @js.native
  def arraySort(obj: js.Array[_]): String = js.native
  
  @JSImport("node-object-hash/dist/stringifiers", "_boolean")
  @js.native
  def boolean(obj: Boolean): String = js.native
  
  @JSImport("node-object-hash/dist/stringifiers", "_booleanCoerce")
  @js.native
  def booleanCoerce(obj: Boolean): String = js.native
  
  @JSImport("node-object-hash/dist/stringifiers", "_date")
  @js.native
  def date(obj: Date): String = js.native
  
  @JSImport("node-object-hash/dist/stringifiers", "_dateCoerce")
  @js.native
  def dateCoerce(obj: Date): String = js.native
  
  @JSImport("node-object-hash/dist/stringifiers", "_function")
  @js.native
  def function(obj: js.Function): String = js.native
  
  @JSImport("node-object-hash/dist/stringifiers", "_functionCoerce")
  @js.native
  def functionCoerce(obj: js.Function): String = js.native
  
  @JSImport("node-object-hash/dist/stringifiers", "_functionTrim")
  @js.native
  def functionTrim(obj: js.Function): String = js.native
  
  @JSImport("node-object-hash/dist/stringifiers", "_functionTrimCoerce")
  @js.native
  def functionTrimCoerce(obj: js.Function): String = js.native
  
  @JSImport("node-object-hash/dist/stringifiers", "_map")
  @js.native
  def map(obj: Map[_, _]): String = js.native
  
  @JSImport("node-object-hash/dist/stringifiers", "_mapSort")
  @js.native
  def mapSort(obj: Map[_, _]): String = js.native
  
  @JSImport("node-object-hash/dist/stringifiers", "_nullCoerce")
  @js.native
  def nullCoerce(): String = js.native
  
  @JSImport("node-object-hash/dist/stringifiers", "_number")
  @js.native
  def number(obj: Double): String = js.native
  
  @JSImport("node-object-hash/dist/stringifiers", "_numberCoerce")
  @js.native
  def numberCoerce(obj: Double): String = js.native
  
  @JSImport("node-object-hash/dist/stringifiers", "_objectSort")
  @js.native
  def objectSort(obj: StringDictionary[js.Any]): String = js.native
  
  @JSImport("node-object-hash/dist/stringifiers", "_set")
  @js.native
  def set(obj: Set[_]): String = js.native
  
  @JSImport("node-object-hash/dist/stringifiers", "_setCoerce")
  @js.native
  def setCoerce(obj: Set[_]): String = js.native
  
  @JSImport("node-object-hash/dist/stringifiers", "_setSort")
  @js.native
  def setSort(obj: Set[_]): String = js.native
  
  @JSImport("node-object-hash/dist/stringifiers", "_setSortCoerce")
  @js.native
  def setSortCoerce(obj: Set[_]): String = js.native
  
  @JSImport("node-object-hash/dist/stringifiers", "_string")
  @js.native
  def string(obj: String): String = js.native
  
  @JSImport("node-object-hash/dist/stringifiers", "_stringCoerce")
  @js.native
  def stringCoerce(obj: String): String = js.native
  
  @JSImport("node-object-hash/dist/stringifiers", "_stringTrim")
  @js.native
  def stringTrim(obj: String): String = js.native
  
  @JSImport("node-object-hash/dist/stringifiers", "_stringTrimCoerce")
  @js.native
  def stringTrimCoerce(obj: String): String = js.native
  
  @JSImport("node-object-hash/dist/stringifiers", "_symbol")
  @js.native
  def symbol(obj: js.Symbol): String = js.native
  
  @JSImport("node-object-hash/dist/stringifiers", "_symbolCoerce")
  @js.native
  def symbolCoerce(): String = js.native
  
  @JSImport("node-object-hash/dist/stringifiers", "_undefined")
  @js.native
  def undefined(): String = js.native
  
  @JSImport("node-object-hash/dist/stringifiers", "_undefinedCoerce")
  @js.native
  def undefinedCoerce(): String = js.native
  
  type Stringifiers = StringDictionary[js.Function1[/* obj */ js.Any, String]]
  
  @JSImport("node-object-hash/dist/stringifiers", "_null")
  @js.native
  def `null`(): String = js.native
  
  @JSImport("node-object-hash/dist/stringifiers", "_object")
  @js.native
  def `object`(obj: StringDictionary[js.Any]): String = js.native
}
