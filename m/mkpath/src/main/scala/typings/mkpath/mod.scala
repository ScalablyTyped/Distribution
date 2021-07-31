package typings.mkpath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(path: String): Unit = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def apply(path: String, callback: js.Function1[/* err */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(path: String, mode: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(path: String, mode: Double, callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(path: String, mode: Unit, callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("mkpath", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def sync(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def sync(path: String, mode: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
