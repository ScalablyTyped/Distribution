package typings.ol.xmlMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/xml", "serialize")
@js.native
object serialize extends js.Object {
  def apply[T](
    serializersNS: StringDictionary[StringDictionary[Serializer]],
    nodeFactory: js.ThisFunction3[
      /* this */ T, 
      /* p0 */ js.Any, 
      /* p1 */ js.Array[_], 
      /* p2 */ js.UndefOr[String], 
      js.UndefOr[Node]
    ],
    values: js.Array[_],
    objectStack: js.Array[_]
  ): Unit = js.native
  def apply[T](
    serializersNS: StringDictionary[StringDictionary[Serializer]],
    nodeFactory: js.ThisFunction3[
      /* this */ T, 
      /* p0 */ js.Any, 
      /* p1 */ js.Array[_], 
      /* p2 */ js.UndefOr[String], 
      js.UndefOr[Node]
    ],
    values: js.Array[_],
    objectStack: js.Array[_],
    opt_keys: js.Array[String]
  ): Unit = js.native
  def apply[T](
    serializersNS: StringDictionary[StringDictionary[Serializer]],
    nodeFactory: js.ThisFunction3[
      /* this */ T, 
      /* p0 */ js.Any, 
      /* p1 */ js.Array[_], 
      /* p2 */ js.UndefOr[String], 
      js.UndefOr[Node]
    ],
    values: js.Array[_],
    objectStack: js.Array[_],
    opt_keys: js.Array[String],
    opt_this: T
  ): Unit = js.native
}

