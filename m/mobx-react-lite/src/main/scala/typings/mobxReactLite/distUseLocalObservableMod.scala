package typings.mobxReactLite

import typings.mobx.distApiAnnotationMod.AnnotationsMap
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUseLocalObservableMod {
  
  @JSImport("mobx-react-lite/dist/useLocalObservable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useLocalObservable[TStore /* <: Record[String, Any] */](initializer: js.Function0[TStore]): TStore = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocalObservable")(initializer.asInstanceOf[js.Any]).asInstanceOf[TStore]
  inline def useLocalObservable[TStore /* <: Record[String, Any] */](initializer: js.Function0[TStore], annotations: AnnotationsMap[TStore, scala.Nothing]): TStore = (^.asInstanceOf[js.Dynamic].applyDynamic("useLocalObservable")(initializer.asInstanceOf[js.Any], annotations.asInstanceOf[js.Any])).asInstanceOf[TStore]
}
