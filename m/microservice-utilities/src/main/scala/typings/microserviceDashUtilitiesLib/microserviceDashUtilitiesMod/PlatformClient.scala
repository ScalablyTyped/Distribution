package typings
package microserviceDashUtilitiesLib.microserviceDashUtilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("microservice-utilities", "PlatformClient")
@js.native
class PlatformClient protected () extends js.Object {
  def this(logFunction: js.Function1[/* msg */ js.Any, scala.Unit]) = this()
  def this(logFunction: js.Function1[/* msg */ js.Any, scala.Unit], tokenResolverFunction: js.Function0[js.Promise[java.lang.String]]) = this()
  def this(logFunction: js.Function1[/* msg */ js.Any, scala.Unit], tokenResolverFunction: js.Function0[js.Promise[java.lang.String]], configuration: PlatformClientConfiguration) = this()
  def delete[T](url: java.lang.String): js.Promise[PlatformClientResponse[T]] = js.native
  def delete[T](url: java.lang.String, headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]): js.Promise[PlatformClientResponse[T]] = js.native
  def get[T](url: java.lang.String): js.Promise[PlatformClientResponse[T]] = js.native
  def get[T](url: java.lang.String, headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]): js.Promise[PlatformClientResponse[T]] = js.native
  def get[T](
    url: java.lang.String,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    `type`: java.lang.String
  ): js.Promise[PlatformClientResponse[T]] = js.native
  def head[T](url: java.lang.String): js.Promise[PlatformClientResponse[T]] = js.native
  def head[T](url: java.lang.String, headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]): js.Promise[PlatformClientResponse[T]] = js.native
  def options[T](url: java.lang.String): js.Promise[PlatformClientResponse[T]] = js.native
  def options[T](url: java.lang.String, headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]): js.Promise[PlatformClientResponse[T]] = js.native
  def patch[T](url: java.lang.String, data: js.Object): js.Promise[PlatformClientResponse[T]] = js.native
  def patch[T](
    url: java.lang.String,
    data: js.Object,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): js.Promise[PlatformClientResponse[T]] = js.native
  def post[T](url: java.lang.String, data: js.Object): js.Promise[PlatformClientResponse[T]] = js.native
  def post[T](
    url: java.lang.String,
    data: js.Object,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): js.Promise[PlatformClientResponse[T]] = js.native
  def put[T](url: java.lang.String, data: js.Object): js.Promise[PlatformClientResponse[T]] = js.native
  def put[T](
    url: java.lang.String,
    data: js.Object,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): js.Promise[PlatformClientResponse[T]] = js.native
}

