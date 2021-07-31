package typings.mobx

import typings.mobx.internalMod.ObservableMap
import typings.mobx.internalMod.ObservableSet
import typings.mobx.observablearrayMod.IObservableArray
import typings.mobx.observablevalueMod.IObservableValue
import typings.mobx.utilsMod.Lambda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interceptReadMod {
  
  @JSImport("mobx/lib/api/intercept-read", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def interceptReads(`object`: js.Object, property: String, handler: ReadInterceptor[js.Any]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptReads")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def interceptReads[T](observableArray: IObservableArray[T], handler: ReadInterceptor[T]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptReads")(observableArray.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def interceptReads[V](observableSet: ObservableSet[V], handler: ReadInterceptor[V]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptReads")(observableSet.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def interceptReads[T](value: IObservableValue[T], handler: ReadInterceptor[T]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptReads")(value.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  @scala.inline
  def interceptReads[K, V](observableMap: ObservableMap[K, V], handler: ReadInterceptor[V]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptReads")(observableMap.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  type ReadInterceptor[T] = js.Function1[/* value */ js.Any, T]
}
