package typings.meteorPublishComposite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("meteor/reywood:publish-composite", "publishComposite")
  @js.native
  def publishComposite(
    name: String,
    configFunc: js.Function1[
      /* repeated */ js.Any, 
      PublishCompositeConfig[_] | js.Array[PublishCompositeConfig[_]]
    ]
  ): Unit = js.native
  @JSImport("meteor/reywood:publish-composite", "publishComposite")
  @js.native
  def publishComposite(name: String, config: js.Array[PublishCompositeConfig[_]]): Unit = js.native
  @JSImport("meteor/reywood:publish-composite", "publishComposite")
  @js.native
  def publishComposite(name: String, config: PublishCompositeConfig[_]): Unit = js.native
}
