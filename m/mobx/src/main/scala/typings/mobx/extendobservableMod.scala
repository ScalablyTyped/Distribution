package typings.mobx

import typings.mobx.annotationMod.AnnotationsMap
import typings.mobx.observableMod.CreateObservableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extendobservableMod {
  
  @JSImport("mobx/dist/api/extendobservable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B): A & B = (^.asInstanceOf[js.Dynamic].applyDynamic("extendObservable")(target.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[A & B]
  inline def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B, annotations: Unit, options: CreateObservableOptions): A & B = (^.asInstanceOf[js.Dynamic].applyDynamic("extendObservable")(target.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], annotations.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[A & B]
  inline def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B, annotations: AnnotationsMap[B, scala.Nothing]): A & B = (^.asInstanceOf[js.Dynamic].applyDynamic("extendObservable")(target.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], annotations.asInstanceOf[js.Any])).asInstanceOf[A & B]
  inline def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: B,
    annotations: AnnotationsMap[B, scala.Nothing],
    options: CreateObservableOptions
  ): A & B = (^.asInstanceOf[js.Dynamic].applyDynamic("extendObservable")(target.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], annotations.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[A & B]
}
