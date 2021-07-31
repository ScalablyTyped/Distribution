package typings.monocleTs

import typings.monocleTs.mod.Index_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexReadonlyRecordMod {
  
  @JSImport("monocle-ts/lib/Index/ReadonlyRecord", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def indexReadonlyRecord[A](): Index_[Record[String, A], String, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("indexReadonlyRecord")().asInstanceOf[Index_[Record[String, A], String, A]]
}
