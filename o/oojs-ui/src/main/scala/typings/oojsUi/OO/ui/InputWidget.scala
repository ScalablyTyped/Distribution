package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojs.OO.ArgTuple
import typings.oojs.OO.EventHandler
import typings.oojsUi.OO.ui.InputWidget.Props
import typings.oojsUi.OO.ui.InputWidget.Prototype
import typings.oojsUi.oojsUiStrings.auto
import typings.oojsUi.oojsUiStrings.change
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * InputWidget is the base class for all input widgets, which
  * include {@link OO.ui.TextInputWidget text inputs},
  * {@link OO.ui.CheckboxInputWidget checkbox inputs}, {@link OO.ui.RadioInputWidget radio inputs},
  * and {@link OO.ui.ButtonInputWidget button inputs}.
  * See the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Widgets/Inputs)
  * for more information and examples.
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.InputWidget
  */
@js.native
trait InputWidget
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
object InputWidget {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.Widget.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.TabIndexedElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.TitledElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.AccessKeyedElement.ConfigOptions {
    
    /** The directionality of the input (ltr/rtl). */
    var dir: js.UndefOr[Direction] = js.undefined
    
    /**
      * The name of an input filter function. Input filters modify the value of an input
      * before it is accepted.
      */
    var inputFilter: js.UndefOr[js.Function1[/* value */ String, String]] = js.undefined
    
    /** The value of the input’s HTML `id` attribute. */
    var inputId: js.UndefOr[String] = js.undefined
    
    /** The value of the input’s HTML `name` attribute. */
    var name: js.UndefOr[String] = js.undefined
    
    /** The value of the input. */
    var value: js.UndefOr[String] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setDir(value: Direction): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setInputFilter(value: /* value */ String => String): Self = StObject.set(x, "inputFilter", js.Any.fromFunction1(value))
      
      inline def setInputFilterUndefined: Self = StObject.set(x, "inputFilter", js.undefined)
      
      inline def setInputId(value: String): Self = StObject.set(x, "inputId", value.asInstanceOf[js.Any])
      
      inline def setInputIdUndefined: Self = StObject.set(x, "inputId", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[InputWidget]
       with Instantiable1[/* config */ ConfigOptions, InputWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.Widget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.Widget.Constructor = js.native
  }
  
  trait EventMap
    extends StObject
       with typings.oojsUi.OO.ui.Widget.EventMap {
    
    var change: js.Array[/* value */ String]
  }
  object EventMap {
    
    inline def apply(
      change: js.Array[/* value */ String],
      disable: js.Array[/* disabled */ Boolean],
      toggle: js.Array[/* visible */ Boolean]
    ): EventMap = {
      val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
      
      inline def setChange(value: js.Array[/* value */ String]): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
      
      inline def setChangeVarargs(value: (/* value */ String)*): Self = StObject.set(x, "change", js.Array(value*))
    }
  }
  
  trait Props
    extends StObject
       with typings.oojsUi.OO.ui.Element.Props
       with typings.oojsUi.OO.ui.mixin.TabIndexedElement.Props
       with typings.oojsUi.OO.ui.mixin.TitledElement.Props
       with typings.oojsUi.OO.ui.mixin.AccessKeyedElement.Props {
    
    @JSName("$input")
    var $input: JQuery[HTMLElement]
  }
  object Props {
    
    inline def apply(
      $accessKeyed: JQuery[HTMLElement],
      $element: JQuery[HTMLElement],
      $input: JQuery[HTMLElement],
      $tabIndexed: JQuery[HTMLElement],
      $titled: JQuery[HTMLElement]
    ): Props = {
      val __obj = js.Dynamic.literal($accessKeyed = $accessKeyed.asInstanceOf[js.Any], $element = $element.asInstanceOf[js.Any], $input = $input.asInstanceOf[js.Any], $tabIndexed = $tabIndexed.asInstanceOf[js.Any], $titled = $titled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def set$input(value: JQuery[HTMLElement]): Self = StObject.set(x, "$input", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.Widget.Prototype
       with typings.oojsUi.OO.ui.mixin.TabIndexedElement.Prototype
       with typings.oojsUi.OO.ui.mixin.TitledElement.Prototype
       with typings.oojsUi.OO.ui.mixin.AccessKeyedElement.Prototype {
    
    @JSName("emitThrow")
    def emitThrow_change(
      event: change,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* value */ String]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_change[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'change' ? never : K */ js.Any,
      args: Any*
    ): Boolean = js.native
    
    @JSName("emit")
    def emit_change(
      event: change,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* value */ String]
    ): Boolean = js.native
    @JSName("emit")
    def emit_change[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'change' ? never : K */ js.Any,
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
      * Get the value of the input.
      *
      * @return Input value
      */
    def getValue(): String = js.native
    
    @JSName("off")
    def off_change[C](event: change): this.type = js.native
    @JSName("off")
    def off_change[C](event: change, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_change[C](
      event: change,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[/* value */ String], Unit]]
    ): this.type = js.native
    @JSName("off")
    def off_change[C](
      event: change,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[/* value */ String], Unit]],
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
    
    @JSName("once")
    def once_change(
      event: change,
      listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[/* value */ String], Unit]
    ): this.type = js.native
    @JSName("once")
    def once_change[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'change' ? never : K */ js.Any,
      listener: js.ThisFunction1[/* this */ Null, /* repeated */ Any, Unit]
    ): this.type = js.native
    
    /**
      * Set the directionality of the input.
      *
      * @param dir Text directionality: 'ltr', 'rtl' or 'auto'
      * @return The widget, for chaining
      */
    def setDir(dir: Direction): this.type = js.native
    @JSName("setDir")
    def setDir_auto(dir: auto): this.type = js.native
    
    /**
      * Set the 'id' attribute of the `<input>` element.
      *
      * @param id
      * @return The widget, for chaining
      */
    def setInputId(id: String): this.type = js.native
    
    /**
      * Set the value of the input.
      *
      * @param value New value
      * @return The widget, for chaining
      */
    def setValue(value: String): this.type = js.native
  }
  
  @js.native
  trait Static
    extends StObject
       with typings.oojsUi.OO.ui.Element.Static
       with typings.oojsUi.OO.ui.mixin.TitledElement.Static
       with typings.oojsUi.OO.ui.mixin.AccessKeyedElement.Static
}
