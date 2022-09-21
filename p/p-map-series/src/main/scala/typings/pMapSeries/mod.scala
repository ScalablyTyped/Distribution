package typings.pMapSeries

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-map-series", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ValueType, MappedValueType](
    input: js.Iterable[js.Thenable[ValueType] | ValueType],
    mapper: js.Function2[
      /* element */ ValueType, 
      /* index */ Double, 
      js.Thenable[MappedValueType] | MappedValueType
    ]
  ): js.Promise[js.Array[MappedValueType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[MappedValueType]]]
}
