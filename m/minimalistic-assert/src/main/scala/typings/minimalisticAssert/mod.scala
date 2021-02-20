package typings.minimalisticAssert

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("minimalistic-assert", JSImport.Namespace)
  @js.native
  def apply(`val`: js.Any): /* asserts val */ Boolean = js.native
  @JSImport("minimalistic-assert", JSImport.Namespace)
  @js.native
  def apply(`val`: js.Any, msg: String): /* asserts val */ Boolean = js.native
  
  @JSImport("minimalistic-assert", "equal")
  @js.native
  def equal[T](l: T, r: T): Unit = js.native
  @JSImport("minimalistic-assert", "equal")
  @js.native
  def equal[T](l: T, r: T, msg: String): Unit = js.native
}
