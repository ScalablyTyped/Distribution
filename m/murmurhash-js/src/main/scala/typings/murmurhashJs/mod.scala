package typings.murmurhashJs

import org.scalablytyped.runtime.Shortcut
import typings.murmurhashJs.anon.Murmur2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("murmurhash-js", JSImport.Namespace)
  @js.native
  val ^ : (js.Function2[/* str */ String, /* seed */ js.UndefOr[Double], Double]) & Murmur2 = js.native
  
  type _To = (js.Function2[/* str */ String, /* seed */ js.UndefOr[Double], Double]) & Murmur2
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: (js.Function2[/* str */ String, /* seed */ js.UndefOr[Double], Double]) & Murmur2 = ^
}
