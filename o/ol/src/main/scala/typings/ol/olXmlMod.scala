package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.std.Document
import typings.std.Element
import typings.std.Node
import typings.std.XMLSerializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object olXmlMod {
  
  @JSImport("ol/xml", "OBJECT_PROPERTY_NODE_FACTORY")
  @js.native
  def OBJECT_PROPERTY_NODE_FACTORY(): Unit = js.native
  
  @JSImport("ol/xml", "XML_SCHEMA_INSTANCE_URI")
  @js.native
  val XML_SCHEMA_INSTANCE_URI: String = js.native
  
  @JSImport("ol/xml", "createElementNS")
  @js.native
  def createElementNS(namespaceURI: String, qualifiedName: String): Element = js.native
  
  @JSImport("ol/xml", "getAllTextContent")
  @js.native
  def getAllTextContent(node: Node, normalizeWhitespace: Boolean): String = js.native
  
  @JSImport("ol/xml", "getAttributeNS")
  @js.native
  def getAttributeNS(node: Element, namespaceURI: String, name: String): String = js.native
  
  @JSImport("ol/xml", "getDocument")
  @js.native
  def getDocument(): Document = js.native
  
  @JSImport("ol/xml", "getXMLSerializer")
  @js.native
  def getXMLSerializer(): XMLSerializer = js.native
  
  @JSImport("ol/xml", "isDocument")
  @js.native
  def isDocument(`object`: js.Any): Boolean = js.native
  
  @JSImport("ol/xml", "makeArrayExtender")
  @js.native
  def makeArrayExtender[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Node, /* p1 */ js.Array[_], js.UndefOr[js.Array[_]]]
  ): Parser = js.native
  @JSImport("ol/xml", "makeArrayExtender")
  @js.native
  def makeArrayExtender[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Node, /* p1 */ js.Array[_], js.UndefOr[js.Array[_]]],
    opt_this: T
  ): Parser = js.native
  
  @JSImport("ol/xml", "makeArrayPusher")
  @js.native
  def makeArrayPusher[T](valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Element, /* p1 */ js.Array[_], _]): Parser = js.native
  @JSImport("ol/xml", "makeArrayPusher")
  @js.native
  def makeArrayPusher[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Element, /* p1 */ js.Array[_], _],
    opt_this: T
  ): Parser = js.native
  
  @JSImport("ol/xml", "makeArraySerializer")
  @js.native
  def makeArraySerializer[T, V](
    nodeWriter: js.ThisFunction3[/* this */ T, /* p0 */ Element, /* p1 */ V, /* p2 */ js.Array[_], Unit]
  ): Serializer = js.native
  @JSImport("ol/xml", "makeArraySerializer")
  @js.native
  def makeArraySerializer[T, V](
    nodeWriter: js.ThisFunction3[/* this */ T, /* p0 */ Element, /* p1 */ V, /* p2 */ js.Array[_], Unit],
    opt_this: T
  ): Serializer = js.native
  
  @JSImport("ol/xml", "makeChildAppender")
  @js.native
  def makeChildAppender[T, V](nodeWriter: js.ThisFunction3[/* this */ T, /* p0 */ Node, /* p1 */ V, /* p2 */ js.Array[_], Unit]): Serializer = js.native
  @JSImport("ol/xml", "makeChildAppender")
  @js.native
  def makeChildAppender[T, V](
    nodeWriter: js.ThisFunction3[/* this */ T, /* p0 */ Node, /* p1 */ V, /* p2 */ js.Array[_], Unit],
    opt_this: T
  ): Serializer = js.native
  
  @JSImport("ol/xml", "makeObjectPropertyPusher")
  @js.native
  def makeObjectPropertyPusher[T](valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Element, /* p1 */ js.Array[_], _]): Parser = js.native
  @JSImport("ol/xml", "makeObjectPropertyPusher")
  @js.native
  def makeObjectPropertyPusher[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Element, /* p1 */ js.Array[_], _],
    opt_property: js.UndefOr[scala.Nothing],
    opt_this: T
  ): Parser = js.native
  @JSImport("ol/xml", "makeObjectPropertyPusher")
  @js.native
  def makeObjectPropertyPusher[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Element, /* p1 */ js.Array[_], _],
    opt_property: String
  ): Parser = js.native
  @JSImport("ol/xml", "makeObjectPropertyPusher")
  @js.native
  def makeObjectPropertyPusher[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Element, /* p1 */ js.Array[_], _],
    opt_property: String,
    opt_this: T
  ): Parser = js.native
  
  @JSImport("ol/xml", "makeObjectPropertySetter")
  @js.native
  def makeObjectPropertySetter[T](valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Element, /* p1 */ js.Array[_], _]): Parser = js.native
  @JSImport("ol/xml", "makeObjectPropertySetter")
  @js.native
  def makeObjectPropertySetter[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Element, /* p1 */ js.Array[_], _],
    opt_property: js.UndefOr[scala.Nothing],
    opt_this: T
  ): Parser = js.native
  @JSImport("ol/xml", "makeObjectPropertySetter")
  @js.native
  def makeObjectPropertySetter[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Element, /* p1 */ js.Array[_], _],
    opt_property: String
  ): Parser = js.native
  @JSImport("ol/xml", "makeObjectPropertySetter")
  @js.native
  def makeObjectPropertySetter[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Element, /* p1 */ js.Array[_], _],
    opt_property: String,
    opt_this: T
  ): Parser = js.native
  
  @JSImport("ol/xml", "makeReplacer")
  @js.native
  def makeReplacer[T](valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Node, /* p1 */ js.Array[_], _]): Parser = js.native
  @JSImport("ol/xml", "makeReplacer")
  @js.native
  def makeReplacer[T](valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Node, /* p1 */ js.Array[_], _], opt_this: T): Parser = js.native
  
  @JSImport("ol/xml", "makeSequence")
  @js.native
  def makeSequence(`object`: StringDictionary[js.Any], orderedKeys: js.Array[String]): js.Array[_] = js.native
  
  @JSImport("ol/xml", "makeSimpleNodeFactory")
  @js.native
  def makeSimpleNodeFactory(): js.Function3[/* p0 */ js.Any, /* p1 */ js.Array[_], /* p2 */ js.UndefOr[String], js.UndefOr[Node]] = js.native
  @JSImport("ol/xml", "makeSimpleNodeFactory")
  @js.native
  def makeSimpleNodeFactory(opt_nodeName: js.UndefOr[scala.Nothing], opt_namespaceURI: String): js.Function3[/* p0 */ js.Any, /* p1 */ js.Array[_], /* p2 */ js.UndefOr[String], js.UndefOr[Node]] = js.native
  @JSImport("ol/xml", "makeSimpleNodeFactory")
  @js.native
  def makeSimpleNodeFactory(opt_nodeName: String): js.Function3[/* p0 */ js.Any, /* p1 */ js.Array[_], /* p2 */ js.UndefOr[String], js.UndefOr[Node]] = js.native
  @JSImport("ol/xml", "makeSimpleNodeFactory")
  @js.native
  def makeSimpleNodeFactory(opt_nodeName: String, opt_namespaceURI: String): js.Function3[/* p0 */ js.Any, /* p1 */ js.Array[_], /* p2 */ js.UndefOr[String], js.UndefOr[Node]] = js.native
  
  @JSImport("ol/xml", "makeStructureNS")
  @js.native
  def makeStructureNS[T](namespaceURIs: js.Array[String], structure: T): StringDictionary[T] = js.native
  @JSImport("ol/xml", "makeStructureNS")
  @js.native
  def makeStructureNS[T](namespaceURIs: js.Array[String], structure: T, opt_structureNS: StringDictionary[T]): StringDictionary[T] = js.native
  
  @JSImport("ol/xml", "parse")
  @js.native
  def parse(xml: String): Document = js.native
  
  @JSImport("ol/xml", "parseNode")
  @js.native
  def parseNode(parsersNS: StringDictionary[StringDictionary[Parser]], node: Element, objectStack: js.Array[_]): Unit = js.native
  @JSImport("ol/xml", "parseNode")
  @js.native
  def parseNode(
    parsersNS: StringDictionary[StringDictionary[Parser]],
    node: Element,
    objectStack: js.Array[_],
    opt_this: js.Any
  ): Unit = js.native
  
  @JSImport("ol/xml", "pushParseAndPop")
  @js.native
  def pushParseAndPop[T](
    `object`: T,
    parsersNS: StringDictionary[StringDictionary[Parser]],
    node: Element,
    objectStack: js.Array[_]
  ): T = js.native
  @JSImport("ol/xml", "pushParseAndPop")
  @js.native
  def pushParseAndPop[T](
    `object`: T,
    parsersNS: StringDictionary[StringDictionary[Parser]],
    node: Element,
    objectStack: js.Array[_],
    opt_this: js.Any
  ): T = js.native
  
  @JSImport("ol/xml", "pushSerializeAndPop")
  @js.native
  def pushSerializeAndPop[O, T](
    `object`: O,
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
  ): js.UndefOr[O] = js.native
  @JSImport("ol/xml", "pushSerializeAndPop")
  @js.native
  def pushSerializeAndPop[O, T](
    `object`: O,
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
    opt_keys: js.UndefOr[scala.Nothing],
    opt_this: T
  ): js.UndefOr[O] = js.native
  @JSImport("ol/xml", "pushSerializeAndPop")
  @js.native
  def pushSerializeAndPop[O, T](
    `object`: O,
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
  ): js.UndefOr[O] = js.native
  @JSImport("ol/xml", "pushSerializeAndPop")
  @js.native
  def pushSerializeAndPop[O, T](
    `object`: O,
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
  ): js.UndefOr[O] = js.native
  
  @JSImport("ol/xml", "registerDocument")
  @js.native
  def registerDocument(document: Document): Unit = js.native
  
  @JSImport("ol/xml", "registerXMLSerializer")
  @js.native
  def registerXMLSerializer(xmlSerializer: XMLSerializer): Unit = js.native
  
  @JSImport("ol/xml", "serialize")
  @js.native
  def serialize[T](
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
  @JSImport("ol/xml", "serialize")
  @js.native
  def serialize[T](
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
    opt_keys: js.UndefOr[scala.Nothing],
    opt_this: T
  ): Unit = js.native
  @JSImport("ol/xml", "serialize")
  @js.native
  def serialize[T](
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
  @JSImport("ol/xml", "serialize")
  @js.native
  def serialize[T](
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
  
  @js.native
  trait NodeStackItem extends StObject {
    
    var node: Node = js.native
  }
  object NodeStackItem {
    
    @scala.inline
    def apply(node: Node): NodeStackItem = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeStackItem]
    }
    
    @scala.inline
    implicit class NodeStackItemMutableBuilder[Self <: NodeStackItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  type Parser = js.Function2[/* p0 */ Element, /* p1 */ js.Array[js.Any], Unit]
  
  type Serializer = js.Function3[/* p0 */ Element, /* p1 */ js.Any, /* p2 */ js.Array[js.Any], Unit]
}
