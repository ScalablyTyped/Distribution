package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.jquery.JQuery.Promise
import typings.oojs.OO.ArgTuple
import typings.oojs.OO.EventConnectionMap
import typings.oojs.OO.EventHandler
import typings.oojsUi.OO.ui.Element.ScrollIntoViewConfig
import typings.oojsUi.OO.ui.SelectFileWidget.Props
import typings.oojsUi.OO.ui.SelectFileWidget.Prototype
import typings.oojsUi.OO.ui.mixin.GroupElement
import typings.oojsUi.anon.PartialRecordkeyofEventMaDisable
import typings.oojsUi.oojsUiStrings.auto
import typings.oojsUi.oojsUiStrings.change
import typings.oojsUi.oojsUiStrings.disable
import typings.oojsUi.oojsUiStrings.toggle
import typings.std.Document
import typings.std.File
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SelectFileWidgets allow for selecting files, using the HTML5 File API. These
  * widgets can be configured with {@link OO.ui.mixin.IconElement icons}, {@link
  * OO.ui.mixin.IndicatorElement indicators} and {@link OO.ui.mixin.TitledElement titles}.
  * Please see the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Widgets)
  * for more information and examples.
  *
  * Although SelectFileWidget inherits from SelectFileInputWidget, it does not
  * behave as an InputWidget, and can't be used in HTML forms.
  *
  *     // A file select widget.
  *     var selectFile = new OO.ui.SelectFileWidget();
  *     $( document.body ).append( selectFile.$element );
  *
  * ResourceLoader module: `oojs-ui-widgets`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.SelectFileWidget
  */
@js.native
trait SelectFileWidget
  extends StObject
     with Props
     with Prototype
object SelectFileWidget {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.SelectFileInputWidget.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.PendingElement.ConfigOptions {
    
    /**
      * Show only the select file button, no info field. Requires {@link showDropTarget} to
      * be false.
      */
    var buttonOnly: js.UndefOr[Boolean] = js.undefined
    
    /** Whether to accept files by drag and drop. */
    var droppable: js.UndefOr[Boolean] = js.undefined
    
    /** Text to display when file support is missing in the browser. */
    var notsupported: js.UndefOr[String] = js.undefined
    
    /** Whether to show a drop target. Requires {@link droppable} to be true. */
    var showDropTarget: js.UndefOr[Boolean] = js.undefined
    
    /** File size limit in MiB above which to not try and show a preview (for performance). */
    var thumbnailSizeLimit: js.UndefOr[Double] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setButtonOnly(value: Boolean): Self = StObject.set(x, "buttonOnly", value.asInstanceOf[js.Any])
      
      inline def setButtonOnlyUndefined: Self = StObject.set(x, "buttonOnly", js.undefined)
      
      inline def setDroppable(value: Boolean): Self = StObject.set(x, "droppable", value.asInstanceOf[js.Any])
      
      inline def setDroppableUndefined: Self = StObject.set(x, "droppable", js.undefined)
      
      inline def setNotsupported(value: String): Self = StObject.set(x, "notsupported", value.asInstanceOf[js.Any])
      
      inline def setNotsupportedUndefined: Self = StObject.set(x, "notsupported", js.undefined)
      
      inline def setShowDropTarget(value: Boolean): Self = StObject.set(x, "showDropTarget", value.asInstanceOf[js.Any])
      
      inline def setShowDropTargetUndefined: Self = StObject.set(x, "showDropTarget", js.undefined)
      
      inline def setThumbnailSizeLimit(value: Double): Self = StObject.set(x, "thumbnailSizeLimit", value.asInstanceOf[js.Any])
      
      inline def setThumbnailSizeLimitUndefined: Self = StObject.set(x, "thumbnailSizeLimit", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[SelectFileWidget]
       with Instantiable1[/* config */ ConfigOptions, SelectFileWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.SelectFileInputWidget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.SelectFileInputWidget.Constructor = js.native
  }
  
  // HACK: See SelectWidget.d.ts
  trait EventMap
    extends StObject
       with typings.oojsUi.OO.ui.Widget.EventMap {
    
    var change: js.Array[/* value */ File | Null]
  }
  object EventMap {
    
    inline def apply(
      change: js.Array[/* value */ File | Null],
      disable: js.Array[/* disabled */ Boolean],
      toggle: js.Array[/* visible */ Boolean]
    ): EventMap = {
      val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
      
      inline def setChange(value: js.Array[/* value */ File | Null]): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
      
      inline def setChangeVarargs(value: (/* value */ File | Null)*): Self = StObject.set(x, "change", js.Array(value*))
    }
  }
  
  trait Props
    extends StObject
       with typings.oojsUi.OO.ui.SelectFileInputWidget.Props
       with typings.oojsUi.OO.ui.mixin.PendingElement.Props
  object Props {
    
    inline def apply(
      $accessKeyed: JQuery[HTMLElement],
      $element: JQuery[HTMLElement],
      $input: JQuery[HTMLElement],
      $pending: JQuery[HTMLElement],
      $required: JQuery[HTMLElement],
      $tabIndexed: JQuery[HTMLElement],
      $titled: JQuery[HTMLElement]
    ): Props = {
      val __obj = js.Dynamic.literal($accessKeyed = $accessKeyed.asInstanceOf[js.Any], $element = $element.asInstanceOf[js.Any], $input = $input.asInstanceOf[js.Any], $pending = $pending.asInstanceOf[js.Any], $required = $required.asInstanceOf[js.Any], $tabIndexed = $tabIndexed.asInstanceOf[js.Any], $titled = $titled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
  }
  
  // HACK: Fix LSP violation
  /* Inlined parent std.Omit<oojs-ui.OO.ui.SelectFileInputWidget.Prototype, 'getValue' | 'setValue' | 'on' | 'once' | 'off' | 'connect' | 'disconnect'> */
  /* Inlined parent oojs-ui.OO.ui.mixin.PendingElement.Prototype */
  @js.native
  trait Prototype extends StObject {
    
    def blur(): this.type = js.native
    @JSName("blur")
    var blur_Original: js.Function0[this.type] = js.native
    
    def connect[T /* <: PartialRecordkeyofEventMaDisable */, C](context: C, methods: EventConnectionMap[T, C, EventMap]): this.type = js.native
    
    def disconnect[T /* <: PartialRecordkeyofEventMaDisable */, C](context: C): this.type = js.native
    def disconnect[T /* <: PartialRecordkeyofEventMaDisable */, C](context: C, methods: EventConnectionMap[T, C, EventMap]): this.type = js.native
    
    def emit[K /* <: change */](
      event: K,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: /* import warning: importer.ImportType#apply Failed type conversion: oojs-ui.OO.ui.InputWidget.EventMap[K] */ js.Any
    ): Boolean = js.native
    
    def emitThrow[K /* <: change */](
      event: K,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: /* import warning: importer.ImportType#apply Failed type conversion: oojs-ui.OO.ui.InputWidget.EventMap[K] */ js.Any
    ): Boolean = js.native
    @JSName("emitThrow")
    var emitThrow_Original: js.Function2[
        change, 
        /* import warning: importer.ImportType#apply Failed type conversion: oojs-ui.OO.ui.InputWidget.EventMap['change'] */ /* args */ js.Any, 
        Boolean
      ] = js.native
    @JSName("emitThrow")
    def emitThrow_change(
      event: change,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* value */ File | Null]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_change[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'change' ? never : K */ js.Any,
      args: Any*
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_disable(
      event: disable,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* disabled */ Boolean]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_toggle(
      event: toggle,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* visible */ Boolean]
    ): Boolean = js.native
    
    @JSName("emit")
    var emit_Original: js.Function2[
        change, 
        /* import warning: importer.ImportType#apply Failed type conversion: oojs-ui.OO.ui.InputWidget.EventMap['change'] */ /* args */ js.Any, 
        Boolean
      ] = js.native
    @JSName("emit")
    def emit_change(
      event: change,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* value */ File | Null]
    ): Boolean = js.native
    @JSName("emit")
    def emit_change[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'change' ? never : K */ js.Any,
      args: Any*
    ): Boolean = js.native
    @JSName("emit")
    def emit_disable(
      event: disable,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* disabled */ Boolean]
    ): Boolean = js.native
    @JSName("emit")
    def emit_toggle(
      event: toggle,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* visible */ Boolean]
    ): Boolean = js.native
    
    def focus(): this.type = js.native
    @JSName("focus")
    var focus_Original: js.Function0[this.type] = js.native
    
    def formatTitleWithAccessKey(title: String): String = js.native
    @JSName("formatTitleWithAccessKey")
    var formatTitleWithAccessKey_Original: js.Function1[/* title */ String, String] = js.native
    
    def getAccessKey(): String = js.native
    @JSName("getAccessKey")
    var getAccessKey_Original: js.Function0[String] = js.native
    
    def getClosestScrollableElementContainer(): HTMLElement = js.native
    @JSName("getClosestScrollableElementContainer")
    var getClosestScrollableElementContainer_Original: js.Function0[HTMLElement] = js.native
    
    def getData(): Any = js.native
    @JSName("getData")
    var getData_Original: js.Function0[Any] = js.native
    
    def getElementDocument(): Document = js.native
    @JSName("getElementDocument")
    var getElementDocument_Original: js.Function0[Document] = js.native
    
    def getElementGroup(): GroupElement | Null = js.native
    @JSName("getElementGroup")
    var getElementGroup_Original: js.Function0[GroupElement | Null] = js.native
    
    def getElementId(): String = js.native
    @JSName("getElementId")
    var getElementId_Original: js.Function0[String] = js.native
    
    def getElementWindow(): Any = js.native
    @JSName("getElementWindow")
    var getElementWindow_Original: js.Function0[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Window */ Any
      ] = js.native
    
    def getFilename(): String = js.native
    @JSName("getFilename")
    var getFilename_Original: js.Function0[String] = js.native
    
    def getInputId(): String | Null = js.native
    @JSName("getInputId")
    var getInputId_Original: js.Function0[String | Null] = js.native
    
    def getTabIndex(): Double | Null = js.native
    @JSName("getTabIndex")
    var getTabIndex_Original: js.Function0[Double | Null] = js.native
    
    def getTagName(): String = js.native
    @JSName("getTagName")
    var getTagName_Original: js.Function0[String] = js.native
    
    def getTitle(): String | Null = js.native
    @JSName("getTitle")
    var getTitle_Original: js.Function0[String | Null] = js.native
    
    /**
      * Get the current value of the field
      *
      * For single file widgets returns a File or null.
      * For multiple file widgets returns a list of Files.
      *
      * @return
      */
    def getValue(): File | js.Array[File] | Null = js.native
    
    def isDisabled(): Boolean = js.native
    @JSName("isDisabled")
    var isDisabled_Original: js.Function0[Boolean] = js.native
    
    def isElementAttached(): Boolean = js.native
    @JSName("isElementAttached")
    var isElementAttached_Original: js.Function0[Boolean] = js.native
    
    /**
      * Check if an element is pending.
      *
      * @return Element is pending
      */
    def isPending(): Boolean = js.native
    
    def isRequired(): Boolean = js.native
    @JSName("isRequired")
    var isRequired_Original: js.Function0[Boolean] = js.native
    
    def isVisible(): Boolean = js.native
    @JSName("isVisible")
    var isVisible_Original: js.Function0[Boolean] = js.native
    
    /**
      * If the selected file is an image, get its URL and load it.
      *
      * @param file File
      * @return Promise resolves with the image URL after it has loaded
      */
    def loadAndGetImageUrl(file: File): Promise[String, Any, Any] = js.native
    
    @JSName("off")
    def off_change[C](event: change): this.type = js.native
    @JSName("off")
    def off_change[C](event: change, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_change[C](
      event: change,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* value */ File | Null], Unit]
        ]
    ): this.type = js.native
    @JSName("off")
    def off_change[C](
      event: change,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* value */ File | Null], Unit]
        ],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_change[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'change' ? never : K */ js.Any
    ): this.type = js.native
    @JSName("off")
    def off_change[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'change' ? never : K */ js.Any,
      method: Unit,
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_change[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'change' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]]
    ): this.type = js.native
    @JSName("off")
    def off_change[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'change' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_disable[C](event: disable): this.type = js.native
    @JSName("off")
    def off_disable[C](event: disable, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_disable[C](
      event: disable,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* disabled */ Boolean], Unit]
        ]
    ): this.type = js.native
    @JSName("off")
    def off_disable[C](
      event: disable,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* disabled */ Boolean], Unit]
        ],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_toggle[C](event: toggle): this.type = js.native
    @JSName("off")
    def off_toggle[C](event: toggle, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_toggle[C](
      event: toggle,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* visible */ Boolean], Unit]
        ]
    ): this.type = js.native
    @JSName("off")
    def off_toggle[C](
      event: toggle,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* visible */ Boolean], Unit]
        ],
      context: C
    ): this.type = js.native
    
    @JSName("on")
    def on_change[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'change' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]]
    ): this.type = js.native
    @JSName("on")
    def on_change[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'change' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      args: js.Array[Any]
    ): this.type = js.native
    @JSName("on")
    def on_change[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'change' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      args: js.Array[Any],
      context: C
    ): this.type = js.native
    @JSName("on")
    def on_change[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'change' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      args: Unit,
      context: C
    ): this.type = js.native
    // #region EventEmitter overloads
    @JSName("on")
    def on_change[A /* <: ArgTuple */, C](
      event: change,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ]
    ): this.type = js.native
    @JSName("on")
    def on_change[A /* <: ArgTuple */, C](
      event: change,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: A
    ): this.type = js.native
    @JSName("on")
    def on_change[A /* <: ArgTuple */, C](
      event: change,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: A,
      context: C
    ): this.type = js.native
    @JSName("on")
    def on_change[A /* <: ArgTuple */, C](
      event: change,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: Unit,
      context: C
    ): this.type = js.native
    @JSName("on")
    def on_disable[A /* <: ArgTuple */, C](
      event: disable,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ]
    ): this.type = js.native
    @JSName("on")
    def on_disable[A /* <: ArgTuple */, C](
      event: disable,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: A
    ): this.type = js.native
    @JSName("on")
    def on_disable[A /* <: ArgTuple */, C](
      event: disable,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: A,
      context: C
    ): this.type = js.native
    @JSName("on")
    def on_disable[A /* <: ArgTuple */, C](
      event: disable,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: Unit,
      context: C
    ): this.type = js.native
    @JSName("on")
    def on_toggle[A /* <: ArgTuple */, C](
      event: toggle,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ]
    ): this.type = js.native
    @JSName("on")
    def on_toggle[A /* <: ArgTuple */, C](
      event: toggle,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: A
    ): this.type = js.native
    @JSName("on")
    def on_toggle[A /* <: ArgTuple */, C](
      event: toggle,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: A,
      context: C
    ): this.type = js.native
    @JSName("on")
    def on_toggle[A /* <: ArgTuple */, C](
      event: toggle,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: Unit,
      context: C
    ): this.type = js.native
    
    @JSName("once")
    def once_change(
      event: change,
      listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[/* value */ File | Null], Unit]
    ): this.type = js.native
    @JSName("once")
    def once_change[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'change' ? never : K */ js.Any,
      listener: js.ThisFunction1[/* this */ Null, /* repeated */ Any, Unit]
    ): this.type = js.native
    @JSName("once")
    def once_disable(
      event: disable,
      listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[/* disabled */ Boolean], Unit]
    ): this.type = js.native
    @JSName("once")
    def once_toggle(
      event: toggle,
      listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[/* visible */ Boolean], Unit]
    ): this.type = js.native
    
    /**
      * Decrease the pending counter. The pending state will remain active until the counter is zero
      * (i.e., the number of calls to {@link pushPending} and {@link popPending} is the same).
      *
      * @return The element, for chaining
      */
    def popPending(): this.type = js.native
    
    /**
      * Increase the pending counter. The pending state will remain active until the counter is zero
      * (i.e., the number of calls to {@link pushPending} and {@link popPending} is the same).
      *
      * @return The element, for chaining
      */
    def pushPending(): this.type = js.native
    
    def scrollElementIntoView(): Promise[Unit, Any, Any] = js.native
    def scrollElementIntoView(config: ScrollIntoViewConfig): Promise[Unit, Any, Any] = js.native
    @JSName("scrollElementIntoView")
    var scrollElementIntoView_Original: js.Function1[/* config */ js.UndefOr[ScrollIntoViewConfig], Promise[Unit, Any, Any]] = js.native
    
    def setAccessKey(): this.type = js.native
    def setAccessKey(accessKey: Deferrable[String]): this.type = js.native
    @JSName("setAccessKey")
    var setAccessKey_Original: js.Function1[/* accessKey */ Deferrable[String] | Null, this.type] = js.native
    
    def setAccessKeyedElement($accessKeyed: JQuery[HTMLElement]): Unit = js.native
    @JSName("setAccessKeyedElement")
    var setAccessKeyedElement_Original: js.Function1[/* $accessKeyed */ JQuery[HTMLElement], Unit] = js.native
    
    def setData(data: Any): this.type = js.native
    @JSName("setData")
    var setData_Original: js.Function1[/* data */ Any, this.type] = js.native
    
    def setDir(dir: Direction): this.type = js.native
    @JSName("setDir")
    var setDir_Original: js.Function1[/* dir */ Direction | auto, this.type] = js.native
    @JSName("setDir")
    def setDir_auto(dir: auto): this.type = js.native
    
    def setDisabled(disabled: Boolean): this.type = js.native
    @JSName("setDisabled")
    var setDisabled_Original: js.Function1[/* disabled */ Boolean, this.type] = js.native
    
    def setElementGroup(): this.type = js.native
    def setElementGroup(group: GroupElement): this.type = js.native
    @JSName("setElementGroup")
    var setElementGroup_Original: js.Function1[/* group */ GroupElement | Null, this.type] = js.native
    
    def setElementId(id: String): this.type = js.native
    @JSName("setElementId")
    var setElementId_Original: js.Function1[/* id */ String, this.type] = js.native
    
    def setInputId(id: String): this.type = js.native
    @JSName("setInputId")
    var setInputId_Original: js.Function1[/* id */ String, this.type] = js.native
    
    def setLabelledBy(): Unit = js.native
    def setLabelledBy(id: String): Unit = js.native
    @JSName("setLabelledBy")
    var setLabelledBy_Original: js.Function1[/* id */ String | Null, Unit] = js.native
    
    /**
      * Set the pending element (and clean up any existing one).
      *
      * @param $pending The element to set to pending.
      */
    def setPendingElement($pending: JQuery[HTMLElement]): Unit = js.native
    
    def setRequired(state: Boolean): this.type = js.native
    
    def setRequiredElement($required: JQuery[HTMLElement]): Unit = js.native
    @JSName("setRequiredElement")
    var setRequiredElement_Original: js.Function1[/* $required */ JQuery[HTMLElement], Unit] = js.native
    
    @JSName("setRequired")
    var setRequired_Original: js.Function1[/* state */ Boolean, this.type] = js.native
    
    def setTabIndex(): this.type = js.native
    def setTabIndex(tabIndex: Numberish): this.type = js.native
    @JSName("setTabIndex")
    var setTabIndex_Original: js.Function1[/* tabIndex */ Numberish | Null, this.type] = js.native
    
    def setTabIndexedElement($tabIndexed: JQuery[HTMLElement]): this.type = js.native
    @JSName("setTabIndexedElement")
    var setTabIndexedElement_Original: js.Function1[/* $tabIndexed */ JQuery[HTMLElement], this.type] = js.native
    
    def setTitle(): this.type = js.native
    def setTitle(title: Deferrable[String]): this.type = js.native
    @JSName("setTitle")
    var setTitle_Original: js.Function1[/* title */ Deferrable[String] | Null, this.type] = js.native
    
    def setTitledElement($titled: JQuery[HTMLElement]): Unit = js.native
    @JSName("setTitledElement")
    var setTitledElement_Original: js.Function1[/* $titled */ JQuery[HTMLElement], Unit] = js.native
    
    /**
      * Set the current value of the field
      *
      * @param files Files to select
      */
    def setValue(): Unit = js.native
    def setValue(files: js.Array[File]): Unit = js.native
    
    def simulateLabelClick(): Unit = js.native
    @JSName("simulateLabelClick")
    var simulateLabelClick_Original: js.Function0[Unit] = js.native
    
    def supports(methods: String): Boolean = js.native
    def supports(methods: js.Array[String]): Boolean = js.native
    @JSName("supports")
    var supports_Original: js.Function1[/* methods */ String | js.Array[String], Boolean] = js.native
    
    def toggle(): this.type = js.native
    def toggle(show: Boolean): this.type = js.native
    @JSName("toggle")
    var toggle_Original: js.Function1[/* show */ js.UndefOr[Boolean], this.type] = js.native
    
    def updateDisabled(): this.type = js.native
    @JSName("updateDisabled")
    var updateDisabled_Original: js.Function0[this.type] = js.native
    
    def updateThemeClasses(): Unit = js.native
    @JSName("updateThemeClasses")
    var updateThemeClasses_Original: js.Function0[Unit] = js.native
  }
  
  @js.native
  trait Static
    extends StObject
       with typings.oojsUi.OO.ui.InputWidget.Static {
    
    /**
      * Check if this widget is supported
      *
      * @return
      */
    def isSupported(): Boolean = js.native
  }
}
