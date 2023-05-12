package typings.miscUtilsOfMineGeneric

import org.scalablytyped.runtime.StringDictionary
import typings.miscUtilsOfMineGeneric.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcJsonMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cloneJSON[T](a: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneJSON")(a.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def findJson(
    o: JSONValue,
    p: js.Function2[/* o */ JSONValue, /* nameOrIndex */ js.UndefOr[String | Double], Boolean]
  ): js.UndefOr[Value] = (^.asInstanceOf[js.Dynamic].applyDynamic("findJson")(o.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Value]]
  inline def findJson(
    o: JSONValue,
    p: js.Function2[/* o */ JSONValue, /* nameOrIndex */ js.UndefOr[String | Double], Boolean],
    _name: String
  ): js.UndefOr[Value] = (^.asInstanceOf[js.Dynamic].applyDynamic("findJson")(o.asInstanceOf[js.Any], p.asInstanceOf[js.Any], _name.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Value]]
  inline def findJson(
    o: JSONValue,
    p: js.Function2[/* o */ JSONValue, /* nameOrIndex */ js.UndefOr[String | Double], Boolean],
    _name: Double
  ): js.UndefOr[Value] = (^.asInstanceOf[js.Dynamic].applyDynamic("findJson")(o.asInstanceOf[js.Any], p.asInstanceOf[js.Any], _name.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Value]]
  
  inline def isJSONObject(o: Any): /* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/json.JSONObject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSONObject")(o.asInstanceOf[js.Any]).asInstanceOf[/* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/json.JSONObject */ Boolean]
  
  inline def parseJSON[K](s: String): js.UndefOr[K] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJSON")(s.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[K]]
  inline def parseJSON[K](s: String, defaultValue: K): js.UndefOr[K] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseJSON")(s.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[K]]
  
  inline def stringifyJSON[K](s: K): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyJSON")(s.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def stringifyJSON[K](s: K, defaultValue: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyJSON")(s.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def visitJson(
    o: JSONValue,
    v: js.Function2[/* o */ JSONValue, /* nameOrIndex */ js.UndefOr[String | Double], Boolean]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("visitJson")(o.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def visitJson(
    o: JSONValue,
    v: js.Function2[/* o */ JSONValue, /* nameOrIndex */ js.UndefOr[String | Double], Boolean],
    _name: String
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("visitJson")(o.asInstanceOf[js.Any], v.asInstanceOf[js.Any], _name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def visitJson(
    o: JSONValue,
    v: js.Function2[/* o */ JSONValue, /* nameOrIndex */ js.UndefOr[String | Double], Boolean],
    _name: Double
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("visitJson")(o.asInstanceOf[js.Any], v.asInstanceOf[js.Any], _name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type JSONArray = js.Array[JSONValue]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JSONObject = {[member: string] : misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/json.JSONValue}
  }}}
  to avoid circular code involving: 
  - misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/json.JSONArray
  - misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/json.JSONObject
  - misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/json.JSONValue
  */
  trait JSONObject
    extends StObject
       with /* member */ StringDictionary[JSONValue]
  object JSONObject {
    
    inline def apply(): JSONObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONObject]
    }
  }
  
  type JSONPrimitive = String | Double | Boolean | Null
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JSONValue = misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/json.JSONPrimitive | misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/json.JSONObject | misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/json.JSONArray
  }}}
  to avoid circular code involving: 
  - misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/json.JSONArray
  - misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/json.JSONValue
  */
  type JSONValue = JSONPrimitive | JSONObject | Any
}
