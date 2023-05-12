package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.oojs.OO.ArgTuple
import typings.oojs.OO.EventHandler
import typings.oojsUi.OO.ui.MultilineTextInputWidget.Prototype
import typings.oojsUi.OO.ui.TextInputWidget.Props
import typings.oojsUi.oojsUiStrings.resize
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MultilineTextInputWidgets, like HTML textareas, are featuring customization options to
  * configure number of rows visible. In addition, these widgets can be autosized to fit user
  * inputs and can show {@link OO.ui.mixin.IconElement icons} and
  * {@link OO.ui.mixin.IndicatorElement indicators}.
  * Please see the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Widgets/Inputs#MultilineTextInputWidget)
  * for more information and examples.
  *
  * This widget can be used inside an HTML form, such as a OO.ui.FormLayout.
  *
  *     // A MultilineTextInputWidget.
  *     var multilineTextInput = new OO.ui.MultilineTextInputWidget( {
  *         value: 'Text input on multiple lines'
  *     } );
  *     $( document.body ).append( multilineTextInput.$element );
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.MultilineTextInputWidget
  */
@js.native
trait MultilineTextInputWidget
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
object MultilineTextInputWidget {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.TextInputWidget.ConfigOptions {
    
    /**
      * Automatically resize the text input to fit its content. Use the {@link maxRows}
      * config to specify a maximum number of displayed rows.
      */
    var autosize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Maximum number of rows to display when {@link autosize} is set to true.
      * Defaults to the maximum of `10` and `2 * rows`, or `10` if `rows` isn't provided.
      */
    var maxRows: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of visible lines in textarea. If used with `autosize`, specifies minimum
      * number of rows to display.
      */
    var rows: js.UndefOr[Double] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setAutosize(value: Boolean): Self = StObject.set(x, "autosize", value.asInstanceOf[js.Any])
      
      inline def setAutosizeUndefined: Self = StObject.set(x, "autosize", js.undefined)
      
      inline def setMaxRows(value: Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
      
      inline def setMaxRowsUndefined: Self = StObject.set(x, "maxRows", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[MultilineTextInputWidget]
       with Instantiable1[/* config */ ConfigOptions, MultilineTextInputWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.TextInputWidget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.TextInputWidget.Constructor = js.native
  }
  
  trait EventMap
    extends StObject
       with typings.oojsUi.OO.ui.TextInputWidget.EventMap {
    
    var resize: js.Array[Any]
  }
  object EventMap {
    
    inline def apply(
      change: js.Array[/* value */ String],
      disable: js.Array[/* disabled */ Boolean],
      enter: js.Array[Any],
      flag: js.Array[/* changes */ Record[String, Boolean]],
      labelChange: js.Array[Any],
      resize: js.Array[Any],
      toggle: js.Array[/* visible */ Boolean]
    ): EventMap = {
      val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], enter = enter.asInstanceOf[js.Any], flag = flag.asInstanceOf[js.Any], labelChange = labelChange.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
      
      inline def setResize(value: js.Array[Any]): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeVarargs(value: Any*): Self = StObject.set(x, "resize", js.Array(value*))
    }
  }
  
  type Props = typings.oojsUi.OO.ui.TextInputWidget.Props
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.TextInputWidget.Prototype {
    
    /**
      * Automatically adjust the size of the text input.
      *
      * This only affects multiline inputs that are {@link ConfigOptions.autosize autosized}.
      *
      * @param force Force an update, even if the value hasn't changed
      * @return The widget, for chaining
      */
    def adjustSize(): this.type = js.native
    def adjustSize(force: Boolean): this.type = js.native
    
    @JSName("emitThrow")
    def emitThrow_resize(
      event: resize,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_resize[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'resize' ? never : K */ js.Any,
      args: Any*
    ): Boolean = js.native
    
    @JSName("emit")
    def emit_resize(
      event: resize,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    @JSName("emit")
    def emit_resize[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'resize' ? never : K */ js.Any,
      args: Any*
    ): Boolean = js.native
    
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
      * Check if the input automatically adjusts its size.
      *
      * @return
      */
    def isAutosizing(): Boolean = js.native
    
    @JSName("off")
    def off_resize[C](event: resize): this.type = js.native
    @JSName("off")
    def off_resize[C](event: resize, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_resize[C](
      event: resize,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]]
    ): this.type = js.native
    @JSName("off")
    def off_resize[C](
      event: resize,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_resize[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'resize' ? never : K */ js.Any
    ): this.type = js.native
    @JSName("off")
    def off_resize[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'resize' ? never : K */ js.Any,
      method: Unit,
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_resize[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'resize' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]]
    ): this.type = js.native
    @JSName("off")
    def off_resize[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'resize' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      context: C
    ): this.type = js.native
    
    @JSName("on")
    def on_resize[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'resize' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]]
    ): this.type = js.native
    @JSName("on")
    def on_resize[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'resize' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      args: js.Array[Any]
    ): this.type = js.native
    @JSName("on")
    def on_resize[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'resize' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      args: js.Array[Any],
      context: C
    ): this.type = js.native
    @JSName("on")
    def on_resize[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'resize' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      args: Unit,
      context: C
    ): this.type = js.native
    // #region EventEmitter overloads
    @JSName("on")
    def on_resize[A /* <: ArgTuple */, C](
      event: resize,
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
    def on_resize[A /* <: ArgTuple */, C](
      event: resize,
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
    def on_resize[A /* <: ArgTuple */, C](
      event: resize,
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
    def on_resize[A /* <: ArgTuple */, C](
      event: resize,
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
    def once_resize(event: resize, listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[Any], Unit]): this.type = js.native
    @JSName("once")
    def once_resize[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'resize' ? never : K */ js.Any,
      listener: js.ThisFunction1[/* this */ Null, /* repeated */ Any, Unit]
    ): this.type = js.native
  }
  
  type Static = typings.oojsUi.OO.ui.TextInputWidget.Static
}
