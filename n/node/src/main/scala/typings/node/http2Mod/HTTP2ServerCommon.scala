package typings.node.http2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTTP2ServerCommon extends StObject {
  
  def setTimeout(): this.type = js.native
  def setTimeout(msec: Double): this.type = js.native
  def setTimeout(msec: Double, callback: js.Function0[Unit]): this.type = js.native
  def setTimeout(msec: Unit, callback: js.Function0[Unit]): this.type = js.native
  
  /**
    * Throws ERR_HTTP2_INVALID_SETTING_VALUE for invalid settings values.
    * Throws ERR_INVALID_ARG_TYPE for invalid settings argument.
    */
  def updateSettings(settings: Settings): Unit = js.native
}
