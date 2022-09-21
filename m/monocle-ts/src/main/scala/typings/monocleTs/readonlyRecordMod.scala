package typings.monocleTs

import typings.fpTs.optionMod.Option_
import typings.fpTs.readonlyRecordMod.ReadonlyRecord_
import typings.monocleTs.mod.At_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readonlyRecordMod {
  
  @JSImport("monocle-ts/lib/At/ReadonlyRecord", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def atReadonlyRecord[A](): At_[ReadonlyRecord_[String, A], String, Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("atReadonlyRecord")().asInstanceOf[At_[ReadonlyRecord_[String, A], String, Option_[A]]]
}
