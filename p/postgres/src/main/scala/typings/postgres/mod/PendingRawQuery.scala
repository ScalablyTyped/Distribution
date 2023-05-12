package typings.postgres.mod

import typings.node.bufferMod.global.Buffer
import typings.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PendingRawQuery[TRow /* <: js.Array[MaybeRow] */]
  extends StObject
     with Promise[RawRowList[TRow]]
     with PendingQueryModifiers[js.Array[js.Array[Buffer]]]
