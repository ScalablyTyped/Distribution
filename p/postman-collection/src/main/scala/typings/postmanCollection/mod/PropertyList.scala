package typings.postmanCollection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postman-collection", "PropertyList")
@js.native
open class PropertyList[TElement] protected () extends PropertyBase[PropertyBaseDefinition] {
  def this(`type`: String, parent: Any, populate: js.Array[TElement]) = this()
  
  def add(item: TElement): Unit = js.native
  
  def all(): js.Array[TElement] = js.native
  
  def append(item: TElement): Unit = js.native
  
  def assimilate(source: js.Array[TElement], prune: Boolean): Unit = js.native
  def assimilate(source: PropertyList[TElement], prune: Boolean): Unit = js.native
  
  def clear(): Unit = js.native
  
  def count(): Double = js.native
  
  def each(iterator: js.Function1[/* item */ TElement, Unit]): Unit = js.native
  def each(iterator: js.Function1[/* item */ TElement, Unit], context: Any): Unit = js.native
  
  def eachParent(iterator: js.Function1[/* item */ Any, Unit]): Unit = js.native
  def eachParent(iterator: js.Function1[/* item */ Any, Unit], context: Any): Unit = js.native
  
  def filter(rule: js.Function1[/* item */ TElement, Boolean], context: Any): js.Array[TElement] = js.native
  
  def find(rule: js.Function1[/* item */ TElement, Boolean], context: Any): TElement = js.native
  
  def get(key: String): Any = js.native
  
  def has(item: TElement): Boolean = js.native
  def has(item: TElement, value: Any): Boolean = js.native
  def has(item: String): Boolean = js.native
  def has(item: String, value: Any): Boolean = js.native
  
  def idx(index: Double): TElement = js.native
  
  def indexOf(item: String): Double = js.native
  
  def insert(item: TElement, before: TElement): Unit = js.native
  def insert(item: TElement, before: String): Unit = js.native
  
  def insertAfter(item: TElement, after: TElement): Unit = js.native
  def insertAfter(item: TElement, after: String): Unit = js.native
  
  def map(iterator: js.Function1[/* item */ TElement, Any]): Any = js.native
  def map(iterator: js.Function1[/* item */ TElement, Any], context: Any): Any = js.native
  
  def one(id: String): TElement = js.native
  
  def populate(items: js.Array[TElement]): Unit = js.native
  
  def prepend(item: TElement): Unit = js.native
  
  def remove(predicate: TElement, context: Any): Unit = js.native
  def remove(predicate: String, context: Any): Unit = js.native
  def remove(predicate: js.Function1[/* item */ TElement, Boolean], context: Any): Unit = js.native
  
  def repopulate(items: Any): Unit = js.native
  
  def toObject(): Any = js.native
  def toObject(excludeDisabled: Boolean): Any = js.native
  def toObject(excludeDisabled: Boolean, caseSensitive: Boolean): Any = js.native
  def toObject(excludeDisabled: Boolean, caseSensitive: Boolean, multiValue: Boolean): Any = js.native
  def toObject(excludeDisabled: Boolean, caseSensitive: Boolean, multiValue: Boolean, sanitizeKeys: Boolean): Any = js.native
  def toObject(excludeDisabled: Boolean, caseSensitive: Boolean, multiValue: Unit, sanitizeKeys: Boolean): Any = js.native
  def toObject(excludeDisabled: Boolean, caseSensitive: Unit, multiValue: Boolean): Any = js.native
  def toObject(excludeDisabled: Boolean, caseSensitive: Unit, multiValue: Boolean, sanitizeKeys: Boolean): Any = js.native
  def toObject(excludeDisabled: Boolean, caseSensitive: Unit, multiValue: Unit, sanitizeKeys: Boolean): Any = js.native
  def toObject(excludeDisabled: Unit, caseSensitive: Boolean): Any = js.native
  def toObject(excludeDisabled: Unit, caseSensitive: Boolean, multiValue: Boolean): Any = js.native
  def toObject(excludeDisabled: Unit, caseSensitive: Boolean, multiValue: Boolean, sanitizeKeys: Boolean): Any = js.native
  def toObject(excludeDisabled: Unit, caseSensitive: Boolean, multiValue: Unit, sanitizeKeys: Boolean): Any = js.native
  def toObject(excludeDisabled: Unit, caseSensitive: Unit, multiValue: Boolean): Any = js.native
  def toObject(excludeDisabled: Unit, caseSensitive: Unit, multiValue: Boolean, sanitizeKeys: Boolean): Any = js.native
  def toObject(excludeDisabled: Unit, caseSensitive: Unit, multiValue: Unit, sanitizeKeys: Boolean): Any = js.native
  
  def upsert(item: TElement): Boolean | Null = js.native
}
/* static members */
object PropertyList {
  
  @JSImport("postman-collection", "PropertyList")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isPropertyList(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPropertyList")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
