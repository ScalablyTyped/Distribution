package typings.mobx

import typings.mobx.distApiAnnotationMod.AnnotationsMap
import typings.mobx.distApiObservableMod.CreateObservableOptions
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distApiMakeObservableMod {
  
  @JSImport("mobx/dist/api/makeObservable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeAutoObservable[T /* <: js.Object */, AdditionalKeys /* <: PropertyKey */](target: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("makeAutoObservable")(target.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def makeAutoObservable[T /* <: js.Object */, AdditionalKeys /* <: PropertyKey */](target: T, overrides: Unit, options: CreateObservableOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("makeAutoObservable")(target.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def makeAutoObservable[T /* <: js.Object */, AdditionalKeys /* <: PropertyKey */](target: T, overrides: AnnotationsMap[T, NoInfer[AdditionalKeys]]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("makeAutoObservable")(target.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def makeAutoObservable[T /* <: js.Object */, AdditionalKeys /* <: PropertyKey */](target: T, overrides: AnnotationsMap[T, NoInfer[AdditionalKeys]], options: CreateObservableOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("makeAutoObservable")(target.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def makeObservable[T /* <: js.Object */, AdditionalKeys /* <: PropertyKey */](target: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("makeObservable")(target.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def makeObservable[T /* <: js.Object */, AdditionalKeys /* <: PropertyKey */](target: T, annotations: Unit, options: CreateObservableOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("makeObservable")(target.asInstanceOf[js.Any], annotations.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def makeObservable[T /* <: js.Object */, AdditionalKeys /* <: PropertyKey */](target: T, annotations: AnnotationsMap[T, NoInfer[AdditionalKeys]]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("makeObservable")(target.asInstanceOf[js.Any], annotations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def makeObservable[T /* <: js.Object */, AdditionalKeys /* <: PropertyKey */](
    target: T,
    annotations: AnnotationsMap[T, NoInfer[AdditionalKeys]],
    options: CreateObservableOptions
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("makeObservable")(target.asInstanceOf[js.Any], annotations.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  type NoInfer[T] = /* import warning: importer.ImportType#apply Failed type conversion: [T][T extends any ? 0 : never] */ js.Any
}
