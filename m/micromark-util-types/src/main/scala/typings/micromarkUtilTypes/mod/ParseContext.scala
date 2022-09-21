package typings.micromarkUtilTypes.mod

import typings.micromarkUtilTypes.anon.OmitPointindexbufferIndex
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseContext extends StObject {
  
  var constructs: FullNormalizedExtension
  
  def content(): TokenizeContext
  def content(from: OmitPointindexbufferIndex): TokenizeContext
  @JSName("content")
  var content_Original: Create
  
  /**
    * List of defined identifiers.
    */
  var defined: js.Array[String]
  
  def document(): TokenizeContext
  def document(from: OmitPointindexbufferIndex): TokenizeContext
  @JSName("document")
  var document_Original: Create
  
  def flow(): TokenizeContext
  def flow(from: OmitPointindexbufferIndex): TokenizeContext
  @JSName("flow")
  var flow_Original: Create
  
  /**
    * Map of line numbers to whether they are lazy (as opposed to the line before
    * them).
    * Take for example:
    *
    * ```markdown
    * > a
    * b
    * ```
    *
    * L1 here is not lazy, L2 is.
    */
  var `lazy`: Record[Double, Boolean]
  
  def string(): TokenizeContext
  def string(from: OmitPointindexbufferIndex): TokenizeContext
  @JSName("string")
  var string_Original: Create
  
  def text(): TokenizeContext
  def text(from: OmitPointindexbufferIndex): TokenizeContext
  @JSName("text")
  var text_Original: Create
}
object ParseContext {
  
  inline def apply(
    constructs: FullNormalizedExtension,
    content: /* from */ js.UndefOr[OmitPointindexbufferIndex] => TokenizeContext,
    defined: js.Array[String],
    document: /* from */ js.UndefOr[OmitPointindexbufferIndex] => TokenizeContext,
    flow: /* from */ js.UndefOr[OmitPointindexbufferIndex] => TokenizeContext,
    `lazy`: Record[Double, Boolean],
    string: /* from */ js.UndefOr[OmitPointindexbufferIndex] => TokenizeContext,
    text: /* from */ js.UndefOr[OmitPointindexbufferIndex] => TokenizeContext
  ): ParseContext = {
    val __obj = js.Dynamic.literal(constructs = constructs.asInstanceOf[js.Any], content = js.Any.fromFunction1(content), defined = defined.asInstanceOf[js.Any], document = js.Any.fromFunction1(document), flow = js.Any.fromFunction1(flow), string = js.Any.fromFunction1(string), text = js.Any.fromFunction1(text))
    __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseContext]
  }
  
  extension [Self <: ParseContext](x: Self) {
    
    inline def setConstructs(value: FullNormalizedExtension): Self = StObject.set(x, "constructs", value.asInstanceOf[js.Any])
    
    inline def setContent(value: /* from */ js.UndefOr[OmitPointindexbufferIndex] => TokenizeContext): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
    
    inline def setDefined(value: js.Array[String]): Self = StObject.set(x, "defined", value.asInstanceOf[js.Any])
    
    inline def setDefinedVarargs(value: String*): Self = StObject.set(x, "defined", js.Array(value*))
    
    inline def setDocument(value: /* from */ js.UndefOr[OmitPointindexbufferIndex] => TokenizeContext): Self = StObject.set(x, "document", js.Any.fromFunction1(value))
    
    inline def setFlow(value: /* from */ js.UndefOr[OmitPointindexbufferIndex] => TokenizeContext): Self = StObject.set(x, "flow", js.Any.fromFunction1(value))
    
    inline def setLazy(value: Record[Double, Boolean]): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
    
    inline def setString(value: /* from */ js.UndefOr[OmitPointindexbufferIndex] => TokenizeContext): Self = StObject.set(x, "string", js.Any.fromFunction1(value))
    
    inline def setText(value: /* from */ js.UndefOr[OmitPointindexbufferIndex] => TokenizeContext): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
  }
}
