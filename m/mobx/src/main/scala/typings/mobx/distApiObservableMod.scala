package typings.mobx

import typings.mobx.distApiAnnotationMod.Annotation
import typings.mobx.distApiAnnotationMod.AnnotationsMap
import typings.mobx.distInternalMod.ObservableMap
import typings.mobx.distInternalMod.ObservableSet
import typings.mobx.distTypesModifiersMod.IEnhancer
import typings.mobx.distTypesObservablearrayMod.IObservableArray
import typings.mobx.distTypesObservablemapMod.IObservableMapInitialValues
import typings.mobx.distTypesObservablesetMod.IObservableSetInitialValues
import typings.mobx.distTypesObservablevalueMod.IObservableValue
import typings.mobx.distUtilsComparerMod.IEqualsComparer
import typings.std.Map
import typings.std.PropertyDecorator
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distApiObservableMod {
  
  @JSImport("mobx/dist/api/observable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mobx/dist/api/observable", "OBSERVABLE")
  @js.native
  val OBSERVABLE_ : /* "observable" */ String = js.native
  
  @JSImport("mobx/dist/api/observable", "OBSERVABLE_REF")
  @js.native
  val OBSERVABLE_REF: /* "observable.ref" */ String = js.native
  
  @JSImport("mobx/dist/api/observable", "OBSERVABLE_SHALLOW")
  @js.native
  val OBSERVABLE_SHALLOW: /* "observable.shallow" */ String = js.native
  
  @JSImport("mobx/dist/api/observable", "OBSERVABLE_STRUCT")
  @js.native
  val OBSERVABLE_STRUCT: /* "observable.struct" */ String = js.native
  
  inline def asCreateObservableOptions(thing: Any): CreateObservableOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("asCreateObservableOptions")(thing.asInstanceOf[js.Any]).asInstanceOf[CreateObservableOptions]
  
  @JSImport("mobx/dist/api/observable", "defaultCreateObservableOptions")
  @js.native
  val defaultCreateObservableOptions: CreateObservableOptions = js.native
  
  inline def getAnnotationFromOptions(): js.UndefOr[Annotation] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnnotationFromOptions")().asInstanceOf[js.UndefOr[Annotation]]
  inline def getAnnotationFromOptions(options: CreateObservableOptions): js.UndefOr[Annotation] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnnotationFromOptions")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Annotation]]
  
  inline def getEnhancerFromAnnotation(): IEnhancer[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnhancerFromAnnotation")().asInstanceOf[IEnhancer[Any]]
  inline def getEnhancerFromAnnotation(annotation: Annotation): IEnhancer[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnhancerFromAnnotation")(annotation.asInstanceOf[js.Any]).asInstanceOf[IEnhancer[Any]]
  
  inline def getEnhancerFromOptions(options: CreateObservableOptions): IEnhancer[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnhancerFromOptions")(options.asInstanceOf[js.Any]).asInstanceOf[IEnhancer[Any]]
  
  @JSImport("mobx/dist/api/observable", "observable")
  @js.native
  def observable: IObservableFactory = js.native
  inline def observable_=(x: IObservableFactory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("observable")(x.asInstanceOf[js.Any])
  
  trait CreateObservableOptions extends StObject {
    
    var autoBind: js.UndefOr[Boolean] = js.undefined
    
    var deep: js.UndefOr[Boolean] = js.undefined
    
    var defaultDecorator: js.UndefOr[Annotation] = js.undefined
    
    @JSName("equals")
    var equals_FCreateObservableOptions: js.UndefOr[IEqualsComparer[Any]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var proxy: js.UndefOr[Boolean] = js.undefined
  }
  object CreateObservableOptions {
    
    inline def apply(): CreateObservableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateObservableOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateObservableOptions] (val x: Self) extends AnyVal {
      
      inline def setAutoBind(value: Boolean): Self = StObject.set(x, "autoBind", value.asInstanceOf[js.Any])
      
      inline def setAutoBindUndefined: Self = StObject.set(x, "autoBind", js.undefined)
      
      inline def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      inline def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
      
      inline def setDefaultDecorator(value: Annotation): Self = StObject.set(x, "defaultDecorator", value.asInstanceOf[js.Any])
      
      inline def setDefaultDecoratorUndefined: Self = StObject.set(x, "defaultDecorator", js.undefined)
      
      inline def setEquals_(value: (Any, Any) => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction2(value))
      
      inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProxy(value: Boolean): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    }
  }
  
  @js.native
  trait IObservableFactory
    extends PropertyDecorator
       with Annotation {
    
    def apply[T /* <: js.Object */](value: T): T = js.native
    def apply[T /* <: js.Object */](value: T, decorators: Unit, options: CreateObservableOptions): T = js.native
    def apply[T /* <: js.Object */](value: T, decorators: AnnotationsMap[T, scala.Nothing]): T = js.native
    def apply[T /* <: js.Object */](value: T, decorators: AnnotationsMap[T, scala.Nothing], options: CreateObservableOptions): T = js.native
    def apply[T](value: js.Array[T]): IObservableArray[T] = js.native
    def apply[T](value: js.Array[T], options: CreateObservableOptions): IObservableArray[T] = js.native
    def apply[T](value: Set[T]): ObservableSet[T] = js.native
    def apply[T](value: Set[T], options: CreateObservableOptions): ObservableSet[T] = js.native
    def apply[K, V](value: Map[K, V]): ObservableMap[K, V] = js.native
    def apply[K, V](value: Map[K, V], options: CreateObservableOptions): ObservableMap[K, V] = js.native
    
    /* InferMemberOverrides */
    override def apply(arg1: /* target */ js.Object, arg2: /* propertyKey */ String | js.Symbol): Unit = js.native
    
    def array[T](): IObservableArray[T] = js.native
    def array[T](initialValues: js.Array[T]): IObservableArray[T] = js.native
    def array[T](initialValues: js.Array[T], options: CreateObservableOptions): IObservableArray[T] = js.native
    def array[T](initialValues: Unit, options: CreateObservableOptions): IObservableArray[T] = js.native
    
    def box[T](): IObservableValue[js.UndefOr[T]] = js.native
    def box[T](value: T): IObservableValue[T] = js.native
    def box[T](value: T, options: CreateObservableOptions): IObservableValue[T] = js.native
    def box[T](value: Unit, options: CreateObservableOptions): IObservableValue[js.UndefOr[T]] = js.native
    @JSName("box")
    var box_Original: IObservableValueFactory = js.native
    
    def deep(target: js.Object, propertyKey: String): Unit = js.native
    def deep(target: js.Object, propertyKey: js.Symbol): Unit = js.native
    @JSName("deep")
    var deep_Original: Annotation & PropertyDecorator = js.native
    
    def map[K, V](): ObservableMap[K, V] = js.native
    def map[K, V](initialValues: Unit, options: CreateObservableOptions): ObservableMap[K, V] = js.native
    def map[K, V](initialValues: IObservableMapInitialValues[K, V]): ObservableMap[K, V] = js.native
    def map[K, V](initialValues: IObservableMapInitialValues[K, V], options: CreateObservableOptions): ObservableMap[K, V] = js.native
    
    def `object`[T](props: T): T = js.native
    def `object`[T](props: T, decorators: Unit, options: CreateObservableOptions): T = js.native
    def `object`[T](props: T, decorators: AnnotationsMap[T, scala.Nothing]): T = js.native
    def `object`[T](props: T, decorators: AnnotationsMap[T, scala.Nothing], options: CreateObservableOptions): T = js.native
    
    /**
      * Decorator that creates an observable that only observes the references, but doesn't try to turn the assigned value into an observable.ts.
      */
    def ref(target: js.Object, propertyKey: String): Unit = js.native
    def ref(target: js.Object, propertyKey: js.Symbol): Unit = js.native
    /**
      * Decorator that creates an observable that only observes the references, but doesn't try to turn the assigned value into an observable.ts.
      */
    @JSName("ref")
    var ref_Original: Annotation & PropertyDecorator = js.native
    
    def set[T](): ObservableSet[T] = js.native
    def set[T](initialValues: Unit, options: CreateObservableOptions): ObservableSet[T] = js.native
    def set[T](initialValues: IObservableSetInitialValues[T]): ObservableSet[T] = js.native
    def set[T](initialValues: IObservableSetInitialValues[T], options: CreateObservableOptions): ObservableSet[T] = js.native
    
    /**
      * Decorator that creates an observable converts its value (objects, maps or arrays) into a shallow observable structure
      */
    def shallow(target: js.Object, propertyKey: String): Unit = js.native
    def shallow(target: js.Object, propertyKey: js.Symbol): Unit = js.native
    /**
      * Decorator that creates an observable converts its value (objects, maps or arrays) into a shallow observable structure
      */
    @JSName("shallow")
    var shallow_Original: Annotation & PropertyDecorator = js.native
    
    def struct(target: js.Object, propertyKey: String): Unit = js.native
    def struct(target: js.Object, propertyKey: js.Symbol): Unit = js.native
    @JSName("struct")
    var struct_Original: Annotation & PropertyDecorator = js.native
  }
  
  @js.native
  trait IObservableValueFactory extends StObject {
    
    def apply[T](): IObservableValue[js.UndefOr[T]] = js.native
    def apply[T](value: T): IObservableValue[T] = js.native
    def apply[T](value: T, options: CreateObservableOptions): IObservableValue[T] = js.native
    def apply[T](value: Unit, options: CreateObservableOptions): IObservableValue[js.UndefOr[T]] = js.native
  }
}
