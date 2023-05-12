package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.jquery.JQuery.Promise
import typings.oojs.OO.ArgTuple
import typings.oojs.OO.EventConnectionMap
import typings.oojs.OO.EventHandler
import typings.oojsUi.OO.ui.Element.ScrollIntoViewConfig
import typings.oojsUi.OO.ui.NumberInputWidget.Prototype
import typings.oojsUi.OO.ui.TextInputWidget.EventMap
import typings.oojsUi.OO.ui.TextInputWidget.Props
import typings.oojsUi.OO.ui.mixin.GroupElement
import typings.oojsUi.anon.PartialRecordkeyofEventMaChangeDisable
import typings.oojsUi.oojsUiStrings.after
import typings.oojsUi.oojsUiStrings.auto
import typings.oojsUi.oojsUiStrings.before
import typings.oojsUi.oojsUiStrings.enter
import typings.oojsUi.oojsUiStrings.input
import typings.std.Document
import typings.std.HTMLElement
import typings.std.Omit
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NumberInputWidgets combine a {@link OO.ui.TextInputWidget text input} (where a value
  * can be entered manually) and two {@link OO.ui.ButtonWidget button widgets}
  * (to adjust the value in increments) to allow the user to enter a number.
  *
  *     // A NumberInputWidget.
  *     var numberInput = new OO.ui.NumberInputWidget( {
  *         label: 'NumberInputWidget',
  *         input: { value: 5 },
  *         min: 1,
  *         max: 10
  *     } );
  *     $( document.body ).append( numberInput.$element );
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.NumberInputWidget
  */
@js.native
trait NumberInputWidget
  extends StObject
     with Props
     with Prototype
object NumberInputWidget {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.TextInputWidget.ConfigOptions {
    
    /** @deprecated */
    var allowInteger: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Delta when using the buttons or Up/Down arrow keys.
      * Defaults to `step` if specified, otherwise `1`.
      */
    var buttonStep: js.UndefOr[Double] = js.undefined
    
    /** @deprecated */
    var input: js.UndefOr[Omit[this.type, typings.oojsUi.oojsUiStrings.input]] = js.undefined
    
    /** @deprecated */
    var isInteger: js.UndefOr[Boolean] = js.undefined
    
    /** Maximum allowed value */
    var max: js.UndefOr[Double] = js.undefined
    
    /** Minimum allowed value */
    var min: js.UndefOr[Double] = js.undefined
    
    /** Configuration options to pass to the {@link OO.ui.ButtonWidget decrementing button widget}. */
    var minusButton: js.UndefOr[typings.oojsUi.OO.ui.ButtonWidget.ConfigOptions] = js.undefined
    
    /** Delta when using the Page-up/Page-down keys. Defaults to 10 times `buttonStep`. */
    var pageStep: js.UndefOr[Double] = js.undefined
    
    /** Configuration options to pass to the {@link OO.ui.ButtonWidget incrementing button widget}. */
    var plusButton: js.UndefOr[typings.oojsUi.OO.ui.ButtonWidget.ConfigOptions] = js.undefined
    
    /** Whether to show the plus and minus buttons. */
    var showButtons: js.UndefOr[Boolean] = js.undefined
    
    /** If specified, the field only accepts values that are multiples of this. */
    var step: js.UndefOr[Double | Null] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowInteger(value: Boolean): Self = StObject.set(x, "allowInteger", value.asInstanceOf[js.Any])
      
      inline def setAllowIntegerUndefined: Self = StObject.set(x, "allowInteger", js.undefined)
      
      inline def setButtonStep(value: Double): Self = StObject.set(x, "buttonStep", value.asInstanceOf[js.Any])
      
      inline def setButtonStepUndefined: Self = StObject.set(x, "buttonStep", js.undefined)
      
      inline def setInput(value: Omit[ConfigOptions, input]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setIsInteger(value: Boolean): Self = StObject.set(x, "isInteger", value.asInstanceOf[js.Any])
      
      inline def setIsIntegerUndefined: Self = StObject.set(x, "isInteger", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setMinusButton(value: typings.oojsUi.OO.ui.ButtonWidget.ConfigOptions): Self = StObject.set(x, "minusButton", value.asInstanceOf[js.Any])
      
      inline def setMinusButtonUndefined: Self = StObject.set(x, "minusButton", js.undefined)
      
      inline def setPageStep(value: Double): Self = StObject.set(x, "pageStep", value.asInstanceOf[js.Any])
      
      inline def setPageStepUndefined: Self = StObject.set(x, "pageStep", js.undefined)
      
      inline def setPlusButton(value: typings.oojsUi.OO.ui.ButtonWidget.ConfigOptions): Self = StObject.set(x, "plusButton", value.asInstanceOf[js.Any])
      
      inline def setPlusButtonUndefined: Self = StObject.set(x, "plusButton", js.undefined)
      
      inline def setShowButtons(value: Boolean): Self = StObject.set(x, "showButtons", value.asInstanceOf[js.Any])
      
      inline def setShowButtonsUndefined: Self = StObject.set(x, "showButtons", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepNull: Self = StObject.set(x, "step", null)
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[NumberInputWidget]
       with Instantiable1[/* config */ ConfigOptions, NumberInputWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.TextInputWidget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.TextInputWidget.Constructor = js.native
  }
  
  type Props = typings.oojsUi.OO.ui.TextInputWidget.Props
  
  // HACK: Omit to fix LSP violation
  /* Inlined parent std.Omit<oojs-ui.OO.ui.TextInputWidget.Prototype, 'getRange'> */
  @js.native
  trait Prototype extends StObject {
    
    /**
      * Adjust the value of the widget
      *
      * @param delta Adjustment amount
      */
    def adjustValue(delta: Double): Unit = js.native
    
    def blur(): this.type = js.native
    @JSName("blur")
    var blur_Original: js.Function0[this.type] = js.native
    
    def clearFlags(): this.type = js.native
    @JSName("clearFlags")
    var clearFlags_Original: js.Function0[this.type] = js.native
    
    def connect[T /* <: PartialRecordkeyofEventMaChangeDisable */, C](context: C, methods: EventConnectionMap[T, C, EventMap]): this.type = js.native
    @JSName("connect")
    var connect_Original: js.Function2[
        /* context */ Any, 
        /* methods */ EventConnectionMap[PartialRecordkeyofEventMaChangeDisable, Any, EventMap], 
        this.type
      ] = js.native
    
    def disconnect[T /* <: PartialRecordkeyofEventMaChangeDisable */, C](context: C): this.type = js.native
    def disconnect[T /* <: PartialRecordkeyofEventMaChangeDisable */, C](context: C, methods: EventConnectionMap[T, C, EventMap]): this.type = js.native
    @JSName("disconnect")
    var disconnect_Original: js.Function2[
        /* context */ Any, 
        /* methods */ js.UndefOr[EventConnectionMap[PartialRecordkeyofEventMaChangeDisable, Any, EventMap]], 
        this.type
      ] = js.native
    
    def emit[K /* <: enter */](
      event: K,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: /* import warning: importer.ImportType#apply Failed type conversion: oojs-ui.OO.ui.TextInputWidget.EventMap[K] */ js.Any
    ): Boolean = js.native
    
    def emitThrow[K /* <: enter */](
      event: K,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: /* import warning: importer.ImportType#apply Failed type conversion: oojs-ui.OO.ui.TextInputWidget.EventMap[K] */ js.Any
    ): Boolean = js.native
    @JSName("emitThrow")
    var emitThrow_Original: js.Function2[
        enter, 
        /* import warning: importer.ImportType#apply Failed type conversion: oojs-ui.OO.ui.TextInputWidget.EventMap['enter'] */ /* args */ js.Any, 
        Boolean
      ] = js.native
    
    @JSName("emit")
    var emit_Original: js.Function2[
        enter, 
        /* import warning: importer.ImportType#apply Failed type conversion: oojs-ui.OO.ui.TextInputWidget.EventMap['enter'] */ /* args */ js.Any, 
        Boolean
      ] = js.native
    
    def encapsulateContent(pre: String, post: String): this.type = js.native
    @JSName("encapsulateContent")
    var encapsulateContent_Original: js.Function2[/* pre */ String, /* post */ String, this.type] = js.native
    
    def focus(): this.type = js.native
    @JSName("focus")
    var focus_Original: js.Function0[this.type] = js.native
    
    def formatTitleWithAccessKey(title: String): String = js.native
    @JSName("formatTitleWithAccessKey")
    var formatTitleWithAccessKey_Original: js.Function1[/* title */ String, String] = js.native
    
    def getAccessKey(): String = js.native
    @JSName("getAccessKey")
    var getAccessKey_Original: js.Function0[String] = js.native
    
    /** @deprecated */
    def getAllowInteger(): Boolean = js.native
    
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
    
    def getFlags(): js.Array[String] = js.native
    @JSName("getFlags")
    var getFlags_Original: js.Function0[js.Array[String]] = js.native
    
    def getIcon(): String = js.native
    @JSName("getIcon")
    var getIcon_Original: js.Function0[String] = js.native
    
    def getIndicator(): String | Null = js.native
    @JSName("getIndicator")
    var getIndicator_Original: js.Function0[String | Null] = js.native
    
    def getInputId(): String | Null = js.native
    @JSName("getInputId")
    var getInputId_Original: js.Function0[String | Null] = js.native
    
    def getInputLength(): Double = js.native
    @JSName("getInputLength")
    var getInputLength_Original: js.Function0[Double] = js.native
    
    /** @deprecated */
    def getIsInteger(): Boolean = js.native
    
    def getLabel(): JQuery[HTMLElement] | String | Null = js.native
    @JSName("getLabel")
    var getLabel_Original: js.Function0[JQuery[HTMLElement] | String | Null] = js.native
    
    /**
      * Get the current value of the widget as a number
      *
      * @return May be NaN, or an invalid number
      */
    def getNumericValue(): Double = js.native
    
    /**
      * Get the current range
      *
      * @return Minimum and maximum values
      */
    def getRange(): js.Tuple2[Double, Double] = js.native
    
    /**
      * Get the current stepping values
      *
      * @return Button step, page step, and validity step
      */
    def getStep(): js.Tuple3[Double, Double, Double] = js.native
    
    def getTabIndex(): Double | Null = js.native
    @JSName("getTabIndex")
    var getTabIndex_Original: js.Function0[Double | Null] = js.native
    
    def getTagName(): String = js.native
    @JSName("getTagName")
    var getTagName_Original: js.Function0[String] = js.native
    
    def getTitle(): String | Null = js.native
    @JSName("getTitle")
    var getTitle_Original: js.Function0[String | Null] = js.native
    
    def getValidity(): Promise[Unit, Any, Any] = js.native
    @JSName("getValidity")
    var getValidity_Original: js.Function0[Promise[Unit, Any, Any]] = js.native
    
    def getValue(): String = js.native
    @JSName("getValue")
    var getValue_Original: js.Function0[String] = js.native
    
    def hasFlag(flag: String): Boolean = js.native
    @JSName("hasFlag")
    var hasFlag_Original: js.Function1[/* flag */ String, Boolean] = js.native
    
    def insertContent(content: String): this.type = js.native
    @JSName("insertContent")
    var insertContent_Original: js.Function1[/* content */ String, this.type] = js.native
    
    def installParentChangeDetector(): Unit = js.native
    @JSName("installParentChangeDetector")
    var installParentChangeDetector_Original: js.Function0[Unit] = js.native
    
    def isDisabled(): Boolean = js.native
    @JSName("isDisabled")
    var isDisabled_Original: js.Function0[Boolean] = js.native
    
    def isElementAttached(): Boolean = js.native
    @JSName("isElementAttached")
    var isElementAttached_Original: js.Function0[Boolean] = js.native
    
    def isPending(): Boolean = js.native
    @JSName("isPending")
    var isPending_Original: js.Function0[Boolean] = js.native
    
    def isReadOnly(): Boolean = js.native
    @JSName("isReadOnly")
    var isReadOnly_Original: js.Function0[Boolean] = js.native
    
    def isRequired(): Boolean = js.native
    @JSName("isRequired")
    var isRequired_Original: js.Function0[Boolean] = js.native
    
    def isVisible(): Boolean = js.native
    @JSName("isVisible")
    var isVisible_Original: js.Function0[Boolean] = js.native
    
    def moveCursorToEnd(): this.type = js.native
    @JSName("moveCursorToEnd")
    var moveCursorToEnd_Original: js.Function0[this.type] = js.native
    
    def moveCursorToStart(): this.type = js.native
    @JSName("moveCursorToStart")
    var moveCursorToStart_Original: js.Function0[this.type] = js.native
    
    def off[K /* <: enter */, C](event: K): this.type = js.native
    def off[K /* <: enter */, C](event: K, method: Unit, context: C): this.type = js.native
    def off[K /* <: enter */, C](
      event: K,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply Failed type conversion: oojs-ui.OO.ui.TextInputWidget.EventMap[K] */ /* args */ js.Any, 
            Unit
          ]
        ]
    ): this.type = js.native
    def off[K /* <: enter */, C](
      event: K,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply Failed type conversion: oojs-ui.OO.ui.TextInputWidget.EventMap[K] */ /* args */ js.Any, 
            Unit
          ]
        ],
      context: C
    ): this.type = js.native
    @JSName("off")
    var off_Original: js.Function3[
        enter, 
        /* method */ js.UndefOr[
          EventHandler[
            Null, 
            js.ThisFunction1[
              /* this */ Null, 
              /* import warning: importer.ImportType#apply Failed type conversion: oojs-ui.OO.ui.TextInputWidget.EventMap['enter'] */ /* args */ js.Any, 
              Unit
            ]
          ]
        ], 
        /* context */ js.UndefOr[Null], 
        this.type
      ] = js.native
    
    def on[K /* <: enter */, A /* <: ArgTuple */, C](
      event: K,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ]
    ): this.type = js.native
    def on[K /* <: enter */, A /* <: ArgTuple */, C](
      event: K,
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
    def on[K /* <: enter */, A /* <: ArgTuple */, C](
      event: K,
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
    def on[K /* <: enter */, A /* <: ArgTuple */, C](
      event: K,
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
    var on_Original: js.Function4[
        enter, 
        /* method */ EventHandler[
          Null, 
          js.ThisFunction1[
            /* this */ Null, 
            /* import warning: importer.ImportType#apply c repeated non-array type: [] */ /* args */ js.Array[js.Array[Any]], 
            Unit
          ]
        ], 
        /* args */ js.UndefOr[js.Array[Any]], 
        /* context */ js.UndefOr[Null], 
        this.type
      ] = js.native
    
    def once[K /* <: enter */](
      event: K,
      listener: js.ThisFunction1[
          /* this */ Null, 
          /* import warning: importer.ImportType#apply Failed type conversion: oojs-ui.OO.ui.TextInputWidget.EventMap[K] */ /* args */ js.Any, 
          Unit
        ]
    ): this.type = js.native
    @JSName("once")
    var once_Original: js.Function2[
        enter, 
        /* listener */ js.ThisFunction1[
          /* this */ Null, 
          /* import warning: importer.ImportType#apply Failed type conversion: oojs-ui.OO.ui.TextInputWidget.EventMap['enter'] */ /* args */ js.Any, 
          Unit
        ], 
        this.type
      ] = js.native
    
    def popPending(): this.type = js.native
    @JSName("popPending")
    var popPending_Original: js.Function0[this.type] = js.native
    
    def pushPending(): this.type = js.native
    @JSName("pushPending")
    var pushPending_Original: js.Function0[this.type] = js.native
    
    def scrollElementIntoView(): Promise[Unit, Any, Any] = js.native
    def scrollElementIntoView(config: ScrollIntoViewConfig): Promise[Unit, Any, Any] = js.native
    @JSName("scrollElementIntoView")
    var scrollElementIntoView_Original: js.Function1[/* config */ js.UndefOr[ScrollIntoViewConfig], Promise[Unit, Any, Any]] = js.native
    
    def select(): this.type = js.native
    
    def selectRange(from: Double): this.type = js.native
    def selectRange(from: Double, to: Double): this.type = js.native
    @JSName("selectRange")
    var selectRange_Original: js.Function2[/* from */ Double, /* to */ js.UndefOr[Double], this.type] = js.native
    
    @JSName("select")
    var select_Original: js.Function0[this.type] = js.native
    
    def setAccessKey(): this.type = js.native
    def setAccessKey(accessKey: Deferrable[String]): this.type = js.native
    @JSName("setAccessKey")
    var setAccessKey_Original: js.Function1[/* accessKey */ Deferrable[String] | Null, this.type] = js.native
    
    def setAccessKeyedElement($accessKeyed: JQuery[HTMLElement]): Unit = js.native
    @JSName("setAccessKeyedElement")
    var setAccessKeyedElement_Original: js.Function1[/* $accessKeyed */ JQuery[HTMLElement], Unit] = js.native
    
    /** @deprecated */
    def setAllowInteger(flag: Boolean): Unit = js.native
    
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
    
    def setFlaggedElement($flagged: JQuery[HTMLElement]): Unit = js.native
    @JSName("setFlaggedElement")
    var setFlaggedElement_Original: js.Function1[/* $flagged */ JQuery[HTMLElement], Unit] = js.native
    
    def setFlags(flags: String): this.type = js.native
    def setFlags(flags: js.Array[String]): this.type = js.native
    def setFlags(flags: Record[String, Boolean]): this.type = js.native
    @JSName("setFlags")
    var setFlags_Original: js.Function1[/* flags */ String | js.Array[String] | (Record[String, Boolean]), this.type] = js.native
    
    def setHighlightedQuery(text: String, query: String): this.type = js.native
    def setHighlightedQuery(text: String, query: String, compare: js.Function2[/* x */ String, /* y */ String, Double]): this.type = js.native
    def setHighlightedQuery(
      text: String,
      query: String,
      compare: js.Function2[/* x */ String, /* y */ String, Double],
      combineMarks: Boolean
    ): this.type = js.native
    def setHighlightedQuery(text: String, query: String, compare: Unit, combineMarks: Boolean): this.type = js.native
    @JSName("setHighlightedQuery")
    var setHighlightedQuery_Original: js.Function4[
        /* text */ String, 
        /* query */ String, 
        /* compare */ js.UndefOr[js.Function2[/* x */ String, /* y */ String, Double]], 
        /* combineMarks */ js.UndefOr[Boolean], 
        this.type
      ] = js.native
    
    def setIcon(): this.type = js.native
    def setIcon(icon: Icon): this.type = js.native
    def setIcon(icon: Record[String, Icon]): this.type = js.native
    
    def setIconElement($icon: JQuery[HTMLElement]): Unit = js.native
    @JSName("setIconElement")
    var setIconElement_Original: js.Function1[/* $icon */ JQuery[HTMLElement], Unit] = js.native
    
    @JSName("setIcon")
    var setIcon_Original: js.Function1[/* icon */ Icon | (Record[String, Icon]) | Null, this.type] = js.native
    
    def setIndicator(): this.type = js.native
    def setIndicator(indicator: Indicator): this.type = js.native
    
    def setIndicatorElement($indicator: JQuery[HTMLElement]): Unit = js.native
    @JSName("setIndicatorElement")
    var setIndicatorElement_Original: js.Function1[/* $indicator */ JQuery[HTMLElement], Unit] = js.native
    
    @JSName("setIndicator")
    var setIndicator_Original: js.Function1[/* indicator */ Indicator | Null, this.type] = js.native
    
    def setInputId(id: String): this.type = js.native
    @JSName("setInputId")
    var setInputId_Original: js.Function1[/* id */ String, this.type] = js.native
    
    def setInvisibleLabel(invisibleLabel: Boolean): this.type = js.native
    @JSName("setInvisibleLabel")
    var setInvisibleLabel_Original: js.Function1[/* invisibleLabel */ Boolean, this.type] = js.native
    
    /** @deprecated */
    def setIsInteger(flag: Boolean): Unit = js.native
    
    def setLabel(): this.type = js.native
    def setLabel(label: JQuery[HTMLElement]): this.type = js.native
    def setLabel(label: Deferrable[String]): this.type = js.native
    def setLabel(label: HtmlSnippet): this.type = js.native
    
    def setLabelElement($label: JQuery[HTMLElement]): Unit = js.native
    @JSName("setLabelElement")
    var setLabelElement_Original: js.Function1[/* $label */ JQuery[HTMLElement], Unit] = js.native
    
    def setLabelId(id: String): this.type = js.native
    @JSName("setLabelId")
    var setLabelId_Original: js.Function1[/* id */ String, this.type] = js.native
    
    def setLabelPosition(labelPosition: before | after): this.type = js.native
    @JSName("setLabelPosition")
    var setLabelPosition_Original: js.Function1[/* labelPosition */ before | after, this.type] = js.native
    
    @JSName("setLabel")
    var setLabel_Original: js.Function1[
        /* label */ Deferrable[String] | JQuery[HTMLElement] | HtmlSnippet | Null, 
        this.type
      ] = js.native
    
    def setLabelledBy(): Unit = js.native
    def setLabelledBy(id: String): Unit = js.native
    @JSName("setLabelledBy")
    var setLabelledBy_Original: js.Function1[/* id */ String | Null, Unit] = js.native
    
    def setPendingElement($pending: JQuery[HTMLElement]): Unit = js.native
    @JSName("setPendingElement")
    var setPendingElement_Original: js.Function1[/* $pending */ JQuery[HTMLElement], Unit] = js.native
    
    /**
      * Set the range of allowed values
      *
      * @param min Minimum allowed value
      * @param max Maximum allowed value
      */
    def setRange(min: Double, max: Double): Unit = js.native
    
    def setReadOnly(state: Boolean): this.type = js.native
    @JSName("setReadOnly")
    var setReadOnly_Original: js.Function1[/* state */ Boolean, this.type] = js.native
    
    def setRequired(state: Boolean): this.type = js.native
    
    def setRequiredElement($required: JQuery[HTMLElement]): Unit = js.native
    @JSName("setRequiredElement")
    var setRequiredElement_Original: js.Function1[/* $required */ JQuery[HTMLElement], Unit] = js.native
    
    @JSName("setRequired")
    var setRequired_Original: js.Function1[/* state */ Boolean, this.type] = js.native
    
    /**
      * Set the stepping deltas
      *
      * @param buttonStep Delta when using the buttons or up/down arrow keys.
      *  Defaults to `step` if specified, otherwise `1`.
      * @param pageStep Delta when using the page-up/page-down keys.
      *  Defaults to 10 times `buttonStep`.
      * @param step If specified, the field only accepts values that are multiples
      *  of this.
      */
    def setStep(): Unit = js.native
    def setStep(buttonStep: Double): Unit = js.native
    def setStep(buttonStep: Double, pageStep: Double): Unit = js.native
    def setStep(buttonStep: Double, pageStep: Double, step: Double): Unit = js.native
    def setStep(buttonStep: Double, pageStep: Unit, step: Double): Unit = js.native
    def setStep(buttonStep: Unit, pageStep: Double): Unit = js.native
    def setStep(buttonStep: Unit, pageStep: Double, step: Double): Unit = js.native
    def setStep(buttonStep: Unit, pageStep: Unit, step: Double): Unit = js.native
    
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
    
    def setValidation(): Unit = js.native
    def setValidation(validate: String): Unit = js.native
    def setValidation(validate: js.Function1[/* value */ String, Boolean | (Promise[Boolean, Any, Any])]): Unit = js.native
    def setValidation(validate: js.RegExp): Unit = js.native
    @JSName("setValidation")
    var setValidation_Original: js.Function1[
        /* validate */ Null | js.RegExp | String | (js.Function1[/* value */ String, Boolean | (Promise[Boolean, Any, Any])]), 
        Unit
      ] = js.native
    
    def setValidityFlag(): Unit = js.native
    def setValidityFlag(isValid: Boolean): Unit = js.native
    @JSName("setValidityFlag")
    var setValidityFlag_Original: js.Function1[/* isValid */ js.UndefOr[Boolean], Unit] = js.native
    
    def setValue(value: String): this.type = js.native
    @JSName("setValue")
    var setValue_Original: js.Function1[/* value */ String, this.type] = js.native
    
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
    
    def updatePosition(): this.type = js.native
    @JSName("updatePosition")
    var updatePosition_Original: js.Function0[this.type] = js.native
    
    def updateThemeClasses(): Unit = js.native
    @JSName("updateThemeClasses")
    var updateThemeClasses_Original: js.Function0[Unit] = js.native
  }
  
  type Static = typings.oojsUi.OO.ui.TextInputWidget.Static
}
