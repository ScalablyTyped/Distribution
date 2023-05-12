package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.std.Document
import typings.std.Element
import typings.std.Node
import typings.std.XMLSerializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlMod {
  
  @JSImport("ol/xml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def OBJECT_PROPERTY_NODE_FACTORY(arg0: Any, arg1: js.Array[Any]): js.UndefOr[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("OBJECT_PROPERTY_NODE_FACTORY")(arg0.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Node]]
  inline def OBJECT_PROPERTY_NODE_FACTORY(arg0: Any, arg1: js.Array[Any], arg2: String): js.UndefOr[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("OBJECT_PROPERTY_NODE_FACTORY")(arg0.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Node]]
  
  @JSImport("ol/xml", "XML_SCHEMA_INSTANCE_URI")
  @js.native
  val XML_SCHEMA_INSTANCE_URI: String = js.native
  
  inline def createElementNS(namespaceURI: String, qualifiedName: String): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElementNS")(namespaceURI.asInstanceOf[js.Any], qualifiedName.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  inline def getAllTextContent(node: Node, normalizeWhitespace: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllTextContent")(node.asInstanceOf[js.Any], normalizeWhitespace.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getAllTextContent_(node: Node, normalizeWhitespace: Boolean, accumulator: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllTextContent_")(node.asInstanceOf[js.Any], normalizeWhitespace.asInstanceOf[js.Any], accumulator.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def getAttributeNS(node: Element, namespaceURI: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getAttributeNS")(node.asInstanceOf[js.Any], namespaceURI.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getAttributeNS(node: Element, namespaceURI: Null, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getAttributeNS")(node.asInstanceOf[js.Any], namespaceURI.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getDocument(): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocument")().asInstanceOf[Document]
  
  inline def getXMLSerializer(): XMLSerializer = ^.asInstanceOf[js.Dynamic].applyDynamic("getXMLSerializer")().asInstanceOf[XMLSerializer]
  
  inline def isDocument(`object`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDocument")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def makeArrayExtender[T](
    valueReader: js.ThisFunction2[/* this */ T, /* arg1 */ Node, /* arg2 */ js.Array[Any], js.UndefOr[js.Array[Any]]]
  ): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("makeArrayExtender")(valueReader.asInstanceOf[js.Any]).asInstanceOf[Parser]
  inline def makeArrayExtender[T](
    valueReader: js.ThisFunction2[/* this */ T, /* arg1 */ Node, /* arg2 */ js.Array[Any], js.UndefOr[js.Array[Any]]],
    thisArg: T
  ): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("makeArrayExtender")(valueReader.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Parser]
  
  inline def makeArrayPusher[T](valueReader: js.ThisFunction2[/* this */ T, /* arg1 */ Element, /* arg2 */ js.Array[Any], Any]): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("makeArrayPusher")(valueReader.asInstanceOf[js.Any]).asInstanceOf[Parser]
  inline def makeArrayPusher[T](
    valueReader: js.ThisFunction2[/* this */ T, /* arg1 */ Element, /* arg2 */ js.Array[Any], Any],
    thisArg: T
  ): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("makeArrayPusher")(valueReader.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Parser]
  
  inline def makeArraySerializer[T, V](
    nodeWriter: js.ThisFunction3[/* this */ T, /* arg1 */ Element, /* arg2 */ V, /* arg3 */ js.Array[Any], Unit]
  ): Serializer = ^.asInstanceOf[js.Dynamic].applyDynamic("makeArraySerializer")(nodeWriter.asInstanceOf[js.Any]).asInstanceOf[Serializer]
  inline def makeArraySerializer[T, V](
    nodeWriter: js.ThisFunction3[/* this */ T, /* arg1 */ Element, /* arg2 */ V, /* arg3 */ js.Array[Any], Unit],
    thisArg: T
  ): Serializer = (^.asInstanceOf[js.Dynamic].applyDynamic("makeArraySerializer")(nodeWriter.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Serializer]
  
  inline def makeChildAppender[T, V](
    nodeWriter: js.ThisFunction3[/* this */ T, /* arg1 */ Node, /* arg2 */ V, /* arg3 */ js.Array[Any], Unit]
  ): Serializer = ^.asInstanceOf[js.Dynamic].applyDynamic("makeChildAppender")(nodeWriter.asInstanceOf[js.Any]).asInstanceOf[Serializer]
  inline def makeChildAppender[T, V](
    nodeWriter: js.ThisFunction3[/* this */ T, /* arg1 */ Node, /* arg2 */ V, /* arg3 */ js.Array[Any], Unit],
    thisArg: T
  ): Serializer = (^.asInstanceOf[js.Dynamic].applyDynamic("makeChildAppender")(nodeWriter.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Serializer]
  
  inline def makeObjectPropertyPusher[T](valueReader: js.ThisFunction2[/* this */ T, /* arg1 */ Element, /* arg2 */ js.Array[Any], Any]): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("makeObjectPropertyPusher")(valueReader.asInstanceOf[js.Any]).asInstanceOf[Parser]
  inline def makeObjectPropertyPusher[T](
    valueReader: js.ThisFunction2[/* this */ T, /* arg1 */ Element, /* arg2 */ js.Array[Any], Any],
    property: String
  ): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("makeObjectPropertyPusher")(valueReader.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Parser]
  inline def makeObjectPropertyPusher[T](
    valueReader: js.ThisFunction2[/* this */ T, /* arg1 */ Element, /* arg2 */ js.Array[Any], Any],
    property: String,
    thisArg: T
  ): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("makeObjectPropertyPusher")(valueReader.asInstanceOf[js.Any], property.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Parser]
  inline def makeObjectPropertyPusher[T](
    valueReader: js.ThisFunction2[/* this */ T, /* arg1 */ Element, /* arg2 */ js.Array[Any], Any],
    property: Unit,
    thisArg: T
  ): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("makeObjectPropertyPusher")(valueReader.asInstanceOf[js.Any], property.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Parser]
  
  inline def makeObjectPropertySetter[T](valueReader: js.ThisFunction2[/* this */ T, /* arg1 */ Element, /* arg2 */ js.Array[Any], Any]): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("makeObjectPropertySetter")(valueReader.asInstanceOf[js.Any]).asInstanceOf[Parser]
  inline def makeObjectPropertySetter[T](
    valueReader: js.ThisFunction2[/* this */ T, /* arg1 */ Element, /* arg2 */ js.Array[Any], Any],
    property: String
  ): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("makeObjectPropertySetter")(valueReader.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Parser]
  inline def makeObjectPropertySetter[T](
    valueReader: js.ThisFunction2[/* this */ T, /* arg1 */ Element, /* arg2 */ js.Array[Any], Any],
    property: String,
    thisArg: T
  ): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("makeObjectPropertySetter")(valueReader.asInstanceOf[js.Any], property.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Parser]
  inline def makeObjectPropertySetter[T](
    valueReader: js.ThisFunction2[/* this */ T, /* arg1 */ Element, /* arg2 */ js.Array[Any], Any],
    property: Unit,
    thisArg: T
  ): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("makeObjectPropertySetter")(valueReader.asInstanceOf[js.Any], property.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Parser]
  
  inline def makeReplacer[T](valueReader: js.ThisFunction2[/* this */ T, /* arg1 */ Node, /* arg2 */ js.Array[Any], Any]): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("makeReplacer")(valueReader.asInstanceOf[js.Any]).asInstanceOf[Parser]
  inline def makeReplacer[T](
    valueReader: js.ThisFunction2[/* this */ T, /* arg1 */ Node, /* arg2 */ js.Array[Any], Any],
    thisArg: T
  ): Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("makeReplacer")(valueReader.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Parser]
  
  inline def makeSequence(`object`: StringDictionary[Any], orderedKeys: js.Array[String]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSequence")(`object`.asInstanceOf[js.Any], orderedKeys.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def makeSimpleNodeFactory(): js.Function3[
    /* arg0 */ Any, 
    /* arg1 */ js.Array[Any], 
    /* arg2 */ js.UndefOr[String], 
    js.UndefOr[Node]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSimpleNodeFactory")().asInstanceOf[js.Function3[
    /* arg0 */ Any, 
    /* arg1 */ js.Array[Any], 
    /* arg2 */ js.UndefOr[String], 
    js.UndefOr[Node]
  ]]
  inline def makeSimpleNodeFactory(fixedNodeName: String): js.Function3[
    /* arg0 */ Any, 
    /* arg1 */ js.Array[Any], 
    /* arg2 */ js.UndefOr[String], 
    js.UndefOr[Node]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSimpleNodeFactory")(fixedNodeName.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* arg0 */ Any, 
    /* arg1 */ js.Array[Any], 
    /* arg2 */ js.UndefOr[String], 
    js.UndefOr[Node]
  ]]
  inline def makeSimpleNodeFactory(fixedNodeName: String, fixedNamespaceURI: String): js.Function3[
    /* arg0 */ Any, 
    /* arg1 */ js.Array[Any], 
    /* arg2 */ js.UndefOr[String], 
    js.UndefOr[Node]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSimpleNodeFactory")(fixedNodeName.asInstanceOf[js.Any], fixedNamespaceURI.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* arg0 */ Any, 
    /* arg1 */ js.Array[Any], 
    /* arg2 */ js.UndefOr[String], 
    js.UndefOr[Node]
  ]]
  inline def makeSimpleNodeFactory(fixedNodeName: Unit, fixedNamespaceURI: String): js.Function3[
    /* arg0 */ Any, 
    /* arg1 */ js.Array[Any], 
    /* arg2 */ js.UndefOr[String], 
    js.UndefOr[Node]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSimpleNodeFactory")(fixedNodeName.asInstanceOf[js.Any], fixedNamespaceURI.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* arg0 */ Any, 
    /* arg1 */ js.Array[Any], 
    /* arg2 */ js.UndefOr[String], 
    js.UndefOr[Node]
  ]]
  
  inline def makeStructureNS[T](namespaceURIs: js.Array[String], structure: T): StringDictionary[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeStructureNS")(namespaceURIs.asInstanceOf[js.Any], structure.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[T]]
  inline def makeStructureNS[T](namespaceURIs: js.Array[String], structure: T, structureNS: StringDictionary[T]): StringDictionary[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeStructureNS")(namespaceURIs.asInstanceOf[js.Any], structure.asInstanceOf[js.Any], structureNS.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[T]]
  
  inline def parse(xml: String): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(xml.asInstanceOf[js.Any]).asInstanceOf[Document]
  
  inline def parseNode(parsersNS: StringDictionary[StringDictionary[Parser]], node: Element, objectStack: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseNode")(parsersNS.asInstanceOf[js.Any], node.asInstanceOf[js.Any], objectStack.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parseNode(
    parsersNS: StringDictionary[StringDictionary[Parser]],
    node: Element,
    objectStack: js.Array[Any],
    thisArg: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseNode")(parsersNS.asInstanceOf[js.Any], node.asInstanceOf[js.Any], objectStack.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def pushParseAndPop[T](
    `object`: T,
    parsersNS: StringDictionary[StringDictionary[Parser]],
    node: Element,
    objectStack: js.Array[Any]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pushParseAndPop")(`object`.asInstanceOf[js.Any], parsersNS.asInstanceOf[js.Any], node.asInstanceOf[js.Any], objectStack.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def pushParseAndPop[T](
    `object`: T,
    parsersNS: StringDictionary[StringDictionary[Parser]],
    node: Element,
    objectStack: js.Array[Any],
    thisArg: Any
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pushParseAndPop")(`object`.asInstanceOf[js.Any], parsersNS.asInstanceOf[js.Any], node.asInstanceOf[js.Any], objectStack.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def pushSerializeAndPop[O, T](
    `object`: O,
    serializersNS: StringDictionary[StringDictionary[Serializer]],
    nodeFactory: js.ThisFunction3[
      /* this */ T, 
      /* arg1 */ Any, 
      /* arg2 */ js.Array[Any], 
      /* arg3 */ js.UndefOr[String], 
      js.UndefOr[Node]
    ],
    values: js.Array[Any],
    objectStack: js.Array[Any]
  ): js.UndefOr[O] = (^.asInstanceOf[js.Dynamic].applyDynamic("pushSerializeAndPop")(`object`.asInstanceOf[js.Any], serializersNS.asInstanceOf[js.Any], nodeFactory.asInstanceOf[js.Any], values.asInstanceOf[js.Any], objectStack.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[O]]
  inline def pushSerializeAndPop[O, T](
    `object`: O,
    serializersNS: StringDictionary[StringDictionary[Serializer]],
    nodeFactory: js.ThisFunction3[
      /* this */ T, 
      /* arg1 */ Any, 
      /* arg2 */ js.Array[Any], 
      /* arg3 */ js.UndefOr[String], 
      js.UndefOr[Node]
    ],
    values: js.Array[Any],
    objectStack: js.Array[Any],
    keys: js.Array[String]
  ): js.UndefOr[O] = (^.asInstanceOf[js.Dynamic].applyDynamic("pushSerializeAndPop")(`object`.asInstanceOf[js.Any], serializersNS.asInstanceOf[js.Any], nodeFactory.asInstanceOf[js.Any], values.asInstanceOf[js.Any], objectStack.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[O]]
  inline def pushSerializeAndPop[O, T](
    `object`: O,
    serializersNS: StringDictionary[StringDictionary[Serializer]],
    nodeFactory: js.ThisFunction3[
      /* this */ T, 
      /* arg1 */ Any, 
      /* arg2 */ js.Array[Any], 
      /* arg3 */ js.UndefOr[String], 
      js.UndefOr[Node]
    ],
    values: js.Array[Any],
    objectStack: js.Array[Any],
    keys: js.Array[String],
    thisArg: T
  ): js.UndefOr[O] = (^.asInstanceOf[js.Dynamic].applyDynamic("pushSerializeAndPop")(`object`.asInstanceOf[js.Any], serializersNS.asInstanceOf[js.Any], nodeFactory.asInstanceOf[js.Any], values.asInstanceOf[js.Any], objectStack.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[O]]
  inline def pushSerializeAndPop[O, T](
    `object`: O,
    serializersNS: StringDictionary[StringDictionary[Serializer]],
    nodeFactory: js.ThisFunction3[
      /* this */ T, 
      /* arg1 */ Any, 
      /* arg2 */ js.Array[Any], 
      /* arg3 */ js.UndefOr[String], 
      js.UndefOr[Node]
    ],
    values: js.Array[Any],
    objectStack: js.Array[Any],
    keys: Unit,
    thisArg: T
  ): js.UndefOr[O] = (^.asInstanceOf[js.Dynamic].applyDynamic("pushSerializeAndPop")(`object`.asInstanceOf[js.Any], serializersNS.asInstanceOf[js.Any], nodeFactory.asInstanceOf[js.Any], values.asInstanceOf[js.Any], objectStack.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[O]]
  
  inline def registerDocument(document: Document): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerDocument")(document.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def registerXMLSerializer(xmlSerializer: XMLSerializer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerXMLSerializer")(xmlSerializer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def serialize[T](
    serializersNS: StringDictionary[StringDictionary[Serializer]],
    nodeFactory: js.ThisFunction3[
      /* this */ T, 
      /* arg1 */ Any, 
      /* arg2 */ js.Array[Any], 
      /* arg3 */ js.UndefOr[String], 
      js.UndefOr[Node]
    ],
    values: js.Array[Any],
    objectStack: js.Array[Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(serializersNS.asInstanceOf[js.Any], nodeFactory.asInstanceOf[js.Any], values.asInstanceOf[js.Any], objectStack.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def serialize[T](
    serializersNS: StringDictionary[StringDictionary[Serializer]],
    nodeFactory: js.ThisFunction3[
      /* this */ T, 
      /* arg1 */ Any, 
      /* arg2 */ js.Array[Any], 
      /* arg3 */ js.UndefOr[String], 
      js.UndefOr[Node]
    ],
    values: js.Array[Any],
    objectStack: js.Array[Any],
    keys: js.Array[String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(serializersNS.asInstanceOf[js.Any], nodeFactory.asInstanceOf[js.Any], values.asInstanceOf[js.Any], objectStack.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def serialize[T](
    serializersNS: StringDictionary[StringDictionary[Serializer]],
    nodeFactory: js.ThisFunction3[
      /* this */ T, 
      /* arg1 */ Any, 
      /* arg2 */ js.Array[Any], 
      /* arg3 */ js.UndefOr[String], 
      js.UndefOr[Node]
    ],
    values: js.Array[Any],
    objectStack: js.Array[Any],
    keys: js.Array[String],
    thisArg: T
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(serializersNS.asInstanceOf[js.Any], nodeFactory.asInstanceOf[js.Any], values.asInstanceOf[js.Any], objectStack.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def serialize[T](
    serializersNS: StringDictionary[StringDictionary[Serializer]],
    nodeFactory: js.ThisFunction3[
      /* this */ T, 
      /* arg1 */ Any, 
      /* arg2 */ js.Array[Any], 
      /* arg3 */ js.UndefOr[String], 
      js.UndefOr[Node]
    ],
    values: js.Array[Any],
    objectStack: js.Array[Any],
    keys: Unit,
    thisArg: T
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(serializersNS.asInstanceOf[js.Any], nodeFactory.asInstanceOf[js.Any], values.asInstanceOf[js.Any], objectStack.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait NodeStackItem extends StObject {
    
    /**
      * Node.
      */
    var node: Element
  }
  object NodeStackItem {
    
    inline def apply(node: Element): NodeStackItem = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeStackItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeStackItem] (val x: Self) extends AnyVal {
      
      inline def setNode(value: Element): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  type Parser = js.Function2[/* arg0 */ Element, /* arg1 */ js.Array[Any], Unit]
  
  type Serializer = js.Function3[/* arg0 */ Element, /* arg1 */ Any, /* arg2 */ js.Array[Any], Unit]
}
