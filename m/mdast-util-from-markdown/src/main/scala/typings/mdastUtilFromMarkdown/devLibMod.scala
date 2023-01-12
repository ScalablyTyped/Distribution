package typings.mdastUtilFromMarkdown

import typings.mdastUtilFromMarkdown.anon.CanContainEols
import typings.mdastUtilFromMarkdown.anon.FnCall
import typings.mdastUtilFromMarkdown.anon.OmitCompileContextsliceSe
import typings.mdastUtilFromMarkdown.anon.PartialCompileDataFields
import typings.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.characterReferenceMarkerHexadecimal
import typings.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.characterReferenceMarkerNumeric
import typings.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.children
import typings.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.collapsed
import typings.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.fragment
import typings.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.full
import typings.micromarkUtilTypes.anon.PickTokenstartend
import typings.std.Partial
import typings.std.Record
import typings.unist.mod.Data
import typings.unist.mod.NodeData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devLibMod {
  
  @JSImport("mdast-util-from-markdown/dev/lib", "fromMarkdown")
  @js.native
  val fromMarkdown: (js.Function3[/* value */ Value, /* encoding */ Encoding, /* options */ js.UndefOr[Options], Root]) & (js.Function2[/* value */ Value, /* options */ js.UndefOr[Options], Root]) = js.native
  
  type Blockquote = typings.mdast.mod.Blockquote
  
  type Break = typings.mdast.mod.Break
  
  type Code = typings.mdast.mod.Code
  
  @js.native
  trait CompileContext extends StObject {
    
    /**
      * Capture some of the output data.
      */
    def buffer(): Unit = js.native
    
    /**
      * Configuration.
      */
    var config: NormalizedExtension = js.native
    
    def enter(node: typings.mdast.mod.Content, token: Token): typings.mdast.mod.Content = js.native
    def enter(node: typings.mdast.mod.Content, token: Token, onError: OnEnterError): typings.mdast.mod.Content = js.native
    /**
      * Enter a token.
      */
    def enter(node: typings.mdast.mod.Root, token: Token): typings.mdast.mod.Root = js.native
    def enter(node: typings.mdast.mod.Root, token: Token, onError: OnEnterError): typings.mdast.mod.Root = js.native
    
    /**
      * Exit a token.
      */
    def exit(token: Token): Node = js.native
    def exit(token: Token, onError: OnExitError): Node = js.native
    
    /**
      * Get data from the key-value store.
      */
    def getData[K /* <: String */](key: K): /* import warning: importer.ImportType#apply Failed type conversion: mdast-util-from-markdown.mdast-util-from-markdown/dev/lib.CompileData[K] */ js.Any = js.native
    
    /**
      * Stop capturing and access the output data.
      */
    def resume(): String = js.native
    
    /**
      * Set data into the key-value store.
      */
    def setData(key: String): Unit = js.native
    def setData(key: String, value: Any): Unit = js.native
    
    /**
      * Get the string value of a token.
      */
    def sliceSerialize(token: PickTokenstartend): String = js.native
    /**
      * Get the string value of a token.
      */
    def sliceSerialize(token: PickTokenstartend, expandTabs: Boolean): String = js.native
    /**
      * Get the string value of a token.
      */
    @JSName("sliceSerialize")
    var sliceSerialize_Original: FnCall = js.native
    
    var stack: js.Array[Node | Fragment] = js.native
    
    var tokenStack: js.Array[js.Tuple2[Token, js.UndefOr[OnEnterError]]] = js.native
  }
  
  type CompileData = (Record[String, Any]) & PartialCompileDataFields
  
  trait CompileDataFields extends StObject {
    
    var atHardBreak: js.UndefOr[Boolean] = js.undefined
    
    var characterReferenceType: characterReferenceMarkerHexadecimal | characterReferenceMarkerNumeric
    
    var expectingFirstListItemValue: js.UndefOr[Boolean] = js.undefined
    
    var flowCodeInside: js.UndefOr[Boolean] = js.undefined
    
    var inReference: js.UndefOr[Boolean] = js.undefined
    
    var referenceType: collapsed | full
    
    var setextHeadingSlurpLineEnding: js.UndefOr[Boolean] = js.undefined
  }
  object CompileDataFields {
    
    inline def apply(
      characterReferenceType: characterReferenceMarkerHexadecimal | characterReferenceMarkerNumeric,
      referenceType: collapsed | full
    ): CompileDataFields = {
      val __obj = js.Dynamic.literal(characterReferenceType = characterReferenceType.asInstanceOf[js.Any], referenceType = referenceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompileDataFields]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompileDataFields] (val x: Self) extends AnyVal {
      
      inline def setAtHardBreak(value: Boolean): Self = StObject.set(x, "atHardBreak", value.asInstanceOf[js.Any])
      
      inline def setAtHardBreakUndefined: Self = StObject.set(x, "atHardBreak", js.undefined)
      
      inline def setCharacterReferenceType(value: characterReferenceMarkerHexadecimal | characterReferenceMarkerNumeric): Self = StObject.set(x, "characterReferenceType", value.asInstanceOf[js.Any])
      
      inline def setExpectingFirstListItemValue(value: Boolean): Self = StObject.set(x, "expectingFirstListItemValue", value.asInstanceOf[js.Any])
      
      inline def setExpectingFirstListItemValueUndefined: Self = StObject.set(x, "expectingFirstListItemValue", js.undefined)
      
      inline def setFlowCodeInside(value: Boolean): Self = StObject.set(x, "flowCodeInside", value.asInstanceOf[js.Any])
      
      inline def setFlowCodeInsideUndefined: Self = StObject.set(x, "flowCodeInside", js.undefined)
      
      inline def setInReference(value: Boolean): Self = StObject.set(x, "inReference", value.asInstanceOf[js.Any])
      
      inline def setInReferenceUndefined: Self = StObject.set(x, "inReference", js.undefined)
      
      inline def setReferenceType(value: collapsed | full): Self = StObject.set(x, "referenceType", value.asInstanceOf[js.Any])
      
      inline def setSetextHeadingSlurpLineEnding(value: Boolean): Self = StObject.set(x, "setextHeadingSlurpLineEnding", value.asInstanceOf[js.Any])
      
      inline def setSetextHeadingSlurpLineEndingUndefined: Self = StObject.set(x, "setextHeadingSlurpLineEnding", js.undefined)
    }
  }
  
  type Content = typings.mdast.mod.Content
  
  type Definition = typings.mdast.mod.Definition
  
  type Emphasis = typings.mdast.mod.Emphasis
  
  type Encoding = typings.micromarkUtilTypes.mod.Encoding
  
  type Event = typings.micromarkUtilTypes.mod.Event
  
  type Extension = Partial[NormalizedExtension]
  
  trait Fragment
    extends StObject
       with typings.unist.mod.Parent[typings.unist.mod.Node[Data], NodeData[typings.unist.mod.Node[Data]]] {
    
    @JSName("children")
    var children_Fragment: js.Array[PhrasingContent]
    
    @JSName("type")
    var type_Fragment: fragment
  }
  object Fragment {
    
    inline def apply(children: js.Array[PhrasingContent]): Fragment = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("fragment")
      __obj.asInstanceOf[Fragment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fragment] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[PhrasingContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: PhrasingContent*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setType(value: fragment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FromMarkdownOptions extends StObject {
    
    var mdastExtensions: js.UndefOr[js.Array[Extension | js.Array[Extension]]] = js.undefined
  }
  object FromMarkdownOptions {
    
    inline def apply(): FromMarkdownOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FromMarkdownOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FromMarkdownOptions] (val x: Self) extends AnyVal {
      
      inline def setMdastExtensions(value: js.Array[Extension | js.Array[Extension]]): Self = StObject.set(x, "mdastExtensions", value.asInstanceOf[js.Any])
      
      inline def setMdastExtensionsUndefined: Self = StObject.set(x, "mdastExtensions", js.undefined)
      
      inline def setMdastExtensionsVarargs(value: (Extension | js.Array[Extension])*): Self = StObject.set(x, "mdastExtensions", js.Array(value*))
    }
  }
  
  type HTML = typings.mdast.mod.HTML
  
  type Handle = js.ThisFunction1[/* this */ CompileContext, /* token */ Token, Unit]
  
  type Handles = Record[String, Handle]
  
  type Heading = typings.mdast.mod.Heading
  
  type Image = typings.mdast.mod.Image
  
  type ImageReference = typings.mdast.mod.ImageReference
  
  type InlineCode = typings.mdast.mod.InlineCode
  
  type Link = typings.mdast.mod.Link
  
  type LinkReference = typings.mdast.mod.LinkReference
  
  type List = typings.mdast.mod.List
  
  type ListItem = typings.mdast.mod.ListItem
  
  type Node = Root | Content
  
  type NormalizedExtension = (Record[String, (Record[String, Any]) | js.Array[Any]]) & CanContainEols
  
  type OnEnterError = js.ThisFunction2[
    /* this */ OmitCompileContextsliceSe, 
    /* left */ js.UndefOr[Token], 
    /* right */ Token, 
    Unit
  ]
  
  type OnExitError = js.ThisFunction2[/* this */ OmitCompileContextsliceSe, /* left */ Token, /* right */ Token, Unit]
  
  trait Options
    extends StObject
       with typings.micromarkUtilTypes.mod.ParseOptions
       with FromMarkdownOptions
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
  }
  
  type Paragraph = typings.mdast.mod.Paragraph
  
  /* Inlined std.Extract<mdast-util-from-markdown.mdast-util-from-markdown/dev/lib.Node, mdast-util-from-markdown.mdast-util-from-markdown/dev/lib.UnistParent> */
  type Parent = children
  
  type ParseOptions = typings.micromarkUtilTypes.mod.ParseOptions
  
  type PhrasingContent = typings.mdast.mod.PhrasingContent
  
  type Point = typings.unist.mod.Point
  
  type Root = typings.mdast.mod.Root
  
  type Strong = typings.mdast.mod.Strong
  
  type Text = typings.mdast.mod.Text
  
  type ThematicBreak = typings.mdast.mod.ThematicBreak
  
  type Token = typings.micromarkUtilTypes.mod.Token
  
  type TokenizeContext = typings.micromarkUtilTypes.mod.TokenizeContext
  
  type Transform = js.Function1[/* tree */ Root, Root | Unit]
  
  type UnistParent = typings.unist.mod.Parent[typings.unist.mod.Node[Data], NodeData[typings.unist.mod.Node[Data]]]
  
  type Value = typings.micromarkUtilTypes.mod.Value
}
