package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojs.OO.ArgTuple
import typings.oojs.OO.EventHandler
import typings.oojsUi.OO.ui.ButtonWidget.Props
import typings.oojsUi.OO.ui.ButtonWidget.Prototype
import typings.oojsUi.oojsUiStrings.click
import typings.oojsUi.oojsUiStrings.flag
import typings.oojsUi.oojsUiStrings.labelChange
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ButtonWidget is a generic widget for buttons. A wide variety of looks,
  * feels, and functionality can be customized via the class’s configuration options
  * and methods. Please see the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Widgets/Buttons_and_Switches)
  * for more information and examples.
  *
  *     // A button widget.
  *     var button = new OO.ui.ButtonWidget( {
  *         label: 'Button with Icon',
  *         icon: 'trash',
  *         title: 'Remove'
  *     } );
  *     $( document.body ).append( button.$element );
  *
  * NOTE: HTML form buttons should use the OO.ui.ButtonInputWidget class.
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.ButtonWidget
  */
@js.native
trait ButtonWidget
  extends StObject
     with Props
     with Prototype {
  
  /**
    * Get an ID of a labelable node which is part of this widget, if any, to be used for `<label for>`
    * value.
    *
    * If this function returns null, the widget should have a meaningful {@link simulateLabelClick} method
    * instead.
    *
    * @return The ID of the labelable element
    */
  /* InferMemberOverrides */
  override def getInputId(): String | Null = js.native
}
object ButtonWidget {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.Widget.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.ButtonElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.IconElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.IndicatorElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.LabelElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.TitledElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.FlaggedElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.TabIndexedElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.AccessKeyedElement.ConfigOptions {
    
    /** Whether button should be shown as active */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /** Hyperlink to visit when the button is clicked. */
    var href: js.UndefOr[String | Null] = js.undefined
    
    /** Search engine traversal hint */
    var noFollow: js.UndefOr[Boolean] = js.undefined
    
    /** Relationship attributes for the hyperlink */
    var rel: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** The frame or window in which to open the hyperlink. */
    var target: js.UndefOr[String | Null] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefNull: Self = StObject.set(x, "href", null)
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setNoFollow(value: Boolean): Self = StObject.set(x, "noFollow", value.asInstanceOf[js.Any])
      
      inline def setNoFollowUndefined: Self = StObject.set(x, "noFollow", js.undefined)
      
      inline def setRel(value: String | js.Array[String]): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      inline def setRelVarargs(value: String*): Self = StObject.set(x, "rel", js.Array(value*))
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[ButtonWidget]
       with Instantiable1[/* config */ ConfigOptions, ButtonWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.Widget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.Widget.Constructor = js.native
  }
  
  trait EventMap
    extends StObject
       with typings.oojsUi.OO.ui.Widget.EventMap
       with typings.oojsUi.OO.ui.mixin.ButtonElement.EventMap
       with typings.oojsUi.OO.ui.mixin.LabelElement.EventMap
       with typings.oojsUi.OO.ui.mixin.FlaggedElement.EventMap
  object EventMap {
    
    inline def apply(
      click: js.Array[Any],
      disable: js.Array[/* disabled */ Boolean],
      flag: js.Array[/* changes */ Record[String, Boolean]],
      labelChange: js.Array[Any],
      toggle: js.Array[/* visible */ Boolean]
    ): EventMap = {
      val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], flag = flag.asInstanceOf[js.Any], labelChange = labelChange.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
  }
  
  trait Props
    extends StObject
       with typings.oojsUi.OO.ui.Element.Props
       with typings.oojsUi.OO.ui.mixin.ButtonElement.Props
       with typings.oojsUi.OO.ui.mixin.IconElement.Props
       with typings.oojsUi.OO.ui.mixin.IndicatorElement.Props
       with typings.oojsUi.OO.ui.mixin.LabelElement.Props
       with typings.oojsUi.OO.ui.mixin.TitledElement.Props
       with typings.oojsUi.OO.ui.mixin.FlaggedElement.Props
       with typings.oojsUi.OO.ui.mixin.TabIndexedElement.Props
       with typings.oojsUi.OO.ui.mixin.AccessKeyedElement.Props
  object Props {
    
    inline def apply(
      $accessKeyed: JQuery[HTMLElement],
      $button: JQuery[HTMLElement],
      $element: JQuery[HTMLElement],
      $flagged: JQuery[HTMLElement],
      $icon: JQuery[HTMLElement],
      $indicator: JQuery[HTMLElement],
      $label: JQuery[HTMLElement],
      $tabIndexed: JQuery[HTMLElement],
      $titled: JQuery[HTMLElement]
    ): Props = {
      val __obj = js.Dynamic.literal($accessKeyed = $accessKeyed.asInstanceOf[js.Any], $button = $button.asInstanceOf[js.Any], $element = $element.asInstanceOf[js.Any], $flagged = $flagged.asInstanceOf[js.Any], $icon = $icon.asInstanceOf[js.Any], $indicator = $indicator.asInstanceOf[js.Any], $label = $label.asInstanceOf[js.Any], $tabIndexed = $tabIndexed.asInstanceOf[js.Any], $titled = $titled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
  }
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.Widget.Prototype
       with typings.oojsUi.OO.ui.mixin.ButtonElement.Prototype
       with typings.oojsUi.OO.ui.mixin.IconElement.Prototype
       with typings.oojsUi.OO.ui.mixin.IndicatorElement.Prototype
       with typings.oojsUi.OO.ui.mixin.LabelElement.Prototype
       with typings.oojsUi.OO.ui.mixin.TitledElement.Prototype
       with typings.oojsUi.OO.ui.mixin.FlaggedElement.Prototype
       with typings.oojsUi.OO.ui.mixin.TabIndexedElement.Prototype
       with typings.oojsUi.OO.ui.mixin.AccessKeyedElement.Prototype {
    
    @JSName("emitThrow")
    def emitThrow_click(
      event: click,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_flag(
      event: flag,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* changes */ Record[String, Boolean]]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_labelChange(
      event: labelChange,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    
    @JSName("emit")
    def emit_click(
      event: click,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    @JSName("emit")
    def emit_flag(
      event: flag,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* changes */ Record[String, Boolean]]
    ): Boolean = js.native
    @JSName("emit")
    def emit_labelChange(
      event: labelChange,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    
    /**
      * Get hyperlink location.
      *
      * @return Hyperlink location
      */
    def getHref(): String | Null = js.native
    
    /**
      * Get an ID of a labelable node which is part of this widget, if any, to be used for `<label for>`
      * value.
      *
      * If this function returns null, the widget should have a meaningful {@link simulateLabelClick} method
      * instead.
      *
      * @return The ID of the labelable element
      */
    /* InferMemberOverrides */
    override def getInputId(): String | Null = js.native
    
    /**
      * Get search engine traversal hint.
      *
      * @return Whether search engines should avoid traversing this hyperlink
      */
    def getNoFollow(): Boolean = js.native
    
    /**
      * Get the relationship attribute of the hyperlink.
      *
      * @return Relationship attributes that apply to the hyperlink
      */
    def getRel(): js.Array[String] = js.native
    
    /**
      * Get hyperlink target.
      *
      * @return Hyperlink target
      */
    def getTarget(): String | Null = js.native
    
    @JSName("off")
    def off_click[C](event: click): this.type = js.native
    @JSName("off")
    def off_click[C](event: click, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_click[C](
      event: click,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]]
    ): this.type = js.native
    @JSName("off")
    def off_click[C](
      event: click,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_flag[C](event: flag): this.type = js.native
    @JSName("off")
    def off_flag[C](event: flag, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_flag[C](
      event: flag,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* changes */ Record[String, Boolean]], Unit]
        ]
    ): this.type = js.native
    @JSName("off")
    def off_flag[C](
      event: flag,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* changes */ Record[String, Boolean]], Unit]
        ],
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
    
    @JSName("on")
    def on_click[A /* <: ArgTuple */, C](
      event: click,
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
    def on_click[A /* <: ArgTuple */, C](
      event: click,
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
    def on_click[A /* <: ArgTuple */, C](
      event: click,
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
    def on_click[A /* <: ArgTuple */, C](
      event: click,
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
    def on_flag[A /* <: ArgTuple */, C](
      event: flag,
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
    def on_flag[A /* <: ArgTuple */, C](
      event: flag,
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
    def on_flag[A /* <: ArgTuple */, C](
      event: flag,
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
    def on_flag[A /* <: ArgTuple */, C](
      event: flag,
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
    
    @JSName("once")
    def once_click(event: click, listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[Any], Unit]): this.type = js.native
    @JSName("once")
    def once_flag(
      event: flag,
      listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[/* changes */ Record[String, Boolean]], Unit]
    ): this.type = js.native
    @JSName("once")
    def once_labelChange(event: labelChange, listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[Any], Unit]): this.type = js.native
    
    /**
      * Set hyperlink location.
      *
      * @param href Hyperlink location, null to remove
      * @return The widget, for chaining
      */
    def setHref(): this.type = js.native
    def setHref(href: String): this.type = js.native
    
    /**
      * Set search engine traversal hint.
      *
      * @param noFollow True if search engines should avoid traversing this hyperlink
      * @return The widget, for chaining
      */
    def setNoFollow(noFollow: Boolean): this.type = js.native
    
    /**
      * Set the `rel` attribute of the hyperlink.
      *
      * @param rel Relationship attributes for the hyperlink, omit to remove
      * @return The widget, for chaining
      */
    def setRel(): this.type = js.native
    def setRel(rel: String): this.type = js.native
    def setRel(rel: js.Array[String]): this.type = js.native
    
    /**
      * Set hyperlink target.
      *
      * @param target Hyperlink target, null to remove
      * @return The widget, for chaining
      */
    def setTarget(): this.type = js.native
    def setTarget(target: String): this.type = js.native
  }
  
  @js.native
  trait Static
    extends StObject
       with typings.oojsUi.OO.ui.Element.Static
       with typings.oojsUi.OO.ui.mixin.ButtonElement.Static
       with typings.oojsUi.OO.ui.mixin.IconElement.Static
       with typings.oojsUi.OO.ui.mixin.IndicatorElement.Static
       with typings.oojsUi.OO.ui.mixin.LabelElement.Static
       with typings.oojsUi.OO.ui.mixin.TitledElement.Static
       with typings.oojsUi.OO.ui.mixin.FlaggedElement.Static
       with typings.oojsUi.OO.ui.mixin.AccessKeyedElement.Static
}
