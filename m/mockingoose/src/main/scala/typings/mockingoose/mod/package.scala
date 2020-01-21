package typings.mockingoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ExpectedReturnType = js.UndefOr[
    java.lang.String | scala.Double | scala.Boolean | js.Symbol | js.Object | scala.Unit | scala.Null
  ]
  type Proxy = typings.mockingoose.mod.Target with org.scalablytyped.runtime.StringDictionary[typings.mockingoose.mod.Mock] with (js.Function1[
    /* model */ java.lang.String | (typings.mongoose.mod.Model_[_, js.Object]), 
    typings.mockingoose.mod.Mock
  ])
  type ReturnFunction = js.Function1[
    /* param */ typings.mongoose.mod.Query[js.Any] | typings.mongoose.mod.Aggregate[js.Any], 
    js.Object
  ]
}
