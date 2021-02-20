package typings.pixlXml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
    def compose(indentCharacter: js.UndefOr[scala.Nothing], eol: String): String = js.native
    def compose(indentCharacter: String): String = js.native
    def compose(indentCharacter: String, eol: String): String = js.native
    
    var dataKey: String = js.native
    
    var documentNodeName: String = js.native
    
    var dtdNodeList: js.Array[String] = js.native
    
    var errors: js.Array[_] = js.native
    
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
  
  @JSImport("pixl-xml", "alwaysArray")
  @js.native
  def alwaysArray[T](input: T): js.Array[T] = js.native
  @JSImport("pixl-xml", "alwaysArray")
  @js.native
  def alwaysArray[T](input: js.Array[T]): js.Array[T] = js.native
  
  @JSImport("pixl-xml", "decodeEntities")
  @js.native
  def decodeEntities(xml: String): String = js.native
  
  @JSImport("pixl-xml", "encodeAttribEntities")
  @js.native
  def encodeAttribEntities(xml: String): String = js.native
  
  @JSImport("pixl-xml", "encodeEntities")
  @js.native
  def encodeEntities(xml: String): String = js.native
  
  @JSImport("pixl-xml", "firstKey")
  @js.native
  def firstKey(hash: js.Object): String = js.native
  
  @JSImport("pixl-xml", "hashKeysToArray")
  @js.native
  def hashKeysToArray(input: js.Object): js.Array[String] = js.native
  
  @JSImport("pixl-xml", "isaArray")
  @js.native
  def isaArray(input: js.Any): Boolean = js.native
  
  @JSImport("pixl-xml", "isaHash")
  @js.native
  def isaHash(input: js.Any): Boolean = js.native
  
  @JSImport("pixl-xml", "numKeys")
  @js.native
  def numKeys(hash: js.Object): Double = js.native
  
  @JSImport("pixl-xml", "parse")
  @js.native
  def parse(xml: String): js.Object = js.native
  @JSImport("pixl-xml", "parse")
  @js.native
  def parse(xml: String, options: PixlParseOptions): js.Object = js.native
  
  @JSImport("pixl-xml", "stringify")
  @js.native
  def stringify(doc: js.Object): String = js.native
  @JSImport("pixl-xml", "stringify")
  @js.native
  def stringify(
    doc: js.Object,
    outerElName: js.UndefOr[scala.Nothing],
    indentSize: js.UndefOr[scala.Nothing],
    indentCharacter: js.UndefOr[scala.Nothing],
    eolCharacter: js.UndefOr[scala.Nothing],
    preserveOrder: Boolean
  ): String = js.native
  @JSImport("pixl-xml", "stringify")
  @js.native
  def stringify(
    doc: js.Object,
    outerElName: js.UndefOr[scala.Nothing],
    indentSize: js.UndefOr[scala.Nothing],
    indentCharacter: js.UndefOr[scala.Nothing],
    eolCharacter: String
  ): String = js.native
  @JSImport("pixl-xml", "stringify")
  @js.native
  def stringify(
    doc: js.Object,
    outerElName: js.UndefOr[scala.Nothing],
    indentSize: js.UndefOr[scala.Nothing],
    indentCharacter: js.UndefOr[scala.Nothing],
    eolCharacter: String,
    preserveOrder: Boolean
  ): String = js.native
  @JSImport("pixl-xml", "stringify")
  @js.native
  def stringify(
    doc: js.Object,
    outerElName: js.UndefOr[scala.Nothing],
    indentSize: js.UndefOr[scala.Nothing],
    indentCharacter: String
  ): String = js.native
  @JSImport("pixl-xml", "stringify")
  @js.native
  def stringify(
    doc: js.Object,
    outerElName: js.UndefOr[scala.Nothing],
    indentSize: js.UndefOr[scala.Nothing],
    indentCharacter: String,
    eolCharacter: js.UndefOr[scala.Nothing],
    preserveOrder: Boolean
  ): String = js.native
  @JSImport("pixl-xml", "stringify")
  @js.native
  def stringify(
    doc: js.Object,
    outerElName: js.UndefOr[scala.Nothing],
    indentSize: js.UndefOr[scala.Nothing],
    indentCharacter: String,
    eolCharacter: String
  ): String = js.native
  @JSImport("pixl-xml", "stringify")
  @js.native
  def stringify(
    doc: js.Object,
    outerElName: js.UndefOr[scala.Nothing],
    indentSize: js.UndefOr[scala.Nothing],
    indentCharacter: String,
    eolCharacter: String,
    preserveOrder: Boolean
  ): String = js.native
  @JSImport("pixl-xml", "stringify")
  @js.native
  def stringify(doc: js.Object, outerElName: js.UndefOr[scala.Nothing], indentSize: Double): String = js.native
  @JSImport("pixl-xml", "stringify")
  @js.native
  def stringify(
    doc: js.Object,
    outerElName: js.UndefOr[scala.Nothing],
    indentSize: Double,
    indentCharacter: js.UndefOr[scala.Nothing],
    eolCharacter: js.UndefOr[scala.Nothing],
    preserveOrder: Boolean
  ): String = js.native
  @JSImport("pixl-xml", "stringify")
  @js.native
  def stringify(
    doc: js.Object,
    outerElName: js.UndefOr[scala.Nothing],
    indentSize: Double,
    indentCharacter: js.UndefOr[scala.Nothing],
    eolCharacter: String
  ): String = js.native
  @JSImport("pixl-xml", "stringify")
  @js.native
  def stringify(
    doc: js.Object,
    outerElName: js.UndefOr[scala.Nothing],
    indentSize: Double,
    indentCharacter: js.UndefOr[scala.Nothing],
    eolCharacter: String,
    preserveOrder: Boolean
  ): String = js.native
  @JSImport("pixl-xml", "stringify")
  @js.native
  def stringify(
    doc: js.Object,
    outerElName: js.UndefOr[scala.Nothing],
    indentSize: Double,
    indentCharacter: String
  ): String = js.native
  @JSImport("pixl-xml", "stringify")
  @js.native
  def stringify(
    doc: js.Object,
    outerElName: js.UndefOr[scala.Nothing],
    indentSize: Double,
    indentCharacter: String,
    eolCharacter: js.UndefOr[scala.Nothing],
    preserveOrder: Boolean
  ): String = js.native
  @JSImport("pixl-xml", "stringify")
  @js.native
  def stringify(
    doc: js.Object,
    outerElName: js.UndefOr[scala.Nothing],
    indentSize: Double,
    indentCharacter: String,
    eolCharacter: String
  ): String = js.native
  @JSImport("pixl-xml", "stringify")
  @js.native
  def stringify(
    doc: js.Object,
    outerElName: js.UndefOr[scala.Nothing],
    indentSize: Double,
    indentCharacter: String,
    eolCharacter: String,
    preserveOrder: Boolean
  ): String = js.native
  @JSImport("pixl-xml", "stringify")
  @js.native
  def stringify(doc: js.Object, outerElName: String): String = js.native
  @JSImport("pixl-xml", "stringify")
  @js.native
  def stringify(
    doc: js.Object,
    outerElName: String,
    indentSize: js.UndefOr[scala.Nothing],
    indentCharacter: js.UndefOr[scala.Nothing],
    eolCharacter: js.UndefOr[scala.Nothing],
    preserveOrder: Boolean
  ): String = js.native
  @JSImport("pixl-xml", "stringify")
  @js.native
  def stringify(
    doc: js.Object,
    outerElName: String,
    indentSize: js.UndefOr[scala.Nothing],
    indentCharacter: js.UndefOr[scala.Nothing],
    eolCharacter: String
  ): String = js.native
  @JSImport("pixl-xml", "stringify")
  @js.native
  def stringify(
    doc: js.Object,
    outerElName: String,
    indentSize: js.UndefOr[scala.Nothing],
    indentCharacter: js.UndefOr[scala.Nothing],
    eolCharacter: String,
    preserveOrder: Boolean
  ): String = js.native
  @JSImport("pixl-xml", "stringify")
  @js.native
  def stringify(
    doc: js.Object,
    outerElName: String,
    indentSize: js.UndefOr[scala.Nothing],
    indentCharacter: String
  ): String = js.native
  @JSImport("pixl-xml", "stringify")
  @js.native
  def stringify(
    doc: js.Object,
    outerElName: String,
    indentSize: js.UndefOr[scala.Nothing],
    indentCharacter: String,
    eolCharacter: js.UndefOr[scala.Nothing],
    preserveOrder: Boolean
  ): String = js.native
  @JSImport("pixl-xml", "stringify")
  @js.native
  def stringify(
    doc: js.Object,
    outerElName: String,
    indentSize: js.UndefOr[scala.Nothing],
    indentCharacter: String,
    eolCharacter: String
  ): String = js.native
  @JSImport("pixl-xml", "stringify")
  @js.native
  def stringify(
    doc: js.Object,
    outerElName: String,
    indentSize: js.UndefOr[scala.Nothing],
    indentCharacter: String,
    eolCharacter: String,
    preserveOrder: Boolean
  ): String = js.native
  @JSImport("pixl-xml", "stringify")
  @js.native
  def stringify(doc: js.Object, outerElName: String, indentSize: Double): String = js.native
  @JSImport("pixl-xml", "stringify")
  @js.native
  def stringify(
    doc: js.Object,
    outerElName: String,
    indentSize: Double,
    indentCharacter: js.UndefOr[scala.Nothing],
    eolCharacter: js.UndefOr[scala.Nothing],
    preserveOrder: Boolean
  ): String = js.native
  @JSImport("pixl-xml", "stringify")
  @js.native
  def stringify(
    doc: js.Object,
    outerElName: String,
    indentSize: Double,
    indentCharacter: js.UndefOr[scala.Nothing],
    eolCharacter: String
  ): String = js.native
  @JSImport("pixl-xml", "stringify")
  @js.native
  def stringify(
    doc: js.Object,
    outerElName: String,
    indentSize: Double,
    indentCharacter: js.UndefOr[scala.Nothing],
    eolCharacter: String,
    preserveOrder: Boolean
  ): String = js.native
  @JSImport("pixl-xml", "stringify")
  @js.native
  def stringify(doc: js.Object, outerElName: String, indentSize: Double, indentCharacter: String): String = js.native
  @JSImport("pixl-xml", "stringify")
  @js.native
  def stringify(
    doc: js.Object,
    outerElName: String,
    indentSize: Double,
    indentCharacter: String,
    eolCharacter: js.UndefOr[scala.Nothing],
    preserveOrder: Boolean
  ): String = js.native
  @JSImport("pixl-xml", "stringify")
  @js.native
  def stringify(
    doc: js.Object,
    outerElName: String,
    indentSize: Double,
    indentCharacter: String,
    eolCharacter: String
  ): String = js.native
  @JSImport("pixl-xml", "stringify")
  @js.native
  def stringify(
    doc: js.Object,
    outerElName: String,
    indentSize: Double,
    indentCharacter: String,
    eolCharacter: String,
    preserveOrder: Boolean
  ): String = js.native
  
  @js.native
  trait PixlParseOptions extends StObject {
    
    var forceArrays: js.UndefOr[Boolean] = js.native
    
    var lowerCase: js.UndefOr[Boolean] = js.native
    
    var preserveAttributes: js.UndefOr[Boolean] = js.native
    
    var preserveDocumentNode: js.UndefOr[Boolean] = js.native
    
    var preserveWhitespace: js.UndefOr[Boolean] = js.native
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
