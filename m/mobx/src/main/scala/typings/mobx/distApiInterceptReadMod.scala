package typings.mobx

import typings.mobx.distInternalMod.ObservableMap
import typings.mobx.distInternalMod.ObservableSet
import typings.mobx.distTypesObservablearrayMod.IObservableArray
import typings.mobx.distTypesObservablevalueMod.IObservableValue
import typings.mobx.distUtilsUtilsMod.Lambda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distApiInterceptReadMod {
  
  @JSImport("mobx/dist/api/intercept-read", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def interceptReads(`object`: js.Object, property: String, handler: ReadInterceptor[Any]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptReads")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def interceptReads[T](observableArray: IObservableArray[T], handler: ReadInterceptor[T]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptReads")(observableArray.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def interceptReads[V](observableSet: ObservableSet[V], handler: ReadInterceptor[V]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptReads")(observableSet.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def interceptReads[T](value: IObservableValue[T], handler: ReadInterceptor[T]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptReads")(value.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def interceptReads[K, V](observableMap: ObservableMap[K, V], handler: ReadInterceptor[V]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptReads")(observableMap.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  type ReadInterceptor[T] = js.Function1[/* value */ Any, T]
}
