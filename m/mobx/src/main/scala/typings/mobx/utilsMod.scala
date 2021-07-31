package typings.mobx

import org.scalablytyped.runtime.Instantiable1
import typings.mobx.mobxBooleans.`false`
import typings.mobx.mobxBooleans.`true`
import typings.std.Map
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("mobx/lib/utils/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mobx/lib/utils/utils", "EMPTY_ARRAY")
  @js.native
  val EMPTY_ARRAY: js.Array[scala.Nothing] = js.native
  
  @JSImport("mobx/lib/utils/utils", "OBFUSCATED_ERROR")
  @js.native
  val OBFUSCATED_ERROR: /* "An invariant failed, however the error is obfuscated because this is a production build." */ String = js.native
  
  @scala.inline
  def addHiddenFinalProp(`object`: js.Any, propName: PropertyKey, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addHiddenFinalProp")(`object`.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def addHiddenProp(`object`: js.Any, propName: PropertyKey, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addHiddenProp")(`object`.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def assertPropertyConfigurable(`object`: js.Any, prop: PropertyKey): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPropertyConfigurable")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def convertToMap(dataStructure: js.Any): Map[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToMap")(dataStructure.asInstanceOf[js.Any]).asInstanceOf[Map[js.Any, js.Any]]
  
  @scala.inline
  def createInstanceofPredicate[T](name: String, clazz: Instantiable1[/* args (repeated) */ js.Any, T]): js.Function1[/* x */ js.Any, /* is T */ Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstanceofPredicate")(name.asInstanceOf[js.Any], clazz.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ js.Any, /* is T */ Boolean]]
  
  @scala.inline
  def deprecated(msg: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("deprecated")(msg.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def deprecated(thing: String, replacement: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecated")(thing.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def fail(message: String): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")(message.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(message: Boolean): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")(message.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def getNextId(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextId")().asInstanceOf[Double]
  
  @scala.inline
  def getPlainObjectKeys(`object`: js.Any): js.Array[String | Double | js.Symbol] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlainObjectKeys")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[String | Double | js.Symbol]]
  
  @scala.inline
  def invariant(check: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(check.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def invariant(check: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(check.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def invariant(check: js.Any, message: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(check.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def invariant_false(check: `false`): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(check.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  @scala.inline
  def invariant_false(check: `false`, message: String): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(check.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def invariant_false(check: `false`, message: Boolean): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(check.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def invariant_true(check: `true`): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(check.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def invariant_true(check: `true`, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(check.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def invariant_true(check: `true`, message: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(check.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def isArrayLike(x: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayLike")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isES6Map(thing: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isES6Map")(thing.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isES6Set(thing: js.Any): /* is std.Set<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isES6Set")(thing.asInstanceOf[js.Any]).asInstanceOf[/* is std.Set<any> */ Boolean]
  
  @scala.inline
  def isObject(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isPlainObject(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isPropertyConfigurable(`object`: js.Any, prop: PropertyKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPropertyConfigurable")(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def makeNonEnumerable(`object`: js.Any, propNames: js.Array[PropertyKey]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("makeNonEnumerable")(`object`.asInstanceOf[js.Any], propNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  @scala.inline
  def once(func: Lambda): Lambda = ^.asInstanceOf[js.Dynamic].applyDynamic("once")(func.asInstanceOf[js.Any]).asInstanceOf[Lambda]
  
  @scala.inline
  def ownKeys(target: js.Any): js.Array[PropertyKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("ownKeys")(target.asInstanceOf[js.Any]).asInstanceOf[js.Array[PropertyKey]]
  
  @scala.inline
  def stringifyKey(key: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyKey")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def toPrimitive(value: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toPrimitive")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def unique[T](list: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")(list.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @js.native
  trait Lambda extends StObject {
    
    def apply(): Unit = js.native
    
    var name: js.UndefOr[String] = js.native
  }
}
