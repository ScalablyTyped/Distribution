package typings.ol.xmlMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Document
import typings.std.Element
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/xml", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createElementNS(namespaceURI: String, qualifiedName: String): Element = js.native
  def getAllTextContent(node: Node, normalizeWhitespace: Boolean): String = js.native
  def getAttributeNS(node: Element, namespaceURI: String, name: String): String = js.native
  def isDocument(`object`: js.Any): Boolean = js.native
  def makeArrayExtender[T](valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Node, /* p1 */ js.Array[_], js.Array[_]]): Parser = js.native
  def makeArrayExtender[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Node, /* p1 */ js.Array[_], js.Array[_]],
    opt_this: T
  ): Parser = js.native
  def makeArrayPusher[T](valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Element, /* p1 */ js.Array[_], Unit]): Parser = js.native
  def makeArrayPusher[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Element, /* p1 */ js.Array[_], Unit],
    opt_this: T
  ): Parser = js.native
  def makeArraySerializer[T, V](
    nodeWriter: js.ThisFunction3[/* this */ T, /* p0 */ Element, /* p1 */ V, /* p2 */ js.Array[_], Unit]
  ): Serializer = js.native
  def makeArraySerializer[T, V](
    nodeWriter: js.ThisFunction3[/* this */ T, /* p0 */ Element, /* p1 */ V, /* p2 */ js.Array[_], Unit],
    opt_this: T
  ): Serializer = js.native
  def makeChildAppender[T, V](nodeWriter: js.ThisFunction3[/* this */ T, /* p0 */ Node, /* p1 */ V, /* p2 */ js.Array[_], Unit]): Serializer = js.native
  def makeChildAppender[T, V](
    nodeWriter: js.ThisFunction3[/* this */ T, /* p0 */ Node, /* p1 */ V, /* p2 */ js.Array[_], Unit],
    opt_this: T
  ): Serializer = js.native
  def makeObjectPropertyPusher[T](valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Element, /* p1 */ js.Array[_], Unit]): Parser = js.native
  def makeObjectPropertyPusher[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Element, /* p1 */ js.Array[_], Unit],
    opt_property: String
  ): Parser = js.native
  def makeObjectPropertyPusher[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Element, /* p1 */ js.Array[_], Unit],
    opt_property: String,
    opt_this: T
  ): Parser = js.native
  def makeObjectPropertySetter[T](valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Element, /* p1 */ js.Array[_], Unit]): Parser = js.native
  def makeObjectPropertySetter[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Element, /* p1 */ js.Array[_], Unit],
    opt_property: String
  ): Parser = js.native
  def makeObjectPropertySetter[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Element, /* p1 */ js.Array[_], Unit],
    opt_property: String,
    opt_this: T
  ): Parser = js.native
  def makeReplacer[T](valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Node, /* p1 */ js.Array[_], Unit]): Parser = js.native
  def makeReplacer[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Node, /* p1 */ js.Array[_], Unit],
    opt_this: T
  ): Parser = js.native
  def makeSequence[V](`object`: StringDictionary[V], orderedKeys: js.Array[String]): js.Array[V] = js.native
  def makeSimpleNodeFactory(): js.Function3[/* p0 */ js.Any, /* p1 */ js.Array[_], /* p2 */ js.UndefOr[String], Node] = js.native
  def makeSimpleNodeFactory(opt_nodeName: String): js.Function3[/* p0 */ js.Any, /* p1 */ js.Array[_], /* p2 */ js.UndefOr[String], Node] = js.native
  def makeSimpleNodeFactory(opt_nodeName: String, opt_namespaceURI: String): js.Function3[/* p0 */ js.Any, /* p1 */ js.Array[_], /* p2 */ js.UndefOr[String], Node] = js.native
  def makeStructureNS[T](namespaceURIs: js.Array[String], structure: T): StringDictionary[T] = js.native
  def makeStructureNS[T](namespaceURIs: js.Array[String], structure: T, opt_structureNS: StringDictionary[T]): StringDictionary[T] = js.native
  def parse(xml: String): Document = js.native
  def parseNode(parsersNS: StringDictionary[StringDictionary[Parser]], node: Element, objectStack: js.Array[_]): Unit = js.native
  def parseNode(
    parsersNS: StringDictionary[StringDictionary[Parser]],
    node: Element,
    objectStack: js.Array[_],
    opt_this: js.Any
  ): Unit = js.native
  def pushParseAndPop[T](
    `object`: T,
    parsersNS: StringDictionary[StringDictionary[Parser]],
    node: Element,
    objectStack: js.Array[_]
  ): T = js.native
  def pushParseAndPop[T](
    `object`: T,
    parsersNS: StringDictionary[StringDictionary[Parser]],
    node: Element,
    objectStack: js.Array[_],
    opt_this: js.Any
  ): T = js.native
  def pushSerializeAndPop[O, T](
    `object`: O,
    serializersNS: StringDictionary[StringDictionary[Serializer]],
    nodeFactory: js.ThisFunction3[/* this */ T, /* p0 */ js.Any, /* p1 */ js.Array[_], /* p2 */ String, Node],
    values: js.Array[_],
    objectStack: js.Array[_]
  ): O = js.native
  def pushSerializeAndPop[O, T](
    `object`: O,
    serializersNS: StringDictionary[StringDictionary[Serializer]],
    nodeFactory: js.ThisFunction3[/* this */ T, /* p0 */ js.Any, /* p1 */ js.Array[_], /* p2 */ String, Node],
    values: js.Array[_],
    objectStack: js.Array[_],
    opt_keys: js.Array[String]
  ): O = js.native
  def pushSerializeAndPop[O, T](
    `object`: O,
    serializersNS: StringDictionary[StringDictionary[Serializer]],
    nodeFactory: js.ThisFunction3[/* this */ T, /* p0 */ js.Any, /* p1 */ js.Array[_], /* p2 */ String, Node],
    values: js.Array[_],
    objectStack: js.Array[_],
    opt_keys: js.Array[String],
    opt_this: T
  ): O = js.native
  def serialize[T](
    serializersNS: StringDictionary[StringDictionary[Serializer]],
    nodeFactory: js.ThisFunction3[/* this */ T, /* p0 */ js.Any, /* p1 */ js.Array[_], /* p2 */ String, Node],
    values: js.Array[_],
    objectStack: js.Array[_]
  ): Unit = js.native
  def serialize[T](
    serializersNS: StringDictionary[StringDictionary[Serializer]],
    nodeFactory: js.ThisFunction3[/* this */ T, /* p0 */ js.Any, /* p1 */ js.Array[_], /* p2 */ String, Node],
    values: js.Array[_],
    objectStack: js.Array[_],
    opt_keys: js.Array[String]
  ): Unit = js.native
  def serialize[T](
    serializersNS: StringDictionary[StringDictionary[Serializer]],
    nodeFactory: js.ThisFunction3[/* this */ T, /* p0 */ js.Any, /* p1 */ js.Array[_], /* p2 */ String, Node],
    values: js.Array[_],
    objectStack: js.Array[_],
    opt_keys: js.Array[String],
    opt_this: T
  ): Unit = js.native
}

