package typings.monocleTs

import typings.fpTs.optionMod.Option_
import typings.monocleTs.mod.At_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readonlyRecordMod {
  
  @JSImport("monocle-ts/lib/At/ReadonlyRecord", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def atReadonlyRecord[A](): At_[Record[String, A], String, Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("atReadonlyRecord")().asInstanceOf[At_[Record[String, A], String, Option_[A]]]
}
