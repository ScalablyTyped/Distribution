package typings.postmanCollection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postman-collection", "PropertyList")
@js.native
class PropertyList[TElement] protected () extends PropertyBase[PropertyBaseDefinition] {
  def this(`type`: String, parent: js.Any, populate: js.Array[TElement]) = this()
  
  def add(item: TElement): Unit = js.native
  
  def all(): js.Array[TElement] = js.native
  
  def append(item: TElement): Unit = js.native
  
  def assimilate(source: js.Array[TElement], prune: Boolean): Unit = js.native
  def assimilate(source: PropertyList[TElement], prune: Boolean): Unit = js.native
  
  def clear(): Unit = js.native
  
  def count(): Double = js.native
  
  def each(iterator: js.Function1[/* item */ TElement, Unit]): Unit = js.native
  def each(iterator: js.Function1[/* item */ TElement, Unit], context: js.Any): Unit = js.native
  
  def eachParent(iterator: js.Function1[/* item */ js.Any, Unit]): Unit = js.native
  def eachParent(iterator: js.Function1[/* item */ js.Any, Unit], context: js.Any): Unit = js.native
  
  def filter(rule: js.Function1[/* item */ TElement, Boolean], context: js.Any): js.Array[TElement] = js.native
  
  def find(rule: js.Function1[/* item */ TElement, Boolean], context: js.Any): TElement = js.native
  
  def get(key: String): js.Any = js.native
  
  def has(item: TElement): Boolean = js.native
  def has(item: TElement, value: js.Any): Boolean = js.native
  def has(item: String): Boolean = js.native
  def has(item: String, value: js.Any): Boolean = js.native
  
  def idx(index: Double): TElement = js.native
  
  def indexOf(item: String): Double = js.native
  
  def insert(item: TElement, before: TElement): Unit = js.native
  def insert(item: TElement, before: String): Unit = js.native
  
  def insertAfter(item: TElement, after: TElement): Unit = js.native
  def insertAfter(item: TElement, after: String): Unit = js.native
  
  def map(iterator: js.Function1[/* item */ TElement, _]): js.Any = js.native
  def map(iterator: js.Function1[/* item */ TElement, _], context: js.Any): js.Any = js.native
  
  def one(id: String): TElement = js.native
  
  def populate(items: js.Array[TElement]): Unit = js.native
  
  def prepend(item: TElement): Unit = js.native
  
  def remove(predicate: TElement, context: js.Any): Unit = js.native
  def remove(predicate: String, context: js.Any): Unit = js.native
  def remove(predicate: js.Function1[/* item */ TElement, Boolean], context: js.Any): Unit = js.native
  
  def repopulate(items: js.Any): Unit = js.native
  
  def toObject(): js.Any = js.native
  def toObject(
    excludeDisabled: js.UndefOr[scala.Nothing],
    caseSensitive: js.UndefOr[scala.Nothing],
    multiValue: js.UndefOr[scala.Nothing],
    sanitizeKeys: Boolean
  ): js.Any = js.native
  def toObject(
    excludeDisabled: js.UndefOr[scala.Nothing],
    caseSensitive: js.UndefOr[scala.Nothing],
    multiValue: Boolean
  ): js.Any = js.native
  def toObject(
    excludeDisabled: js.UndefOr[scala.Nothing],
    caseSensitive: js.UndefOr[scala.Nothing],
    multiValue: Boolean,
    sanitizeKeys: Boolean
  ): js.Any = js.native
  def toObject(excludeDisabled: js.UndefOr[scala.Nothing], caseSensitive: Boolean): js.Any = js.native
  def toObject(
    excludeDisabled: js.UndefOr[scala.Nothing],
    caseSensitive: Boolean,
    multiValue: js.UndefOr[scala.Nothing],
    sanitizeKeys: Boolean
  ): js.Any = js.native
  def toObject(excludeDisabled: js.UndefOr[scala.Nothing], caseSensitive: Boolean, multiValue: Boolean): js.Any = js.native
  def toObject(
    excludeDisabled: js.UndefOr[scala.Nothing],
    caseSensitive: Boolean,
    multiValue: Boolean,
    sanitizeKeys: Boolean
  ): js.Any = js.native
  def toObject(excludeDisabled: Boolean): js.Any = js.native
  def toObject(
    excludeDisabled: Boolean,
    caseSensitive: js.UndefOr[scala.Nothing],
    multiValue: js.UndefOr[scala.Nothing],
    sanitizeKeys: Boolean
  ): js.Any = js.native
  def toObject(excludeDisabled: Boolean, caseSensitive: js.UndefOr[scala.Nothing], multiValue: Boolean): js.Any = js.native
  def toObject(
    excludeDisabled: Boolean,
    caseSensitive: js.UndefOr[scala.Nothing],
    multiValue: Boolean,
    sanitizeKeys: Boolean
  ): js.Any = js.native
  def toObject(excludeDisabled: Boolean, caseSensitive: Boolean): js.Any = js.native
  def toObject(
    excludeDisabled: Boolean,
    caseSensitive: Boolean,
    multiValue: js.UndefOr[scala.Nothing],
    sanitizeKeys: Boolean
  ): js.Any = js.native
  def toObject(excludeDisabled: Boolean, caseSensitive: Boolean, multiValue: Boolean): js.Any = js.native
  def toObject(excludeDisabled: Boolean, caseSensitive: Boolean, multiValue: Boolean, sanitizeKeys: Boolean): js.Any = js.native
  
  def upsert(item: TElement): Boolean | Null = js.native
}
/* static members */
object PropertyList {
  
  @JSImport("postman-collection", "PropertyList.isPropertyList")
  @js.native
  def isPropertyList(obj: js.Any): Boolean = js.native
}
