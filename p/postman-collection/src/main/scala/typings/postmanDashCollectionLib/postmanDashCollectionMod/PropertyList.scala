package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postman-collection", "PropertyList")
@js.native
class PropertyList[TElement] protected () extends PropertyBase[PropertyBaseDefinition] {
  def this(`type`: java.lang.String, parent: js.Any, populate: js.Array[TElement]) = this()
  def add(item: TElement): scala.Unit = js.native
  def all(): js.Array[TElement] = js.native
  def append(item: TElement): scala.Unit = js.native
  def assimilate(source: js.Array[TElement], prune: scala.Boolean): scala.Unit = js.native
  def assimilate(source: PropertyList[TElement], prune: scala.Boolean): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def count(): scala.Double = js.native
  def each(iterator: js.Function1[/* item */ TElement, scala.Unit]): scala.Unit = js.native
  def each(iterator: js.Function1[/* item */ TElement, scala.Unit], context: js.Any): scala.Unit = js.native
  def eachParent(iterator: js.Function1[/* item */ js.Any, scala.Unit]): scala.Unit = js.native
  def eachParent(iterator: js.Function1[/* item */ js.Any, scala.Unit], context: js.Any): scala.Unit = js.native
  def filter(rule: js.Function1[/* item */ TElement, scala.Boolean], context: js.Any): js.Array[TElement] = js.native
  def find(rule: js.Function1[/* item */ TElement, scala.Boolean], context: js.Any): TElement = js.native
  def get(key: java.lang.String): js.Any = js.native
  def has(item: TElement): scala.Boolean = js.native
  def has(item: TElement, value: js.Any): scala.Boolean = js.native
  def has(item: java.lang.String): scala.Boolean = js.native
  def has(item: java.lang.String, value: js.Any): scala.Boolean = js.native
  def idx(index: scala.Double): TElement = js.native
  def indexOf(item: java.lang.String): scala.Double = js.native
  def insert(item: TElement, before: TElement): scala.Unit = js.native
  def insert(item: TElement, before: java.lang.String): scala.Unit = js.native
  def insertAfter(item: TElement, after: TElement): scala.Unit = js.native
  def insertAfter(item: TElement, after: java.lang.String): scala.Unit = js.native
  def map(iterator: js.Function1[/* item */ TElement, _]): js.Any = js.native
  def map(iterator: js.Function1[/* item */ TElement, _], context: js.Any): js.Any = js.native
  def one(id: java.lang.String): TElement = js.native
  def populate(items: js.Array[TElement]): scala.Unit = js.native
  def prepend(item: TElement): scala.Unit = js.native
  def remove(predicate: TElement, context: js.Any): scala.Unit = js.native
  def remove(predicate: java.lang.String, context: js.Any): scala.Unit = js.native
  def remove(predicate: js.Function1[/* item */ TElement, scala.Boolean], context: js.Any): scala.Unit = js.native
  def repopulate(items: js.Any): scala.Unit = js.native
  def toObject(): js.Any = js.native
  def toObject(excludeDisabled: scala.Boolean): js.Any = js.native
  def toObject(excludeDisabled: scala.Boolean, caseSensitive: scala.Boolean): js.Any = js.native
  def toObject(excludeDisabled: scala.Boolean, caseSensitive: scala.Boolean, multiValue: scala.Boolean): js.Any = js.native
  def toObject(
    excludeDisabled: scala.Boolean,
    caseSensitive: scala.Boolean,
    multiValue: scala.Boolean,
    sanitizeKeys: scala.Boolean
  ): js.Any = js.native
  def upsert(item: TElement): scala.Boolean | scala.Null = js.native
}

@JSImport("postman-collection", "PropertyList")
@js.native
object PropertyList extends js.Object {
  def isPropertyList(obj: js.Any): scala.Boolean = js.native
}

