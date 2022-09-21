package typings.pFilter

import typings.pMap.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ValueType](
    input: js.Iterable[ValueType | js.Thenable[ValueType]],
    filterer: js.Function2[/* element */ ValueType, /* index */ Double, Boolean | js.Thenable[Boolean]]
  ): js.Promise[js.Array[ValueType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], filterer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ValueType]]]
  inline def default[ValueType](
    input: js.Iterable[ValueType | js.Thenable[ValueType]],
    filterer: js.Function2[/* element */ ValueType, /* index */ Double, Boolean | js.Thenable[Boolean]],
    options: Options
  ): js.Promise[js.Array[ValueType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], filterer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ValueType]]]
}
