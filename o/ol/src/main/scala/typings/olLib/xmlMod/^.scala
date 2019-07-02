package typings
package olLib.xmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/xml", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createElementNS(namespaceURI: java.lang.String, qualifiedName: java.lang.String): stdLib.Element = js.native
  def getAllTextContent(node: stdLib.Node, normalizeWhitespace: scala.Boolean): java.lang.String = js.native
  def getAttributeNS(node: stdLib.Element, namespaceURI: java.lang.String, name: java.lang.String): java.lang.String = js.native
  def isDocument(`object`: js.Any): scala.Boolean = js.native
  def makeArrayExtender[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ stdLib.Node, /* p1 */ js.Array[_], js.Array[_]]
  ): Parser = js.native
  def makeArrayExtender[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ stdLib.Node, /* p1 */ js.Array[_], js.Array[_]],
    opt_this: T
  ): Parser = js.native
  def makeArrayPusher[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ stdLib.Element, /* p1 */ js.Array[_], scala.Unit]
  ): Parser = js.native
  def makeArrayPusher[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ stdLib.Element, /* p1 */ js.Array[_], scala.Unit],
    opt_this: T
  ): Parser = js.native
  def makeArraySerializer[T, V](
    nodeWriter: js.ThisFunction3[/* this */ T, /* p0 */ stdLib.Element, /* p1 */ V, /* p2 */ js.Array[_], scala.Unit]
  ): Serializer = js.native
  def makeArraySerializer[T, V](
    nodeWriter: js.ThisFunction3[/* this */ T, /* p0 */ stdLib.Element, /* p1 */ V, /* p2 */ js.Array[_], scala.Unit],
    opt_this: T
  ): Serializer = js.native
  def makeChildAppender[T, V](
    nodeWriter: js.ThisFunction3[/* this */ T, /* p0 */ stdLib.Node, /* p1 */ V, /* p2 */ js.Array[_], scala.Unit]
  ): Serializer = js.native
  def makeChildAppender[T, V](
    nodeWriter: js.ThisFunction3[/* this */ T, /* p0 */ stdLib.Node, /* p1 */ V, /* p2 */ js.Array[_], scala.Unit],
    opt_this: T
  ): Serializer = js.native
  def makeObjectPropertyPusher[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ stdLib.Element, /* p1 */ js.Array[_], scala.Unit]
  ): Parser = js.native
  def makeObjectPropertyPusher[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ stdLib.Element, /* p1 */ js.Array[_], scala.Unit],
    opt_property: java.lang.String
  ): Parser = js.native
  def makeObjectPropertyPusher[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ stdLib.Element, /* p1 */ js.Array[_], scala.Unit],
    opt_property: java.lang.String,
    opt_this: T
  ): Parser = js.native
  def makeObjectPropertySetter[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ stdLib.Element, /* p1 */ js.Array[_], scala.Unit]
  ): Parser = js.native
  def makeObjectPropertySetter[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ stdLib.Element, /* p1 */ js.Array[_], scala.Unit],
    opt_property: java.lang.String
  ): Parser = js.native
  def makeObjectPropertySetter[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ stdLib.Element, /* p1 */ js.Array[_], scala.Unit],
    opt_property: java.lang.String,
    opt_this: T
  ): Parser = js.native
  def makeReplacer[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ stdLib.Node, /* p1 */ js.Array[_], scala.Unit]
  ): Parser = js.native
  def makeReplacer[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ stdLib.Node, /* p1 */ js.Array[_], scala.Unit],
    opt_this: T
  ): Parser = js.native
  def makeSequence[V](`object`: org.scalablytyped.runtime.StringDictionary[V], orderedKeys: js.Array[java.lang.String]): js.Array[V] = js.native
  def makeSimpleNodeFactory(): js.Function3[
    /* p0 */ js.Any, 
    /* p1 */ js.Array[_], 
    /* p2 */ js.UndefOr[java.lang.String], 
    stdLib.Node
  ] = js.native
  def makeSimpleNodeFactory(opt_nodeName: java.lang.String): js.Function3[
    /* p0 */ js.Any, 
    /* p1 */ js.Array[_], 
    /* p2 */ js.UndefOr[java.lang.String], 
    stdLib.Node
  ] = js.native
  def makeSimpleNodeFactory(opt_nodeName: java.lang.String, opt_namespaceURI: java.lang.String): js.Function3[
    /* p0 */ js.Any, 
    /* p1 */ js.Array[_], 
    /* p2 */ js.UndefOr[java.lang.String], 
    stdLib.Node
  ] = js.native
  def makeStructureNS[T](namespaceURIs: js.Array[java.lang.String], structure: T): org.scalablytyped.runtime.StringDictionary[T] = js.native
  def makeStructureNS[T](
    namespaceURIs: js.Array[java.lang.String],
    structure: T,
    opt_structureNS: org.scalablytyped.runtime.StringDictionary[T]
  ): org.scalablytyped.runtime.StringDictionary[T] = js.native
  def parse(xml: java.lang.String): stdLib.Document = js.native
  def parseNode(
    parsersNS: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[Parser]],
    node: stdLib.Element,
    objectStack: js.Array[_]
  ): scala.Unit = js.native
  def parseNode(
    parsersNS: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[Parser]],
    node: stdLib.Element,
    objectStack: js.Array[_],
    opt_this: js.Any
  ): scala.Unit = js.native
  def pushParseAndPop[T](
    `object`: T,
    parsersNS: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[Parser]],
    node: stdLib.Element,
    objectStack: js.Array[_]
  ): T = js.native
  def pushParseAndPop[T](
    `object`: T,
    parsersNS: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[Parser]],
    node: stdLib.Element,
    objectStack: js.Array[_],
    opt_this: js.Any
  ): T = js.native
  def pushSerializeAndPop[O, T](
    `object`: O,
    serializersNS: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[Serializer]],
    nodeFactory: js.ThisFunction3[
      /* this */ T, 
      /* p0 */ js.Any, 
      /* p1 */ js.Array[_], 
      /* p2 */ java.lang.String, 
      stdLib.Node
    ],
    values: js.Array[_],
    objectStack: js.Array[_]
  ): O = js.native
  def pushSerializeAndPop[O, T](
    `object`: O,
    serializersNS: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[Serializer]],
    nodeFactory: js.ThisFunction3[
      /* this */ T, 
      /* p0 */ js.Any, 
      /* p1 */ js.Array[_], 
      /* p2 */ java.lang.String, 
      stdLib.Node
    ],
    values: js.Array[_],
    objectStack: js.Array[_],
    opt_keys: js.Array[java.lang.String]
  ): O = js.native
  def pushSerializeAndPop[O, T](
    `object`: O,
    serializersNS: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[Serializer]],
    nodeFactory: js.ThisFunction3[
      /* this */ T, 
      /* p0 */ js.Any, 
      /* p1 */ js.Array[_], 
      /* p2 */ java.lang.String, 
      stdLib.Node
    ],
    values: js.Array[_],
    objectStack: js.Array[_],
    opt_keys: js.Array[java.lang.String],
    opt_this: T
  ): O = js.native
  def serialize[T](
    serializersNS: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[Serializer]],
    nodeFactory: js.ThisFunction3[
      /* this */ T, 
      /* p0 */ js.Any, 
      /* p1 */ js.Array[_], 
      /* p2 */ java.lang.String, 
      stdLib.Node
    ],
    values: js.Array[_],
    objectStack: js.Array[_]
  ): scala.Unit = js.native
  def serialize[T](
    serializersNS: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[Serializer]],
    nodeFactory: js.ThisFunction3[
      /* this */ T, 
      /* p0 */ js.Any, 
      /* p1 */ js.Array[_], 
      /* p2 */ java.lang.String, 
      stdLib.Node
    ],
    values: js.Array[_],
    objectStack: js.Array[_],
    opt_keys: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def serialize[T](
    serializersNS: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[Serializer]],
    nodeFactory: js.ThisFunction3[
      /* this */ T, 
      /* p0 */ js.Any, 
      /* p1 */ js.Array[_], 
      /* p2 */ java.lang.String, 
      stdLib.Node
    ],
    values: js.Array[_],
    objectStack: js.Array[_],
    opt_keys: js.Array[java.lang.String],
    opt_this: T
  ): scala.Unit = js.native
}

