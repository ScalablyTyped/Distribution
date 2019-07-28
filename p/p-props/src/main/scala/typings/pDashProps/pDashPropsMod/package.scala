package typings.pDashProps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pDashPropsMod {
  type Mapper[ValueType, KeyType, MappedValueType] = js.Function2[
    /* value */ ValueType, 
    /* key */ KeyType, 
    MappedValueType | js.Thenable[MappedValueType]
  ]
  type Options = typings.pDashMap.pDashMapMod.Options
  type PromiseResult[Value] = Value
}
