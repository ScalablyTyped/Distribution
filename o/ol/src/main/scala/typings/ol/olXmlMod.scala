package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.std.Document
import typings.std.Element
import typings.std.Node
import typings.std.XMLSerializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object olXmlMod {
  
  @JSImport("ol/xml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def OBJECT_PROPERTY_NODE_FACTORY(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("OBJECT_PROPERTY_NODE_FACTORY")().asInstanceOf[Unit]
  
  @JSImport("ol/xml", "XML_SCHEMA_INSTANCE_URI")
  @js.native
  val XML_SCHEMA_INSTANCE_URI: String = js.native
  
  @scala.inline
  def createElementNS(namespaceURI: String, qualifiedName: String): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElementNS")(namespaceURI.asInstanceOf[js.Any], qualifiedName.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  @scala.inline
  def getAllTextContent(node: Node, normalizeWhitespace: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllTextContent")(node.asInstanceOf[js.Any], normalizeWhitespace.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getAttributeNS(node: Element, namespaceURI: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getAttributeNS")(node.asInstanceOf[js.Any], namespaceURI.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getDocument(): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocument")().asInstanceOf[Document]
  
  @scala.inline
  def getXMLSerializer(): XMLSerializer = ^.asInstanceOf[js.Dynamic].applyDynamic("getXMLSerializer")().asInstanceOf[XMLSerializer]
  
  @scala.inline
  def isDocument(`object`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDocument")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def makeArrayExtender[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Node, /* p1 */ js.Array[js.Any], js.UndefOr[js.Array[js.Any]]]
  ): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("makeArrayExtender")(valueReader.asInstanceOf[js.Any]).asInstanceOf[Parser]
  @scala.inline
  def makeArrayExtender[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Node, /* p1 */ js.Array[js.Any], js.UndefOr[js.Array[js.Any]]],
    opt_this: T
  ): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("makeArrayExtender")(valueReader.asInstanceOf[js.Any], opt_this.asInstanceOf[js.Any])).asInstanceOf[Parser]
  
  @scala.inline
  def makeArrayPusher[T](valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Element, /* p1 */ js.Array[js.Any], js.Any]): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("makeArrayPusher")(valueReader.asInstanceOf[js.Any]).asInstanceOf[Parser]
  @scala.inline
  def makeArrayPusher[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Element, /* p1 */ js.Array[js.Any], js.Any],
    opt_this: T
  ): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("makeArrayPusher")(valueReader.asInstanceOf[js.Any], opt_this.asInstanceOf[js.Any])).asInstanceOf[Parser]
  
  @scala.inline
  def makeArraySerializer[T, V](
    nodeWriter: js.ThisFunction3[/* this */ T, /* p0 */ Element, /* p1 */ V, /* p2 */ js.Array[js.Any], Unit]
  ): Serializer = ^.asInstanceOf[js.Dynamic].applyDynamic("makeArraySerializer")(nodeWriter.asInstanceOf[js.Any]).asInstanceOf[Serializer]
  @scala.inline
  def makeArraySerializer[T, V](
    nodeWriter: js.ThisFunction3[/* this */ T, /* p0 */ Element, /* p1 */ V, /* p2 */ js.Array[js.Any], Unit],
    opt_this: T
  ): Serializer = (^.asInstanceOf[js.Dynamic].applyDynamic("makeArraySerializer")(nodeWriter.asInstanceOf[js.Any], opt_this.asInstanceOf[js.Any])).asInstanceOf[Serializer]
  
  @scala.inline
  def makeChildAppender[T, V](
    nodeWriter: js.ThisFunction3[/* this */ T, /* p0 */ Node, /* p1 */ V, /* p2 */ js.Array[js.Any], Unit]
  ): Serializer = ^.asInstanceOf[js.Dynamic].applyDynamic("makeChildAppender")(nodeWriter.asInstanceOf[js.Any]).asInstanceOf[Serializer]
  @scala.inline
  def makeChildAppender[T, V](
    nodeWriter: js.ThisFunction3[/* this */ T, /* p0 */ Node, /* p1 */ V, /* p2 */ js.Array[js.Any], Unit],
    opt_this: T
  ): Serializer = (^.asInstanceOf[js.Dynamic].applyDynamic("makeChildAppender")(nodeWriter.asInstanceOf[js.Any], opt_this.asInstanceOf[js.Any])).asInstanceOf[Serializer]
  
  @scala.inline
  def makeObjectPropertyPusher[T](valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Element, /* p1 */ js.Array[js.Any], js.Any]): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("makeObjectPropertyPusher")(valueReader.asInstanceOf[js.Any]).asInstanceOf[Parser]
  @scala.inline
  def makeObjectPropertyPusher[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Element, /* p1 */ js.Array[js.Any], js.Any],
    opt_property: String
  ): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("makeObjectPropertyPusher")(valueReader.asInstanceOf[js.Any], opt_property.asInstanceOf[js.Any])).asInstanceOf[Parser]
  @scala.inline
  def makeObjectPropertyPusher[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Element, /* p1 */ js.Array[js.Any], js.Any],
    opt_property: String,
    opt_this: T
  ): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("makeObjectPropertyPusher")(valueReader.asInstanceOf[js.Any], opt_property.asInstanceOf[js.Any], opt_this.asInstanceOf[js.Any])).asInstanceOf[Parser]
  @scala.inline
  def makeObjectPropertyPusher[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Element, /* p1 */ js.Array[js.Any], js.Any],
    opt_property: Unit,
    opt_this: T
  ): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("makeObjectPropertyPusher")(valueReader.asInstanceOf[js.Any], opt_property.asInstanceOf[js.Any], opt_this.asInstanceOf[js.Any])).asInstanceOf[Parser]
  
  @scala.inline
  def makeObjectPropertySetter[T](valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Element, /* p1 */ js.Array[js.Any], js.Any]): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("makeObjectPropertySetter")(valueReader.asInstanceOf[js.Any]).asInstanceOf[Parser]
  @scala.inline
  def makeObjectPropertySetter[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Element, /* p1 */ js.Array[js.Any], js.Any],
    opt_property: String
  ): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("makeObjectPropertySetter")(valueReader.asInstanceOf[js.Any], opt_property.asInstanceOf[js.Any])).asInstanceOf[Parser]
  @scala.inline
  def makeObjectPropertySetter[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Element, /* p1 */ js.Array[js.Any], js.Any],
    opt_property: String,
    opt_this: T
  ): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("makeObjectPropertySetter")(valueReader.asInstanceOf[js.Any], opt_property.asInstanceOf[js.Any], opt_this.asInstanceOf[js.Any])).asInstanceOf[Parser]
  @scala.inline
  def makeObjectPropertySetter[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Element, /* p1 */ js.Array[js.Any], js.Any],
    opt_property: Unit,
    opt_this: T
  ): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("makeObjectPropertySetter")(valueReader.asInstanceOf[js.Any], opt_property.asInstanceOf[js.Any], opt_this.asInstanceOf[js.Any])).asInstanceOf[Parser]
  
  @scala.inline
  def makeReplacer[T](valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Node, /* p1 */ js.Array[js.Any], js.Any]): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("makeReplacer")(valueReader.asInstanceOf[js.Any]).asInstanceOf[Parser]
  @scala.inline
  def makeReplacer[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Node, /* p1 */ js.Array[js.Any], js.Any],
    opt_this: T
  ): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("makeReplacer")(valueReader.asInstanceOf[js.Any], opt_this.asInstanceOf[js.Any])).asInstanceOf[Parser]
  
  @scala.inline
  def makeSequence(`object`: StringDictionary[js.Any], orderedKeys: js.Array[String]): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSequence")(`object`.asInstanceOf[js.Any], orderedKeys.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  @scala.inline
  def makeSimpleNodeFactory(): js.Function3[
    /* p0 */ js.Any, 
    /* p1 */ js.Array[js.Any], 
    /* p2 */ js.UndefOr[String], 
    js.UndefOr[Node]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSimpleNodeFactory")().asInstanceOf[js.Function3[
    /* p0 */ js.Any, 
    /* p1 */ js.Array[js.Any], 
    /* p2 */ js.UndefOr[String], 
    js.UndefOr[Node]
  ]]
  @scala.inline
  def makeSimpleNodeFactory(opt_nodeName: String): js.Function3[
    /* p0 */ js.Any, 
    /* p1 */ js.Array[js.Any], 
    /* p2 */ js.UndefOr[String], 
    js.UndefOr[Node]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSimpleNodeFactory")(opt_nodeName.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* p0 */ js.Any, 
    /* p1 */ js.Array[js.Any], 
    /* p2 */ js.UndefOr[String], 
    js.UndefOr[Node]
  ]]
  @scala.inline
  def makeSimpleNodeFactory(opt_nodeName: String, opt_namespaceURI: String): js.Function3[
    /* p0 */ js.Any, 
    /* p1 */ js.Array[js.Any], 
    /* p2 */ js.UndefOr[String], 
    js.UndefOr[Node]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSimpleNodeFactory")(opt_nodeName.asInstanceOf[js.Any], opt_namespaceURI.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* p0 */ js.Any, 
    /* p1 */ js.Array[js.Any], 
    /* p2 */ js.UndefOr[String], 
    js.UndefOr[Node]
  ]]
  @scala.inline
  def makeSimpleNodeFactory(opt_nodeName: Unit, opt_namespaceURI: String): js.Function3[
    /* p0 */ js.Any, 
    /* p1 */ js.Array[js.Any], 
    /* p2 */ js.UndefOr[String], 
    js.UndefOr[Node]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSimpleNodeFactory")(opt_nodeName.asInstanceOf[js.Any], opt_namespaceURI.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* p0 */ js.Any, 
    /* p1 */ js.Array[js.Any], 
    /* p2 */ js.UndefOr[String], 
    js.UndefOr[Node]
  ]]
  
  @scala.inline
  def makeStructureNS[T](namespaceURIs: js.Array[String], structure: T): StringDictionary[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeStructureNS")(namespaceURIs.asInstanceOf[js.Any], structure.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[T]]
  @scala.inline
  def makeStructureNS[T](namespaceURIs: js.Array[String], structure: T, opt_structureNS: StringDictionary[T]): StringDictionary[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeStructureNS")(namespaceURIs.asInstanceOf[js.Any], structure.asInstanceOf[js.Any], opt_structureNS.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[T]]
  
  @scala.inline
  def parse(xml: String): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(xml.asInstanceOf[js.Any]).asInstanceOf[Document]
  
  @scala.inline
  def parseNode(
    parsersNS: StringDictionary[StringDictionary[Parser]],
    node: Element,
    objectStack: js.Array[js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseNode")(parsersNS.asInstanceOf[js.Any], node.asInstanceOf[js.Any], objectStack.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def parseNode(
    parsersNS: StringDictionary[StringDictionary[Parser]],
    node: Element,
    objectStack: js.Array[js.Any],
    opt_this: js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseNode")(parsersNS.asInstanceOf[js.Any], node.asInstanceOf[js.Any], objectStack.asInstanceOf[js.Any], opt_this.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def pushParseAndPop[T](
    `object`: T,
    parsersNS: StringDictionary[StringDictionary[Parser]],
    node: Element,
    objectStack: js.Array[js.Any]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pushParseAndPop")(`object`.asInstanceOf[js.Any], parsersNS.asInstanceOf[js.Any], node.asInstanceOf[js.Any], objectStack.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def pushParseAndPop[T](
    `object`: T,
    parsersNS: StringDictionary[StringDictionary[Parser]],
    node: Element,
    objectStack: js.Array[js.Any],
    opt_this: js.Any
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pushParseAndPop")(`object`.asInstanceOf[js.Any], parsersNS.asInstanceOf[js.Any], node.asInstanceOf[js.Any], objectStack.asInstanceOf[js.Any], opt_this.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def pushSerializeAndPop[O, T](
    `object`: O,
    serializersNS: StringDictionary[StringDictionary[Serializer]],
    nodeFactory: js.ThisFunction3[
      /* this */ T, 
      /* p0 */ js.Any, 
      /* p1 */ js.Array[js.Any], 
      /* p2 */ js.UndefOr[String], 
      js.UndefOr[Node]
    ],
    values: js.Array[js.Any],
    objectStack: js.Array[js.Any]
  ): js.UndefOr[O] = (^.asInstanceOf[js.Dynamic].applyDynamic("pushSerializeAndPop")(`object`.asInstanceOf[js.Any], serializersNS.asInstanceOf[js.Any], nodeFactory.asInstanceOf[js.Any], values.asInstanceOf[js.Any], objectStack.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[O]]
  @scala.inline
  def pushSerializeAndPop[O, T](
    `object`: O,
    serializersNS: StringDictionary[StringDictionary[Serializer]],
    nodeFactory: js.ThisFunction3[
      /* this */ T, 
      /* p0 */ js.Any, 
      /* p1 */ js.Array[js.Any], 
      /* p2 */ js.UndefOr[String], 
      js.UndefOr[Node]
    ],
    values: js.Array[js.Any],
    objectStack: js.Array[js.Any],
    opt_keys: js.Array[String]
  ): js.UndefOr[O] = (^.asInstanceOf[js.Dynamic].applyDynamic("pushSerializeAndPop")(`object`.asInstanceOf[js.Any], serializersNS.asInstanceOf[js.Any], nodeFactory.asInstanceOf[js.Any], values.asInstanceOf[js.Any], objectStack.asInstanceOf[js.Any], opt_keys.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[O]]
  @scala.inline
  def pushSerializeAndPop[O, T](
    `object`: O,
    serializersNS: StringDictionary[StringDictionary[Serializer]],
    nodeFactory: js.ThisFunction3[
      /* this */ T, 
      /* p0 */ js.Any, 
      /* p1 */ js.Array[js.Any], 
      /* p2 */ js.UndefOr[String], 
      js.UndefOr[Node]
    ],
    values: js.Array[js.Any],
    objectStack: js.Array[js.Any],
    opt_keys: js.Array[String],
    opt_this: T
  ): js.UndefOr[O] = (^.asInstanceOf[js.Dynamic].applyDynamic("pushSerializeAndPop")(`object`.asInstanceOf[js.Any], serializersNS.asInstanceOf[js.Any], nodeFactory.asInstanceOf[js.Any], values.asInstanceOf[js.Any], objectStack.asInstanceOf[js.Any], opt_keys.asInstanceOf[js.Any], opt_this.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[O]]
  @scala.inline
  def pushSerializeAndPop[O, T](
    `object`: O,
    serializersNS: StringDictionary[StringDictionary[Serializer]],
    nodeFactory: js.ThisFunction3[
      /* this */ T, 
      /* p0 */ js.Any, 
      /* p1 */ js.Array[js.Any], 
      /* p2 */ js.UndefOr[String], 
      js.UndefOr[Node]
    ],
    values: js.Array[js.Any],
    objectStack: js.Array[js.Any],
    opt_keys: Unit,
    opt_this: T
  ): js.UndefOr[O] = (^.asInstanceOf[js.Dynamic].applyDynamic("pushSerializeAndPop")(`object`.asInstanceOf[js.Any], serializersNS.asInstanceOf[js.Any], nodeFactory.asInstanceOf[js.Any], values.asInstanceOf[js.Any], objectStack.asInstanceOf[js.Any], opt_keys.asInstanceOf[js.Any], opt_this.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[O]]
  
  @scala.inline
  def registerDocument(document: Document): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerDocument")(document.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def registerXMLSerializer(xmlSerializer: XMLSerializer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerXMLSerializer")(xmlSerializer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def serialize[T](
    serializersNS: StringDictionary[StringDictionary[Serializer]],
    nodeFactory: js.ThisFunction3[
      /* this */ T, 
      /* p0 */ js.Any, 
      /* p1 */ js.Array[js.Any], 
      /* p2 */ js.UndefOr[String], 
      js.UndefOr[Node]
    ],
    values: js.Array[js.Any],
    objectStack: js.Array[js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(serializersNS.asInstanceOf[js.Any], nodeFactory.asInstanceOf[js.Any], values.asInstanceOf[js.Any], objectStack.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def serialize[T](
    serializersNS: StringDictionary[StringDictionary[Serializer]],
    nodeFactory: js.ThisFunction3[
      /* this */ T, 
      /* p0 */ js.Any, 
      /* p1 */ js.Array[js.Any], 
      /* p2 */ js.UndefOr[String], 
      js.UndefOr[Node]
    ],
    values: js.Array[js.Any],
    objectStack: js.Array[js.Any],
    opt_keys: js.Array[String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(serializersNS.asInstanceOf[js.Any], nodeFactory.asInstanceOf[js.Any], values.asInstanceOf[js.Any], objectStack.asInstanceOf[js.Any], opt_keys.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def serialize[T](
    serializersNS: StringDictionary[StringDictionary[Serializer]],
    nodeFactory: js.ThisFunction3[
      /* this */ T, 
      /* p0 */ js.Any, 
      /* p1 */ js.Array[js.Any], 
      /* p2 */ js.UndefOr[String], 
      js.UndefOr[Node]
    ],
    values: js.Array[js.Any],
    objectStack: js.Array[js.Any],
    opt_keys: js.Array[String],
    opt_this: T
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(serializersNS.asInstanceOf[js.Any], nodeFactory.asInstanceOf[js.Any], values.asInstanceOf[js.Any], objectStack.asInstanceOf[js.Any], opt_keys.asInstanceOf[js.Any], opt_this.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def serialize[T](
    serializersNS: StringDictionary[StringDictionary[Serializer]],
    nodeFactory: js.ThisFunction3[
      /* this */ T, 
      /* p0 */ js.Any, 
      /* p1 */ js.Array[js.Any], 
      /* p2 */ js.UndefOr[String], 
      js.UndefOr[Node]
    ],
    values: js.Array[js.Any],
    objectStack: js.Array[js.Any],
    opt_keys: Unit,
    opt_this: T
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(serializersNS.asInstanceOf[js.Any], nodeFactory.asInstanceOf[js.Any], values.asInstanceOf[js.Any], objectStack.asInstanceOf[js.Any], opt_keys.asInstanceOf[js.Any], opt_this.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait NodeStackItem extends StObject {
    
    var node: Node
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
