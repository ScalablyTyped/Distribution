package typings.miscUtilsOfMineGeneric

import org.scalablytyped.runtime.StringDictionary
import typings.miscUtilsOfMineGeneric.anon.IgnoreArrayElements
import typings.miscUtilsOfMineGeneric.anon.KeyValue
import typings.miscUtilsOfMineGeneric.distSrcTypeMod.EmptyObject
import typings.miscUtilsOfMineGeneric.distSrcTypeMod.ObjectStringKeyUnion
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcObjectMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/object", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrayToObject[T](a: js.Array[String], fn: js.Function1[/* a */ String, js.UndefOr[T]]): StringDictionary[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayToObject")(a.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.UndefOr[T]]]
  
  inline def getObjectProperty[T](`object`: Any, path: String): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getObjectProperty")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def getObjectProperty[T](`object`: Any, path: String, defaultValue: T): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getObjectProperty")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def getObjectProperty[T](`object`: Any, path: js.Array[String | Double]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getObjectProperty")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def getObjectProperty[T](`object`: Any, path: js.Array[String | Double], defaultValue: T): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getObjectProperty")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def getObjectPropertyPaths(`object`: Any): js.Array[js.Array[String | Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getObjectPropertyPaths")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[String | Double]]]
  inline def getObjectPropertyPaths(`object`: Any, options: IgnoreArrayElements): js.Array[js.Array[String | Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getObjectPropertyPaths")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[String | Double]]]
  
  inline def objectFilter[O /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof O ]: O[keyof O]} */ js.Any */](
    o: O,
    p: js.Function2[
      /* keyof O */ /* k */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: O[keyof O] */ /* v */ js.Any, 
      Boolean
    ]
  ): Partial[O] = (^.asInstanceOf[js.Dynamic].applyDynamic("objectFilter")(o.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Partial[O]]
  
  inline def objectKeys[Field /* <: EmptyObject */](o: Field): js.Array[ObjectStringKeyUnion[Field]] = ^.asInstanceOf[js.Dynamic].applyDynamic("objectKeys")(o.asInstanceOf[js.Any]).asInstanceOf[js.Array[ObjectStringKeyUnion[Field]]]
  
  inline def objectMap[O /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof O ]: O[keyof O]} */ js.Any */, T](
    o: O,
    p: js.Function2[
      /* keyof O */ /* k */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: O[keyof O] */ /* v */ js.Any, 
      T
    ]
  ): /* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof O ]: T} */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("objectMap")(o.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof O ]: T} */ js.Any]
  
  inline def objectMapValues[O /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof O ]: O[keyof O]} */ js.Any */, T](
    o: O,
    p: js.Function2[
      /* keyof O */ /* k */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: O[keyof O] */ /* v */ js.Any, 
      T
    ]
  ): /* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof O ]: T} */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("objectMapValues")(o.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof O ]: T} */ js.Any]
  
  inline def objectOrderKeysAlphabetically[T](o: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("objectOrderKeysAlphabetically")(o.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def objectToArray[O /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof O ]: O[keyof O]} */ js.Any */](o: O): js.Array[KeyValue[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("objectToArray")(o.asInstanceOf[js.Any]).asInstanceOf[js.Array[KeyValue[O]]]
  
  inline def setObjectProperty(`object`: Any, path: String, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setObjectProperty")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def setObjectProperty(`object`: Any, path: js.Array[String | Double], value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setObjectProperty")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
}
