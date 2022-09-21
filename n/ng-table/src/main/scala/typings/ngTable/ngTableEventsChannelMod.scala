package typings.ngTable

import typings.angular.mod.IRootScopeService
import typings.angular.mod.IScope
import typings.ngTable.ngTableParamsMod.NgTableParams
import typings.ngTable.pagingMod.IPageButton
import typings.ngTable.resultsMod.DataResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngTableEventsChannelMod {
  
  @JSImport("ng-table/src/core/ngTableEventsChannel", "NgTableEventsChannel")
  @js.native
  open class NgTableEventsChannel protected () extends StObject {
    def this($rootScope: IRootScopeService) = this()
    
    /* private */ @JSName("$rootScope")
    var $rootScope: Any = js.native
    
    /* private */ def addTableParamsEvent(eventName: Any, target: Any): Any = js.native
    
    /* private */ def createEventSubscriptionFn(eventName: Any): Any = js.native
    
    /* private */ def createPublishEventFn(eventName: Any): Any = js.native
    
    /**
      * Subscribe to receive notification whenever a new `NgTableParams` instance has finished being constructed.
      * Optionally supply an `eventFilter` to restrict which events that should trigger the `listener` to be called.
      *
      * @param listener the function that will be called when the event fires
      * @param eventFilter a predicate function that should return true to receive the event
      * @return a unregistration function that when called will unregister the `listener`
      */
    def onAfterCreated(listener: IAfterCreatedListener): IUnregistrationFunc = js.native
    def onAfterCreated(listener: IAfterCreatedListener, eventFilter: IEventSelectorFunc): IUnregistrationFunc = js.native
    /**
      * Subscribe to receive notification whenever a new `NgTableParams` instance has finished being constructed.
      * Optionally supply an `eventFilter` to restrict which events that should trigger the `listener` to be called. Supply a
      * `scope` to have angular automatically unregister the listener when the `scope` is destroyed.
      *
      * @param listener the function that will be called when the event fires
      * @param scope the angular `$scope` that will limit the lifetime of the event subscription
      * @param eventFilter a predicate function that should return true to receive the event
      * @return a unregistration function that when called will unregister the `listener`
      */
    def onAfterCreated(listener: IAfterCreatedListener, scope: IScope): IUnregistrationFunc = js.native
    def onAfterCreated(listener: IAfterCreatedListener, scope: IScope, eventFilter: IEventSelectorFunc): IUnregistrationFunc = js.native
    
    /**
      * Subscribe to receive notification whenever a `ngTableDefaultGetData` instance filters data
      * Optionally supply an `eventFilter` to restrict which events that should trigger the `listener` to be called.
      *
      * @param listener the function that will be called when the event fires
      * @param eventFilter either the specific `IDefaultGetData` instance you want to receive events for or a predicate function that should return true to receive the event
      * @return a unregistration function that when called will unregister the `listener`
      */
    def onAfterDataFiltered[T](listener: IAfterDataFilteredListener[T]): IUnregistrationFunc = js.native
    def onAfterDataFiltered[T](listener: IAfterDataFilteredListener[T], eventFilter: EventSelector[T]): IUnregistrationFunc = js.native
    /**
      * Subscribe to receive notification whenever a `ngTableDefaultGetData` instance filters data
      * Optionally supply an `eventFilter` to restrict which events that should trigger the `listener` to be called.
      *
      * @param listener the function that will be called when the event fires
      * @param scope the angular `$scope` that will limit the lifetime of the event subscription
      * @param eventFilter either the specific `IDefaultGetData` instance you want to receive events for or a predicate function that should return true to receive the event
      * @return a unregistration function that when called will unregister the `listener`
      */
    def onAfterDataFiltered[T](listener: IAfterDataFilteredListener[T], scope: IScope): IUnregistrationFunc = js.native
    def onAfterDataFiltered[T](listener: IAfterDataFilteredListener[T], scope: IScope, eventFilter: EventSelector[T]): IUnregistrationFunc = js.native
    
    /**
      * Subscribe to receive notification whenever a `ngTableDefaultGetData` instance orders data
      * Optionally supply an `eventFilter` to restrict which events that should trigger the `listener` to be called.
      *
      * @param listener the function that will be called when the event fires
      * @param eventFilter either the specific `IDefaultGetData` instance you want to receive events for or a predicate function that should return true to receive the event
      * @return a unregistration function that when called will unregister the `listener`
      */
    def onAfterDataSorted[T](listener: IAfterDataSortedListener[T]): IUnregistrationFunc = js.native
    def onAfterDataSorted[T](listener: IAfterDataSortedListener[T], eventFilter: EventSelector[T]): IUnregistrationFunc = js.native
    /**
      * Subscribe to receive notification whenever a `ngTableDefaultGetData` instance orders data
      * Optionally supply an `eventFilter` to restrict which events that should trigger the `listener` to be called.
      *
      * @param listener the function that will be called when the event fires
      * @param scope the angular `$scope` that will limit the lifetime of the event subscription
      * @param eventFilter either the specific `IDefaultGetData` instance you want to receive events for or a predicate function that should return true to receive the event
      * @return a unregistration function that when called will unregister the `listener`
      */
    def onAfterDataSorted[T](listener: IAfterDataSortedListener[T], scope: IScope): IUnregistrationFunc = js.native
    def onAfterDataSorted[T](listener: IAfterDataSortedListener[T], scope: IScope, eventFilter: EventSelector[T]): IUnregistrationFunc = js.native
    
    /**
      * Subscribe to receive notification whenever the `reload` method of an `NgTableParams` instance has successfully executed
      * Optionally supply an `eventFilter` to restrict which events that should trigger the `listener` to be called.
      *
      * @param listener the function that will be called when the event fires
      * @param eventFilter a predicate function that should return true to receive the event
      * @return a unregistration function that when called will unregister the `listener`
      */
    def onAfterReloadData[T](listener: IAfterReloadDataListener[T]): IUnregistrationFunc = js.native
    def onAfterReloadData[T](listener: IAfterReloadDataListener[T], eventFilter: EventSelector[T]): IUnregistrationFunc = js.native
    /**
      * Subscribe to receive notification whenever the `reload` method of an `NgTableParams` instance has successfully executed
      * Optionally supply an `eventFilter` to restrict which events that should trigger the `listener` to be called. Supply a
      * `scope` to have angular automatically unregister the listener when the `scope` is destroyed.
      *
      * @param listener the function that will be called when the event fires
      * @param scope the angular `$scope` that will limit the lifetime of the event subscription
      * @param eventFilter either the specific `NgTableParams` instance you want to receive events for or a predicate function that should return true to receive the event
      * @return a unregistration function that when called will unregister the `listener`
      */
    def onAfterReloadData[T](listener: IAfterReloadDataListener[T], scope: IScope): IUnregistrationFunc = js.native
    def onAfterReloadData[T](listener: IAfterReloadDataListener[T], scope: IScope, eventFilter: EventSelector[T]): IUnregistrationFunc = js.native
    
    /**
      * Subscribe to receive notification whenever a new data rows *array* is supplied as a `settings` value to a `NgTableParams` instance.
      * Optionally supply an `eventFilter` to restrict which events that should trigger the `listener` to be called.
      *
      * @param listener the function that will be called when the event fires
      * @param eventFilter either the specific `NgTableParams` instance you want to receive events for or a predicate function that should return true to receive the event
      * @return a unregistration function that when called will unregister the `listener`
      */
    def onDatasetChanged[T](listener: IDatasetChangedListener[T]): IUnregistrationFunc = js.native
    def onDatasetChanged[T](listener: IDatasetChangedListener[T], eventFilter: EventSelector[T]): IUnregistrationFunc = js.native
    /**
      * Subscribe to receive notification whenever a new data rows *array* is supplied as a `settings` value to a `NgTableParams` instance.
      * Optionally supply an `eventFilter` to restrict which events that should trigger the `listener` to be called. Supply a
      * `scope` to have angular automatically unregister the listener when the `scope` is destroyed.
      *
      * @param listener the function that will be called when the event fires
      * @param scope the angular `$scope` that will limit the lifetime of the event subscription
      * @param eventFilter either the specific `NgTableParams` instance you want to receive events for or a predicate function that should return true to receive the event
      * @return a unregistration function that when called will unregister the `listener`
      */
    def onDatasetChanged[T](listener: IDatasetChangedListener[T], scope: IScope): IUnregistrationFunc = js.native
    def onDatasetChanged[T](listener: IDatasetChangedListener[T], scope: IScope, eventFilter: EventSelector[T]): IUnregistrationFunc = js.native
    
    /**
      * Subscribe to receive notification whenever the paging buttons for an `NgTableParams` instance change
      * Optionally supply an `eventFilter` to restrict which events that should trigger the `listener` to be called.
      *
      * @param listener the function that will be called when the event fires
      * @param eventFilter either the specific `NgTableParams` instance you want to receive events for or a predicate function that should return true to receive the event
      * @return a unregistration function that when called will unregister the `listener`
      */
    def onPagesChanged[T](listener: IPagesChangedListener): IUnregistrationFunc = js.native
    def onPagesChanged[T](listener: IPagesChangedListener, eventFilter: EventSelector[T]): IUnregistrationFunc = js.native
    /**
      * Subscribe to receive notification whenever the paging buttons for an `NgTableParams` instance change
      * Optionally supply an `eventFilter` to restrict which events that should trigger the `listener` to be called. Supply a
      * `scope` to have angular automatically unregister the listener when the `scope` is destroyed.
      *
      * @param listener the function that will be called when the event fires
      * @param scope the angular `$scope` that will limit the lifetime of the event subscription
      * @param eventFilter either the specific `NgTableParams` instance you want to receive events for or a predicate function that should return true to receive the event
      * @return a unregistration function that when called will unregister the `listener`
      */
    def onPagesChanged[T](listener: IPagesChangedListener, scope: IScope): IUnregistrationFunc = js.native
    def onPagesChanged[T](listener: IPagesChangedListener, scope: IScope, eventFilter: EventSelector[T]): IUnregistrationFunc = js.native
    
    def publishAfterCreated[T](publisher: NgTableParams[T]): Unit = js.native
    
    def publishAfterDataFiltered[T](publisher: NgTableParams[T], newData: js.Array[T]): Unit = js.native
    
    def publishAfterDataSorted[T](params: NgTableParams[T], newData: js.Array[T]): Unit = js.native
    
    def publishAfterReloadData[T](publisher: NgTableParams[T], newData: js.Array[T], oldData: js.Array[T]): Unit = js.native
    
    def publishDatasetChanged[T](publisher: NgTableParams[T], newDataset: js.Array[T], oldDataset: js.Array[T]): Unit = js.native
    
    def publishPagesChanged[T](publisher: NgTableParams[T], newPages: js.Array[IPageButton], oldPages: js.Array[IPageButton]): Unit = js.native
  }
  /* static members */
  object NgTableEventsChannel {
    
    @JSImport("ng-table/src/core/ngTableEventsChannel", "NgTableEventsChannel")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ng-table/src/core/ngTableEventsChannel", "NgTableEventsChannel.$inject")
    @js.native
    def $inject: js.Array[String] = js.native
    inline def $inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  type EventSelector[T] = NgTableParams[T] | IEventSelectorFunc
  
  type IAfterCreatedListener = js.Function1[/* publisher */ NgTableParams[Any], Any]
  
  type IAfterDataFilteredListener[T] = js.Function2[/* publisher */ NgTableParams[T], /* newData */ js.Array[DataResult[T]], Any]
  
  type IAfterDataSortedListener[T] = js.Function2[/* publisher */ NgTableParams[T], /* newData */ js.Array[DataResult[T]], Any]
  
  type IAfterReloadDataListener[T] = js.Function3[
    /* publisher */ NgTableParams[T], 
    /* newData */ js.Array[DataResult[T]], 
    /* oldData */ js.Array[DataResult[T]], 
    Any
  ]
  
  type IDatasetChangedListener[T] = js.Function3[
    /* publisher */ NgTableParams[T], 
    /* newDataset */ js.Array[T], 
    /* oldDataset */ js.Array[T], 
    Any
  ]
  
  type IEventSelectorFunc = js.Function1[/* publisher */ NgTableParams[Any], Boolean]
  
  type IPagesChangedListener = js.Function3[
    /* publisher */ NgTableParams[Any], 
    /* newPages */ js.Array[IPageButton], 
    /* oldPages */ js.Array[IPageButton], 
    Any
  ]
  
  type IUnregistrationFunc = js.Function0[Unit]
}
