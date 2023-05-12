package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojs.OO.ArgTuple
import typings.oojs.OO.EventHandler
import typings.oojsUi.OO.ui.PopupWidget.Props
import typings.oojsUi.OO.ui.PopupWidget.Prototype
import typings.oojsUi.oojsUiStrings.bottom
import typings.oojsUi.oojsUiStrings.closing
import typings.oojsUi.oojsUiStrings.end
import typings.oojsUi.oojsUiStrings.labelChange
import typings.oojsUi.oojsUiStrings.ready
import typings.oojsUi.oojsUiStrings.start
import typings.oojsUi.oojsUiStrings.top
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PopupWidget is a container for content. The popup is overlaid and positioned absolutely.
  * By default, each popup has an anchor that points toward its origin.
  * Please see the [OOUI documentation on MediaWiki.org](https://www.mediawiki.org/wiki/OOUI/Widgets/Popups)
  * for more information and examples.
  *
  * Unlike most widgets, PopupWidget is initially hidden and must be shown by calling {@link toggle}.
  *
  *     // A PopupWidget.
  *     var popup = new OO.ui.PopupWidget( {
  *         $content: $( '<p>Hi there!</p>' ),
  *         padded: true,
  *         width: 300
  *     } );
  *
  *     $( document.body ).append( popup.$element );
  *     // To display the popup, toggle the visibility to 'true'.
  *     popup.toggle( true );
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.PopupWidget
  */
@js.native
trait PopupWidget
  extends StObject
     with Props
     with Prototype
object PopupWidget {
  
  /* Rewritten from type alias, can be one of: 
    - typings.oojsUi.oojsUiStrings.forwards
    - typings.oojsUi.oojsUiStrings.backwards
    - typings.oojsUi.oojsUiStrings.center
    - typings.oojsUi.oojsUiStrings.`force-left`
    - typings.oojsUi.oojsUiStrings.`force-right`
  */
  trait Alignment extends StObject
  object Alignment {
    
    inline def backwards: typings.oojsUi.oojsUiStrings.backwards = "backwards".asInstanceOf[typings.oojsUi.oojsUiStrings.backwards]
    
    inline def center: typings.oojsUi.oojsUiStrings.center = "center".asInstanceOf[typings.oojsUi.oojsUiStrings.center]
    
    inline def `force-left`: typings.oojsUi.oojsUiStrings.`force-left` = "force-left".asInstanceOf[typings.oojsUi.oojsUiStrings.`force-left`]
    
    inline def `force-right`: typings.oojsUi.oojsUiStrings.`force-right` = "force-right".asInstanceOf[typings.oojsUi.oojsUiStrings.`force-right`]
    
    inline def forwards: typings.oojsUi.oojsUiStrings.forwards = "forwards".asInstanceOf[typings.oojsUi.oojsUiStrings.forwards]
  }
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.Widget.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.IconElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.LabelElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.ClippableElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.FloatableElement.ConfigOptions {
    
    /**
      * Elements that will not close the popup when clicked.
      * This config option is only relevant if {@link autoClose} is set to `true`. See the
      * [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Widgets/Popups#autocloseExample)
      * for an example.
      */
    @JSName("$autoCloseIgnore")
    var $autoCloseIgnore: js.UndefOr[JQuery[HTMLElement]] = js.undefined
    
    /**
      * Constrain the popup to the boundaries of the specified container.
      * See the [OOUI docs on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Widgets/Popups#containerExample)
      * for an example.
      */
    @JSName("$container")
    var $container: js.UndefOr[JQuery[HTMLElement]] = js.undefined
    
    /** Content to append to the popup's footer */
    @JSName("$footer")
    var $footer: js.UndefOr[JQuery[HTMLElement]] = js.undefined
    
    /**
      * How to align the popup to $floatableContainer
      * - 'forwards': If position is above/below, move the popup as far endwards (right in
      *    LTR, left in RTL) as possible while still keeping the anchor within the popup;
      *    if position is before/after, move the popup as far downwards as possible.
      * - 'backwards': If position is above/below, move the popup as far startwards (left in
      *    LTR, right in RTL) as possible while still keeping the anchor within the popup;
      *    if position is before/after, move the popup as far upwards as possible.
      * - 'center': Horizontally (if position is above/below) or vertically (before/after)
      *    align the center of the popup with the center of $floatableContainer.
      * - 'force-left': Alias for 'forwards' in LTR and 'backwards' in RTL
      * - 'force-right': Alias for 'backwards' in RTL and 'forwards' in LTR
      */
    var align: js.UndefOr[Alignment] = js.undefined
    
    /** Show anchor pointing to origin of popup */
    var anchor: js.UndefOr[Boolean] = js.undefined
    
    /** Automatically close the popup when it loses focus. */
    var autoClose: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to automatically switch the popup's position between 'above' and 'below',
      * or between 'before' and 'after', if there is not enough space in the desired
      * direction to display the popup without clipping
      */
    var autoFlip: js.UndefOr[Boolean] = js.undefined
    
    /** Padding between the popup and its container, specified as a number of pixels. */
    var containerPadding: js.UndefOr[Double] = js.undefined
    
    /** Show a popup header that contains a {@link label} (if specified) and close button. */
    var head: js.UndefOr[Boolean] = js.undefined
    
    /** Height of popup in pixels. Pass `null` to use automatic height. */
    var height: js.UndefOr[Double | Null] = js.undefined
    
    var hideCloseButton: js.UndefOr[Boolean] = js.undefined
    
    /** Add padding to the popup's body */
    var padded: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Where to position the popup relative to $floatableContainer
      * - 'above': Put popup above $floatableContainer; anchor points down to the horizontal
      *    center of $floatableContainer
      * - 'below': Put popup below $floatableContainer; anchor points up to the horizontal
      *    center of $floatableContainer
      * - 'before': Put popup to the left (LTR) / right (RTL) of $floatableContainer; anchor
      *    points endwards (right/left) to the vertical center of $floatableContainer
      * - 'after': Put popup to the right (LTR) / left (RTL) of $floatableContainer; anchor
      *    points startwards (left/right) to the vertical center of $floatableContainer
      */
    var position: js.UndefOr[Position] = js.undefined
    
    /** Width of popup in pixels. Pass `null` to use automatic width. */
    var width: js.UndefOr[Double | Null] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def set$autoCloseIgnore(value: JQuery[HTMLElement]): Self = StObject.set(x, "$autoCloseIgnore", value.asInstanceOf[js.Any])
      
      inline def set$autoCloseIgnoreUndefined: Self = StObject.set(x, "$autoCloseIgnore", js.undefined)
      
      inline def set$container(value: JQuery[HTMLElement]): Self = StObject.set(x, "$container", value.asInstanceOf[js.Any])
      
      inline def set$containerUndefined: Self = StObject.set(x, "$container", js.undefined)
      
      inline def set$footer(value: JQuery[HTMLElement]): Self = StObject.set(x, "$footer", value.asInstanceOf[js.Any])
      
      inline def set$footerUndefined: Self = StObject.set(x, "$footer", js.undefined)
      
      inline def setAlign(value: Alignment): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAnchor(value: Boolean): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      inline def setAutoFlip(value: Boolean): Self = StObject.set(x, "autoFlip", value.asInstanceOf[js.Any])
      
      inline def setAutoFlipUndefined: Self = StObject.set(x, "autoFlip", js.undefined)
      
      inline def setContainerPadding(value: Double): Self = StObject.set(x, "containerPadding", value.asInstanceOf[js.Any])
      
      inline def setContainerPaddingUndefined: Self = StObject.set(x, "containerPadding", js.undefined)
      
      inline def setHead(value: Boolean): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightNull: Self = StObject.set(x, "height", null)
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHideCloseButton(value: Boolean): Self = StObject.set(x, "hideCloseButton", value.asInstanceOf[js.Any])
      
      inline def setHideCloseButtonUndefined: Self = StObject.set(x, "hideCloseButton", js.undefined)
      
      inline def setPadded(value: Boolean): Self = StObject.set(x, "padded", value.asInstanceOf[js.Any])
      
      inline def setPaddedUndefined: Self = StObject.set(x, "padded", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthNull: Self = StObject.set(x, "width", null)
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[PopupWidget]
       with Instantiable1[/* config */ ConfigOptions, PopupWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.Widget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.Widget.Constructor = js.native
  }
  
  trait EventMap
    extends StObject
       with typings.oojsUi.OO.ui.Widget.EventMap
       with typings.oojsUi.OO.ui.mixin.LabelElement.EventMap {
    
    var closing: js.Array[Any]
    
    var ready: js.Array[Any]
  }
  object EventMap {
    
    inline def apply(
      closing: js.Array[Any],
      disable: js.Array[/* disabled */ Boolean],
      labelChange: js.Array[Any],
      ready: js.Array[Any],
      toggle: js.Array[/* visible */ Boolean]
    ): EventMap = {
      val __obj = js.Dynamic.literal(closing = closing.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], labelChange = labelChange.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
      
      inline def setClosing(value: js.Array[Any]): Self = StObject.set(x, "closing", value.asInstanceOf[js.Any])
      
      inline def setClosingVarargs(value: Any*): Self = StObject.set(x, "closing", js.Array(value*))
      
      inline def setReady(value: js.Array[Any]): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      inline def setReadyVarargs(value: Any*): Self = StObject.set(x, "ready", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.oojsUi.oojsUiStrings.above
    - typings.oojsUi.oojsUiStrings.below
    - typings.oojsUi.oojsUiStrings.before
    - typings.oojsUi.oojsUiStrings.after
  */
  trait Position extends StObject
  object Position {
    
    inline def above: typings.oojsUi.oojsUiStrings.above = "above".asInstanceOf[typings.oojsUi.oojsUiStrings.above]
    
    inline def after: typings.oojsUi.oojsUiStrings.after = "after".asInstanceOf[typings.oojsUi.oojsUiStrings.after]
    
    inline def before: typings.oojsUi.oojsUiStrings.before = "before".asInstanceOf[typings.oojsUi.oojsUiStrings.before]
    
    inline def below: typings.oojsUi.oojsUiStrings.below = "below".asInstanceOf[typings.oojsUi.oojsUiStrings.below]
  }
  
  trait Props
    extends StObject
       with typings.oojsUi.OO.ui.Element.Props
       with typings.oojsUi.OO.ui.mixin.IconElement.Props
       with typings.oojsUi.OO.ui.mixin.LabelElement.Props
       with typings.oojsUi.OO.ui.mixin.ClippableElement.Props
       with typings.oojsUi.OO.ui.mixin.FloatableElement.Props {
    
    @JSName("$anchor")
    var $anchor: JQuery[HTMLElement]
    
    @JSName("$body")
    var $body: JQuery[HTMLElement]
    
    @JSName("$container")
    var $container: JQuery[HTMLElement]
    
    @JSName("$popup")
    var $popup: JQuery[HTMLElement]
  }
  object Props {
    
    inline def apply(
      $anchor: JQuery[HTMLElement],
      $body: JQuery[HTMLElement],
      $clippable: JQuery[HTMLElement],
      $clippableContainer: JQuery[HTMLElement],
      $container: JQuery[HTMLElement],
      $element: JQuery[HTMLElement],
      $floatable: JQuery[HTMLElement],
      $floatableContainer: JQuery[HTMLElement],
      $icon: JQuery[HTMLElement],
      $label: JQuery[HTMLElement],
      $popup: JQuery[HTMLElement]
    ): Props = {
      val __obj = js.Dynamic.literal($anchor = $anchor.asInstanceOf[js.Any], $body = $body.asInstanceOf[js.Any], $clippable = $clippable.asInstanceOf[js.Any], $clippableContainer = $clippableContainer.asInstanceOf[js.Any], $container = $container.asInstanceOf[js.Any], $element = $element.asInstanceOf[js.Any], $floatable = $floatable.asInstanceOf[js.Any], $floatableContainer = $floatableContainer.asInstanceOf[js.Any], $icon = $icon.asInstanceOf[js.Any], $label = $label.asInstanceOf[js.Any], $popup = $popup.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def set$anchor(value: JQuery[HTMLElement]): Self = StObject.set(x, "$anchor", value.asInstanceOf[js.Any])
      
      inline def set$body(value: JQuery[HTMLElement]): Self = StObject.set(x, "$body", value.asInstanceOf[js.Any])
      
      inline def set$container(value: JQuery[HTMLElement]): Self = StObject.set(x, "$container", value.asInstanceOf[js.Any])
      
      inline def set$popup(value: JQuery[HTMLElement]): Self = StObject.set(x, "$popup", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.Widget.Prototype
       with typings.oojsUi.OO.ui.mixin.IconElement.Prototype
       with typings.oojsUi.OO.ui.mixin.LabelElement.Prototype
       with typings.oojsUi.OO.ui.mixin.ClippableElement.Prototype
       with typings.oojsUi.OO.ui.mixin.FloatableElement.Prototype {
    
    @JSName("emitThrow")
    def emitThrow_closing(
      event: closing,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_labelChange(
      event: labelChange,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_ready(
      event: ready,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    
    @JSName("emit")
    def emit_closing(
      event: closing,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    @JSName("emit")
    def emit_labelChange(
      event: labelChange,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    @JSName("emit")
    def emit_ready(
      event: ready,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    
    /**
      * Get popup alignment
      *
      * @return Alignment of the popup, `center`, `force-left`, `force-right`, `backwards` or
      *  `forwards`.
      */
    def getAlignment(): Alignment = js.native
    
    /**
      * Get an ID of the body element, this can be used as the
      * `aria-describedby` attribute for an input field.
      *
      * @return The ID of the body element
      */
    def getBodyId(): String = js.native
    
    /**
      * Get popup positioning.
      *
      * @return 'above', 'below', 'before' or 'after'
      */
    def getPosition(): Position = js.native
    
    /**
      * Check if the anchor is visible.
      *
      * @return Anchor is visible
      */
    def hasAnchor(): Boolean = js.native
    
    @JSName("off")
    def off_closing[C](event: closing): this.type = js.native
    @JSName("off")
    def off_closing[C](event: closing, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_closing[C](
      event: closing,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]]
    ): this.type = js.native
    @JSName("off")
    def off_closing[C](
      event: closing,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_labelChange[C](event: labelChange): this.type = js.native
    @JSName("off")
    def off_labelChange[C](event: labelChange, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_labelChange[C](
      event: labelChange,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]]
    ): this.type = js.native
    @JSName("off")
    def off_labelChange[C](
      event: labelChange,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_ready[C](event: ready): this.type = js.native
    @JSName("off")
    def off_ready[C](event: ready, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_ready[C](
      event: ready,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]]
    ): this.type = js.native
    @JSName("off")
    def off_ready[C](
      event: ready,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]],
      context: C
    ): this.type = js.native
    
    @JSName("on")
    def on_closing[A /* <: ArgTuple */, C](
      event: closing,
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
    def on_closing[A /* <: ArgTuple */, C](
      event: closing,
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
    def on_closing[A /* <: ArgTuple */, C](
      event: closing,
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
    def on_closing[A /* <: ArgTuple */, C](
      event: closing,
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
    def on_labelChange[A /* <: ArgTuple */, C](
      event: labelChange,
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
    def on_labelChange[A /* <: ArgTuple */, C](
      event: labelChange,
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
    def on_labelChange[A /* <: ArgTuple */, C](
      event: labelChange,
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
    def on_labelChange[A /* <: ArgTuple */, C](
      event: labelChange,
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
    // #region EventEmitter overloads
    @JSName("on")
    def on_ready[A /* <: ArgTuple */, C](
      event: ready,
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
    def on_ready[A /* <: ArgTuple */, C](
      event: ready,
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
    def on_ready[A /* <: ArgTuple */, C](
      event: ready,
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
    def on_ready[A /* <: ArgTuple */, C](
      event: ready,
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
    def once_closing(event: closing, listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[Any], Unit]): this.type = js.native
    @JSName("once")
    def once_labelChange(event: labelChange, listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[Any], Unit]): this.type = js.native
    @JSName("once")
    def once_ready(event: ready, listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[Any], Unit]): this.type = js.native
    
    /**
      * Set popup alignment
      *
      * @param align Alignment of the popup, `center`, `force-left`, `force-right`,
      *  `backwards` or `forwards`.
      */
    def setAlignment(): Unit = js.native
    def setAlignment(align: Alignment): Unit = js.native
    
    /**
      * Change which edge the anchor appears on.
      *
      * @param edge 'top', 'bottom', 'start' or 'end'
      */
    def setAnchorEdge(edge: top | bottom | start | end): Unit = js.native
    
    /**
      * Set which elements will not close the popup when clicked.
      *
      * For auto-closing popups, clicks on these elements will not cause the popup to auto-close.
      *
      * @param $autoCloseIgnore Elements to ignore for auto-closing
      */
    def setAutoCloseIgnore($autoCloseIgnore: JQuery[HTMLElement]): Unit = js.native
    
    /**
      * Set popup auto-flipping.
      *
      * @param autoFlip Whether to automatically switch the popup's position between
      *  'above' and 'below', or between 'before' and 'after', if there is not enough space in the
      *  desired direction to display the popup without clipping
      */
    def setAutoFlip(autoFlip: Boolean): Unit = js.native
    
    /**
      * Change the positioning of the popup.
      *
      * @param position 'above', 'below', 'before' or 'after'
      */
    def setPosition(position: Position): Unit = js.native
    
    /**
      * Set the size of the popup.
      *
      * Changing the size may also change the popup's position depending on the alignment.
      *
      * @param width Width in pixels. Pass `null` to use automatic width.
      * @param height Height in pixels. Pass `null` to use automatic height.
      * @param transition Use a smooth transition
      */
    def setSize(): Unit = js.native
    def setSize(width: Double): Unit = js.native
    def setSize(width: Double, height: Double): Unit = js.native
    def setSize(width: Double, height: Double, transition: Boolean): Unit = js.native
    def setSize(width: Double, height: Null, transition: Boolean): Unit = js.native
    def setSize(width: Double, height: Unit, transition: Boolean): Unit = js.native
    def setSize(width: Null, height: Double): Unit = js.native
    def setSize(width: Null, height: Double, transition: Boolean): Unit = js.native
    def setSize(width: Null, height: Null, transition: Boolean): Unit = js.native
    def setSize(width: Null, height: Unit, transition: Boolean): Unit = js.native
    def setSize(width: Unit, height: Double): Unit = js.native
    def setSize(width: Unit, height: Double, transition: Boolean): Unit = js.native
    def setSize(width: Unit, height: Null, transition: Boolean): Unit = js.native
    def setSize(width: Unit, height: Unit, transition: Boolean): Unit = js.native
    
    /**
      * Show, hide, or toggle the visibility of the anchor.
      *
      * @param show Show anchor, omit to toggle
      */
    def toggleAnchor(): Unit = js.native
    def toggleAnchor(show: Boolean): Unit = js.native
    
    /**
      * Update the size and position.
      *
      * Only use this to keep the popup properly anchored. Use {@link setSize} to change the
      * size, and this will be called automatically.
      *
      * @param transition Use a smooth transition
      */
    def updateDimensions(): Unit = js.native
    def updateDimensions(transition: Boolean): Unit = js.native
  }
  
  @js.native
  trait Static
    extends StObject
       with typings.oojsUi.OO.ui.Element.Static
       with typings.oojsUi.OO.ui.mixin.IconElement.Static
       with typings.oojsUi.OO.ui.mixin.LabelElement.Static
}
