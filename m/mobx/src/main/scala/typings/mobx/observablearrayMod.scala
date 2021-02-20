package typings.mobx

import typings.mobx.interceptUtilsMod.IInterceptor
import typings.mobx.mobxStrings.splice
import typings.mobx.mobxStrings.update
import typings.mobx.modifiersMod.IEnhancer
import typings.mobx.utilsMod.Lambda
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observablearrayMod {
  
  @JSImport("mobx/lib/types/observablearray", "createObservableArray")
  @js.native
  def createObservableArray[T](initialValues: js.UndefOr[scala.Nothing], enhancer: IEnhancer[T]): IObservableArray[T] = js.native
  @JSImport("mobx/lib/types/observablearray", "createObservableArray")
  @js.native
  def createObservableArray[T](
    initialValues: js.UndefOr[scala.Nothing],
    enhancer: IEnhancer[T],
    name: js.UndefOr[scala.Nothing],
    owned: Boolean
  ): IObservableArray[T] = js.native
  @JSImport("mobx/lib/types/observablearray", "createObservableArray")
  @js.native
  def createObservableArray[T](initialValues: js.UndefOr[scala.Nothing], enhancer: IEnhancer[T], name: String): IObservableArray[T] = js.native
  @JSImport("mobx/lib/types/observablearray", "createObservableArray")
  @js.native
  def createObservableArray[T](initialValues: js.UndefOr[scala.Nothing], enhancer: IEnhancer[T], name: String, owned: Boolean): IObservableArray[T] = js.native
  @JSImport("mobx/lib/types/observablearray", "createObservableArray")
  @js.native
  def createObservableArray[T](initialValues: js.Array[_], enhancer: IEnhancer[T]): IObservableArray[T] = js.native
  @JSImport("mobx/lib/types/observablearray", "createObservableArray")
  @js.native
  def createObservableArray[T](
    initialValues: js.Array[_],
    enhancer: IEnhancer[T],
    name: js.UndefOr[scala.Nothing],
    owned: Boolean
  ): IObservableArray[T] = js.native
  @JSImport("mobx/lib/types/observablearray", "createObservableArray")
  @js.native
  def createObservableArray[T](initialValues: js.Array[_], enhancer: IEnhancer[T], name: String): IObservableArray[T] = js.native
  @JSImport("mobx/lib/types/observablearray", "createObservableArray")
  @js.native
  def createObservableArray[T](initialValues: js.Array[_], enhancer: IEnhancer[T], name: String, owned: Boolean): IObservableArray[T] = js.native
  
  @JSImport("mobx/lib/types/observablearray", "isObservableArray")
  @js.native
  def isObservableArray(thing: js.Any): /* is mobx.mobx/lib/types/observablearray.IObservableArray<any> */ Boolean = js.native
  
  @js.native
  trait IArrayChange[T] extends StObject {
    
    var index: Double = js.native
    
    var newValue: T = js.native
    
    var `object`: IObservableArray[T] = js.native
    
    var oldValue: T = js.native
    
    var `type`: update = js.native
  }
  object IArrayChange {
    
    @scala.inline
    def apply[T](index: Double, newValue: T, `object`: IObservableArray[T], oldValue: T, `type`: update): IArrayChange[T] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IArrayChange[T]]
    }
    
    @scala.inline
    implicit class IArrayChangeMutableBuilder[Self <: IArrayChange[_], T] (val x: Self with IArrayChange[T]) extends AnyVal {
      
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
  
  @js.native
  trait IArraySplice[T] extends StObject {
    
    var added: js.Array[T] = js.native
    
    var addedCount: Double = js.native
    
    var index: Double = js.native
    
    var `object`: IObservableArray[T] = js.native
    
    var removed: js.Array[T] = js.native
    
    var removedCount: Double = js.native
    
    var `type`: splice = js.native
  }
  object IArraySplice {
    
    @scala.inline
    def apply[T](
      added: js.Array[T],
      addedCount: Double,
      index: Double,
      `object`: IObservableArray[T],
      removed: js.Array[T],
      removedCount: Double,
      `type`: splice
    ): IArraySplice[T] = {
      val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], addedCount = addedCount.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any], removedCount = removedCount.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IArraySplice[T]]
    }
    
    @scala.inline
    implicit class IArraySpliceMutableBuilder[Self <: IArraySplice[_], T] (val x: Self with IArraySplice[T]) extends AnyVal {
      
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
  
  @js.native
  trait IArrayWillChange[T] extends StObject {
    
    var index: Double = js.native
    
    var newValue: T = js.native
    
    var `object`: IObservableArray[T] = js.native
    
    var `type`: update = js.native
  }
  object IArrayWillChange {
    
    @scala.inline
    def apply[T](index: Double, newValue: T, `object`: IObservableArray[T], `type`: update): IArrayWillChange[T] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IArrayWillChange[T]]
    }
    
    @scala.inline
    implicit class IArrayWillChangeMutableBuilder[Self <: IArrayWillChange[_], T] (val x: Self with IArrayWillChange[T]) extends AnyVal {
      
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
  
  @js.native
  trait IArrayWillSplice[T] extends StObject {
    
    var added: js.Array[T] = js.native
    
    var index: Double = js.native
    
    var `object`: IObservableArray[T] = js.native
    
    var removedCount: Double = js.native
    
    var `type`: splice = js.native
  }
  object IArrayWillSplice {
    
    @scala.inline
    def apply[T](
      added: js.Array[T],
      index: Double,
      `object`: IObservableArray[T],
      removedCount: Double,
      `type`: splice
    ): IArrayWillSplice[T] = {
      val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], removedCount = removedCount.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IArrayWillSplice[T]]
    }
    
    @scala.inline
    implicit class IArrayWillSpliceMutableBuilder[Self <: IArrayWillSplice[_], T] (val x: Self with IArrayWillSplice[T]) extends AnyVal {
      
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
  trait IObservableArray[T] extends Array[T] {
    
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
    def spliceWithArray(index: Double, deleteCount: js.UndefOr[scala.Nothing], newItems: js.Array[T]): js.Array[T] = js.native
    def spliceWithArray(index: Double, deleteCount: Double): js.Array[T] = js.native
    def spliceWithArray(index: Double, deleteCount: Double, newItems: js.Array[T]): js.Array[T] = js.native
    
    def toJS(): js.Array[T] = js.native
    
    def toJSON(): js.Array[T] = js.native
  }
}
