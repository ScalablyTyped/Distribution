package typings.microserviceDashUtilities.microserviceDashUtilitiesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("microservice-utilities", "PlatformClient")
@js.native
class PlatformClient protected () extends js.Object {
  def this(logFunction: js.Function1[/* msg */ js.Any, Unit]) = this()
  def this(
    logFunction: js.Function1[/* msg */ js.Any, Unit],
    tokenResolverFunction: js.Function0[js.Promise[String]]
  ) = this()
  def this(
    logFunction: js.Function1[/* msg */ js.Any, Unit],
    tokenResolverFunction: js.Function0[js.Promise[String]],
    configuration: PlatformClientConfiguration
  ) = this()
  def delete[T](url: String): js.Promise[PlatformClientResponse[T]] = js.native
  def delete[T](url: String, headers: StringDictionary[String]): js.Promise[PlatformClientResponse[T]] = js.native
  def get[T](url: String): js.Promise[PlatformClientResponse[T]] = js.native
  def get[T](url: String, headers: StringDictionary[String]): js.Promise[PlatformClientResponse[T]] = js.native
  def get[T](url: String, headers: StringDictionary[String], `type`: String): js.Promise[PlatformClientResponse[T]] = js.native
  def head[T](url: String): js.Promise[PlatformClientResponse[T]] = js.native
  def head[T](url: String, headers: StringDictionary[String]): js.Promise[PlatformClientResponse[T]] = js.native
  def options[T](url: String): js.Promise[PlatformClientResponse[T]] = js.native
  def options[T](url: String, headers: StringDictionary[String]): js.Promise[PlatformClientResponse[T]] = js.native
  def patch[T](url: String, data: js.Object): js.Promise[PlatformClientResponse[T]] = js.native
  def patch[T](url: String, data: js.Object, headers: StringDictionary[String]): js.Promise[PlatformClientResponse[T]] = js.native
  def post[T](url: String, data: js.Object): js.Promise[PlatformClientResponse[T]] = js.native
  def post[T](url: String, data: js.Object, headers: StringDictionary[String]): js.Promise[PlatformClientResponse[T]] = js.native
  def put[T](url: String, data: js.Object): js.Promise[PlatformClientResponse[T]] = js.native
  def put[T](url: String, data: js.Object, headers: StringDictionary[String]): js.Promise[PlatformClientResponse[T]] = js.native
}

