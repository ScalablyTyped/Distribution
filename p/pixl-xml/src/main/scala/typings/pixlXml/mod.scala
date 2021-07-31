package typings.pixlXml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pixl-xml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pixl-xml", "Parser")
  @js.native
  class Parser[OutputJsonInterface] protected () extends StObject {
    def this(xml: String) = this()
    def this(xml: String, options: PixlParseOptions) = this()
    
    var attribsKey: String = js.native
    
    /**
      * Returns an XML string with formatting determined by the params provided
      * @param indentCharacter
      * @param eol
      */
    def compose(): String = js.native
    def compose(indentCharacter: String): String = js.native
    def compose(indentCharacter: String, eol: String): String = js.native
    def compose(indentCharacter: Unit, eol: String): String = js.native
    
    var dataKey: String = js.native
    
    var documentNodeName: String = js.native
    
    var dtdNodeList: js.Array[String] = js.native
    
    var errors: js.Array[js.Any] = js.native
    
    /**
      * Returns the parsed XML tree. This tree is mutable and can be modified
      * as necessary.
      */
    def getTree(): OutputJsonInterface = js.native
    
    var piNodeList: js.Array[String] = js.native
    
    /**
      * The XML input that was provided to the constructor
      */
    var text: String = js.native
    
    /**
      * The resulting JSON from the parse operation
      */
    var tree: OutputJsonInterface = js.native
  }
  
  @scala.inline
  def alwaysArray[T](input: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("alwaysArray")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  @scala.inline
  def alwaysArray[T](input: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("alwaysArray")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def decodeEntities(xml: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeEntities")(xml.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def encodeAttribEntities(xml: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeAttribEntities")(xml.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def encodeEntities(xml: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeEntities")(xml.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def firstKey(hash: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("firstKey")(hash.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def hashKeysToArray(input: js.Object): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("hashKeysToArray")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def isaArray(input: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isaArray")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isaHash(input: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isaHash")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def numKeys(hash: js.Object): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("numKeys")(hash.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def parse(xml: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(xml.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  @scala.inline
  def parse(xml: String, options: PixlParseOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(xml.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  @scala.inline
  def stringify(doc: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(doc.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def stringify(doc: js.Object, outerElName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(doc.asInstanceOf[js.Any], outerElName.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(doc: js.Object, outerElName: String, indentSize: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(doc.asInstanceOf[js.Any], outerElName.asInstanceOf[js.Any], indentSize.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(doc: js.Object, outerElName: String, indentSize: Double, indentCharacter: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(doc.asInstanceOf[js.Any], outerElName.asInstanceOf[js.Any], indentSize.asInstanceOf[js.Any], indentCharacter.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(
    doc: js.Object,
    outerElName: String,
    indentSize: Double,
    indentCharacter: String,
    eolCharacter: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(doc.asInstanceOf[js.Any], outerElName.asInstanceOf[js.Any], indentSize.asInstanceOf[js.Any], indentCharacter.asInstanceOf[js.Any], eolCharacter.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(
    doc: js.Object,
    outerElName: String,
    indentSize: Double,
    indentCharacter: String,
    eolCharacter: String,
    preserveOrder: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(doc.asInstanceOf[js.Any], outerElName.asInstanceOf[js.Any], indentSize.asInstanceOf[js.Any], indentCharacter.asInstanceOf[js.Any], eolCharacter.asInstanceOf[js.Any], preserveOrder.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(
    doc: js.Object,
    outerElName: String,
    indentSize: Double,
    indentCharacter: String,
    eolCharacter: Unit,
    preserveOrder: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(doc.asInstanceOf[js.Any], outerElName.asInstanceOf[js.Any], indentSize.asInstanceOf[js.Any], indentCharacter.asInstanceOf[js.Any], eolCharacter.asInstanceOf[js.Any], preserveOrder.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(
    doc: js.Object,
    outerElName: String,
    indentSize: Double,
    indentCharacter: Unit,
    eolCharacter: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(doc.asInstanceOf[js.Any], outerElName.asInstanceOf[js.Any], indentSize.asInstanceOf[js.Any], indentCharacter.asInstanceOf[js.Any], eolCharacter.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(
    doc: js.Object,
    outerElName: String,
    indentSize: Double,
    indentCharacter: Unit,
    eolCharacter: String,
    preserveOrder: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(doc.asInstanceOf[js.Any], outerElName.asInstanceOf[js.Any], indentSize.asInstanceOf[js.Any], indentCharacter.asInstanceOf[js.Any], eolCharacter.asInstanceOf[js.Any], preserveOrder.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(
    doc: js.Object,
    outerElName: String,
    indentSize: Double,
    indentCharacter: Unit,
    eolCharacter: Unit,
    preserveOrder: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(doc.asInstanceOf[js.Any], outerElName.asInstanceOf[js.Any], indentSize.asInstanceOf[js.Any], indentCharacter.asInstanceOf[js.Any], eolCharacter.asInstanceOf[js.Any], preserveOrder.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(doc: js.Object, outerElName: String, indentSize: Unit, indentCharacter: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(doc.asInstanceOf[js.Any], outerElName.asInstanceOf[js.Any], indentSize.asInstanceOf[js.Any], indentCharacter.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(
    doc: js.Object,
    outerElName: String,
    indentSize: Unit,
    indentCharacter: String,
    eolCharacter: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(doc.asInstanceOf[js.Any], outerElName.asInstanceOf[js.Any], indentSize.asInstanceOf[js.Any], indentCharacter.asInstanceOf[js.Any], eolCharacter.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(
    doc: js.Object,
    outerElName: String,
    indentSize: Unit,
    indentCharacter: String,
    eolCharacter: String,
    preserveOrder: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(doc.asInstanceOf[js.Any], outerElName.asInstanceOf[js.Any], indentSize.asInstanceOf[js.Any], indentCharacter.asInstanceOf[js.Any], eolCharacter.asInstanceOf[js.Any], preserveOrder.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(
    doc: js.Object,
    outerElName: String,
    indentSize: Unit,
    indentCharacter: String,
    eolCharacter: Unit,
    preserveOrder: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(doc.asInstanceOf[js.Any], outerElName.asInstanceOf[js.Any], indentSize.asInstanceOf[js.Any], indentCharacter.asInstanceOf[js.Any], eolCharacter.asInstanceOf[js.Any], preserveOrder.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(doc: js.Object, outerElName: String, indentSize: Unit, indentCharacter: Unit, eolCharacter: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(doc.asInstanceOf[js.Any], outerElName.asInstanceOf[js.Any], indentSize.asInstanceOf[js.Any], indentCharacter.asInstanceOf[js.Any], eolCharacter.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(
    doc: js.Object,
    outerElName: String,
    indentSize: Unit,
    indentCharacter: Unit,
    eolCharacter: String,
    preserveOrder: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(doc.asInstanceOf[js.Any], outerElName.asInstanceOf[js.Any], indentSize.asInstanceOf[js.Any], indentCharacter.asInstanceOf[js.Any], eolCharacter.asInstanceOf[js.Any], preserveOrder.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(
    doc: js.Object,
    outerElName: String,
    indentSize: Unit,
    indentCharacter: Unit,
    eolCharacter: Unit,
    preserveOrder: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(doc.asInstanceOf[js.Any], outerElName.asInstanceOf[js.Any], indentSize.asInstanceOf[js.Any], indentCharacter.asInstanceOf[js.Any], eolCharacter.asInstanceOf[js.Any], preserveOrder.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(doc: js.Object, outerElName: Unit, indentSize: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(doc.asInstanceOf[js.Any], outerElName.asInstanceOf[js.Any], indentSize.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(doc: js.Object, outerElName: Unit, indentSize: Double, indentCharacter: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(doc.asInstanceOf[js.Any], outerElName.asInstanceOf[js.Any], indentSize.asInstanceOf[js.Any], indentCharacter.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(
    doc: js.Object,
    outerElName: Unit,
    indentSize: Double,
    indentCharacter: String,
    eolCharacter: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(doc.asInstanceOf[js.Any], outerElName.asInstanceOf[js.Any], indentSize.asInstanceOf[js.Any], indentCharacter.asInstanceOf[js.Any], eolCharacter.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(
    doc: js.Object,
    outerElName: Unit,
    indentSize: Double,
    indentCharacter: String,
    eolCharacter: String,
    preserveOrder: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(doc.asInstanceOf[js.Any], outerElName.asInstanceOf[js.Any], indentSize.asInstanceOf[js.Any], indentCharacter.asInstanceOf[js.Any], eolCharacter.asInstanceOf[js.Any], preserveOrder.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(
    doc: js.Object,
    outerElName: Unit,
    indentSize: Double,
    indentCharacter: String,
    eolCharacter: Unit,
    preserveOrder: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(doc.asInstanceOf[js.Any], outerElName.asInstanceOf[js.Any], indentSize.asInstanceOf[js.Any], indentCharacter.asInstanceOf[js.Any], eolCharacter.asInstanceOf[js.Any], preserveOrder.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(doc: js.Object, outerElName: Unit, indentSize: Double, indentCharacter: Unit, eolCharacter: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(doc.asInstanceOf[js.Any], outerElName.asInstanceOf[js.Any], indentSize.asInstanceOf[js.Any], indentCharacter.asInstanceOf[js.Any], eolCharacter.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(
    doc: js.Object,
    outerElName: Unit,
    indentSize: Double,
    indentCharacter: Unit,
    eolCharacter: String,
    preserveOrder: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(doc.asInstanceOf[js.Any], outerElName.asInstanceOf[js.Any], indentSize.asInstanceOf[js.Any], indentCharacter.asInstanceOf[js.Any], eolCharacter.asInstanceOf[js.Any], preserveOrder.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(
    doc: js.Object,
    outerElName: Unit,
    indentSize: Double,
    indentCharacter: Unit,
    eolCharacter: Unit,
    preserveOrder: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(doc.asInstanceOf[js.Any], outerElName.asInstanceOf[js.Any], indentSize.asInstanceOf[js.Any], indentCharacter.asInstanceOf[js.Any], eolCharacter.asInstanceOf[js.Any], preserveOrder.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(doc: js.Object, outerElName: Unit, indentSize: Unit, indentCharacter: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(doc.asInstanceOf[js.Any], outerElName.asInstanceOf[js.Any], indentSize.asInstanceOf[js.Any], indentCharacter.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(doc: js.Object, outerElName: Unit, indentSize: Unit, indentCharacter: String, eolCharacter: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(doc.asInstanceOf[js.Any], outerElName.asInstanceOf[js.Any], indentSize.asInstanceOf[js.Any], indentCharacter.asInstanceOf[js.Any], eolCharacter.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(
    doc: js.Object,
    outerElName: Unit,
    indentSize: Unit,
    indentCharacter: String,
    eolCharacter: String,
    preserveOrder: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(doc.asInstanceOf[js.Any], outerElName.asInstanceOf[js.Any], indentSize.asInstanceOf[js.Any], indentCharacter.asInstanceOf[js.Any], eolCharacter.asInstanceOf[js.Any], preserveOrder.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(
    doc: js.Object,
    outerElName: Unit,
    indentSize: Unit,
    indentCharacter: String,
    eolCharacter: Unit,
    preserveOrder: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(doc.asInstanceOf[js.Any], outerElName.asInstanceOf[js.Any], indentSize.asInstanceOf[js.Any], indentCharacter.asInstanceOf[js.Any], eolCharacter.asInstanceOf[js.Any], preserveOrder.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(doc: js.Object, outerElName: Unit, indentSize: Unit, indentCharacter: Unit, eolCharacter: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(doc.asInstanceOf[js.Any], outerElName.asInstanceOf[js.Any], indentSize.asInstanceOf[js.Any], indentCharacter.asInstanceOf[js.Any], eolCharacter.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(
    doc: js.Object,
    outerElName: Unit,
    indentSize: Unit,
    indentCharacter: Unit,
    eolCharacter: String,
    preserveOrder: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(doc.asInstanceOf[js.Any], outerElName.asInstanceOf[js.Any], indentSize.asInstanceOf[js.Any], indentCharacter.asInstanceOf[js.Any], eolCharacter.asInstanceOf[js.Any], preserveOrder.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(
    doc: js.Object,
    outerElName: Unit,
    indentSize: Unit,
    indentCharacter: Unit,
    eolCharacter: Unit,
    preserveOrder: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(doc.asInstanceOf[js.Any], outerElName.asInstanceOf[js.Any], indentSize.asInstanceOf[js.Any], indentCharacter.asInstanceOf[js.Any], eolCharacter.asInstanceOf[js.Any], preserveOrder.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait PixlParseOptions extends StObject {
    
    var forceArrays: js.UndefOr[Boolean] = js.undefined
    
    var lowerCase: js.UndefOr[Boolean] = js.undefined
    
    var preserveAttributes: js.UndefOr[Boolean] = js.undefined
    
    var preserveDocumentNode: js.UndefOr[Boolean] = js.undefined
    
    var preserveWhitespace: js.UndefOr[Boolean] = js.undefined
  }
  object PixlParseOptions {
    
    @scala.inline
    def apply(): PixlParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PixlParseOptions]
    }
    
    @scala.inline
    implicit class PixlParseOptionsMutableBuilder[Self <: PixlParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForceArrays(value: Boolean): Self = StObject.set(x, "forceArrays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceArraysUndefined: Self = StObject.set(x, "forceArrays", js.undefined)
      
      @scala.inline
      def setLowerCase(value: Boolean): Self = StObject.set(x, "lowerCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowerCaseUndefined: Self = StObject.set(x, "lowerCase", js.undefined)
      
      @scala.inline
      def setPreserveAttributes(value: Boolean): Self = StObject.set(x, "preserveAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveAttributesUndefined: Self = StObject.set(x, "preserveAttributes", js.undefined)
      
      @scala.inline
      def setPreserveDocumentNode(value: Boolean): Self = StObject.set(x, "preserveDocumentNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveDocumentNodeUndefined: Self = StObject.set(x, "preserveDocumentNode", js.undefined)
      
      @scala.inline
      def setPreserveWhitespace(value: Boolean): Self = StObject.set(x, "preserveWhitespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveWhitespaceUndefined: Self = StObject.set(x, "preserveWhitespace", js.undefined)
    }
  }
}
