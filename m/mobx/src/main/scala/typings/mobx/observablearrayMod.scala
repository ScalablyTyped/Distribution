package typings.mobx

import typings.mobx.interceptUtilsMod.IInterceptor
import typings.mobx.mobxStrings.splice
import typings.mobx.mobxStrings.update
import typings.mobx.modifiersMod.IEnhancer
import typings.mobx.utilsMod.Lambda
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observablearrayMod {
  
  @JSImport("mobx/lib/types/observablearray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createObservableArray[T](initialValues: js.Array[js.Any], enhancer: IEnhancer[T]): IObservableArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createObservableArray")(initialValues.asInstanceOf[js.Any], enhancer.asInstanceOf[js.Any])).asInstanceOf[IObservableArray[T]]
  @scala.inline
  def createObservableArray[T](initialValues: js.Array[js.Any], enhancer: IEnhancer[T], name: String): IObservableArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createObservableArray")(initialValues.asInstanceOf[js.Any], enhancer.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[IObservableArray[T]]
  @scala.inline
  def createObservableArray[T](initialValues: js.Array[js.Any], enhancer: IEnhancer[T], name: String, owned: Boolean): IObservableArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createObservableArray")(initialValues.asInstanceOf[js.Any], enhancer.asInstanceOf[js.Any], name.asInstanceOf[js.Any], owned.asInstanceOf[js.Any])).asInstanceOf[IObservableArray[T]]
  @scala.inline
  def createObservableArray[T](initialValues: js.Array[js.Any], enhancer: IEnhancer[T], name: Unit, owned: Boolean): IObservableArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createObservableArray")(initialValues.asInstanceOf[js.Any], enhancer.asInstanceOf[js.Any], name.asInstanceOf[js.Any], owned.asInstanceOf[js.Any])).asInstanceOf[IObservableArray[T]]
  @scala.inline
  def createObservableArray[T](initialValues: Unit, enhancer: IEnhancer[T]): IObservableArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createObservableArray")(initialValues.asInstanceOf[js.Any], enhancer.asInstanceOf[js.Any])).asInstanceOf[IObservableArray[T]]
  @scala.inline
  def createObservableArray[T](initialValues: Unit, enhancer: IEnhancer[T], name: String): IObservableArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createObservableArray")(initialValues.asInstanceOf[js.Any], enhancer.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[IObservableArray[T]]
  @scala.inline
  def createObservableArray[T](initialValues: Unit, enhancer: IEnhancer[T], name: String, owned: Boolean): IObservableArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createObservableArray")(initialValues.asInstanceOf[js.Any], enhancer.asInstanceOf[js.Any], name.asInstanceOf[js.Any], owned.asInstanceOf[js.Any])).asInstanceOf[IObservableArray[T]]
  @scala.inline
  def createObservableArray[T](initialValues: Unit, enhancer: IEnhancer[T], name: Unit, owned: Boolean): IObservableArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createObservableArray")(initialValues.asInstanceOf[js.Any], enhancer.asInstanceOf[js.Any], name.asInstanceOf[js.Any], owned.asInstanceOf[js.Any])).asInstanceOf[IObservableArray[T]]
  
  @scala.inline
  def isObservableArray(thing: js.Any): /* is mobx.mobx/lib/types/observablearray.IObservableArray<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservableArray")(thing.asInstanceOf[js.Any]).asInstanceOf[/* is mobx.mobx/lib/types/observablearray.IObservableArray<any> */ Boolean]
  
  trait IArrayChange[T] extends StObject {
    
    var index: Double
    
    var newValue: T
    
    var `object`: IObservableArray[T]
    
    var oldValue: T
    
    var `type`: update
  }
  object IArrayChange {
    
    @scala.inline
    def apply[T](index: Double, newValue: T, `object`: IObservableArray[T], oldValue: T): IArrayChange[T] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("update")
      __obj.asInstanceOf[IArrayChange[T]]
    }
    
    @scala.inline
    implicit class IArrayChangeMutableBuilder[Self <: IArrayChange[?], T] (val x: Self & IArrayChange[T]) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewValue(value: T): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: IObservableArray[T]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldValue(value: T): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: update): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IArraySplice[T] extends StObject {
    
    var added: js.Array[T]
    
    var addedCount: Double
    
    var index: Double
    
    var `object`: IObservableArray[T]
    
    var removed: js.Array[T]
    
    var removedCount: Double
    
    var `type`: splice
  }
  object IArraySplice {
    
    @scala.inline
    def apply[T](
      added: js.Array[T],
      addedCount: Double,
      index: Double,
      `object`: IObservableArray[T],
      removed: js.Array[T],
      removedCount: Double
    ): IArraySplice[T] = {
      val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], addedCount = addedCount.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any], removedCount = removedCount.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("splice")
      __obj.asInstanceOf[IArraySplice[T]]
    }
    
    @scala.inline
    implicit class IArraySpliceMutableBuilder[Self <: IArraySplice[?], T] (val x: Self & IArraySplice[T]) extends AnyVal {
      
      @scala.inline
      def setAdded(value: js.Array[T]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddedCount(value: Double): Self = StObject.set(x, "addedCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddedVarargs(value: T*): Self = StObject.set(x, "added", js.Array(value :_*))
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: IObservableArray[T]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoved(value: js.Array[T]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemovedCount(value: Double): Self = StObject.set(x, "removedCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemovedVarargs(value: T*): Self = StObject.set(x, "removed", js.Array(value :_*))
      
      @scala.inline
      def setType(value: splice): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IArrayWillChange[T] extends StObject {
    
    var index: Double
    
    var newValue: T
    
    var `object`: IObservableArray[T]
    
    var `type`: update
  }
  object IArrayWillChange {
    
    @scala.inline
    def apply[T](index: Double, newValue: T, `object`: IObservableArray[T]): IArrayWillChange[T] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("update")
      __obj.asInstanceOf[IArrayWillChange[T]]
    }
    
    @scala.inline
    implicit class IArrayWillChangeMutableBuilder[Self <: IArrayWillChange[?], T] (val x: Self & IArrayWillChange[T]) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewValue(value: T): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: IObservableArray[T]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: update): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IArrayWillSplice[T] extends StObject {
    
    var added: js.Array[T]
    
    var index: Double
    
    var `object`: IObservableArray[T]
    
    var removedCount: Double
    
    var `type`: splice
  }
  object IArrayWillSplice {
    
    @scala.inline
    def apply[T](added: js.Array[T], index: Double, `object`: IObservableArray[T], removedCount: Double): IArrayWillSplice[T] = {
      val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], removedCount = removedCount.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("splice")
      __obj.asInstanceOf[IArrayWillSplice[T]]
    }
    
    @scala.inline
    implicit class IArrayWillSpliceMutableBuilder[Self <: IArrayWillSplice[?], T] (val x: Self & IArrayWillSplice[T]) extends AnyVal {
      
      @scala.inline
      def setAdded(value: js.Array[T]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddedVarargs(value: T*): Self = StObject.set(x, "added", js.Array(value :_*))
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: IObservableArray[T]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemovedCount(value: Double): Self = StObject.set(x, "removedCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: splice): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IObservableArray[T]
    extends StObject
       with Array[T] {
    
    def clear(): js.Array[T] = js.native
    
    def intercept(handler: IInterceptor[IArrayWillChange[T] | IArrayWillSplice[T]]): Lambda = js.native
    
    def observe(listener: js.Function1[/* changeData */ IArrayChange[T] | IArraySplice[T], Unit]): Lambda = js.native
    def observe(
      listener: js.Function1[/* changeData */ IArrayChange[T] | IArraySplice[T], Unit],
      fireImmediately: Boolean
    ): Lambda = js.native
    
    def remove(value: T): Boolean = js.native
    
    def replace(newItems: js.Array[T]): js.Array[T] = js.native
    
    def spliceWithArray(index: Double): js.Array[T] = js.native
    def spliceWithArray(index: Double, deleteCount: Double): js.Array[T] = js.native
    def spliceWithArray(index: Double, deleteCount: Double, newItems: js.Array[T]): js.Array[T] = js.native
    def spliceWithArray(index: Double, deleteCount: Unit, newItems: js.Array[T]): js.Array[T] = js.native
    
    def toJS(): js.Array[T] = js.native
    
    def toJSON(): js.Array[T] = js.native
  }
}
