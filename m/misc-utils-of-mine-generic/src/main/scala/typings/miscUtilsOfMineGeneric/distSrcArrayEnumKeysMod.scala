package typings.miscUtilsOfMineGeneric

import org.scalablytyped.runtime.StringDictionary
import typings.miscUtilsOfMineGeneric.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcArrayEnumKeysMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/array/enumKeys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildEnumMap(anEnum: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("buildEnumMap")(anEnum.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def enumKeys(anEnum: Any): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumKeys")(anEnum.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def enumNoValueKeys(anEnum: Any): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumNoValueKeys")(anEnum.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def enumValueFromString[T](key: String, anEnum: Any): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumValueFromString")(key.asInstanceOf[js.Any], anEnum.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def getEnumKey(anEnum: Any, value: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getEnumKey")(anEnum.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getEnumKeyAndValue(e: Any): js.Array[Key] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnumKeyAndValue")(e.asInstanceOf[js.Any]).asInstanceOf[js.Array[Key]]
  
  inline def toObject[T](array: js.Array[T], groupByKey: String): StringDictionary[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(array.asInstanceOf[js.Any], groupByKey.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[T]]
}
