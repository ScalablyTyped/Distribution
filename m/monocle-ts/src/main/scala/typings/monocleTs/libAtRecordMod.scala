package typings.monocleTs

import typings.fpTs.libOptionMod.Option_
import typings.monocleTs.mod.At_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAtRecordMod {
  
  @JSImport("monocle-ts/lib/At/Record", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def atRecord[A](): At_[Record[String, A], String, Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("atRecord")().asInstanceOf[At_[Record[String, A], String, Option_[A]]]
}
