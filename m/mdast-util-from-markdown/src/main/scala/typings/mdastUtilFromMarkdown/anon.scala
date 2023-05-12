package typings.mdastUtilFromMarkdown

import typings.mdastUtilFromMarkdown.devLibMod.CompileContext
import typings.mdastUtilFromMarkdown.devLibMod.Config
import typings.mdastUtilFromMarkdown.devLibMod.Fragment
import typings.mdastUtilFromMarkdown.devLibMod.Node
import typings.mdastUtilFromMarkdown.devLibMod.OnEnterError
import typings.mdastUtilFromMarkdown.devLibMod.OnExitError
import typings.mdastUtilFromMarkdown.devLibMod.Token
import typings.mdastUtilFromMarkdown.devLibMod.TokenTuple
import typings.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.atHardBreak
import typings.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.characterReferenceType
import typings.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.expectingFirstListItemValue
import typings.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.flowCodeInside
import typings.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.inReference
import typings.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.referenceType
import typings.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.setextHeadingSlurpLineEnding
import typings.micromarkUtilTypes.anon.PickTokenstartend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(token: PickTokenstartend): String = js.native
    def apply(token: PickTokenstartend, expandTabs: Boolean): String = js.native
  }
  
  /* Inlined std.Omit<mdast-util-from-markdown.mdast-util-from-markdown/dev/lib.CompileContext, 'sliceSerialize'> */
  trait OmitCompileContextsliceSe extends StObject {
    
    def buffer(): Unit
    @JSName("buffer")
    var buffer_Original: js.ThisFunction0[/* this */ CompileContext, Unit]
    
    var config: Config
    
    def enter[Kind /* <: Node */](node: Kind, token: Token): Kind
    def enter[Kind /* <: Node */](node: Kind, token: Token, onError: OnEnterError): Kind
    @JSName("enter")
    var enter_Original: js.ThisFunction3[
        /* this */ CompileContext, 
        /* node */ Node, 
        /* token */ Token, 
        /* onError */ js.UndefOr[OnEnterError], 
        Node
      ]
    
    def exit(token: Token): Node
    def exit(token: Token, onError: OnExitError): Node
    @JSName("exit")
    var exit_Original: js.ThisFunction2[
        /* this */ CompileContext, 
        /* token */ Token, 
        /* onError */ js.UndefOr[OnExitError], 
        Node
      ]
    
    def getData[Key /* <: atHardBreak | characterReferenceType | expectingFirstListItemValue | flowCodeInside | inReference | setextHeadingSlurpLineEnding | referenceType */](key: Key): /* import warning: importer.ImportType#apply Failed type conversion: mdast-util-from-markdown.mdast-util-from-markdown/dev.CompileData[Key] */ js.Any
    @JSName("getData")
    var getData_Original: js.Function1[
        /* key */ atHardBreak | characterReferenceType | expectingFirstListItemValue | flowCodeInside | inReference | setextHeadingSlurpLineEnding | referenceType, 
        /* import warning: importer.ImportType#apply Failed type conversion: mdast-util-from-markdown.mdast-util-from-markdown/dev.CompileData['atHardBreak' | 'characterReferenceType' | 'expectingFirstListItemValue' | 'flowCodeInside' | 'inReference' | 'setextHeadingSlurpLineEnding' | 'referenceType'] */ js.Any
      ]
    
    def resume(): String
    @JSName("resume")
    var resume_Original: js.ThisFunction0[/* this */ CompileContext, String]
    
    def setData[Key_1 /* <: atHardBreak | characterReferenceType | expectingFirstListItemValue | flowCodeInside | inReference | setextHeadingSlurpLineEnding | referenceType */](key: Key_1): Unit
    def setData[Key_1 /* <: atHardBreak | characterReferenceType | expectingFirstListItemValue | flowCodeInside | inReference | setextHeadingSlurpLineEnding | referenceType */](
      key: Key_1,
      value: /* import warning: importer.ImportType#apply Failed type conversion: mdast-util-from-markdown.mdast-util-from-markdown/dev.CompileData[Key_1] */ js.Any
    ): Unit
    @JSName("setData")
    var setData_Original: js.Function2[
        /* key */ atHardBreak | characterReferenceType | expectingFirstListItemValue | flowCodeInside | inReference | setextHeadingSlurpLineEnding | referenceType, 
        /* value */ js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: mdast-util-from-markdown.mdast-util-from-markdown/dev.CompileData['atHardBreak' | 'characterReferenceType' | 'expectingFirstListItemValue' | 'flowCodeInside' | 'inReference' | 'setextHeadingSlurpLineEnding' | 'referenceType'] */ js.Any
        ], 
        Unit
      ]
    
    var stack: js.Array[Node | Fragment]
    
    var tokenStack: js.Array[TokenTuple]
  }
  object OmitCompileContextsliceSe {
    
    inline def apply(
      buffer: js.ThisFunction0[/* this */ CompileContext, Unit],
      config: Config,
      enter: js.ThisFunction3[
          /* this */ CompileContext, 
          /* node */ Node, 
          /* token */ Token, 
          /* onError */ js.UndefOr[OnEnterError], 
          Node
        ],
      exit: js.ThisFunction2[
          /* this */ CompileContext, 
          /* token */ Token, 
          /* onError */ js.UndefOr[OnExitError], 
          Node
        ],
      getData: /* key */ atHardBreak | characterReferenceType | expectingFirstListItemValue | flowCodeInside | inReference | setextHeadingSlurpLineEnding | referenceType => /* import warning: importer.ImportType#apply Failed type conversion: mdast-util-from-markdown.mdast-util-from-markdown/dev.CompileData['atHardBreak' | 'characterReferenceType' | 'expectingFirstListItemValue' | 'flowCodeInside' | 'inReference' | 'setextHeadingSlurpLineEnding' | 'referenceType'] */ js.Any,
      resume: js.ThisFunction0[/* this */ CompileContext, String],
      setData: (/* key */ atHardBreak | characterReferenceType | expectingFirstListItemValue | flowCodeInside | inReference | setextHeadingSlurpLineEnding | referenceType, /* value */ js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: mdast-util-from-markdown.mdast-util-from-markdown/dev.CompileData['atHardBreak' | 'characterReferenceType' | 'expectingFirstListItemValue' | 'flowCodeInside' | 'inReference' | 'setextHeadingSlurpLineEnding' | 'referenceType'] */ js.Any
        ]) => Unit,
      stack: js.Array[Node | Fragment],
      tokenStack: js.Array[TokenTuple]
    ): OmitCompileContextsliceSe = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], enter = enter.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any], getData = js.Any.fromFunction1(getData), resume = resume.asInstanceOf[js.Any], setData = js.Any.fromFunction2(setData), stack = stack.asInstanceOf[js.Any], tokenStack = tokenStack.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitCompileContextsliceSe]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitCompileContextsliceSe] (val x: Self) extends AnyVal {
      
      inline def setBuffer(value: js.ThisFunction0[/* this */ CompileContext, Unit]): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setEnter(
        value: js.ThisFunction3[
              /* this */ CompileContext, 
              /* node */ Node, 
              /* token */ Token, 
              /* onError */ js.UndefOr[OnEnterError], 
              Node
            ]
      ): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setExit(
        value: js.ThisFunction2[
              /* this */ CompileContext, 
              /* token */ Token, 
              /* onError */ js.UndefOr[OnExitError], 
              Node
            ]
      ): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      inline def setGetData(
        value: /* key */ atHardBreak | characterReferenceType | expectingFirstListItemValue | flowCodeInside | inReference | setextHeadingSlurpLineEnding | referenceType => /* import warning: importer.ImportType#apply Failed type conversion: mdast-util-from-markdown.mdast-util-from-markdown/dev.CompileData['atHardBreak' | 'characterReferenceType' | 'expectingFirstListItemValue' | 'flowCodeInside' | 'inReference' | 'setextHeadingSlurpLineEnding' | 'referenceType'] */ js.Any
      ): Self = StObject.set(x, "getData", js.Any.fromFunction1(value))
      
      inline def setResume(value: js.ThisFunction0[/* this */ CompileContext, String]): Self = StObject.set(x, "resume", value.asInstanceOf[js.Any])
      
      inline def setSetData(
        value: (/* key */ atHardBreak | characterReferenceType | expectingFirstListItemValue | flowCodeInside | inReference | setextHeadingSlurpLineEnding | referenceType, /* value */ js.UndefOr[
              /* import warning: importer.ImportType#apply Failed type conversion: mdast-util-from-markdown.mdast-util-from-markdown/dev.CompileData['atHardBreak' | 'characterReferenceType' | 'expectingFirstListItemValue' | 'flowCodeInside' | 'inReference' | 'setextHeadingSlurpLineEnding' | 'referenceType'] */ js.Any
            ]) => Unit
      ): Self = StObject.set(x, "setData", js.Any.fromFunction2(value))
      
      inline def setStack(value: js.Array[Node | Fragment]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackVarargs(value: (Node | Fragment)*): Self = StObject.set(x, "stack", js.Array(value*))
      
      inline def setTokenStack(value: js.Array[TokenTuple]): Self = StObject.set(x, "tokenStack", value.asInstanceOf[js.Any])
      
      inline def setTokenStackVarargs(value: TokenTuple*): Self = StObject.set(x, "tokenStack", js.Array(value*))
    }
  }
  
  /* Inlined std.Omit<mdast-util-from-markdown.mdast-util-from-markdown/lib.CompileContext, 'sliceSerialize'> */
  trait OmitCompileContextsliceSeBuffer extends StObject {
    
    def buffer(): Unit
    @JSName("buffer")
    var buffer_Original: js.ThisFunction0[/* this */ typings.mdastUtilFromMarkdown.libMod.CompileContext, Unit]
    
    var config: typings.mdastUtilFromMarkdown.libMod.Config
    
    def enter[Kind /* <: typings.mdastUtilFromMarkdown.libMod.Node */](node: Kind, token: typings.mdastUtilFromMarkdown.libMod.Token): Kind
    def enter[Kind /* <: typings.mdastUtilFromMarkdown.libMod.Node */](
      node: Kind,
      token: typings.mdastUtilFromMarkdown.libMod.Token,
      onError: typings.mdastUtilFromMarkdown.libMod.OnEnterError
    ): Kind
    @JSName("enter")
    var enter_Original: js.ThisFunction3[
        /* this */ typings.mdastUtilFromMarkdown.libMod.CompileContext, 
        /* node */ typings.mdastUtilFromMarkdown.libMod.Node, 
        /* token */ typings.mdastUtilFromMarkdown.libMod.Token, 
        /* onError */ js.UndefOr[typings.mdastUtilFromMarkdown.libMod.OnEnterError], 
        typings.mdastUtilFromMarkdown.libMod.Node
      ]
    
    def exit(token: typings.mdastUtilFromMarkdown.libMod.Token): typings.mdastUtilFromMarkdown.libMod.Node
    def exit(
      token: typings.mdastUtilFromMarkdown.libMod.Token,
      onError: typings.mdastUtilFromMarkdown.libMod.OnExitError
    ): typings.mdastUtilFromMarkdown.libMod.Node
    @JSName("exit")
    var exit_Original: js.ThisFunction2[
        /* this */ typings.mdastUtilFromMarkdown.libMod.CompileContext, 
        /* token */ typings.mdastUtilFromMarkdown.libMod.Token, 
        /* onError */ js.UndefOr[typings.mdastUtilFromMarkdown.libMod.OnExitError], 
        typings.mdastUtilFromMarkdown.libMod.Node
      ]
    
    def getData[Key /* <: atHardBreak | characterReferenceType | expectingFirstListItemValue | flowCodeInside | inReference | setextHeadingSlurpLineEnding | referenceType */](key: Key): /* import warning: importer.ImportType#apply Failed type conversion: mdast-util-from-markdown.mdast-util-from-markdown.CompileData[Key] */ js.Any
    @JSName("getData")
    var getData_Original: js.Function1[
        /* key */ atHardBreak | characterReferenceType | expectingFirstListItemValue | flowCodeInside | inReference | setextHeadingSlurpLineEnding | referenceType, 
        /* import warning: importer.ImportType#apply Failed type conversion: mdast-util-from-markdown.mdast-util-from-markdown.CompileData['atHardBreak' | 'characterReferenceType' | 'expectingFirstListItemValue' | 'flowCodeInside' | 'inReference' | 'setextHeadingSlurpLineEnding' | 'referenceType'] */ js.Any
      ]
    
    def resume(): String
    @JSName("resume")
    var resume_Original: js.ThisFunction0[/* this */ typings.mdastUtilFromMarkdown.libMod.CompileContext, String]
    
    def setData[Key_1 /* <: atHardBreak | characterReferenceType | expectingFirstListItemValue | flowCodeInside | inReference | setextHeadingSlurpLineEnding | referenceType */](key: Key_1): Unit
    def setData[Key_1 /* <: atHardBreak | characterReferenceType | expectingFirstListItemValue | flowCodeInside | inReference | setextHeadingSlurpLineEnding | referenceType */](
      key: Key_1,
      value: /* import warning: importer.ImportType#apply Failed type conversion: mdast-util-from-markdown.mdast-util-from-markdown.CompileData[Key_1] */ js.Any
    ): Unit
    @JSName("setData")
    var setData_Original: js.Function2[
        /* key */ atHardBreak | characterReferenceType | expectingFirstListItemValue | flowCodeInside | inReference | setextHeadingSlurpLineEnding | referenceType, 
        /* value */ js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: mdast-util-from-markdown.mdast-util-from-markdown.CompileData['atHardBreak' | 'characterReferenceType' | 'expectingFirstListItemValue' | 'flowCodeInside' | 'inReference' | 'setextHeadingSlurpLineEnding' | 'referenceType'] */ js.Any
        ], 
        Unit
      ]
    
    var stack: js.Array[
        typings.mdastUtilFromMarkdown.libMod.Node | typings.mdastUtilFromMarkdown.libMod.Fragment
      ]
    
    var tokenStack: js.Array[typings.mdastUtilFromMarkdown.libMod.TokenTuple]
  }
  object OmitCompileContextsliceSeBuffer {
    
    inline def apply(
      buffer: js.ThisFunction0[/* this */ typings.mdastUtilFromMarkdown.libMod.CompileContext, Unit],
      config: typings.mdastUtilFromMarkdown.libMod.Config,
      enter: js.ThisFunction3[
          /* this */ typings.mdastUtilFromMarkdown.libMod.CompileContext, 
          /* node */ typings.mdastUtilFromMarkdown.libMod.Node, 
          /* token */ typings.mdastUtilFromMarkdown.libMod.Token, 
          /* onError */ js.UndefOr[typings.mdastUtilFromMarkdown.libMod.OnEnterError], 
          typings.mdastUtilFromMarkdown.libMod.Node
        ],
      exit: js.ThisFunction2[
          /* this */ typings.mdastUtilFromMarkdown.libMod.CompileContext, 
          /* token */ typings.mdastUtilFromMarkdown.libMod.Token, 
          /* onError */ js.UndefOr[typings.mdastUtilFromMarkdown.libMod.OnExitError], 
          typings.mdastUtilFromMarkdown.libMod.Node
        ],
      getData: /* key */ atHardBreak | characterReferenceType | expectingFirstListItemValue | flowCodeInside | inReference | setextHeadingSlurpLineEnding | referenceType => /* import warning: importer.ImportType#apply Failed type conversion: mdast-util-from-markdown.mdast-util-from-markdown.CompileData['atHardBreak' | 'characterReferenceType' | 'expectingFirstListItemValue' | 'flowCodeInside' | 'inReference' | 'setextHeadingSlurpLineEnding' | 'referenceType'] */ js.Any,
      resume: js.ThisFunction0[/* this */ typings.mdastUtilFromMarkdown.libMod.CompileContext, String],
      setData: (/* key */ atHardBreak | characterReferenceType | expectingFirstListItemValue | flowCodeInside | inReference | setextHeadingSlurpLineEnding | referenceType, /* value */ js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: mdast-util-from-markdown.mdast-util-from-markdown.CompileData['atHardBreak' | 'characterReferenceType' | 'expectingFirstListItemValue' | 'flowCodeInside' | 'inReference' | 'setextHeadingSlurpLineEnding' | 'referenceType'] */ js.Any
        ]) => Unit,
      stack: js.Array[
          typings.mdastUtilFromMarkdown.libMod.Node | typings.mdastUtilFromMarkdown.libMod.Fragment
        ],
      tokenStack: js.Array[typings.mdastUtilFromMarkdown.libMod.TokenTuple]
    ): OmitCompileContextsliceSeBuffer = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], enter = enter.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any], getData = js.Any.fromFunction1(getData), resume = resume.asInstanceOf[js.Any], setData = js.Any.fromFunction2(setData), stack = stack.asInstanceOf[js.Any], tokenStack = tokenStack.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitCompileContextsliceSeBuffer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitCompileContextsliceSeBuffer] (val x: Self) extends AnyVal {
      
      inline def setBuffer(value: js.ThisFunction0[/* this */ typings.mdastUtilFromMarkdown.libMod.CompileContext, Unit]): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: typings.mdastUtilFromMarkdown.libMod.Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setEnter(
        value: js.ThisFunction3[
              /* this */ typings.mdastUtilFromMarkdown.libMod.CompileContext, 
              /* node */ typings.mdastUtilFromMarkdown.libMod.Node, 
              /* token */ typings.mdastUtilFromMarkdown.libMod.Token, 
              /* onError */ js.UndefOr[typings.mdastUtilFromMarkdown.libMod.OnEnterError], 
              typings.mdastUtilFromMarkdown.libMod.Node
            ]
      ): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setExit(
        value: js.ThisFunction2[
              /* this */ typings.mdastUtilFromMarkdown.libMod.CompileContext, 
              /* token */ typings.mdastUtilFromMarkdown.libMod.Token, 
              /* onError */ js.UndefOr[typings.mdastUtilFromMarkdown.libMod.OnExitError], 
              typings.mdastUtilFromMarkdown.libMod.Node
            ]
      ): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      inline def setGetData(
        value: /* key */ atHardBreak | characterReferenceType | expectingFirstListItemValue | flowCodeInside | inReference | setextHeadingSlurpLineEnding | referenceType => /* import warning: importer.ImportType#apply Failed type conversion: mdast-util-from-markdown.mdast-util-from-markdown.CompileData['atHardBreak' | 'characterReferenceType' | 'expectingFirstListItemValue' | 'flowCodeInside' | 'inReference' | 'setextHeadingSlurpLineEnding' | 'referenceType'] */ js.Any
      ): Self = StObject.set(x, "getData", js.Any.fromFunction1(value))
      
      inline def setResume(value: js.ThisFunction0[/* this */ typings.mdastUtilFromMarkdown.libMod.CompileContext, String]): Self = StObject.set(x, "resume", value.asInstanceOf[js.Any])
      
      inline def setSetData(
        value: (/* key */ atHardBreak | characterReferenceType | expectingFirstListItemValue | flowCodeInside | inReference | setextHeadingSlurpLineEnding | referenceType, /* value */ js.UndefOr[
              /* import warning: importer.ImportType#apply Failed type conversion: mdast-util-from-markdown.mdast-util-from-markdown.CompileData['atHardBreak' | 'characterReferenceType' | 'expectingFirstListItemValue' | 'flowCodeInside' | 'inReference' | 'setextHeadingSlurpLineEnding' | 'referenceType'] */ js.Any
            ]) => Unit
      ): Self = StObject.set(x, "setData", js.Any.fromFunction2(value))
      
      inline def setStack(
        value: js.Array[
              typings.mdastUtilFromMarkdown.libMod.Node | typings.mdastUtilFromMarkdown.libMod.Fragment
            ]
      ): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackVarargs(
        value: (typings.mdastUtilFromMarkdown.libMod.Node | typings.mdastUtilFromMarkdown.libMod.Fragment)*
      ): Self = StObject.set(x, "stack", js.Array(value*))
      
      inline def setTokenStack(value: js.Array[typings.mdastUtilFromMarkdown.libMod.TokenTuple]): Self = StObject.set(x, "tokenStack", value.asInstanceOf[js.Any])
      
      inline def setTokenStackVarargs(value: typings.mdastUtilFromMarkdown.libMod.TokenTuple*): Self = StObject.set(x, "tokenStack", js.Array(value*))
    }
  }
}
