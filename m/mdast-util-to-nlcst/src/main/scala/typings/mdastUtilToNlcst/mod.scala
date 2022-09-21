package typings.mdastUtilToNlcst

import org.scalablytyped.runtime.Instantiable0
import typings.mdast.mod.Content
import typings.mdastUtilToNlcst.anon.FnCall
import typings.mdastUtilToNlcst.mdastUtilToNlcstStrings.children
import typings.nlcst.mod.Root
import typings.nlcst.mod.SentenceContent
import typings.nlcst.mod.Source
import typings.nlcst.mod.WhiteSpace
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdast-util-to-nlcst", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toNlcst(tree: MdastNode, file: VFile, Parser: ParserConstructor): Root = (^.asInstanceOf[js.Dynamic].applyDynamic("toNlcst")(tree.asInstanceOf[js.Any], file.asInstanceOf[js.Any], Parser.asInstanceOf[js.Any])).asInstanceOf[Root]
  inline def toNlcst(tree: MdastNode, file: VFile, Parser: ParserConstructor, options: Options): Root = (^.asInstanceOf[js.Dynamic].applyDynamic("toNlcst")(tree.asInstanceOf[js.Any], file.asInstanceOf[js.Any], Parser.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Root]
  inline def toNlcst(tree: MdastNode, file: VFile, Parser: ParserInstance): Root = (^.asInstanceOf[js.Dynamic].applyDynamic("toNlcst")(tree.asInstanceOf[js.Any], file.asInstanceOf[js.Any], Parser.asInstanceOf[js.Any])).asInstanceOf[Root]
  inline def toNlcst(tree: MdastNode, file: VFile, Parser: ParserInstance, options: Options): Root = (^.asInstanceOf[js.Dynamic].applyDynamic("toNlcst")(tree.asInstanceOf[js.Any], file.asInstanceOf[js.Any], Parser.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Root]
  
  trait Context extends StObject {
    
    var doc: String
    
    var ignore: js.Array[String]
    
    var parser: ParserInstance
    
    var place: Location
    
    var source: js.Array[String]
  }
  object Context {
    
    inline def apply(
      doc: String,
      ignore: js.Array[String],
      parser: ParserInstance,
      place: Location,
      source: js.Array[String]
    ): Context = {
      val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any], parser = parser.asInstanceOf[js.Any], place = place.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setDoc(value: String): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
      
      inline def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setParser(value: ParserInstance): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setPlace(value: Location): Self = StObject.set(x, "place", value.asInstanceOf[js.Any])
      
      inline def setSource(value: js.Array[String]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceVarargs(value: String*): Self = StObject.set(x, "source", js.Array(value*))
    }
  }
  
  type Location = ReturnType[FnCall]
  
  type MdastContent = Content
  
  type MdastNode = MdastRoot | MdastContent
  
  /* Inlined std.Extract<mdast-util-to-nlcst.mdast-util-to-nlcst.MdastNode, unist.unist.Parent<unist.unist.Node<unist.unist.Data>, unist.unist.NodeData<unist.unist.Node<unist.unist.Data>>>> */
  type MdastParent = children
  
  type MdastRoot = typings.mdast.mod.Root
  
  type NlcstContent = typings.nlcst.mod.Content
  
  type NlcstNode = NlcstRoot | NlcstContent
  
  type NlcstRoot = Root
  
  type NlcstSentenceContent = SentenceContent
  
  type NlcstSource = Source
  
  type NlcstWhiteSpace = WhiteSpace
  
  trait Options extends StObject {
    
    var ignore: js.UndefOr[js.Array[String]] = js.undefined
    
    var source: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setSource(value: js.Array[String]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setSourceVarargs(value: String*): Self = StObject.set(x, "source", js.Array(value*))
    }
  }
  
  type ParserConstructor = Instantiable0[ParserInstance]
  
  trait ParserInstance extends StObject {
    
    def parse(nodes: js.Array[NlcstContent]): NlcstRoot
    
    def tokenize(value: String): js.Array[NlcstSentenceContent]
    
    def tokenizeSource(value: String): NlcstSource
    
    def tokenizeWhiteSpace(value: String): NlcstWhiteSpace
  }
  object ParserInstance {
    
    inline def apply(
      parse: js.Array[NlcstContent] => NlcstRoot,
      tokenize: String => js.Array[NlcstSentenceContent],
      tokenizeSource: String => NlcstSource,
      tokenizeWhiteSpace: String => NlcstWhiteSpace
    ): ParserInstance = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), tokenize = js.Any.fromFunction1(tokenize), tokenizeSource = js.Any.fromFunction1(tokenizeSource), tokenizeWhiteSpace = js.Any.fromFunction1(tokenizeWhiteSpace))
      __obj.asInstanceOf[ParserInstance]
    }
    
    extension [Self <: ParserInstance](x: Self) {
      
      inline def setParse(value: js.Array[NlcstContent] => NlcstRoot): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      inline def setTokenize(value: String => js.Array[NlcstSentenceContent]): Self = StObject.set(x, "tokenize", js.Any.fromFunction1(value))
      
      inline def setTokenizeSource(value: String => NlcstSource): Self = StObject.set(x, "tokenizeSource", js.Any.fromFunction1(value))
      
      inline def setTokenizeWhiteSpace(value: String => NlcstWhiteSpace): Self = StObject.set(x, "tokenizeWhiteSpace", js.Any.fromFunction1(value))
    }
  }
  
  type Point = typings.unist.mod.Point
  
  type VFile = typings.vfile.mod.VFile
}
