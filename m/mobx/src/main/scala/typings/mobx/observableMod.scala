package typings.mobx

import org.scalablytyped.runtime.TopLevel
import typings.mobx.comparerMod.IEqualsComparer
import typings.mobx.internalMod.ObservableMap
import typings.mobx.internalMod.ObservableSet
import typings.mobx.modifiersMod.IEnhancer
import typings.mobx.observablearrayMod.IObservableArray
import typings.mobx.observabledecoratorMod.IObservableDecorator
import typings.mobx.observablemapMod.IObservableMapInitialValues
import typings.mobx.observableobjectMod.IObservableObject
import typings.mobx.observablesetMod.IObservableSetInitialValues
import typings.mobx.observablevalueMod.IObservableValue
import typings.std.Map
import typings.std.PropertyDescriptor
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableMod {
  
  @JSImport("mobx/lib/api/observable", "asCreateObservableOptions")
  @js.native
  def asCreateObservableOptions(thing: js.Any): CreateObservableOptions = js.native
  
  @JSImport("mobx/lib/api/observable", "deepDecorator")
  @js.native
  val deepDecorator: IObservableDecorator = js.native
  
  @JSImport("mobx/lib/api/observable", "defaultCreateObservableOptions")
  @js.native
  val defaultCreateObservableOptions: CreateObservableOptions = js.native
  
  /* Inlined mobx.mobx/lib/api/observable.IObservableFactory & mobx.mobx/lib/api/observable.IObservableFactories & {  enhancer :mobx.mobx/lib/internal.IEnhancer<any>} */
  object observable {
    
    @JSImport("mobx/lib/api/observable", "observable")
    @js.native
    def apply(): scala.Nothing = js.native
    @JSImport("mobx/lib/api/observable", "observable")
    @js.native
    def apply(target: js.Object, key: String): js.Any = js.native
    @JSImport("mobx/lib/api/observable", "observable")
    @js.native
    def apply(target: js.Object, key: String, baseDescriptor: PropertyDescriptor): js.Any = js.native
    @JSImport("mobx/lib/api/observable", "observable")
    @js.native
    def apply(target: js.Object, key: js.Symbol): js.Any = js.native
    @JSImport("mobx/lib/api/observable", "observable")
    @js.native
    def apply(target: js.Object, key: js.Symbol, baseDescriptor: PropertyDescriptor): js.Any = js.native
    @JSImport("mobx/lib/api/observable", "observable")
    @js.native
    def apply(value: String): scala.Nothing = js.native
    @JSImport("mobx/lib/api/observable", "observable")
    @js.native
    def apply(value: Boolean): scala.Nothing = js.native
    @JSImport("mobx/lib/api/observable", "observable")
    @js.native
    def apply(value: Double): scala.Nothing = js.native
    @JSImport("mobx/lib/api/observable", "observable")
    @js.native
    def apply[T /* <: js.Object */](value: T): T with IObservableObject = js.native
    @JSImport("mobx/lib/api/observable", "observable")
    @js.native
    def apply[T /* <: js.Object */](
      value: T,
      decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? std.Function}
      */ typings.mobx.mobxStrings.apply with TopLevel[js.Any]
    ): T with IObservableObject = js.native
    @JSImport("mobx/lib/api/observable", "observable")
    @js.native
    def apply[T /* <: js.Object */](
      value: T,
      decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? std.Function}
      */ typings.mobx.mobxStrings.apply with TopLevel[js.Any],
      options: CreateObservableOptions
    ): T with IObservableObject = js.native
    @JSImport("mobx/lib/api/observable", "observable")
    @js.native
    def apply[T /* <: js.Object */](value: T, decorators: js.UndefOr[scala.Nothing], options: CreateObservableOptions): T with IObservableObject = js.native
    @JSImport("mobx/lib/api/observable", "observable")
    @js.native
    def apply[T](value: js.Array[T]): IObservableArray[T] = js.native
    @JSImport("mobx/lib/api/observable", "observable")
    @js.native
    def apply[T](value: js.Array[T], options: CreateObservableOptions): IObservableArray[T] = js.native
    @JSImport("mobx/lib/api/observable", "observable")
    @js.native
    def apply[T](value: Set[T]): ObservableSet[T] = js.native
    @JSImport("mobx/lib/api/observable", "observable")
    @js.native
    def apply[T](value: Set[T], options: CreateObservableOptions): ObservableSet[T] = js.native
    @JSImport("mobx/lib/api/observable", "observable")
    @js.native
    def apply[K, V](value: Map[K, V]): ObservableMap[K, V] = js.native
    @JSImport("mobx/lib/api/observable", "observable")
    @js.native
    def apply[K, V](value: Map[K, V], options: CreateObservableOptions): ObservableMap[K, V] = js.native
    @JSImport("mobx/lib/api/observable", "observable")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mobx/lib/api/observable", "observable.array")
    @js.native
    def array[T](): IObservableArray[T] = js.native
    @JSImport("mobx/lib/api/observable", "observable.array")
    @js.native
    def array[T](initialValues: js.UndefOr[scala.Nothing], options: CreateObservableOptions): IObservableArray[T] = js.native
    @JSImport("mobx/lib/api/observable", "observable.array")
    @js.native
    def array[T](initialValues: js.Array[T]): IObservableArray[T] = js.native
    @JSImport("mobx/lib/api/observable", "observable.array")
    @js.native
    def array[T](initialValues: js.Array[T], options: CreateObservableOptions): IObservableArray[T] = js.native
    
    @JSImport("mobx/lib/api/observable", "observable.box")
    @js.native
    def box[T](): IObservableValue[T] = js.native
    @JSImport("mobx/lib/api/observable", "observable.box")
    @js.native
    def box[T](value: T): IObservableValue[T] = js.native
    @JSImport("mobx/lib/api/observable", "observable.box")
    @js.native
    def box[T](value: T, options: CreateObservableOptions): IObservableValue[T] = js.native
    @JSImport("mobx/lib/api/observable", "observable.box")
    @js.native
    def box[T](value: js.UndefOr[scala.Nothing], options: CreateObservableOptions): IObservableValue[T] = js.native
    
    @JSImport("mobx/lib/api/observable", "observable.deep")
    @js.native
    def deep: IObservableDecorator = js.native
    @JSImport("mobx/lib/api/observable", "observable.deep")
    @js.native
    def deep(target: js.Object, property: String): Unit = js.native
    @JSImport("mobx/lib/api/observable", "observable.deep")
    @js.native
    def deep(target: js.Object, property: String, descriptor: PropertyDescriptor): Unit = js.native
    @JSImport("mobx/lib/api/observable", "observable.deep")
    @js.native
    def deep(target: js.Object, property: js.Symbol): Unit = js.native
    @JSImport("mobx/lib/api/observable", "observable.deep")
    @js.native
    def deep(target: js.Object, property: js.Symbol, descriptor: PropertyDescriptor): Unit = js.native
    @scala.inline
    def deep_=(x: IObservableDecorator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deep")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx/lib/api/observable", "observable.enhancer")
    @js.native
    def enhancer: IEnhancer[js.Any] = js.native
    @JSImport("mobx/lib/api/observable", "observable.enhancer")
    @js.native
    def enhancer(newValue: js.Any, oldValue: js.UndefOr[scala.Nothing], name: String): js.Any = js.native
    @JSImport("mobx/lib/api/observable", "observable.enhancer")
    @js.native
    def enhancer(newValue: js.Any, oldValue: js.Any, name: String): js.Any = js.native
    @scala.inline
    def enhancer_=(x: IEnhancer[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enhancer")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx/lib/api/observable", "observable.map")
    @js.native
    def map[K, V](): ObservableMap[K, V] = js.native
    @JSImport("mobx/lib/api/observable", "observable.map")
    @js.native
    def map[K, V](initialValues: js.UndefOr[IObservableMapInitialValues[K, V]], options: CreateObservableOptions): ObservableMap[K, V] = js.native
    @JSImport("mobx/lib/api/observable", "observable.map")
    @js.native
    def map[K, V](initialValues: IObservableMapInitialValues[K, V]): ObservableMap[K, V] = js.native
    
    /**
      * Decorator that creates an observable that only observes the references, but doesn't try to turn the assigned value into an observable.ts.
      */
    @JSImport("mobx/lib/api/observable", "observable.ref")
    @js.native
    def ref: IObservableDecorator = js.native
    /**
      * Decorator that creates an observable that only observes the references, but doesn't try to turn the assigned value into an observable.ts.
      */
    @JSImport("mobx/lib/api/observable", "observable.ref")
    @js.native
    def ref(target: js.Object, property: String): Unit = js.native
    @JSImport("mobx/lib/api/observable", "observable.ref")
    @js.native
    def ref(target: js.Object, property: String, descriptor: PropertyDescriptor): Unit = js.native
    @JSImport("mobx/lib/api/observable", "observable.ref")
    @js.native
    def ref(target: js.Object, property: js.Symbol): Unit = js.native
    @JSImport("mobx/lib/api/observable", "observable.ref")
    @js.native
    def ref(target: js.Object, property: js.Symbol, descriptor: PropertyDescriptor): Unit = js.native
    @scala.inline
    def ref_=(x: IObservableDecorator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ref")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx/lib/api/observable", "observable.set")
    @js.native
    def set[T](): ObservableSet[T] = js.native
    @JSImport("mobx/lib/api/observable", "observable.set")
    @js.native
    def set[T](initialValues: js.UndefOr[IObservableSetInitialValues[T]], options: CreateObservableOptions): ObservableSet[T] = js.native
    @JSImport("mobx/lib/api/observable", "observable.set")
    @js.native
    def set[T](initialValues: IObservableSetInitialValues[T]): ObservableSet[T] = js.native
    
    /**
      * Decorator that creates an observable converts its value (objects, maps or arrays) into a shallow observable structure
      */
    @JSImport("mobx/lib/api/observable", "observable.shallow")
    @js.native
    def shallow: IObservableDecorator = js.native
    /**
      * Decorator that creates an observable converts its value (objects, maps or arrays) into a shallow observable structure
      */
    @JSImport("mobx/lib/api/observable", "observable.shallow")
    @js.native
    def shallow(target: js.Object, property: String): Unit = js.native
    @JSImport("mobx/lib/api/observable", "observable.shallow")
    @js.native
    def shallow(target: js.Object, property: String, descriptor: PropertyDescriptor): Unit = js.native
    @JSImport("mobx/lib/api/observable", "observable.shallow")
    @js.native
    def shallow(target: js.Object, property: js.Symbol): Unit = js.native
    @JSImport("mobx/lib/api/observable", "observable.shallow")
    @js.native
    def shallow(target: js.Object, property: js.Symbol, descriptor: PropertyDescriptor): Unit = js.native
    @scala.inline
    def shallow_=(x: IObservableDecorator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shallow")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx/lib/api/observable", "observable.struct")
    @js.native
    def struct: IObservableDecorator = js.native
    @JSImport("mobx/lib/api/observable", "observable.struct")
    @js.native
    def struct(target: js.Object, property: String): Unit = js.native
    @JSImport("mobx/lib/api/observable", "observable.struct")
    @js.native
    def struct(target: js.Object, property: String, descriptor: PropertyDescriptor): Unit = js.native
    @JSImport("mobx/lib/api/observable", "observable.struct")
    @js.native
    def struct(target: js.Object, property: js.Symbol): Unit = js.native
    @JSImport("mobx/lib/api/observable", "observable.struct")
    @js.native
    def struct(target: js.Object, property: js.Symbol, descriptor: PropertyDescriptor): Unit = js.native
    @scala.inline
    def struct_=(x: IObservableDecorator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("struct")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx/lib/api/observable", "observable.object")
    @js.native
    def `object`[T](props: T): T with IObservableObject = js.native
    @JSImport("mobx/lib/api/observable", "observable.object")
    @js.native
    def `object`[T](
      props: T,
      decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? std.Function}
      */ typings.mobx.mobxStrings.`object` with TopLevel[js.Any]
    ): T with IObservableObject = js.native
    @JSImport("mobx/lib/api/observable", "observable.object")
    @js.native
    def `object`[T](
      props: T,
      decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? std.Function}
      */ typings.mobx.mobxStrings.`object` with TopLevel[js.Any],
      options: CreateObservableOptions
    ): T with IObservableObject = js.native
    @JSImport("mobx/lib/api/observable", "observable.object")
    @js.native
    def `object`[T](props: T, decorators: js.UndefOr[scala.Nothing], options: CreateObservableOptions): T with IObservableObject = js.native
  }
  
  @JSImport("mobx/lib/api/observable", "refDecorator")
  @js.native
  val refDecorator: IObservableDecorator = js.native
  
  @js.native
  trait CreateObservableOptions extends StObject {
    
    var deep: js.UndefOr[Boolean] = js.native
    
    var defaultDecorator: js.UndefOr[IObservableDecorator] = js.native
    
    @JSName("equals")
    var equals_FCreateObservableOptions: js.UndefOr[IEqualsComparer[_]] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var proxy: js.UndefOr[Boolean] = js.native
  }
  object CreateObservableOptions {
    
    @scala.inline
    def apply(): CreateObservableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateObservableOptions]
    }
    
    @scala.inline
    implicit class CreateObservableOptionsMutableBuilder[Self <: CreateObservableOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
      
      @scala.inline
      def setDefaultDecorator(value: IObservableDecorator): Self = StObject.set(x, "defaultDecorator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultDecoratorUndefined: Self = StObject.set(x, "defaultDecorator", js.undefined)
      
      @scala.inline
      def setEquals_(value: (_, _) => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setProxy(value: Boolean): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    }
  }
  
  @js.native
  trait IObservableFactories extends StObject {
    
    def array[T](): IObservableArray[T] = js.native
    def array[T](initialValues: js.UndefOr[scala.Nothing], options: CreateObservableOptions): IObservableArray[T] = js.native
    def array[T](initialValues: js.Array[T]): IObservableArray[T] = js.native
    def array[T](initialValues: js.Array[T], options: CreateObservableOptions): IObservableArray[T] = js.native
    
    def box[T](): IObservableValue[T] = js.native
    def box[T](value: T): IObservableValue[T] = js.native
    def box[T](value: T, options: CreateObservableOptions): IObservableValue[T] = js.native
    def box[T](value: js.UndefOr[scala.Nothing], options: CreateObservableOptions): IObservableValue[T] = js.native
    
    def deep(target: js.Object, property: String): Unit = js.native
    def deep(target: js.Object, property: String, descriptor: PropertyDescriptor): Unit = js.native
    def deep(target: js.Object, property: js.Symbol): Unit = js.native
    def deep(target: js.Object, property: js.Symbol, descriptor: PropertyDescriptor): Unit = js.native
    @JSName("deep")
    var deep_Original: IObservableDecorator = js.native
    
    def map[K, V](): ObservableMap[K, V] = js.native
    def map[K, V](initialValues: js.UndefOr[IObservableMapInitialValues[K, V]], options: CreateObservableOptions): ObservableMap[K, V] = js.native
    def map[K, V](initialValues: IObservableMapInitialValues[K, V]): ObservableMap[K, V] = js.native
    
    def `object`[T](props: T): T with IObservableObject = js.native
    def `object`[T](
      props: T,
      decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? std.Function}
      */ typings.mobx.mobxStrings.IObservableFactories with TopLevel[js.Any]
    ): T with IObservableObject = js.native
    def `object`[T](
      props: T,
      decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? std.Function}
      */ typings.mobx.mobxStrings.IObservableFactories with TopLevel[js.Any],
      options: CreateObservableOptions
    ): T with IObservableObject = js.native
    def `object`[T](props: T, decorators: js.UndefOr[scala.Nothing], options: CreateObservableOptions): T with IObservableObject = js.native
    
    /**
      * Decorator that creates an observable that only observes the references, but doesn't try to turn the assigned value into an observable.ts.
      */
    def ref(target: js.Object, property: String): Unit = js.native
    def ref(target: js.Object, property: String, descriptor: PropertyDescriptor): Unit = js.native
    def ref(target: js.Object, property: js.Symbol): Unit = js.native
    def ref(target: js.Object, property: js.Symbol, descriptor: PropertyDescriptor): Unit = js.native
    /**
      * Decorator that creates an observable that only observes the references, but doesn't try to turn the assigned value into an observable.ts.
      */
    @JSName("ref")
    var ref_Original: IObservableDecorator = js.native
    
    def set[T](): ObservableSet[T] = js.native
    def set[T](initialValues: js.UndefOr[IObservableSetInitialValues[T]], options: CreateObservableOptions): ObservableSet[T] = js.native
    def set[T](initialValues: IObservableSetInitialValues[T]): ObservableSet[T] = js.native
    
    /**
      * Decorator that creates an observable converts its value (objects, maps or arrays) into a shallow observable structure
      */
    def shallow(target: js.Object, property: String): Unit = js.native
    def shallow(target: js.Object, property: String, descriptor: PropertyDescriptor): Unit = js.native
    def shallow(target: js.Object, property: js.Symbol): Unit = js.native
    def shallow(target: js.Object, property: js.Symbol, descriptor: PropertyDescriptor): Unit = js.native
    /**
      * Decorator that creates an observable converts its value (objects, maps or arrays) into a shallow observable structure
      */
    @JSName("shallow")
    var shallow_Original: IObservableDecorator = js.native
    
    def struct(target: js.Object, property: String): Unit = js.native
    def struct(target: js.Object, property: String, descriptor: PropertyDescriptor): Unit = js.native
    def struct(target: js.Object, property: js.Symbol): Unit = js.native
    def struct(target: js.Object, property: js.Symbol, descriptor: PropertyDescriptor): Unit = js.native
    @JSName("struct")
    var struct_Original: IObservableDecorator = js.native
  }
  
  @js.native
  trait IObservableFactory extends StObject {
    
    def apply(): scala.Nothing = js.native
    def apply(target: js.Object, key: String): js.Any = js.native
    def apply(target: js.Object, key: String, baseDescriptor: PropertyDescriptor): js.Any = js.native
    def apply(target: js.Object, key: js.Symbol): js.Any = js.native
    def apply(target: js.Object, key: js.Symbol, baseDescriptor: PropertyDescriptor): js.Any = js.native
    def apply(value: String): scala.Nothing = js.native
    def apply(value: Boolean): scala.Nothing = js.native
    def apply(value: Double): scala.Nothing = js.native
    def apply[T /* <: js.Object */](value: T): T with IObservableObject = js.native
    def apply[T /* <: js.Object */](
      value: T,
      decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? std.Function}
      */ typings.mobx.mobxStrings.IObservableFactory with TopLevel[js.Any]
    ): T with IObservableObject = js.native
    def apply[T /* <: js.Object */](
      value: T,
      decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? std.Function}
      */ typings.mobx.mobxStrings.IObservableFactory with TopLevel[js.Any],
      options: CreateObservableOptions
    ): T with IObservableObject = js.native
    def apply[T /* <: js.Object */](value: T, decorators: js.UndefOr[scala.Nothing], options: CreateObservableOptions): T with IObservableObject = js.native
    def apply[T](value: js.Array[T]): IObservableArray[T] = js.native
    def apply[T](value: js.Array[T], options: CreateObservableOptions): IObservableArray[T] = js.native
    def apply[T](value: Set[T]): ObservableSet[T] = js.native
    def apply[T](value: Set[T], options: CreateObservableOptions): ObservableSet[T] = js.native
    def apply[K, V](value: Map[K, V]): ObservableMap[K, V] = js.native
    def apply[K, V](value: Map[K, V], options: CreateObservableOptions): ObservableMap[K, V] = js.native
  }
}
