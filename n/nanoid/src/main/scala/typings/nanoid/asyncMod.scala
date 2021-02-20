package typings.nanoid

import org.scalablytyped.runtime.Shortcut
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncMod extends Shortcut {
  
  @JSImport("nanoid/async", JSImport.Namespace)
  @js.native
  val ^ : NanoidAsync = js.native
  
  @js.native
  trait NanoidAsync extends StObject {
    
    def apply(): js.Promise[String] = js.native
    def apply(size: Double): js.Promise[String] = js.native
    def apply(size: Double, callback: js.Function2[/* error */ Error | Null, /* id */ String, _]): Unit = js.native
    def apply(size: Null, callback: js.Function2[/* error */ Error | Null, /* id */ String, _]): Unit = js.native
  }
  
  type _To = NanoidAsync
  
  /* This means you don't have to write `^`, but can instead just say `asyncMod.foo` */
  override def _to: NanoidAsync = ^
}
