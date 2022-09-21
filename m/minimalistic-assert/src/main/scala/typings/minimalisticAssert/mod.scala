package typings.minimalisticAssert

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(`val`: Any): /* asserts val */ Boolean = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[/* asserts val */ Boolean]
  inline def apply(`val`: Any, msg: String): /* asserts val */ Boolean = (^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[/* asserts val */ Boolean]
  
  @JSImport("minimalistic-assert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def equal[T](l: T, r: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(l.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def equal[T](l: T, r: T, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(l.asInstanceOf[js.Any], r.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
