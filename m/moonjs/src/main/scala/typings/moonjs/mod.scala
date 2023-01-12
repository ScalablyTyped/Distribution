package typings.moonjs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.moonjs.moonjsBooleans.`true`
import typings.moonjs.moonjsStrings.Numbersigntext
import typings.std.Event
import typings.std.HTMLElement
import typings.std.Record
import typings.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("moonjs", JSImport.Namespace)
  @js.native
  open class ^[Props /* <: String */, Data, Methods] ()
    extends StObject
       with Instance[Data & Methods & (Record[Props, Any])] {
    def this(options: ConstructorOptions[Props, Data, Methods]) = this()
  }
  @JSImport("moonjs", JSImport.Namespace)
  @js.native
  val ^ : MoonStatic = js.native
  
  trait ComponentOptions[Props /* <: String */, Data, Methods]
    extends StObject
       with ComponentOptionsProperties[Props, js.Function0[Data], Methods]
       with ThisType[Instance[Data & Methods & (Record[Props, Any])]]
  object ComponentOptions {
    
    inline def apply[Props /* <: String */, Data, Methods](): ComponentOptions[Props, Data, Methods] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentOptions[Props, Data, Methods]]
    }
  }
  
  trait ComponentOptionsProperties[Props /* <: String */, Data, Methods] extends StObject {
    
    var data: js.UndefOr[Data] = js.undefined
    
    var el: js.UndefOr[String | HTMLElement] = js.undefined
    
    var functional: js.UndefOr[`true`] = js.undefined
    
    var hooks: js.UndefOr[LifecycleHooks] = js.undefined
    
    var methods: js.UndefOr[Methods] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var props: js.UndefOr[js.Array[Props]] = js.undefined
    
    var render: js.UndefOr[js.Function2[/* h */ CreateElement, /* ctx */ Any, VDomElement]] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
  }
  object ComponentOptionsProperties {
    
    inline def apply[Props /* <: String */, Data, Methods](): ComponentOptionsProperties[Props, Data, Methods] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentOptionsProperties[Props, Data, Methods]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComponentOptionsProperties[?, ?, ?], Props /* <: String */, Data, Methods] (val x: Self & (ComponentOptionsProperties[Props, Data, Methods])) extends AnyVal {
      
      inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setEl(value: String | HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setElUndefined: Self = StObject.set(x, "el", js.undefined)
      
      inline def setFunctional(value: `true`): Self = StObject.set(x, "functional", value.asInstanceOf[js.Any])
      
      inline def setFunctionalUndefined: Self = StObject.set(x, "functional", js.undefined)
      
      inline def setHooks(value: LifecycleHooks): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
      
      inline def setMethods(value: Methods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProps(value: js.Array[Props]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setPropsVarargs(value: Props*): Self = StObject.set(x, "props", js.Array(value*))
      
      inline def setRender(value: (/* h */ CreateElement, /* ctx */ Any) => VDomElement): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
  
  trait ConstructorOptions[Props /* <: String */, Data, Methods]
    extends StObject
       with ComponentOptionsProperties[Props, js.Function0[Data] | Data, Methods]
       with ThisType[Instance[Data & Methods & (Record[Props, Any])]]
  object ConstructorOptions {
    
    inline def apply[Props /* <: String */, Data, Methods](): ConstructorOptions[Props, Data, Methods] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstructorOptions[Props, Data, Methods]]
    }
  }
  
  @js.native
  trait CreateElement extends StObject {
    
    def apply(tag: String, attrs: Record[String, Any]): VDomElement = js.native
    def apply(tag: String, attrs: Record[String, Any], metadata: Any): VDomElement = js.native
    def apply(tag: String, attrs: Record[String, Any], metadata: Any, children: String): VDomElement = js.native
    def apply(tag: String, attrs: Record[String, Any], metadata: Any, children: js.Array[VDomElement]): VDomElement = js.native
    def apply(tag: String, attrs: Record[String, Any], metadata: Unit, children: String): VDomElement = js.native
    def apply(tag: String, attrs: Record[String, Any], metadata: Unit, children: js.Array[VDomElement]): VDomElement = js.native
    def apply(tag: Instance[js.Object], attrs: Record[String, Any]): VDomElement = js.native
    def apply(tag: Instance[js.Object], attrs: Record[String, Any], metadata: Any): VDomElement = js.native
    def apply(tag: Instance[js.Object], attrs: Record[String, Any], metadata: Any, children: String): VDomElement = js.native
    def apply(
      tag: Instance[js.Object],
      attrs: Record[String, Any],
      metadata: Any,
      children: js.Array[VDomElement]
    ): VDomElement = js.native
    def apply(tag: Instance[js.Object], attrs: Record[String, Any], metadata: Unit, children: String): VDomElement = js.native
    def apply(
      tag: Instance[js.Object],
      attrs: Record[String, Any],
      metadata: Unit,
      children: js.Array[VDomElement]
    ): VDomElement = js.native
    def apply(tag: Numbersigntext, attrs: Record[String, Any]): VDomElement = js.native
    def apply(tag: Numbersigntext, attrs: Record[String, Any], metadata: Any): VDomElement = js.native
    def apply(tag: Numbersigntext, attrs: Record[String, Any], metadata: Any, children: String): VDomElement = js.native
    def apply(tag: Numbersigntext, attrs: Record[String, Any], metadata: Unit, children: String): VDomElement = js.native
  }
  
  @js.native
  trait Instance[Data] extends StObject {
    
    @JSName("$data")
    var $data: Data = js.native
    
    def build(): Unit = js.native
    
    def callMethod[K /* <: /* keyof Data */ String */](methodName: K): Any = js.native
    def callMethod[K /* <: /* keyof Data */ String */](methodName: K, params: js.Array[Any]): Any = js.native
    
    def destroy(): Unit = js.native
    
    def emit(eventName: String): Unit = js.native
    def emit(eventName: String, data: Any): Unit = js.native
    
    def get[K /* <: /* keyof Data */ String */](name: K): /* import warning: importer.ImportType#apply Failed type conversion: Data[K] */ js.Any = js.native
    
    def mount(selector: String): Unit = js.native
    
    def off(): Unit = js.native
    def off(eventName: String): Unit = js.native
    def off(eventName: String, listener: js.Function1[/* event */ Event, Unit]): Unit = js.native
    def off(eventName: Unit, listener: js.Function1[/* event */ Event, Unit]): Unit = js.native
    
    def on(eventName: String, listener: js.Function1[/* event */ Event, Unit]): Unit = js.native
    
    def set[K /* <: /* keyof Data */ String */](
      name: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: Data[K] */ js.Any
    ): Unit = js.native
  }
  
  trait LifecycleHooks extends StObject {
    
    var destroyed: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var init: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var mounted: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var updated: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object LifecycleHooks {
    
    inline def apply(): LifecycleHooks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LifecycleHooks]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LifecycleHooks] (val x: Self) extends AnyVal {
      
      inline def setDestroyed(value: () => Unit): Self = StObject.set(x, "destroyed", js.Any.fromFunction0(value))
      
      inline def setDestroyedUndefined: Self = StObject.set(x, "destroyed", js.undefined)
      
      inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setMounted(value: () => Unit): Self = StObject.set(x, "mounted", js.Any.fromFunction0(value))
      
      inline def setMountedUndefined: Self = StObject.set(x, "mounted", js.undefined)
      
      inline def setUpdated(value: () => Unit): Self = StObject.set(x, "updated", js.Any.fromFunction0(value))
      
      inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    }
  }
  
  trait MoonConfig extends StObject {
    
    var delimiters: js.Array[String]
    
    def keycodes(codemap: Record[String, Double]): Unit
    
    var prefix: String
    
    var silent: Boolean
    
    var version: String
  }
  object MoonConfig {
    
    inline def apply(
      delimiters: js.Array[String],
      keycodes: Record[String, Double] => Unit,
      prefix: String,
      silent: Boolean,
      version: String
    ): MoonConfig = {
      val __obj = js.Dynamic.literal(delimiters = delimiters.asInstanceOf[js.Any], keycodes = js.Any.fromFunction1(keycodes), prefix = prefix.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[MoonConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MoonConfig] (val x: Self) extends AnyVal {
      
      inline def setDelimiters(value: js.Array[String]): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
      
      inline def setDelimitersVarargs(value: String*): Self = StObject.set(x, "delimiters", js.Array(value*))
      
      inline def setKeycodes(value: Record[String, Double] => Unit): Self = StObject.set(x, "keycodes", js.Any.fromFunction1(value))
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MoonConstructor
    extends StObject
       with Instantiable0[Instance[Record[String, Any]]]
       with Instantiable1[
          /* options */ ConstructorOptions[String, js.Object, js.Object], 
          Instance[Record[String, Any]]
        ]
  
  @js.native
  trait MoonStatic
    extends StObject
       with MoonConstructor {
    
    def compile(template: String): Unit = js.native
    
    def component[Props /* <: String */, Data, Methods](name: String, options: ComponentOptions[Props, Data, Methods]): MoonConstructor = js.native
    
    var config: MoonConfig = js.native
    
    def directive(name: String, action: js.Function2[/* el */ Any, /* val */ Any, Unit]): Unit = js.native
    
    def nextTick(callback: js.Function0[Unit]): Unit = js.native
    
    def use(plugin: js.Object): Unit = js.native
  }
  
  trait VDomElement extends StObject {
    
    var children: js.Array[VDomElement]
    
    var meta: js.Object
    
    var props: Record[String, Any]
    
    var `type`: String
    
    var `val`: String
  }
  object VDomElement {
    
    inline def apply(
      children: js.Array[VDomElement],
      meta: js.Object,
      props: Record[String, Any],
      `type`: String,
      `val`: String
    ): VDomElement = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
      __obj.asInstanceOf[VDomElement]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VDomElement] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[VDomElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: VDomElement*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setMeta(value: js.Object): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Record[String, Any]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = MoonStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: MoonStatic = ^
}
