package typings.meteorPublishComposite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/reywood:publish-composite", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def publishComposite(
    name: String,
    configFunc: js.Function1[
      /* repeated */ js.Any, 
      PublishCompositeConfig[_] | js.Array[PublishCompositeConfig[_]]
    ]
  ): Unit = js.native
  def publishComposite(name: String, config: js.Array[PublishCompositeConfig[_]]): Unit = js.native
  def publishComposite(name: String, config: PublishCompositeConfig[_]): Unit = js.native
}

