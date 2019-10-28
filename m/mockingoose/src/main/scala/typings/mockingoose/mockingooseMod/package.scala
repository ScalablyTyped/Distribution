package typings.mockingoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mockingooseMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.mongoose.mongooseMod.Aggregate
  import typings.mongoose.mongooseMod.Model
  import typings.mongoose.mongooseMod.Query

  type ExpectedReturnType = js.UndefOr[String | Double | Boolean | js.Symbol | js.Object | Unit | Null]
  type Proxy = Target with StringDictionary[Mock] with (js.Function1[/* model */ String | (Model[_, js.Object]), Mock])
  type ReturnFunction = js.Function1[/* param */ Query[js.Any] | Aggregate[js.Any], js.Object]
}
