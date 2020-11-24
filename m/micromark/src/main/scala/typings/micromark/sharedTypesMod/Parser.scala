package typings.micromark.sharedTypesMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parser extends js.Object {
  
  var constructs: Record[CodeAsKey, Construct | js.Array[Construct]] = js.native
  
  def content(from: Point): Tokenizer = js.native
  
  var defined: js.Array[String] = js.native
  
  def document(from: Point): Tokenizer = js.native
  
  def flow(from: Point): Tokenizer = js.native
  
  def string(from: Point): Tokenizer = js.native
  
  def text(from: Point): Tokenizer = js.native
}
object Parser {
  
  @scala.inline
  def apply(
    constructs: Record[CodeAsKey, Construct | js.Array[Construct]],
    content: Point => Tokenizer,
    defined: js.Array[String],
    document: Point => Tokenizer,
    flow: Point => Tokenizer,
    string: Point => Tokenizer,
    text: Point => Tokenizer
  ): Parser = {
    val __obj = js.Dynamic.literal(constructs = constructs.asInstanceOf[js.Any], content = js.Any.fromFunction1(content), defined = defined.asInstanceOf[js.Any], document = js.Any.fromFunction1(document), flow = js.Any.fromFunction1(flow), string = js.Any.fromFunction1(string), text = js.Any.fromFunction1(text))
    __obj.asInstanceOf[Parser]
  }
  
  @scala.inline
  implicit class ParserOps[Self <: Parser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConstructs(value: Record[CodeAsKey, Construct | js.Array[Construct]]): Self = this.set("constructs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: Point => Tokenizer): Self = this.set("content", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDefinedVarargs(value: String*): Self = this.set("defined", js.Array(value :_*))
    
    @scala.inline
    def setDefined(value: js.Array[String]): Self = this.set("defined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocument(value: Point => Tokenizer): Self = this.set("document", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFlow(value: Point => Tokenizer): Self = this.set("flow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setString(value: Point => Tokenizer): Self = this.set("string", js.Any.fromFunction1(value))
    
    @scala.inline
    def setText(value: Point => Tokenizer): Self = this.set("text", js.Any.fromFunction1(value))
  }
}
