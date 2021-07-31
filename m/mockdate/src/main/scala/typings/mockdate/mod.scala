package typings.mockdate

import typings.mockdate.anon.ValueOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mockdate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  
  @scala.inline
  def set(date: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(date.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def set(date: String, timezoneOffset: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(date.asInstanceOf[js.Any], timezoneOffset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def set(date: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(date.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def set(date: Double, timezoneOffset: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(date.asInstanceOf[js.Any], timezoneOffset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def set(date: ValueOf): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(date.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def set(date: ValueOf, timezoneOffset: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(date.asInstanceOf[js.Any], timezoneOffset.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
