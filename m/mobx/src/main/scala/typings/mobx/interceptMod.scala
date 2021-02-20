package typings.mobx

import typings.mobx.interceptUtilsMod.IInterceptor
import typings.mobx.internalMod.ObservableMap
import typings.mobx.internalMod.ObservableSet
import typings.mobx.observablearrayMod.IArrayWillChange
import typings.mobx.observablearrayMod.IArrayWillSplice
import typings.mobx.observablearrayMod.IObservableArray
import typings.mobx.observablemapMod.IMapWillChange
import typings.mobx.observableobjectMod.IObjectWillChange
import typings.mobx.observablesetMod.ISetWillChange
import typings.mobx.observablevalueMod.IObservableValue
import typings.mobx.observablevalueMod.IValueWillChange
import typings.mobx.utilsMod.Lambda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interceptMod {
  
  @JSImport("mobx/lib/api/intercept", "intercept")
  @js.native
  def intercept(`object`: js.Object, handler: IInterceptor[IObjectWillChange[_]]): Lambda = js.native
  @JSImport("mobx/lib/api/intercept", "intercept")
  @js.native
  def intercept[T](
    observableArray: IObservableArray[T],
    handler: IInterceptor[IArrayWillChange[T] | IArrayWillSplice[T]]
  ): Lambda = js.native
  @JSImport("mobx/lib/api/intercept", "intercept")
  @js.native
  def intercept[V](observableMap: ObservableSet[V], handler: IInterceptor[ISetWillChange[V]]): Lambda = js.native
  @JSImport("mobx/lib/api/intercept", "intercept")
  @js.native
  def intercept[T](value: IObservableValue[T], handler: IInterceptor[IValueWillChange[T]]): Lambda = js.native
  @JSImport("mobx/lib/api/intercept", "intercept")
  @js.native
  def intercept[T /* <: js.Object */, K /* <: /* keyof T */ String */](`object`: T, property: K, handler: IInterceptor[IValueWillChange[_]]): Lambda = js.native
  @JSImport("mobx/lib/api/intercept", "intercept")
  @js.native
  def intercept[K, V](observableMap: ObservableMap[K, V], handler: IInterceptor[IMapWillChange[K, V]]): Lambda = js.native
  @JSImport("mobx/lib/api/intercept", "intercept")
  @js.native
  def intercept[K, V](observableMap: ObservableMap[K, V], property: K, handler: IInterceptor[IValueWillChange[V]]): Lambda = js.native
}
