package typings.mobx

import typings.mobx.interceptUtilsMod.IInterceptable
import typings.mobx.interceptUtilsMod.IInterceptor
import typings.mobx.listenUtilsMod.IListenable
import typings.mobx.modifiersMod.IEnhancer
import typings.mobx.utilsMod.Lambda
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observablesetMod {
  
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.mobx.anon.DebugObjectNameNewValue[T]
    - typings.mobx.anon.DebugObjectNameObject[T]
  */
  trait ISetDidChange[T] extends StObject
  object ISetDidChange {
    
    inline def DebugObjectNameNewValue[T](debugObjectName: String, newValue: T, `object`: ObservableSet[T]): typings.mobx.anon.DebugObjectNameNewValue[T] = {
      val __obj = js.Dynamic.literal(debugObjectName = debugObjectName.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], observableKind = "set")
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("add")
      __obj.asInstanceOf[typings.mobx.anon.DebugObjectNameNewValue[T]]
    }
    
    inline def DebugObjectNameObject[T](debugObjectName: String, `object`: ObservableSet[T], oldValue: T): typings.mobx.anon.DebugObjectNameObject[T] = {
      val __obj = js.Dynamic.literal(debugObjectName = debugObjectName.asInstanceOf[js.Any], observableKind = "set", oldValue = oldValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("delete")
      __obj.asInstanceOf[typings.mobx.anon.DebugObjectNameObject[T]]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mobx.anon.ObjectOldValue[T]
    - typings.mobx.anon.NewValueObject[T]
  */
  trait ISetWillChange[T] extends StObject
  object ISetWillChange {
    
    inline def NewValueObject[T](newValue: T, `object`: ObservableSet[T]): typings.mobx.anon.NewValueObject[T] = {
      val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("add")
      __obj.asInstanceOf[typings.mobx.anon.NewValueObject[T]]
    }
    
    inline def ObjectOldValue[T](`object`: ObservableSet[T], oldValue: T): typings.mobx.anon.ObjectOldValue[T] = {
      val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("delete")
      __obj.asInstanceOf[typings.mobx.anon.ObjectOldValue[T]]
    }
  }
}
