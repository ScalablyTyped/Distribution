package typings
package openapiDashFactoryLib.openapiDashFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenApi extends js.Object {
  def any(
    route: java.lang.String,
    handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
  ): scala.Unit = js.native
  def any(
    route: java.lang.String,
    options: HttpMethodOptions,
    handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
  ): scala.Unit = js.native
  def delete(
    route: java.lang.String,
    handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
  ): scala.Unit = js.native
  def delete(
    route: java.lang.String,
    options: HttpMethodOptions,
    handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
  ): scala.Unit = js.native
  def get(
    route: java.lang.String,
    handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
  ): scala.Unit = js.native
  def get(
    route: java.lang.String,
    options: HttpMethodOptions,
    handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
  ): scala.Unit = js.native
  def handler(event: js.Object, context: js.Object): js.Promise[_] = js.native
  def head(
    route: java.lang.String,
    handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
  ): scala.Unit = js.native
  def head(
    route: java.lang.String,
    options: HttpMethodOptions,
    handler: js.Function1[/* req */ js.UndefOr[js.Any], _]
  ): scala.Unit = js.native
  def onEvent(onEventFunc: js.Function1[/* req */ js.UndefOr[js.Any], js.Promise[_]]): scala.Unit = js.native
  def onSchedule(onScheduleFunc: js.Function1[/* req */ js.UndefOr[js.Any], js.Promise[_]]): scala.Unit = js.native
  def options(
    route: java.lang.String,
    handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
  ): scala.Unit = js.native
  def options(
    route: java.lang.String,
    options: HttpMethodOptions,
    handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
  ): scala.Unit = js.native
  def patch(
    route: java.lang.String,
    handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
  ): scala.Unit = js.native
  def patch(
    route: java.lang.String,
    options: HttpMethodOptions,
    handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
  ): scala.Unit = js.native
  def post(
    route: java.lang.String,
    handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
  ): scala.Unit = js.native
  def post(
    route: java.lang.String,
    options: HttpMethodOptions,
    handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
  ): scala.Unit = js.native
  def put(
    route: java.lang.String,
    handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
  ): scala.Unit = js.native
  def put(
    route: java.lang.String,
    options: HttpMethodOptions,
    handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
  ): scala.Unit = js.native
  def setAuthorizer(authorizerFunc: js.Function1[/* req */ js.UndefOr[js.Any], js.Promise[_]]): scala.Unit = js.native
}

