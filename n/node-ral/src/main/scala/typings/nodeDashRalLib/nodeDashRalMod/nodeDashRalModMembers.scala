package typings
package nodeDashRalLib.nodeDashRalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-ral", JSImport.Namespace)
@js.native
object nodeDashRalModMembers extends js.Object {
  val Config: Config = js.native
  val Logger: LoggerFactory = js.native
  def Middleware(): js.Function3[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* resp */ expressLib.expressMod.eNs.Response, 
    /* next */ expressLib.expressMod.eNs.NextFunction, 
    scala.Unit
  ] = js.native
  def Middleware(options: Service): js.Function3[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* resp */ expressLib.expressMod.eNs.Response, 
    /* next */ expressLib.expressMod.eNs.NextFunction, 
    scala.Unit
  ] = js.native
  def RAL(serviceName: java.lang.String): nodeDashRalLib.nodeDashRalMod.RALNs.RalRunner = js.native
  def RAL(serviceName: java.lang.String, options: js.Object): nodeDashRalLib.nodeDashRalMod.RALNs.RalRunner = js.native
  def RALPromise[T](name: java.lang.String): js.Promise[T] = js.native
  def RALPromise[T](name: java.lang.String, options: js.Object): js.Promise[T] = js.native
}

