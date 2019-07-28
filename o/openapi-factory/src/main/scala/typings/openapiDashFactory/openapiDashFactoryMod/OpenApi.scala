package typings.openapiDashFactory.openapiDashFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenApi extends js.Object {
  def any(
    route: String,
    handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
  ): Unit = js.native
  def any(
    route: String,
    options: HttpMethodOptions,
    handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
  ): Unit = js.native
  def delete(
    route: String,
    handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
  ): Unit = js.native
  def delete(
    route: String,
    options: HttpMethodOptions,
    handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
  ): Unit = js.native
  def get(
    route: String,
    handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
  ): Unit = js.native
  def get(
    route: String,
    options: HttpMethodOptions,
    handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
  ): Unit = js.native
  def handler(event: js.Object, context: js.Object): js.Promise[_] = js.native
  def head(
    route: String,
    handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
  ): Unit = js.native
  def head(route: String, options: HttpMethodOptions, handler: js.Function1[/* req */ js.UndefOr[js.Any], _]): Unit = js.native
  def onEvent(onEventFunc: js.Function1[/* req */ js.UndefOr[js.Any], js.Promise[_]]): Unit = js.native
  def onSchedule(onScheduleFunc: js.Function1[/* req */ js.UndefOr[js.Any], js.Promise[_]]): Unit = js.native
  def options(
    route: String,
    handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
  ): Unit = js.native
  def options(
    route: String,
    options: HttpMethodOptions,
    handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
  ): Unit = js.native
  def patch(
    route: String,
    handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
  ): Unit = js.native
  def patch(
    route: String,
    options: HttpMethodOptions,
    handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
  ): Unit = js.native
  def post(
    route: String,
    handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
  ): Unit = js.native
  def post(
    route: String,
    options: HttpMethodOptions,
    handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
  ): Unit = js.native
  def put(
    route: String,
    handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
  ): Unit = js.native
  def put(
    route: String,
    options: HttpMethodOptions,
    handler: js.Function1[/* req */ js.UndefOr[js.Object], HttpResponse | js.Promise[HttpResponse]]
  ): Unit = js.native
  def setAuthorizer(authorizerFunc: js.Function1[/* req */ js.UndefOr[js.Any], js.Promise[_]]): Unit = js.native
}

