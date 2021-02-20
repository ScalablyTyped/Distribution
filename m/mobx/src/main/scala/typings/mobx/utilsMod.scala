package typings.mobx

import org.scalablytyped.runtime.Instantiable1
import typings.mobx.mobxBooleans.`false`
import typings.mobx.mobxBooleans.`true`
import typings.std.Map
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("mobx/lib/utils/utils", "EMPTY_ARRAY")
  @js.native
  val EMPTY_ARRAY: js.Array[scala.Nothing] = js.native
  
  @JSImport("mobx/lib/utils/utils", "OBFUSCATED_ERROR")
  @js.native
  val OBFUSCATED_ERROR: /* "An invariant failed, however the error is obfuscated because this is a production build." */ String = js.native
  
  @JSImport("mobx/lib/utils/utils", "addHiddenFinalProp")
  @js.native
  def addHiddenFinalProp(`object`: js.Any, propName: PropertyKey, value: js.Any): Unit = js.native
  
  @JSImport("mobx/lib/utils/utils", "addHiddenProp")
  @js.native
  def addHiddenProp(`object`: js.Any, propName: PropertyKey, value: js.Any): Unit = js.native
  
  @JSImport("mobx/lib/utils/utils", "assertPropertyConfigurable")
  @js.native
  def assertPropertyConfigurable(`object`: js.Any, prop: PropertyKey): Unit = js.native
  
  @JSImport("mobx/lib/utils/utils", "convertToMap")
  @js.native
  def convertToMap(dataStructure: js.Any): Map[_, _] = js.native
  
  @JSImport("mobx/lib/utils/utils", "createInstanceofPredicate")
  @js.native
  def createInstanceofPredicate[T](name: String, clazz: Instantiable1[/* args (repeated) */ js.Any, T]): js.Function1[/* x */ js.Any, /* is T */ Boolean] = js.native
  
  @JSImport("mobx/lib/utils/utils", "deprecated")
  @js.native
  def deprecated(msg: String): Boolean = js.native
  @JSImport("mobx/lib/utils/utils", "deprecated")
  @js.native
  def deprecated(thing: String, replacement: String): Boolean = js.native
  
  @JSImport("mobx/lib/utils/utils", "fail")
  @js.native
  def fail(message: String): scala.Nothing = js.native
  @JSImport("mobx/lib/utils/utils", "fail")
  @js.native
  def fail(message: Boolean): scala.Nothing = js.native
  
  @JSImport("mobx/lib/utils/utils", "getNextId")
  @js.native
  def getNextId(): Double = js.native
  
  @JSImport("mobx/lib/utils/utils", "getPlainObjectKeys")
  @js.native
  def getPlainObjectKeys(`object`: js.Any): js.Array[String | Double | js.Symbol] = js.native
  
  @JSImport("mobx/lib/utils/utils", "invariant")
  @js.native
  def invariant(check: js.Any): Unit = js.native
  @JSImport("mobx/lib/utils/utils", "invariant")
  @js.native
  def invariant(check: js.Any, message: String): Unit = js.native
  @JSImport("mobx/lib/utils/utils", "invariant")
  @js.native
  def invariant(check: js.Any, message: Boolean): Unit = js.native
  @JSImport("mobx/lib/utils/utils", "invariant")
  @js.native
  def invariant_false(check: `false`): scala.Nothing = js.native
  @JSImport("mobx/lib/utils/utils", "invariant")
  @js.native
  def invariant_false(check: `false`, message: String): scala.Nothing = js.native
  @JSImport("mobx/lib/utils/utils", "invariant")
  @js.native
  def invariant_false(check: `false`, message: Boolean): scala.Nothing = js.native
  @JSImport("mobx/lib/utils/utils", "invariant")
  @js.native
  def invariant_true(check: `true`): Unit = js.native
  @JSImport("mobx/lib/utils/utils", "invariant")
  @js.native
  def invariant_true(check: `true`, message: String): Unit = js.native
  @JSImport("mobx/lib/utils/utils", "invariant")
  @js.native
  def invariant_true(check: `true`, message: Boolean): Unit = js.native
  
  @JSImport("mobx/lib/utils/utils", "isArrayLike")
  @js.native
  def isArrayLike(x: js.Any): Boolean = js.native
  
  @JSImport("mobx/lib/utils/utils", "isES6Map")
  @js.native
  def isES6Map(thing: js.Any): Boolean = js.native
  
  @JSImport("mobx/lib/utils/utils", "isES6Set")
  @js.native
  def isES6Set(thing: js.Any): /* is std.Set<any> */ Boolean = js.native
  
  @JSImport("mobx/lib/utils/utils", "isObject")
  @js.native
  def isObject(value: js.Any): Boolean = js.native
  
  @JSImport("mobx/lib/utils/utils", "isPlainObject")
  @js.native
  def isPlainObject(value: js.Any): Boolean = js.native
  
  @JSImport("mobx/lib/utils/utils", "isPropertyConfigurable")
  @js.native
  def isPropertyConfigurable(`object`: js.Any, prop: PropertyKey): Boolean = js.native
  
  @JSImport("mobx/lib/utils/utils", "makeNonEnumerable")
  @js.native
  def makeNonEnumerable(`object`: js.Any, propNames: js.Array[PropertyKey]): Unit = js.native
  
  @JSImport("mobx/lib/utils/utils", "noop")
  @js.native
  def noop(): Unit = js.native
  
  @JSImport("mobx/lib/utils/utils", "once")
  @js.native
  def once(func: Lambda): Lambda = js.native
  
  @JSImport("mobx/lib/utils/utils", "ownKeys")
  @js.native
  def ownKeys(target: js.Any): js.Array[PropertyKey] = js.native
  
  @JSImport("mobx/lib/utils/utils", "stringifyKey")
  @js.native
  def stringifyKey(key: js.Any): String = js.native
  
  @JSImport("mobx/lib/utils/utils", "toPrimitive")
  @js.native
  def toPrimitive(value: js.Any): js.Any = js.native
  
  @JSImport("mobx/lib/utils/utils", "unique")
  @js.native
  def unique[T](list: js.Array[T]): js.Array[T] = js.native
  
  @js.native
  trait Lambda extends StObject {
    
    def apply(): Unit = js.native
    
    var name: js.UndefOr[String] = js.native
  }
}
