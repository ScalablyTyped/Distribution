package typings
package namedDashRoutesLib.namedDashRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamedRouter extends js.Object {
  def add(method: java.lang.String, path: java.lang.String, callbacks: expressLib.expressMod.RequestHandler): scala.Unit = js.native
  def add(
    method: java.lang.String,
    path: java.lang.String,
    callbacks: expressLib.expressMod.RequestHandler,
    options: stdLib.Partial[RouteOptions]
  ): scala.Unit = js.native
  def add(
    method: java.lang.String,
    path: java.lang.String,
    callbacks: js.Array[expressLib.expressMod.RequestHandler]
  ): scala.Unit = js.native
  def add(
    method: java.lang.String,
    path: java.lang.String,
    callbacks: js.Array[expressLib.expressMod.RequestHandler],
    options: stdLib.Partial[RouteOptions]
  ): scala.Unit = js.native
  def build(name: java.lang.String): java.lang.String = js.native
  def build(name: java.lang.String, params: RouteParams): java.lang.String = js.native
  def build(name: java.lang.String, params: RouteParams, method: java.lang.String): java.lang.String = js.native
  def dispatch(req: expressLib.expressMod.Request): scala.Unit = js.native
  def dispatch(req: expressLib.expressMod.Request, res: expressLib.expressMod.Response): scala.Unit = js.native
  def dispatch(
    req: expressLib.expressMod.Request,
    res: expressLib.expressMod.Response,
    next: expressLib.expressMod.NextFunction
  ): scala.Unit = js.native
  def extendExpress(app: expressLib.expressMod.Express): NamedRouter = js.native
  def extendExpress(app: expressLib.expressMod.Router): NamedRouter = js.native
  def `match`(req: expressLib.expressMod.Request): scala.Boolean | js.Object = js.native
  def param(callback: expressLib.expressMod.RequestHandler): NamedRouter = js.native
  def param(name: java.lang.String, callback: expressLib.expressMod.RequestHandler): NamedRouter = js.native
  def registerAppHelpers(app: expressLib.expressMod.Express): NamedRouter = js.native
}

