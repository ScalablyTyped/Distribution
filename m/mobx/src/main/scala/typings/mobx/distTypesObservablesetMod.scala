package typings.mobx

import typings.mobx.anon.DebugObjectNameNewValue
import typings.mobx.anon.DebugObjectNameObject
import typings.mobx.anon.NewValueObject
import typings.mobx.anon.ObjectOldValue
import typings.mobx.distTypesInterceptUtilsMod.IInterceptable
import typings.mobx.distTypesInterceptUtilsMod.IInterceptor
import typings.mobx.distTypesListenUtilsMod.IListenable
import typings.mobx.distTypesModifiersMod.IEnhancer
import typings.mobx.distUtilsUtilsMod.Lambda
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesObservablesetMod {
  
  @JSImport("mobx/dist/types/observableset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mobx/dist/types/observableset", "ObservableSet")
  @js.native
  open class ObservableSet[T] ()
    extends StObject
       with Set[T]
       with IInterceptable[ISetWillChange[Any]]
       with IListenable {
    def this(initialData: IObservableSetInitialValues[T]) = this()
    def this(initialData: Unit, enhancer: IEnhancer[T]) = this()
    def this(initialData: IObservableSetInitialValues[T], enhancer: IEnhancer[T]) = this()
    def this(initialData: Unit, enhancer: Unit, name_ : String) = this()
    def this(initialData: Unit, enhancer: IEnhancer[T], name_ : String) = this()
    def this(initialData: IObservableSetInitialValues[T], enhancer: Unit, name_ : String) = this()
    def this(initialData: IObservableSetInitialValues[T], enhancer: IEnhancer[T], name_ : String) = this()
    
    /* private */ var atom_ : Any = js.native
    
    /* private */ var data_ : Any = js.native
    
    /* private */ var dehanceValue_ : Any = js.native
    
    var dehancer: Any = js.native
    
    def enhancer_(newV: Any): Any = js.native
    def enhancer_(newV: Any, oldV: Any): Any = js.native
    
    var get: Any = js.native
    
    def intercept_(handler: IInterceptor[ISetWillChange[T]]): Lambda = js.native
    
    var name_ : String = js.native
    
    def observe_(listener: js.Function1[/* changes */ ISetDidChange[T], Unit]): Lambda = js.native
    def observe_(listener: js.Function1[/* changes */ ISetDidChange[T], Unit], fireImmediately: Boolean): Lambda = js.native
    
    def replace(other: IObservableSetInitialValues[T]): ObservableSet[T] = js.native
    def replace(other: ObservableSet[T]): ObservableSet[T] = js.native
    
    @JSName("size")
    def size_MObservableSet: Double = js.native
    
    def toJSON(): js.Array[T] = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag_ObservableSet: js.Function0[String] = js.native
  }
  
  @JSImport("mobx/dist/types/observableset", "isObservableSet")
  @js.native
  def isObservableSet: js.Function1[
    /* thing */ Any, 
    /* is mobx.mobx/dist/types/observableset.ObservableSet<any> */ Boolean
  ] = js.native
  inline def isObservableSet_=(
    x: js.Function1[
      /* thing */ Any, 
      /* is mobx.mobx/dist/types/observableset.ObservableSet<any> */ Boolean
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isObservableSet")(x.asInstanceOf[js.Any])
  
  type IObservableSetInitialValues[T] = Set[T] | js.Array[T]
  
  type ISetDidChange[T] = DebugObjectNameNewValue[T] | DebugObjectNameObject[T]
  
  type ISetWillChange[T] = ObjectOldValue[T] | NewValueObject[T]
}
