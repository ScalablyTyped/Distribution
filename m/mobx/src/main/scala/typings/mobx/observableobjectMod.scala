package typings.mobx

import typings.mobx.atomMod.IAtom
import typings.mobx.computedvalueMod.IComputedValueOptions
import typings.mobx.interceptUtilsMod.IInterceptable
import typings.mobx.interceptUtilsMod.IInterceptor
import typings.mobx.internalMod.ComputedValue
import typings.mobx.internalMod.ObservableValue
import typings.mobx.listenUtilsMod.IListenable
import typings.mobx.mobxStrings.add
import typings.mobx.mobxStrings.update
import typings.mobx.modifiersMod.IEnhancer
import typings.mobx.utilsMod.Lambda
import typings.std.Map
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableobjectMod {
  
  @JSImport("mobx/lib/types/observableobject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mobx/lib/types/observableobject", "ObservableObjectAdministration")
  @js.native
  class ObservableObjectAdministration protected ()
    extends StObject
       with IInterceptable[IObjectWillChange[js.Any]]
       with IListenable {
    def this(
      target: js.Any,
      values: Map[String | Double | js.Symbol, ObservableValue[js.Any] | ComputedValue[js.Any]],
      name: String,
      defaultEnhancer: IEnhancer[js.Any]
    ) = this()
    
    def addComputedProp(
      propertyOwner: js.Any,
      // where is the property declared?
    propName: PropertyKey,
      options: IComputedValueOptions[js.Any]
    ): Unit = js.native
    
    def addObservableProp(propName: PropertyKey, newValue: js.Any): Unit = js.native
    def addObservableProp(propName: PropertyKey, newValue: js.Any, enhancer: IEnhancer[js.Any]): Unit = js.native
    
    def defaultEnhancer(newValue: js.Any, oldValue: js.Any, name: String): js.Any = js.native
    def defaultEnhancer(newValue: js.Any, oldValue: Unit, name: String): js.Any = js.native
    @JSName("defaultEnhancer")
    var defaultEnhancer_Original: IEnhancer[js.Any] = js.native
    
    def getKeys(): js.Array[PropertyKey] = js.native
    
    def has(key: PropertyKey): js.Any = js.native
    
    def illegalAccess(owner: js.Any, propName: js.Any): Unit = js.native
    
    def intercept(handler: js.Any): Lambda = js.native
    /* CompleteClass */
    override def intercept(handler: IInterceptor[IObjectWillChange[js.Any]]): Lambda = js.native
    
    var keysAtom: IAtom = js.native
    
    var name: String = js.native
    
    def notifyPropertyAddition(key: PropertyKey, newValue: js.Any): Unit = js.native
    
    /**
      * Observes this object. Triggers for the events 'add', 'update' and 'delete'.
      * See: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/observe
      * for callback details
      */
    def observe(callback: js.Function1[/* changes */ IObjectDidChange[js.Any], Unit]): Lambda = js.native
    def observe(callback: js.Function1[/* changes */ IObjectDidChange[js.Any], Unit], fireImmediately: Boolean): Lambda = js.native
    
    var pendingKeys: js.Any = js.native
    
    var proxy: js.Any = js.native
    
    def read(key: PropertyKey): js.Any = js.native
    
    def remove(key: PropertyKey): Unit = js.native
    
    var target: js.Any = js.native
    
    var values: Map[String | Double | js.Symbol, ObservableValue[js.Any] | ComputedValue[js.Any]] = js.native
    
    def write(key: PropertyKey, newValue: js.Any): Unit = js.native
  }
  
  @scala.inline
  def asObservableObject(target: js.Any): ObservableObjectAdministration = ^.asInstanceOf[js.Dynamic].applyDynamic("asObservableObject")(target.asInstanceOf[js.Any]).asInstanceOf[ObservableObjectAdministration]
  @scala.inline
  def asObservableObject(target: js.Any, name: Unit, defaultEnhancer: IEnhancer[js.Any]): ObservableObjectAdministration = (^.asInstanceOf[js.Dynamic].applyDynamic("asObservableObject")(target.asInstanceOf[js.Any], name.asInstanceOf[js.Any], defaultEnhancer.asInstanceOf[js.Any])).asInstanceOf[ObservableObjectAdministration]
  @scala.inline
  def asObservableObject(target: js.Any, name: PropertyKey): ObservableObjectAdministration = (^.asInstanceOf[js.Dynamic].applyDynamic("asObservableObject")(target.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[ObservableObjectAdministration]
  @scala.inline
  def asObservableObject(target: js.Any, name: PropertyKey, defaultEnhancer: IEnhancer[js.Any]): ObservableObjectAdministration = (^.asInstanceOf[js.Dynamic].applyDynamic("asObservableObject")(target.asInstanceOf[js.Any], name.asInstanceOf[js.Any], defaultEnhancer.asInstanceOf[js.Any])).asInstanceOf[ObservableObjectAdministration]
  
  @scala.inline
  def generateComputedPropConfig(propName: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("generateComputedPropConfig")(propName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def generateObservablePropConfig(propName: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("generateObservablePropConfig")(propName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def isObservableObject(thing: js.Any): /* is mobx.mobx/lib/types/observableobject.IObservableObject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservableObject")(thing.asInstanceOf[js.Any]).asInstanceOf[/* is mobx.mobx/lib/types/observableobject.IObservableObject */ Boolean]
  
  trait IIsObservableObject extends StObject {
    
    @JSName("$mobx")
    var $mobx: ObservableObjectAdministration
  }
  object IIsObservableObject {
    
    @scala.inline
    def apply($mobx: ObservableObjectAdministration): IIsObservableObject = {
      val __obj = js.Dynamic.literal($mobx = $mobx.asInstanceOf[js.Any])
      __obj.asInstanceOf[IIsObservableObject]
    }
    
    @scala.inline
    implicit class IIsObservableObjectMutableBuilder[Self <: IIsObservableObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$mobx(value: ObservableObjectAdministration): Self = StObject.set(x, "$mobx", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mobx.anon.Type[T]
    - typings.mobx.anon.OldValue[T]
    - typings.mobx.anon.NameObject[T]
  */
  trait IObjectDidChange[T] extends StObject
  object IObjectDidChange {
    
    @scala.inline
    def NameObject[T](name: PropertyKey, `object`: T, oldValue: js.Any): typings.mobx.anon.NameObject[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("remove")
      __obj.asInstanceOf[typings.mobx.anon.NameObject[T]]
    }
    
    @scala.inline
    def OldValue[T](name: PropertyKey, newValue: js.Any, `object`: T, oldValue: js.Any): typings.mobx.anon.OldValue[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("update")
      __obj.asInstanceOf[typings.mobx.anon.OldValue[T]]
    }
    
    @scala.inline
    def Type[T](name: PropertyKey, newValue: js.Any, `object`: T): typings.mobx.anon.Type[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("add")
      __obj.asInstanceOf[typings.mobx.anon.Type[T]]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mobx.anon.NameNewValue[T]
    - typings.mobx.anon.ObjectType[T]
  */
  trait IObjectWillChange[T] extends StObject
  object IObjectWillChange {
    
    @scala.inline
    def NameNewValue[T](name: PropertyKey, newValue: js.Any, `object`: T, `type`: update | add): typings.mobx.anon.NameNewValue[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mobx.anon.NameNewValue[T]]
    }
    
    @scala.inline
    def ObjectType[T](name: PropertyKey, `object`: T): typings.mobx.anon.ObjectType[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("remove")
      __obj.asInstanceOf[typings.mobx.anon.ObjectType[T]]
    }
  }
  
  trait IObservableObject extends StObject {
    
    var `observable-object`: IObservableObject
  }
  object IObservableObject {
    
    @scala.inline
    def apply(`observable-object`: IObservableObject): IObservableObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("observable-object")(`observable-object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IObservableObject]
    }
    
    @scala.inline
    implicit class IObservableObjectMutableBuilder[Self <: IObservableObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setObservable-object`(value: IObservableObject): Self = StObject.set(x, "observable-object", value.asInstanceOf[js.Any])
    }
  }
}
