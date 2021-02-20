package typings.mobx

import typings.mobx.atomMod.IAtom
import typings.mobx.computedvalueMod.IComputedValueOptions
import typings.mobx.interceptUtilsMod.IInterceptable
import typings.mobx.internalMod.ComputedValue
import typings.mobx.internalMod.ObservableValue
import typings.mobx.listenUtilsMod.IListenable
import typings.mobx.mobxStrings.add
import typings.mobx.mobxStrings.remove
import typings.mobx.mobxStrings.update
import typings.mobx.modifiersMod.IEnhancer
import typings.mobx.utilsMod.Lambda
import typings.std.Map
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableobjectMod {
  
  @JSImport("mobx/lib/types/observableobject", "ObservableObjectAdministration")
  @js.native
  class ObservableObjectAdministration protected ()
    extends IInterceptable[IObjectWillChange[js.Any]]
       with IListenable {
    def this(
      target: js.Any,
      values: Map[String | Double | js.Symbol, ObservableValue[_] | ComputedValue[_]],
      name: String,
      defaultEnhancer: IEnhancer[_]
    ) = this()
    
    def addComputedProp(
      propertyOwner: js.Any,
      // where is the property declared?
    propName: PropertyKey,
      options: IComputedValueOptions[_]
    ): Unit = js.native
    
    def addObservableProp(propName: PropertyKey, newValue: js.Any): Unit = js.native
    def addObservableProp(propName: PropertyKey, newValue: js.Any, enhancer: IEnhancer[_]): Unit = js.native
    
    def defaultEnhancer(newValue: js.Any, oldValue: js.UndefOr[scala.Nothing], name: String): js.Any = js.native
    def defaultEnhancer(newValue: js.Any, oldValue: js.Any, name: String): js.Any = js.native
    @JSName("defaultEnhancer")
    var defaultEnhancer_Original: IEnhancer[_] = js.native
    
    def getKeys(): js.Array[PropertyKey] = js.native
    
    def has(key: PropertyKey): js.Any = js.native
    
    def illegalAccess(owner: js.Any, propName: js.Any): Unit = js.native
    
    def intercept(handler: js.Any): Lambda = js.native
    
    var keysAtom: IAtom = js.native
    
    var name: String = js.native
    
    def notifyPropertyAddition(key: PropertyKey, newValue: js.Any): Unit = js.native
    
    /**
      * Observes this object. Triggers for the events 'add', 'update' and 'delete'.
      * See: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/observe
      * for callback details
      */
    def observe(callback: js.Function1[/* changes */ IObjectDidChange[_], Unit]): Lambda = js.native
    def observe(callback: js.Function1[/* changes */ IObjectDidChange[_], Unit], fireImmediately: Boolean): Lambda = js.native
    
    var pendingKeys: js.Any = js.native
    
    var proxy: js.Any = js.native
    
    def read(key: PropertyKey): js.Any = js.native
    
    def remove(key: PropertyKey): Unit = js.native
    
    var target: js.Any = js.native
    
    var values: Map[String | Double | js.Symbol, ObservableValue[_] | ComputedValue[_]] = js.native
    
    def write(key: PropertyKey, newValue: js.Any): Unit = js.native
  }
  
  @JSImport("mobx/lib/types/observableobject", "asObservableObject")
  @js.native
  def asObservableObject(target: js.Any): ObservableObjectAdministration = js.native
  @JSImport("mobx/lib/types/observableobject", "asObservableObject")
  @js.native
  def asObservableObject(target: js.Any, name: js.UndefOr[PropertyKey], defaultEnhancer: IEnhancer[_]): ObservableObjectAdministration = js.native
  @JSImport("mobx/lib/types/observableobject", "asObservableObject")
  @js.native
  def asObservableObject(target: js.Any, name: PropertyKey): ObservableObjectAdministration = js.native
  
  @JSImport("mobx/lib/types/observableobject", "generateComputedPropConfig")
  @js.native
  def generateComputedPropConfig(propName: js.Any): js.Any = js.native
  
  @JSImport("mobx/lib/types/observableobject", "generateObservablePropConfig")
  @js.native
  def generateObservablePropConfig(propName: js.Any): js.Any = js.native
  
  @JSImport("mobx/lib/types/observableobject", "isObservableObject")
  @js.native
  def isObservableObject(thing: js.Any): /* is mobx.mobx/lib/types/observableobject.IObservableObject */ Boolean = js.native
  
  @js.native
  trait IIsObservableObject extends StObject {
    
    @JSName("$mobx")
    var $mobx: ObservableObjectAdministration = js.native
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
    def NameObject[T](name: PropertyKey, `object`: T, oldValue: js.Any, `type`: remove): typings.mobx.anon.NameObject[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mobx.anon.NameObject[T]]
    }
    
    @scala.inline
    def OldValue[T](name: PropertyKey, newValue: js.Any, `object`: T, oldValue: js.Any, `type`: update): typings.mobx.anon.OldValue[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mobx.anon.OldValue[T]]
    }
    
    @scala.inline
    def Type[T](name: PropertyKey, newValue: js.Any, `object`: T, `type`: add): typings.mobx.anon.Type[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
    def ObjectType[T](name: PropertyKey, `object`: T, `type`: remove): typings.mobx.anon.ObjectType[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mobx.anon.ObjectType[T]]
    }
  }
  
  @js.native
  trait IObservableObject extends StObject {
    
    var `observable-object`: IObservableObject = js.native
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
