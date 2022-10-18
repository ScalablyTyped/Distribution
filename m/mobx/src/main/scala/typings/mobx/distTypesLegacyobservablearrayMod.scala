package typings.mobx

import typings.mobx.distTypesModifiersMod.IEnhancer
import typings.mobx.distTypesObservablearrayMod.IObservableArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLegacyobservablearrayMod {
  
  @JSImport("mobx/dist/types/legacyobservablearray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createLegacyArray[T](initialValues: js.Array[T], enhancer: IEnhancer[T]): IObservableArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLegacyArray")(initialValues.asInstanceOf[js.Any], enhancer.asInstanceOf[js.Any])).asInstanceOf[IObservableArray[T]]
  inline def createLegacyArray[T](initialValues: js.Array[T], enhancer: IEnhancer[T], name: String): IObservableArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLegacyArray")(initialValues.asInstanceOf[js.Any], enhancer.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[IObservableArray[T]]
  inline def createLegacyArray[T](initialValues: Unit, enhancer: IEnhancer[T]): IObservableArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLegacyArray")(initialValues.asInstanceOf[js.Any], enhancer.asInstanceOf[js.Any])).asInstanceOf[IObservableArray[T]]
  inline def createLegacyArray[T](initialValues: Unit, enhancer: IEnhancer[T], name: String): IObservableArray[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLegacyArray")(initialValues.asInstanceOf[js.Any], enhancer.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[IObservableArray[T]]
  
  inline def reserveArrayBuffer(max: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reserveArrayBuffer")(max.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
