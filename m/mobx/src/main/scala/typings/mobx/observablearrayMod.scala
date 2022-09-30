package typings.mobx

import typings.mobx.atomMod.IAtom
import typings.mobx.interceptUtilsMod.IInterceptable
import typings.mobx.interceptUtilsMod.IInterceptor
import typings.mobx.listenUtilsMod.IListenable
import typings.mobx.mobxStrings.array
import typings.mobx.mobxStrings.splice
import typings.mobx.mobxStrings.update
import typings.mobx.modifiersMod.IEnhancer
import typings.mobx.utilsMod.Lambda
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observablearrayMod {
  
  @JSImport("mobx/dist/types/observablearray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mobx/dist/types/observablearray", "MAX_SPLICE_SIZE")
  @js.native
  val MAX_SPLICE_SIZE: /* 10000 */ Double = js.native
  
  @JSImport("mobx/dist/types/observablearray", "ObservableArrayAdministration")
  @js.native
  open class ObservableArrayAdministration protected ()
    extends StObject
       with IInterceptable[IArrayWillChange[Any] | IArrayWillSplice[Any]]
       with IListenable {
    def this(name: String, enhancer: IEnhancer[Any], owned_ : Boolean, legacyMode_ : Boolean) = this()
    def this(name: Unit, enhancer: IEnhancer[Any], owned_ : Boolean, legacyMode_ : Boolean) = this()
    
    var atom_ : IAtom = js.native
    
    def dehanceValue_(value: Any): Any = js.native
    
    def dehanceValues_(values: js.Array[Any]): js.Array[Any] = js.native
    
    var dehancer: Any = js.native
    
    def enhancer_(newV: Any): Any = js.native
    def enhancer_(newV: Any, oldV: Any): Any = js.native
    
    def getArrayLength_(): Double = js.native
    
    def get_(index: Double): js.UndefOr[Any] = js.native
    
    def intercept_(handler: IInterceptor[IArrayWillChange[Any] | IArrayWillSplice[Any]]): Lambda = js.native
    
    var lastKnownLength_ : Double = js.native
    
    var legacyMode_ : Boolean = js.native
    
    def notifyArrayChildUpdate_(index: Double, newValue: Any, oldValue: Any): Unit = js.native
    
    def notifyArraySplice_(index: Double, added: js.Array[Any], removed: js.Array[Any]): Unit = js.native
    
    def observe_(listener: js.Function1[/* changeData */ IArrayDidChange[Any], Unit]): Lambda = js.native
    def observe_(listener: js.Function1[/* changeData */ IArrayDidChange[Any], Unit], fireImmediately: Boolean): Lambda = js.native
    
    var owned_ : Boolean = js.native
    
    var proxy_ : IObservableArray[Any] = js.native
    
    def setArrayLength_(newLength: Double): Unit = js.native
    
    def set_(index: Double, newValue: Any): Unit = js.native
    
    def spliceItemsIntoValues_(index: Double, deleteCount: Double, newItems: js.Array[Any]): js.Array[Any] = js.native
    
    def spliceWithArray_(index: Double): js.Array[Any] = js.native
    def spliceWithArray_(index: Double, deleteCount: Double): js.Array[Any] = js.native
    def spliceWithArray_(index: Double, deleteCount: Double, newItems: js.Array[Any]): js.Array[Any] = js.native
    def spliceWithArray_(index: Double, deleteCount: Unit, newItems: js.Array[Any]): js.Array[Any] = js.native
    
    def updateArrayLength_(oldLength: Double, delta: Double): Unit = js.native
    
    val values_ : js.Array[Any] = js.native
  }
  
  @JSImport("mobx/dist/types/observablearray", "UPDATE")
  @js.native
  val UPDATE: /* "update" */ String = js.native
  
  object arrayExtensions {
    
    @JSImport("mobx/dist/types/observablearray", "arrayExtensions")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clear(): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[js.Array[Any]]
    
    inline def pop(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")().asInstanceOf[Any]
    
    inline def push(items: Any*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Double]
    
    inline def remove(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def replace(newItems: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(newItems.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    
    inline def reverse(): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")().asInstanceOf[js.Array[Any]]
    
    inline def shift(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")().asInstanceOf[Any]
    
    inline def sort(): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")().asInstanceOf[js.Array[Any]]
    
    inline def splice(index: Double, deleteCount: Double, newItems: Any*): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")((scala.List(index.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any])).`++`(newItems.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Array[Any]]
    inline def splice(index: Double, deleteCount: Unit, newItems: Any*): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")((scala.List(index.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any])).`++`(newItems.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Array[Any]]
    
    inline def spliceWithArray(index: Double): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("spliceWithArray")(index.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    inline def spliceWithArray(index: Double, deleteCount: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("spliceWithArray")(index.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def spliceWithArray(index: Double, deleteCount: Double, newItems: js.Array[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("spliceWithArray")(index.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any], newItems.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def spliceWithArray(index: Double, deleteCount: Unit, newItems: js.Array[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("spliceWithArray")(index.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any], newItems.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    inline def toJSON(): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")().asInstanceOf[js.Array[Any]]
    
    inline def unshift(items: Any*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unshift")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Double]
  }
  
  inline def createObservableArray[T](initialValues: js.Array[T], enhancer: IEnhancer[T]): IObservableArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createObservableArray")(initialValues.asInstanceOf[js.Any], enhancer.asInstanceOf[js.Any])).asInstanceOf[IObservableArray[T]]
  inline def createObservableArray[T](initialValues: js.Array[T], enhancer: IEnhancer[T], name: String): IObservableArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createObservableArray")(initialValues.asInstanceOf[js.Any], enhancer.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[IObservableArray[T]]
  inline def createObservableArray[T](initialValues: js.Array[T], enhancer: IEnhancer[T], name: String, owned: Boolean): IObservableArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createObservableArray")(initialValues.asInstanceOf[js.Any], enhancer.asInstanceOf[js.Any], name.asInstanceOf[js.Any], owned.asInstanceOf[js.Any])).asInstanceOf[IObservableArray[T]]
  inline def createObservableArray[T](initialValues: js.Array[T], enhancer: IEnhancer[T], name: Unit, owned: Boolean): IObservableArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createObservableArray")(initialValues.asInstanceOf[js.Any], enhancer.asInstanceOf[js.Any], name.asInstanceOf[js.Any], owned.asInstanceOf[js.Any])).asInstanceOf[IObservableArray[T]]
  inline def createObservableArray[T](initialValues: Unit, enhancer: IEnhancer[T]): IObservableArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createObservableArray")(initialValues.asInstanceOf[js.Any], enhancer.asInstanceOf[js.Any])).asInstanceOf[IObservableArray[T]]
  inline def createObservableArray[T](initialValues: Unit, enhancer: IEnhancer[T], name: String): IObservableArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createObservableArray")(initialValues.asInstanceOf[js.Any], enhancer.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[IObservableArray[T]]
  inline def createObservableArray[T](initialValues: Unit, enhancer: IEnhancer[T], name: String, owned: Boolean): IObservableArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createObservableArray")(initialValues.asInstanceOf[js.Any], enhancer.asInstanceOf[js.Any], name.asInstanceOf[js.Any], owned.asInstanceOf[js.Any])).asInstanceOf[IObservableArray[T]]
  inline def createObservableArray[T](initialValues: Unit, enhancer: IEnhancer[T], name: Unit, owned: Boolean): IObservableArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createObservableArray")(initialValues.asInstanceOf[js.Any], enhancer.asInstanceOf[js.Any], name.asInstanceOf[js.Any], owned.asInstanceOf[js.Any])).asInstanceOf[IObservableArray[T]]
  
  inline def isObservableArray(thing: Any): /* is mobx.mobx/dist/types/observablearray.IObservableArray<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservableArray")(thing.asInstanceOf[js.Any]).asInstanceOf[/* is mobx.mobx/dist/types/observablearray.IObservableArray<any> */ Boolean]
  
  trait IArrayBaseChange[T] extends StObject {
    
    var debugObjectName: String
    
    var index: Double
    
    var `object`: IObservableArray[T]
    
    var observableKind: array
  }
  object IArrayBaseChange {
    
    inline def apply[T](debugObjectName: String, index: Double, `object`: IObservableArray[T]): IArrayBaseChange[T] = {
      val __obj = js.Dynamic.literal(debugObjectName = debugObjectName.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], observableKind = "array")
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IArrayBaseChange[T]]
    }
    
    extension [Self <: IArrayBaseChange[?], T](x: Self & IArrayBaseChange[T]) {
      
      inline def setDebugObjectName(value: String): Self = StObject.set(x, "debugObjectName", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setObject(value: IObservableArray[T]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObservableKind(value: array): Self = StObject.set(x, "observableKind", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mobx.observablearrayMod.IArrayUpdate[T]
    - typings.mobx.observablearrayMod.IArraySplice[T]
  */
  trait IArrayDidChange[T] extends StObject
  object IArrayDidChange {
    
    inline def IArraySplice[T](
      added: js.Array[T],
      addedCount: Double,
      debugObjectName: String,
      index: Double,
      `object`: IObservableArray[T],
      removed: js.Array[T],
      removedCount: Double
    ): typings.mobx.observablearrayMod.IArraySplice[T] = {
      val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], addedCount = addedCount.asInstanceOf[js.Any], debugObjectName = debugObjectName.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], observableKind = "array", removed = removed.asInstanceOf[js.Any], removedCount = removedCount.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("splice")
      __obj.asInstanceOf[typings.mobx.observablearrayMod.IArraySplice[T]]
    }
    
    inline def IArrayUpdate[T](debugObjectName: String, index: Double, newValue: T, `object`: IObservableArray[T], oldValue: T): typings.mobx.observablearrayMod.IArrayUpdate[T] = {
      val __obj = js.Dynamic.literal(debugObjectName = debugObjectName.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], observableKind = "array", oldValue = oldValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("update")
      __obj.asInstanceOf[typings.mobx.observablearrayMod.IArrayUpdate[T]]
    }
  }
  
  trait IArraySplice[T]
    extends StObject
       with IArrayBaseChange[T]
       with IArrayDidChange[T] {
    
    var added: js.Array[T]
    
    var addedCount: Double
    
    var removed: js.Array[T]
    
    var removedCount: Double
    
    var `type`: splice
  }
  object IArraySplice {
    
    inline def apply[T](
      added: js.Array[T],
      addedCount: Double,
      debugObjectName: String,
      index: Double,
      `object`: IObservableArray[T],
      removed: js.Array[T],
      removedCount: Double
    ): IArraySplice[T] = {
      val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], addedCount = addedCount.asInstanceOf[js.Any], debugObjectName = debugObjectName.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], observableKind = "array", removed = removed.asInstanceOf[js.Any], removedCount = removedCount.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("splice")
      __obj.asInstanceOf[IArraySplice[T]]
    }
    
    extension [Self <: IArraySplice[?], T](x: Self & IArraySplice[T]) {
      
      inline def setAdded(value: js.Array[T]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
      
      inline def setAddedCount(value: Double): Self = StObject.set(x, "addedCount", value.asInstanceOf[js.Any])
      
      inline def setAddedVarargs(value: T*): Self = StObject.set(x, "added", js.Array(value*))
      
      inline def setRemoved(value: js.Array[T]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
      
      inline def setRemovedCount(value: Double): Self = StObject.set(x, "removedCount", value.asInstanceOf[js.Any])
      
      inline def setRemovedVarargs(value: T*): Self = StObject.set(x, "removed", js.Array(value*))
      
      inline def setType(value: splice): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IArrayUpdate[T]
    extends StObject
       with IArrayBaseChange[T]
       with IArrayDidChange[T] {
    
    var newValue: T
    
    var oldValue: T
    
    var `type`: update
  }
  object IArrayUpdate {
    
    inline def apply[T](debugObjectName: String, index: Double, newValue: T, `object`: IObservableArray[T], oldValue: T): IArrayUpdate[T] = {
      val __obj = js.Dynamic.literal(debugObjectName = debugObjectName.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], observableKind = "array", oldValue = oldValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("update")
      __obj.asInstanceOf[IArrayUpdate[T]]
    }
    
    extension [Self <: IArrayUpdate[?], T](x: Self & IArrayUpdate[T]) {
      
      inline def setNewValue(value: T): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setOldValue(value: T): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      inline def setType(value: update): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IArrayWillChange[T] extends StObject {
    
    var index: Double
    
    var newValue: T
    
    var `object`: IObservableArray[T]
    
    var `type`: update
  }
  object IArrayWillChange {
    
    inline def apply[T](index: Double, newValue: T, `object`: IObservableArray[T]): IArrayWillChange[T] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("update")
      __obj.asInstanceOf[IArrayWillChange[T]]
    }
    
    extension [Self <: IArrayWillChange[?], T](x: Self & IArrayWillChange[T]) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setNewValue(value: T): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setObject(value: IObservableArray[T]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setType(value: update): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    inline def apply[T](added: js.Array[T], index: Double, `object`: IObservableArray[T], removedCount: Double): IArrayWillSplice[T] = {
      val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], removedCount = removedCount.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("splice")
      __obj.asInstanceOf[IArrayWillSplice[T]]
    }
    
    extension [Self <: IArrayWillSplice[?], T](x: Self & IArrayWillSplice[T]) {
      
      inline def setAdded(value: js.Array[T]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
      
      inline def setAddedVarargs(value: T*): Self = StObject.set(x, "added", js.Array(value*))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setObject(value: IObservableArray[T]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setRemovedCount(value: Double): Self = StObject.set(x, "removedCount", value.asInstanceOf[js.Any])
      
      inline def setType(value: splice): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IObservableArray[T]
    extends StObject
       with Array[T] {
    
    def clear(): js.Array[T] = js.native
    
    def remove(value: T): Boolean = js.native
    
    def replace(newItems: js.Array[T]): js.Array[T] = js.native
    
    def spliceWithArray(index: Double): js.Array[T] = js.native
    def spliceWithArray(index: Double, deleteCount: Double): js.Array[T] = js.native
    def spliceWithArray(index: Double, deleteCount: Double, newItems: js.Array[T]): js.Array[T] = js.native
    def spliceWithArray(index: Double, deleteCount: Unit, newItems: js.Array[T]): js.Array[T] = js.native
    
    def toJSON(): js.Array[T] = js.native
  }
}
