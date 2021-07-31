package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object netMod {
  
  @JSImport("ol/net", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def jsonp(url: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("jsonp")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def jsonp(url: String, callback: js.Function0[Unit], opt_errback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("jsonp")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], opt_errback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def jsonp(
    url: String,
    callback: js.Function0[Unit],
    opt_errback: js.Function0[Unit],
    opt_callbackParam: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("jsonp")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], opt_errback.asInstanceOf[js.Any], opt_callbackParam.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def jsonp(url: String, callback: js.Function0[Unit], opt_errback: Unit, opt_callbackParam: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("jsonp")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], opt_errback.asInstanceOf[js.Any], opt_callbackParam.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
