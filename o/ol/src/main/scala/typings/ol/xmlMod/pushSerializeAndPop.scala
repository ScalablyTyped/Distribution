package typings.ol.xmlMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/xml", "pushSerializeAndPop")
@js.native
object pushSerializeAndPop extends js.Object {
  def apply[O, T](
    `object`: O,
    serializersNS: StringDictionary[StringDictionary[Serializer]],
    nodeFactory: js.ThisFunction3[/* this */ T, /* p0 */ js.Any, /* p1 */ js.Array[_], /* p2 */ js.UndefOr[String], Node],
    values: js.Array[_],
    objectStack: js.Array[_]
  ): O = js.native
  def apply[O, T](
    `object`: O,
    serializersNS: StringDictionary[StringDictionary[Serializer]],
    nodeFactory: js.ThisFunction3[/* this */ T, /* p0 */ js.Any, /* p1 */ js.Array[_], /* p2 */ js.UndefOr[String], Node],
    values: js.Array[_],
    objectStack: js.Array[_],
    opt_keys: js.Array[String]
  ): O = js.native
  def apply[O, T](
    `object`: O,
    serializersNS: StringDictionary[StringDictionary[Serializer]],
    nodeFactory: js.ThisFunction3[/* this */ T, /* p0 */ js.Any, /* p1 */ js.Array[_], /* p2 */ js.UndefOr[String], Node],
    values: js.Array[_],
    objectStack: js.Array[_],
    opt_keys: js.Array[String],
    opt_this: T
  ): O = js.native
}

