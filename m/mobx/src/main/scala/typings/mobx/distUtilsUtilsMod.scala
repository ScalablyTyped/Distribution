package typings.mobx

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.std.PropertyKey
import typings.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsUtilsMod {
  
  @JSImport("mobx/dist/utils/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mobx/dist/utils/utils", "EMPTY_ARRAY")
  @js.native
  val EMPTY_ARRAY: js.Array[scala.Nothing] = js.native
  
  inline def addHiddenFinalProp(`object`: Any, propName: PropertyKey, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addHiddenFinalProp")(`object`.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addHiddenProp(`object`: Any, propName: PropertyKey, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addHiddenProp")(`object`.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def assertProxies(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertProxies")().asInstanceOf[Unit]
  
  inline def assign(target: js.Object, sources: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(scala.List(target.asInstanceOf[js.Any]).`++`(sources.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  inline def assign[T, U](target: T, source: U): T & U = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & U]
  inline def assign[T_1, U_1, V](target: T_1, source1: U_1, source2: V): T_1 & U_1 & V = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any])).asInstanceOf[T_1 & U_1 & V]
  inline def assign[T_2, U_2, V_1, W](target: T_2, source1: U_2, source2: V_1, source3: W): T_2 & U_2 & V_1 & W = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any], source3.asInstanceOf[js.Any])).asInstanceOf[T_2 & U_2 & V_1 & W]
  
  inline def createInstanceofPredicate[T](name: String, theClass: Instantiable1[/* args (repeated) */ Any, T]): js.Function1[/* x */ Any, /* is T */ Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstanceofPredicate")(name.asInstanceOf[js.Any], theClass.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ Any, /* is T */ Boolean]]
  
  inline def defineProperty[T](o: T, p: PropertyKey, attributes: js.PropertyDescriptor & ThisType[Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperty")(o.asInstanceOf[js.Any], p.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def getDescriptor(o: Any, p: PropertyKey): js.UndefOr[js.PropertyDescriptor] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDescriptor")(o.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.PropertyDescriptor]]
  
  inline def getNextId(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextId")().asInstanceOf[Double]
  
  inline def getOwnPropertyDescriptors[T](o: T): (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: std.TypedPropertyDescriptor<T[P]>} */ js.Any) & StringDictionary[js.PropertyDescriptor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOwnPropertyDescriptors")(o.asInstanceOf[js.Any]).asInstanceOf[(/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: std.TypedPropertyDescriptor<T[P]>} */ js.Any) & StringDictionary[js.PropertyDescriptor]]
  
  inline def getPlainObjectKeys(`object`: Any): js.Array[String | js.Symbol] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlainObjectKeys")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[String | js.Symbol]]
  
  inline def hasProp(target: js.Object, prop: PropertyKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasProp")(target.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isES6Map(thing: Any): /* is std.Map<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isES6Map")(thing.asInstanceOf[js.Any]).asInstanceOf[/* is std.Map<any, any> */ Boolean]
  
  inline def isES6Set(thing: Any): /* is std.Set<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isES6Set")(thing.asInstanceOf[js.Any]).asInstanceOf[/* is std.Set<any> */ Boolean]
  
  inline def isFunction(fn: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(fn.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isGenerator(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGenerator")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObject(value: Any): /* is std.Object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Object */ Boolean]
  
  inline def isPlainObject(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isString(value: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(value.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isStringish(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStringish")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  @JSImport("mobx/dist/utils/utils", "objectPrototype")
  @js.native
  val objectPrototype: js.Object = js.native
  
  inline def once(func: Lambda): Lambda = ^.asInstanceOf[js.Dynamic].applyDynamic("once")(func.asInstanceOf[js.Any]).asInstanceOf[Lambda]
  
  inline def ownKeys(target: Any): js.Array[String | js.Symbol] = ^.asInstanceOf[js.Dynamic].applyDynamic("ownKeys")(target.asInstanceOf[js.Any]).asInstanceOf[js.Array[String | js.Symbol]]
  
  inline def stringifyKey(key: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyKey")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toPrimitive(value: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toPrimitive")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def warnAboutProxyRequirement(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warnAboutProxyRequirement")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  trait Lambda extends StObject {
    
    def apply(): Unit = js.native
    
    var name: js.UndefOr[String] = js.native
  }
}
