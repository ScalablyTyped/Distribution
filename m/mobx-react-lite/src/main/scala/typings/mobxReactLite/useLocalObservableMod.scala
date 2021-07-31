package typings.mobxReactLite

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useLocalObservableMod {
  
  @JSImport("mobx-react-lite/dist/useLocalObservable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useLocalObservable[TStore /* <: Record[String, js.Any] */](initializer: js.Function0[TStore]): TStore = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocalObservable")(initializer.asInstanceOf[js.Any]).asInstanceOf[TStore]
  @scala.inline
  def useLocalObservable[TStore /* <: Record[String, js.Any] */](
    initializer: js.Function0[TStore],
    annotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnnotationsMap<TStore, never> */ js.Any
  ): TStore = (^.asInstanceOf[js.Dynamic].applyDynamic("useLocalObservable")(initializer.asInstanceOf[js.Any], annotations.asInstanceOf[js.Any])).asInstanceOf[TStore]
}
