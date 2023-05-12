package typings.metroConfig.srcConfigTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  string :{[key: string] : string},   int :{[key: string] : number},   double :{[key: string] : number},   bool :{[key: string] : boolean},   string_array :{[key: string] : std.Array<string>},   int_array :{[key: string] : std.Array<number>},   double_array :{[key: string] : std.Array<number>},   bool_array :{[key: string] : std.Array<boolean>}}> */
trait PerfAnnotations extends StObject {
  
  var bool: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  
  var bool_array: js.UndefOr[StringDictionary[js.Array[Boolean]]] = js.undefined
  
  var double: js.UndefOr[StringDictionary[Double]] = js.undefined
  
  var double_array: js.UndefOr[StringDictionary[js.Array[Double]]] = js.undefined
  
  var int: js.UndefOr[StringDictionary[Double]] = js.undefined
  
  var int_array: js.UndefOr[StringDictionary[js.Array[Double]]] = js.undefined
  
  var string: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var string_array: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
}
object PerfAnnotations {
  
  inline def apply(): PerfAnnotations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerfAnnotations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerfAnnotations] (val x: Self) extends AnyVal {
    
    inline def setBool(value: StringDictionary[Boolean]): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
    
    inline def setBoolUndefined: Self = StObject.set(x, "bool", js.undefined)
    
    inline def setBool_array(value: StringDictionary[js.Array[Boolean]]): Self = StObject.set(x, "bool_array", value.asInstanceOf[js.Any])
    
    inline def setBool_arrayUndefined: Self = StObject.set(x, "bool_array", js.undefined)
    
    inline def setDouble(value: StringDictionary[Double]): Self = StObject.set(x, "double", value.asInstanceOf[js.Any])
    
    inline def setDoubleUndefined: Self = StObject.set(x, "double", js.undefined)
    
    inline def setDouble_array(value: StringDictionary[js.Array[Double]]): Self = StObject.set(x, "double_array", value.asInstanceOf[js.Any])
    
    inline def setDouble_arrayUndefined: Self = StObject.set(x, "double_array", js.undefined)
    
    inline def setInt(value: StringDictionary[Double]): Self = StObject.set(x, "int", value.asInstanceOf[js.Any])
    
    inline def setIntUndefined: Self = StObject.set(x, "int", js.undefined)
    
    inline def setInt_array(value: StringDictionary[js.Array[Double]]): Self = StObject.set(x, "int_array", value.asInstanceOf[js.Any])
    
    inline def setInt_arrayUndefined: Self = StObject.set(x, "int_array", js.undefined)
    
    inline def setString(value: StringDictionary[String]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    
    inline def setString_array(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "string_array", value.asInstanceOf[js.Any])
    
    inline def setString_arrayUndefined: Self = StObject.set(x, "string_array", js.undefined)
  }
}
