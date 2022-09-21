package typings.nlcst

import typings.nlcst.mod.Content
import typings.nlcst.mod.ParagraphContent
import typings.nlcst.mod.SentenceContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nlcstStrings {
  
  @js.native
  sealed trait ParagraphNode extends StObject
  inline def ParagraphNode: ParagraphNode = "ParagraphNode".asInstanceOf[ParagraphNode]
  
  @js.native
  sealed trait PunctuationNode extends StObject
  inline def PunctuationNode: PunctuationNode = "PunctuationNode".asInstanceOf[PunctuationNode]
  
  @js.native
  sealed trait RootNode extends StObject
  inline def RootNode: RootNode = "RootNode".asInstanceOf[RootNode]
  
  @js.native
  sealed trait SentenceNode extends StObject
  inline def SentenceNode: SentenceNode = "SentenceNode".asInstanceOf[SentenceNode]
  
  @js.native
  sealed trait SourceNode extends StObject
  inline def SourceNode: SourceNode = "SourceNode".asInstanceOf[SourceNode]
  
  @js.native
  sealed trait SymbolNode extends StObject
  inline def SymbolNode: SymbolNode = "SymbolNode".asInstanceOf[SymbolNode]
  
  @js.native
  sealed trait TextNode extends StObject
  inline def TextNode: TextNode = "TextNode".asInstanceOf[TextNode]
  
  @js.native
  sealed trait WhiteSpaceNode extends StObject
  inline def WhiteSpaceNode: WhiteSpaceNode = "WhiteSpaceNode".asInstanceOf[WhiteSpaceNode]
  
  @js.native
  sealed trait WordNode extends StObject
  inline def WordNode: WordNode = "WordNode".asInstanceOf[WordNode]
  
  @js.native
  sealed trait children
    extends StObject
       with Content
       with ParagraphContent
       with SentenceContent
  inline def children: children = "children".asInstanceOf[children]
  
  @js.native
  sealed trait `type`
    extends StObject
       with Content
       with ParagraphContent
       with SentenceContent
  inline def `type`: `type` = "type".asInstanceOf[`type`]
}
