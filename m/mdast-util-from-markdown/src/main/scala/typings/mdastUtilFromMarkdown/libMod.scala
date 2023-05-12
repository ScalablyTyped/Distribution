package typings.mdastUtilFromMarkdown

import typings.mdastUtilFromMarkdown.anon.FnCall
import typings.mdastUtilFromMarkdown.anon.OmitCompileContextsliceSeBuffer
import typings.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.atHardBreak
import typings.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.characterReferenceMarkerHexadecimal
import typings.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.characterReferenceMarkerNumeric
import typings.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.characterReferenceType
import typings.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.children
import typings.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.collapsed
import typings.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.expectingFirstListItemValue
import typings.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.flowCodeInside
import typings.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.fragment
import typings.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.full
import typings.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.inReference
import typings.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.referenceType
import typings.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.setextHeadingSlurpLineEnding
import typings.micromarkUtilTypes.anon.PickTokenstartend
import typings.std.Record
import typings.unist.mod.Data
import typings.unist.mod.NodeData
import typings.unist.mod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("mdast-util-from-markdown/lib", "fromMarkdown")
  @js.native
  val fromMarkdown: (js.Function3[
    /* value */ Value, 
    /* encoding */ Encoding, 
    /* options */ js.UndefOr[Options | Null], 
    Root
  ]) & (js.Function2[/* value */ Value, /* options */ js.UndefOr[Options | Null], Root]) = js.native
  
  type Blockquote = typings.mdast.mod.Blockquote
  
  type Break = typings.mdast.mod.Break
  
  type Code = typings.mdast.mod.Code
  
  @js.native
  trait CompileContext extends StObject {
    
    /**
      *   Capture some of the output data.
      */
    def buffer(): Unit = js.native
    
    /**
      *   Configuration.
      */
    var config: Config = js.native
    
    def enter(node: typings.mdast.mod.Content, token: Token): typings.mdast.mod.Content = js.native
    def enter(node: typings.mdast.mod.Content, token: Token, onError: OnEnterError): typings.mdast.mod.Content = js.native
    /**
      *   Enter a token.
      */
    def enter(node: typings.mdast.mod.Root, token: Token): typings.mdast.mod.Root = js.native
    def enter(node: typings.mdast.mod.Root, token: Token, onError: OnEnterError): typings.mdast.mod.Root = js.native
    
    /**
      *   Exit a token.
      */
    def exit(token: Token): Node = js.native
    def exit(token: Token, onError: OnExitError): Node = js.native
    
    /**
      *   Get data from the key/value store.
      */
    @JSName("getData")
    def getData_atHardBreak(key: atHardBreak): js.UndefOr[Boolean] = js.native
    @JSName("getData")
    def getData_characterReferenceType(key: characterReferenceType): js.UndefOr[characterReferenceMarkerHexadecimal | characterReferenceMarkerNumeric] = js.native
    @JSName("getData")
    def getData_expectingFirstListItemValue(key: expectingFirstListItemValue): js.UndefOr[Boolean] = js.native
    @JSName("getData")
    def getData_flowCodeInside(key: flowCodeInside): js.UndefOr[Boolean] = js.native
    @JSName("getData")
    def getData_inReference(key: inReference): js.UndefOr[Boolean] = js.native
    @JSName("getData")
    def getData_referenceType(key: referenceType): js.UndefOr[collapsed | full] = js.native
    @JSName("getData")
    def getData_setextHeadingSlurpLineEnding(key: setextHeadingSlurpLineEnding): js.UndefOr[Boolean] = js.native
    
    /**
      *   Stop capturing and access the output data.
      */
    def resume(): String = js.native
    
    def setData(
      key: characterReferenceType,
      value: js.UndefOr[characterReferenceMarkerHexadecimal | characterReferenceMarkerNumeric]
    ): Unit = js.native
    def setData(key: referenceType, value: js.UndefOr[collapsed | full]): Unit = js.native
    /**
      *   Set data into the key/value store.
      */
    @JSName("setData")
    def setData_atHardBreak(key: atHardBreak): Unit = js.native
    @JSName("setData")
    def setData_atHardBreak(key: atHardBreak, value: js.UndefOr[Boolean]): Unit = js.native
    @JSName("setData")
    def setData_characterReferenceType(key: characterReferenceType): Unit = js.native
    @JSName("setData")
    def setData_expectingFirstListItemValue(key: expectingFirstListItemValue): Unit = js.native
    @JSName("setData")
    def setData_expectingFirstListItemValue(key: expectingFirstListItemValue, value: js.UndefOr[Boolean]): Unit = js.native
    @JSName("setData")
    def setData_flowCodeInside(key: flowCodeInside): Unit = js.native
    @JSName("setData")
    def setData_flowCodeInside(key: flowCodeInside, value: js.UndefOr[Boolean]): Unit = js.native
    @JSName("setData")
    def setData_inReference(key: inReference): Unit = js.native
    @JSName("setData")
    def setData_inReference(key: inReference, value: js.UndefOr[Boolean]): Unit = js.native
    @JSName("setData")
    def setData_referenceType(key: referenceType): Unit = js.native
    @JSName("setData")
    def setData_setextHeadingSlurpLineEnding(key: setextHeadingSlurpLineEnding): Unit = js.native
    @JSName("setData")
    def setData_setextHeadingSlurpLineEnding(key: setextHeadingSlurpLineEnding, value: js.UndefOr[Boolean]): Unit = js.native
    
    /**
      *   Get the string value of a token.
      */
    def sliceSerialize(token: PickTokenstartend): String = js.native
    /**
      *   Get the string value of a token.
      */
    def sliceSerialize(token: PickTokenstartend, expandTabs: Boolean): String = js.native
    /**
      *   Get the string value of a token.
      */
    @JSName("sliceSerialize")
    var sliceSerialize_Original: FnCall = js.native
    
    /**
      *   Stack of nodes.
      */
    var stack: js.Array[Node | Fragment] = js.native
    
    /**
      *   Stack of tokens.
      */
    var tokenStack: js.Array[TokenTuple] = js.native
  }
  
  type CompileData = typings.mdastUtilFromMarkdown.mod.CompileData
  
  trait Config extends StObject {
    
    /**
      *   Token types where line endings are used.
      */
    var canContainEols: js.Array[String]
    
    /**
      *   Opening handles.
      */
    var enter: Handles
    
    /**
      *   Closing handles.
      */
    var exit: Handles
    
    /**
      *   Tree transforms.
      */
    var transforms: js.Array[Transform]
  }
  object Config {
    
    inline def apply(canContainEols: js.Array[String], enter: Handles, exit: Handles, transforms: js.Array[Transform]): Config = {
      val __obj = js.Dynamic.literal(canContainEols = canContainEols.asInstanceOf[js.Any], enter = enter.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any], transforms = transforms.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setCanContainEols(value: js.Array[String]): Self = StObject.set(x, "canContainEols", value.asInstanceOf[js.Any])
      
      inline def setCanContainEolsVarargs(value: String*): Self = StObject.set(x, "canContainEols", js.Array(value*))
      
      inline def setEnter(value: Handles): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setExit(value: Handles): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      inline def setTransforms(value: js.Array[Transform]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
      
      inline def setTransformsVarargs(value: Transform*): Self = StObject.set(x, "transforms", js.Array(value*))
    }
  }
  
  type Content = typings.mdast.mod.Content
  
  type Definition = typings.mdast.mod.Definition
  
  type Emphasis = typings.mdast.mod.Emphasis
  
  type Encoding = typings.micromarkUtilTypes.mod.Encoding
  
  type Event = typings.micromarkUtilTypes.mod.Event
  
  /* Inlined std.Partial<mdast-util-from-markdown.mdast-util-from-markdown/lib.Config> */
  trait Extension extends StObject {
    
    var canContainEols: js.UndefOr[js.Array[String]] = js.undefined
    
    var enter: js.UndefOr[Handles] = js.undefined
    
    var exit: js.UndefOr[Handles] = js.undefined
    
    var transforms: js.UndefOr[js.Array[Transform]] = js.undefined
  }
  object Extension {
    
    inline def apply(): Extension = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Extension]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Extension] (val x: Self) extends AnyVal {
      
      inline def setCanContainEols(value: js.Array[String]): Self = StObject.set(x, "canContainEols", value.asInstanceOf[js.Any])
      
      inline def setCanContainEolsUndefined: Self = StObject.set(x, "canContainEols", js.undefined)
      
      inline def setCanContainEolsVarargs(value: String*): Self = StObject.set(x, "canContainEols", js.Array(value*))
      
      inline def setEnter(value: Handles): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setExit(value: Handles): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
      
      inline def setTransforms(value: js.Array[Transform]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
      
      inline def setTransformsUndefined: Self = StObject.set(x, "transforms", js.undefined)
      
      inline def setTransformsVarargs(value: Transform*): Self = StObject.set(x, "transforms", js.Array(value*))
    }
  }
  
  /* Inlined std.Omit<mdast-util-from-markdown.mdast-util-from-markdown/lib.UnistParent, 'type' | 'children'> & {  type :'fragment',   children :std.Array<mdast-util-from-markdown.mdast-util-from-markdown/lib.PhrasingContent>} */
  trait Fragment extends StObject {
    
    var children: js.Array[PhrasingContent]
    
    var data: js.UndefOr[NodeData[typings.unist.mod.Node[Data]]] = js.undefined
    
    var position: js.UndefOr[Position] = js.undefined
    
    var `type`: fragment
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
      
      inline def setData(value: NodeData[typings.unist.mod.Node[Data]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setType(value: fragment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FromMarkdownOptions extends StObject {
    
    /**
      * Extensions for this utility to change how tokens are turned into a tree.
      */
    var mdastExtensions: js.UndefOr[(js.Array[Extension | js.Array[Extension]]) | Null] = js.undefined
  }
  object FromMarkdownOptions {
    
    inline def apply(): FromMarkdownOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FromMarkdownOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FromMarkdownOptions] (val x: Self) extends AnyVal {
      
      inline def setMdastExtensions(value: js.Array[Extension | js.Array[Extension]]): Self = StObject.set(x, "mdastExtensions", value.asInstanceOf[js.Any])
      
      inline def setMdastExtensionsNull: Self = StObject.set(x, "mdastExtensions", null)
      
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
  
  type OnEnterError = js.ThisFunction2[
    /* this */ OmitCompileContextsliceSeBuffer, 
    /* left */ js.UndefOr[Token], 
    /* right */ Token, 
    Unit
  ]
  
  type OnExitError = js.ThisFunction2[/* this */ OmitCompileContextsliceSeBuffer, /* left */ Token, /* right */ Token, Unit]
  
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
  
  /* Inlined std.Extract<mdast-util-from-markdown.mdast-util-from-markdown/lib.Node, mdast-util-from-markdown.mdast-util-from-markdown/lib.UnistParent> */
  type Parent = children
  
  type ParseOptions = typings.micromarkUtilTypes.mod.ParseOptions
  
  type PhrasingContent = typings.mdast.mod.PhrasingContent
  
  type Point = typings.unist.mod.Point
  
  type ReferenceType = typings.mdast.mod.ReferenceType
  
  type Root = typings.mdast.mod.Root
  
  type StaticPhrasingContent = typings.mdast.mod.StaticPhrasingContent
  
  type Strong = typings.mdast.mod.Strong
  
  type Text = typings.mdast.mod.Text
  
  type ThematicBreak = typings.mdast.mod.ThematicBreak
  
  type Token = typings.micromarkUtilTypes.mod.Token
  
  type TokenTuple = js.Tuple2[Token, js.UndefOr[OnEnterError]]
  
  type TokenizeContext = typings.micromarkUtilTypes.mod.TokenizeContext
  
  type Transform = js.Function1[/* tree */ Root, js.UndefOr[Root | Null | Unit]]
  
  type UnistParent = typings.unist.mod.Parent[typings.unist.mod.Node[Data], NodeData[typings.unist.mod.Node[Data]]]
  
  type Value = typings.micromarkUtilTypes.mod.Value
}
