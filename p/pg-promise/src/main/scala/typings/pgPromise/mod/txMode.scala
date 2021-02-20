package typings.pgPromise.mod

import org.scalablytyped.runtime.Shortcut
import typings.pgPromise.anon.Deferrable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object txMode extends Shortcut {
  
  @JSImport("pg-promise", "txMode")
  @js.native
  val ^ : ITXMode = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("pg-promise", "txMode.TransactionMode")
  @js.native
  class TransactionModeCls () extends TransactionMode {
    def this(options: Deferrable) = this()
  }
  
  type _To = ITXMode
  
  /* This means you don't have to write `^`, but can instead just say `txMode.foo` */
  override def _to: ITXMode = ^
}
