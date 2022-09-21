package typings.mdarea

import typings.mdarea.anon.Action
import typings.mdarea.anon.PartialKeymap
import typings.std.HTMLDivElement
import typings.std.HTMLTextAreaElement
import typings.std.InputEvent
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdarea", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with MarkdownArea {
    def this(elem: HTMLTextAreaElement) = this()
    def this(elem: HTMLTextAreaElement, maybeOptions: EditorOptions) = this()
  }
  object default {
    
    @JSImport("mdarea", "default.version")
    @js.native
    val version: String = js.native
  }
  
  trait Editor extends StObject {
    
    var elem: HTMLTextAreaElement
    
    var helper: HTMLDivElement
    
    var history: js.Array[EditorState]
    
    var idx: Double
    
    var lock: Boolean
    
    def onInput(evt: InputEvent): Unit
    
    def onKeyDown(evt: KeyboardEvent): Unit
    
    def onUndo(evt: InputEvent): Unit
    
    var options: NormalisedOptions
    
    var state: EditorState
  }
  object Editor {
    
    inline def apply(
      elem: HTMLTextAreaElement,
      helper: HTMLDivElement,
      history: js.Array[EditorState],
      idx: Double,
      lock: Boolean,
      onInput: InputEvent => Unit,
      onKeyDown: KeyboardEvent => Unit,
      onUndo: InputEvent => Unit,
      options: NormalisedOptions,
      state: EditorState
    ): Editor = {
      val __obj = js.Dynamic.literal(elem = elem.asInstanceOf[js.Any], helper = helper.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any], lock = lock.asInstanceOf[js.Any], onInput = js.Any.fromFunction1(onInput), onKeyDown = js.Any.fromFunction1(onKeyDown), onUndo = js.Any.fromFunction1(onUndo), options = options.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Editor]
    }
    
    extension [Self <: Editor](x: Self) {
      
      inline def setElem(value: HTMLTextAreaElement): Self = StObject.set(x, "elem", value.asInstanceOf[js.Any])
      
      inline def setHelper(value: HTMLDivElement): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
      
      inline def setHistory(value: js.Array[EditorState]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryVarargs(value: EditorState*): Self = StObject.set(x, "history", js.Array(value*))
      
      inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
      
      inline def setLock(value: Boolean): Self = StObject.set(x, "lock", value.asInstanceOf[js.Any])
      
      inline def setOnInput(value: InputEvent => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      inline def setOnKeyDown(value: KeyboardEvent => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnUndo(value: InputEvent => Unit): Self = StObject.set(x, "onUndo", js.Any.fromFunction1(value))
      
      inline def setOptions(value: NormalisedOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setState(value: EditorState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mdarea.mdareaStrings.enter
    - typings.mdarea.mdareaStrings.indent
    - typings.mdarea.mdareaStrings.outdent
    - typings.mdarea.mdareaStrings.`inline`
  */
  trait EditorAction extends StObject
  object EditorAction {
    
    inline def enter: typings.mdarea.mdareaStrings.enter = "enter".asInstanceOf[typings.mdarea.mdareaStrings.enter]
    
    inline def indent: typings.mdarea.mdareaStrings.indent = "indent".asInstanceOf[typings.mdarea.mdareaStrings.indent]
    
    inline def `inline`: typings.mdarea.mdareaStrings.`inline` = "inline".asInstanceOf[typings.mdarea.mdareaStrings.`inline`]
    
    inline def outdent: typings.mdarea.mdareaStrings.outdent = "outdent".asInstanceOf[typings.mdarea.mdareaStrings.outdent]
  }
  
  trait EditorOptions extends StObject {
    
    var extensions: js.UndefOr[js.Array[MarkdownAreaExtension]] = js.undefined
    
    var indent: js.UndefOr[String | Double] = js.undefined
    
    var keyMap: js.UndefOr[PartialKeymap] = js.undefined
  }
  object EditorOptions {
    
    inline def apply(): EditorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditorOptions]
    }
    
    extension [Self <: EditorOptions](x: Self) {
      
      inline def setExtensions(value: js.Array[MarkdownAreaExtension]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: MarkdownAreaExtension*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setIndent(value: String | Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setKeyMap(value: PartialKeymap): Self = StObject.set(x, "keyMap", value.asInstanceOf[js.Any])
      
      inline def setKeyMapUndefined: Self = StObject.set(x, "keyMap", js.undefined)
    }
  }
  
  trait EditorState extends StObject {
    
    var c: Boolean
    
    var e: Double
    
    var s: Double
    
    var v: String
    
    var x: Double
    
    var y: Double
  }
  object EditorState {
    
    inline def apply(c: Boolean, e: Double, s: Double, v: String, x: Double, y: Double): EditorState = {
      val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorState]
    }
    
    extension [Self <: EditorState](x: Self) {
      
      inline def setC(value: Boolean): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      inline def setE(value: Double): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyCombo extends StObject {
    
    var altKey: js.UndefOr[Boolean] = js.undefined
    
    var ctrlKey: js.UndefOr[Boolean] = js.undefined
    
    var key: String
    
    var metaKey: js.UndefOr[Boolean] = js.undefined
    
    var shiftKey: js.UndefOr[Boolean] = js.undefined
  }
  object KeyCombo {
    
    inline def apply(key: String): KeyCombo = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyCombo]
    }
    
    extension [Self <: KeyCombo](x: Self) {
      
      inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      inline def setAltKeyUndefined: Self = StObject.set(x, "altKey", js.undefined)
      
      inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      inline def setCtrlKeyUndefined: Self = StObject.set(x, "ctrlKey", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
      
      inline def setMetaKeyUndefined: Self = StObject.set(x, "metaKey", js.undefined)
      
      inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
      
      inline def setShiftKeyUndefined: Self = StObject.set(x, "shiftKey", js.undefined)
    }
  }
  
  /* Inlined {[ A in mdarea.mdarea.EditorAction ]: string | std.Array<string>} */
  trait Keymap extends StObject {
    
    var enter: String | js.Array[String]
    
    var indent: String | js.Array[String]
    
    var `inline`: String | js.Array[String]
    
    var outdent: String | js.Array[String]
  }
  object Keymap {
    
    inline def apply(
      enter: String | js.Array[String],
      indent: String | js.Array[String],
      `inline`: String | js.Array[String],
      outdent: String | js.Array[String]
    ): Keymap = {
      val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], outdent = outdent.asInstanceOf[js.Any])
      __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Keymap]
    }
    
    extension [Self <: Keymap](x: Self) {
      
      inline def setEnter(value: String | js.Array[String]): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setEnterVarargs(value: String*): Self = StObject.set(x, "enter", js.Array(value*))
      
      inline def setIndent(value: String | js.Array[String]): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentVarargs(value: String*): Self = StObject.set(x, "indent", js.Array(value*))
      
      inline def setInline(value: String | js.Array[String]): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineVarargs(value: String*): Self = StObject.set(x, "inline", js.Array(value*))
      
      inline def setOutdent(value: String | js.Array[String]): Self = StObject.set(x, "outdent", value.asInstanceOf[js.Any])
      
      inline def setOutdentVarargs(value: String*): Self = StObject.set(x, "outdent", js.Array(value*))
    }
  }
  
  @js.native
  trait MarkdownArea extends StObject {
    
    def destroy(): Null = js.native
    
    /* private */ val ed: Any = js.native
    
    def getElement(): HTMLTextAreaElement = js.native
    
    def getValue(): String = js.native
    
    def pushState(state: NewState): Unit = js.native
    
    def setElement(elem: HTMLTextAreaElement): Unit = js.native
    
    def setValue(value: String): Unit = js.native
    def setValue(value: String, keepUndo: Boolean): Unit = js.native
  }
  
  trait MarkdownAreaExtension extends StObject {
    
    var cleanup: js.UndefOr[js.Function1[/* editor */ MarkdownArea, Unit]] = js.undefined
    
    var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    def handleKey(prefix: String, selection: String, postfix: String, evt: KeyboardEvent): js.UndefOr[NewState]
    
    var init: js.UndefOr[js.Function1[/* editor */ MarkdownArea, Unit]] = js.undefined
  }
  object MarkdownAreaExtension {
    
    inline def apply(handleKey: (String, String, String, KeyboardEvent) => js.UndefOr[NewState]): MarkdownAreaExtension = {
      val __obj = js.Dynamic.literal(handleKey = js.Any.fromFunction4(handleKey))
      __obj.asInstanceOf[MarkdownAreaExtension]
    }
    
    extension [Self <: MarkdownAreaExtension](x: Self) {
      
      inline def setCleanup(value: /* editor */ MarkdownArea => Unit): Self = StObject.set(x, "cleanup", js.Any.fromFunction1(value))
      
      inline def setCleanupUndefined: Self = StObject.set(x, "cleanup", js.undefined)
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setHandleKey(value: (String, String, String, KeyboardEvent) => js.UndefOr[NewState]): Self = StObject.set(x, "handleKey", js.Any.fromFunction4(value))
      
      inline def setInit(value: /* editor */ MarkdownArea => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    }
  }
  
  trait NewState extends StObject {
    
    var e: js.UndefOr[Double] = js.undefined
    
    var s: Double
    
    var v: String
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object NewState {
    
    inline def apply(s: Double, v: String): NewState = {
      val __obj = js.Dynamic.literal(s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewState]
    }
    
    extension [Self <: NewState](x: Self) {
      
      inline def setE(value: Double): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  type NormalisedKeyMap = js.Array[Action]
  
  trait NormalisedOptions extends StObject {
    
    var extensions: js.Array[MarkdownAreaExtension]
    
    var indent: String
    
    var keyMap: NormalisedKeyMap
    
    var reOutdent: js.RegExp
  }
  object NormalisedOptions {
    
    inline def apply(
      extensions: js.Array[MarkdownAreaExtension],
      indent: String,
      keyMap: NormalisedKeyMap,
      reOutdent: js.RegExp
    ): NormalisedOptions = {
      val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], keyMap = keyMap.asInstanceOf[js.Any], reOutdent = reOutdent.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalisedOptions]
    }
    
    extension [Self <: NormalisedOptions](x: Self) {
      
      inline def setExtensions(value: js.Array[MarkdownAreaExtension]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsVarargs(value: MarkdownAreaExtension*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setKeyMap(value: NormalisedKeyMap): Self = StObject.set(x, "keyMap", value.asInstanceOf[js.Any])
      
      inline def setKeyMapVarargs(value: Action*): Self = StObject.set(x, "keyMap", js.Array(value*))
      
      inline def setReOutdent(value: js.RegExp): Self = StObject.set(x, "reOutdent", value.asInstanceOf[js.Any])
    }
  }
}
