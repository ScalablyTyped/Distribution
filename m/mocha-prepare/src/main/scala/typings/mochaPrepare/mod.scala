package typings.mochaPrepare

import typings.mocha.Mocha.Done
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(onPrepare: js.Function1[/* fn */ Done, Unit]): Unit = ^.asInstanceOf[js.Dynamic].apply(onPrepare.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(onPrepare: js.Function1[/* fn */ Done, Unit], onUnprepare: js.Function1[/* fn */ Done, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(onPrepare.asInstanceOf[js.Any], onUnprepare.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("mocha-prepare", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
